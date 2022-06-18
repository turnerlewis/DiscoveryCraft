package com.megarapidz.discoverycraft.items;

import com.megarapidz.discoverycraft.DiscoveryCraft;
import net.minecraft.item.Item;

public class Dragonstone extends Item {

    public Dragonstone() {
        super(new Item.Properties()
                .group(DiscoveryCraft.setup.itemGroup));
        setRegistryName("dragonstone");
    }
}
