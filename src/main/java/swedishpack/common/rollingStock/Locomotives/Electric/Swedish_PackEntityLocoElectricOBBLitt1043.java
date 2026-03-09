package swedishpack.common.rollingStock.Locomotives.Electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelRcPanto;
import swedishpack.client.render.models.ModelSJLittRc;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

public class Swedish_PackEntityLocoElectricOBBLitt1043 extends ElectricTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoElectricOBBLitt1043.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Info.resourceLocation +" ", 0 );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoElectricOBBLitt1043(World world) {
		super(world);
		setupTextureDescription();
		setCargoManager(new CargoManager(new CargoSpecification[][]
			{
				{ new CargoSpecification(ModelRcPanto.class,
						Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Rc_Panto/Rc_1armI_AllDown", "Pantograph All Down",
						new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
				},
					{ new CargoSpecification(ModelRcPanto.class,

							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Rc_Panto/Rc_1armI_AllUp", "Pantograph All Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelRcPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Rc_Panto/Rc_1armI_FrontUp", "Pantograph Front Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelRcPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Rc_Panto/Rc_1armI_BackUp", "Pantograph Back Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					}

			}).setDefaultOverride(1));
	}

	public void setupTextureDescription() {
		InsertTexture(0, "70s Livery, No mirrors out");
		InsertTexture(1, "70s Livery, Front mirrors out");
		InsertTexture(2, "70s Livery, Back mirrors out");
		InsertTexture(3, "70s Livery Modern, No mirrors out");
		InsertTexture(4, "70s Livery Modern, Front mirrors out");
		InsertTexture(5, "70s Livery Modern, Back mirrors out");
		InsertTexture(6, "80s Livery, No mirrors out");
		InsertTexture(7, "80s Livery, Front mirrors out");
		InsertTexture(8, "80s Livery, Back mirrors out");
		InsertTexture(9, "90s Livery, No mirrors out");
		InsertTexture(10, "90s Livery, Front mirrors out");
		InsertTexture(11, "90s Livery, Back mirrors out");
	}
	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.8, 0.2, 0.3); }

	@Override
	public String transportCountry() {
		return "AT";
	}


	@Override
	public String getInventoryName() {
		return "1043 (öBB)";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.95F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricOBBLitt1043.class, new ModelSJLittRc(),
				"Obb1043_",
				new float[] {-4.8F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Electric/Obb1043_/OBB1043_70s_Mno";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Electric/Obb1043_/OBB1043_70s_Mfo";
						break;
					case "green":
						texturePath = "textures/trains/Locomotives/Electric/Obb1043_/OBB1043_70s_Mbo";
						break;
					case "black":
						texturePath = "textures/trains/Locomotives/Electric/Obb1043_/OBB1043_70sModern_Mno";
						break;
					case "white":
						texturePath = "textures/trains/Locomotives/Electric/Obb1043_/OBB1043_70sModern_Mfo";
						break;
					case "grey":
						texturePath = "textures/trains/Locomotives/Electric/Obb1043_/OBB1043_70sModern_Mbo";
						break;
					case "magenta":
						texturePath = "textures/trains/Locomotives/Electric/Obb1043_/OBB1043_80s_Mno";
						break;
					case "lightblue":
						texturePath = "textures/trains/Locomotives/Electric/Obb1043_/OBB1043_80s_Mfo";
						break;
					case "lime":
						texturePath = "textures/trains/Locomotives/Electric/Obb1043_/OBB1043_80s_Mbo";
						break;
					case "lightgrey":
						texturePath = "textures/trains/Locomotives/Electric/Obb1043_/OBB1043_90s_Mno";
						break;
					case "cyan":
						texturePath = "textures/trains/Locomotives/Electric/Obb1043_/OBB1043_90s_Mfo";
						break;
					case "pink":
						texturePath = "textures/trains/Locomotives/Electric/Obb1043_/OBB1043_90s_Mbo";
						break;




				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}