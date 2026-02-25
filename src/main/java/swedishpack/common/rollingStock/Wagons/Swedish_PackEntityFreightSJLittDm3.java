package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittDm3;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.enums.CargoItemFilter;

public class Swedish_PackEntityFreightSJLittDm3 extends AbstractStandardFreightCar {
	
	public Swedish_PackEntityFreightSJLittDm3(World world) {
		super(world);
		cargoFilterCategory = CargoItemFilter.REDSTONE;
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
				Swedish_PackEntityFreightSJLittDm3.class, new ModelSJLittDm3(),
				"Dm3_",
				new float[] {-3.05F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "brown":
						texturePath = "textures/trains/Locomotives/Electric/Dm3_/Dm3_Spoked";
						break;
					case "red":
						texturePath = "textures/trains/Locomotives/Electric/Dm3_/Dm3_SABMarsal";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Electric/Dm3_/Dm3_LKAB";
						break;


				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}

	

	
	@Override
	public String getInventoryName() {
		return "SJ Litt Dm3";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.3F;
	}


}