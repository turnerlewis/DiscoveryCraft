package com.megarapidz.discoverycraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DragonstoneOre extends Block {

    public DragonstoneOre() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(2.0f)
                .lightValue(0)
        );
        setRegistryName("dragonstoneore");
    }
}
