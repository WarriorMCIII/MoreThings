package com.warriormc.morethings.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MORE_THINGS_TAB =new CreativeModeTab("more_things_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PIZZA.get());
        }
    };
}
