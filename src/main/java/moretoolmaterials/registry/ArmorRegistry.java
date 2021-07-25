package moretoolmaterials.registry;

import moretoolmaterials.MoreToolMaterials;
import moretoolmaterials.item.ModArmorMaterials;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreToolMaterials.MOD_ID);

    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.HEAD, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> LAPIS_HELMET = ITEMS.register("lapis_helmet", () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.HEAD, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.HEAD, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> REDSTONE_HELMET = ITEMS.register("redstone_helmet", () -> new ArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlot.HEAD, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.CHEST, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate", () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.CHEST, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.CHEST, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> REDSTONE_CHESTPLATE = ITEMS.register("redstone_chestplate", () -> new ArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlot.CHEST, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.LEGS, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> LAPIS_LEGGINGS = ITEMS.register("lapis_leggings", () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.LEGS, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.LEGS, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> REDSTONE_LEGGINGS = ITEMS.register("redstone_leggings", () -> new ArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlot.LEGS, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlot.FEET, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> LAPIS_BOOTS = ITEMS.register("lapis_boots", () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlot.FEET, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlot.FEET, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> REDSTONE_BOOTS = ITEMS.register("redstone_boots", () -> new ArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlot.FEET, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
}
