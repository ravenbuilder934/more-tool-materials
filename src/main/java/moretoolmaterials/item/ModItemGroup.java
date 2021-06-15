package moretoolmaterials.item;

import moretoolmaterials.MoreToolMaterials;
import moretoolmaterials.registry.ToolRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup extends ItemGroup {

    public ModItemGroup() {
        super(MoreToolMaterials.MOD_ID);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ToolRegistry.REDSTONE_SWORD.get());
    }
}