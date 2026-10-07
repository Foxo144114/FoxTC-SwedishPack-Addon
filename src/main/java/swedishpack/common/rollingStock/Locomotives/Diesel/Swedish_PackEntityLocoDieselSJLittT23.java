package swedishpack.common.rollingStock.Locomotives.Diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittT21Bonnet;
import swedishpack.client.render.models.ModelSJLittT23;
import swedishpack.client.render.models.ModelSJLittT23Bonnet;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class Swedish_PackEntityLocoDieselSJLittT23 extends DieselTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoDieselSJLittT23.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":ALCO_16_251C_Notch8", 0.2F, 50, Info.resourceLocation +":ALCO_16_251C_Idle" , 0.2F, 69, false, Swedish_PackAddonInfo.resourceLocation + ":signalhornshort", 30  );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoDieselSJLittT23(World world) {
		super(world, Traincraft.traincraftRegistry.getTrainRecord(Swedish_PackEntityLocoDieselSJLittT23.class).getTankCapacity(), LiquidManager.dieselFilter());
		setupTextureDescription();
		setCargoManager(new CargoManager(new CargoSpecification[][]
				{
						{ new CargoSpecification(ModelSJLittT23Bonnet.class,
								Swedish_PackAddonInfo.modID, "trains/Locomotives/Diesel/Bonnets/T23_Bonnet/SJLittT23_S_R", "Bonnet Closed For Red Liveries",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittT23Bonnet.class,
								Swedish_PackAddonInfo.modID, "trains/Locomotives/Diesel/Bonnets/T23_Bonnet/SJLittT23_O_R", "Bonnet Open For Red Liveries",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittT23Bonnet.class,
								Swedish_PackAddonInfo.modID, "trains/Locomotives/Diesel/Bonnets/T23_Bonnet/SJLittT23_S_GBBJ", "Bonnet Closed For GBBJ Liveries",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittT23Bonnet.class,
								Swedish_PackAddonInfo.modID, "trains/Locomotives/Diesel/Bonnets/T23_Bonnet/SJLittT23_O_GBBJ", "Bonnet Open For GBBJ Liveries",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittT23Bonnet.class,
								Swedish_PackAddonInfo.modID, "trains/Locomotives/Diesel/Bonnets/T23_Bonnet/SJLittT23_S_ESG", "Bonnet Closed For Green Liveries",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittT23Bonnet.class,
								Swedish_PackAddonInfo.modID, "trains/Locomotives/Diesel/Bonnets/T23_Bonnet/SJLittT23_O_ESG", "Bonnet Open For Green Liveries",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittT23Bonnet.class,
								Swedish_PackAddonInfo.modID, "trains/Locomotives/Diesel/Bonnets/T23_Bonnet/SJLittT23_S_Gf", "Bonnet Closed For Gulfiber Liveries",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittT23Bonnet.class,
								Swedish_PackAddonInfo.modID, "trains/Locomotives/Diesel/Bonnets/T23_Bonnet/SJLittT23_O_Gf", "Bonnet Open For Gulfiber Liveries",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},


				}).setDefaultOverride(1));
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
		InsertTexture(0, "SJ, No Slickepinnar, With Plow");
		InsertTexture(1, "SJ, No Slickepinnar, Without Plow");
		InsertTexture(2, "SJ, Slickepinnar, With Plow");
		InsertTexture(3, "SJ, Slickepinnar, Without Plow");
		InsertTexture(4, "GBBJ, Slickepinnar, With Plow");
		InsertTexture(5, "GBBJ, Slickepinnar, Without Plow");
		InsertTexture(6, "Green, Slickepinnar, With Plow");
		InsertTexture(7, "Green, Slickepinnar, Without Plow");
		InsertTexture(8, "Gulfiber, With Plow");
		InsertTexture(9, "Gulfiber, Without Plow");
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
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_WP";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_NP";
						break;
					case "green":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_WP_ES";
						break;
					case "black":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_NP_ES";
						break;
					case "white":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_WP_GBBJ";
						break;
					case "grey":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_NP_GBBJ";
						break;
					case "magenta":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_WP_ESG";
						break;
					case "lightblue":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_NP_ESG";
						break;
					case "lime":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_WP_Gf";
						break;
					case "lightgrey":
						texturePath = "textures/trains/Locomotives/Diesel/T23_/SJLittT23_NP_Gf";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		}
		);
	}
}