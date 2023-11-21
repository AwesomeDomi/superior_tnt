
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiortnt.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SuperiorTntModTabs {
	public static CreativeModeTab TAB_SUPERIOR_TNT_TIER_1;
	public static CreativeModeTab TAB_SUPERIOR_TNT_TIER_2;
	public static CreativeModeTab TAB_SUPERIOR_TNT_TIER_3;
	public static CreativeModeTab TAB_SUPERIOR_TNT_TIER_4;
	public static CreativeModeTab TAB_SUPERIOR_TNT_TIER_5;
	public static CreativeModeTab TAB_SUPERIOR_TNT_TIER_6;
	public static CreativeModeTab TAB_SUPERIOR_TNT_MISC;

	public static void load() {
		TAB_SUPERIOR_TNT_TIER_1 = new CreativeModeTab("tabsuperior_tnt_tier_1") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SuperiorTntModBlocks.GOOD_TNT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SUPERIOR_TNT_TIER_2 = new CreativeModeTab("tabsuperior_tnt_tier_2") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SuperiorTntModBlocks.GREAT_TNT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SUPERIOR_TNT_TIER_3 = new CreativeModeTab("tabsuperior_tnt_tier_3") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SuperiorTntModBlocks.AMAZING_TNT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SUPERIOR_TNT_TIER_4 = new CreativeModeTab("tabsuperior_tnt_tier_4") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SuperiorTntModBlocks.INCREDIBLE_TNT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SUPERIOR_TNT_TIER_5 = new CreativeModeTab("tabsuperior_tnt_tier_5") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SuperiorTntModBlocks.EXCEPTIONAL_TNT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SUPERIOR_TNT_TIER_6 = new CreativeModeTab("tabsuperior_tnt_tier_6") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SuperiorTntModBlocks.TRANSCENDENT_TNT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_SUPERIOR_TNT_MISC = new CreativeModeTab("tabsuperior_tnt_misc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SuperiorTntModItems.CONFIGURATOR.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
