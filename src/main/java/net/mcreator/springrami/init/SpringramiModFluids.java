
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.springrami.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.springrami.fluid.PetroleFluid;
import net.mcreator.springrami.SpringramiMod;

public class SpringramiModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SpringramiMod.MODID);
	public static final RegistryObject<FlowingFluid> PETROLE = REGISTRY.register("petrole", () -> new PetroleFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_PETROLE = REGISTRY.register("flowing_petrole", () -> new PetroleFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(PETROLE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PETROLE.get(), RenderType.translucent());
		}
	}
}
