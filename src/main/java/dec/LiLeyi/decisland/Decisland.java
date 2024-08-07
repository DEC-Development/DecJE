package dec.LiLeyi.decisland;

import dec.LiLeyi.decisland.item.items.RICE;
import net.fabricmc.api.ModInitializer;

public class Decisland implements ModInitializer {

    @Override
    public void onInitialize() {
        //LoggerFactory.getLogger("modid").info("Hello World!");
        new RICE();
    }
}
