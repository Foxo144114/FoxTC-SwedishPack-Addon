package swedishpack.common.library;

import cpw.mods.fml.common.registry.GameRegistry;
import swedishpack.common.blocks.*;

public class AddonPackBlocks
{
    public AddonPackBlocks(){
        SwedishBlockIDs.SvensktVaxelKlotGreySide1.block = new blockSvenktVaxelKlotGreySide1();
        SwedishBlockIDs.SvensktVaxelKlotGreySide2.block = new blockSvenktVaxelKlotGreySide2();

        SwedishBlockIDs.SvensktVaxelKlotGreenSide1.block = new blockSvenktVaxelKlotGreenSide1();
        SwedishBlockIDs.SvensktVaxelKlotGreenSide2.block = new blockSvenktVaxelKlotGreenSide2();

        SwedishBlockIDs.SvensktVaxelKlotBlackSide1.block = new blockSvenktVaxelKlotBlackSide1();
        SwedishBlockIDs.SvensktVaxelKlotBlackSide2.block = new blockSvenktVaxelKlotBlackSide2();


        for (SwedishBlockIDs blocks : SwedishBlockIDs.values()) {
            if(blocks.block != null) {
                blocks.block.setBlockName(Swedish_PackAddonInfo.modID + ":" + blocks.name());
                if (blocks.hasItemBlock()) {
                    GameRegistry.registerBlock(blocks.block, blocks.itemBlockClass, blocks.name());
                } else {
                    GameRegistry.registerBlock(blocks.block, blocks.name());
                }
            }
        }
    }









}
