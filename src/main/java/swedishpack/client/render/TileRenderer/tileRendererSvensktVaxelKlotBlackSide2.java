package swedishpack.client.render.TileRenderer;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import swedishpack.client.render.models.blocks.ModelSvensktVaxelKlotOff;
import swedishpack.client.render.models.blocks.ModelSvensktVaxelKlotOn;
import swedishpack.common.library.Swedish_PackAddonInfo;
import tmt.Tessellator;
import train.common.tile.TileSwitchStand;

public class tileRendererSvensktVaxelKlotBlackSide2 extends TileEntitySpecialRenderer {
    private static final ModelSvensktVaxelKlotOff modelSwitch2 = new ModelSvensktVaxelKlotOff();
    private static final ModelSvensktVaxelKlotOn modelSwitch = new ModelSvensktVaxelKlotOn();
    private static final ResourceLocation texture2 = new ResourceLocation(Swedish_PackAddonInfo.resourceLocation,Swedish_PackAddonInfo.modelTexPrefix + "SvensktVaxelKlot/BlackSide2/SwedishSwitchStandKlotBlackSide2On.png");
    private static final ResourceLocation texture = new ResourceLocation(Swedish_PackAddonInfo.resourceLocation,Swedish_PackAddonInfo.modelTexPrefix + "SvensktVaxelKlot/BlackSide2/SwedishSwitchStandKlotBlackSide2Off.png");

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick) {
        GL11.glPushMatrix();
        GL11.glTranslated(x+0.5,y+0.0,z+0.5);
        GL11.glRotated(90,0,1,0);
        boolean skipRender = false;

        switch (((TileSwitchStand)tileEntity).getFacing()){
            case NORTH:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(270,0,1,0);
                GL11.glTranslated(0,0,0.0);//                GL11.glTranslated(0.1875,0,0.125);
                break;
            }
            case SOUTH:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(90,0,1,0);
                GL11.glTranslated(0.0,0,0.0);
                break;
            }
            case EAST:{
                GL11.glRotated(180,0,0,1);
                GL11.glRotated(0,0,1,0);
                GL11.glTranslated(0,0,0.0);
                break;
            }
            case WEST:{
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
            if (tileEntity.getWorldObj().getBlock(tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord).isProvidingWeakPower(tileEntity.getWorldObj(), tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord, 0) > 0) {
                Tessellator.bindTexture(texture2);
                modelSwitch2.render(null, 0, 0, 0, 0, 0, 0.0625f);
            } else {
                Tessellator.bindTexture(texture);
                modelSwitch.render(null, 0, 0, 0, 0, 0, 0.0625f);
            }
        }
        GL11.glPopMatrix();
    }
}
