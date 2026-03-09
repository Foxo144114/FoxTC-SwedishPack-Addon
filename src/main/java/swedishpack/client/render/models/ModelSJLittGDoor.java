//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera G Door
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located


import tmt.ModelConverter;
import tmt.ModelRendererTurbo;


public class ModelSJLittGDoor extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittGDoor() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[4];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 337, 99, textureX, textureY); // Du loco part41
		bodyModel[1] = new ModelRendererTurbo(this, 308, 99, textureX, textureY); // Du loco part41
		bodyModel[2] = new ModelRendererTurbo(this, 279, 99, textureX, textureY); // Du loco part41
		bodyModel[3] = new ModelRendererTurbo(this, 250, 99, textureX, textureY); // Du loco part41

		bodyModel[0].addBox(0F, 0F, 0F, 13, 18, 1, 0F); // Du loco part41
		bodyModel[0].setRotationPoint(11F, -27.5F, 10F);

		bodyModel[1].addBox(0F, 0F, 0F, 13, 18, 1, 0F); // Du loco part41
		bodyModel[1].setRotationPoint(24F, -27.5F, 10F);

		bodyModel[2].addBox(0F, 0F, 0F, 13, 18, 1, 0F); // Du loco part41
		bodyModel[2].setRotationPoint(24F, -27.5F, -11F);

		bodyModel[3].addBox(0F, 0F, 0F, 13, 18, 1, 0F); // Du loco part41
		bodyModel[3].setRotationPoint(37F, -27.5F, -11F);
	}
}