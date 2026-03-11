package swedishpack.client.render.ItemRenderer;


import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;
import swedishpack.client.render.models.blocks.ModelPlatformEdgeModern;
import swedishpack.common.library.Swedish_PackAddonInfo;
import tmt.Tessellator;

public class ItemRendererPlatformEdgeModern implements IItemRenderer {

    private static final ModelPlatformEdgeModern modelPlatformEdge = new ModelPlatformEdgeModern();
    private static final ResourceLocation texture = new ResourceLocation(Swedish_PackAddonInfo.resourceLocation, Swedish_PackAddonInfo.modelTexPrefix + "PlatformEdge/Platform_Commuter_Edge.png");

    public ItemRendererPlatformEdgeModern() {
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {
            case ENTITY: {
                renderSwitch(0f, 0f, 0f, 1f);
                return;
            }
            case EQUIPPED: {
                renderSwitch(0.2f, 1f, 1f, 1f);
                return;
            }
            case EQUIPPED_FIRST_PERSON: {
                renderSwitch(0.2f, 1f, 1f, 1f);
                return;
            }
            case INVENTORY: {
                renderSwitch(0f, 0f, 0f, 0.7f);
                return;
            }
            default:
                break;
        }
    }

    private void renderSwitch(float x, float y, float z, float scale) {
        GL11.glPushMatrix();
        GL11.glDisable(GL11.GL_LIGHTING);

        GL11.glTranslatef(x, y, z);
        GL11.glScalef(scale, scale, scale);
        GL11.glRotated(180,0,0,1);
        GL11.glRotated(180,0,1,0);

        Tessellator.bindTexture(texture);

        modelPlatformEdge.render(null,0,0,0,0,0,0.0625f);

        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }





}
