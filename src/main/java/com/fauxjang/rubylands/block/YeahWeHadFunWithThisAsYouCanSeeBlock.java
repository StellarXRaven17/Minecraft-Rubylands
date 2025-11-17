package com.fauxjang.rubylands.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class YeahWeHadFunWithThisAsYouCanSeeBlock extends Block {
	public YeahWeHadFunWithThisAsYouCanSeeBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).strength(2f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}