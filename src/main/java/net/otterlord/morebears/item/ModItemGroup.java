package net.otterlord.morebears.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.otterlord.morebears.MoreBears;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MOREBEARS = FabricItemGroupBuilder.build(new Identifier(MoreBears.MOD_ID, "morebears"),
            () -> new ItemStack(ModItems.OPAL));
}
