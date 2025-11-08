/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.stellarxraven17.rubylands.init;

import net.stellarxraven17.rubylands.item.RockBeetleItem;
import net.stellarxraven17.rubylands.item.PyriteItem;
import net.stellarxraven17.rubylands.item.ObsidianSwordItem;
import net.stellarxraven17.rubylands.item.ObsidianShovelItem;
import net.stellarxraven17.rubylands.item.ObsidianPickaxeItem;
import net.stellarxraven17.rubylands.item.ObsidianItem;
import net.stellarxraven17.rubylands.item.ObsidianIngotItem;
import net.stellarxraven17.rubylands.item.ObsidianHoeItem;
import net.stellarxraven17.rubylands.item.ObsidianAxeItem;
import net.stellarxraven17.rubylands.item.ObserverFurItem;
import net.stellarxraven17.rubylands.item.MalachiteItem;
import net.stellarxraven17.rubylands.item.LaceAgateItem;
import net.stellarxraven17.rubylands.item.FryshroomItem;
import net.stellarxraven17.rubylands.item.FleshItem;
import net.stellarxraven17.rubylands.item.EssenceRifleItem;
import net.stellarxraven17.rubylands.item.EssenceItem;
import net.stellarxraven17.rubylands.item.CopperSwordItem;
import net.stellarxraven17.rubylands.item.CopperShovelItem;
import net.stellarxraven17.rubylands.item.CopperPickaxeItem;
import net.stellarxraven17.rubylands.item.CopperNuggetItem;
import net.stellarxraven17.rubylands.item.CopperItem;
import net.stellarxraven17.rubylands.item.CopperHoeItem;
import net.stellarxraven17.rubylands.item.CopperAxeItem;
import net.stellarxraven17.rubylands.item.CookedFleshItem;
import net.stellarxraven17.rubylands.item.ClinohumiteItem;
import net.stellarxraven17.rubylands.item.CactusSwordItem;
import net.stellarxraven17.rubylands.item.ApplePieItem;
import net.stellarxraven17.rubylands.RdMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

