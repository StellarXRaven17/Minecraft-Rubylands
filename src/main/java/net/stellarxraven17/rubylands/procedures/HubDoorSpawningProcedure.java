package net.stellarxraven17.rubylands.procedures;

import net.stellarxraven17.rubylands.network.RdModVariables;

public class HubDoorSpawningProcedure {
	public static boolean execute() {
		return RdModVariables.isHubConnected == true;
	}
}