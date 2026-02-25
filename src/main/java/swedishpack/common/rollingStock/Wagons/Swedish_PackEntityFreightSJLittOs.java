package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittOs;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Swedish_PackEntityFreightSJLittOs extends AbstractStandardFreightCar {
	
	public Swedish_PackEntityFreightSJLittOs(World world) {
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
				Swedish_PackEntityFreightSJLittOs.class, new ModelSJLittOs(),
				"SJLittO_",
				new float[] {-1.35F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/O_Wagons/Os_/SJLittOs_WithoutSides";
						break;
					case "red":
						texturePath = "textures/trains/Wagons/O_Wagons/Os_/SJLittOs_WithSides";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}

	

	
	@Override
	public String getInventoryName() {
		return "SJ Litt Os";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.85F;
	}


}