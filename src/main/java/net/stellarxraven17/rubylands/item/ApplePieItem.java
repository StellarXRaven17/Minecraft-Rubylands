package net.stellarxraven17.rubylands.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ApplePieItem extends Item {
	public ApplePieItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.3f).build()));
	}
}