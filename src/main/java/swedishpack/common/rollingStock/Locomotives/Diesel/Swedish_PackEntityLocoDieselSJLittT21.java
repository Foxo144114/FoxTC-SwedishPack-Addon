package swedishpack.common.rollingStock.Locomotives.Diesel;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelBJLittDsPanto;
import swedishpack.client.render.models.ModelSJLittT21;
import swedishpack.client.render.models.ModelSJLittT21Bonnet;
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

public class Swedish_PackEntityLocoDieselSJLittT21 extends DieselTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoDieselSJLittT21.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":ALCO_16_251C_Notch8", 0.2F, 50, Info.resourceLocation +":ALCO_16_251C_Idle" , 0.2F, 69, false, Swedish_PackAddonInfo.resourceLocation + ":signalhornshort", 30  );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoDieselSJLittT21(World world) {
		super(world, Traincraft.traincraftRegistry.getTrainRecord(Swedish_PackEntityLocoDieselSJLittT21.class).getTankCapacity(), LiquidManager.dieselFilter());
		setupTextureDescription();
		setCargoManager(new CargoManager(new CargoSpecification[][]
				{
						{ new CargoSpecification(ModelSJLittT21Bonnet.class,
								Swedish_PackAddonInfo.modID, "trains/Locomotives/Diesel/Bonnets/T21_Bonnet/T21_Bonnet_Closed", "Bonnet Closed",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittT21Bonnet.class,
								Swedish_PackAddonInfo.modID, "trains/Locomotives/Diesel/Bonnets/T21_Bonnet/T21_Bonnet_Open", "Bonnet Open",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},


				}).setDefaultOverride(1));
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 1.2, 0.45, 0.3); }


	@Override
	public String transportCountry() {
		return "SE";
	}

	@Override
	public String getInventoryName() {
		return "SJ T21";
	}

	public void setupTextureDescription() {
		InsertTexture(0, "With Plow");
		InsertTexture(1, "Without Plow");
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.25F;
	}

	@Override
	public void onRenderInsertRecord()
	{

		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoDieselSJLittT21.class, new ModelSJLittT21(),
				"T21_",
				new float[] {-3.95F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null,"smoke", new ArrayList<double[]>() { { add(new double[]{1.5D, 1.55D, 0.0D}); } },
				null, null, 5, 0){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Diesel/T21_/SJLittT21_WP";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Diesel/T21_/SJLittT21_NP";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		}
		);
	}
}