
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.springrami.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.springrami.block.TopazeOreBlock;
import net.mcreator.springrami.block.TopazeBlockBlock;
import net.mcreator.springrami.block.SaphirOreBlock;
import net.mcreator.springrami.block.SaphirBlockBlock;
import net.mcreator.springrami.block.RubysOreBlock;
import net.mcreator.springrami.block.RubysBlockBlock;
import net.mcreator.springrami.block.DamierBlock;
import net.mcreator.springrami.SpringramiMod;

public class SpringramiModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SpringramiMod.MODID);
	public static final RegistryObject<Block> DAMIER = REGISTRY.register("damier", () -> new DamierBlock());
	public static final RegistryObject<Block> RUBYS_ORE = REGISTRY.register("rubys_ore", () -> new RubysOreBlock());
	public static final RegistryObject<Block> RUBYS_BLOCK = REGISTRY.register("rubys_block", () -> new RubysBlockBlock());
	public static final RegistryObject<Block> SAPHIR_ORE = REGISTRY.register("saphir_ore", () -> new SaphirOreBlock());
	public static final RegistryObject<Block> SAPHIR_BLOCK = REGISTRY.register("saphir_block", () -> new SaphirBlockBlock());
	public static final RegistryObject<Block> TOPAZE_ORE = REGISTRY.register("topaze_ore", () -> new TopazeOreBlock());
	public static final RegistryObject<Block> TOPAZE_BLOCK = REGISTRY.register("topaze_block", () -> new TopazeBlockBlock());
}
