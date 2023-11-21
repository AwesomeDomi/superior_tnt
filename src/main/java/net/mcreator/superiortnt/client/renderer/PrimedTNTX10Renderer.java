
package net.mcreator.superiortnt.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiortnt.entity.PrimedTNTX10Entity;
import net.mcreator.superiortnt.client.model.ModelTNT;

public class PrimedTNTX10Renderer extends MobRenderer<PrimedTNTX10Entity, ModelTNT<PrimedTNTX10Entity>> {
	public PrimedTNTX10Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelTNT(context.bakeLayer(ModelTNT.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrimedTNTX10Entity entity) {
		return new ResourceLocation("superior_tnt:textures/entities/wips.png");
	}
}
