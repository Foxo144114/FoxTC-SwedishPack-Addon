package swedishpack.common.rollingStock.Locomotives.Steam;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittF;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.SteamTrain;
import train.common.core.util.TraincraftUtil;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

import java.util.ArrayList;

public class Swedish_PackEntityLocoSteamSJLittF extends SteamTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoSteamSJLittF.class,
			Swedish_PackAddonInfo.resourceLocation + ":flokvissla", 0.3F,
			Swedish_PackAddonInfo.resourceLocation +":flokchuff", 0.2F, 40,
			Swedish_PackAddonInfo.resourceLocation +":blokidle" , 0.2F, 97, false,
			Info.resourceLocation +" ", 0 );


	public Swedish_PackEntityLocoSteamSJLittF(World world) {
		super(world, Traincraft.traincraftRegistry.getTrainRecord(Swedish_PackEntityLocoSteamSJLittF.class).getTankCapacity(), LiquidManager.WATER_FILTER);
		setupTextureDescription();
	}

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}



	public void setupTextureDescription() {
		InsertTexture(0, "Blue, Normal, Service");
		InsertTexture(1, "Blue, Normal, Maintinence");
		InsertTexture(2, "Black, Normal, Service");
		InsertTexture(3, "Black, Normal, Maintinence");
		InsertTexture(4, "Blue, Without Lamp, Service");
		InsertTexture(5, "Blue, Without Lamp, Maintinence");
		InsertTexture(6, "Black, Without Lamp, Service");
		InsertTexture(7, "Black, Without Lamp, Maintinence");
	}


	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, -0.4, 0.2, 0.275); }

	@Override
	public String transportCountry() {
		return "SE";
	}


	@Override
	public String getInventoryName() {
		return "SJ F";
	}






	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.825F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoSteamSJLittF.class, new ModelSJLittF(),
				"F_",
				new float[] {-4.4F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null, "largesmoke",  new ArrayList<double[]>() { { add(new double[] { 4.1D, 1.5D, 0.0D }); } },
				"explode", new ArrayList<double[]>() { { add(new double[] { 4.0, -0.1D, 0.6875D }); } },
				10, 2
		){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Steam/F_/SJLittF_B_ML_S";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Steam/F_/SJLittF_B_ML_M";
						break;
					case "green":
						texturePath = "textures/trains/Locomotives/Steam/F_/SJLittF_S_ML_S";
						break;
					case "black":
						texturePath = "textures/trains/Locomotives/Steam/F_/SJLittF_S_ML_M";
						break;
					case "white":
						texturePath = "textures/trains/Locomotives/Steam/F_/SJLittF_B_UL_S";
						break;
					case "grey":
						texturePath = "textures/trains/Locomotives/Steam/F_/SJLittF_B_UL_M";
						break;
					case "magenta":
						texturePath = "textures/trains/Locomotives/Steam/F_/SJLittF_S_UL_S";
						break;
					case "lightblue":
						texturePath = "textures/trains/Locomotives/Steam/F_/SJLittF_S_UL_M";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}