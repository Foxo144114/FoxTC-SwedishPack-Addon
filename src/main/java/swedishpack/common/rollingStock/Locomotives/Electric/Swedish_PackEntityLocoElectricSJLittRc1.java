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

public class Swedish_PackEntityLocoElectricSJLittRc1 extends ElectricTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoElectricSJLittRc1.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Info.resourceLocation +" ", 0 );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoElectricSJLittRc1(World world) {
		super(world);
		setCargoManager(new CargoManager(new CargoSpecification[][]
			{
				{ new CargoSpecification(ModelRcPanto.class,
						Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Rc_Panto/Rc_Diamond_AllDown", "Pantograph All Down",
						new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
				},
					{ new CargoSpecification(ModelRcPanto.class,

							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Rc_Panto/Rc_Diamond_AllUp", "Pantograph All Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelRcPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Rc_Panto/Rc_Diamond_FrontUp", "Pantograph Front Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelRcPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Rc_Panto/Rc_Diamond_BackUp", "Pantograph Back Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					}

			}));
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 4.8, 0.2, 0.3); }


	@Override
	public String transportCountry() {
		return "SE";
	}

	@Override
	public String getInventoryName() {
		return "SJ Rc1";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.95F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricSJLittRc1.class, new ModelSJLittRc(),
				"Rc1_",
				new float[] {-4.8F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_sjo_Mno";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_sjo_Mfo";
						break;
					case "green":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_sjo_Mbo";
						break;
					case "black":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_sjb_Mno";
						break;
					case "white":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_sjb_Mfo";
						break;
					case "grey":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_sjb_Mbo";
						break;
					case "magenta":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_sjo2vm_Mno";
						break;
					case "lightblue":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_sjo2vm_Mfo";
						break;
					case "lime":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_sjo2vm_Mbo";
						break;
					case "lightgrey":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_GCB_Mno";
						break;
					case "cyan":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_GCB_Mfo";
						break;
					case "pink":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_GCB_Mbo";
						break;
					case "purple":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_sjblixt_Mno";
						break;
					case "brown":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_sjblixt_Mfo";
						break;
					case "orange":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_sjblixt_Mbo";
						break;
					case "red":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_Trafik_Mno";
						break;
					case "skin16":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_Trafik_Mfo";
						break;
					case "skin17":
						texturePath = "textures/trains/Locomotives/Electric/Rc1_/Rc1_Trafik_Mbo";
						break;



				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}