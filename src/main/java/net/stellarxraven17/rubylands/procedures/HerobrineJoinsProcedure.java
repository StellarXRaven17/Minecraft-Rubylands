package net.stellarxraven17.rubylands.procedures;

import net.stellarxraven17.rubylands.network.RdModVariables;
import net.stellarxraven17.rubylands.RdMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class HerobrineJoinsProcedure {
	public static void execute(LevelAccessor world) {
		RdModVariables.WorldVariables.get(world).herobrineJoinMessageSent = false;
		RdModVariables.WorldVariables.get(world).markSyncDirty();
		if (RdModVariables.MapVariables.get(world).herobrineJoined == true && RdModVariables.WorldVariables.get(world).herobrineJoinMessageSent == false) {
			RdMod.queueServerWork(Mth.nextInt(RandomSource.create(), 40, 120), () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands()
							.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((world.getLevelData().getSpawnPos().getX()), (world.getLevelData().getSpawnPos().getY()), (world.getLevelData().getSpawnPos().getZ())), Vec2.ZERO,
									_level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "/tellraw @a {\"text\":\"Herobrine joined the game.\",\"color\":\"yellow\"}");
				RdModVariables.WorldVariables.get(world).herobrineJoinMessageSent = true;
				RdModVariables.WorldVariables.get(world).markSyncDirty();
				RdMod.queueServerWork(130, () -> {
					RdModVariables.WorldVariables.get(world).herobrineJoinMessageSent = false;
					RdModVariables.WorldVariables.get(world).markSyncDirty();
				});
			});
		}
	}
}