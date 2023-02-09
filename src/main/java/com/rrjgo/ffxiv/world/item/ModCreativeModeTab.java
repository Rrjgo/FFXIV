package com.rrjgo.ffxiv.world.item;

import com.rrjgo.ffxiv.world.level.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab FFXIV_TAB = new CreativeModeTab("ffxivtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ILMENITE.get());
        }
    };
}
