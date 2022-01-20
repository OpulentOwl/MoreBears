package net.otterlord.morebears.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.otterlord.morebears.MoreBears;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    public static final Item OPAL = registerItem("opal",
            new Item(new FabricItemSettings().group(ModItemGroup.OPAL)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreBears.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreBears.LOGGER.info("Registering Mod Items for " + MoreBears.MOD_ID);
    }
}
