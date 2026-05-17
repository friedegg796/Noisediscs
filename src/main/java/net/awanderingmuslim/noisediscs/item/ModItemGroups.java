package net.awanderingmuslim.noisediscs.item;

import net.awanderingmuslim.noisediscs.Noisediscs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.awanderingmuslim.noisediscs.item.ModItems;

public class ModItemGroups {
    public static final ItemGroup NOISEDISCS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Noisediscs.MOD_ID, "noisediscs_discs"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.WHITE_NOISE))
                    .displayName(Text.translatable("itemgroup.noisediscs.noisediscs"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WHITE_NOISE);
                        entries.add(ModItems.VELVET_NOISE);
                        entries.add(ModItems.GRAY_NOISE);


                    }).build());


    public static void registerItemGroups() {
        Noisediscs.LOGGER.info("Registering Item Groups for " + Noisediscs.MOD_ID);
    }
}
