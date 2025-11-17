package net.stellarxraven17.rubylands.procedures;

import net.stellarxraven17.rubylands.network.RdModVariables;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@EventBusSubscriber
public class HerobrineSpawnsProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FIRE && (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.NETHERRACK
				&& (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == Blocks.MOSSY_COBBLESTONE && (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.REDSTONE_TORCH
				&& (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.REDSTONE_TORCH && (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.REDSTONE_TORCH
				&& (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.REDSTONE_TORCH && (world.getBlockState(BlockPos.containing(x - 1, y - 2, z))).getBlock() == Blocks.GOLD_BLOCK
				&& (world.getBlockState(BlockPos.containing(x + 1, y - 2, z))).getBlock() == Blocks.GOLD_BLOCK && (world.getBlockState(BlockPos.containing(x, y - 2, z - 1))).getBlock() == Blocks.GOLD_BLOCK
				&& (world.getBlockState(BlockPos.containing(x, y - 2, z + 1))).getBlock() == Blocks.GOLD_BLOCK && (world.getBlockState(BlockPos.containing(x + 1, y - 2, z + 1))).getBlock() == Blocks.GOLD_BLOCK
				&& (world.getBlockState(BlockPos.containing(x - 1, y - 2, z + 1))).getBlock() == Blocks.GOLD_BLOCK && (world.getBlockState(BlockPos.containing(x + 1, y - 2, z - 1))).getBlock() == Blocks.GOLD_BLOCK
				&& (world.getBlockState(BlockPos.containing(x - 1, y - 2, z - 1))).getBlock() == Blocks.GOLD_BLOCK && RdModVariables.MapVariables.get(world).nebulaHappening == false) {
			RdModVariables.MapVariables.get(world).herobrineJoined = true;
			RdModVariables.MapVariables.get(world).markSyncDirty();
			HerobrineJoinsProcedure.execute(world);
		}
	}
}