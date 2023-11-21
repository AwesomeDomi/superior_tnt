
package net.mcreator.superiortnt.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.MutableBlockPos;
import net.minecraft.world.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.*;
import net.minecraft.world.phys.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.chunk.*;

import net.mcreator.superiortnt.init.SuperiorTntModItems;
import net.mcreator.superiortnt.block.entity.GoodTNTBlockEntity;
import net.mcreator.superiortnt.procedures.MainSummonProcedure;
import net.mcreator.superiortnt.procedures.MainSummon2Procedure;
import net.mcreator.superiortnt.entity.TranscendentEntity;


import java.io.*;
import java.lang.*;
import java.util.*;

public class TestBlock extends Block {
	public TestBlock() {
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
		int blocks = 1;
		if (!world.isClientSide)
		{
		if (entity.getMainHandItem().getItem() == Items.FLINT_AND_STEEL || entity.getMainHandItem().getItem() == Items.FIRE_CHARGE)
		{
		long startTime = System.nanoTime();	
		
					
					ChunkAccess chunk = world.getChunk(pos.getX(), pos.getZ());
            		
            		
            			for (int i = 0; i < world.getMaxBuildHeight() / 16; i++) {
              			  	chunk.getSections()[i].release();
              			  	blocks+=16*16*16;
          		  		}
						
          				
            		
				
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println(estimatedTime + "ns total, " + blocks + " blocks, " + estimatedTime/blocks + "ns per block");
		return InteractionResult.SUCCESS;
		}
		else
		{
			return InteractionResult.FAIL;
		}
		}
		return InteractionResult.FAIL;
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		MainSummon2Procedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
