package net.mcreator.superiortnt;

import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraftforge.event.level.ChunkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.level.ChunkEvent.*;
import net.minecraft.world.level.chunk.*;

import java.io.*;
import java.lang.*;
import java.util.*;

import net.mcreator.superiortnt.init.SuperiorTntModTabs;
import net.mcreator.superiortnt.init.SuperiorTntModMenus;
import net.mcreator.superiortnt.init.SuperiorTntModItems;
import net.mcreator.superiortnt.init.SuperiorTntModFeatures;
import net.mcreator.superiortnt.init.SuperiorTntModEntities;
import net.mcreator.superiortnt.init.SuperiorTntModBlocks;
import net.mcreator.superiortnt.init.SuperiorTntModBlockEntities;

import net.mcreator.superiortnt.entity.ExplosionEntityEntity;
import net.mcreator.superiortnt.entity.TranscendentEntity;


public class SuperiorTNTEventHandler {

	private void destroychunk()
	{
		
	}


	
@SubscribeEvent
    public static void chunkLoaded(ChunkEvent.Load event) {
		//boolean inrange = false;
		boolean fullyinrange = false;
		ChunkAccess chunk = event.getChunk();
		int minx = chunk.getPos().getMinBlockX();
		double distance = 0;
		
		int minz = chunk.getPos().getMinBlockZ();
		int maxx = chunk.getPos().getMaxBlockX();
		int maxz = chunk.getPos().getMaxBlockZ();

		int realx = minx;
		int realz = maxz;

		double entityx = 0;
		double entityz = 0;
		double maxheight = 0;
		double minheight = 0;
		int cylinderHeight = 1624;
		int ellipsoidheight = 400;
		int explosionWidth = 4104;
		int maxWorldHeight = event.getLevel().getMaxBuildHeight();
		int minWorldHeight = event.getLevel().getMinBuildHeight();

		Entity transcendentExplosion = event.getLevel().getEntitiesOfClass(ExplosionEntityEntity.class, AABB.ofSize(new Vec3(minx, 0, minz), 4100, 4000, 4100), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(minx, 0, minz)).findFirst().orElse(null);
			
		if (transcendentExplosion != null) //Explosion entity exists
		{
			if (transcendentExplosion.getPersistentData().getDouble("type") == 3)
			{
				entityx = transcendentExplosion.getX();
				entityz = transcendentExplosion.getZ();
				minheight = transcendentExplosion.getPersistentData().getDouble("minheight");
				maxheight = transcendentExplosion.getPersistentData().getDouble("maxheight");
				//System.out.println(String.valueOf("EntityX: " + entityx + " EntityZ: " + entityz + " MinWorldHeight: " + minWorldHeight + " MaxWorldHeight: " + maxWorldHeight));
				
				
			
			}

		}

			
		Entity transcendentEntity = event.getLevel().getEntitiesOfClass(TranscendentEntity.class, AABB.ofSize(new Vec3(minx, maxWorldHeight, minz), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
				}.compareDistOf(minx, 0, minz)).findFirst().orElse(null);
				if (transcendentEntity != null)
				{
					fullyinrange = cylinderHeight > maxWorldHeight - minWorldHeight && distance < explosionWidth + 8;

            		if (fullyinrange)
            		{
            			for (int i = 0; i < maxWorldHeight / 16; i++) {
              			  	chunk.getSections()[i] = null;
          		  		}
						
          				
            		}
				}

		
    	
        //System.out.println(event.getChunk().getPos().getWorldPosition());
        
        
    }

}

