package swedishpack.common.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import swedishpack.common.SwedishPack;
import swedishpack.common.tiles.tileSvensktMotorVaxelSide2;
import swedishpack.common.tiles.tileSvensktVaxelKlotBlackSide1;
import train.common.blocks.BlockSwitchStand;

public class blockSvenktMotorVaxelSide2 extends BlockSwitchStand {

    public blockSvenktMotorVaxelSide2(){
        super ();
        setCreativeTab(SwedishPack.addonTabOne);
        setHardness(4);
        setStepSound(soundTypeMetal);
    }

    @Override
    public TileEntity createTileEntity(World world, int i) {
        return new tileSvensktMotorVaxelSide2();
    }
}
