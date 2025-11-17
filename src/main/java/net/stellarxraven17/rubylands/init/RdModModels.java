/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.stellarxraven17.rubylands.init;

import net.stellarxraven17.rubylands.client.model.Modelobserver;
import net.stellarxraven17.rubylands.client.model.Modelarrow;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class RdModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelarrow.LAYER_LOCATION, Modelarrow::createBodyLayer);
		event.registerLayerDefinition(Modelobserver.LAYER_LOCATION, Modelobserver::createBodyLayer);
	}
}