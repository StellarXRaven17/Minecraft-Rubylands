package net.stellarxraven17.rubylands.client.renderer;

import net.stellarxraven17.rubylands.entity.RecruiterEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

public class RecruiterRenderer extends HumanoidMobRenderer<RecruiterEntity, HumanoidModel<RecruiterEntity>> {
	public RecruiterRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<RecruiterEntity>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(RecruiterEntity entity) {
		return ResourceLocation.parse("rd:textures/entities/recruiter.png");
	}
}