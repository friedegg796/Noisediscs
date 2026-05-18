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


    public static final Item WHITE_NOISE = registerItem("white_noise",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.WHITE_NOISE_KEY).maxCount(1)));

    public static final Item VELVET_NOISE = registerItem("velvet_noise",
            setting -> new Item(setting.jukeboxPlayable(ModSounds.VELVET_NOISE_KEY).maxCount(1)));


    public static final Item GRAY_NOISE = registerItem("gray_noise",
            settings -> new Item(settings.jukeboxPlayable(ModSounds.GRAY_NOISE_KEY).maxCount(1)));

    public static final Item BROWN_NOISE = registerItem("brown_noise",
            settings -> new Item(settings.jukeboxPlayable(ModSounds.BROWN_NOISE_KEY).maxCount(1)));

    public static final Item PINK_NOISE = registerItem("pink_noise",
            settings -> new Item(settings.jukeboxPlayable(ModSounds.PINK_NOISE_KEY).maxCount(1)));


    // no you don't touch these below things
    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(Noisediscs.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Noisediscs.MOD_ID, name)))));
    }

    public static void registerModItems() {
        Noisediscs.LOGGER.info("Registering Mod Items for " + Noisediscs.MOD_ID);

    }
}