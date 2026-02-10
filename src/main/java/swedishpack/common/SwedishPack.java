package swedishpack.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import swedishpack.common.core.handler.AddonPackRollingStockEntityHandler;
import swedishpack.common.creativetabs.CreativeTabAddonPack;
import swedishpack.common.library.AddonPackItems;
import swedishpack.common.library.Swedish_PackAddonInfo;
import swedishpack.common.recipes.AddonTableRecipeRegister;
import train.common.core.creativetab.GenericCreativeTabTraincraft;


@Mod(modid = Swedish_PackAddonInfo.modID, name = Swedish_PackAddonInfo.modName, version = Swedish_PackAddonInfo.modVersion, dependencies = "required-after:tc")
public class SwedishPack
{
    /* TrainCraft instance */
    @Instance(Swedish_PackAddonInfo.modID)
    public static SwedishPack instance;

    /* TrainCraft Logger */
    public static Logger addonLog = LogManager.getLogger(Swedish_PackAddonInfo.modName);

    public static CreativeTabs addonTabOne;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        addonLog.info("preInit Addon Pack -" + Swedish_PackAddonInfo.modName);
        addonTabOne = new GenericCreativeTabTraincraft("Swedish Pack", Swedish_PackAddonInfo.modID, "apple");

        AddonPackItems addonPackItems = new AddonPackItems();
        AddonPackRollingStockEntityHandler entityHandler = new AddonPackRollingStockEntityHandler();
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        addonLog.info("load Addon Pack -" + Swedish_PackAddonInfo.modName);

        addonLog.info("Initializing recipes...");
        new AddonTableRecipeRegister();

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        addonLog.info("postInit Addon Pack -" + Swedish_PackAddonInfo.modName);
    }
}
