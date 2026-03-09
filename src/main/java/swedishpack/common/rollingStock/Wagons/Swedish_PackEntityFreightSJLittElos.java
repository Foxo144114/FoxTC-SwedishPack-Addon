package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittElosCargo;
import swedishpack.client.render.models.ModelSJLittElos;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class Swedish_PackEntityFreightSJLittElos extends AbstractStandardFreightCar {

	public Swedish_PackEntityFreightSJLittElos(World world) {
		super(world);
		setupTextureDescription();
		setCargoManager(new CargoManager(new CargoSpecification[][]
				{
						{ new CargoSpecification(ModelSJLittElosCargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/E_Wagons/Elos_/Cargo/SJLittElos_L1_Gravel", "1st layer Gravel",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittElosCargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/E_Wagons/Elos_/Cargo/SJLittElos_L2_Gravel", "2nd layer Gravel",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittElosCargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/E_Wagons/Elos_/Cargo/SJLittElos_L3_Gravel", "3rd layer Gravel",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
				}));
	}

	@Override
	public CargoManager setupCargoManager() {
		return null;
	}

	@Override
	public void setupTextureDescription() {
		InsertTexture(0, "Red walls");
		InsertTexture(1, "Red walls with yellow detailss");
	}



	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityFreightSJLittElos.class, new ModelSJLittElos(),
				"SJLittElos_",
				new float[] {-1.9F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/E_Wagons/Elos_/SJLittElos_NS";
						break;
					case "red":
						texturePath = "textures/trains/Wagons/E_Wagons/Elos_/SJLittElos_WS";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}

	
	@Override
	public String getInventoryName() {
		return "SJ Elos";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.4F;
	}


}