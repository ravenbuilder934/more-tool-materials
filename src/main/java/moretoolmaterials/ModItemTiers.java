package moretoolmaterials;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTiers implements IItemTier
{
    EMERALD(3, 1561, 8.0F, 3.0F, 15, () ->
    {
        return Ingredient.of(Items.EMERALD);
    }),
    LAPIS(2, 250, 7.0F, 2.5F, 25, () ->
    {
        return Ingredient.of(Items.LAPIS_LAZULI);
    }),
    OBSIDIAN(4, 2031, 6.0F, 4.0F, 5, () ->
    {
        return Ingredient.of(Items.OBSIDIAN);
    }),
    REDSTONE(2, 250, 12.5F, 2.0F, 10, () ->
    {
        return Ingredient.of(Items.REDSTONE);
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    ModItemTiers(int p_i48458_3_, int p_i48458_4_, float p_i48458_5_, float p_i48458_6_, int p_i48458_7_, Supplier<Ingredient> p_i48458_8_)
    {
        this.level = p_i48458_3_;
        this.uses = p_i48458_4_;
        this.speed = p_i48458_5_;
        this.damage = p_i48458_6_;
        this.enchantmentValue = p_i48458_7_;
        this.repairIngredient = new LazyValue<>(p_i48458_8_);
    }

    public int getUses()
    {
        return this.uses;
    }

    public float getSpeed()
    {
        return this.speed;
    }

    public float getAttackDamageBonus()
    {
        return this.damage;
    }

    public int getLevel()
    {
        return this.level;
    }

    public int getEnchantmentValue()
    {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient()
    {
        return this.repairIngredient.get();
    }
}
