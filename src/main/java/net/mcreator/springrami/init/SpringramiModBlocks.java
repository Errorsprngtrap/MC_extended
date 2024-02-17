
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.springrami.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.springrami.block.DamierBlock;
import net.mcreator.springrami.SpringramiMod;

public class SpringramiModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SpringramiMod.MODID);
	public static final RegistryObject<Block> DAMIER = REGISTRY.register("damier", () -> new DamierBlock());
}
