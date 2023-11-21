
package net.mcreator.superiortnt.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiortnt.entity.PrimedTNTX10000Entity;
import net.mcreator.superiortnt.client.model.ModelTNT;

public class PrimedTNTX10000Renderer extends MobRenderer<PrimedTNTX10000Entity, ModelTNT<PrimedTNTX10000Entity>> {
	public PrimedTNTX10000Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelTNT(context.bakeLayer(ModelTNT.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrimedTNTX10000Entity entity) {
		return new ResourceLocation("superior_tnt:textures/entities/wips.png");
	}
}
