
package net.mcreator.superiortnt.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiortnt.entity.RaycastEntityEntity;
import net.mcreator.superiortnt.client.model.ModelTNT;

public class RaycastEntityRenderer extends MobRenderer<RaycastEntityEntity, ModelTNT<RaycastEntityEntity>> {
	public RaycastEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTNT(context.bakeLayer(ModelTNT.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(RaycastEntityEntity entity) {
		return new ResourceLocation("superior_tnt:textures/entities/hd_transparent_picture.png");
	}
}
