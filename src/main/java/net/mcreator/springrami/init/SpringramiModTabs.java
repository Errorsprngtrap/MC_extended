
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.springrami.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
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
				tabData.accept(SpringramiModItems.PETROLE_BUCKET.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> ITEMSEXPANSION = REGISTRY.register("itemsexpansion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.springrami.itemsexpansion")).icon(() -> new ItemStack(SpringramiModItems.FEUILLEDALUMINIUM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpringramiModItems.FEUILLEDALUMINIUM.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> FOODEXPANSION = REGISTRY.register("foodexpansion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.springrami.foodexpansion")).icon(() -> new ItemStack(Blocks.SUGAR_CANE)).displayItems((parameters, tabData) -> {
				tabData.accept(SpringramiModItems.ROTTENFLASHALU.get());
				tabData.accept(SpringramiModItems.COOKEDROTTENFLESH.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> BLOCKEXPANSION = REGISTRY.register("blockexpansion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.springrami.blockexpansion")).icon(() -> new ItemStack(SpringramiModBlocks.DAMIER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpringramiModBlocks.DAMIER.get().asItem());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> WEAPONEXPANSION = REGISTRY.register("weaponexpansion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.springrami.weaponexpansion")).icon(() -> new ItemStack(SpringramiModItems.DAGGER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpringramiModItems.DAGGER.get());
			}).withSearchBar().build());
}
