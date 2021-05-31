package moretoolmaterials.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

public class GatherData
{
    public static void init(final GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if(event.includeClient())
        {
            generator.addProvider(new ModLanguageProvider(generator));
            generator.addProvider(new ModItemModelProvider(generator, helper));
        }
    }
}
