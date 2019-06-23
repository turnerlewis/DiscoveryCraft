package com.megarapidz.discoverycraft.world;

import com.megarapidz.discoverycraft.blocks.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
    public static void setupOreGeneration()
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.func_222280_a(Feature.MINABLE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.DRAGONSTONEORE.getDefaultState(), 20), Placement.field_215028_n, new CountRangeConfig(6, 10, 10, 40)));
        }
    }

}

//	BiomeManager.getBiomes(BiomeManager.BiomeType.WARM).forEach((BiomeManager.BiomeEntry biomeEntry) -> biomeEntry.biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.func_222280_a(Feature.MINABLE, new OreFeatureConfig
//			(OreFeatureConfig.FillerBlockType.NATURAL_STONE, cockBlocks.cockore.getDefaultState(), 8), Placement.field_215028_n, new CountRangeConfig(1, 0, 0, 16))));