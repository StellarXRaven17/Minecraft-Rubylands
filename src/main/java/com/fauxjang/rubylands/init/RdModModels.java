/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.fauxjang.rubylands.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.fauxjang.rubylands.client.model.Modelobserver;
import com.fauxjang.rubylands.client.model.Modelarrow;

@EventBusSubscriber(Dist.CLIENT)
public class RdModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelarrow.LAYER_LOCATION, Modelarrow::createBodyLayer);
		event.registerLayerDefinition(Modelobserver.LAYER_LOCATION, Modelobserver::createBodyLayer);
	}
}