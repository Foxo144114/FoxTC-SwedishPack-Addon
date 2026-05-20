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

public class Swedish_PackEntityLocoElectricSJLittMa extends ElectricTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoElectricSJLittMa.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Swedish_PackAddonInfo.resourceLocation + ":signalhornshort", 30  );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoElectricSJLittMa(World world) {
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

			}).setDefaultOverride(1));
	}
	public void setupTextureDescription() {
		InsertTexture(0, "SJ Red and Black, No mirrors out");
		InsertTexture(1, "SJ Red and Black, Front mirrors out");
		InsertTexture(2, "SJ Red and Black, Back mirrors out");
	}
	@Override
	public String transportCountry() {
		return "SE";
	}


	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.8, 0.2, 0.3); }


	@Override
	public String getInventoryName() {
		return "SJ Ma";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.95F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricSJLittMa.class, new ModelTGOJLittMa(),
				"Ma_",
				new float[] {-4.8F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_Red_Mno";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_Red_Mfo";
						break;
				case "green":
					texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_Red_Mbo";
					break;
				case "black":
					texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlackOldSlicke_Mno";
					break;
				case "white":
					texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlackOldSlicke_Mfo";
					break;
				case "grey":
					texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlackOldSlicke_Mbo";
					break;
					case "magenta":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlackOld_Mno";
						break;
					case "lightblue":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlackOld_Mfo";
						break;
					case "lime":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlackOld_Mbo";
						break;
				case "lightgrey":
					texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlack_Mno";
					break;
				case "cyan":
					texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlack_Mfo";
					break;
				case "pink":
					texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlack_Mbo";
					break;
				case "purple":
					texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlackEDO_Mno";
					break;
				case "brown":
					texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlackEDO_Mfo";
					break;
				case "orange":
					texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlackEDO_Mbo";
					break;
					case "red":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedSTAM_Mno";
						break;
					case "skin16":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedSTAM_Mfo";
						break;
					case "skin17":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedSTAM_Mbo";
						break;
					case "skin18":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_NetRail_Mno";
						break;
					case "skin19":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_NetRail_Mfo";
						break;
					case "skin20":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_NetRail_Mbo";
						break;
					case "skin21":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_TGOJBG_Mno";
						break;
					case "skin22":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_TGOJBG_Mfo";
						break;
					case "skin23":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_TGOJBG_Mbo";
						break;
					case "skin24":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_TGOJGB_Mno";
						break;
					case "skin25":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_TGOJGB_Mfo";
						break;
					case "skin26":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_TGOJGB_Mbo";
						break;
					case "skin27":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlackEDOMP_Mno";
						break;
					case "skin28":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlackEDOMP_Mfo";
						break;
					case "skin29":
						texturePath = "textures/trains/Locomotives/Electric/Ma_/SJ/Ma_SJ_RedBlackEDOMP_Mbo";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}