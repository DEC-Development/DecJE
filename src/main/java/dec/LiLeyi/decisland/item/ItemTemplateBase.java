package dec.LiLeyi.decisland.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

import java.util.TreeMap;

public class ItemTemplateBase{
    public TreeMap<String,RegistryKey<ItemGroup>> idsAndGroup;
//    public Item item;
    public ItemTemplateBase(){
        this.idsAndGroup = new TreeMap<>();
    }
    public void register(){
        this.idsAndGroup.forEach((id,group)->{
            ItemBase newItem = new ItemBase();
            newItem.id = id;
            newItem.item = new Item(new Item.Settings());
            newItem.registryKeyitemgroup = group;
            newItem.register();
        });
    }
}
