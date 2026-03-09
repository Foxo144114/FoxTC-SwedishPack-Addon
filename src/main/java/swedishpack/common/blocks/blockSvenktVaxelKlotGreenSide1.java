package swedishpack.common.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import swedishpack.common.SwedishPack;
import swedishpack.common.tiles.tileSvensktVaxelKlotGreenSide1;
import train.common.blocks.BlockSwitchStand;

public class blockSvenktVaxelKlotGreenSide1 extends BlockSwitchStand {

    public blockSvenktVaxelKlotGreenSide1(){
        super ();
        setCreativeTab(SwedishPack.addonTabOne);
        setHardness(4);
        setStepSound(soundTypeMetal);
    }

    @Override
    public TileEntity createTileEntity(World world, int i) {
        return new tileSvensktVaxelKlotGreenSide1();
    }
}
