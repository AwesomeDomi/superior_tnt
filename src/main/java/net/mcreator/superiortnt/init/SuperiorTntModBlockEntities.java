
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiortnt.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.superiortnt.block.entity.IncredibleTNTBlockEntity;
import net.mcreator.superiortnt.block.entity.GreatTNTBlockEntity;
import net.mcreator.superiortnt.block.entity.GoodTNTBlockEntity;
import net.mcreator.superiortnt.block.entity.ExceptionalTNTBlockEntity;
import net.mcreator.superiortnt.block.entity.AmazingTNTBlockEntity;
import net.mcreator.superiortnt.SuperiorTntMod;

public class SuperiorTntModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, SuperiorTntMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> GOOD_TNT = register("good_tnt", SuperiorTntModBlocks.GOOD_TNT, GoodTNTBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> GREAT_TNT = register("great_tnt", SuperiorTntModBlocks.GREAT_TNT, GreatTNTBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AMAZING_TNT = register("amazing_tnt", SuperiorTntModBlocks.AMAZING_TNT, AmazingTNTBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> INCREDIBLE_TNT = register("incredible_tnt", SuperiorTntModBlocks.INCREDIBLE_TNT, IncredibleTNTBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EXCEPTIONAL_TNT = register("exceptional_tnt", SuperiorTntModBlocks.EXCEPTIONAL_TNT, ExceptionalTNTBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
