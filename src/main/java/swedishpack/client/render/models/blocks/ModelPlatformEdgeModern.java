//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: PlatformEdge Modern
// Model Creator: Foxo
// Created on: 22.12.2024 - 15:06:56
// Last changed on: 22.12.2024 - 15:06:56

package swedishpack.client.render.models.blocks; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelPlatformEdgeModern extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelPlatformEdgeModern() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[2];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 24, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 11, 6, 16, 0F); // Box 0
		bodyModel[0].setRotationPoint(-3F, -6F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 12, 2, 16, 0F); // Box 0
		bodyModel[1].setRotationPoint(-4F, -8F, -8F);
	}
}