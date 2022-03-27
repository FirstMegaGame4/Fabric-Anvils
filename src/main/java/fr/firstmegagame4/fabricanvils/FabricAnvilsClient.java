package fr.firstmegagame4.fabricanvils;

import fr.firstmegagame4.fabricanvils.FA.FARenderLayers;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.loader.api.FabricLoader;

public class FabricAnvilsClient implements ClientModInitializer {

    public static int anvilXpLimit;
    public static boolean xpLimitOnClient;

    @Override
    @Environment(EnvType.CLIENT)
    public void onInitializeClient() {

        FARenderLayers.registerMinecraftRenderLayers();

        if (FabricLoader.getInstance().isModLoaded("byg")) {
            FARenderLayers.registerBYGRenderLayers();
        }

        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            FARenderLayers.registerTechRebornRenderLayers();
        }

        ClientPlayNetworking.registerGlobalReceiver(FAUtils.FAIdentifier("anvilxplimit"), (client, handler, buf, responseSender) -> {
            anvilXpLimit = buf.readInt();
            xpLimitOnClient = true;
        });
    }
}
