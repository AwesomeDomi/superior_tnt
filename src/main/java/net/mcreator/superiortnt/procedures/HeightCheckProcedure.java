package net.mcreator.superiortnt.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class HeightCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double tempheight = 0;
		double maxheight = 0;
		double minheight = 0;
		tempheight = y + (entity.getPersistentData().getDouble("cylinderheight") + entity.getPersistentData().getDouble("ellipsoidheight")) - 1;
		while (world.isEmptyBlock(new BlockPos(x, tempheight, z)) && tempheight >= y) {
			tempheight = tempheight - 1;
		}
		maxheight = tempheight;
		entity.getPersistentData().putDouble("ellipsoidcenter", (maxheight - entity.getPersistentData().getDouble("cylinderheight")));
		tempheight = maxheight - ((entity.getPersistentData().getDouble("cylinderheight") + entity.getPersistentData().getDouble("ellipsoidheight")) - 1);
		while (world.isEmptyBlock(new BlockPos(x, tempheight, z)) && tempheight <= y) {
			tempheight = tempheight + 1;
		}
		minheight = tempheight;
		entity.getPersistentData().putDouble("maxheight", maxheight);
		entity.getPersistentData().putDouble("minheight", minheight);
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74Height check complete"), false);
	}
}
