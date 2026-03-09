package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittQ12;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardTankerCar;


public class Swedish_PackEntityEntityWagonSJLittQ12 extends AbstractStandardTankerCar {

	public Swedish_PackEntityEntityWagonSJLittQ12(World world) {
		super(world, Traincraft.traincraftRegistry.getTrainRecord(Swedish_PackEntityEntityWagonSJLittQ12.class).getTankCapacity());
		setupTextureDescription();
	}

	@Override
	public void setupTextureDescription() {
		InsertTexture(0, "Spoked Wheels");
		InsertTexture(1, "Normal Wheels");
	}

	@Override
	public String getInventoryName() {
		return "SJ Litt Q12";
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityEntityWagonSJLittQ12.class, new ModelSJLittQ12(),
				"SJLittQ12_",
				new float[] {-1.7F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/Q_Wagons/Q12_/SJLittQ12_Silver_Old";
						break;
					case "red":
						texturePath = "textures/trains/Wagons/Q_Wagons/Q12_/SJLittQ12_Silver_New";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.1F;
	}
}