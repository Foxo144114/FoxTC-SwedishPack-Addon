package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;


public class Swedish_PackEntityFreightSJLittM1 extends AbstractStandardFreightCar {
	
	public Swedish_PackEntityFreightSJLittM1(World world) {
		super(world);

	}

	@Override
	public CargoManager setupCargoManager() {
		return null;
	}

	@Override
	public void setupTextureDescription() {

	}


	@Override
	public String getInventoryName() {
		return "SJ Litt M1";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.25F;
	}


}