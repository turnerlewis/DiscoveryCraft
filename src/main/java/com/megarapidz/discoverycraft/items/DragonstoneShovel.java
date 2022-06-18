package com.megarapidz.discoverycraft.items;

import com.megarapidz.discoverycraft.DiscoveryCraft;
import net.minecraft.item.Item;

public class DragonstoneShovel extends Item {

    public DragonstoneShovel() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(DiscoveryCraft.setup.itemGroup));
        setRegistryName("dragonstoneshovel");
    }
}
