package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittOaVagn;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;

public class Swedish_PackEntityFreightSJLittOaVagn extends AbstractStandardFreightCar {
	
	public Swedish_PackEntityFreightSJLittOaVagn(World world) {
		super(world);
		setupTextureDescription();
	}

	@Override
	public CargoManager setupCargoManager() {
		return null;
	}

	@Override
	public void setupTextureDescription() {
		InsertTexture(0, "With Walls");
	}


	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityFreightSJLittOaVagn.class, new ModelSJLittOaVagn(),
				"SJLittOaVagn_",
				new float[] {-1.65F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/O_Wagons/Oa_/SJLittOaVagn_Empty";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}

	
	@Override
	public String getInventoryName() {
		return "SJ Litt Oa";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.15F;
	}


}