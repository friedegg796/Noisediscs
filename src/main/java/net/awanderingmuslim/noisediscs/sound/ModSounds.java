package net.awanderingmuslim.noisediscs.sound;

import net.awanderingmuslim.noisediscs.Noisediscs;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent WHITE_NOISE = registerSoundEvent("white_noise");
    public static final RegistryKey<JukeboxSong> WHITE_NOISE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Noisediscs.MOD_ID, "white_noise"));

    public static final SoundEvent VELVET_NOISE = registerSoundEvent("velvet_noise");
    public static final RegistryKey<JukeboxSong> VELVET_NOISE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Noisediscs.MOD_ID, "velvet_noise"));


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Noisediscs.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Noisediscs.LOGGER.info("Registering Mod Sounds for " + Noisediscs.MOD_ID);
    }
}
