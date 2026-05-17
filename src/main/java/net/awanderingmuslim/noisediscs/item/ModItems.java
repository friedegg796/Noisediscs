package net.awanderingmuslim.noisediscs.item;

import net.awanderingmuslim.noisediscs.Noisediscs;
import net.awanderingmuslim.noisediscs.sound.ModSounds;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {


    public static final Item WHITE_NOISE_MUSIC_DISC = registerItem("white_noise_music_disc",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.WHITE_NOISE_KEY).maxCount(1)));


    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(Noisediscs.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Noisediscs.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Noisediscs.LOGGER.info("Registering Mod Items for " + Noisediscs.MOD_ID);

    }
}