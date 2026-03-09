package swedishpack.common.library;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import train.common.library.IBlockIDs;

public enum SwedishBlockIDs implements IBlockIDs {
  SvensktVaxelKlotGreySide1(null),
    SvensktVaxelKlotGreySide2(null),

    SvensktVaxelKlotGreenSide1(null),
    SvensktVaxelKlotGreenSide2(null),

    SvensktVaxelKlotBlackSide1(null),
    SvensktVaxelKlotBlackSide2(null),
    ;

    public Block block;

   SwedishBlockIDs(Class<? extends ItemBlock> itemBlockClass) {
        this.itemBlockClass = itemBlockClass;
    }
    public Class itemBlockClass;
    @Override
    public Block getBlock() {
        return null;
    }

    @Override
    public boolean hasItemBlock() {
        return false;
    }

    @Override
    public Class getItemBlockClass() {
        return null;
    }

    @Override
    public int getMaxMetaData() {
        return 0;
    }
}
