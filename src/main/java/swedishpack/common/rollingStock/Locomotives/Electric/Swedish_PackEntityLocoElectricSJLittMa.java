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

			}).disableUnselectedSlot());
	}
	public void setupTextureDescription() {
		InsertTexture(0, "SJ Red, No mirrors out");
		InsertTexture(1, "SJ Red, Front mirrors out");
		InsertTexture(2, "SJ Red, Back mirrors out");
		InsertTexture(3, "SJ Red And Black SlickePinne, No mirrors out");
		InsertTexture(4, "SJ Red And Black SlickePinne, Front mirrors out");
		InsertTexture(5, "SJ Red And Black SlickePinne, Back mirrors out");
		InsertTexture(6, "SJ Red And Black Old, No mirrors out");
		InsertTexture(7, "SJ Red And Black Old, Front mirrors out");
		InsertTexture(8, "SJ Red And Black Old, Back mirrors out");
		InsertTexture(9, "SJ Red And Black Modern, No mirrors out");
		InsertTexture(10, "SJ Red And Black Modern, Front mirrors out");
		InsertTexture(11, "SJ Red And Black Modern, Back mirrors out");
		InsertTexture(12, "SJ Red And Black Modern OED, No mirrors out");
		InsertTexture(13, "SJ Red And Black Modern OED, Front mirrors out");
		InsertTexture(14, "SJ Red And Black Modern OED, Back mirrors out");
		InsertTexture(15, "SJ Red Stambanans vännner, No mirrors out");
		InsertTexture(16, "SJ Red Stambanans vännner, Front mirrors out");
		InsertTexture(17, "SJ Red Stambanans vännner, Back mirrors out");
		InsertTexture(18, "NetRail, No mirrors out");
		InsertTexture(19, "NetRail, Front mirrors out");
		InsertTexture(20, "NetRail, Back mirrors out");
		InsertTexture(21, "TGOJ Trafik Modern BG, No mirrors out");
		InsertTexture(22, "TGOJ Trafik Modern BG, Front mirrors out");
		InsertTexture(23, "TGOJ Trafik Modern BG, Back mirrors out");
		InsertTexture(24, "TGOJ Trafik Modern GB, No mirrors out");
		InsertTexture(25, "TGOJ Trafik Modern GB, Front mirrors out");
		InsertTexture(26, "TGOJ Trafik Modern GB, Back mirrors out");
		InsertTexture(27, "SJ Red And Black Modern OED Modern Plow, No mirrors out");
		InsertTexture(28, "SJ Red And Black Modern OED Modern Plow, Front mirrors out");
		InsertTexture(29, "SJ Red And Black Modern OED Modern Plow, Back mirrors out");
	}
	@Override
	public String transportCountry() {
		return "SE";
	}


	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 5.25, 0.2, 0.3); }


	@Override
	public String getInventoryName() {
		return "SJ Ma";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.2F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricSJLittMa.class, new ModelTGOJLittMa(),
				"Ma_",
				new float[] {-5.1F, -0.5F, 0.0F},
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