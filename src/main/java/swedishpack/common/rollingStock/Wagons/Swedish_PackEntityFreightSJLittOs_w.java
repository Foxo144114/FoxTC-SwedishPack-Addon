package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittOs_w;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Swedish_PackEntityFreightSJLittOs_w extends AbstractStandardFreightCar {
	
	public Swedish_PackEntityFreightSJLittOs_w(World world) {
		super(world);
		setupTextureDescription();
	}

	@Override
	public CargoManager setupCargoManager() {
		return null;
	}

	@Override
	public void setupTextureDescription() {
		InsertTexture(0, "Without Walls");
		InsertTexture(1, "With Walls");
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityFreightSJLittOs_w.class, new ModelSJLittOs_w(),
				"SJLittOs_w_",
				new float[] {-1.90F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/O_Wagons/Os_w_/SJLittOs_w_WithoutSides";
						break;
					case "red":
						texturePath = "textures/trains/Wagons/O_Wagons/Os_w_/SJLittOs_w_WithSides";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}


	

	
	@Override
	public String getInventoryName() {
		return "SJ Litt Os-w";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.36F;
	}


}