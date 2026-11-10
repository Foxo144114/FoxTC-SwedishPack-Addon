//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera B1909 Smoke
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittB1909Smoke extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittB1909Smoke ()//Same as Filename
	{
		bodyModel = new ModelRendererTurbo[22];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 0
		bodyModel[16] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 0
		bodyModel[17] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 0
		bodyModel[18] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 0
		bodyModel[19] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Box 0
		bodyModel[20] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Box 0
		bodyModel[21] = new ModelRendererTurbo(this, 345, 52, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.125F, -0.375F, -0.75F, -1.125F, -0.375F, -3F, 0F, 0F, 0F, 0F, 0F, -0.25F, -1.125F, -0.375F, -0.75F, -1.125F, -0.375F); // Box 0
		bodyModel[0].setRotationPoint(-11.5F, -23F, -3F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0.25F, -0.375F, -1.125F, -0.25F, -0.375F, -1.125F, -0.25F, -0.375F, -1.125F, 0.25F, -0.375F, -1.125F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-10.5F, -21.5F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, -2.375F, 0.375F, 0F, 0.25F, -0.75F, 0F, -0.25F, -0.25F, 0.25F, -2.375F, -2.375F, 0.25F, 0.375F, 0.375F, -0.25F, 0.375F, 0.375F, 0F, -0.75F, 0.25F, 0.25F, 0.375F, -2.375F); // Box 0
		bodyModel[2].setRotationPoint(-10.5F, -24.25F, 0.75F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0.125F, 0F, -0.375F, 0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[3].setRotationPoint(-10.75F, -22.25F, -0.25F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[4].setRotationPoint(-9F, -22.75F, -3.25F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 0
		bodyModel[5].setRotationPoint(-10F, -22.75F, -3.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 0
		bodyModel[6].setRotationPoint(-10F, -20.75F, -3.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.75F, -1.125F, -0.375F, -0.25F, -1.125F, -0.375F, 0F, 0F, 0F, -3F, 0F, 0F, -0.75F, -1.125F, -0.375F, -0.25F, -1.125F, -0.375F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(-11.5F, -23F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0.25F, -0.375F, -1.125F, -0.25F, -0.375F, -1.125F, -0.25F, -0.375F, -1.125F, 0.25F, -0.375F, -1.125F); // Box 0
		bodyModel[8].setRotationPoint(-10.5F, -24.5F, -1.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0.375F, 0.375F, -0.25F, 0.375F, 0.375F, 0F, -0.75F, 0.25F, 0.25F, 0.375F, -2.375F, 0.25F, -2.375F, 0.375F, 0F, 0.25F, -0.75F, 0F, -0.25F, -0.25F, 0.25F, -2.375F, -2.375F); // Box 0
		bodyModel[9].setRotationPoint(-10.5F, -20.75F, 0.75F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, -2.375F, -2.375F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.75F, 0.25F, -2.375F, 0.375F, 0.25F, 0.375F, -2.375F, 0F, -0.75F, 0.25F, -0.25F, 0.375F, 0.375F, 0.25F, 0.375F, 0.375F); // Box 0
		bodyModel[10].setRotationPoint(-10.5F, -24.25F, -2.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.25F, 0.375F, -2.375F, 0F, -0.75F, 0.25F, -0.25F, 0.375F, 0.375F, 0.25F, 0.375F, 0.375F, 0.25F, -2.375F, -2.375F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.75F, 0.25F, -2.375F, 0.375F); // Box 0
		bodyModel[11].setRotationPoint(-10.5F, -20.75F, -2.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,-0.375F, -1.125F, -0.75F, 0F, 0F, -3F, 0F, 0F, 0F, -0.375F, -1.125F, -0.25F, -0.375F, -1.125F, -0.75F, 0F, 0F, -3F, 0F, 0F, 0F, -0.375F, -1.125F, -0.25F); // Box 0
		bodyModel[12].setRotationPoint(-12.25F, -23F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,-1.125F, -0.375F, 0.25F, -1.125F, -0.375F, 0.25F, -1.125F, -0.375F, -0.25F, -1.125F, -0.375F, -0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-13.75F, -21.5F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2.375F, -2.375F, 0.25F, 0.375F, -2.375F, 0.25F, -0.75F, 0.25F, 0F, -0.25F, -0.25F, 0F, -2.375F, 0.375F, 0.25F, 0.375F, 0.375F, 0.25F, 0.375F, 0.375F, -0.25F, 0.25F, -0.75F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-15F, -24.25F, -5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.375F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, 0.125F, 0F, 0.125F, 0.125F, 0F, 0.125F, 0.125F, 0F, -0.375F, 0.125F, 0F); // Box 0
		bodyModel[15].setRotationPoint(-13F, -22.25F, -5.25F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, -3F, -0.375F, -1.125F, -0.75F, -0.375F, -1.125F, -0.25F, 0F, 0F, 0F, 0F, 0F, -3F, -0.375F, -1.125F, -0.75F, -0.375F, -1.125F, -0.25F, 0F, 0F, 0F); // Box 0
		bodyModel[16].setRotationPoint(-15.25F, -23F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.125F, -0.375F, 0.25F, -1.125F, -0.375F, 0.25F, -1.125F, -0.375F, -0.25F, -1.125F, -0.375F, -0.25F); // Box 0
		bodyModel[17].setRotationPoint(-13.75F, -24.5F, -5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-2.375F, 0.375F, 0.25F, 0.375F, 0.375F, 0.25F, 0.375F, 0.375F, -0.25F, 0.25F, -0.75F, 0F, -2.375F, -2.375F, 0.25F, 0.375F, -2.375F, 0.25F, -0.75F, 0.25F, 0F, -0.25F, -0.25F, 0F); // Box 0
		bodyModel[18].setRotationPoint(-15F, -20.75F, -5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.375F, -2.375F, 0.25F, -2.375F, -2.375F, 0.25F, -0.25F, -0.25F, 0F, -0.75F, 0.25F, 0F, 0.375F, 0.375F, 0.25F, -2.375F, 0.375F, 0.25F, 0.25F, -0.75F, 0F, 0.375F, 0.375F, -0.25F); // Box 0
		bodyModel[19].setRotationPoint(-11.5F, -24.25F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.375F, 0.375F, 0.25F, -2.375F, 0.375F, 0.25F, 0.25F, -0.75F, 0F, 0.375F, 0.375F, -0.25F, 0.375F, -2.375F, 0.25F, -2.375F, -2.375F, 0.25F, -0.25F, -0.25F, 0F, -0.75F, 0.25F, 0F); // Box 0
		bodyModel[20].setRotationPoint(-11.5F, -20.75F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[21].setRotationPoint(-9F, -20.75F, -3.25F);
	}
}