
package net.mcreator.superiortnt.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiortnt.entity.PrimedGreatTNTEntity;
import net.mcreator.superiortnt.client.model.ModelWide3TNT;

public class PrimedGreatTNTRenderer extends MobRenderer<PrimedGreatTNTEntity, ModelWide3TNT<PrimedGreatTNTEntity>> {
	public PrimedGreatTNTRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWide3TNT(context.bakeLayer(ModelWide3TNT.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrimedGreatTNTEntity entity) {
		return new ResourceLocation("superior_tnt:textures/entities/greattnt.png");
	}
}
