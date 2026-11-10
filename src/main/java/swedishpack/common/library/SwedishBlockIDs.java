package swedishpack.common.library;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import train.common.library.IBlockIDs;
import train.common.items.ItemBlockSwitchStand;

public enum SwedishBlockIDs implements IBlockIDs {
    SvensktVaxelKlotGreySide1(ItemBlockSwitchStand.class),
    SvensktVaxelKlotGreySide2(ItemBlockSwitchStand.class),

    SvensktVaxelKlotGreenSide1(ItemBlockSwitchStand.class),
    SvensktVaxelKlotGreenSide2(ItemBlockSwitchStand.class),

    SvensktVaxelKlotBlackSide1(ItemBlockSwitchStand.class),
    SvensktVaxelKlotBlackSide2(ItemBlockSwitchStand.class),

    PlatformEdgeAsphalt(null),
    PlatformEdgeTiles(null),
    PlatformEdgeThinTiles(null),
    PlatformEdgeModern(null),
    ;

    public Block block;

    SwedishBlockIDs(Class<? extends ItemBlock> itemBlockClass) {
        this.itemBlockClass = itemBlockClass;
    }
    public Class itemBlockClass;
    @Override
    public Block getBlock() {
        return block;
    }

    @Override
    public boolean hasItemBlock() {
        return itemBlockClass != null;
    }

    @Override
    public Class getItemBlockClass() {
        return itemBlockClass;
    }

    @Override
    public int getMaxMetaData() {
        return 0;
    }
}

