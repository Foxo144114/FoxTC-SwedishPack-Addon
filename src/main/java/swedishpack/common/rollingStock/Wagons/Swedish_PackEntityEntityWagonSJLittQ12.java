package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.api.AbstractStandardTankerCar;


public class Swedish_PackEntityEntityWagonSJLittQ12 extends AbstractStandardTankerCar {

	public Swedish_PackEntityEntityWagonSJLittQ12(World world) {
		super(world);

	}

	@Override
	public void setupTextureDescription() {

	}

	@Override
	public String getInventoryName() {
		return "SJ Litt Q12";
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemStack) {
		return false;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.15F;
	}
}