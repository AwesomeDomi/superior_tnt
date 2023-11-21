
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiortnt.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.superiortnt.item.SuperiorEssenceItem;
import net.mcreator.superiortnt.item.ConfiguratorItem;
import net.mcreator.superiortnt.SuperiorTntMod;

public class SuperiorTntModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SuperiorTntMod.MODID);
	public static final RegistryObject<Item> TRANSCENDENT_TNT = block(SuperiorTntModBlocks.TRANSCENDENT_TNT, SuperiorTntModTabs.TAB_SUPERIOR_TNT_TIER_6);
	public static final RegistryObject<Item> CONFIGURATOR = REGISTRY.register("configurator", () -> new ConfiguratorItem());
	public static final RegistryObject<Item> SUPERIOR_ESSENCE = REGISTRY.register("superior_essence", () -> new SuperiorEssenceItem());
	public static final RegistryObject<Item> SUPERIOR_ORE = block(SuperiorTntModBlocks.SUPERIOR_ORE, SuperiorTntModTabs.TAB_SUPERIOR_TNT_MISC);
	public static final RegistryObject<Item> GOOD_TNT = block(SuperiorTntModBlocks.GOOD_TNT, SuperiorTntModTabs.TAB_SUPERIOR_TNT_TIER_1);
	public static final RegistryObject<Item> GREAT_TNT = block(SuperiorTntModBlocks.GREAT_TNT, SuperiorTntModTabs.TAB_SUPERIOR_TNT_TIER_2);
	public static final RegistryObject<Item> AMAZING_TNT = block(SuperiorTntModBlocks.AMAZING_TNT, SuperiorTntModTabs.TAB_SUPERIOR_TNT_TIER_3);
	public static final RegistryObject<Item> INCREDIBLE_TNT = block(SuperiorTntModBlocks.INCREDIBLE_TNT, SuperiorTntModTabs.TAB_SUPERIOR_TNT_TIER_4);
	public static final RegistryObject<Item> EXCEPTIONAL_TNT = block(SuperiorTntModBlocks.EXCEPTIONAL_TNT, SuperiorTntModTabs.TAB_SUPERIOR_TNT_TIER_5);
	public static final RegistryObject<Item> TNTX_10 = block(SuperiorTntModBlocks.TNTX_10, SuperiorTntModTabs.TAB_SUPERIOR_TNT_TIER_1);
	public static final RegistryObject<Item> TNTX_100 = block(SuperiorTntModBlocks.TNTX_100, SuperiorTntModTabs.TAB_SUPERIOR_TNT_TIER_2);
	public static final RegistryObject<Item> TNTX_1000 = block(SuperiorTntModBlocks.TNTX_1000, SuperiorTntModTabs.TAB_SUPERIOR_TNT_TIER_3);
	public static final RegistryObject<Item> TNTX_10000 = block(SuperiorTntModBlocks.TNTX_10000, SuperiorTntModTabs.TAB_SUPERIOR_TNT_TIER_4);
	public static final RegistryObject<Item> TNTX_100000 = block(SuperiorTntModBlocks.TNTX_100000, SuperiorTntModTabs.TAB_SUPERIOR_TNT_TIER_5);
	public static final RegistryObject<Item> TNTX_1000000 = block(SuperiorTntModBlocks.TNTX_1000000, SuperiorTntModTabs.TAB_SUPERIOR_TNT_TIER_6);
	public static final RegistryObject<Item> TEST = block(SuperiorTntModBlocks.TEST, SuperiorTntModTabs.TAB_SUPERIOR_TNT_TIER_1);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
