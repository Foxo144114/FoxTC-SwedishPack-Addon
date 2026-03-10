package swedishpack.client.core;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import swedishpack.client.render.ItemRenderer.*;
import swedishpack.client.render.TileRenderer.*;
import swedishpack.common.core.CommonProxy;
import swedishpack.common.library.SwedishBlockIDs;
import swedishpack.common.tiles.*;

public class ClientProxy extends CommonProxy
{

    @Override
    public void registerRenderInformation()
    {
        ClientRegistry.bindTileEntitySpecialRenderer(tileSvensktVaxelKlotGreySide1.class, new tileRendererSvensktVaxelKlotGreySide1());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(SwedishBlockIDs.SvensktVaxelKlotGreySide1.block), new ItemRendererSvensktVaxelKlotGreySide1());

        ClientRegistry.bindTileEntitySpecialRenderer(tileSvensktVaxelKlotGreySide2.class, new tileRendererSvensktVaxelKlotGreySide2());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(SwedishBlockIDs.SvensktVaxelKlotGreySide2.block), new ItemRendererSvensktVaxelKlotGreySide2());


        ClientRegistry.bindTileEntitySpecialRenderer(tileSvensktVaxelKlotGreenSide1.class, new tileRendererSvensktVaxelKlotGreenSide1());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(SwedishBlockIDs.SvensktVaxelKlotGreenSide1.block), new ItemRendererSvensktVaxelKlotGreenSide1());

        ClientRegistry.bindTileEntitySpecialRenderer(tileSvensktVaxelKlotGreenSide2.class, new tileRendererSvensktVaxelKlotGreenSide2());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(SwedishBlockIDs.SvensktVaxelKlotGreenSide2.block), new ItemRendererSvensktVaxelKlotGreenSide2());


        ClientRegistry.bindTileEntitySpecialRenderer(tileSvensktVaxelKlotBlackSide1.class, new tileRendererSvensktVaxelKlotBlackSide1());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(SwedishBlockIDs.SvensktVaxelKlotBlackSide1.block), new ItemRendererSvensktVaxelKlotBlackSide1());

        ClientRegistry.bindTileEntitySpecialRenderer(tileSvensktVaxelKlotBlackSide2.class, new tileRendererSvensktVaxelKlotBlackSide2());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(SwedishBlockIDs.SvensktVaxelKlotBlackSide2.block), new ItemRendererSvensktVaxelKlotBlackSide2());

        ClientRegistry.bindTileEntitySpecialRenderer(tilePlatformEdgeAsphalt.class, new tileRendererPlatformEdgeAsphalt());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(SwedishBlockIDs.PlatformEdgeAsphalt.block), new ItemRendererPlatformEdgeAsphalt());
        ClientRegistry.bindTileEntitySpecialRenderer(tilePlatformEdgeTiles.class, new tileRendererPlatformEdgeTiles());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(SwedishBlockIDs.PlatformEdgeTiles.block), new ItemRendererPlatformEdgeTiles());
        ClientRegistry.bindTileEntitySpecialRenderer(tilePlatformEdgeThinTiles.class, new tileRendererPlatformEdgeThinTiles());
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(SwedishBlockIDs.PlatformEdgeThinTiles.block), new ItemRendererPlatformEdgeThinTiles());
    }

}
