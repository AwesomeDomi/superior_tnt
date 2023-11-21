
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiortnt.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.superiortnt.world.inventory.InfoBookGUIMenu;
import net.mcreator.superiortnt.SuperiorTntMod;

public class SuperiorTntModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, SuperiorTntMod.MODID);
	public static final RegistryObject<MenuType<InfoBookGUIMenu>> INFO_BOOK_GUI = REGISTRY.register("info_book_gui", () -> IForgeMenuType.create(InfoBookGUIMenu::new));
}
