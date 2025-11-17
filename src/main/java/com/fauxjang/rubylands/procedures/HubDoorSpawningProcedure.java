package com.fauxjang.rubylands.procedures;

import com.fauxjang.rubylands.network.RdModVariables;

public class HubDoorSpawningProcedure {
	public static boolean execute() {
		return RdModVariables.isHubConnected == true;
	}
}