package swedishpack.common.rollingStock.Locomotives.Electric;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittOa;
import swedishpack.client.render.models.ModelSJLittOaPanto;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.ElectricTrain;
import train.common.core.util.TraincraftUtil;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;
import train.common.library.Info;
import train.common.library.sounds.SoundRecord;

public class Swedish_PackEntityLocoElectricSJLittOa extends ElectricTrain {

	public static final SoundRecord Sound = new SoundRecord(Swedish_PackEntityLocoElectricSJLittOa.class, Swedish_PackAddonInfo.resourceLocation + ":bwhistlelong", 0.3F, Info.resourceLocation +":vl10_idle", 0.2F, 50, Info.resourceLocation +":vl10_idle" , 0.2F, 50, false, Info.resourceLocation +" ", 0 );

	@Override
	public SoundRecord getSoundRecord() {
		return Sound;
	}


	public Swedish_PackEntityLocoElectricSJLittOa(World world) {
		super(world);
		setCargoManager(new CargoManager(new CargoSpecification[][]
			{
				{ new CargoSpecification(ModelSJLittOaPanto.class,
						Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Oa_Panto/SJLittOa_Down", "Pantograph Down,For Spoked",
						new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
				},
					{ new CargoSpecification(ModelSJLittOaPanto.class,

							Swedish_PackAddonInfo.modID, "trains/Locomotives/Electric/Pantograph/Oa_Panto/SJLittOa_Up", "Pantograph Up,For Spoked",
							new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
					},


			}));
	}

	@Override
	public String transportCountry() {
		return "SE";
	}

	@Override
	public void updateRiderPosition() { TraincraftUtil.updateRider(this, 2.9, 0.2, 0.3); }





	@Override
	public String getInventoryName() {
		return "SJ Oa";
	}






	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 0.825F;
	}
	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityLocoElectricSJLittOa.class, new ModelSJLittOa(),
				"Oa_",
				new float[] {-3.4F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "yellow":
						texturePath = "textures/trains/Locomotives/Electric/Oa_/SJLittOa_NP";
						break;
					case "blue":
						texturePath = "textures/trains/Locomotives/Electric/Oa_/SJLittOa_WP";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}
}