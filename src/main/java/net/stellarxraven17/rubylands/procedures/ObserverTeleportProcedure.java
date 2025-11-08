package net.stellarxraven17.rubylands.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

public class ObserverTeleportProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		boolean restart = false;
		double Xcord = 0;
		double triestillfailure = 0;
		double Ycord = 0;
		double Zcord = 0;
		triestillfailure = 100;
		found = false;
		while (!(triestillfailure <= 0) || !found) {
			if (triestillfailure <= 0) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("could not find spot to teleport to"), true);
				break;
			} else {
				triestillfailure = triestillfailure - 1;
			}
			restart = false;
			Xcord = x + Mth.nextInt(RandomSource.create(), -32, 32);
			Ycord = y + Mth.nextInt(RandomSource.create(), -32, 32);
			Zcord = z + Mth.nextInt(RandomSource.create(), -32, 32);
			if (Ycord <= -16) {
				Ycord = -15;
			} else if (Ycord >= 8) {
				Ycord = 7;
			}
			while (!((world.getBlockState(BlockPos.containing(Xcord, Ycord, Zcord))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(Xcord, Ycord + 1, Zcord))).getBlock() == Blocks.AIR)) {
				if (Ycord == 318 || Ycord == y + 33) {
					restart = true;
					break;
				} else {
					Ycord = Ycord + 1;
				}
			}
			if (restart) {
				continue;
			}
			while ((world.getBlockState(BlockPos.containing(Xcord, Ycord - 1, Zcord))).getBlock() == Blocks.AIR) {
				if (Ycord == -64 || Ycord == y - 33) {
					restart = true;
					break;
				} else {
					Ycord = Ycord - 1;
				}
			}
			if (restart) {
				continue;
			}
			{
				Entity _ent = entity;
				_ent.teleportTo(Xcord, Ycord, Zcord);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(Xcord, Ycord, Zcord, _ent.getYRot(), _ent.getXRot());
			}
			found = true;
		}
	}
}