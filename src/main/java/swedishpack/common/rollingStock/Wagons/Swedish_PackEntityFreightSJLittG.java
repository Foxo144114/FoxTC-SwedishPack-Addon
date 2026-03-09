package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.ModelSJLittDmPanto;
import swedishpack.client.render.models.ModelSJLittG;
import swedishpack.client.render.models.ModelSJLittGDoor;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;

public class Swedish_PackEntityFreightSJLittG extends AbstractStandardFreightCar {
	
	public Swedish_PackEntityFreightSJLittG(World world) {
		super(world);
		setupTextureDescription();
		setCargoManager(new CargoManager(new CargoSpecification[][]
				{
						{ new CargoSpecification(ModelSJLittGDoor.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/G_Wagons/G_/Doors_/SJLittG_allclosed", "All Doors Closed",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittGDoor.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/G_Wagons/G_/Doors_/SJLittG_allopen", "All Doors Open",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittGDoor.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/G_Wagons/G_/Doors_/SJLittG_Leftopen", "Left Door Open",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
						{ new CargoSpecification(ModelSJLittGDoor.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/G_Wagons/G_/Doors_/SJLittG_rightopen", "Right Door Open",
								new CargoSpecification.RenderParameters().setOffset(0,3.0,0))
						},
				}));
	}

	@Override
	public CargoManager setupCargoManager() {
		return null;
	}

	@Override
	public void setupTextureDescription() {
		InsertTexture(0, "Red walls, Red Roof");
		InsertTexture(1, "Red walls, Light Grey Roof");
		InsertTexture(2, "Red walls, Grey Roof");
	}



	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityFreightSJLittG.class, new ModelSJLittG(),
				"SJLittG_",
				new float[] {-1.9F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/G_Wagons/G_/SJLittG_RWRR";
						break;
					case "red":
						texturePath = "textures/trains/Wagons/G_Wagons/G_/SJLittG_RWLGR";
						break;
					case "yellow":
						texturePath = "textures/trains/Wagons/G_Wagons/G_/SJLittG_RWMGR";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}

	
	@Override
	public String getInventoryName() {
		return "SJ G";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.4F;
	}


}