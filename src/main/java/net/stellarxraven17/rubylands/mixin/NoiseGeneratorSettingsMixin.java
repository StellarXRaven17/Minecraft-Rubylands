package net.stellarxraven17.rubylands.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.stellarxraven17.rubylands.init.RdModBiomes;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements RdModBiomes.RdModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> rd_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.rd_dimensionTypeReference != null) {
			retval = RdModBiomes.adaptSurfaceRule(retval, this.rd_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setrdDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.rd_dimensionTypeReference = dimensionType;
	}
}