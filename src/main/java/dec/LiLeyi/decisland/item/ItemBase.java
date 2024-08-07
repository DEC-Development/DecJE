package dec.LiLeyi.decisland.item;

import dec.LiLeyi.decisland.item.items.RICE;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;

public class ItemBase {
    public String id;
    public Item item;
    public RegistryKey<ItemGroup> registryKeyitemgroup;
    public ItemBase(){}
    public void register(){
        Registry.register(Registries.ITEM,id,this.item);
        ItemGroupEvents.modifyEntriesEvent(this.registryKeyitemgroup).register(content->{
            content.add(this.item);
        });
    }
}