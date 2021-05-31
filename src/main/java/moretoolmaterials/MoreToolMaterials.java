package moretoolmaterials;

import moretoolmaterials.datagen.GatherData;
import moretoolmaterials.registry.ToolRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("moretoolmaterials")
public class MoreToolMaterials
{
    public static final String MOD_ID = "moretoolmaterials";

    public MoreToolMaterials()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(GatherData::init);
        ToolRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

}