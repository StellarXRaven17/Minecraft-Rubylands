package net.stellarxraven17.rubylands.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

public class HarmMobWithFlameLilyProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Monster) {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.CAMPFIRE)), 4);
		}
	}
}