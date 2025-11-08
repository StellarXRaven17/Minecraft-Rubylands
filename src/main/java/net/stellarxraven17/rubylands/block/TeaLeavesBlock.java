package net.stellarxraven17.rubylands.block;

import net.stellarxraven17.rubylands.init.RdModBlocks;

import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class TeaLeavesBlock extends LeavesBlock {
	public TeaLeavesBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRASS).strength(0.2f).noOcclusion().ignitedByLava().isSuffocating((bs, br, bp) -> false).isViewBlocking((bs, br, bp) -> false));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 30;
	}

	@OnlyIn(Dist.CLIENT)
	public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
		event.getBlockColors().register((bs, world, pos, index) -> {
			return FoliageColor.getBirchColor();
		}, RdModBlocks.TEA_LEAVES.get());
	}
}