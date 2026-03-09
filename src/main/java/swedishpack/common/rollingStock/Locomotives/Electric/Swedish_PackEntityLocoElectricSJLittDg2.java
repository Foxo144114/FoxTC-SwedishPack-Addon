package swedishpack.common.rollingStock.Locomotives.Electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittDg2;
import swedishpack.client.render.models.ModelSJLittDg2Panto;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

public class Swedish_PackEntityLocoElectricSJLittDg2 extends ElectricTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoElectricSJLittDg2.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Info.resourceLocation +" ", 0 );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoElectricSJLittDg2(World world) {
		super(world);
		setupTextureDescription();
		setCargoManager(new CargoManager(new CargoSpecification[][]
			{
				{ new CargoSpecification(ModelSJLittDg2Panto.class,
						Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Dg2_Panto/SJLittDg2_AllDown", "Pantograph All Down",
						new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
				},
					//{ new CargoSpecification(ModelSJLittDg2Panto.class,
//S
					//		Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Dg2_Panto/SJLittDg2_AllUp", "Pantograph All Up",
					//		new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					//},
					{ new CargoSpecification(ModelSJLittDg2Panto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Dg2_Panto/SJLittDg2_FrontUp", "Pantograph Front Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelSJLittDg2Panto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Dg2_Panto/SJLittDg2_BackUp", "Pantograph Back Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					}

			}).setDefaultOverride(1));
	}
	public void setupTextureDescription() {
		InsertTexture(0, "SJ Dg2");
	}
	@Override
	public String transportCountry() {
		return "SE";
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.3, 0.2, 0.3); }




	@Override
	public String getInventoryName() {
		return "SJ Dg2";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.75F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricSJLittDg2.class, new ModelSJLittDg2(),
				"Dg2_",
				new float[] {-4.75F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "red":
						texturePath = "textures/trains/Locomotives/Electric/Dg2_/SJLittDg2_Red";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}