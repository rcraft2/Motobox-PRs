package motobox.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import motobox.block.MotoboxBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool rubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(MotoboxBlocks.BRASS_BLOCK);

        rubyPool.stairs(MotoboxBlocks.BRASS_STAIR);
        rubyPool.slab(MotoboxBlocks.BRASS_SlAB);
        //rubyPool.button(MotoboxBlocks.RUBY_BUTTON);
        //rubyPool.pressurePlate(MotoboxBlocks.RUBY_PRESSURE_PLATE);
        //rubyPool.fence(MotoboxBlocks.RUBY_FENCE);
        //rubyPool.fenceGate(MotoboxBlocks.RUBY_FENCE_GATE);
        rubyPool.wall(MotoboxBlocks.BRASS_WALL);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }
}
