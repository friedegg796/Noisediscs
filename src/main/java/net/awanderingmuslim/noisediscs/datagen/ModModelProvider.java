package net.awanderingmuslim.noisediscs.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.awanderingmuslim.noisediscs.item.ModItems;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WHITE_NOISE, Models.GENERATED);
        itemModelGenerator.register(ModItems.VELVET_NOISE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_NOISE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BROWN_NOISE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_NOISE, Models.GENERATED);


    }
}
