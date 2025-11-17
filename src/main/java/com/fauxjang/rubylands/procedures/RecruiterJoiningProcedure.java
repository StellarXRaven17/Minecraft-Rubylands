package com.fauxjang.rubylands.procedures;

import com.fauxjang.rubylands.network.RdModVariables;

public class RecruiterJoiningProcedure {
	public static boolean execute() {
		return RdModVariables.isOnline == true;
	}
}