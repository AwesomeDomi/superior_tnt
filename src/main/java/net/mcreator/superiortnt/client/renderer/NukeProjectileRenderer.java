
package net.mcreator.superiortnt.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiortnt.entity.NukeProjectileEntity;
import net.mcreator.superiortnt.client.model.ModelNukeProjectile;

public class NukeProjectileRenderer extends MobRenderer<NukeProjectileEntity, ModelNukeProjectile<NukeProjectileEntity>> {
	public NukeProjectileRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelNukeProjectile(context.bakeLayer(ModelNukeProjectile.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NukeProjectileEntity entity) {
		return new ResourceLocation("superior_tnt:textures/entities/nuke.png");
	}
}
