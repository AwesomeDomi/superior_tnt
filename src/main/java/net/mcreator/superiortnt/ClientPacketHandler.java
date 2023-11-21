package net.mcreator.superiortnt;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.network.*;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraft.client.*;
import net.minecraft.server.level.*;
import net.minecraft.world.level.*;
import net.minecraft.core.*;
import net.minecraft.world.level.block.*;

import java.util.function.Supplier;
import java.util.*;


@Mod.EventBusSubscriber(
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = {Dist.CLIENT}
)
public class ClientPacketHandler {

    public static void handlePacket(FriendlyByteBuf buf, List<BlockPos> blocks) {
		Minecraft minecraft = Minecraft.getInstance();
		Level level = minecraft.level;
    	
        // Write Blockpos's
		
		buf.writeInt(blocks.size());
		blocks.forEach(b -> buf.writeBlockPos(b));

		// Read
		ArrayList<BlockPos> blockss = new ArrayList<BlockPos>(blocks.size());
		int size = buf.readInt();
		for (int i = 0; i<size;i++)
    	blockss.add(buf.readBlockPos());
		
		
		// Handle everything
		blockss.forEach((pos) -> level.setBlock(pos, Blocks.AIR.defaultBlockState(), 3));
    }
}
