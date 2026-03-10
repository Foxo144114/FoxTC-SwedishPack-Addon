package swedishpack.common.core;

import cpw.mods.fml.common.registry.GameRegistry;
import swedishpack.common.tiles.*;

public class CommonProxy {

    public void registerRenderInformation() {}

    public void registerTileEntities()
    {
        GameRegistry.registerTileEntity(tileSvensktVaxelKlotGreySide1.class, "tileSvensktVaxelKlotGreySide1");
        GameRegistry.registerTileEntity(tileSvensktVaxelKlotGreySide2.class, "tileSvensktVaxelKlotGreySide2");

        GameRegistry.registerTileEntity(tileSvensktVaxelKlotGreenSide1.class, "tileSvensktVaxelKlotGreenSide1");
        GameRegistry.registerTileEntity(tileSvensktVaxelKlotGreenSide2.class, "tileSvensktVaxelKlotGreenSide2");

        GameRegistry.registerTileEntity(tileSvensktVaxelKlotBlackSide1.class, "tileSvensktVaxelKlotBlackSide1");
        GameRegistry.registerTileEntity(tileSvensktVaxelKlotBlackSide2.class, "tileSvensktVaxelKlotBlackSide2");

        GameRegistry.registerTileEntity(tilePlatformEdgeAsphalt.class, "tilePlatformEdgeAsphalt");
        GameRegistry.registerTileEntity(tilePlatformEdgeTiles.class, "tilePlatformEdgeTiles");
        GameRegistry.registerTileEntity(tilePlatformEdgeThinTiles.class, "tilePlatformEdgeThinTiles");
    }
}
