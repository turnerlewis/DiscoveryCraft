package com.megarapidz.discoverycraft.setup;

import net.minecraft.world.World;

public class ServerProxy implements IProxy {
    @Override
    public World getClientWorld() {
        throw new IllegalStateException("Run this on the client only!");
    }
}
