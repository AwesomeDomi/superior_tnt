
package net.mcreator.superiortnt.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiortnt.entity.PrimedTranscendentTNTEntity;
import net.mcreator.superiortnt.client.model.Modelwide100tnt;

public class PrimedTranscendentTNTRenderer extends MobRenderer<PrimedTranscendentTNTEntity, Modelwide100tnt<PrimedTranscendentTNTEntity>> {
	public PrimedTranscendentTNTRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelwide100tnt(context.bakeLayer(Modelwide100tnt.LAYER_LOCATION)), 5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrimedTranscendentTNTEntity entity) {
		return new ResourceLocation("superior_tnt:textures/entities/beeeeg.png");
	}
}
