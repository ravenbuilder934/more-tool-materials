package moretoolmaterials;

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

}
