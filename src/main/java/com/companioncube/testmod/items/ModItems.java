package com.companioncube.testmod.items;

import com.companioncube.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TestMod.MOD_ID);

    public static final DeferredItem<Item> TEST_ITEM = ITEMS.register("test_item",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> TEST_ROD = ITEMS.register("test_rod",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> MODEL_HOLDER = ITEMS.register("model_holder",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
