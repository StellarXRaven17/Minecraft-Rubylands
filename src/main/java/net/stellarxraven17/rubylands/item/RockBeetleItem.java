package net.stellarxraven17.rubylands.item;

import net.stellarxraven17.rubylands.RdMod;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class RockBeetleItem extends Item {
	public RockBeetleItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(RdMod.MODID, "rock_beetle"))));
	}
}