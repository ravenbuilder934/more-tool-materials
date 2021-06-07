package moretoolmaterials.item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ModItemTiers implements IItemTier
{
    EMERALD(3, 1561, 8.0F, 3.0F, 15, () ->
    {
        return Ingredient.fromItems(Items.EMERALD);
    }),
    LAPIS(2, 250, 7.0F, 2.5F, 25, () ->
    {
        return Ingredient.fromItems(Items.LAPIS_LAZULI);
    }),
    OBSIDIAN(4, 2031, 6.0F, 4.0F, 5, () ->
    {
        return Ingredient.fromItems(Items.OBSIDIAN);
    }),
    REDSTONE(2, 250, 12.5F, 2.0F, 10, () ->
    {
        return Ingredient.fromItems(Items.REDSTONE);
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    ModItemTiers(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn)
    {
        this.level = harvestLevelIn;
        this.uses = maxUsesIn;
        this.speed = efficiencyIn;
        this.damage = attackDamageIn;
        this.enchantmentValue = enchantabilityIn;
        this.repairIngredient = new LazyValue<>(repairMaterialIn);
    }

    public int getMaxUses()
    {
        return this.uses;
    }

    public float getEfficiency()
    {
        return this.speed;
    }

    public float getAttackDamage()
    {
        return this.damage;
    }

    public int getHarvestLevel()
    {
        return this.level;
    }

    public int getEnchantability()
    {
        return this.enchantmentValue;
    }

    public Ingredient getRepairMaterial()
    {
        return this.repairIngredient.getValue();
    }
}
