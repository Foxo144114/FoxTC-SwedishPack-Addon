//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera Dm Panto
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittDmPanto extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittDmPanto() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[30];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Dm Part82
		bodyModel[1] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Dm Part83
		bodyModel[2] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Dm Part84
		bodyModel[3] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Dm Part85
		bodyModel[4] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Dm Part92
		bodyModel[5] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Dm Part93
		bodyModel[6] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Dm Part94
		bodyModel[7] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Dm Part95
		bodyModel[8] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Dm Part96
		bodyModel[9] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Dm Part103
		bodyModel[10] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Dm Part104
		bodyModel[11] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Dm Part105
		bodyModel[12] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Dm Part106
		bodyModel[13] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Dm Part288
		bodyModel[14] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Dm Part289
		bodyModel[15] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Dm Part290
		bodyModel[16] = new ModelRendererTurbo(this, 33, 265, textureX, textureY); // Dm Part291
		bodyModel[17] = new ModelRendererTurbo(this, 65, 265, textureX, textureY); // Dm Part292
		bodyModel[18] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Dm Part293
		bodyModel[19] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Dm Part294
		bodyModel[20] = new ModelRendererTurbo(this, 353, 265, textureX, textureY); // Dm Part295
		bodyModel[21] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Dm Part296
		bodyModel[22] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Dm Part297
		bodyModel[23] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Dm Part298
		bodyModel[24] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Dm Part299
		bodyModel[25] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Dm Part300
		bodyModel[26] = new ModelRendererTurbo(this, 87, 288, textureX, textureY); // Dm Part105
		bodyModel[27] = new ModelRendererTurbo(this, 51, 288, textureX, textureY); // Dm Part105
		bodyModel[28] = new ModelRendererTurbo(this, 87, 309, textureX, textureY); // Dm Part293
		bodyModel[29] = new ModelRendererTurbo(this, 45, 309, textureX, textureY); // Dm Part293

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Dm Part82
		bodyModel[0].setRotationPoint(13F, -40F, 4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Dm Part83
		bodyModel[1].setRotationPoint(0F, -40F, 4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Dm Part84
		bodyModel[2].setRotationPoint(10F, -46F, 3F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Dm Part85
		bodyModel[3].setRotationPoint(0F, -46F, 3F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Dm Part92
		bodyModel[4].setRotationPoint(8F, -47F, -4F);

		bodyModel[5].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Dm Part93
		bodyModel[5].setRotationPoint(8F, -47F, 3F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Dm Part94
		bodyModel[6].setRotationPoint(9F, -48F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Dm Part95
		bodyModel[7].setRotationPoint(9F, -48F, 6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Dm Part96
		bodyModel[8].setRotationPoint(9F, -48F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Dm Part103
		bodyModel[9].setRotationPoint(13F, -40F, -5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Dm Part104
		bodyModel[10].setRotationPoint(0F, -40F, -5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Dm Part105
		bodyModel[11].setRotationPoint(10F, -46F, -4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Dm Part106
		bodyModel[12].setRotationPoint(0F, -46F, -4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Dm Part288
		bodyModel[13].setRotationPoint(-3F, -35F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Dm Part289
		bodyModel[14].setRotationPoint(13F, -35F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Dm Part290
		bodyModel[15].setRotationPoint(-3F, -36F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Dm Part291
		bodyModel[16].setRotationPoint(10F, -36F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Dm Part292
		bodyModel[17].setRotationPoint(-3F, -36F, 3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Dm Part293
		bodyModel[18].setRotationPoint(10F, -36F, 3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Dm Part294
		bodyModel[19].setRotationPoint(-3F, -35F, 4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Dm Part295
		bodyModel[20].setRotationPoint(13F, -35F, 4F);

		bodyModel[21].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Dm Part296
		bodyModel[21].setRotationPoint(8F, -37F, -4F);

		bodyModel[22].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Dm Part297
		bodyModel[22].setRotationPoint(8F, -37F, 3F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Dm Part298
		bodyModel[23].setRotationPoint(9F, -38F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Dm Part299
		bodyModel[24].setRotationPoint(9F, -38F, 6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Dm Part300
		bodyModel[25].setRotationPoint(9F, -38F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -7F, 0F, 0F, -7F, -8F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, -8F, 0F, 0F); // Dm Part105
		bodyModel[26].setRotationPoint(11F, -46F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, -7F, -8F, 0F, -7F, -8F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, -8F, 0F, -7F); // Dm Part105
		bodyModel[27].setRotationPoint(11F, -46F, -4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -7F); // Dm Part293
		bodyModel[28].setRotationPoint(11F, -36F, -4F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F); // Dm Part293
		bodyModel[29].setRotationPoint(11F, -36F, -4F);
	}
}