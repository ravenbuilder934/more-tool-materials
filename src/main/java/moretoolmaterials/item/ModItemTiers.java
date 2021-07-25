package moretoolmaterials.item;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.util.function.Supplier;

public enum ModItemTiers implements Tier
{
    EMERALD(3, 1561, 8.0F, 3.0F, 15, () ->
    {
        return Ingredient.of(Tags.Items.GEMS_EMERALD);
    }),
    LAPIS(2, 250, 7.0F, 2.5F, 25, () ->
    {
        return Ingredient.of(Tags.Items.GEMS_LAPIS);
    }),
    OBSIDIAN(4, 2031, 6.0F, 4.0F, 5, () ->
    {
        return Ingredient.of(Tags.Items.OBSIDIAN);
    }),
    REDSTONE(2, 250, 12.5F, 2.0F, 10, () ->
    {
        return Ingredient.of(Tags.Items.DUSTS_REDSTONE);
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModItemTiers(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn)
    {
        this.level = harvestLevelIn;
        this.uses = maxUsesIn;
        this.speed = efficiencyIn;
        this.damage = attackDamageIn;
        this.enchantmentValue = enchantabilityIn;
        this.repairIngredient = new LazyLoadedValue<>(repairMaterialIn);
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
