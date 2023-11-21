
package net.mcreator.superiortnt.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiortnt.entity.PrimedGoodTNTEntity;
import net.mcreator.superiortnt.client.model.ModelTNT;

public class PrimedGoodTNTRenderer extends MobRenderer<PrimedGoodTNTEntity, ModelTNT<PrimedGoodTNTEntity>> {
	public PrimedGoodTNTRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTNT(context.bakeLayer(ModelTNT.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrimedGoodTNTEntity entity) {
		return new ResourceLocation("superior_tnt:textures/entities/goodtnt.png");
	}
}
