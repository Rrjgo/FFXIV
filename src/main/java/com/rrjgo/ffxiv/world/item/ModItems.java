package com.rrjgo.ffxiv.world.item;

import com.rrjgo.ffxiv.FFXIV;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FFXIV.MOD_ID);

    public static final RegistryObject<Item> ILMENITE = ITEMS.register("ilmenite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.FFXIV_TAB)));
    public static final RegistryObject<Item> ILMENITE_INGOT = ITEMS.register("ilmenite_ingot", ()-> new Item(new Item.Properties().tab(ModCreativeModeTab.FFXIV_TAB)));


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
