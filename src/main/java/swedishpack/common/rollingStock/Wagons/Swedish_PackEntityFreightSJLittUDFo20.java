package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittUDFo20;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Swedish_PackEntityFreightSJLittUDFo20 extends AbstractStandardFreightCar {
	
	public Swedish_PackEntityFreightSJLittUDFo20(World world) {
		super(world);
		setupTextureDescription();
	}

	@Override
	public CargoManager setupCargoManager() {
		return null;
	}

	@Override
	public void setupTextureDescription() {
		InsertTexture(0, "UDFo20");
	}


	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityFreightSJLittUDFo20.class, new ModelSJLittUDFo20(),
				"UDFo20_",
				new float[] {-3.6F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/U_Wagons/Railbus_/UDFo20_/UDFo20";
						break;


				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}



		@Override
		public String getInventoryName() {
		return "SJ UDFo20";
	}



		@Override
		public float getOptimalDistance(EntityMinecart cart) {
		return 4.175F;
	}



	}