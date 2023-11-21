package net.mcreator.superiortnt.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.network.chat.Component;

import net.mcreator.superiortnt.network.SuperiorTntModVariables;

public class PausepProcedure {
	public static void execute(LevelAccessor world) {
		if (SuperiorTntModVariables.WorldVariables.get(world).paused) {
			SuperiorTntModVariables.WorldVariables.get(world).paused = false;
			SuperiorTntModVariables.WorldVariables.get(world).syncData(world);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A75Explosions Continuing!"), false);
		} else {
			SuperiorTntModVariables.WorldVariables.get(world).paused = true;
			SuperiorTntModVariables.WorldVariables.get(world).syncData(world);
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A75All Explosions Paused"), false);
		}
	}
}
