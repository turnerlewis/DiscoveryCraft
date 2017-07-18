package init;

import com.turnerlewis.discoverycraft.blocks.BlockDragonstone;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraft.client.Minecraft.getMinecraft;

public class ModBlocks {

    public static Block dragonstoneblock;


    public static void init() {
        dragonstoneblock = new BlockDragonstone();
    }

    public static void register() {
        registerBlock(dragonstoneblock);
    }

    private static void registerBlock(Block block) {
        GameRegistry.register(dragonstoneblock);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }

    public static void registerRenders() {
        registerRender(dragonstoneblock);
    }

    private static void registerRender(Block block) {
        getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}