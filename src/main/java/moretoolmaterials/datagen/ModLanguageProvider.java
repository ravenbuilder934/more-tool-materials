package moretoolmaterials.datagen;

import moretoolmaterials.MoreToolMaterials;
import moretoolmaterials.registry.ToolRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider 
{

    public ModLanguageProvider(DataGenerator generatorIn) 
    {
        super(generatorIn, MoreToolMaterials.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() 
    {
        addItem(ToolRegistry.EMERALD_SHOVEL, "Emerald Shovel");
        addItem(ToolRegistry.LAPIS_SHOVEL, "Lapis Lazuli Shovel");
        addItem(ToolRegistry.OBSIDIAN_SHOVEL, "Obsidian Shovel");
        addItem(ToolRegistry.REDSTONE_SHOVEL, "Redstone Shovel");

        addItem(ToolRegistry.EMERALD_PICKAXE, "Emerald Pickaxe");
        addItem(ToolRegistry.LAPIS_PICKAXE, "Lapis Lazuli Pickaxe");
        addItem(ToolRegistry.OBSIDIAN_PICKAXE, "Obsidian Pickaxe");
        addItem(ToolRegistry.REDSTONE_PICKAXE, "Redstone Pickaxe");

        addItem(ToolRegistry.EMERALD_AXE, "Emerald Axe");
        addItem(ToolRegistry.LAPIS_AXE, "Lapis Lazuli Axe");
        addItem(ToolRegistry.OBSIDIAN_AXE, "Obsidian Axe");
        addItem(ToolRegistry.REDSTONE_AXE, "Redstone Axe");

        addItem(ToolRegistry.EMERALD_HOE, "Emerald Hoe");
        addItem(ToolRegistry.LAPIS_HOE, "Lapis Lazuli Hoe");
        addItem(ToolRegistry.OBSIDIAN_HOE, "Obsidian Hoe");
        addItem(ToolRegistry.REDSTONE_HOE, "Redstone Hoe");
    }
    
}