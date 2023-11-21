
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiortnt.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.superiortnt.client.model.Modelwide75tnt;
import net.mcreator.superiortnt.client.model.Modelwide100tnt;
import net.mcreator.superiortnt.client.model.ModelWide9TNT;
import net.mcreator.superiortnt.client.model.ModelWide7TNT;
import net.mcreator.superiortnt.client.model.ModelWide5TNT;
import net.mcreator.superiortnt.client.model.ModelWide3TNT;
import net.mcreator.superiortnt.client.model.ModelTNT;
import net.mcreator.superiortnt.client.model.ModelNukeProjectile;
import net.mcreator.superiortnt.client.model.ModelBomb;
import net.mcreator.superiortnt.client.model.ModelBall;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SuperiorTntModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelwide100tnt.LAYER_LOCATION, Modelwide100tnt::createBodyLayer);
		event.registerLayerDefinition(ModelNukeProjectile.LAYER_LOCATION, ModelNukeProjectile::createBodyLayer);
		event.registerLayerDefinition(ModelWide3TNT.LAYER_LOCATION, ModelWide3TNT::createBodyLayer);
		event.registerLayerDefinition(ModelWide9TNT.LAYER_LOCATION, ModelWide9TNT::createBodyLayer);
		event.registerLayerDefinition(ModelWide5TNT.LAYER_LOCATION, ModelWide5TNT::createBodyLayer);
		event.registerLayerDefinition(ModelWide7TNT.LAYER_LOCATION, ModelWide7TNT::createBodyLayer);
		event.registerLayerDefinition(ModelBomb.LAYER_LOCATION, ModelBomb::createBodyLayer);
		event.registerLayerDefinition(Modelwide75tnt.LAYER_LOCATION, Modelwide75tnt::createBodyLayer);
		event.registerLayerDefinition(ModelBall.LAYER_LOCATION, ModelBall::createBodyLayer);
		event.registerLayerDefinition(ModelTNT.LAYER_LOCATION, ModelTNT::createBodyLayer);
	}
}
