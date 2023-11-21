package net.mcreator.superiortnt.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.superiortnt.network.SuperiorTntModVariables;
import net.mcreator.superiortnt.init.SuperiorTntModEntities;
import net.mcreator.superiortnt.init.SuperiorTntModBlocks;
import net.mcreator.superiortnt.entity.PrimedTranscendentTNTEntity;
import net.mcreator.superiortnt.entity.PrimedTNTX10Entity;
import net.mcreator.superiortnt.entity.PrimedTNTX100Entity;
import net.mcreator.superiortnt.entity.PrimedTNTX1000Entity;
import net.mcreator.superiortnt.entity.PrimedTNTX10000Entity;
import net.mcreator.superiortnt.entity.PrimedTNTX100000Entity;
import net.mcreator.superiortnt.entity.PrimedTNTX1000000Entity;
import net.mcreator.superiortnt.entity.PrimedIncredibleTNTEntity;
import net.mcreator.superiortnt.entity.PrimedGreatTNTEntity;
import net.mcreator.superiortnt.entity.PrimedGoodTNTEntity;
import net.mcreator.superiortnt.entity.PrimedExceptionalTNTEntity;
import net.mcreator.superiortnt.entity.PrimedAmazingTNTEntity;

import java.util.Comparator;

public class MainSummon2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		SuperiorTntModVariables.WorldVariables.get(world).paused = false;
		SuperiorTntModVariables.WorldVariables.get(world).syncData(world);
		if (world instanceof ServerLevel _origLevel) {
			LevelAccessor _worldorig = world;
			world = _origLevel.getServer().getLevel(Level.OVERWORLD);
			if (world != null) {
				if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SuperiorTntModBlocks.GOOD_TNT.get()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrimedGoodTNTEntity(SuperiorTntModEntities.PRIMED_GOOD_TNT.get(), _level);
						entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0.5, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					((Entity) world.getEntitiesOfClass(PrimedGoodTNTEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("speed", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "speed")));
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SuperiorTntModBlocks.GREAT_TNT.get()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrimedGreatTNTEntity(SuperiorTntModEntities.PRIMED_GREAT_TNT.get(), _level);
						entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0.5, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					((Entity) world.getEntitiesOfClass(PrimedGreatTNTEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("speed", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "speed")));
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SuperiorTntModBlocks.AMAZING_TNT.get()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrimedAmazingTNTEntity(SuperiorTntModEntities.PRIMED_AMAZING_TNT.get(), _level);
						entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0.5, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					((Entity) world.getEntitiesOfClass(PrimedAmazingTNTEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("speed", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "speed")));
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SuperiorTntModBlocks.INCREDIBLE_TNT.get()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrimedIncredibleTNTEntity(SuperiorTntModEntities.PRIMED_INCREDIBLE_TNT.get(), _level);
						entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0.5, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					((Entity) world.getEntitiesOfClass(PrimedIncredibleTNTEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("speed", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "speed")));
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SuperiorTntModBlocks.EXCEPTIONAL_TNT.get()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrimedExceptionalTNTEntity(SuperiorTntModEntities.PRIMED_EXCEPTIONAL_TNT.get(), _level);
						entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0.5, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					((Entity) world.getEntitiesOfClass(PrimedExceptionalTNTEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("speed", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "speed")));
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SuperiorTntModBlocks.TRANSCENDENT_TNT.get()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrimedTranscendentTNTEntity(SuperiorTntModEntities.PRIMED_TRANSCENDENT_TNT.get(), _level);
						entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0.5, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					((Entity) world.getEntitiesOfClass(PrimedTranscendentTNTEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("speed", (new Object() {
						public double getValue(LevelAccessor world, BlockPos pos, String tag) {
							BlockEntity blockEntity = world.getBlockEntity(pos);
							if (blockEntity != null)
								return blockEntity.getPersistentData().getDouble(tag);
							return -1;
						}
					}.getValue(world, new BlockPos(x, y, z), "speed")));
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SuperiorTntModBlocks.TNTX_10.get()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrimedTNTX10Entity(SuperiorTntModEntities.PRIMED_TNTX_10.get(), _level);
						entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0.5, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SuperiorTntModBlocks.TNTX_100.get()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrimedTNTX100Entity(SuperiorTntModEntities.PRIMED_TNTX_100.get(), _level);
						entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0.5, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SuperiorTntModBlocks.TNTX_1000.get()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrimedTNTX1000Entity(SuperiorTntModEntities.PRIMED_TNTX_1000.get(), _level);
						entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0.5, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SuperiorTntModBlocks.TNTX_10000.get()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrimedTNTX10000Entity(SuperiorTntModEntities.PRIMED_TNTX_10000.get(), _level);
						entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0.5, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SuperiorTntModBlocks.TNTX_100000.get()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrimedTNTX100000Entity(SuperiorTntModEntities.PRIMED_TNTX_100000.get(), _level);
						entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0.5, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == SuperiorTntModBlocks.TNTX_1000000.get()) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new PrimedTNTX1000000Entity(SuperiorTntModEntities.PRIMED_TNTX_1000000.get(), _level);
						entityToSpawn.moveTo((x + 0.5), y, (z + 0.5), 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0.5, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						world.addFreshEntity(entityToSpawn);
					}
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			}
			world = _worldorig;
		}
	}
}
