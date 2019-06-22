package com.megarapidz.discoverycraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DragonstoneBlock extends Block {

    public DragonstoneBlock() {
        super(Properties.create(Material.IRON)
                .sound(SoundType.METAL)
                .hardnessAndResistance(2.0f)
                .lightValue(14)
        );
        setRegistryName("dragonstoneblock");
    }
}
