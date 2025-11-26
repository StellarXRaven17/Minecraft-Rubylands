/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.fauxjang.rubylands.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.fauxjang.rubylands.RdMod;

@EventBusSubscriber
public class RdModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RdMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(RdModItems.OBSERVER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(RdModItems.COPPER_NUGGET.get());
			tabData.accept(RdModBlocks.BLUE_FIRE_IDK.get().asItem());
			tabData.accept(RdModItems.ESSENCE.get());
			tabData.accept(RdModItems.OBSERVER_FUR.get());
			tabData.accept(RdModItems.OBSIDIAN_INGOT.get());
			tabData.accept(RdModItems.PYRITE.get());
			tabData.accept(RdModItems.RAW_BISMUTH.get());
			tabData.accept(RdModItems.BISMUTH_INGOT.get());
			tabData.accept(RdModItems.CLINOHUMITE.get());
			tabData.accept(RdModItems.LACE_AGATE.get());
			tabData.accept(RdModItems.MALACHITE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(RdModBlocks.OAK_PILLAR.get().asItem());
			tabData.accept(RdModBlocks.SPRUCE_PILLAR.get().asItem());
			tabData.accept(RdModBlocks.BIRCH_PILLAR.get().asItem());
			tabData.accept(RdModBlocks.JUNGLE_PILLAR.get().asItem());
			tabData.accept(RdModBlocks.ACACIA_PILLAR.get().asItem());
			tabData.accept(RdModBlocks.DARK_OAK_PILLAR.get().asItem());
			tabData.accept(RdModBlocks.CHERRY_PILLAR.get().asItem());
			tabData.accept(RdModBlocks.BAMBOO_PILLAR.get().asItem());
			tabData.accept(RdModBlocks.CRIMSON_PILLAR.get().asItem());
			tabData.accept(RdModBlocks.WARPED_PILLAR.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_LOG.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_WOOD.get().asItem());
			tabData.accept(RdModBlocks.STRIPPED_FLAMEWOOD_LOG.get().asItem());
			tabData.accept(RdModBlocks.STRIPPED_FLAMEWOOD_WOOD.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_PLANKS.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_STAIRS.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_SLAB.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_FENCE.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_FENCE_GATE.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_DOOR.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_TRAPDOOR.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_BUTTON.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_PILLAR.get().asItem());
			tabData.accept(RdModBlocks.TEA_LOG.get().asItem());
			tabData.accept(RdModBlocks.TEA_WOOD.get().asItem());
			tabData.accept(RdModBlocks.STRIPPED_TEA_LOG.get().asItem());
			tabData.accept(RdModBlocks.STRIPPED_TEA_WOOD.get().asItem());
			tabData.accept(RdModBlocks.TEA_PLANKS.get().asItem());
			tabData.accept(RdModBlocks.TEA_STAIRS.get().asItem());
			tabData.accept(RdModBlocks.TEA_SLAB.get().asItem());
			tabData.accept(RdModBlocks.TEA_FENCE.get().asItem());
			tabData.accept(RdModBlocks.TEA_FENCE_GATE.get().asItem());
			tabData.accept(RdModBlocks.TEA_DOOR.get().asItem());
			tabData.accept(RdModBlocks.TEA_TRAPDOOR.get().asItem());
			tabData.accept(RdModBlocks.TEA_PRESSURE_PLATE.get().asItem());
			tabData.accept(RdModBlocks.TEA_BUTTON.get().asItem());
			tabData.accept(RdModBlocks.HIGHWOOD_LOG.get().asItem());
			tabData.accept(RdModBlocks.HIGHWOOD_WOOD.get().asItem());
			tabData.accept(RdModBlocks.STRIPPED_HIGHWOOD_LOG.get().asItem());
			tabData.accept(RdModBlocks.STRIPPED_HIGHWOOD_WOOD.get().asItem());
			tabData.accept(RdModBlocks.HIGHWOOD_PLANKS.get().asItem());
			tabData.accept(RdModBlocks.HIGHWOOD_STAIRS.get().asItem());
			tabData.accept(RdModBlocks.HIGHWOOD_SLAB.get().asItem());
			tabData.accept(RdModBlocks.HIGHWOOD_FENCE.get().asItem());
			tabData.accept(RdModBlocks.HIGHWOOD_FENCE_GATE.get().asItem());
			tabData.accept(RdModBlocks.HIGHWOOD_DOOR.get().asItem());
			tabData.accept(RdModBlocks.HIGHWOOD_TRAPDOOR.get().asItem());
			tabData.accept(RdModBlocks.HIGHWOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(RdModBlocks.HIGHWOOD_BUTTON.get().asItem());
			tabData.accept(RdModBlocks.HARDENED_CACTUS_STEM.get().asItem());
			tabData.accept(RdModBlocks.HARDENED_CACTUS_ARM.get().asItem());
			tabData.accept(RdModBlocks.CACTUS_PLANKS.get().asItem());
			tabData.accept(RdModBlocks.CACTUS_STAIRS.get().asItem());
			tabData.accept(RdModBlocks.CACTUS_SLAB.get().asItem());
			tabData.accept(RdModBlocks.CACTUS_FENCE.get().asItem());
			tabData.accept(RdModBlocks.CACTUS_FENCE_GATE.get().asItem());
			tabData.accept(RdModBlocks.CACTUS_PRESSURE_PLATE.get().asItem());
			tabData.accept(RdModBlocks.CACTUS_BUTTON.get().asItem());
			tabData.accept(RdModBlocks.MUSHROOM_PLANKS.get().asItem());
			tabData.accept(RdModBlocks.MUSHROOM_STAIRS.get().asItem());
			tabData.accept(RdModBlocks.MUSHROOM_SLAB.get().asItem());
			tabData.accept(RdModBlocks.MUSHROOM_FENCE.get().asItem());
			tabData.accept(RdModBlocks.MUSHROOM_FENCE_GATE.get().asItem());
			tabData.accept(RdModBlocks.MUSHROOM_DOOR.get().asItem());
			tabData.accept(RdModBlocks.MUSHROOM_TRAPDOOR.get().asItem());
			tabData.accept(RdModBlocks.MUSHROOM_PRESSURE_PLATE.get().asItem());
			tabData.accept(RdModBlocks.MUSHROOM_BUTTON.get().asItem());
			tabData.accept(RdModBlocks.PETRIFIED_WOOD.get().asItem());
			tabData.accept(RdModBlocks.SCAFFOLD.get().asItem());
			tabData.accept(RdModBlocks.XRAY_SCAFFOLD.get().asItem());
			tabData.accept(RdModBlocks.STONE_SCAFFOLD.get().asItem());
			tabData.accept(RdModBlocks.WINDOW.get().asItem());
			tabData.accept(RdModBlocks.SALT_BLOCK.get().asItem());
			tabData.accept(RdModBlocks.SALT_BRICKS.get().asItem());
			tabData.accept(RdModBlocks.ESSENCE_CACHE.get().asItem());
			tabData.accept(RdModBlocks.IRON_BRICK.get().asItem());
			tabData.accept(RdModBlocks.GOLD_BRICK.get().asItem());
			tabData.accept(RdModBlocks.DIAMOND_BRICK.get().asItem());
			tabData.accept(RdModBlocks.GREENSTONE_BRICK.get().asItem());
			tabData.accept(RdModBlocks.OBSIDIAN_BRICK.get().asItem());
			tabData.accept(RdModBlocks.BLUE_DIMENSION_TILE.get().asItem());
			tabData.accept(RdModBlocks.YELLOW_DIMENSION_TILE.get().asItem());
			tabData.accept(RdModBlocks.DIMENSION_FLOOR.get().asItem());
			tabData.accept(RdModBlocks.DIMENSION_WALL.get().asItem());
			tabData.accept(RdModBlocks.CYAN_MOJANG_BLOCK.get().asItem());
			tabData.accept(RdModBlocks.WHITE_MOJANG_BLOCK.get().asItem());
			tabData.accept(RdModBlocks.GREEN_MOJANG_BLOCK.get().asItem());
			tabData.accept(RdModBlocks.SALT_BRICK_SLAB.get().asItem());
			tabData.accept(RdModBlocks.SALT_BRICK_STAIRS.get().asItem());
			tabData.accept(RdModBlocks.SALT_BRICK_WALL.get().asItem());
			tabData.accept(RdModBlocks.MYCON_STEM.get().asItem());
			tabData.accept(RdModBlocks.MYCON_HYPHAE.get().asItem());
			tabData.accept(RdModBlocks.STRIPPED_MYCON_STEM.get().asItem());
			tabData.accept(RdModBlocks.STRIPPED_MYCON_HYPHAE.get().asItem());
			tabData.accept(RdModBlocks.MYCON_PLANKS.get().asItem());
			tabData.accept(RdModBlocks.MYCON_STAIRS.get().asItem());
			tabData.accept(RdModBlocks.MYCON_SLAB.get().asItem());
			tabData.accept(RdModBlocks.MYCON_FENCE.get().asItem());
			tabData.accept(RdModBlocks.MYCON_FENCE_GATE.get().asItem());
			tabData.accept(RdModBlocks.MYCON_PRESSURE_PLATE.get().asItem());
			tabData.accept(RdModBlocks.MYCON_BUTTON.get().asItem());
			tabData.accept(RdModBlocks.PYRITE_ORE.get().asItem());
			tabData.accept(RdModBlocks.PYRITE_BLOCK.get().asItem());
			tabData.accept(RdModBlocks.CLINOHUMITE_ORE.get().asItem());
			tabData.accept(RdModBlocks.CLINOHUMITE_BLOCK.get().asItem());
			tabData.accept(RdModBlocks.LACE_AGATE_ORE.get().asItem());
			tabData.accept(RdModBlocks.LACE_AGATE_BLOCK.get().asItem());
			tabData.accept(RdModBlocks.MALACHITE_ORE.get().asItem());
			tabData.accept(RdModBlocks.MALACHITE_BLOCK.get().asItem());
			tabData.accept(RdModBlocks.DEEPSLATE_LACE_AGATE_ORE.get().asItem());
			tabData.accept(RdModBlocks.DEEPSLATE_MALACHITE_ORE.get().asItem());
			tabData.accept(RdModBlocks.LOW_LACE_AGATE_ORE.get().asItem());
			tabData.accept(RdModBlocks.LOW_MALACHITE_ORE.get().asItem());
			tabData.accept(RdModBlocks.DEEPSLATE_PYRITE_ORE.get().asItem());
			tabData.accept(RdModBlocks.LOW_PYRITE_ORE.get().asItem());
			tabData.accept(RdModBlocks.DEEPSLATE_CLINOHUMITE_ORE.get().asItem());
			tabData.accept(RdModBlocks.LOW_CLINOHUMITE_ORE.get().asItem());
			tabData.accept(RdModBlocks.TEA_PILLAR.get().asItem());
			tabData.accept(RdModBlocks.BISMUTH_ORE.get().asItem());
			tabData.accept(RdModBlocks.BISMUTH_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(RdModBlocks.WATER_LILY.get().asItem());
			tabData.accept(RdModBlocks.LOW_LILY.get().asItem());
			tabData.accept(RdModBlocks.FLAME_INFUSED_LILY.get().asItem());
			tabData.accept(RdModBlocks.GOLD_INFUSED_LILY.get().asItem());
			tabData.accept(RdModBlocks.OBSIDIAN_INFUSED_LILY.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_SAPLING.get().asItem());
			tabData.accept(RdModBlocks.FLAMEWOOD_LEAVES.get().asItem());
			tabData.accept(RdModBlocks.TEA_SAPLING.get().asItem());
			tabData.accept(RdModBlocks.TEA_LEAVES.get().asItem());
			tabData.accept(RdModBlocks.HIGHWOOD_LEAVES.get().asItem());
			tabData.accept(RdModBlocks.MYCON_CAP.get().asItem());
			tabData.accept(RdModBlocks.SALT_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(RdModItems.CACTUS_SWORD.get());
			tabData.accept(RdModItems.COPPER_SWORD.get());
			tabData.accept(RdModItems.OBSIDIAN_SWORD.get());
			tabData.accept(RdModItems.COPPER_HELMET.get());
			tabData.accept(RdModItems.COPPER_CHESTPLATE.get());
			tabData.accept(RdModItems.COPPER_LEGGINGS.get());
			tabData.accept(RdModItems.COPPER_BOOTS.get());
			tabData.accept(RdModItems.OBSIDIAN_HELMET.get());
			tabData.accept(RdModItems.OBSIDIAN_CHESTPLATE.get());
			tabData.accept(RdModItems.OBSIDIAN_LEGGINGS.get());
			tabData.accept(RdModItems.OBSIDIAN_BOOTS.get());
			tabData.accept(RdModItems.ESSENCE_RIFLE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(RdModItems.COPPER_AXE.get());
			tabData.accept(RdModItems.COPPER_PICKAXE.get());
			tabData.accept(RdModItems.COPPER_SHOVEL.get());
			tabData.accept(RdModItems.COPPER_HOE.get());
			tabData.accept(RdModItems.OBSIDIAN_PICKAXE.get());
			tabData.accept(RdModItems.OBSIDIAN_AXE.get());
			tabData.accept(RdModItems.OBSIDIAN_SHOVEL.get());
			tabData.accept(RdModItems.OBSIDIAN_HOE.get());
		}
	}
}