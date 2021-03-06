package moretoolmaterials.item;

import moretoolmaterials.MoreToolMaterials;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.Tags;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial
{
    EMERALD("emerald", 33, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () ->
    {
        return Ingredient.of(Tags.Items.GEMS_EMERALD);
    }),
    LAPIS("lapis", 30, new int[]{2, 5, 6, 2}, 30, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.5F, 0.0F, () ->
    {
        return Ingredient.of(Tags.Items.GEMS_LAPIS);
    }),
    OBSIDIAN("obsidian", 37, new int[]{3, 6, 8, 3}, 12, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () ->
    {
        return Ingredient.of(Tags.Items.OBSIDIAN);
    }),
    REDSTONE("redstone", 27, new int[]{2, 5, 6, 2}, 9, SoundEvents.ARMOR_EQUIP_IRON, 0.5F, 0.0F, () ->
    {
        return Ingredient.of(Tags.Items.DUSTS_REDSTONE);
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairMaterial;

    ModArmorMaterials(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial)
    {
        this.name = MoreToolMaterials.MOD_ID + ":" + name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = new LazyLoadedValue<>(repairMaterial);
    }

    public int getDurabilityForSlot(EquipmentSlot slotIn)
    {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    public int getDefenseForSlot(EquipmentSlot slotIn)
    {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    public int getEnchantmentValue()
    {
        return this.enchantability;
    }

    public SoundEvent getEquipSound()
    {
        return this.soundEvent;
    }

    public Ingredient getRepairIngredient()
    {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName()
    {
        return this.name;
    }

    public float getToughness()
    {
        return this.toughness;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance()
    {
        return this.knockbackResistance;
    }
}
