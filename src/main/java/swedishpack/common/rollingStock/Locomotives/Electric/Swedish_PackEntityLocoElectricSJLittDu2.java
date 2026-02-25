package swedishpack.common.rollingStock.Locomotives.Electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittDu2;
import swedishpack.client.render.models.ModelSJLittDu2Panto;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

public class Swedish_PackEntityLocoElectricSJLittDu2 extends ElectricTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoElectricSJLittDu2.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Info.resourceLocation +" ", 0 );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoElectricSJLittDu2(World world) {
		super(world);
		setCargoManager(new CargoManager(new CargoSpecification[][]
			{
				{ new CargoSpecification(ModelSJLittDu2Panto.class,
						Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Du2_Panto/SJLittDu2_AllDown", "Pantograph All Down",
						new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
				},
					//{ new CargoSpecification(ModelSJLittDu2Panto.class,
//S
					//		Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Du2_Panto/SJLittDu2_AllUp", "Pantograph All Up",
					//		new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					//},
					{ new CargoSpecification(ModelSJLittDu2Panto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Du2_Panto/SJLittDu2_FrontUp", "Pantograph Front Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelSJLittDu2Panto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Du2_Panto/SJLittDu2_BackUp", "Pantograph Back Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					}

			}));
	}



	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.5, 0.2, 0.3); }

	@Override
	public String transportCountry() {
		return "SE";
	}

	@Override
	public String getInventoryName() {
		return "SJ Du2";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.65F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricSJLittDu2.class, new ModelSJLittDu2(),
				"Du2_",
				new float[] {-4.0F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "orange":
						texturePath = "textures/trains/Locomotives/Electric/Du2_/SJLittDu2_LitBrygg";
						break;
					case "brown":
						texturePath = "textures/trains/Locomotives/Electric/Du2_/SJLittDu2_NoBrygg";
						break;
					case "red":
						texturePath = "textures/trains/Locomotives/Electric/Du2_/SJLittDu2_VitFStorBrygg";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}