package net.awanderingmuslim.noisediscs;

import net.fabricmc.api.ModInitializer;
import net.awanderingmuslim.noisediscs.item.ModItemGroups;
import net.awanderingmuslim.noisediscs.item.ModItems;
import net.awanderingmuslim.noisediscs.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Noisediscs implements ModInitializer {
    public static final String MOD_ID = "noisediscs";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModSounds.registerSounds();


    }
}