package com.nmagpie.tfc_ie_addon.common.items;

import java.util.Locale;
import java.util.Map;
import java.util.function.Supplier;
import blusunrize.immersiveengineering.ImmersiveEngineering;
import com.nmagpie.tfc_ie_addon.TFC_IE_Addon;
import com.nmagpie.tfc_ie_addon.common.blocks.Fluids;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.dries007.tfc.common.TFCItemGroup;
import net.dries007.tfc.common.blocks.rock.Ore;
import net.dries007.tfc.util.Helpers;

@SuppressWarnings("unused")
public class Items
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TFC_IE_Addon.MOD_ID);

    public static final RegistryObject<Item> QUARTZ_SHARD = register("mineral/quartz_shard", TFCItemGroup.ORES);

    public static final RegistryObject<Item> WIRECUTTER_HEAD = register("tool_head/wirecutter", TFCItemGroup.METAL);

    public static final RegistryObject<Item> HAMMER_HEAD = register("tool_head/ie_hammer", TFCItemGroup.METAL);

    public static final RegistryObject<Item> MOLD_SHEET = register("mold_sheet",
        () -> new Item(new Item.Properties().stacksTo(1).tab(ImmersiveEngineering.ITEM_GROUP)));
    public static final RegistryObject<Item> MOLD_BLOCK = register("mold_block",
        () -> new Item(new Item.Properties().stacksTo(1).tab(ImmersiveEngineering.ITEM_GROUP)));

    public static final RegistryObject<Drillhead> DRILLHEAD_BLACK_STEEL = register("drillhead_black_steel", () -> new Drillhead(Drillhead.BLACK_STEEL));
    public static final RegistryObject<Drillhead> DRILLHEAD_BLUE_STEEL = register("drillhead_blue_steel", () -> new Drillhead(Drillhead.BLUE_STEEL));
    public static final RegistryObject<Drillhead> DRILLHEAD_RED_STEEL = register("drillhead_red_steel", () -> new Drillhead(Drillhead.RED_STEEL));

    public static final RegistryObject<Item> TREATED_WOOD_LUMBER = register("treated_wood_lumber", TFCItemGroup.WOOD);

    private static RegistryObject<Item> register(String name, CreativeModeTab group)
    {
        return register(name, () -> new Item(new Item.Properties().tab(group)));
    }

    private static <T extends Item> RegistryObject<T> register(String name, Supplier<T> item)
    {
        return ITEMS.register(name.toLowerCase(Locale.ROOT), item);
    }
}