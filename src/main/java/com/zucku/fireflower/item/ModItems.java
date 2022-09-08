package com.zucku.fireflower.item;


import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.item.Item;
import com.zucku.fireflower.FireFlower;



public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FireFlower.MOD_ID);
    

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}