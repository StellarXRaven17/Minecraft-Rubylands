package net.stellarxraven17.rubylands.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class SaltBricksSlabBlock extends SlabBlock {
	public SaltBricksSlabBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).sound(SoundType.BASALT).strength(0.6f, 0f));
	}
}