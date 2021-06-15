package moretoolmaterials.registry;

import moretoolmaterials.MoreToolMaterials;
import moretoolmaterials.item.ModArmorMaterials;
import moretoolmaterials.item.ModItemGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorRegistry
{
    public static final ItemGroup ITEM_GROUP = new ModItemGroup();
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreToolMaterials.MOD_ID);

    public static final RegistryObject<ArmorItem> EMERALD_HELMET = ITEMS.register("emerald_helmet", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> LAPIS_HELMET = ITEMS.register("lapis_helmet", () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> REDSTONE_HELMET = ITEMS.register("redstone_helmet", () -> new ArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlotType.HEAD, (new Item.Properties()).tab(ITEM_GROUP)));

    public static final RegistryObject<ArmorItem> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> LAPIS_CHESTPLATE = ITEMS.register("lapis_chestplate", () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> REDSTONE_CHESTPLATE = ITEMS.register("redstone_chestplate", () -> new ArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlotType.CHEST, (new Item.Properties()).tab(ITEM_GROUP)));

    public static final RegistryObject<ArmorItem> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> LAPIS_LEGGINGS = ITEMS.register("lapis_leggings", () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> REDSTONE_LEGGINGS = ITEMS.register("redstone_leggings", () -> new ArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlotType.LEGS, (new Item.Properties()).tab(ITEM_GROUP)));

    public static final RegistryObject<ArmorItem> EMERALD_BOOTS = ITEMS.register("emerald_boots", () -> new ArmorItem(ModArmorMaterials.EMERALD, EquipmentSlotType.FEET, (new Item.Properties()).tab(ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> LAPIS_BOOTS = ITEMS.register("lapis_boots", () -> new ArmorItem(ModArmorMaterials.LAPIS, EquipmentSlotType.FEET, (new Item.Properties()).tab(ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> new ArmorItem(ModArmorMaterials.OBSIDIAN, EquipmentSlotType.FEET, (new Item.Properties()).tab(ITEM_GROUP)));
    public static final RegistryObject<ArmorItem> REDSTONE_BOOTS = ITEMS.register("redstone_boots", () -> new ArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlotType.FEET, (new Item.Properties()).tab(ITEM_GROUP)));
}
