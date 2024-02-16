
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.springrami.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.springrami.fluid.types.PetroleFluidType;
import net.mcreator.springrami.SpringramiMod;

public class SpringramiModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, SpringramiMod.MODID);
	public static final RegistryObject<FluidType> PETROLE_TYPE = REGISTRY.register("petrole", () -> new PetroleFluidType());
}
