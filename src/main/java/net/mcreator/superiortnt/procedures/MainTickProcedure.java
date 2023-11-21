package net.mcreator.superiortnt.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superiortnt.network.SuperiorTntModVariables;

public class MainTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!SuperiorTntModVariables.WorldVariables.get(world).paused) {
			if ((entity.getPersistentData().getDouble("tempwidth") - x) / entity.getPersistentData().getDouble("explosionwidth") >= 1) {
				if (!entity.level.isClientSide())
					entity.discard();
			} else {
				if (entity.getPersistentData().getDouble("speed") == 0) {
					entity.getPersistentData().putDouble("speed", 5);
				}
				if (entity.getPersistentData().getDouble("type") == 1) {
					if (!entity.getPersistentData().getBoolean("notfirsttime")) {
						int percentage = 0;
						double lastamount = (entity.getPersistentData().getDouble("explosionwidth") / 8 + 1) / 10;
						double amount = lastamount;
						if (!world.isClientSide() && world.getServer() != null) {
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7bFoceloading chunks!"), false);
						}
						for (int i = 0; i < entity.getPersistentData().getDouble("explosionwidth") / 8 + 1; i++) {
							for (int j = 0; j < entity.getPersistentData().getDouble("explosionwidth") / 8 + 1; j++) {
								if (world instanceof ServerLevel _level) {
									_level.getServer().getCommands()
											.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "forceload add ~ ~");
								}
								if (!world.isClientSide() && world.getServer() != null && i + 1 > amount) {
									percentage += 10;
									amount += lastamount;
									world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7b" + percentage + "% done!"), false);
								}
								x += 16;
							}
							System.out.println("Loading chunks at z: " + z);
							x = (int) entity.getX() - 5 * entity.getPersistentData().getDouble("explosionwidth") / 4;
							z += 16;
						}
						if (!world.isClientSide() && world.getServer() != null) {
							world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7bChunks loaded!"), false);
						}
						entity.getPersistentData().putBoolean("notfirsttime", true);
						entity.getPersistentData().putDouble("timer", 0);
					} else {
						entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 1));
						if (entity.getPersistentData().getDouble("timer") % entity.getPersistentData().getDouble("speed") == 0) {
							entity.getPersistentData().putDouble("tempwidth", (entity.getPersistentData().getDouble("tempwidth") + 1));
							RoundedCylinderProcedure.execute(world, x, y, z, entity);
						}
					}
				} else if (entity.getPersistentData().getDouble("type") == 2) {
					if (!entity.getPersistentData().getBoolean("notfirsttime")) {
						entity.getPersistentData().putBoolean("notfirsttime", true);
						entity.getPersistentData().putDouble("timer", 0);
					} else {
						entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 1));
						if (Math.round(entity.getPersistentData().getDouble("timer")) % Math.round(entity.getPersistentData().getDouble("speed")) == 0) {
							EfficientRoundedCylinderProcedure.execute(world, x, y, z, entity);
						}
					}
				} else if (entity.getPersistentData().getDouble("type") == 3) {
					if (!entity.getPersistentData().getBoolean("notfirsttime")) {
						HeightCheckProcedure.execute(world, x, y, z, entity);
						entity.getPersistentData().putBoolean("notfirsttime", true);
						entity.getPersistentData().putDouble("timer", 0);
					} else {
						if (entity.getPersistentData().getDouble("timer") % entity.getPersistentData().getDouble("speed") == 0) {
							EfficientRoundedCylinderProcedure.execute(world, x, y, z, entity);
						}
						entity.getPersistentData().putDouble("timer", (entity.getPersistentData().getDouble("timer") + 1));
					}
				}
			}
		}
	}
}
