package swedishpack.common.rollingStock.Wagons;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import swedishpack.client.render.models.*;
import swedishpack.common.library.Swedish_PackAddonInfo;
import train.client.render.register.TrainRenderRecord;
import train.common.Traincraft;
import train.common.api.AbstractStandardFreightCar;
import train.common.entity.CargoManager;
import train.common.entity.CargoSpecification;


public class Swedish_PackEntityFreightSJLittLgs_722 extends AbstractStandardFreightCar {

	public Swedish_PackEntityFreightSJLittLgs_722(World world) {
		super(world);
		setupTextureDescription();
	}

	@Override
	public CargoManager setupCargoManager() {

	return	new CargoManager(new CargoSpecification[][]
				{
						{ new CargoSpecification(ModelContainer2x20fLgs722_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/2x20/Container_GO20", "2 x 20'' Containers, Green & Orange",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer2x20fLgs722_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/2x20/Container_PN20", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer2x20fLgs722_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/2x20/Container_WB20", "2 x 20'' Containers, White & Blue",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer2x20fLgs722_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/2x20/Container_FTR20", "2 x 20'' Containers, FarTrEch",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer2x20fLgs722_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/2x20/Container_Blauwnet20", "2 x 20'' Containers, Blauwnet",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20fLgs722_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_B20", "1 x 20'' Containers, Blue",
								new CargoSpecification.RenderParameters().setOffset(1.125,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20fLgs722_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_G20", "1 x 20'' Containers, Green",
								new CargoSpecification.RenderParameters().setOffset(1.125,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20fLgs722_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_O20", "1 x 20'' Containers, Orange",
								new CargoSpecification.RenderParameters().setOffset(1.125,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20fLgs722_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_W20", "1 x 20'' Containers, White",
								new CargoSpecification.RenderParameters().setOffset(1.125,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20fLgs722_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_FTRB20", "1 x 20'' Containers, FarTrEch Black",
								new CargoSpecification.RenderParameters().setOffset(1.125,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20fLgs722_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_FTRW20", "1 x 20'' Containers, FarTrEch White",
								new CargoSpecification.RenderParameters().setOffset(1.125,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20fLgs722_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_BlauwnetB20", "1 x 20'' Containers, Blauwnet Blue",
								new CargoSpecification.RenderParameters().setOffset(1.125,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20fLgs722_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_BlauwnetW20", "1 x 20'' Containers, Blauwnet White",
								new CargoSpecification.RenderParameters().setOffset(1.125,3.0,0))
						},
				});


	}

	@Override
	public void setupTextureDescription() {
		InsertTexture(0, "Early");
		InsertTexture(1, "Late");
		InsertTexture(2, "Original");
		InsertTexture(3, "Stripped");
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityFreightSJLittLgs_722.class, new ModelSJLittLgs_722(),
				"Lgs_722_",
				new float[] {-2.125F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/Lgs_722_/Lgs722_Early";
						break;
					case "green":
						texturePath = "textures/trains/Wagons/Lgs_722_/Lgs722_Late";
						break;
					case "red":
						texturePath = "textures/trains/Wagons/Lgs_722_/Lgs722_Original";
						break;
					case "yellow":
						texturePath = "textures/trains/Wagons/Lgs_722_/Lgs722_Stripped";
						break;



				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}





	@Override
	public String getInventoryName() {
		return "Lgs⁷²² (SJ)";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.6F;
	}


}