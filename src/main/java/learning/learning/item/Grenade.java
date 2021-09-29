package learning.learning.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;

public class Grenade extends Item {
    public Grenade(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        world.createExplosion(user, user.capeX, user.capeY, user.capeZ, 3.0F, Explosion.DestructionType.DESTROY);
        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
