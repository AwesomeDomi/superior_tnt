
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiortnt.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.superiortnt.client.renderer.TranscendentRenderer;
import net.mcreator.superiortnt.client.renderer.RaycastEntityRenderer;
import net.mcreator.superiortnt.client.renderer.PrimedTranscendentTNTRenderer;
import net.mcreator.superiortnt.client.renderer.PrimedTNTX10Renderer;
import net.mcreator.superiortnt.client.renderer.PrimedTNTX100Renderer;
import net.mcreator.superiortnt.client.renderer.PrimedTNTX1000Renderer;
import net.mcreator.superiortnt.client.renderer.PrimedTNTX10000Renderer;
import net.mcreator.superiortnt.client.renderer.PrimedTNTX100000Renderer;
import net.mcreator.superiortnt.client.renderer.PrimedTNTX1000000Renderer;
import net.mcreator.superiortnt.client.renderer.PrimedIncredibleTNTRenderer;
import net.mcreator.superiortnt.client.renderer.PrimedGreatTNTRenderer;
import net.mcreator.superiortnt.client.renderer.PrimedGoodTNTRenderer;
import net.mcreator.superiortnt.client.renderer.PrimedExceptionalTNTRenderer;
import net.mcreator.superiortnt.client.renderer.PrimedAmazingTNTRenderer;
import net.mcreator.superiortnt.client.renderer.NukeProjectileRenderer;
import net.mcreator.superiortnt.client.renderer.ExplosionEntityRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SuperiorTntModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SuperiorTntModEntities.PRIMED_GOOD_TNT.get(), PrimedGoodTNTRenderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.EXPLOSION_ENTITY.get(), ExplosionEntityRenderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.PRIMED_TRANSCENDENT_TNT.get(), PrimedTranscendentTNTRenderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.PRIMED_GREAT_TNT.get(), PrimedGreatTNTRenderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.PRIMED_AMAZING_TNT.get(), PrimedAmazingTNTRenderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.PRIMED_EXCEPTIONAL_TNT.get(), PrimedExceptionalTNTRenderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.PRIMED_INCREDIBLE_TNT.get(), PrimedIncredibleTNTRenderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.PRIMED_TNTX_10.get(), PrimedTNTX10Renderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.RAYCAST_ENTITY.get(), RaycastEntityRenderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.PRIMED_TNTX_100.get(), PrimedTNTX100Renderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.PRIMED_TNTX_1000.get(), PrimedTNTX1000Renderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.PRIMED_TNTX_10000.get(), PrimedTNTX10000Renderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.PRIMED_TNTX_100000.get(), PrimedTNTX100000Renderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.PRIMED_TNTX_1000000.get(), PrimedTNTX1000000Renderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.TRANSCENDENT.get(), TranscendentRenderer::new);
		event.registerEntityRenderer(SuperiorTntModEntities.NUKE_PROJECTILE.get(), NukeProjectileRenderer::new);
	}
}
