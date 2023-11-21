
package net.mcreator.superiortnt.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiortnt.entity.PrimedTNTX100Entity;
import net.mcreator.superiortnt.client.model.ModelTNT;

public class PrimedTNTX100Renderer extends MobRenderer<PrimedTNTX100Entity, ModelTNT<PrimedTNTX100Entity>> {
	public PrimedTNTX100Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelTNT(context.bakeLayer(ModelTNT.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrimedTNTX100Entity entity) {
		return new ResourceLocation("superior_tnt:textures/entities/wips.png");
	}
}
