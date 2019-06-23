package com.megarapidz.discoverycraft;

import com.megarapidz.discoverycraft.blocks.ArcaneTable;
import com.megarapidz.discoverycraft.blocks.DragonstoneBlock;
import com.megarapidz.discoverycraft.blocks.DragonstoneOre;
import com.megarapidz.discoverycraft.blocks.ModBlocks;
import com.megarapidz.discoverycraft.items.*;
import com.megarapidz.discoverycraft.setup.ClientProxy;
import com.megarapidz.discoverycraft.setup.IProxy;
import com.megarapidz.discoverycraft.setup.ModSetup;
import com.megarapidz.discoverycraft.setup.ServerProxy;
import com.megarapidz.discoverycraft.world.OreGeneration;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("discoverycraft")
public class DiscoveryCraft {

    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    public static ModSetup setup = new ModSetup();

    private static final Logger LOGGER = LogManager.getLogger();

    public DiscoveryCraft() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();
        OreGeneration.setupOreGeneration();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
            event.getRegistry().register(new DragonstoneBlock());
            event.getRegistry().register(new ArcaneTable());
            event.getRegistry().register(new DragonstoneOre());

        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            Item.Properties properties = new Item.Properties()
                .group(setup.itemGroup);
            event.getRegistry().register(new BlockItem(ModBlocks.DRAGONSTONEBLOCK, properties).setRegistryName("dragonstoneblock"));
            event.getRegistry().register(new BlockItem(ModBlocks.ARCANETABLE, properties).setRegistryName("arcanetable"));
            event.getRegistry().register(new BlockItem(ModBlocks.DRAGONSTONEORE, properties).setRegistryName("dragonstoneore"));
            event.getRegistry().register(new Dragonstone());
            event.getRegistry().register(new DragonstoneAxe());
            event.getRegistry().register(new DragonstonePickaxe());
            event.getRegistry().register(new DragonstoneShovel());
            event.getRegistry().register(new DragonstoneGreatsword());

        }
    }
}