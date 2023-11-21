
package net.mcreator.superiortnt.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiortnt.entity.PrimedAmazingTNTEntity;
import net.mcreator.superiortnt.client.model.ModelWide5TNT;

public class PrimedAmazingTNTRenderer extends MobRenderer<PrimedAmazingTNTEntity, ModelWide5TNT<PrimedAmazingTNTEntity>> {
	public PrimedAmazingTNTRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWide5TNT(context.bakeLayer(ModelWide5TNT.LAYER_LOCATION)), 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrimedAmazingTNTEntity entity) {
		return new ResourceLocation("superior_tnt:textures/entities/amazingtnt.png");
	}
}
