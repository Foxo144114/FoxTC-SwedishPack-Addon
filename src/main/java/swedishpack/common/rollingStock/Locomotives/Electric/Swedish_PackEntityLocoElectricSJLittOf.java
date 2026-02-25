package swedishpack.common.rollingStock.Locomotives.Electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittOf;
import swedishpack.client.render.models.ModelSJLittOfPanto;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

public class Swedish_PackEntityLocoElectricSJLittOf extends ElectricTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoElectricSJLittOf.class, Swedish_PackAddonInfo.resourceLocation + ":bwhistlelong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Info.resourceLocation +" ", 0 );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoElectricSJLittOf(World world) {
		super(world);
		setCargoManager(new CargoManager(new CargoSpecification[][]
			{
				{ new CargoSpecification(ModelSJLittOfPanto.class,
						Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Of_Panto/SJLittOf_Down", "Pantograph Down,For Spoked",
						new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
				},
					{ new CargoSpecification(ModelSJLittOfPanto.class,

							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Of_Panto/SJLittOf_Up", "Pantograph Up,For Spoked",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},


			}));
	}

	@Override
	public String transportCountry() {
		return "SE";
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 3.1, 0.2, 0.3); }





	@Override
	public String getInventoryName() {
		return "SJ Of";
	}






	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.95F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricSJLittOf.class, new ModelSJLittOf(),
				"Of_",
				new float[] {-3.55F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Electric/Of_/SJLittOf_A_NP";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Electric/Of_/SJLittOf_A_WP";
						break;
					case "green":
						texturePath = "textures/trains/Locomotives/Electric/Of_/SJLittOf_B_NP";
						break;
					case "black":
						texturePath = "textures/trains/Locomotives/Electric/Of_/SJLittOf_B_WP";
						break;
					case "white":
						texturePath = "textures/trains/Locomotives/Electric/Of_/SJLittOf_Middle";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}