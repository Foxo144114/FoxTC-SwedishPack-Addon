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


public class Swedish_PackEntityFreightSJLittLgs extends AbstractStandardFreightCar {

	public Swedish_PackEntityFreightSJLittLgs(World world) {
		super(world);
		setupTextureDescription();
	}

	@Override
	public CargoManager setupCargoManager() {

	return	new CargoManager(new CargoSpecification[][]
				{
						{ new CargoSpecification(ModelContainer2x20f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/2x20/Container_GO20", "2 x 20'' Containers, Green & Orange",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer2x20f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/2x20/Container_PN20", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer2x20f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/2x20/Container_WB20", "2 x 20'' Containers, Green & Orange",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer2x20f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/2x20/Container_FTR20", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer2x20f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/2x20/Container_Blauwnet20", "2 x 20'' Containers, Green & Orange",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x40f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x40/Container_B40", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x40f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x40/Container_G40", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x40f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x40/Container_O40", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x40f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x40/Container_R40", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x40f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x40/Container_ON40", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x40f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x40/Container_MR40", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x40f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x40/Container_HL40", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x40f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x40/Container_EG40", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x40f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x40/Container_BlauwnetW40", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x40f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x40/Container_BlauwnetB40", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_B20", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_G20", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_O20", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_W20", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_FTRB20", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_FTRW20", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_BlauwnetB20", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
						{ new CargoSpecification(ModelContainer1x20f_Cargo.class,
								Swedish_PackAddonInfo.modID, "trains/Wagons/Cargo/Containers/1x20/Container_BlauwnetW20", "2 x 20'' Containers, Postnord",
								new CargoSpecification.RenderParameters().setOffset(0.0,3.0,0))
						},
				});


	}

	@Override
	public void setupTextureDescription() {
		InsertTexture(0, "Red");
	}

	@Override
	public void onRenderInsertRecord()
	{
		Traincraft.traincraftRegistry.RegisterRollingStockModel(new TrainRenderRecord(Swedish_PackAddonInfo.modID,
				Swedish_PackEntityFreightSJLittLgs.class, new ModelSJLittLgs(),
				"Lgs",
				new float[] {-1.9F, -0.5F, 0.0F},
				new float[]{0F, 180F, 180F},
				null){
			@Override
			public ResourceLocation getTextureFile(String colorAsString) {
				String texturePath = "";
				switch (colorAsString.toLowerCase()) {
					case "blue":
						texturePath = "textures/trains/Wagons/Lgs/SJLittLgs_Red";
						break;
				}
				texturePath += ".png";

				return new ResourceLocation(Swedish_PackAddonInfo.modID, texturePath);
			}
		});
	}





	@Override
	public String getInventoryName() {
			return "SJ Litt Lgs";
	}

	

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.4F;
	}


}