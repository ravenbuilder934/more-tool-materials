package moretoolmaterials.registry;

import moretoolmaterials.MoreToolMaterials;
import moretoolmaterials.item.ModItemTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreToolMaterials.MOD_ID);

    public static final RegistryObject<SwordItem> EMERALD_SWORD = ITEMS.register("emerald_sword", () -> new SwordItem(ModItemTiers.EMERALD, 3, -2.4F, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<SwordItem> LAPIS_SWORD = ITEMS.register("lapis_sword", () -> new SwordItem(ModItemTiers.LAPIS, 3, -2.4F, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<SwordItem> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordItem(ModItemTiers.OBSIDIAN, 3, -2.4F, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<SwordItem> REDSTONE_SWORD = ITEMS.register("redstone_sword", () -> new SwordItem(ModItemTiers.REDSTONE, 3, -2.4F, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ModItemTiers.EMERALD, 1.5F, -3.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> LAPIS_SHOVEL = ITEMS.register("lapis_shovel", () -> new ShovelItem(ModItemTiers.LAPIS, 1.5F, -3.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ShovelItem(ModItemTiers.OBSIDIAN, 1.5F, -3.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () -> new ShovelItem(ModItemTiers.REDSTONE, 1.5F, -3.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModItemTiers.EMERALD, 1, -2.8F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe", () -> new PickaxeItem(ModItemTiers.LAPIS, 1, -2.8F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new PickaxeItem(ModItemTiers.OBSIDIAN, 1, -2.8F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", () -> new PickaxeItem(ModItemTiers.REDSTONE, 1, -2.8F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<AxeItem> EMERALD_AXE = ITEMS.register("emerald_axe", () -> new AxeItem(ModItemTiers.EMERALD, 5.0F, -3.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> LAPIS_AXE = ITEMS.register("lapis_axe", () -> new AxeItem(ModItemTiers.LAPIS, 4.5F, -3.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new AxeItem(ModItemTiers.OBSIDIAN, 7.0F, -3.2F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> REDSTONE_AXE = ITEMS.register("redstone_axe", () -> new AxeItem(ModItemTiers.REDSTONE, 4.0F, -3.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<HoeItem> EMERALD_HOE = ITEMS.register("emerald_hoe", () -> new HoeItem(ModItemTiers.EMERALD, -3, 0.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> LAPIS_HOE = ITEMS.register("lapis_hoe", () -> new HoeItem(ModItemTiers.LAPIS, -2, 0.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new HoeItem(ModItemTiers.OBSIDIAN, -4, 0.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> REDSTONE_HOE = ITEMS.register("redstone_hoe", () -> new HoeItem(ModItemTiers.REDSTONE, -2, 0.0F, (new Item.Properties()).tab(CreativeModeTab.TAB_TOOLS)));
}
