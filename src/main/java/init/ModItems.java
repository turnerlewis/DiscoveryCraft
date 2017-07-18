package init;

import items.ItemDragonstone;
import items.ItemEnderfang;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static net.minecraft.client.Minecraft.getMinecraft;


public class ModItems {

    public static Item dragonstone;
    public static Item enderfang;

    public static void init() {
        dragonstone = new ItemDragonstone();
        enderfang = new ItemEnderfang();
    }

    public static void register() {
        GameRegistry.register(dragonstone);
        GameRegistry.register(enderfang);
    }

    public static void registerRenders() {
        registerRender(dragonstone);
        registerRender(enderfang);
    }

    private static void registerRender(Item item) {
        getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
