package swedishpack.common.rollingStock.Locomotives.Electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittDm;
import swedishpack.client.render.models.ModelSJLittDmPanto;
import swedishpack.common.library.SwedishPackLockoutGroups;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

public class Swedish_PackEntityLocoElectricSJLittDm extends ElectricTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoElectricSJLittDm.class, Swedish_PackAddonInfo.resourceLocation + ":signalhornlong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Info.resourceLocation +" ", 0 );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoElectricSJLittDm(World world) {
		super(world);
		setCargoManager(new CargoManager(new CargoSpecification[][]
			{
				{ new CargoSpecification(ModelSJLittDmPanto.class,
						Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Dm_Panto/SJLittDm_DownSpoked", "Pantograph Down,For Spoked",
						new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
				},
					{ new CargoSpecification(ModelSJLittDmPanto.class,

							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Dm_Panto/SJLittDm_UpSpoked", "Pantograph Up,For Spoked",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelSJLittDmPanto.class,
							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Dm_Panto/SJLittDm_DownSAB", "Pantograph Down",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},
					{ new CargoSpecification(ModelSJLittDmPanto.class,

							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Dm_Panto/SJLittDm_UpSAB", "Pantograph Up",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},


			}));
	}
	public void setupTextureDescription() {
		InsertTexture(1, "A-End,Mirror Out,NorthPlow,Spoked");
		InsertTexture(2, "A-End,Mirror Out,SouthPlow,Spoked");
		InsertTexture(3, "A-End,Mirror Out,NorthPlow,SAB");
		InsertTexture(4, "A-End,Mirror Out,SouthPlow,SAB");
		InsertTexture(5, "A-End,Mirror Out,LKAB");
		InsertTexture(6, "A-End,Mirror In,NorthPlow,Spoked");
		InsertTexture(7, "A-End,Mirror In,SouthPlow,Spoked");
		InsertTexture(8, "A-End,Mirror In,NorthPlow,SAB");
		InsertTexture(9, "A-End,Mirror In,SouthPlow,SAB");
		InsertTexture(10, "A-End,Mirror In,LKAB");
		InsertTexture(11, "B-End,Mirror Out,NorthPlow,Spoked");
		InsertTexture(12, "B-End,Mirror Out,SouthPlow,Spoked");
		InsertTexture(13, "B-End,Mirror Out,NorthPlow,SAB");
		InsertTexture(14, "B-End,Mirror Out,SouthPlow,SAB");
		InsertTexture(15, "B-End,Mirror Out,LKAB");
		InsertTexture(16, "B-End,Mirror In,NorthPlow,Spoked");
		InsertTexture(17, "B-End,Mirror In,SouthPlow,Spoked");
		InsertTexture(18, "B-End,Mirror In,NorthPlow,SAB");
		InsertTexture(19, "B-End,Mirror In,SouthPlow,SAB");
		InsertTexture(20, "B-End,Mirror In,LKAB");
	}




		@Override
	public void updateRiderPosition() {
		if(riddenByEntity==null){return;}
		double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
		double distance = 3.9f;
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
		return "SJ Dm";
	}






	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.825F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricSJLittDm.class, new ModelSJLittDm(),
				"Dm_",
				new float[] {-4.5F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_AMoSpokedNorth";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_AMoSpokedSouth";
						break;
					case "green":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_AMoSABNorth";
						break;
					case "black":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_AMoSABSouth";
						break;
					case "white":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_AMoLKAB";
						break;
					case "grey":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_AMiSpokedNorth";
						break;
					case "magenta":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_AMiSpokedSouth";
						break;
					case "lightblue":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_AMiSABNorth";
						break;
					case "lime":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_AMiSABSouth";
						break;
					case "lightgrey":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_AMiLKAB";
						break;
					case "cyan":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_BMoSpokedNorth";
						break;
					case "pink":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_BMoSpokedSouth";
						break;
					case "purple":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_BMoSABNorth";
						break;
					case "brown":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_BMoSABSouth";
						break;
					case "orange":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_BMoLKAB";
						break;
					case "red":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_BMiSpokedNorth";
						break;
					case "skin16":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_BMiSpokedSouth";
						break;
					case "skin17":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_BMiSABNorth";
						break;
					case "skin18":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_BMiSABSouth";
						break;
					case "skin19":
						texturePath = "textures/trains/Locomotives/Electric/Dm_/Dm_BMiLKAB";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}