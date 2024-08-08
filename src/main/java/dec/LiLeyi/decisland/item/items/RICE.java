package dec.LiLeyi.decisland.item.items;

import dec.LiLeyi.decisland.item.ItemBase;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class Rice extends ItemBase {
    public Rice(){
        this.id = "dec:rice";
        this.item = new Item(new Item.Settings().food(
                new FoodComponent.Builder().nutrition(6).saturationModifier(0.5f).build()
        ));
        this.registryKeyitemgroup = ItemGroups.FOOD_AND_DRINK;
        this.register();
    }
}