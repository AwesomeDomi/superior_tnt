package net.mcreator.superiortnt.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.superiortnt.network.SuperiorTntModVariables;
import net.mcreator.superiortnt.init.SuperiorTntModEntities;
import net.mcreator.superiortnt.entity.ExplosionEntityEntity;

import java.util.Comparator;

public class ExceptionalTNTMainProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 100) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, x, (y + 4.5), z, 8, 0, 0, 0, 0.5);
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 1));
			SuperiorTntModVariables.WorldVariables.get(world).securesummon = false;
			SuperiorTntModVariables.WorldVariables.get(world).syncData(world);
		} else {
			if (!SuperiorTntModVariables.WorldVariables.get(world).securesummon) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ExplosionEntityEntity(SuperiorTntModEntities.EXPLOSION_ENTITY.get(), _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
					world.addFreshEntity(entityToSpawn);
				}
				SuperiorTntModVariables.WorldVariables.get(world).paused = true;
				SuperiorTntModVariables.WorldVariables.get(world).syncData(world);
				SuperiorTntModVariables.WorldVariables.get(world).securesummon = true;
				SuperiorTntModVariables.WorldVariables.get(world).syncData(world);
			} else {
				((Entity) world.getEntitiesOfClass(ExplosionEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("type", 2);
				((Entity) world.getEntitiesOfClass(ExplosionEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("speed", (entity.getPersistentData().getDouble("speed")));
				((Entity) world.getEntitiesOfClass(ExplosionEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("explosionwidth", 750);
				((Entity) world.getEntitiesOfClass(ExplosionEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("cylinderheight", 750);
				((Entity) world.getEntitiesOfClass(ExplosionEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("ellipsoidheight", 250);
				((Entity) world.getEntitiesOfClass(ExplosionEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("tempwidth", Math.floor(x));
				((Entity) world.getEntitiesOfClass(ExplosionEntityEntity.class, AABB.ofSize(new Vec3(x, y, z), 1, 1, 1), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putDouble("tempwidth2", Math.floor(z));
				if (!entity.level.isClientSide())
					entity.discard();
				SuperiorTntModVariables.WorldVariables.get(world).paused = false;
				SuperiorTntModVariables.WorldVariables.get(world).syncData(world);
			}
		}
	}
}
