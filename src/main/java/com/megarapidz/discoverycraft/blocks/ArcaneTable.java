package com.megarapidz.discoverycraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ArcaneTable extends Block {

    public ArcaneTable() {
        super(Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(2.0f)
                .lightValue(0)
        );
        setRegistryName("arcanetable");
    }
}
