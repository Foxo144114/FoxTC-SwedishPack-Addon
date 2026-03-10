package swedishpack.client.render.TileRenderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import swedishpack.client.render.models.blocks.ModelPlatformEdge;
import swedishpack.common.library.Swedish_PackAddonInfo;
import swedishpack.common.tiles.tilePlatformEdgeThinTiles;
import tmt.Tessellator;

public class tileRendererPlatformEdgeThinTiles extends TileEntitySpecialRenderer {
    private static final ModelPlatformEdge modelPlatformEdgeThinTiles = new ModelPlatformEdge();
    private static final ResourceLocation texture = new ResourceLocation(Swedish_PackAddonInfo.resourceLocation,Swedish_PackAddonInfo.modelTexPrefix + "PlatformEdge/Platform_Edge_ThinTiles.png");

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        GL11.glPushMatrix();
        GL11.glTranslated(x+0.5,y+0.0,z+0.5);
        GL11.glRotated(180,0,1,0);
        boolean skipRender = false;

        switch (((tilePlatformEdgeThinTiles)tileEntity).getFacing()){
            case 0:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(270,0,1,0);
                GL11.glTranslated(0,0,0.0);//                GL11.glTranslated(0.1875,0,0.125);
                break;
            }
            case 2:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(90,0,1,0);
                GL11.glTranslated(0.0,0,0.0);
                break;
            }
            case 1:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(0,0,1,0);
                GL11.glTranslated(0,0,0.0);
                break;
            }
            case 3:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(180,0,1,0);
                GL11.glTranslated(0,0,0.0);
                break;
            }
            default:{
                skipRender = true;
            }
        }

        if (!skipRender) {

                Tessellator.bindTexture(texture);
                modelPlatformEdgeThinTiles.render(null, 0, 0, 0, 0, 0, 0.0625f);
            }

        GL11.glPopMatrix();
    }
}
