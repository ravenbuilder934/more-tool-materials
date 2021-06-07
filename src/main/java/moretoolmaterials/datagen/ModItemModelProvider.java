package moretoolmaterials.datagen;

import moretoolmaterials.MoreToolMaterials;
import moretoolmaterials.registry.ToolRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Supplier;

public class ModItemModelProvider extends ItemModelProvider 
{

    public ModItemModelProvider(DataGenerator generatorIn, ExistingFileHelper helperIn) 
    {
        super(generatorIn, MoreToolMaterials.MOD_ID, helperIn);
    }

    @Override
    protected void registerModels() 
    {
        toolItem(ToolRegistry.EMERALD_SHOVEL);
        toolItem(ToolRegistry.LAPIS_SHOVEL);
        toolItem(ToolRegistry.OBSIDIAN_SHOVEL);
        toolItem(ToolRegistry.REDSTONE_SHOVEL);

        toolItem(ToolRegistry.EMERALD_PICKAXE);
        toolItem(ToolRegistry.LAPIS_PICKAXE);
        toolItem(ToolRegistry.OBSIDIAN_PICKAXE);
        toolItem(ToolRegistry.REDSTONE_PICKAXE);

        toolItem(ToolRegistry.EMERALD_AXE);
        toolItem(ToolRegistry.LAPIS_AXE);
        toolItem(ToolRegistry.OBSIDIAN_AXE);
        toolItem(ToolRegistry.REDSTONE_AXE);

        toolItem(ToolRegistry.EMERALD_HOE);
        toolItem(ToolRegistry.LAPIS_HOE);
        toolItem(ToolRegistry.OBSIDIAN_HOE);
        toolItem(ToolRegistry.REDSTONE_HOE);
    }

    public void toolItem(Supplier<? extends Item> itemSupplier)
    {
        ResourceLocation location = itemSupplier.get().getRegistryName();
        this.getBuilder(location.getPath()).parent(new ModelFile.UncheckedModelFile("item/handheld")).texture("layer0", new ResourceLocation(location.getNamespace(), "item/" + location.getPath()));
    }
}