package com.warriormc.morethings.item;

import com.warriormc.morethings.MoreThings;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreThings.MOD_ID);

    public static final RegistryObject<Item> PIZZA = ITEMS.register("pizza", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).tab(ModCreativeModeTab.MORE_THINGS_TAB)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).tab(ModCreativeModeTab.MORE_THINGS_TAB)));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
