package net.otterlord.morebears.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.otterlord.morebears.MoreBears;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    
    public static final Item OPAL = registerItem("opal",
            new Item(new FabricItemSettings().group(ModItemGroup.MOREBEARS)));

    public static final Item BEAR_CLAW = registerItem("bear_claw",
            new Item(new FabricItemSettings().group(ModItemGroup.MOREBEARS)));

    public static final Item BEAR_PELT = registerItem("bear_pelt",
            new Item(new FabricItemSettings().group(ModItemGroup.MOREBEARS)));

    public static final Item OPAL_SWORD = registerItem("opal_sword",
            new SwordItem(ModToolMaterial.OPAL, 2, 1f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreBears.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MoreBears.LOGGER.info("Registering Mod Items for " + MoreBears.MOD_ID);
    }
}
