/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.fauxjang.rubylands.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import com.fauxjang.rubylands.client.gui.EssenceTransformerUIScreen;

@EventBusSubscriber(Dist.CLIENT)
public class RdModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(RdModMenus.ESSENCE_TRANSFORMER_UI.get(), EssenceTransformerUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}