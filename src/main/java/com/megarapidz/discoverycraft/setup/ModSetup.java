package com.megarapidz.discoverycraft.setup;

import com.megarapidz.discoverycraft.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("DiscoveryCraft") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.DRAGONSTONEBLOCK);
        }
    };

    public void init() {

    }

}
