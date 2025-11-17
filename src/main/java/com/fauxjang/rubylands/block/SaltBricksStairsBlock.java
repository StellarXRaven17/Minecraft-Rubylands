package com.fauxjang.rubylands.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class SaltBricksStairsBlock extends StairBlock {
	public SaltBricksStairsBlock() {
		super(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).sound(SoundType.BASALT).strength(0.6f, 0f));
	}

	@Override
	public float getExplosionResistance() {
		return 0f;
	}
}