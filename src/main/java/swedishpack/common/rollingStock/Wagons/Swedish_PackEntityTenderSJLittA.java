package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import swedishpack.client.render.models.ModelSJLittAtender;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;

public class Swedish_PackEntityTenderSJLittA extends Tender {

	public Swedish_PackEntityTenderSJLittA(World world) {
		super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(Swedish_PackEntityTenderSJLittA.class).getTankCapacity(), LiquidManager.WATER_FILTER);
		setupTextureDescription();
	}

	public void setupTextureDescription() {
		InsertTexture(0, "A Tender Normal");
		InsertTexture(1, "A Tender Extended");
		InsertTexture(2, "A Tender Open Cab");
	}




	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityTenderSJLittA.class, new ModelSJLittAtender(),
				"SJLittATender_",
				new float[] {1.0F, -0.5F, 0.0F},
				new float[]{0F, 0F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/Tenders/A_/SJLittAtender_CC";
						break;
					case "red":
						texturePath = "textures/trains/Wagons/Tenders/A_/SJLittAtender_CCMK";
						break;
					case "yellow":
						texturePath = "textures/trains/Wagons/Tenders/A_/SJLittAtender_OC";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}

	
	@Override
	public String getInventoryName() {
		return "SJ A [Tender]";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.5F;
	}


}