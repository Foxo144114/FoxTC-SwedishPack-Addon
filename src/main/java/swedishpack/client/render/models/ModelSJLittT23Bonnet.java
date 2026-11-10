//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera T23 Bonnet
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittT23Bonnet extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittT23Bonnet() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[8];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 91, 385, textureX, textureY); // Du loco part19
		bodyModel[1] = new ModelRendererTurbo(this, 106, 385, textureX, textureY); // Du loco part19
		bodyModel[2] = new ModelRendererTurbo(this, 121, 385, textureX, textureY); // Du loco part19
		bodyModel[3] = new ModelRendererTurbo(this, 136, 385, textureX, textureY); // Du loco part19
		bodyModel[4] = new ModelRendererTurbo(this, 151, 385, textureX, textureY); // Du loco part19
		bodyModel[5] = new ModelRendererTurbo(this, 166, 385, textureX, textureY); // Du loco part19
		bodyModel[6] = new ModelRendererTurbo(this, 181, 385, textureX, textureY); // Du loco part19
		bodyModel[7] = new ModelRendererTurbo(this, 196, 385, textureX, textureY); // Du loco part19

		bodyModel[0].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[0].setRotationPoint(12F, -27F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[1].setRotationPoint(18F, -27F, -9F);

		bodyModel[2].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[2].setRotationPoint(12F, -27F, 8F);

		bodyModel[3].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[3].setRotationPoint(18F, -27F, 8F);

		bodyModel[4].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[4].setRotationPoint(6F, -27F, 9F);

		bodyModel[5].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[5].setRotationPoint(24F, -27F, 9F);

		bodyModel[6].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[6].setRotationPoint(6F, -27F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[7].setRotationPoint(24F, -27F, -10F);
	}
}