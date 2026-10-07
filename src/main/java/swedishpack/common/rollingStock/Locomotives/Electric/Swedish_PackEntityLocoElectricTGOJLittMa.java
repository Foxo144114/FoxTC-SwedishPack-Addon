package swedishpack.common.rollingStock.Locomotives.Electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelTGOJLittMa;
import swedishpack.client.render.models.ModelTGOJSJLittMaPanto;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

public class Swedish_PackEntityLocoElectricTGOJLittMa extends ElectricTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoElectricTGOJLittMa.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Swedish_PackAddonInfo.resourceLocation + ":signalhornshort", 30  );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoElectricTGOJLittMa(World world) {
		super(world);
		setupTextureDescription();
		setCargoManager(new CargoManager(new CargoSpecification[][]
			{
				{ new CargoSpecification(ModelTGOJSJLittMaPanto.class,
						Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Ma_Panto/Ma_AllDown", "Pantograph All Down",
						new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
				},
					{ new CargoSpecification(ModelTGOJSJLittMaPanto.class,

							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Ma_Panto/Ma_AllUp", "Pantograph All Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelTGOJSJLittMaPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Ma_Panto/Ma_FrontUp", "Pantograph Front Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelTGOJSJLittMaPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Ma_Panto/Ma_BackUp", "Pantograph Back Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					}

			}).disableUnselectedSlot());
	}
	public void setupTextureDescription() {
		InsertTexture(0, "TGOJ Orange Modern, No mirrors out");
		InsertTexture(1, "TGOJ Orange Modern, Front mirrors out");
		InsertTexture(2, "TGOJ Orange Modern, Back mirrors out");
		InsertTexture(3, "TGOJ Orange Gränges, No mirrors out");
		InsertTexture(4, "TGOJ Orange Gränges, Front mirrors out");
		InsertTexture(5, "TGOJ Orange Gränges, Back mirrors out");
		InsertTexture(6, "TGOJ Green No Stripe, No mirrors out");
		InsertTexture(7, "TGOJ Green No Stripe, Front mirrors out");
		InsertTexture(8, "TGOJ Green No Stripe, Back mirrors out");
		InsertTexture(9, "TGOJ Green With Stripe, No mirrors out");
		InsertTexture(10, "TGOJ Green With Stripe, Front mirrors out");
		InsertTexture(11, "TGOJ Green With Stripe, Back mirrors out");
		InsertTexture(12, "TGOJ Trafik Modern GB, No mirrors out");
		InsertTexture(13, "TGOJ Trafik Modern GB, Front mirrors out");
		InsertTexture(14, "TGOJ Trafik Modern GB, Back mirrors out");
		InsertTexture(15, "TGOJ Trafik Modern BG, No mirrors out");
		InsertTexture(16, "TGOJ Trafik Modern BG, Front mirrors out");
		InsertTexture(17, "TGOJ Trafik Modern BG, Back mirrors out");
		InsertTexture(18, "NSB Brown, No mirrors out");
		InsertTexture(19, "NSB Brown, Front mirrors out");
		InsertTexture(20, "NSB Brown, Back mirrors out");
	}
	@Override
	public String transportCountry() {
		return "SE";
	}


	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 5.25, 0.2, 0.3); }


	@Override
	public String getInventoryName() {
		return "TGOJ Ma";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.2F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricTGOJLittMa.class, new ModelTGOJLittMa(),
				"Ma_",
				new float[] {-5.1F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_OrangeM_Mno";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_OrangeM_Mfo";
						break;
				case "green":
					texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_OrangeM_Mbo";
					break;
			case "black":
				texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_Orange_Mno";
				break;
			case "white":
				texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_Orange_Mfo";
				break;
			case "grey":
				texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_Orange_Mbo";
				break;
					case "magenta":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_Green_Mno";
						break;
					case "lightblue":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_Green_Mfo";
						break;
					case "lime":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_Green_Mbo";
						break;
					case "lightgrey":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_GreenO_Mno";
						break;
					case "cyan":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_GreenO_Mfo";
						break;
					case "pink":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_GreenO_Mbo";
						break;
					case "purple":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_GB_Mno";
						break;
					case "brown":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_GB_Mfo";
						break;
					case "orange":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_GB_Mbo";
						break;
					case "red":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_BG_Mno";
						break;
					case "skin16":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_BG_Mfo";
						break;
					case "skin17":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_BG_Mbo";
						break;
					case "skin18":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_BrownM_Mno";
						break;
					case "skin19":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_BrownM_Mfo";
						break;
					case "skin20":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/TGOJ/Ma_TGOJ_BrownM_Mbo";
						break;

				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}