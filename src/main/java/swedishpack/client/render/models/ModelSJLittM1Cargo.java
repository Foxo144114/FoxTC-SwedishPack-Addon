//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera M1 Cargo
// Model Creator: Foxo, Electric
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

import net.minecraft.entity.Entity;
import train.common.api.Freight;

public class ModelSJLittM1Cargo extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittM1Cargo() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 53, 61, textureX, textureY); // Du loco part41

		bodyModel[0].addShapeBox(0F, 0F, 0F, 25, 1, 12, 0F,-4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[0].setRotationPoint(0F, -15.5F, -6F);
	}
}