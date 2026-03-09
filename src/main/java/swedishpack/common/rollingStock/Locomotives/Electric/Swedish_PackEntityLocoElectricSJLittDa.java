package swedishpack.common.rollingStock.Locomotives.Electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittDa;
import swedishpack.client.render.models.ModelSJLittDaPanto;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

public class Swedish_PackEntityLocoElectricSJLittDa extends ElectricTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoElectricSJLittDa.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Info.resourceLocation +" ", 0 );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoElectricSJLittDa(World world) {
		super(world);
		setupTextureDescription();
		setCargoManager(new CargoManager(new CargoSpecification[][]
			{
				{ new CargoSpecification(ModelSJLittDaPanto.class,
						Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Da_Panto/SJLittDa_AllDown", "Pantograph All Down",
						new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
				},
					//{ new CargoSpecification(ModelSJLittDaPanto.class,
//S
					//		Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Da_Panto/SJLittDa_AllUp", "Pantograph All Up",
					//		new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					//},
					{ new CargoSpecification(ModelSJLittDaPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Da_Panto/SJLittDa_FrontUp", "Pantograph Front Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelSJLittDaPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Da_Panto/SJLittDa_BackUp", "Pantograph Back Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					}

			}).setDefaultOverride(1));
	}
	public void setupTextureDescription() {
		InsertTexture(0, "SAB Wheels, South Plow");
		InsertTexture(1, "SAB Wheels, North Plow");
		InsertTexture(2, "Spoked Wheels, South Plow");
		InsertTexture(3, "Spoked Wheels, North Plow");
		InsertTexture(4, "TågFraft");
		InsertTexture(5, "Green Museum");
		InsertTexture(6, "Peparkaksloket, South Plow");
		InsertTexture(7, "Peparkaksloket, North Plow");
	}
	@Override
	public String transportCountry() {
		return "SE";
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.5, 0.2, 0.3); }




	@Override
	public String getInventoryName() {
		return "SJ Da";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.65F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricSJLittDa.class, new ModelSJLittDa(),
				"Da_",
				new float[] {-4.0F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "red":
						texturePath = "textures/trains/Locomotives/Electric/Da_/SJLittDa_RedSABSouth";
						break;
					case "orange":
						texturePath = "textures/trains/Locomotives/Electric/Da_/SJLittDa_RedSABNorth";
						break;
					case "pink":
						texturePath = "textures/trains/Locomotives/Electric/Da_/SJLittDa_RedSpokeSouth";
						break;
					case "purple":
						texturePath = "textures/trains/Locomotives/Electric/Da_/SJLittDa_RedSpokeNorth";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Electric/Da_/SJLittDa_TF";
						break;
					case "green":
						texturePath = "textures/trains/Locomotives/Electric/Da_/SJLittDa_Green";
						break;
					case "magenta":
						texturePath = "textures/trains/Locomotives/Electric/Da_/SJLittDa_ChrisSouth";
						break;
					case "lightblue":
						texturePath = "textures/trains/Locomotives/Electric/Da_/SJLittDa_ChrisNorth";
						break;

				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}