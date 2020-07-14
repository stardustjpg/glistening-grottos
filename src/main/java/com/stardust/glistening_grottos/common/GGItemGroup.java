package com.stardust.glistening_grottos.common;

import com.stardust.glistening_grottos.core.GlisteningGrottos;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class GGItemGroup {

    public static final ItemGroup MOD_ITEM_GROUP = new ModGroup(GlisteningGrottos.MODID, () -> new ItemStack(Items.BONE));

    public static class ModGroup extends ItemGroup {

        private final Supplier<ItemStack> icon;

        public ModGroup(final String name, final Supplier<ItemStack> icon) {
            super(name);
            this.icon = icon;
        }

        @Override
        public ItemStack createIcon() {
            return this.icon.get();
        }
    }
}
