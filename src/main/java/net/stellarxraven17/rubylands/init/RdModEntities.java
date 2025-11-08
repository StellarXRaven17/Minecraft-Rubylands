/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.stellarxraven17.rubylands.init;

import net.stellarxraven17.rubylands.entity.RecruiterEntity;
import net.stellarxraven17.rubylands.entity.ObserverEntity;
import net.stellarxraven17.rubylands.entity.EssenceBulletEntity;
import net.stellarxraven17.rubylands.RdMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class RdModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, RdMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<ObserverEntity>> OBSERVER = register("observer",
			EntityType.Builder.<ObserverEntity>of(ObserverEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<RecruiterEntity>> RECRUITER = register("recruiter",
			EntityType.Builder.<RecruiterEntity>of(RecruiterEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EssenceBulletEntity>> ESSENCE_BULLET = register("essence_bullet",
			EntityType.Builder.<EssenceBulletEntity>of(EssenceBulletEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		ObserverEntity.init(event);
		RecruiterEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(OBSERVER.get(), ObserverEntity.createAttributes().build());
		event.put(RECRUITER.get(), RecruiterEntity.createAttributes().build());
	}
}