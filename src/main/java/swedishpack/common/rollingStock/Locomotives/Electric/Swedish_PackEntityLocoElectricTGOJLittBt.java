package swedishpack.common.rollingStock.Locomotives.Electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelTGOJLittBt;
import swedishpack.client.render.models.ModelTGOJLittBtPanto;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

public class Swedish_PackEntityLocoElectricTGOJLittBt extends ElectricTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoElectricTGOJLittBt.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Info.resourceLocation +" ", 0 );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoElectricTGOJLittBt(World world) {
		super(world);
		setupTextureDescription();
		setCargoManager(new CargoManager(new CargoSpecification[][]
			{
				{ new CargoSpecification(ModelTGOJLittBtPanto.class,
						Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Bt_Panto/Bt_AllDown", "Pantograph All Down",
						new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
				},
					{ new CargoSpecification(ModelTGOJLittBtPanto.class,

							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Bt_Panto/Bt_AllUp", "Pantograph All Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelTGOJLittBtPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Bt_Panto/Bt_FrontUp", "Pantograph Front Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelTGOJLittBtPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Bt_Panto/Bt_BackUp", "Pantograph Back Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					}

			}).setDefaultOverride(1));
	}
	public void setupTextureDescription() {
		InsertTexture(0, "TGOJ Green, No mirrors out");
		InsertTexture(1, "TGOJ Green, Front mirrors out");
		InsertTexture(2, "TGOJ Green, Back mirrors out");
		InsertTexture(3, "TGOJ Green FactorySpec, No mirrors out");
		InsertTexture(4, "TGOJ Green FactorySpec, Front mirrors out");
		InsertTexture(5, "TGOJ Green FactorySpec, Back mirrors out");
		InsertTexture(6, "TGOJ Orange, No mirrors out");
		InsertTexture(7, "TGOJ Orange, Front mirrors out");
		InsertTexture(8, "TGOJ Orange, Back mirrors out");
		InsertTexture(9, "TGOJ Orange Modern, No mirrors out");
		InsertTexture(10, "TGOJ Orange Modern, Front mirrors out");
		InsertTexture(11, "TGOJ Orange Modern, Back mirrors out");
		InsertTexture(12, "SJ Orange, No mirrors out");
		InsertTexture(13, "SJ Orange, Front mirrors out");
		InsertTexture(14, "SJ Orange, Back mirrors out");
	}
	@Override
	public String transportCountry() {
		return "SE";
	}


	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.8, 0.2, 0.3); }


	@Override
	public String getInventoryName() {
		return "TGOJ Bt";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.95F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricTGOJLittBt.class, new ModelTGOJLittBt(),
				"Bt_",
				new float[] {-4.8F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_G_Mno";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_G_Mfo";
						break;
					case "green":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_G_Mbo";
						break;
					case "black":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_Gf_Mno";
						break;
					case "white":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_Gf_Mfo";
						break;
					case "grey":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_Gf_Mbo";
						break;
					case "magenta":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_O_Mno";
						break;
					case "lightblue":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_O_Mfo";
						break;
					case "lime":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_O_Mbo";
						break;
					case "lightgrey":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_MO_Mno";
						break;
					case "cyan":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_MO_Mfo";
						break;
					case "pink":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_MO_Mbo";
						break;
					case "purple":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_SJO_Mno";
						break;
					case "brown":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_SJO_Mfo";
						break;
					case "orange":
						texturePath = "textures/trains/Locomotives/Electric/Bt_/Bt_SJO_Mbo";
						break;



				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}