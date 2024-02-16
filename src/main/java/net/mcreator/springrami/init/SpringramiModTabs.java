
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.springrami.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.springrami.SpringramiMod;

public class SpringramiModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpringramiMod.MODID);
	public static final RegistryObject<CreativeModeTab> OREEXPANSION = REGISTRY.register("oreexpansion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.springrami.oreexpansion")).icon(() -> new ItemStack(SpringramiModBlocks.ALUMINIUM_ORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpringramiModBlocks.ALUMINIUM_ORE.get().asItem());
				tabData.accept(SpringramiModItems.ALUMINIUM_INGOT.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> ITEMSEXPANSION = REGISTRY.register("itemsexpansion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.springrami.itemsexpansion")).icon(() -> new ItemStack(SpringramiModItems.FEUILLEDALUMINIUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpringramiModItems.FEUILLEDALUMINIUM.get());
			}).withSearchBar().build());
}