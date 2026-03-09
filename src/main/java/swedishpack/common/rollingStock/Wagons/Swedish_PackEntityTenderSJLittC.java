package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import swedishpack.client.render.models.ModelSJLittCtender;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;

public class Swedish_PackEntityTenderSJLittC extends Tender {

	public Swedish_PackEntityTenderSJLittC(World world) {
		super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(Swedish_PackEntityTenderSJLittC.class).getTankCapacity(), LiquidManager.WATER_FILTER);
		setupTextureDescription();
	}

	public void setupTextureDescription() {
		InsertTexture(0, "C Tender Normal");
		InsertTexture(1, "C Tender Extended");
		InsertTexture(2, "C Tender Open Cab");
	}




	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityTenderSJLittC.class, new ModelSJLittCtender(),
				"SJLittCTender_",
				new float[] {0.65F, -0.5F, 0.0F},
				new float[]{0F, 0F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/Tenders/C_/SJLittCtender_CC";
						break;
					case "red":
						texturePath = "textures/trains/Wagons/Tenders/C_/SJLittCtender_CCMK";
						break;
					case "yellow":
						texturePath = "textures/trains/Wagons/Tenders/C_/SJLittCtender_OC";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}

	
	@Override
	public String getInventoryName() {
		return "SJ C [Tender]";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.2F;
	}


}