
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.springrami.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.springrami.SpringramiMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpringramiModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpringramiMod.MODID);
	public static final RegistryObject<CreativeModeTab> MCEXPANSION = REGISTRY.register("mcexpansion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.springrami.mcexpansion")).icon(() -> new ItemStack(Blocks.SMOOTH_STONE)).displayItems((parameters, tabData) -> {
				tabData.accept(SpringramiModBlocks.DAMIER.get().asItem());
				tabData.accept(SpringramiModBlocks.RUBYS_ORE.get().asItem());
				tabData.accept(SpringramiModBlocks.RUBYS_BLOCK.get().asItem());
				tabData.accept(SpringramiModItems.RUBYS_AXE.get());
				tabData.accept(SpringramiModItems.RUBYS_PICKAXE.get());
				tabData.accept(SpringramiModItems.RUBYS_SWORD.get());
				tabData.accept(SpringramiModItems.RUBYS_SHOVEL.get());
				tabData.accept(SpringramiModItems.RUBYS_HOE.get());
				tabData.accept(SpringramiModItems.RUBYS.get());
				tabData.accept(SpringramiModItems.RUBYS_ARMOR_HELMET.get());
				tabData.accept(SpringramiModItems.RUBYS_ARMOR_CHESTPLATE.get());
				tabData.accept(SpringramiModItems.RUBYS_ARMOR_LEGGINGS.get());
				tabData.accept(SpringramiModItems.RUBYS_ARMOR_BOOTS.get());
				tabData.accept(SpringramiModItems.HONEY_APPLE.get());
				tabData.accept(SpringramiModBlocks.SAPHIR_ORE.get().asItem());
				tabData.accept(SpringramiModBlocks.SAPHIR_BLOCK.get().asItem());
				tabData.accept(SpringramiModBlocks.TOPAZE_ORE.get().asItem());
				tabData.accept(SpringramiModBlocks.TOPAZE_BLOCK.get().asItem());
				tabData.accept(SpringramiModItems.SAPHIR.get());
				tabData.accept(SpringramiModItems.TOPAZE.get());
				tabData.accept(SpringramiModItems.SAPHIR_PICKAXE.get());
				tabData.accept(SpringramiModItems.SAPHIR_AXE.get());
				tabData.accept(SpringramiModItems.SAPHIR_SWORD.get());
				tabData.accept(SpringramiModItems.SAPHIR_SHOVEL.get());
				tabData.accept(SpringramiModItems.SAPHIR_HOE.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(SpringramiModItems.SAPHIR_ARMOR_HELMET.get());
			tabData.accept(SpringramiModItems.SAPHIR_ARMOR_CHESTPLATE.get());
			tabData.accept(SpringramiModItems.SAPHIR_ARMOR_LEGGINGS.get());
			tabData.accept(SpringramiModItems.SAPHIR_ARMOR_BOOTS.get());
		}
	}
}
