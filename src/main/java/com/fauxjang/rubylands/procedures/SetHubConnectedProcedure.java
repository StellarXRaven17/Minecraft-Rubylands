package com.fauxjang.rubylands.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import javax.annotation.Nullable;

import com.fauxjang.rubylands.network.RdModVariables;

@EventBusSubscriber
public class SetHubConnectedProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event);
	}

	public static String execute() {
		return execute(null);
	}

	private static String execute(@Nullable Event event) {
		return "Hub Connected: " + ("" + RdModVariables.isHubConnected).toUpperCase();
	}
}