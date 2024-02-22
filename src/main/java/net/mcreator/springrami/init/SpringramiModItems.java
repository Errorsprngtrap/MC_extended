
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

import net.mcreator.springrami.item.RubysSwordItem;
import net.mcreator.springrami.item.RubysShovelItem;
import net.mcreator.springrami.item.RubysPickaxeItem;
import net.mcreator.springrami.item.RubysItem;
import net.mcreator.springrami.item.RubysHoeItem;
import net.mcreator.springrami.item.RubysAxeItem;
import net.mcreator.springrami.item.RubysArmorItem;
import net.mcreator.springrami.item.HoneyAppleItem;
import net.mcreator.springrami.SpringramiMod;

public class SpringramiModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SpringramiMod.MODID);
	public static final RegistryObject<Item> DAMIER = block(SpringramiModBlocks.DAMIER);
	public static final RegistryObject<Item> RUBYS_ORE = block(SpringramiModBlocks.RUBYS_ORE);
	public static final RegistryObject<Item> RUBYS_BLOCK = block(SpringramiModBlocks.RUBYS_BLOCK);
	public static final RegistryObject<Item> RUBYS_AXE = REGISTRY.register("rubys_axe", () -> new RubysAxeItem());
	public static final RegistryObject<Item> RUBYS_PICKAXE = REGISTRY.register("rubys_pickaxe", () -> new RubysPickaxeItem());
	public static final RegistryObject<Item> RUBYS_SWORD = REGISTRY.register("rubys_sword", () -> new RubysSwordItem());
	public static final RegistryObject<Item> RUBYS_SHOVEL = REGISTRY.register("rubys_shovel", () -> new RubysShovelItem());
	public static final RegistryObject<Item> RUBYS_HOE = REGISTRY.register("rubys_hoe", () -> new RubysHoeItem());
	public static final RegistryObject<Item> RUBYS = REGISTRY.register("rubys", () -> new RubysItem());
	public static final RegistryObject<Item> RUBYS_ARMOR_HELMET = REGISTRY.register("rubys_armor_helmet", () -> new RubysArmorItem.Helmet());
	public static final RegistryObject<Item> RUBYS_ARMOR_CHESTPLATE = REGISTRY.register("rubys_armor_chestplate", () -> new RubysArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBYS_ARMOR_LEGGINGS = REGISTRY.register("rubys_armor_leggings", () -> new RubysArmorItem.Leggings());
	public static final RegistryObject<Item> RUBYS_ARMOR_BOOTS = REGISTRY.register("rubys_armor_boots", () -> new RubysArmorItem.Boots());
	public static final RegistryObject<Item> HONEY_APPLE = REGISTRY.register("honey_apple", () -> new HoneyAppleItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
