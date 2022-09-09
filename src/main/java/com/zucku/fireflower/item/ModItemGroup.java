package com.zucku.fireflower.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {

    public static final CreativeModeTab FIREFLOWER_TAB = new CreativeModeTab("fireFlowerTab") {

        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.FIREFLOWER.get());
        }
    };
}
