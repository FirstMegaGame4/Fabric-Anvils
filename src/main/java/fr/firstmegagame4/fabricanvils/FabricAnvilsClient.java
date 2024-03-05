package fr.firstmegagame4.fabricanvils;

import fr.firstmegagame4.fabricanvils.content.FAContentHandler;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

@Environment(EnvType.CLIENT)
public class FabricAnvilsClient implements ClientModInitializer {

    public static int anvilXpLimit;
    public static boolean xpLimitOnClient;

    @Override
    @Environment(EnvType.CLIENT)
    public void onInitializeClient() {
        ClientPlayNetworking.registerGlobalReceiver(FabricAnvils.createId("anvilxplimit"), (client, handler, buf, responseSender) -> {
            FabricAnvilsClient.anvilXpLimit = buf.readInt();
            FabricAnvilsClient.xpLimitOnClient = true;
        });

        FAContentHandler.initClient();
    }
}
