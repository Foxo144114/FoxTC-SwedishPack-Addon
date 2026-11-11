//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Model Swedish Motor off
// Model Creator: Foxo
// Created on: 22.12.2024 - 15:06:56
// Last changed on: 22.12.2024 - 15:06:56

package swedishpack.client.render.models.blocks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSwedishMotoroff extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSwedishMotoroff() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[16];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 31, 36, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 31, 21, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 31, 55, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 3, 32, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 50, 37, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 50, 37, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 3, 32, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 31, 14, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 31, 14, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 51, 26, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 38, 23, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 38, 23, textureX, textureY); // Box 0
		bodyModel[12] = new ModelRendererTurbo(this, 38, 23, textureX, textureY); // Box 0
		bodyModel[13] = new ModelRendererTurbo(this, 7, 18, textureX, textureY); // Box 0
		bodyModel[14] = new ModelRendererTurbo(this, 15, 26, textureX, textureY); // Box 0
		bodyModel[15] = new ModelRendererTurbo(this, 15, 26, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(1F, -1F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 0
		bodyModel[1].setRotationPoint(-2.5F, -1.5F, -3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(-3F, -1F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-0.9F, -0.5F, -21.25F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[4].setRotationPoint(-3F, -1.5F, -7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 0
		bodyModel[5].setRotationPoint(1F, -1.5F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 19, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-0.1F, -0.5F, -21.25F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,-0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F, -0.125F, -0.5F, -0.125F); // Box 0
		bodyModel[7].setRotationPoint(-2.5F, -2F, -3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 0
		bodyModel[8].setRotationPoint(-2.5F, -2.1F, -3F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-1F, -1.5F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 0
		bodyModel[10].setRotationPoint(0F, -1.5F, 0.75F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.5F, -0.125F, 0.25F, -0.5F, -0.125F, 0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 0
		bodyModel[11].setRotationPoint(0F, -2F, 0.75F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[12].setRotationPoint(0F, -1.25F, 0.75F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 10, 0F,-3F, -0.75F, 0F, -3F, -0.75F, 0F, -3F, -0.75F, 0F, -3F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[13].setRotationPoint(-3F, -1.5F, -21F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[14].setRotationPoint(-3F, -1.5F, -13F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 0
		bodyModel[15].setRotationPoint(-3F, -1.5F, -21F);
	}
}