package com.turnerlewis.discoverycraft.blocks;

import com.turnerlewis.discoverycraft.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDragonstone extends Block {

    public BlockDragonstone() {
        super(Material.IRON);
        setUnlocalizedName(Reference.DiscoveryCraftBlocks.DRAGONSTONEBLOCK.getUnlocalizedName());
        setRegistryName(Reference.DiscoveryCraftBlocks.DRAGONSTONEBLOCK.getRegistryName());
        setHardness(6.0F);
        setResistance(15.0F);
        setLightLevel(0.5F);
    }
}
