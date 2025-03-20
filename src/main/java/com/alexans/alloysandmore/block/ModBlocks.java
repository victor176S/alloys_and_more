package com.alexans.alloysandmore.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import com.alexans.alloysandmore.AlloysAndMore;

/*en new Block(FabricBlockSettings() se puede poner justo despues de settings .copyOf(Blocks.IRON_BLOCK)
para copiar las propiedades del bloque de hierro, se aplica a todos los demas bloques tambien

se puede poner fuera del parentesis de (Blocks.BLOQUE_DE_EJEMPLO) alguna de las propiedades de un bloque
seguida por un punto para aplicarle esa en vez de la que ya tiene, como en el ejemplo

con .create() se pueden crear las propiedades de un bloque desde 0
*/

public class ModBlocks {
    public static final Block COPPERY_IRON_BLOCK = registerBlock("coppery_iron_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AlloysAndMore.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(AlloysAndMore.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));


    }

    public static void registerModBlocks(){
        AlloysAndMore.LOGGER.info("Registrando Bloques para " + AlloysAndMore.MOD_ID);
    }
}
