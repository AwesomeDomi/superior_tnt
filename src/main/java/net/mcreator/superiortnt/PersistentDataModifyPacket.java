/**
 * The code of this mod element is always locked.
 *
 * You can register new events in this class too.
 *
 * If you want to make a plain independent class, create it using
 * Project Browser -> New... and make sure to make the class
 * outside net.mcreator.superiortnt as this package is managed by MCreator.
 *
 * If you change workspace package, modid or prefix, you will need
 * to manually adapt this file to these changes or remake it.
 *
 * This class will be added in the mod root package.
*/
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


import java.util.function.Supplier;
import java.util.*;

public class PersistentDataModifyPacket {
    public final String name;
    public final String tag;
    public final int entityId;

    public PersistentDataModifyPacket(String name, String tag, int entityId) {
        this.name = name;
        this.tag = tag;
        this.entityId = entityId;
    }

    public PersistentDataModifyPacket(FriendlyByteBuf buffer) {
        name = buffer.readUtf();
        tag = buffer.readUtf();
        entityId = buffer.readInt();
    }

    public void encode(FriendlyByteBuf buffer) {
        buffer.writeUtf(name);
        buffer.writeUtf(tag);
        buffer.writeInt(entityId);
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        //ctx.get().enqueueWork(() -> DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> ClientAccess.setEntityStringTag(name, tag, entityId)));
    }
}





