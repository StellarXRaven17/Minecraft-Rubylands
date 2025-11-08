package net.stellarxraven17.rubylands.procedures;

import net.stellarxraven17.rubylands.init.RdModItems;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PeelingEnchantmentProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != InteractionHand.MAIN_HAND)
			return;
		execute(event, event.getLevel(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("rd:peeling")))) >= 1) {
			if (entity instanceof Villager || entity instanceof Player) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 3);
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(RdModItems.RAW_FLESH.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof Zombie || entity instanceof ZombieVillager) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 3);
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.ROTTEN_FLESH).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (entity instanceof Skeleton) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 3);
				if (sourceentity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.BONE_MEAL).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}