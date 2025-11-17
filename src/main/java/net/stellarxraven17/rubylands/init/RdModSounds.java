/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.stellarxraven17.rubylands.init;

import net.stellarxraven17.rubylands.RdMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class RdModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, RdMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> BLOCK_LILY_INFUSE = REGISTRY.register("block.lily_infuse", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rd", "block.lily_infuse")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_HUB = REGISTRY.register("music.hub", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rd", "music.hub")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_NEBULA = REGISTRY.register("music.nebula", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rd", "music.nebula")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_OBSERVER_AMBIENT = REGISTRY.register("entity.observer.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rd", "entity.observer.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ENTITY_OBSERVER_ATTACK = REGISTRY.register("entity.observer.attack", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rd", "entity.observer.attack")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUSIC_LOW_RIVER = REGISTRY.register("music.low_river", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rd", "music.low_river")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RECORD_ROKKUBITORU_TUNE = REGISTRY.register("record.rokkubitoru_tune", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("rd", "record.rokkubitoru_tune")));
}