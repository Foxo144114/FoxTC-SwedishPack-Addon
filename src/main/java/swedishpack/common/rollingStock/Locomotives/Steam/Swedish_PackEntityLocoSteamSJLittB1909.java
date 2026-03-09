package swedishpack.common.rollingStock.Locomotives.Steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittB1909;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class Swedish_PackEntityLocoSteamSJLittB1909 extends SteamTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoSteamSJLittB1909.class,
			Swedish_PackAddonInfo.resourceLocation + ":bwhistlelong", 0.3F,
			Swedish_PackAddonInfo.resourceLocation +":blokrun", 0.2F, 50,
			Swedish_PackAddonInfo.resourceLocation +":blokidle" , 0.2F, 97, false,
			Info.resourceLocation +" ", 0 );


	public Swedish_PackEntityLocoSteamSJLittB1909(World world) {
		super(world, Traincraft.traincraftRegistry.getTrainRecord(Swedish_PackEntityLocoSteamSJLittB1909.class).getTankCapacity(), LiquidManager.WATER_FILTER);
		setupTextureDescription();
	}

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}



	public void setupTextureDescription() {
		InsertTexture(0, "Blue, Delivery, Service");
		InsertTexture(1, "Blue, Delivery, Maintinence");
		InsertTexture(2, "Blue, Normal, Service");
		InsertTexture(3, "Blue, Normal, Maintinence");
		InsertTexture(4, "Black, Normal, Service");
		InsertTexture(5, "Black, Normal, Maintinence");
	}


	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.5, 0.2, 0.275); }

	@Override
	public String transportCountry() {
		return "SE";
	}


	@Override
	public String getInventoryName() {
		return "SJ B (1909)";
	}






	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.65F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoSteamSJLittB1909.class, new ModelSJLittB1909(),
				"B1909_",
				new float[] {-3.3F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null, "largesmoke",  new ArrayList<double[]>() { { add(new double[] { 3.45D, 1.5D, 0.0D }); } },
				"explode", new ArrayList<double[]>() { { add(new double[] { 3.5, -0.1875D, 0.6875D }); } },
				10, 2
		){

			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Steam/B1909_/SJLittB1909_B_L_S";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Steam/B1909_/SJLittB1909_B_L_M";
						break;
					case "green":
						texturePath = "textures/trains/Locomotives/Steam/B1909_/SJLittB1909_B_V_S";
						break;
					case "black":
						texturePath = "textures/trains/Locomotives/Steam/B1909_/SJLittB1909_B_V_M";
						break;
					case "white":
						texturePath = "textures/trains/Locomotives/Steam/B1909_/SJLittB1909_S_V_S";
						break;
					case "grey":
						texturePath = "textures/trains/Locomotives/Steam/B1909_/SJLittB1909_S_V_M";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}