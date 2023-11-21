package net.mcreator.superiortnt;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.network.simple.*;
import net.minecraftforge.network.*;
import net.minecraft.resources.*;
import net.mcreator.superiortnt.PersistentDataModifyPacket;

import java.util.*;

public class SuperiorTNTPacketHandler {
	

	private static final String PROTOCOL_VERSION = "1";
	public static final SimpleChannel INSTANCE = NetworkRegistry.newSimpleChannel(
 	 new ResourceLocation(SuperiorTntMod.MODID, "main"),
 	 () -> PROTOCOL_VERSION,
 	 PROTOCOL_VERSION::equals,
 	 PROTOCOL_VERSION::equals
	);

	public static void register() {
        int id = 0;
        INSTANCE.registerMessage(id++, PersistentDataModifyPacket.class, PersistentDataModifyPacket::encode,
        PersistentDataModifyPacket::new, PersistentDataModifyPacket::handle, Optional.of(NetworkDirection.PLAY_TO_CLIENT));
    }









	
}
