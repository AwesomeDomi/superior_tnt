
package net.mcreator.superiortnt.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.superiortnt.init.SuperiorTntModTabs;

public class SuperiorEssenceItem extends Item {
	public SuperiorEssenceItem() {
		super(new Item.Properties().tab(SuperiorTntModTabs.TAB_SUPERIOR_TNT_MISC).stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