public class RdModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RdMod.MODID);
	public static final DeferredItem<Item> ESSENCE = REGISTRY.register("essence", EssenceItem::new);
	public static final DeferredItem<Item> OAK_PILLAR = block(RdModBlocks.OAK_PILLAR);
	public static final DeferredItem<Item> ESSENCE_CACHE = block(RdModBlocks.ESSENCE_CACHE);
	public static final DeferredItem<Item> OBSIDIAN_INGOT = REGISTRY.register("obsidian_ingot", ObsidianIngotItem::new);
	public static final DeferredItem<Item> OBSERVER_FUR = REGISTRY.register("observer_fur", ObserverFurItem::new);
	public static final DeferredItem<Item> WINDOW = block(RdModBlocks.WINDOW);
	public static final DeferredItem<Item> IRON_BRICK = block(RdModBlocks.IRON_BRICK);
	public static final DeferredItem<Item> GOLD_BRICK = block(RdModBlocks.GOLD_BRICK);
	public static final DeferredItem<Item> DIAMOND_BRICK = block(RdModBlocks.DIAMOND_BRICK);
	public static final DeferredItem<Item> OBSIDIAN_BRICK = block(RdModBlocks.OBSIDIAN_BRICK);
	public static final DeferredItem<Item> STONE_SCAFFOLD = block(RdModBlocks.STONE_SCAFFOLD);
	public static final DeferredItem<Item> XRAY_SCAFFOLD = block(RdModBlocks.XRAY_SCAFFOLD);
	public static final DeferredItem<Item> SCAFFOLD = block(RdModBlocks.SCAFFOLD);
	public static final DeferredItem<Item> BLUE_DIMENSION_TILE = block(RdModBlocks.BLUE_DIMENSION_TILE);
	public static final DeferredItem<Item> YELLOW_DIMENSION_TILE = block(RdModBlocks.YELLOW_DIMENSION_TILE);
	public static final DeferredItem<Item> DIMENSION_FLOOR = block(RdModBlocks.DIMENSION_FLOOR);
	public static final DeferredItem<Item> BLUE_FIRE_IDK = block(RdModBlocks.BLUE_FIRE_IDK);
	public static final DeferredItem<Item> FLAME_INFUSED_LILY = block(RdModBlocks.FLAME_INFUSED_LILY);
	public static final DeferredItem<Item> GOLD_INFUSED_LILY = block(RdModBlocks.GOLD_INFUSED_LILY);
	public static final DeferredItem<Item> OBSIDIAN_INFUSED_LILY = block(RdModBlocks.OBSIDIAN_INFUSED_LILY);
	public static final DeferredItem<Item> SALT_BLOCK = block(RdModBlocks.SALT_BLOCK);
	public static final DeferredItem<Item> DIMENSION_WALL = block(RdModBlocks.DIMENSION_WALL);
	public static final DeferredItem<Item> OBSERVER_SPAWN_EGG = REGISTRY.register("observer_spawn_egg", () -> new DeferredSpawnEggItem(RdModEntities.OBSERVER, -8816263, -2041654, new Item.Properties()));
	public static final DeferredItem<Item> CYAN_MOJANG_BLOCK = block(RdModBlocks.CYAN_MOJANG_BLOCK);
	public static final DeferredItem<Item> WHITE_MOJANG_BLOCK = block(RdModBlocks.WHITE_MOJANG_BLOCK);
	public static final DeferredItem<Item> GREEN_MOJANG_BLOCK = block(RdModBlocks.GREEN_MOJANG_BLOCK);
	public static final DeferredItem<Item> FLAMEWOOD_WOOD = block(RdModBlocks.FLAMEWOOD_WOOD, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> FLAMEWOOD_LOG = block(RdModBlocks.FLAMEWOOD_LOG, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> FLAMEWOOD_PLANKS = block(RdModBlocks.FLAMEWOOD_PLANKS, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> FLAMEWOOD_LEAVES = block(RdModBlocks.FLAMEWOOD_LEAVES, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> FLAMEWOOD_STAIRS = block(RdModBlocks.FLAMEWOOD_STAIRS, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> FLAMEWOOD_SLAB = block(RdModBlocks.FLAMEWOOD_SLAB, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> FLAMEWOOD_FENCE = block(RdModBlocks.FLAMEWOOD_FENCE, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> FLAMEWOOD_FENCE_GATE = block(RdModBlocks.FLAMEWOOD_FENCE_GATE, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> FLAMEWOOD_PRESSURE_PLATE = block(RdModBlocks.FLAMEWOOD_PRESSURE_PLATE, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> FLAMEWOOD_BUTTON = block(RdModBlocks.FLAMEWOOD_BUTTON, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> STRIPPED_FLAMEWOOD_LOG = block(RdModBlocks.STRIPPED_FLAMEWOOD_LOG, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> STRIPPED_FLAMEWOOD_WOOD = block(RdModBlocks.STRIPPED_FLAMEWOOD_WOOD, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> OBSIDIAN_HELMET = REGISTRY.register("obsidian_helmet", ObsidianItem.Helmet::new);
	public static final DeferredItem<Item> OBSIDIAN_CHESTPLATE = REGISTRY.register("obsidian_chestplate", ObsidianItem.Chestplate::new);
	public static final DeferredItem<Item> OBSIDIAN_LEGGINGS = REGISTRY.register("obsidian_leggings", ObsidianItem.Leggings::new);
	public static final DeferredItem<Item> OBSIDIAN_BOOTS = REGISTRY.register("obsidian_boots", ObsidianItem.Boots::new);
	public static final DeferredItem<Item> FLAMEWOOD_SAPLING = block(RdModBlocks.FLAMEWOOD_SAPLING, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> HUB_DOOR = doubleBlock(RdModBlocks.HUB_DOOR, new Item.Properties().rarity(Rarity.UNCOMMON));
	public static final DeferredItem<Item> FLAMEWOOD_DOOR = doubleBlock(RdModBlocks.FLAMEWOOD_DOOR, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> FLAMEWOOD_TRAPDOOR = block(RdModBlocks.FLAMEWOOD_TRAPDOOR, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> STONE_PATH = block(RdModBlocks.STONE_PATH);
	public static final DeferredItem<Item> SALT_BRICKS = block(RdModBlocks.SALT_BRICKS);
	public static final DeferredItem<Item> SALT_BRICK_SLAB = block(RdModBlocks.SALT_BRICK_SLAB);
	public static final DeferredItem<Item> SALT_BRICK_STAIRS = block(RdModBlocks.SALT_BRICK_STAIRS);
	public static final DeferredItem<Item> SALT_BRICK_WALL = block(RdModBlocks.SALT_BRICK_WALL);
	public static final DeferredItem<Item> ROCK_BEETLE = REGISTRY.register("rock_beetle", RockBeetleItem::new);
	public static final DeferredItem<Item> OBSIDIAN_SWORD = REGISTRY.register("obsidian_sword", ObsidianSwordItem::new);
	public static final DeferredItem<Item> OBSIDIAN_PICKAXE = REGISTRY.register("obsidian_pickaxe", ObsidianPickaxeItem::new);
	public static final DeferredItem<Item> OBSIDIAN_AXE = REGISTRY.register("obsidian_axe", ObsidianAxeItem::new);
	public static final DeferredItem<Item> OBSIDIAN_SHOVEL = REGISTRY.register("obsidian_shovel", ObsidianShovelItem::new);
	public static final DeferredItem<Item> OBSIDIAN_HOE = REGISTRY.register("obsidian_hoe", ObsidianHoeItem::new);
	public static final DeferredItem<Item> ESSENCE_RIFLE = REGISTRY.register("essence_rifle", EssenceRifleItem::new);
	public static final DeferredItem<Item> TEA_WOOD = block(RdModBlocks.TEA_WOOD);
	public static final DeferredItem<Item> TEA_LOG = block(RdModBlocks.TEA_LOG);
	public static final DeferredItem<Item> TEA_PLANKS = block(RdModBlocks.TEA_PLANKS);
	public static final DeferredItem<Item> TEA_LEAVES = block(RdModBlocks.TEA_LEAVES);
	public static final DeferredItem<Item> TEA_STAIRS = block(RdModBlocks.TEA_STAIRS);
	public static final DeferredItem<Item> TEA_SLAB = block(RdModBlocks.TEA_SLAB);
	public static final DeferredItem<Item> TEA_FENCE = block(RdModBlocks.TEA_FENCE);
	public static final DeferredItem<Item> TEA_FENCE_GATE = block(RdModBlocks.TEA_FENCE_GATE);
	public static final DeferredItem<Item> TEA_PRESSURE_PLATE = block(RdModBlocks.TEA_PRESSURE_PLATE);
	public static final DeferredItem<Item> TEA_BUTTON = block(RdModBlocks.TEA_BUTTON);
	public static final DeferredItem<Item> TEA_DOOR = doubleBlock(RdModBlocks.TEA_DOOR);
	public static final DeferredItem<Item> TEA_TRAPDOOR = block(RdModBlocks.TEA_TRAPDOOR);
	public static final DeferredItem<Item> STRIPPED_TEA_WOOD = block(RdModBlocks.STRIPPED_TEA_WOOD);
	public static final DeferredItem<Item> STRIPPED_TEA_LOG = block(RdModBlocks.STRIPPED_TEA_LOG);
	public static final DeferredItem<Item> TEA_SAPLING = block(RdModBlocks.TEA_SAPLING);
	public static final DeferredItem<Item> LOW_STONE = block(RdModBlocks.LOW_STONE);
	public static final DeferredItem<Item> COBBLED_LOW_STONE = block(RdModBlocks.COBBLED_LOW_STONE);
	public static final DeferredItem<Item> ELDERSTONE_COAL_ORE = block(RdModBlocks.ELDERSTONE_COAL_ORE);
	public static final DeferredItem<Item> LOW_STONE_IRON_ORE = block(RdModBlocks.LOW_STONE_IRON_ORE);
	public static final DeferredItem<Item> LOW_STONE_GOLD_ORE = block(RdModBlocks.LOW_STONE_GOLD_ORE);
	public static final DeferredItem<Item> LOW_STONE_DIAMOND_ORE = block(RdModBlocks.LOW_STONE_DIAMOND_ORE);
	public static final DeferredItem<Item> MYCON_HYPHAE = block(RdModBlocks.MYCON_HYPHAE);
	public static final DeferredItem<Item> MYCON_STEM = block(RdModBlocks.MYCON_STEM);
	public static final DeferredItem<Item> MYCON_PLANKS = block(RdModBlocks.MYCON_PLANKS);
	public static final DeferredItem<Item> MYCON_CAP = block(RdModBlocks.MYCON_CAP);
	public static final DeferredItem<Item> MYCON_STAIRS = block(RdModBlocks.MYCON_STAIRS);
	public static final DeferredItem<Item> MYCON_SLAB = block(RdModBlocks.MYCON_SLAB);
	public static final DeferredItem<Item> MYCON_FENCE = block(RdModBlocks.MYCON_FENCE);
	public static final DeferredItem<Item> MYCON_FENCE_GATE = block(RdModBlocks.MYCON_FENCE_GATE);
	public static final DeferredItem<Item> MYCON_PRESSURE_PLATE = block(RdModBlocks.MYCON_PRESSURE_PLATE);
	public static final DeferredItem<Item> MYCON_BUTTON = block(RdModBlocks.MYCON_BUTTON);
	public static final DeferredItem<Item> POLISHED_LOW_STONE = block(RdModBlocks.POLISHED_LOW_STONE);
	public static final DeferredItem<Item> LOW_STONE_BRICKS = block(RdModBlocks.LOW_STONE_BRICKS);
	public static final DeferredItem<Item> CRACKED_LOW_STONE_BRICKS = block(RdModBlocks.CRACKED_LOW_STONE_BRICKS);
	public static final DeferredItem<Item> PYRITE = REGISTRY.register("pyrite", PyriteItem::new);
	public static final DeferredItem<Item> PYRITE_ORE = block(RdModBlocks.PYRITE_ORE);
	public static final DeferredItem<Item> PYRITE_BLOCK = block(RdModBlocks.PYRITE_BLOCK);
	public static final DeferredItem<Item> CLINOHUMITE = REGISTRY.register("clinohumite", ClinohumiteItem::new);
	public static final DeferredItem<Item> CLINOHUMITE_ORE = block(RdModBlocks.CLINOHUMITE_ORE);
	public static final DeferredItem<Item> CLINOHUMITE_BLOCK = block(RdModBlocks.CLINOHUMITE_BLOCK);
	public static final DeferredItem<Item> LACE_AGATE = REGISTRY.register("lace_agate", LaceAgateItem::new);
	public static final DeferredItem<Item> LACE_AGATE_ORE = block(RdModBlocks.LACE_AGATE_ORE);
	public static final DeferredItem<Item> LACE_AGATE_BLOCK = block(RdModBlocks.LACE_AGATE_BLOCK);
	public static final DeferredItem<Item> MALACHITE = REGISTRY.register("malachite", MalachiteItem::new);
	public static final DeferredItem<Item> MALACHITE_ORE = block(RdModBlocks.MALACHITE_ORE);
	public static final DeferredItem<Item> MALACHITE_BLOCK = block(RdModBlocks.MALACHITE_BLOCK);
	public static final DeferredItem<Item> LOW_MYCELIUM = block(RdModBlocks.LOW_MYCELIUM);
	public static final DeferredItem<Item> DEEPSLATE_LACE_AGATE_ORE = block(RdModBlocks.DEEPSLATE_LACE_AGATE_ORE);
	public static final DeferredItem<Item> LOW_LACE_AGATE_ORE = block(RdModBlocks.LOW_LACE_AGATE_ORE);
	public static final DeferredItem<Item> DEEPSLATE_MALACHITE_ORE = block(RdModBlocks.DEEPSLATE_MALACHITE_ORE);
	public static final DeferredItem<Item> LOW_MALACHITE_ORE = block(RdModBlocks.LOW_MALACHITE_ORE);
	public static final DeferredItem<Item> DEEPSLATE_PYRITE_ORE = block(RdModBlocks.DEEPSLATE_PYRITE_ORE);
	public static final DeferredItem<Item> LOW_PYRITE_ORE = block(RdModBlocks.LOW_PYRITE_ORE);
	public static final DeferredItem<Item> DEEPSLATE_CLINOHUMITE_ORE = block(RdModBlocks.DEEPSLATE_CLINOHUMITE_ORE);
	public static final DeferredItem<Item> LOW_CLINOHUMITE_ORE = block(RdModBlocks.LOW_CLINOHUMITE_ORE);
	public static final DeferredItem<Item> PETRIFIED_WOOD = block(RdModBlocks.PETRIFIED_WOOD);
	public static final DeferredItem<Item> ESSENCE_TRANSFORMER = block(RdModBlocks.ESSENCE_TRANSFORMER);
	public static final DeferredItem<Item> SPRUCE_PILLAR = block(RdModBlocks.SPRUCE_PILLAR);
	public static final DeferredItem<Item> BIRCH_PILLAR = block(RdModBlocks.BIRCH_PILLAR);
	public static final DeferredItem<Item> JUNGLE_PILLAR = block(RdModBlocks.JUNGLE_PILLAR);
	public static final DeferredItem<Item> ACACIA_PILLAR = block(RdModBlocks.ACACIA_PILLAR);
	public static final DeferredItem<Item> DARK_OAK_PILLAR = block(RdModBlocks.DARK_OAK_PILLAR);
	public static final DeferredItem<Item> CRIMSON_PILLAR = block(RdModBlocks.CRIMSON_PILLAR);
	public static final DeferredItem<Item> WARPED_PILLAR = block(RdModBlocks.WARPED_PILLAR);
	public static final DeferredItem<Item> FLAMEWOOD_PILLAR = block(RdModBlocks.FLAMEWOOD_PILLAR, new Item.Properties().fireResistant());
	public static final DeferredItem<Item> CACTUS_SWORD = REGISTRY.register("cactus_sword", CactusSwordItem::new);
	public static final DeferredItem<Item> CACTUS_PLANKS = block(RdModBlocks.CACTUS_PLANKS);
	public static final DeferredItem<Item> CACTUS_STAIRS = block(RdModBlocks.CACTUS_STAIRS);
	public static final DeferredItem<Item> CACTUS_SLAB = block(RdModBlocks.CACTUS_SLAB);
	public static final DeferredItem<Item> CACTUS_FENCE = block(RdModBlocks.CACTUS_FENCE);
	public static final DeferredItem<Item> CACTUS_FENCE_GATE = block(RdModBlocks.CACTUS_FENCE_GATE);
	public static final DeferredItem<Item> CACTUS_PRESSURE_PLATE = block(RdModBlocks.CACTUS_PRESSURE_PLATE);
	public static final DeferredItem<Item> CACTUS_BUTTON = block(RdModBlocks.CACTUS_BUTTON);
	public static final DeferredItem<Item> HARDENED_CACTUS_STEM = block(RdModBlocks.HARDENED_CACTUS_STEM);
	public static final DeferredItem<Item> HARDENED_CACTUS_ARM = block(RdModBlocks.HARDENED_CACTUS_ARM);
	public static final DeferredItem<Item> COPPER_NUGGET = REGISTRY.register("copper_nugget", CopperNuggetItem::new);
	public static final DeferredItem<Item> COPPER_SWORD = REGISTRY.register("copper_sword", CopperSwordItem::new);
	public static final DeferredItem<Item> COPPER_AXE = REGISTRY.register("copper_axe", CopperAxeItem::new);
	public static final DeferredItem<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", CopperPickaxeItem::new);
	public static final DeferredItem<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", CopperShovelItem::new);
	public static final DeferredItem<Item> COPPER_HOE = REGISTRY.register("copper_hoe", CopperHoeItem::new);
	public static final DeferredItem<Item> LOW_LILY = block(RdModBlocks.LOW_LILY);
	public static final DeferredItem<Item> GREENSTONE_BRICK = block(RdModBlocks.GREENSTONE_BRICK);
	public static final DeferredItem<Item> CHERRY_PILLAR = block(RdModBlocks.CHERRY_PILLAR);
	public static final DeferredItem<Item> WATER_LILY = block(RdModBlocks.WATER_LILY);
	public static final DeferredItem<Item> COPPER_HELMET = REGISTRY.register("copper_helmet", CopperItem.Helmet::new);
	public static final DeferredItem<Item> COPPER_CHESTPLATE = REGISTRY.register("copper_chestplate", CopperItem.Chestplate::new);
	public static final DeferredItem<Item> COPPER_LEGGINGS = REGISTRY.register("copper_leggings", CopperItem.Leggings::new);
	public static final DeferredItem<Item> COPPER_BOOTS = REGISTRY.register("copper_boots", CopperItem.Boots::new);
	public static final DeferredItem<Item> FRYSHROOM = REGISTRY.register("fryshroom", FryshroomItem::new);
	public static final DeferredItem<Item> DEBUG = block(RdModBlocks.DEBUG);
	public static final DeferredItem<Item> APPLE_PIE = REGISTRY.register("apple_pie", ApplePieItem::new);
	public static final DeferredItem<Item> BAMBOO_PILLAR = block(RdModBlocks.BAMBOO_PILLAR);
	public static final DeferredItem<Item> ICE_DOOR = doubleBlock(RdModBlocks.ICE_DOOR);
	public static final DeferredItem<Item> FREEZER = block(RdModBlocks.FREEZER);
	public static final DeferredItem<Item> RAW_FLESH = REGISTRY.register("raw_flesh", FleshItem::new);
	public static final DeferredItem<Item> COOKED_FLESH = REGISTRY.register("cooked_flesh", CookedFleshItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), properties));
	}
}