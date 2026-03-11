package swedishpack.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import swedishpack.common.SwedishPack;
import swedishpack.common.tiles.tilePlatformEdgeModern;
import train.common.library.Info;

import java.util.List;

public class blockPlatformEdgeModern extends BlockContainer {

    public blockPlatformEdgeModern(){
        super (Material.rock);
        setCreativeTab(SwedishPack.addonTabOne);
        setHardness(4);
        setResistance(4.0F);
        setHarvestLevel("pickaxe", 1);
        setStepSound(soundTypeStone);

    }
    @Override //actual collision stuff you change
    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
        //this.setBlockBounds(0.0F, 0.0F, 0.0F, 1F, 1F, 1F);
        switch(((tilePlatformEdgeModern)world.getTileEntity(x,y,z)).dir){
            case 0:{this.setBlockBounds(0.0F, 0.0F, 0.0F, 1F, 0.5F, 0.75F); return;}//north
            case 1:{this.setBlockBounds(0.25F, 0.0F, 0.0F, 1F, 0.5F, 1F); return;}//east
            case 2:{this.setBlockBounds(0.0F, 0.0F, 0.25F, 1F, 0.5F, 1.0F); return;}//south
            case 3:{this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.75F, 0.5F, 1F); return;}//west
        }
    }
    @Override
    public int getRenderType(){
        return -1;
    }
    @Override
    public TileEntity createTileEntity(World world, int meta)
    {
       return createNewTileEntity(world, meta);
    }
    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new tilePlatformEdgeModern();
    }

    @Override
    public boolean canCollideCheck(int p_1496781, boolean p_1496782)
    {
        return true;
    }

    @Override //entity collision, this doesn't need changing, but needs inclusion
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return AxisAlignedBB.getBoundingBox((double)x + this.minX, (double)y + this.minY, (double)z + this.minZ, (double)x + this.maxX, (double)y + this.maxY, (double)z + this.maxZ);
    }
  // @Override //actual collision stuff you change
  //  public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z) {
  //      this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.5F, 1F, 0.5F);
  //  }

    @Override //this doesn't need changing but it needs inclusion
    public void addCollisionBoxesToList(World world, int x, int y, int z, AxisAlignedBB hitboxSelf, List hitboxesOther, Entity collidingEntity)
    {
        this.setBlockBoundsBasedOnState(world, x, y, z);
        super.addCollisionBoxesToList(world, x, y, z, hitboxSelf, hitboxesOther, collidingEntity);
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
    {
        //super.onBlockPlacedBy(world, x, y, z, entity, stack);
        //force tile spawn manually and override any existing tile at the space
        tilePlatformEdgeModern tile = new tilePlatformEdgeModern(MathHelper.floor_double((entity.rotationYaw / 90.0F) + 2.5D) & 3);
        world.setTileEntity(x, y ,z, tile);
    }

    private IIcon texture;

    @Override
    public IIcon getIcon(int i, int j) {
        return texture;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        texture = iconRegister.registerIcon(Info.modID + ":asphalt");
    }
}

