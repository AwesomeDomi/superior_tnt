package net.mcreator.superiortnt;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import org.checkerframework.checker.units.qual.radians;
import net.minecraft.world.level.*;
import net.minecraft.world.entity.*;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockPos.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.block.state.predicate.*;


import java.util.*;

import net.mcreator.superiortnt.entity.RaycastEntityEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GradualRaycast {

	private Level world;
	private RaycastEntityEntity entity;
	private double X;
	private double Y;
	private double Z;
	private int radius;
	private int distance = 0;

	public static int getx(long n)
	{
		return (int)( n & (4095) );
	}  
	public static int gety(long n)
	{
		return (int)( (n & (16773120)) / 4096 );
	}  
	public static int getz(long n)
	{
		return (int)( (n & (68702699520L)) / 16777216L );
	}  
	public static int getpower(long n)
    {
        return (int)( (n & (1125831187365888L)) / 68719476736L );
    }
   

  
	public static long converty(int n)
	{
		return (long)( n * 4096 );
	}  
	public static long convertz(int n)
	{
		return (long)(n * 16777216L );
	}  
	public static long convertpower(int n)
    {
        return (long)(n * 68719476736L );
    }
   
	
	public GradualRaycast() {

	}

	public void initialize(Level world, RaycastEntityEntity entity, double x, double y, double z, int radius, boolean text) {
		this.world = world;
		this.entity = entity;
		X = x;
		Y = y;
		Z = z;
		this.radius = radius;
		if (radius < 600)
		{
			calculateRaysSphere();
		}
		else
		{
			calculateRaysCube();
		}
		
	}


	public void calculateRaysSphere()
	{
		if (!world.isClientSide() && world.getServer() != null)
		{
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7bStarting to calculate rays!"), false);
		}
		long startTime = System.nanoTime();		
		long temp;
		double distance;		
		long power = convertpower(radius);	
		
		for(int i = 0; i < 2*radius+1; i++)
		{
			for(int j = 0; j < 2*radius+1; j++)
			{
				for(int k = 0; k < 2*radius+1; k++)
				{
					distance = Math.sqrt(Math.pow((i-radius),2)+Math.pow((j-radius),2)+Math.pow((k-radius),2));
					
					if (distance < radius+1 && distance >= radius-1)
					{
						temp = i+converty(j)+convertz(k)+convertpower(radius*3);
						entity.Rays.add(temp);
						
					}
				}
			}
		}

		long estimatedTime = System.nanoTime() - startTime;
		if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7bRays calculated, starting block destruction!"), false);
		System.out.println("There are " + entity.Rays.size() + " rays, calculated in " + estimatedTime/1000000 + "ms");
	}


	public void calculateRaysCube()
	{
		if (!world.isClientSide() && world.getServer() != null)
		{
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7bStarting to calculate rays!"), false);
		}
		long startTime = System.nanoTime();		
		long temp = 0;
				
		long power = convertpower(radius*3);	
		int maxradius = 5*radius/4;
		
		for(int i = 0; i < 2*maxradius; i++)
		{
			for(int j = 0; j < 2*maxradius; j++)
			{					
				temp = i+converty(j)+convertz(0)+power;
				entity.Rays.add(temp);
				
				temp = i+1+converty(j+1)+convertz(2*maxradius)+power;
				entity.Rays.add(temp);
				
				temp = j+1+converty(0)+convertz(i+1)+power;
				entity.Rays.add(temp);
				
				temp = j+converty(2*maxradius)+convertz(i)+power;
				entity.Rays.add(temp);
				
				temp = converty(i)+convertz(j+1)+power;
				entity.Rays.add(temp);
				
				temp = 2*maxradius+converty(i+1)+convertz(j)+power;
				entity.Rays.add(temp);
				
			}
			
		}
		temp = 2*maxradius+power;
		entity.Rays.add(temp);
		temp = converty(2*maxradius)+convertz(2*maxradius)+power;
		entity.Rays.add(temp);
		long estimatedTime = System.nanoTime() - startTime;
		
		if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7bRays calculated, starting block destruction!"), false);
		System.out.println("There are " + entity.Rays.size() + " rays, calculated in " + estimatedTime/1000000 + "ms");
	}


	public void explode()
	{
		long temp = 0;
		int xx = (int)X;
		int yy = (int)Y;
		int zz = (int)Z;
		long maxdistance = 10*radius;
		long mindistance = 19*radius/2;
		int maxradius = 5*radius/4;;
       	long startTime = System.nanoTime();
       	int realx = 0;
		int realy = 0;
		int realz = 0;
		float random = 0;
		float percentageremove = (float)1.0/((maxdistance-mindistance)/6);
		ListIterator i = entity.Rays.listIterator(0);
		MutableBlockPos pos = new MutableBlockPos();
        //System.out.println("Radius: " + radius + " Maxradius: " + maxradius + " Mindistance: " + mindistance + " Maxdistance: " + maxdistance + " PercentageRemove: " + percentageremove);
        int resistance = 0;
        if (!entity.Rays.isEmpty())
        {
        	i = entity.Rays.listIterator(0);
        	while (i.hasNext())
            {
            	Random rng = new Random();
            	random = rng.nextFloat();
        		temp = (long)i.next();
            	if (getpower(temp) <= 0 || distance > maxdistance)
            	{
            		i.remove();
            		
            	}
            	else if (distance > mindistance && random < percentageremove && radius > 600)
            	{
            		i.remove();
            	}
            	else
            	{
            		realx = xx + (int)((distance * ((getx(temp) - maxradius))) / 8.0 / maxradius);
            		realy = yy + (int)((distance * ((gety(temp) - maxradius))) / 8.0 / maxradius);
            		realz = zz + (int)((distance * ((getz(temp) - maxradius))) / 8.0 / maxradius);
            		i.set(temp - convertpower(1));
            		pos.set(realx,realy,realz);
            		if (!world.isEmptyBlock(pos))
            		{
            			resistance = (int)(world.getBlockState(pos)).getBlock().getExplosionResistance();
						if (getpower(temp) >= resistance)
						{
							i.set(temp - convertpower(resistance));
							world.setBlock(pos, Blocks.AIR.defaultBlockState(), 3);
							entity.mbd++;
						}
						else
						{
							i.remove();
						}
						/*timer++;
						if (timer % 1000 == 0)
						{
							System.out.println("Power: " + getpower(temp) + " Distance: " + distance + " Realx: " + realx + " getx: " + getx(temp)+ " Realy: " + realy + " gety: " + gety(temp)+ " Realz: " + realz + " getz: " + getz(temp));
						}*/
						
					}
            		
            		
            	}
            	
            }
            
            distance += 6;
        	long estimatedTime = System.nanoTime() - startTime;
        	System.out.println("There are " + entity.Rays.size() + " rays to go, distance = " + distance + ", this stage took " + estimatedTime/1000000 + "ms");
        }
        else
        {
        	System.out.println("Explosion done! " + entity.mbd + " blocks have been destroyed!");
        	if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7bExplosion done! " + entity.mbd + " blocks have been destroyed!"), false);
        	entity.discard();
        }
        
		
		
		
	}
	
	
	
}
