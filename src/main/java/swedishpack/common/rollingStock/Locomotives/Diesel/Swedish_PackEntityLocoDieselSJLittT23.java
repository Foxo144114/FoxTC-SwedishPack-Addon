package swedishpack.common.rollingStock.Locomotives.Diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittT23;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class Swedish_PackEntityLocoDieselSJLittT23 extends DieselTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoDieselSJLittT23.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":ALCO_16_251C_Notch8", 0.2F, 50, Info.resourceLocation +":ALCO_16_251C_Idle" , 0.2F, 69, false, Info.resourceLocation +" ", 0 );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoDieselSJLittT23(World world) {
		super(world, Traincraft.traincraftRegistry.getTrainRecord(Swedish_PackEntityLocoDieselSJLittT23.class).getTankCapacity(), LiquidManager.dieselFilter());
		setupTextureDescription();
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 1.2, 0.5, 0.3); }


	@Override
	public String transportCountry() {
		return "SE";
	}

	@Override
	public String getInventoryName() {
		return "SJ T23";
	}

	public void setupTextureDescription() {
		InsertTexture(0, "SJ, Service, No Slickepinnar, With Plow");
		InsertTexture(1, "SJ, Service, No Slickepinnar, Without Plow");
		InsertTexture(2, "SJ, Maintinence, No Slickepinnar, With Plow");
		InsertTexture(3, "SJ, Maintinence, No Slickepinnar, Without Plow");
		InsertTexture(4, "SJ, Service, Slickepinnar, With Plow");
		InsertTexture(5, "SJ, Service, Slickepinnar, Without Plow");
		InsertTexture(6, "SJ, Maintinence, Slickepinnar, With Plow");
		InsertTexture(7, "SJ, Maintinence, Slickepinnar, Without Plow");
		InsertTexture(8, "GBBJ, Service, With Plow");
		InsertTexture(9, "GBBJ, Service, Without Plow");
		InsertTexture(10, "GBBJ, Maintinence, With Plow");
		InsertTexture(11, "GBBJ, Maintinence, Without Plow");
		InsertTexture(12, "Green, Service, With Plow");
		InsertTexture(13, "Green, Service, Without Plow");
		InsertTexture(14, "Green, Maintinence, With Plow");
		InsertTexture(15, "Green, Maintinence, Without Plow");
		InsertTexture(16, "Gulfiber, Service, With Plow");
		InsertTexture(17, "Gulfiber, Service, Without Plow");
		InsertTexture(18, "Gulfiber, Maintinence, With Plow");
		InsertTexture(19, "Gulfiber, Maintinence, Without Plow");
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.05F;
	}
	@Override
	public void onRenderInsertRecord()
	{

		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoDieselSJLittT23.class, new ModelSJLittT23(),
				"T23_",
				new float[] {-3.9F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null,"smoke", new ArrayList<double[]>() { { add(new double[]{1.45D, 1.55D, 0.0D}); } },
				null, null, 5, 0){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_S_WP";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_S_NP";
						break;
					case "green":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_O_WP";
						break;
					case "black":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_O_NP";
						break;
					case "white":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_S_WP_ES";
						break;
					case "grey":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_S_NP_ES";
						break;
					case "magenta":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_O_WP_ES";
						break;
					case "lightblue":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_O_NP_ES";
						break;
					case "lime":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_S_WP_GBBJ";
						break;
					case "lightgrey":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_S_NP_GBBJ";
						break;
					case "cyan":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_O_WP_GBBJ";
						break;
					case "pink":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_O_NP_GBBJ";
						break;
					case "purple":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_S_WP_ESG";
						break;
					case "brown":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_S_NP_ESG";
						break;
					case "orange":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_O_WP_ESG";
						break;
					case "red":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_O_NP_ESG";
						break;
					case "skin16":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_S_WP_Gf";
						break;
					case "skin17":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_S_NP_Gf";
						break;
					case "skin18":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_O_WP_Gf";
						break;
					case "skin19":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_O_NP_Gf";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		}
		);
	}
}