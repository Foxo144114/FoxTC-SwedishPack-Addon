package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittLgs;
import swedishpack.client.render.models.ModelSJLittRc;
import swedishpack.common.library.Swedish_PackAddonInfo;
import swedishpack.common.rollingStock.Swedish_PackEntityLocoElectricSJLittRc1;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;


public class Swedish_PackEntityFreightSJLittLgs extends AbstractStandardFreightCar {
	
	public Swedish_PackEntityFreightSJLittLgs(World world) {
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
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityFreightSJLittLgs.class, new ModelSJLittLgs(),
				"Rc1_",
				new float[] {-4.8F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Rc1_/Rc1_sjo_Mno";
						break;



				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}





	@Override
	public String getInventoryName() {
		return "SJ Litt Lgs";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.4F;
	}


}