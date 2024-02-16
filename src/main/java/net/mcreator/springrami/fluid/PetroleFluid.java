
package net.mcreator.springrami.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.springrami.init.SpringramiModItems;
import net.mcreator.springrami.init.SpringramiModFluids;
import net.mcreator.springrami.init.SpringramiModFluidTypes;
import net.mcreator.springrami.init.SpringramiModBlocks;

public abstract class PetroleFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> SpringramiModFluidTypes.PETROLE_TYPE.get(), () -> SpringramiModFluids.PETROLE.get(), () -> SpringramiModFluids.FLOWING_PETROLE.get())
			.explosionResistance(100f).bucket(() -> SpringramiModItems.PETROLE_BUCKET.get()).block(() -> (LiquidBlock) SpringramiModBlocks.PETROLE.get());

	private PetroleFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends PetroleFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PetroleFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
