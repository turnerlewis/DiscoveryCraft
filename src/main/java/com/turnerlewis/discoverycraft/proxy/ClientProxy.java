package com.turnerlewis.discoverycraft.proxy;

import init.ModBlocks;
import init.ModItems;

/**
 * Created by Lewis on 14/07/2017.
 */
public class ClientProxy implements CommonProxy {

    @Override
    public void init() {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }
}
