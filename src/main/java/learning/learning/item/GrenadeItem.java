package learning.learning.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import net.minecraft.item.TridentItem;

public class GrenadeItem extends Item {
    public GrenadeItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        world.createExplosion(user, user.capeX, user.capeY, user.capeZ, 3.0F, Explosion.DestructionType.DESTROY);
        if(!user.getAbilities().creativeMode) {
            user.getInventory().removeOne(user.getStackInHand(hand));
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
