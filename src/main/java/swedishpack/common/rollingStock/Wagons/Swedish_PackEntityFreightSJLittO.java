package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittO;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Swedish_PackEntityFreightSJLittO extends AbstractStandardFreightCar {
	
	public Swedish_PackEntityFreightSJLittO(World world) {
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
				Swedish_PackEntityFreightSJLittO.class, new ModelSJLittO(),
				"SJLittO_",
				new float[] {-1.70F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/O_Wagons/O_/SJLittO_WithoutSides";
						break;
					case "red":
						texturePath = "textures/trains/Wagons/O_Wagons/O_/SJLittO_WithSides";
						break;
					case "yellow":
						texturePath = "textures/trains/Wagons/O_Wagons/O_/SJLittO_WithoutSides_Modern";
						break;
					case "green":
						texturePath = "textures/trains/Wagons/O_Wagons/O_/SJLittO_WithSides_Modern";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}


	

	
	@Override
	public String getInventoryName() {
		return "SJ Litt O";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.15F;
	}


}