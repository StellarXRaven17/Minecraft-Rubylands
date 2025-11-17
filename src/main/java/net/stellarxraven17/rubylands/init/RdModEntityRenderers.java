/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.stellarxraven17.rubylands.init;

import net.stellarxraven17.rubylands.client.renderer.RecruiterRenderer;
import net.stellarxraven17.rubylands.client.renderer.ObserverRenderer;
import net.stellarxraven17.rubylands.client.renderer.EssenceBulletRenderer;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class RdModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RdModEntities.OBSERVER.get(), ObserverRenderer::new);
		event.registerEntityRenderer(RdModEntities.RECRUITER.get(), RecruiterRenderer::new);
		event.registerEntityRenderer(RdModEntities.ESSENCE_BULLET.get(), EssenceBulletRenderer::new);
	}
}