//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera Ob Panto
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittObPanto extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittObPanto() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[30];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Du loco part37
		bodyModel[1] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Du loco part37
		bodyModel[2] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Du loco part37
		bodyModel[3] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Du loco part37
		bodyModel[4] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Du loco part37
		bodyModel[5] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Du loco part37
		bodyModel[6] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Du loco part37
		bodyModel[7] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Du loco part37
		bodyModel[8] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Du loco part37
		bodyModel[9] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Du loco part37
		bodyModel[10] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Du loco part37
		bodyModel[11] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Du loco part37
		bodyModel[12] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Du loco part37
		bodyModel[13] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Du loco part37
		bodyModel[14] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Du loco part37
		bodyModel[15] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Du loco part37
		bodyModel[16] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Du loco part37
		bodyModel[17] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Du loco part37
		bodyModel[18] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Du loco part37
		bodyModel[19] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Du loco part37
		bodyModel[20] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Du loco part37
		bodyModel[21] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Du loco part37
		bodyModel[22] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Du loco part37
		bodyModel[23] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Du loco part37
		bodyModel[24] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Du loco part37
		bodyModel[25] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Du loco part37
		bodyModel[26] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Du loco part37
		bodyModel[27] = new ModelRendererTurbo(this, 393, 241, textureX, textureY); // Du loco part37
		bodyModel[28] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Du loco part37
		bodyModel[29] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Du loco part37

		bodyModel[0].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[0].setRotationPoint(13F, -37F, -4F);

		bodyModel[1].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[1].setRotationPoint(13F, -37F, 3F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[2].setRotationPoint(14F, -38F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[3].setRotationPoint(14F, -38F, 6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[4].setRotationPoint(14F, -38F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[5].setRotationPoint(2F, -35F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[6].setRotationPoint(2F, -36F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[7].setRotationPoint(18F, -35F, 4F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, 0F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -7F); // Du loco part37
		bodyModel[8].setRotationPoint(16F, -37F, -4F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[9].setRotationPoint(2F, -35F, 4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[10].setRotationPoint(2F, -36F, 3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[11].setRotationPoint(18F, -35F, -5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[12].setRotationPoint(15F, -36F, -4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[13].setRotationPoint(18F, -40F, 4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[14].setRotationPoint(5F, -40F, 4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[15].setRotationPoint(15F, -46F, 3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[16].setRotationPoint(5F, -46F, 3F);

		bodyModel[17].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[17].setRotationPoint(13F, -47F, -4F);

		bodyModel[18].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[18].setRotationPoint(13F, -47F, 3F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[19].setRotationPoint(14F, -48F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[20].setRotationPoint(14F, -48F, 6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[21].setRotationPoint(14F, -48F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[22].setRotationPoint(18F, -40F, -5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[23].setRotationPoint(5F, -40F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[24].setRotationPoint(15F, -46F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[25].setRotationPoint(5F, -46F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F); // Du loco part37
		bodyModel[26].setRotationPoint(16F, -46F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F); // Du loco part37
		bodyModel[27].setRotationPoint(16F, -46F, -4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[28].setRotationPoint(15F, -36F, 3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, -7F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F); // Du loco part37
		bodyModel[29].setRotationPoint(16F, -37F, -4F);
	}
}