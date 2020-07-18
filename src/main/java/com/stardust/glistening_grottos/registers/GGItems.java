package com.stardust.glistening_grottos.registers;

import com.stardust.glistening_grottos.common.GGItemGroup;
import com.stardust.glistening_grottos.core.GlisteningGrottos;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class GGItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GlisteningGrottos.MODID);

    private static RegistryObject<Item> registerBlockItem(String name, Supplier<Block> blockSupplier) {
        return ITEMS.register(name, () -> new BlockItem(blockSupplier.get(), new Item.Properties().group(GGItemGroup.MOD_ITEM_GROUP)));
    }

    private static RegistryObject<Item> registerBlockItem(RegistryObject<Block> blockSupplier) {
        return ITEMS.register(blockSupplier.getId().getPath(), () -> new BlockItem(blockSupplier.get(), new Item.Properties().group(GGItemGroup.MOD_ITEM_GROUP)));
    }


    public static final RegistryObject<Item> BLOOM_SOIL = registerBlockItem(GGBlocks.BLOOM_SOIL);
}
