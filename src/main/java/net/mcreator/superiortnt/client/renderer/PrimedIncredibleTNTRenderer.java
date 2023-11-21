
package net.mcreator.superiortnt.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.superiortnt.entity.PrimedIncredibleTNTEntity;
import net.mcreator.superiortnt.client.model.ModelWide7TNT;

public class PrimedIncredibleTNTRenderer extends MobRenderer<PrimedIncredibleTNTEntity, ModelWide7TNT<PrimedIncredibleTNTEntity>> {
	public PrimedIncredibleTNTRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWide7TNT(context.bakeLayer(ModelWide7TNT.LAYER_LOCATION)), 3f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrimedIncredibleTNTEntity entity) {
		return new ResourceLocation("superior_tnt:textures/entities/incredibletnt.png");
	}
}
