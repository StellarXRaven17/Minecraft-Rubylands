package net.stellarxraven17.rubylands.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.stellarxraven17.rubylands.procedures.SetWhoLoggedInAsProcedure;
import net.stellarxraven17.rubylands.procedures.SetOnlineProcedure;
import net.stellarxraven17.rubylands.procedures.SetHubConnectedProcedure;
import net.stellarxraven17.rubylands.procedures.ReturnDebugModeProcedure;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

@EventBusSubscriber({Dist.CLIENT})
public class ModVersionOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (ReturnDebugModeProcedure.execute()) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.rd.overlay_thingies.label_minecraft_1211_neoforge"), 6, 8, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					SetWhoLoggedInAsProcedure.execute(entity), 6, 24, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					SetOnlineProcedure.execute(), 6, 40, -1, false);
			if (ReturnDebugModeProcedure.execute())
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						SetHubConnectedProcedure.execute(), 6, 56, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.rd.overlay_thingies.label_testtesttest"), w - -83, 104, -1, false);
		}
	}
}