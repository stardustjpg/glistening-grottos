package com.stardust.glistening_grottos.registers;

import com.stardust.glistening_grottos.core.GlisteningGrottos;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class GGBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GlisteningGrottos.MODID);


    public static final RegistryObject<Block> BLOOM_SOIL = BLOCKS.register("bloom_soil", () -> new Block(Block.Properties.create(Material.EARTH, MaterialColor.PURPLE).hardnessAndResistance(0.5f)));
}
