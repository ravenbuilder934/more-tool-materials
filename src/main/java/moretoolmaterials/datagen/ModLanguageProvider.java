package moretoolmaterials.datagen;

import moretoolmaterials.MoreToolMaterials;
import moretoolmaterials.registry.ArmorRegistry;
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
        addItem(ToolRegistry.EMERALD_SWORD, "Emerald Sword");
        addItem(ToolRegistry.LAPIS_SWORD, "Lapis Lazuli Sword");
        addItem(ToolRegistry.OBSIDIAN_SWORD, "Obsidian Sword");
        addItem(ToolRegistry.REDSTONE_SWORD, "Redstone Sword");

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

        addItem(ArmorRegistry.EMERALD_HELMET, "Emerald Helmet");
        addItem(ArmorRegistry.LAPIS_HELMET, "Lapis Lazuli Helmet");
        addItem(ArmorRegistry.OBSIDIAN_HELMET, "Obsidian Helmet");
        addItem(ArmorRegistry.REDSTONE_HELMET, "Redstone Helmet");

        addItem(ArmorRegistry.EMERALD_CHESTPLATE, "Emerald Chestplate");
        addItem(ArmorRegistry.LAPIS_CHESTPLATE, "Lapis Lazuli Chestplate");
        addItem(ArmorRegistry.OBSIDIAN_CHESTPLATE, "Obsidian Chestplate");
        addItem(ArmorRegistry.REDSTONE_CHESTPLATE, "Redstone Chestplate");

        addItem(ArmorRegistry.EMERALD_LEGGINGS, "Emerald Leggings");
        addItem(ArmorRegistry.LAPIS_LEGGINGS, "Lapis Lazuli Leggings");
        addItem(ArmorRegistry.OBSIDIAN_LEGGINGS, "Obsidian Leggings");
        addItem(ArmorRegistry.REDSTONE_LEGGINGS, "Redstone Leggings");

        addItem(ArmorRegistry.EMERALD_BOOTS, "Emerald Boots");
        addItem(ArmorRegistry.LAPIS_BOOTS, "Lapis Lazuli Boots");
        addItem(ArmorRegistry.OBSIDIAN_BOOTS, "Obsidian Boots");
        addItem(ArmorRegistry.REDSTONE_BOOTS, "Redstone Boots");
    }

}