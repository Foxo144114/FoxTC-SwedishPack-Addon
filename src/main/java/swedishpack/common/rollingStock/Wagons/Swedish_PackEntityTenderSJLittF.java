package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import swedishpack.client.render.models.ModelSJLittFtender;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.LiquidManager;
import train.common.api.Tender;

public class Swedish_PackEntityTenderSJLittF extends Tender {

	public Swedish_PackEntityTenderSJLittF(World world) {
		super(world, FluidRegistry.WATER, 0, Traincraft.traincraftRegistry.getTrainRecord(Swedish_PackEntityTenderSJLittF.class).getTankCapacity(), LiquidManager.WATER_FILTER);
		setupTextureDescription();
	}

	public void setupTextureDescription() {
		InsertTexture(0, "F Tender Normal");
	}




	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityTenderSJLittF.class, new ModelSJLittFtender(),
				"SJLittFTender_",
				new float[] {1.0F, -0.5F, 0.0F},
				new float[]{0F, 0F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/Tenders/F_/SJLittFtender_OC";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}

	
	@Override
	public String getInventoryName() {
		return "SJ F [Tender]";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.5F;
	}


}