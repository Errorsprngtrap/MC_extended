
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.springrami.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.springrami.item.RottenflashaluItem;
import net.mcreator.springrami.item.FeuilledaluminiumItem;
import net.mcreator.springrami.item.CookedrottenfleshItem;
import net.mcreator.springrami.item.AluminiumIngotItem;
import net.mcreator.springrami.SpringramiMod;

public class SpringramiModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SpringramiMod.MODID);
	public static final RegistryObject<Item> ALUMINIUM_ORE = block(SpringramiModBlocks.ALUMINIUM_ORE);
	public static final RegistryObject<Item> ALUMINIUM_INGOT = REGISTRY.register("aluminium_ingot", () -> new AluminiumIngotItem());
	public static final RegistryObject<Item> FEUILLEDALUMINIUM = REGISTRY.register("feuilledaluminium", () -> new FeuilledaluminiumItem());
	public static final RegistryObject<Item> ROTTENFLASHALU = REGISTRY.register("rottenflashalu", () -> new RottenflashaluItem());
	public static final RegistryObject<Item> COOKEDROTTENFLESH = REGISTRY.register("cookedrottenflesh", () -> new CookedrottenfleshItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
