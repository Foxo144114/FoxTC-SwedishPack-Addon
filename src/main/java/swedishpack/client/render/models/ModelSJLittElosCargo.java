//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera Elos Cargo
// Model Creator: Foxo, Electric
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

import net.minecraft.entity.Entity;
import train.common.api.Freight;

public class ModelSJLittElosCargo extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittElosCargo() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[3];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 132, 70, textureX, textureY); // Load3
		bodyModel[1] = new ModelRendererTurbo(this, 132, 89, textureX, textureY); // Load2
		bodyModel[2] = new ModelRendererTurbo(this, 132, 108, textureX, textureY); // Load1

		bodyModel[0].addBox(0F, 0F, 0F, 65, 0, 18, 0F); // Load3
		bodyModel[0].setRotationPoint(-2F, -20F, -9F);

		bodyModel[1].addBox(0F, 0F, 0F, 65, 0, 18, 0F); // Load2
		bodyModel[1].setRotationPoint(-2F, -16F, -9F);

		bodyModel[2].addBox(0F, 0F, 0F, 65, 0, 18, 0F); // Load1
		bodyModel[2].setRotationPoint(-2F, -12F, -9F);
	}
}