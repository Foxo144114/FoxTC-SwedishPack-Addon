package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.api.Freight;
import train.common.entity.CargoManager;
import train.common.library.GuiIDs;

public class Swedish_PackEntityFreightSJLittM21908 extends AbstractStandardFreightCar {
	
	public Swedish_PackEntityFreightSJLittM21908(World world) {
		super(world);
		setupTextureDescription();
	}

	@Override
	public CargoManager setupCargoManager() {
		return null;
	}

	@Override
	public void setupTextureDescription() {
		InsertTexture(0, "Closed");
		InsertTexture(1, "Open");
	}



	public Swedish_PackEntityFreightSJLittM21908(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + (double) yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	

	
	@Override
	public String getInventoryName() {
		return "SJ Litt M2 (1908)";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.25F;
	}


}