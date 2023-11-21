
package net.mcreator.superiortnt.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiortnt.entity.ExplosionEntityEntity;
import net.mcreator.superiortnt.client.model.ModelTNT;

public class ExplosionEntityRenderer extends MobRenderer<ExplosionEntityEntity, ModelTNT<ExplosionEntityEntity>> {
	public ExplosionEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTNT(context.bakeLayer(ModelTNT.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(ExplosionEntityEntity entity) {
		return new ResourceLocation("superior_tnt:textures/entities/hd_transparent_picture.png");
	}
}
