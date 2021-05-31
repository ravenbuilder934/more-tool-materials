package moretoolmaterials.registry;

import moretoolmaterials.MoreToolMaterials;
import moretoolmaterials.item.ModItemTiers;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ToolRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreToolMaterials.MOD_ID);

    public static final RegistryObject<PickaxeItem> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", () -> new PickaxeItem(ModItemTiers.EMERALD, 1, -2.8F, (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> LAPIS_PICKAXE = ITEMS.register("lapis_pickaxe", () -> new PickaxeItem(ModItemTiers.LAPIS, 1, -2.8F, (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new PickaxeItem(ModItemTiers.OBSIDIAN, 1, -2.8F, (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<PickaxeItem> REDSTONE_PICKAXE = ITEMS.register("redstone_pickaxe", () -> new PickaxeItem(ModItemTiers.REDSTONE, 1, -2.8F, (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));

    public static final RegistryObject<ShovelItem> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", () -> new ShovelItem(ModItemTiers.EMERALD, 1.5F, -3.0F, (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> LAPIS_SHOVEL = ITEMS.register("lapis_shovel", () -> new ShovelItem(ModItemTiers.LAPIS, 1.5F, -3.0F, (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ShovelItem(ModItemTiers.OBSIDIAN, 1.5F, -3.0F, (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> REDSTONE_SHOVEL = ITEMS.register("redstone_shovel", () -> new ShovelItem(ModItemTiers.REDSTONE, 1.5F, -3.0F, (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));
}
