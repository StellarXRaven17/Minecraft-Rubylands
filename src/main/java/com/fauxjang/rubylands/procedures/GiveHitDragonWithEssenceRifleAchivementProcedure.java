package com.fauxjang.rubylands.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import javax.annotation.Nullable;

import com.fauxjang.rubylands.entity.EssenceBulletEntity;

@EventBusSubscriber
public class GiveHitDragonWithEssenceRifleAchivementProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getSource(), event.getSource().getDirectEntity());
		}
	}

	public static void execute(DamageSource damagesource, Entity immediatesourceentity) {
		execute(null, damagesource, immediatesourceentity);
	}

	private static void execute(@Nullable Event event, DamageSource damagesource, Entity immediatesourceentity) {
		if (damagesource == null || immediatesourceentity == null)
			return;
		if ((damagesource.getEntity()) instanceof EssenceBulletEntity) {
			if (immediatesourceentity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("rd:shoot_dragon_with_essence_rifle"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
	}
}