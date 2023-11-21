
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiortnt.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiortnt.entity.TranscendentEntity;
import net.mcreator.superiortnt.entity.RaycastEntityEntity;
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
import net.mcreator.superiortnt.entity.NukeProjectileEntity;
import net.mcreator.superiortnt.entity.ExplosionEntityEntity;
import net.mcreator.superiortnt.SuperiorTntMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SuperiorTntModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SuperiorTntMod.MODID);
	public static final RegistryObject<EntityType<PrimedGoodTNTEntity>> PRIMED_GOOD_TNT = register("primed_good_tnt", EntityType.Builder.<PrimedGoodTNTEntity>of(PrimedGoodTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrimedGoodTNTEntity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<ExplosionEntityEntity>> EXPLOSION_ENTITY = register("explosion_entity", EntityType.Builder.<ExplosionEntityEntity>of(ExplosionEntityEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(4104).setUpdateInterval(3).setCustomClientFactory(ExplosionEntityEntity::new).fireImmune().sized(0.1f, 0.1f));
	public static final RegistryObject<EntityType<PrimedTranscendentTNTEntity>> PRIMED_TRANSCENDENT_TNT = register("primed_transcendent_tnt", EntityType.Builder.<PrimedTranscendentTNTEntity>of(PrimedTranscendentTNTEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(PrimedTranscendentTNTEntity::new).fireImmune().sized(40f, 100f));
	public static final RegistryObject<EntityType<PrimedGreatTNTEntity>> PRIMED_GREAT_TNT = register("primed_great_tnt", EntityType.Builder.<PrimedGreatTNTEntity>of(PrimedGreatTNTEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrimedGreatTNTEntity::new).fireImmune().sized(3f, 3f));
	public static final RegistryObject<EntityType<PrimedAmazingTNTEntity>> PRIMED_AMAZING_TNT = register("primed_amazing_tnt", EntityType.Builder.<PrimedAmazingTNTEntity>of(PrimedAmazingTNTEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrimedAmazingTNTEntity::new).fireImmune().sized(5f, 5f));
	public static final RegistryObject<EntityType<PrimedExceptionalTNTEntity>> PRIMED_EXCEPTIONAL_TNT = register("primed_exceptional_tnt", EntityType.Builder.<PrimedExceptionalTNTEntity>of(PrimedExceptionalTNTEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrimedExceptionalTNTEntity::new).fireImmune().sized(9f, 9f));
	public static final RegistryObject<EntityType<PrimedIncredibleTNTEntity>> PRIMED_INCREDIBLE_TNT = register("primed_incredible_tnt", EntityType.Builder.<PrimedIncredibleTNTEntity>of(PrimedIncredibleTNTEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrimedIncredibleTNTEntity::new).fireImmune().sized(7f, 7f));
	public static final RegistryObject<EntityType<PrimedTNTX10Entity>> PRIMED_TNTX_10 = register("primed_tntx_10", EntityType.Builder.<PrimedTNTX10Entity>of(PrimedTNTX10Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrimedTNTX10Entity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<RaycastEntityEntity>> RAYCAST_ENTITY = register("raycast_entity", EntityType.Builder.<RaycastEntityEntity>of(RaycastEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(1010).setUpdateInterval(3).setCustomClientFactory(RaycastEntityEntity::new).fireImmune().sized(0.1f, 0.1f));
	public static final RegistryObject<EntityType<PrimedTNTX100Entity>> PRIMED_TNTX_100 = register("primed_tntx_100", EntityType.Builder.<PrimedTNTX100Entity>of(PrimedTNTX100Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrimedTNTX100Entity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<PrimedTNTX1000Entity>> PRIMED_TNTX_1000 = register("primed_tntx_1000", EntityType.Builder.<PrimedTNTX1000Entity>of(PrimedTNTX1000Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrimedTNTX1000Entity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<PrimedTNTX10000Entity>> PRIMED_TNTX_10000 = register("primed_tntx_10000", EntityType.Builder.<PrimedTNTX10000Entity>of(PrimedTNTX10000Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrimedTNTX10000Entity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<PrimedTNTX100000Entity>> PRIMED_TNTX_100000 = register("primed_tntx_100000", EntityType.Builder.<PrimedTNTX100000Entity>of(PrimedTNTX100000Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrimedTNTX100000Entity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<PrimedTNTX1000000Entity>> PRIMED_TNTX_1000000 = register("primed_tntx_1000000", EntityType.Builder.<PrimedTNTX1000000Entity>of(PrimedTNTX1000000Entity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PrimedTNTX1000000Entity::new).fireImmune().sized(1f, 1f));
	public static final RegistryObject<EntityType<TranscendentEntity>> TRANSCENDENT = register("transcendent", EntityType.Builder.<TranscendentEntity>of(TranscendentEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TranscendentEntity::new).fireImmune().sized(0.1f, 0.1f));
	public static final RegistryObject<EntityType<NukeProjectileEntity>> NUKE_PROJECTILE = register("nuke_projectile", EntityType.Builder.<NukeProjectileEntity>of(NukeProjectileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NukeProjectileEntity::new).fireImmune().sized(1f, 3.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PrimedGoodTNTEntity.init();
			ExplosionEntityEntity.init();
			PrimedTranscendentTNTEntity.init();
			PrimedGreatTNTEntity.init();
			PrimedAmazingTNTEntity.init();
			PrimedExceptionalTNTEntity.init();
			PrimedIncredibleTNTEntity.init();
			PrimedTNTX10Entity.init();
			RaycastEntityEntity.init();
			PrimedTNTX100Entity.init();
			PrimedTNTX1000Entity.init();
			PrimedTNTX10000Entity.init();
			PrimedTNTX100000Entity.init();
			PrimedTNTX1000000Entity.init();
			TranscendentEntity.init();
			NukeProjectileEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PRIMED_GOOD_TNT.get(), PrimedGoodTNTEntity.createAttributes().build());
		event.put(EXPLOSION_ENTITY.get(), ExplosionEntityEntity.createAttributes().build());
		event.put(PRIMED_TRANSCENDENT_TNT.get(), PrimedTranscendentTNTEntity.createAttributes().build());
		event.put(PRIMED_GREAT_TNT.get(), PrimedGreatTNTEntity.createAttributes().build());
		event.put(PRIMED_AMAZING_TNT.get(), PrimedAmazingTNTEntity.createAttributes().build());
		event.put(PRIMED_EXCEPTIONAL_TNT.get(), PrimedExceptionalTNTEntity.createAttributes().build());
		event.put(PRIMED_INCREDIBLE_TNT.get(), PrimedIncredibleTNTEntity.createAttributes().build());
		event.put(PRIMED_TNTX_10.get(), PrimedTNTX10Entity.createAttributes().build());
		event.put(RAYCAST_ENTITY.get(), RaycastEntityEntity.createAttributes().build());
		event.put(PRIMED_TNTX_100.get(), PrimedTNTX100Entity.createAttributes().build());
		event.put(PRIMED_TNTX_1000.get(), PrimedTNTX1000Entity.createAttributes().build());
		event.put(PRIMED_TNTX_10000.get(), PrimedTNTX10000Entity.createAttributes().build());
		event.put(PRIMED_TNTX_100000.get(), PrimedTNTX100000Entity.createAttributes().build());
		event.put(PRIMED_TNTX_1000000.get(), PrimedTNTX1000000Entity.createAttributes().build());
		event.put(TRANSCENDENT.get(), TranscendentEntity.createAttributes().build());
		event.put(NUKE_PROJECTILE.get(), NukeProjectileEntity.createAttributes().build());
	}
}
