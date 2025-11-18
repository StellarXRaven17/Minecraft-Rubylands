package com.fauxjang.rubylands.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import com.fauxjang.rubylands.network.RdModVariables;

public class HerobrineSpawnsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
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