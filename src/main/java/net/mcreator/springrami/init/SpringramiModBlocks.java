
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.springrami.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.springrami.block.PetroleBlock;
import net.mcreator.springrami.block.DamierBlock;
import net.mcreator.springrami.block.AluminiumOreBlock;
import net.mcreator.springrami.SpringramiMod;

public class SpringramiModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SpringramiMod.MODID);
	public static final RegistryObject<Block> ALUMINIUM_ORE = REGISTRY.register("aluminium_ore", () -> new AluminiumOreBlock());
	public static final RegistryObject<Block> PETROLE = REGISTRY.register("petrole", () -> new PetroleBlock());
	public static final RegistryObject<Block> DAMIER = REGISTRY.register("damier", () -> new DamierBlock());
}
