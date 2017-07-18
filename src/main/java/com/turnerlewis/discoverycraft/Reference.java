package com.turnerlewis.discoverycraft;

/**
 * Created by Lewis on 14/07/2017.
 */
public class Reference {

    public static final String MOD_ID = "tdc";
    public static final String NAME = "DiscoveryCraft";
    public static final String VERSION = "alpha-0.1.0";
    public static final String ACCEPTED_VERSIONS = "[1.11.2]";

    public static final String CLIENT_PROXY_CLASS = "com.turnerlewis.discoverycraft.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.turnerlewis.discoverycraft.proxy.ServerProxy";

    public static enum DiscoveryCraftItems {
        DRAGONSTONE("dragonstone", "ItemDragonstone"),
        ENDERFANG("enderfang", "ItemEnderfang");

        private String unlocalizedName;
        private String registryName;

        DiscoveryCraftItems(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }

    public static enum DiscoveryCraftBlocks {
        DRAGONSTONEBLOCK("dragonstoneblock", "BlockDragonstone");

        private String unlocalizedName;
        private String registryName;

        DiscoveryCraftBlocks(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }

        public String getRegistryName() {
            return registryName;
        }
    }
}
