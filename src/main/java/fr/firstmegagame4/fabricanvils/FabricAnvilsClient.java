package fr.firstmegagame4.fabricanvils;

import fr.firstmegagame4.fabricanvils.FA.Blocks.BYGBlocks;
import fr.firstmegagame4.fabricanvils.FA.Blocks.BlocksInit;
import fr.firstmegagame4.fabricanvils.FA.Blocks.MinecraftBlocks;
import fr.firstmegagame4.fabricanvils.FA.Blocks.TechRebornBlocks;
import fr.firstmegagame4.fabricanvils.FA.FAUtils;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;

import java.util.Arrays;

public class FabricAnvilsClient implements ClientModInitializer {

    public static int anvilXpLimit;
    public static boolean xpLimitOnClient;

    @Override
    @Environment(EnvType.CLIENT)
    public void onInitializeClient() {

        Arrays.stream(new BlocksInit[] {
                new MinecraftBlocks(),
                new BYGBlocks(),
                new TechRebornBlocks()
        }).forEach(blocks -> {if (FAUtils.isModLoaded(blocks.getModId())) blocks.registerClient();});

        ClientPlayNetworking.registerGlobalReceiver(FAUtils.FAIdentifier("anvilxplimit"), (client, handler, buf, responseSender) -> {
            anvilXpLimit = buf.readInt();
            xpLimitOnClient = true;
        });
    }
}
