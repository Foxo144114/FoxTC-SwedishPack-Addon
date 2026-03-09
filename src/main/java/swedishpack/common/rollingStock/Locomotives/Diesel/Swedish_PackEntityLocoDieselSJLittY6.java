package swedishpack.common.rollingStock.Locomotives.Diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittY6;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class Swedish_PackEntityLocoDieselSJLittY6 extends DieselTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoDieselSJLittY6.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Info.resourceLocation +" ", 0 );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoDieselSJLittY6(World world) {
		super(world, Traincraft.traincraftRegistry.getTrainRecord(Swedish_PackEntityLocoDieselSJLittY6.class).getTankCapacity(), LiquidManager.dieselFilter());
		setupTextureDescription();
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 5.2, -0.1, 0.3); }


	@Override
	public String transportCountry() {
		return "SE";
	}

	@Override
	public String getInventoryName() {
		return "SJ Y6";
	}

	public void setupTextureDescription() {
		InsertTexture(0, "South Plow");
		InsertTexture(1, "North Plow");
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.95F;
	}
	@Override
	public void onRenderInsertRecord()
	{

		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoDieselSJLittY6.class, new ModelSJLittY6(),
				"Y6_",
				new float[] {-5.8F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null,"smoke", new ArrayList<double[]>() { { add(new double[]{-0.3D, 1.2D, 0.0D}); } },
				null, null, 5, 0){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Diesel/Y6_/Y6_South";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Diesel/Y6_/Y6_North";
						break;

				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		}
		);
	}
}