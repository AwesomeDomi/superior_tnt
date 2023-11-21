
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiortnt.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.superiortnt.world.features.ores.SuperiorOreFeature;
import net.mcreator.superiortnt.SuperiorTntMod;

@Mod.EventBusSubscriber
public class SuperiorTntModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SuperiorTntMod.MODID);
	public static final RegistryObject<Feature<?>> SUPERIOR_ORE = REGISTRY.register("superior_ore", SuperiorOreFeature::feature);
}
