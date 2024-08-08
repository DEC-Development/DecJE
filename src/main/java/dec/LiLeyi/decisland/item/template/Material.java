package dec.LiLeyi.decisland.item.template;

import dec.LiLeyi.decisland.item.ItemTemplateBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

public class Material extends ItemTemplateBase {
    public Material(){
        super();
//        this.item = new Item(new Item.Settings());

        this.idsAndGroup.put("dec:ice_ingot", ItemGroups.INGREDIENTS);
        this.idsAndGroup.put("dec:everlasting_winter_ingot", ItemGroups.INGREDIENTS);
        this.idsAndGroup.put("dec:lava_ingot", ItemGroups.INGREDIENTS);
        this.register();
    }
}
