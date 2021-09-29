package learning.learning;

import learning.learning.item.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Learning implements ModInitializer {
    public static final Item GRENADE = new GrenadeItem(new Item.Settings().group(ItemGroup.COMBAT));
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("learning", "grenade"), GRENADE);
    }
}
