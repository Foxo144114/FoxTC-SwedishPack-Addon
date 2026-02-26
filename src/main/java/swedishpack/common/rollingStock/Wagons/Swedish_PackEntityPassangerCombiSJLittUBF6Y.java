package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittUBF6Y;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractPassengerCombineCar;


public class Swedish_PackEntityPassangerCombiSJLittUBF6Y extends AbstractPassengerCombineCar {

	public Swedish_PackEntityPassangerCombiSJLittUBF6Y(World world) {
		super(world);

	}

	@Override
	public void setupTextureDescription() {

	}


	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityPassangerCombiSJLittUBF6Y.class, new ModelSJLittUBF6Y(),
				"UBF6Y_",
				new float[] {-3.6F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/U_Wagons/Railbus_/UBF6Y_/UBF6Y_South";
						break;
					case "green":
						texturePath = "textures/trains/Wagons/U_Wagons/Railbus_/UBF6Y_/UBF6Y_North";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}



	@Override
	public String getInventoryName() {
		return "SJ UBF6Y";
	}



	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 4.175F;
	}

}