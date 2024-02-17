
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
	public static final RegistryObject<CreativeModeTab> MCEXPANSION = REGISTRY.register("mcexpansion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.springrami.mcexpansion")).icon(() -> new ItemStack(Blocks.SMOOTH_STONE)).displayItems((parameters, tabData) -> {
				tabData.accept(SpringramiModBlocks.DAMIER.get().asItem());
			}).withSearchBar().build());
}
