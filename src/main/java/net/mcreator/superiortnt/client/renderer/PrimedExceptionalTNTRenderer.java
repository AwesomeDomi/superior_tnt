
package net.mcreator.superiortnt.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiortnt.entity.PrimedExceptionalTNTEntity;
import net.mcreator.superiortnt.client.model.ModelWide9TNT;

public class PrimedExceptionalTNTRenderer extends MobRenderer<PrimedExceptionalTNTEntity, ModelWide9TNT<PrimedExceptionalTNTEntity>> {
	public PrimedExceptionalTNTRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWide9TNT(context.bakeLayer(ModelWide9TNT.LAYER_LOCATION)), 4f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrimedExceptionalTNTEntity entity) {
		return new ResourceLocation("superior_tnt:textures/entities/exceptionaltnt.png");
	}
}
