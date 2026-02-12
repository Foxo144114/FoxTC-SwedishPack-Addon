package swedishpack.common.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelRcPanto;
import swedishpack.client.render.models.ModelSJLittRc;
import swedishpack.common.library.SwedishPackLockoutGroups;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.Info;

import train.common.library.sounds.SoundRecord;

public class Swedish_PackEntityLocoElectricSJLittRc2obb extends ElectricTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoElectricSJLittRc2obb.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Info.resourceLocation +" ", 0 );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoElectricSJLittRc2obb(World world) {
		super(world);
		setupTextureDescription();
		setCargoManager(new CargoManager(new CargoSpecification[][]
			{
				{ new CargoSpecification(ModelRcPanto.class,
						Swedish_PackAddonInfo.modID, "trains/Rc_Panto/Rc_1armI_AllDown", "Pantograph All Down",
						new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
				},
					{ new CargoSpecification(ModelRcPanto.class,

							Swedish_PackAddonInfo.modID, "trains/Rc_Panto/Rc_1armI_AllUp", "Pantograph All Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelRcPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Rc_Panto/Rc_1armI_FrontUp", "Pantograph Front Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelRcPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Rc_Panto/Rc_1armI_BackUp", "Pantograph Back Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					}

			}));
	}


	public void setupTextureDescription() {
		InsertTexture(12, "EJ PaintJob", SwedishPackLockoutGroups.EJ);
		InsertTexture(13, "EJ PaintJob", SwedishPackLockoutGroups.EJ);
		InsertTexture(14, "EJ PaintJob", SwedishPackLockoutGroups.EJ);
		InsertTexture(15, "SP PaintJob", SwedishPackLockoutGroups.SP);
		InsertTexture(16, "SP PaintJob", SwedishPackLockoutGroups.SP);
		InsertTexture(17, "SP PaintJob", SwedishPackLockoutGroups.SP);
	}

		@Override
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
		double distance = 4.6f;
		double yOffset = 0.25;
		float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
		float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
		if(side.isServer()){
			rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
			rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
			anglePitchClient = serverRealPitch*60;
		}
		float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
				+ riddenByEntity.getYOffset() + yOffset);
		float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
		double bogieX1 = (this.posX + (rotationCos1 * distance));
		double bogieZ1 = (this.posZ + (rotationSin1* distance));
		//System.out.println(rotationCos1+" "+rotationSin1);
		if(anglePitchClient>20 && rotationCos1 == 1){
			bogieX1-=pitchRads*2;
			pitch-=pitchRads*1.2;
		}
		if(anglePitchClient>20 && rotationSin1 == 1){
			bogieZ1-=pitchRads*2;
			pitch-=pitchRads*1.2;
		}
		if (pitchRads == 0.0) {
			riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
		}
		if (pitchRads > -1.01 && pitchRads < 1.01) {
			riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
		}
	}

	@Override
	public String getInventoryName() {
		return "SJ Rc2 (öBB)";
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.95F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricSJLittRc2obb.class, new ModelSJLittRc(),
				"Rc2obb_",
				new float[] {-4.8F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_Tagab_Mno";
						break;
					case "blue":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_Tagab_Mfo";
						break;
					case "green":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_Tagab_Mbo";
						break;
					case "black":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_STAB_Mno";
						break;
					case "white":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_STAB_Mfo";
						break;
					case "grey":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_STAB_Mbo";
						break;
					case "magenta":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_Infranord_Mno";
						break;
					case "lightblue":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_Infranord_Mfo";
						break;
					case "lime":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_Infranord_Mbo";
						break;
					case "lightgrey":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_TagabG_Mno";
						break;
					case "cyan":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_TagabG_Mfo";
						break;
					case "pink":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_TagabG_Mbo";
						break;
					case "purple":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_EJ_Mno";
						break;
					case "brown":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_EJ_Mfo";
						break;
					case "orange":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_EJ_Mbo";
						break;
					case "red":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_SP_Mno";
						break;
					case "skin16":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_SP_Mfo";
						break;
					case "skin17":
						texturePath = "textures/trains/Rc2obb_/Rc2OBB_SP_Mbo";
						break;



				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}

}