package swedishpack.common.rollingStock.Locomotives.Electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittFel;
import swedishpack.client.render.models.ModelSJLittFelPanto;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

public class Swedish_PackEntityLocoElectricSJLittFel extends ElectricTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoElectricSJLittFel.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Info.resourceLocation +" ", 0 );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoElectricSJLittFel(World world) {
		super(world);
		setCargoManager(new CargoManager(new CargoSpecification[][]
			{
				{ new CargoSpecification(ModelSJLittFelPanto.class,
						Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/F_Panto/SJLittFel_AllDown", "Pantograph All Down",
						new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
				},
					//{ new CargoSpecification(ModelSJLittFelPanto.class,
//S
					//		Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/F_Panto/SJLittFel_AllUp", "Pantograph All Up",
					//		new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					//},
					{ new CargoSpecification(ModelSJLittFelPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/F_Panto/SJLittFel_FrontUp", "Pantograph Front Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelSJLittFelPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/F_Panto/SJLittFel_BackUp", "Pantograph Back Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					}

			}));
	}


	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.1, 0.2, 0.3); }

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
		return 1.95F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricSJLittFel.class, new ModelSJLittFel(),
				"Fel_",
				new float[] {-4.55F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "red":
						texturePath = "textures/trains/Locomotives/Electric/F_/Fel_SJ";
						break;
					case "orange":
						texturePath = "textures/trains/Locomotives/Electric/F_/Fel_Prototype";
						break;

				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}