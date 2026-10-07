package swedishpack.common.rollingStock.Locomotives.Steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittE2;
import swedishpack.client.render.models.ModelSJLittE2Smoke;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class Swedish_PackEntityLocoSteamSJLittE2 extends SteamTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoSteamSJLittE2.class,
			Swedish_PackAddonInfo.resourceLocation + ":bwhistlelong", 0.3F,
			"steam_run", 0.2F, 20,
			Swedish_PackAddonInfo.resourceLocation +":blokidle" , 0.2F, 97, true,
			Swedish_PackAddonInfo.resourceLocation + ":bwhistleshort", 30 );


	public Swedish_PackEntityLocoSteamSJLittE2(World world) {
		super(world, Traincraft.traincraftRegistry.getTrainRecord(Swedish_PackEntityLocoSteamSJLittE2.class).getTankCapacity(), LiquidManager.WATER_FILTER);
		setupTextureDescription();
		setCargoManager(new CargoManager(new CargoSpecification[][]
				{
						{ new CargoSpecification(ModelSJLittE2Smoke.class,
								Swedish_PackAddonInfo.modID, "trains/Locomotives/Steam/Smoke/E2_/SJLittE2_S", "Smokebox Closed, In Service",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittE2Smoke.class,
								Swedish_PackAddonInfo.modID, "trains/Locomotives/Steam/Smoke/E2_/SJLittE2_M", "Smokebox Open, Maintinence",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},


				}).disableUnselectedSlot());
	}

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}



	public void setupTextureDescription() {
		InsertTexture(0, "With SmokeboxLantern, With Generator");
		InsertTexture(1, "No SmokeboxLantern, No Generator");
		InsertTexture(2, "No SmokeboxLantern, With Generator");
		InsertTexture(3, "With SmokeboxLantern, No Generator");
	}


	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.3, 0.2, 0.275); }

	@Override
	public String transportCountry() {
		return "SE";
	}


	@Override
	public String getInventoryName() {
		return "SJ E2";
	}






	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.825F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoSteamSJLittE2.class, new ModelSJLittE2(),
				"E2_",
				new float[] {-3.5F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null, "largesmoke",  new ArrayList<double[]>() { { add(new double[] { 3.45D, 1.5D, 0.0D }); } },
				"explode", new ArrayList<double[]>() { { add(new double[] { 3.4, -0.1875D, 0.5D }); } },
				10, 2
		){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Steam/E2_/SJLittE2_MLMG";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Steam/E2_/SJLittE2_ULUG";
						break;
					case "green":
						texturePath = "textures/trains/Locomotives/Steam/E2_/SJLittE2_ULMG";
						break;
					case "black":
						texturePath = "textures/trains/Locomotives/Steam/E2_/SJLittE2_MLUG";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}