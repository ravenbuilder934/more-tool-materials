package moretoolmaterials;

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
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        MinecraftForge.EVENT_BUS.register(this);
    }

}