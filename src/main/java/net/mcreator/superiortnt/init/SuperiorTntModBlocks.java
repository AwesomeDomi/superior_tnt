
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiortnt.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.superiortnt.block.TranscendentTNTBlock;
import net.mcreator.superiortnt.block.TestBlock;
import net.mcreator.superiortnt.block.TNTX10Block;
import net.mcreator.superiortnt.block.TNTX100Block;
import net.mcreator.superiortnt.block.TNTX1000Block;
import net.mcreator.superiortnt.block.TNTX10000Block;
import net.mcreator.superiortnt.block.TNTX100000Block;
import net.mcreator.superiortnt.block.TNTX1000000Block;
import net.mcreator.superiortnt.block.SuperiorOreBlock;
import net.mcreator.superiortnt.block.IncredibleTNTBlock;
import net.mcreator.superiortnt.block.GreatTNTBlock;
import net.mcreator.superiortnt.block.GoodTNTBlock;
import net.mcreator.superiortnt.block.ExceptionalTNTBlock;
import net.mcreator.superiortnt.block.AmazingTNTBlock;
import net.mcreator.superiortnt.SuperiorTntMod;

public class SuperiorTntModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SuperiorTntMod.MODID);
	public static final RegistryObject<Block> TRANSCENDENT_TNT = REGISTRY.register("transcendent_tnt", () -> new TranscendentTNTBlock());
	public static final RegistryObject<Block> SUPERIOR_ORE = REGISTRY.register("superior_ore", () -> new SuperiorOreBlock());
	public static final RegistryObject<Block> GOOD_TNT = REGISTRY.register("good_tnt", () -> new GoodTNTBlock());
	public static final RegistryObject<Block> GREAT_TNT = REGISTRY.register("great_tnt", () -> new GreatTNTBlock());
	public static final RegistryObject<Block> AMAZING_TNT = REGISTRY.register("amazing_tnt", () -> new AmazingTNTBlock());
	public static final RegistryObject<Block> INCREDIBLE_TNT = REGISTRY.register("incredible_tnt", () -> new IncredibleTNTBlock());
	public static final RegistryObject<Block> EXCEPTIONAL_TNT = REGISTRY.register("exceptional_tnt", () -> new ExceptionalTNTBlock());
	public static final RegistryObject<Block> TNTX_10 = REGISTRY.register("tntx_10", () -> new TNTX10Block());
	public static final RegistryObject<Block> TNTX_100 = REGISTRY.register("tntx_100", () -> new TNTX100Block());
	public static final RegistryObject<Block> TNTX_1000 = REGISTRY.register("tntx_1000", () -> new TNTX1000Block());
	public static final RegistryObject<Block> TNTX_10000 = REGISTRY.register("tntx_10000", () -> new TNTX10000Block());
	public static final RegistryObject<Block> TNTX_100000 = REGISTRY.register("tntx_100000", () -> new TNTX100000Block());
	public static final RegistryObject<Block> TNTX_1000000 = REGISTRY.register("tntx_1000000", () -> new TNTX1000000Block());
	public static final RegistryObject<Block> TEST = REGISTRY.register("test", () -> new TestBlock());
}
