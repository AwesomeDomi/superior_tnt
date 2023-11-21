
package net.mcreator.superiortnt.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.world.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.*;
import net.minecraft.world.phys.*;
import net.minecraft.world.item.*;

import net.mcreator.superiortnt.init.SuperiorTntModItems;
import net.mcreator.superiortnt.block.entity.GoodTNTBlockEntity;
import net.mcreator.superiortnt.procedures.MainSummonProcedure;
import net.mcreator.superiortnt.procedures.MainSummon2Procedure;

import java.util.List;
import java.util.Collections;

public class TNTX10Block extends Block {
	public TNTX10Block() {
		super(BlockBehaviour.Properties.of(Material.EXPLOSIVE).sound(SoundType.GRASS).instabreak());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		if (world.getBestNeighborSignal(pos) > 0) {
			MainSummon2Procedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
		}
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		if (entity.getMainHandItem().getItem() == Items.FLINT_AND_STEEL || entity.getMainHandItem().getItem() == Items.FIRE_CHARGE)
		{
			MainSummon2Procedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
			return InteractionResult.SUCCESS;
		}
		else
		{
			return InteractionResult.FAIL;
		}
		
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		MainSummon2Procedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
