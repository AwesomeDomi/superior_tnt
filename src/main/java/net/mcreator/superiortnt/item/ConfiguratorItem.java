
package net.mcreator.superiortnt.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.superiortnt.init.SuperiorTntModTabs;

public class ConfiguratorItem extends Item {
	public ConfiguratorItem() {
		super(new Item.Properties().tab(SuperiorTntModTabs.TAB_SUPERIOR_TNT_MISC).stacksTo(1).rarity(Rarity.COMMON));
	}
}
