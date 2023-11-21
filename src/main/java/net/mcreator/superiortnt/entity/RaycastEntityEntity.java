
package net.mcreator.superiortnt.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.*;
import net.minecraft.server.level.*;
import net.minecraft.commands.*;
import net.minecraft.network.chat.*;

import net.mcreator.superiortnt.init.SuperiorTntModEntities;
import net.mcreator.superiortnt.network.SuperiorTntModVariables;

import net.mcreator.superiortnt.GradualRaycast;

import java.util.*;

public class RaycastEntityEntity extends PathfinderMob {
	public RaycastEntityEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(SuperiorTntModEntities.RAYCAST_ENTITY.get(), world);
		
	}

	public RaycastEntityEntity(EntityType<RaycastEntityEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 0;
		setNoAi(true);
		setPersistenceRequired();
		this.moveControl = new FlyingMoveControl(this, 10, true);
		
	}

	public LinkedList<Long> Rays = new LinkedList<Long>();

	public GradualRaycast gr = new GradualRaycast();

	public int timer = -2;

	public long mbd = 0;

	public int radius = 0;

	private boolean chunksloaded = false;

	private boolean rayscalculated = false;

	private boolean text = true;

	private int delay = 1;

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {
		return false;
	}

	@Override
	public boolean hurt(DamageSource source, float amount) {
		if (source.getDirectEntity() instanceof AbstractArrow)
			return false;
		if (source.getDirectEntity() instanceof Player)
			return false;
		if (source.getDirectEntity() instanceof ThrownPotion || source.getDirectEntity() instanceof AreaEffectCloud)
			return false;
		if (source == DamageSource.FALL)
			return false;
		if (source == DamageSource.CACTUS)
			return false;
		if (source == DamageSource.DROWN)
			return false;
		if (source == DamageSource.LIGHTNING_BOLT)
			return false;
		if (source.isExplosion())
			return false;
		if (source.getMsgId().equals("trident"))
			return false;
		if (source == DamageSource.ANVIL)
			return false;
		if (source == DamageSource.DRAGON_BREATH)
			return false;
		if (source == DamageSource.WITHER)
			return false;
		if (source.getMsgId().equals("witherSkull"))
			return false;
		return super.hurt(source, amount);
	}

	@Override
	public void baseTick() {
		super.baseTick();
			
		if (!SuperiorTntModVariables.WorldVariables.get(this.level).paused) 
		{
		
		if (!this.level.isClientSide())
		{
		if (timer == -1)
		{
			if (((Entity) this.level.getEntitiesOfClass(PrimedTNTX10Entity.class, AABB.ofSize(new Vec3(this.getX(), this.getY(), this.getZ()), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(this.getX(), this.getY(), this.getZ())).findFirst().orElse(null)) instanceof PrimedTNTX10Entity _entity)
			{
				_entity.discard();
				radius = 12;
				delay = 2;
			}
			else if (((Entity) this.level.getEntitiesOfClass(PrimedTNTX100Entity.class, AABB.ofSize(new Vec3(this.getX(), this.getY(), this.getZ()), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(this.getX(), this.getY(), this.getZ())).findFirst().orElse(null)) instanceof PrimedTNTX100Entity _entity)
			{
				_entity.discard();
				radius = 30;
				delay = 5;
			}
			else if (((Entity) this.level.getEntitiesOfClass(PrimedTNTX1000Entity.class, AABB.ofSize(new Vec3(this.getX(), this.getY(), this.getZ()), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(this.getX(), this.getY(), this.getZ())).findFirst().orElse(null)) instanceof PrimedTNTX1000Entity _entity)
			{
				_entity.discard();
				radius = 80;
				delay = 8;
			}
			else if (((Entity) this.level.getEntitiesOfClass(PrimedTNTX10000Entity.class, AABB.ofSize(new Vec3(this.getX(), this.getY(), this.getZ()), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(this.getX(), this.getY(), this.getZ())).findFirst().orElse(null)) instanceof PrimedTNTX10000Entity _entity)
			{
				_entity.discard();
				radius = 200;
				delay = 12;
			}
			else if (((Entity) this.level.getEntitiesOfClass(PrimedTNTX100000Entity.class, AABB.ofSize(new Vec3(this.getX(), this.getY(), this.getZ()), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(this.getX(), this.getY(), this.getZ())).findFirst().orElse(null)) instanceof PrimedTNTX100000Entity _entity)
			{
				_entity.discard();
				radius = 440;
				delay = 16;
			}
			else if (((Entity) this.level.getEntitiesOfClass(PrimedTNTX1000000Entity.class, AABB.ofSize(new Vec3(this.getX(), this.getY(), this.getZ()), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(this.getX(), this.getY(), this.getZ())).findFirst().orElse(null)) instanceof PrimedTNTX1000000Entity _entity)
			{
				_entity.discard();
				radius = 900;
				delay = 20;
			}
			else if (((Entity) this.level.getEntitiesOfClass(NukeProjectileEntity.class, AABB.ofSize(new Vec3(this.getX(), this.getY(), this.getZ()), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(this.getX(), this.getY(), this.getZ())).findFirst().orElse(null)) instanceof NukeProjectileEntity _entity)
			{
				radius = _entity.radius;
				delay = _entity.delay;
				text = _entity.text;
				_entity.discard();
			}
			delay +=22;

		}
		if (timer == 0)
		{
			int x = (int)this.getX() - 5*radius/4;
			int y = (int)this.getY();
			int z = (int)this.getZ() - 5*radius/4;
			int percentage = 0;
			double lastamount = (radius/6.4+1)/10;
			double  amount = lastamount;
			if (!this.level.isClientSide() && this.level.getServer() != null && text)
			{
				this.level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7bFoceloading chunks!"), false);
			}
			for (int i = 0; i < radius/6.4+1; i++)
			{
			for (int j = 0; j < radius/6.4+1; j++)
			{
				if (this.level instanceof ServerLevel _level){
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"forceload add ~ ~");
				}
				
				
				if (!this.level.isClientSide() && this.level.getServer() != null && i+1 > amount && text)
				{
					percentage += 10;
					amount += lastamount;
					this.level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7b" + percentage + "% done!"), false);
				}
				x+=16;
			}
			System.out.println("Loading chunks at z: " + z);
			x = (int)this.getX() - 5*radius/4;
			z+=16;
			}
			if (!this.level.isClientSide() && this.level.getServer() != null && text)
			{
				this.level.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A7bChunks loaded!"), false);
			}
			chunksloaded = true;
			
		}
		if (timer == 21 && chunksloaded)
		{
			gr.initialize(this.level, this, this.getX(), this.getY(), this.getZ(), radius, text);
			
			timer = 22;
			rayscalculated = true;
		}
			
		if (timer % delay == 0 && rayscalculated)
		{
			
			gr.explode();
			//System.gc();
			timer = 22;
		}
		timer += 1;
		
		}
		}	
	}

	@Override
	public boolean isPushable() {
		return false;
	}

	@Override
	protected void doPush(Entity entityIn) {
	}

	@Override
	protected void pushEntities() {
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();
		this.setNoGravity(true);
	}

	public static void init() {
		
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 200);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 1);
		builder = builder.add(Attributes.FLYING_SPEED, 0);
		return builder;
	}
}
