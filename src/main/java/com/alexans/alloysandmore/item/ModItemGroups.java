package com.alexans.alloysandmore.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import com.alexans.alloysandmore.AlloysAndMore;
import net.minecraft.text.Text;
import com.alexans.alloysandmore.block.ModBlocks;

//este archivo es para hacer tu propio apartado en el menu de creativo

public class ModItemGroups {
    public static final ItemGroup COPPERY_IRON = Registry.register(Registries.ITEM_GROUP,
            //en esta linea de abajo va la imagen del apartado
            new Identifier(AlloysAndMore.MOD_ID,"coppery_iron"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.coppery_iron"))
                    .icon(() -> new ItemStack(ModItems.COPPERY_IRON)).entries((displayContext, entries) -> {

                        entries.add(ModItems.COPPERY_IRON);
                        entries.add(ModItems.RAW_COPPERY_IRON);
                        entries.add(ModBlocks.COPPERY_IRON_BLOCK);

                    }).build());
//aqui arriba se ponen los items que quieres que aparezcan en el apartado con entries.add(ModItems.NOMBRE);

//estos son los logs, solo cambia PruebaMod por el nombre que tengas en el archivo que esta en net.tunombre.nombremod
//que solo tenga el nombre del mod
    public static void  registerItemGroups(){
        AlloysAndMore.LOGGER.info("Registrando Grupos de Items para " + AlloysAndMore.MOD_ID);
    }
}
