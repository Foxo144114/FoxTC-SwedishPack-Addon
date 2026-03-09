package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.*;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class Swedish_PackEntityFreightSJLittM1 extends AbstractStandardFreightCar {

	public Swedish_PackEntityFreightSJLittM1(World world) {
		super(world);
		setupTextureDescription();

	}

	@Override
	public CargoManager setupCargoManager() {

		return	new CargoManager(new CargoSpecification[][]
				{
						{ new CargoSpecification(ModelSJLittM1Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/M_Wagons/M1/SJLittM1Cargo_Load", "Loaded with Iron Ore",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
				});


	}
	@Override
	public void setupTextureDescription() {
		InsertTexture(0, "Light Grey, Closed");
		InsertTexture(1, "Light Grey, Open");
		InsertTexture(2, "Dark Grey, Closed");
		InsertTexture(3, "Dark Grey, Open");
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityFreightSJLittM1.class, new ModelSJLittM1(),
				"SJLittM1_",
				new float[] {-0.775F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/M_Wagons/M1_/SJLittM1_Light_Closed";
						break;
					case "red":
						texturePath = "textures/trains/Wagons/M_Wagons/M1_/SJLittM1_Light_Open";
						break;
					case "yellow":
						texturePath = "textures/trains/Wagons/M_Wagons/M1_/SJLittM1_Dark_Closed";
						break;
					case "green":
						texturePath = "textures/trains/Wagons/M_Wagons/M1_/SJLittM1_Dark_Open";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}


	

	
	@Override
	public String getInventoryName() {
		return "SJ Litt M1";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.20F;
	}


}