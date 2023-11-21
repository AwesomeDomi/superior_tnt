package net.mcreator.superiortnt.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class EfficientRoundedCylinderProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double maxheight = 0;
		double tempheight = 0;
		double ellipsoidcenter = 0;
		double dx = 0;
		double dy = 0;
		double explosionwidth = 0;
		double dz = 0;
		double tempwidth2 = 0;
		double ellipsoidheight = 0;
		double cylinderheight = 0;
		double minheight = 0;
		double tempwidth = 0;
		double increment = 0;
		double oppositetempwidth = 0;
		double oppositetempwidth2 = 0;
		if (entity.getPersistentData().getDouble("maxheight") == 0 && entity.getPersistentData().getDouble("minheight") == 0) {
			maxheight = Math.floor(y) + (entity.getPersistentData().getDouble("cylinderheight") + entity.getPersistentData().getDouble("ellipsoidheight")) / 2;
			minheight = maxheight - (entity.getPersistentData().getDouble("cylinderheight") + entity.getPersistentData().getDouble("ellipsoidheight"));
			ellipsoidcenter = maxheight - entity.getPersistentData().getDouble("cylinderheight");
		} else {
			minheight = entity.getPersistentData().getDouble("minheight");
			maxheight = entity.getPersistentData().getDouble("maxheight");
			ellipsoidcenter = entity.getPersistentData().getDouble("ellipsoidcenter");
		}
		explosionwidth = entity.getPersistentData().getDouble("explosionwidth");
		ellipsoidheight = entity.getPersistentData().getDouble("ellipsoidheight");
		cylinderheight = entity.getPersistentData().getDouble("cylinderheight");
		tempwidth = entity.getPersistentData().getDouble("tempwidth");
		dx = tempwidth - Math.floor(x);
		dz = entity.getPersistentData().getDouble("tempwidth2") - Math.floor(z);
		oppositetempwidth = Math.floor(x) - dx;
		tempwidth2 = Math.floor(z) + dx;
		oppositetempwidth2 = Math.floor(z) - dx;
		for (int index0 = 0; index0 < 25; index0++) {
			tempheight = minheight - 1;
			dy = ellipsoidcenter - tempheight;
			dz = entity.getPersistentData().getDouble("tempwidth2") - Math.floor(z);
			while ((Math.pow(dx, 2) + Math.pow(dz, 2)) / Math.pow(explosionwidth, 2) + Math.pow(dy, 2) / Math.pow(ellipsoidheight, 2) >= 1) {
				tempheight = tempheight + 1;
				dy = ellipsoidcenter - tempheight;
				dz = entity.getPersistentData().getDouble("tempwidth2") - Math.floor(z);
				if (Math.pow(dx, 2) + Math.pow(dz, 2) >= Math.pow(explosionwidth, 2)) {
					break;
				}
				if (tempheight >= ellipsoidcenter) {
					break;
				}
			}
			if (Math.pow(dx, 2) + Math.pow(dz, 2) >= Math.pow(explosionwidth, 2)) {
				entity.getPersistentData().putDouble("tempwidth", (entity.getPersistentData().getDouble("tempwidth") + 1));
				entity.getPersistentData().putDouble("tempwidth2", Math.floor(z));
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A7bExplosion " + (dx / explosionwidth) * 100 + "\u00A7b% Done!")), false);
				break;
			}
			while (tempheight <= maxheight) {
				world.setBlock(new BlockPos(x + dx, tempheight, z + dz), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + dx, tempheight, z - dz), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x - dx, tempheight, z + dz), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x - dx, tempheight, z - dz), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + dz, tempheight, z + dx), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x + dz, tempheight, z - dx), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x - dz, tempheight, z + dx), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos(x - dz, tempheight, z - dx), Blocks.AIR.defaultBlockState(), 3);
				tempheight = tempheight + 1;
			}
			entity.getPersistentData().putDouble("tempwidth2", (entity.getPersistentData().getDouble("tempwidth2") + 1));
			if (dx == dz) {
				entity.getPersistentData().putDouble("tempwidth", (entity.getPersistentData().getDouble("tempwidth") + 1));
				entity.getPersistentData().putDouble("tempwidth2", Math.floor(z));
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal(("\u00A7bExplosion " + (dx / explosionwidth) * 100 + "\u00A7b% Done!")), false);
				break;
			}
		}
	}
}
