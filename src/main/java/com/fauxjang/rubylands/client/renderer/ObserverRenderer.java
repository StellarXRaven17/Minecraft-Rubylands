package com.fauxjang.rubylands.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.fauxjang.rubylands.entity.ObserverEntity;
import com.fauxjang.rubylands.client.model.Modelobserver;

public class ObserverRenderer extends MobRenderer<ObserverEntity, Modelobserver<ObserverEntity>> {
	public ObserverRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelobserver<ObserverEntity>(context.bakeLayer(Modelobserver.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ObserverEntity entity) {
		return ResourceLocation.parse("rd:textures/entities/observer.png");
	}
}