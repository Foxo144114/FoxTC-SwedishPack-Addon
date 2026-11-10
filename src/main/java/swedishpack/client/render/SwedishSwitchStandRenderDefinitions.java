package swedishpack.client.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import swedishpack.client.render.models.blocks.ModelSvensktVaxelKlotOff;
import swedishpack.client.render.models.blocks.ModelSvensktVaxelKlotOn;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.OnOffSwitchStandRenderDefinition;
import train.client.render.OnOffSwitchStandRenderDefinition.Transform;

/** Swedish skins for FoxTC's shared switch-stand renderer. */
public final class SwedishSwitchStandRenderDefinitions {
    private SwedishSwitchStandRenderDefinitions() {
    }

    /** Preserves the mirrored sides' model states and the original cardinal alignment. */
    public static OnOffSwitchStandRenderDefinition create(String color, boolean sideTwo) {
        String variant = color + (sideTwo ? "Side2" : "Side1");
        ModelBase poweredModel = sideTwo ? new ModelSvensktVaxelKlotOff() : new ModelSvensktVaxelKlotOn();
        ModelBase unpoweredModel = sideTwo ? new ModelSvensktVaxelKlotOn() : new ModelSvensktVaxelKlotOff();
        return new OnOffSwitchStandRenderDefinition(
                poweredModel, texture(variant, "On"), unpoweredModel, texture(variant, "Off"),
                0.5D, 0.0D, 0.5D, 0.0D, 90.0D, 0.0D,
                facing(270.0D), facing(90.0D), facing(0.0D), facing(180.0D));
    }

    private static Transform facing(double rotationY) {
        return new Transform(0.0D, rotationY, 180.0D, 0.0D, 0.0D, 0.0D);
    }

    private static ResourceLocation texture(String variant, String state) {
        return new ResourceLocation(Swedish_PackAddonInfo.resourceLocation,
                Swedish_PackAddonInfo.modelTexPrefix + "SvensktVaxelKlot/" + variant
                        + "/SwedishSwitchStandKlot" + variant + state + ".png");
    }
}
