//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera Elos
// Model Creator: Foxo, Electric
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

import net.minecraft.entity.Entity;
import train.common.api.Freight;

public class ModelSJLittElos extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittElos() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[180];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part41
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Du loco part41
		bodyModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Du loco part09
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Du loco part41
		bodyModel[4] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Du loco part41
		bodyModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Du loco part41
		bodyModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Du loco part41
		bodyModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Du loco part41
		bodyModel[8] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Du loco part41
		bodyModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Du loco part41
		bodyModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Du loco part41
		bodyModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Du loco part41
		bodyModel[12] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Du loco part41
		bodyModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Du loco part41
		bodyModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Du loco part41
		bodyModel[15] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Du loco part41
		bodyModel[16] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Du loco part41
		bodyModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Du loco part41
		bodyModel[18] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Du loco part41
		bodyModel[19] = new ModelRendererTurbo(this, 130, 48, textureX, textureY); // Du loco part41
		bodyModel[20] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Du loco part41
		bodyModel[21] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Du loco part41
		bodyModel[22] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Du loco part41
		bodyModel[23] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Du loco part41
		bodyModel[24] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Du loco part41
		bodyModel[25] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Du loco part41
		bodyModel[26] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Du loco part41
		bodyModel[27] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Du loco part41
		bodyModel[28] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Du loco part41
		bodyModel[29] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Du loco part41
		bodyModel[30] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Du loco part41
		bodyModel[31] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Du loco part41
		bodyModel[32] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Du loco part41
		bodyModel[33] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Du loco part41
		bodyModel[34] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Du loco part41
		bodyModel[35] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Du loco part41
		bodyModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part41
		bodyModel[37] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Du loco part41
		bodyModel[38] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Du loco part41
		bodyModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part41
		bodyModel[40] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Du loco part41
		bodyModel[41] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part41
		bodyModel[42] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Du loco part41
		bodyModel[43] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Du loco part41
		bodyModel[44] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Du loco part41
		bodyModel[45] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Du loco part41
		bodyModel[46] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Du loco part41
		bodyModel[47] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Du loco part41
		bodyModel[48] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Du loco part41
		bodyModel[49] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Du loco part41
		bodyModel[50] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Du loco part41
		bodyModel[51] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Du loco part41
		bodyModel[52] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Du loco part41
		bodyModel[53] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Du loco part41
		bodyModel[54] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Du loco part41
		bodyModel[55] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Du loco part41
		bodyModel[56] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Du loco part41
		bodyModel[57] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Du loco part41
		bodyModel[58] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Du loco part41
		bodyModel[59] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Du loco part41
		bodyModel[60] = new ModelRendererTurbo(this, 301, 52, textureX, textureY); // Du loco part41
		bodyModel[61] = new ModelRendererTurbo(this, 301, 38, textureX, textureY); // Du loco part41
		bodyModel[62] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part41
		bodyModel[63] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Du loco part41
		bodyModel[64] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Du loco part41
		bodyModel[65] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Du loco part41
		bodyModel[66] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Du loco part41
		bodyModel[67] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part41
		bodyModel[68] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Du loco part41
		bodyModel[69] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Du loco part41
		bodyModel[70] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Du loco part41
		bodyModel[71] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Du loco part41
		bodyModel[72] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Du loco part41
		bodyModel[73] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Du loco part41
		bodyModel[74] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Du loco part41
		bodyModel[75] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Du loco part41
		bodyModel[76] = new ModelRendererTurbo(this, 1, 39, textureX, textureY); // Du loco part09
		bodyModel[77] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Du loco part09
		bodyModel[78] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Du loco part09
		bodyModel[79] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Du loco part41
		bodyModel[80] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part41
		bodyModel[81] = new ModelRendererTurbo(this, 65, 61, textureX, textureY); // Du loco part41
		bodyModel[82] = new ModelRendererTurbo(this, 65, 64, textureX, textureY); // Du loco part41
		bodyModel[83] = new ModelRendererTurbo(this, 21, 102, textureX, textureY); // Du loco part41
		bodyModel[84] = new ModelRendererTurbo(this, 16, 70, textureX, textureY); // Du loco part41
		bodyModel[85] = new ModelRendererTurbo(this, 6, 86, textureX, textureY); // Du loco part41
		bodyModel[86] = new ModelRendererTurbo(this, 1, 86, textureX, textureY); // Du loco part41
		bodyModel[87] = new ModelRendererTurbo(this, 31, 86, textureX, textureY); // Du loco part41
		bodyModel[88] = new ModelRendererTurbo(this, 36, 86, textureX, textureY); // Du loco part41
		bodyModel[89] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Du loco part41
		bodyModel[90] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Du loco part41
		bodyModel[91] = new ModelRendererTurbo(this, 301, 73, textureX, textureY); // Du loco part41
		bodyModel[92] = new ModelRendererTurbo(this, 301, 76, textureX, textureY); // Du loco part41
		bodyModel[93] = new ModelRendererTurbo(this, 70, 61, textureX, textureY); // Du loco part41
		bodyModel[94] = new ModelRendererTurbo(this, 65, 39, textureX, textureY); // Du loco part41
		bodyModel[95] = new ModelRendererTurbo(this, 11, 70, textureX, textureY); // Du loco part41
		bodyModel[96] = new ModelRendererTurbo(this, 6, 70, textureX, textureY); // Du loco part41
		bodyModel[97] = new ModelRendererTurbo(this, 1, 70, textureX, textureY); // Du loco part41
		bodyModel[98] = new ModelRendererTurbo(this, 21, 70, textureX, textureY); // Du loco part41
		bodyModel[99] = new ModelRendererTurbo(this, 26, 70, textureX, textureY); // Du loco part41
		bodyModel[100] = new ModelRendererTurbo(this, 31, 70, textureX, textureY); // Du loco part41
		bodyModel[101] = new ModelRendererTurbo(this, 36, 70, textureX, textureY); // Du loco part41
		bodyModel[102] = new ModelRendererTurbo(this, 26, 102, textureX, textureY); // Du loco part41
		bodyModel[103] = new ModelRendererTurbo(this, 31, 102, textureX, textureY); // Du loco part41
		bodyModel[104] = new ModelRendererTurbo(this, 36, 102, textureX, textureY); // Du loco part41
		bodyModel[105] = new ModelRendererTurbo(this, 16, 102, textureX, textureY); // Du loco part41
		bodyModel[106] = new ModelRendererTurbo(this, 11, 102, textureX, textureY); // Du loco part41
		bodyModel[107] = new ModelRendererTurbo(this, 6, 102, textureX, textureY); // Du loco part41
		bodyModel[108] = new ModelRendererTurbo(this, 1, 102, textureX, textureY); // Du loco part41
		bodyModel[109] = new ModelRendererTurbo(this, 132, 70, textureX, textureY, "Load3"); // Load3
		bodyModel[110] = new ModelRendererTurbo(this, 132, 89, textureX, textureY, "Load2"); // Load2
		bodyModel[111] = new ModelRendererTurbo(this, 132, 108, textureX, textureY, "Load1"); // Load1
		bodyModel[112] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[135] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[137] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[138] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[139] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[147] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[156] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[164] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[165] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[166] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[167] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[168] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[169] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[170] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[171] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[172] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[173] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[174] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[175] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[176] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[177] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[178] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[179] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 1, 14, 20, 0F); // Du loco part41
		bodyModel[0].setRotationPoint(-3F, -21F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 14, 20, 0F); // Du loco part41
		bodyModel[1].setRotationPoint(63F, -21F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[2].setRotationPoint(-18.5F, -7.5F, 6.05F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part41
		bodyModel[3].setRotationPoint(7.5F, -4.5F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[4].setRotationPoint(7F, -5F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[5].setRotationPoint(7F, -5F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part41
		bodyModel[6].setRotationPoint(7F, -4F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[7].setRotationPoint(3.75F, -5.25F, -6.25F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[8].setRotationPoint(7F, -5F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[9].setRotationPoint(9F, -6.5F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[10].setRotationPoint(2.5F, -7F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[11].setRotationPoint(10.5F, -7F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Du loco part41
		bodyModel[12].setRotationPoint(4F, -7F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[13].setRotationPoint(7F, -5F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[14].setRotationPoint(7F, -4F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part41
		bodyModel[15].setRotationPoint(4F, -4.5F, 5.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[16].setRotationPoint(4F, -6.5F, 5.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part41
		bodyModel[17].setRotationPoint(4F, -4.5F, -6.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[18].setRotationPoint(4F, -6.5F, -6.75F);

		bodyModel[19].addBox(0F, 0F, 0F, 65, 1, 20, 0F); // Du loco part41
		bodyModel[19].setRotationPoint(-2F, -9F, -10F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part41
		bodyModel[20].setRotationPoint(52.5F, -4.5F, -6F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[21].setRotationPoint(52F, -5F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[22].setRotationPoint(52F, -5F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part41
		bodyModel[23].setRotationPoint(52F, -4F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[24].setRotationPoint(48.75F, -5.25F, -6.25F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[25].setRotationPoint(52F, -5F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[26].setRotationPoint(52F, -5F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[27].setRotationPoint(52F, -4F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part41
		bodyModel[28].setRotationPoint(49F, -4.5F, 5.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[29].setRotationPoint(49F, -6.5F, 5.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part41
		bodyModel[30].setRotationPoint(49F, -4.5F, -6.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[31].setRotationPoint(49F, -6.5F, -6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[32].setRotationPoint(56.25F, -5.25F, -6.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part41
		bodyModel[33].setRotationPoint(56F, -4.5F, 5.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part41
		bodyModel[34].setRotationPoint(56F, -6.5F, 5.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[35].setRotationPoint(56F, -4.5F, -6.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[36].setRotationPoint(56F, -6.5F, -6.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[37].setRotationPoint(11.25F, -5.25F, -6.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part41
		bodyModel[38].setRotationPoint(11F, -4.5F, 5.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part41
		bodyModel[39].setRotationPoint(11F, -6.5F, 5.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[40].setRotationPoint(11F, -4.5F, -6.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[41].setRotationPoint(11F, -6.5F, -6.75F);

		bodyModel[42].addBox(0F, 0F, 0F, 65, 1, 1, 0F); // Du loco part41
		bodyModel[42].setRotationPoint(-2F, -8F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[43].setRotationPoint(5F, -6.5F, -7F);

		bodyModel[44].addBox(0F, 0F, 0F, 65, 1, 1, 0F); // Du loco part41
		bodyModel[44].setRotationPoint(-2F, -8F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[45].setRotationPoint(9F, -6.5F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[46].setRotationPoint(2.5F, -7F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[47].setRotationPoint(11.5F, -7F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part41
		bodyModel[48].setRotationPoint(4F, -7F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[49].setRotationPoint(5F, -6.5F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[50].setRotationPoint(54F, -6.5F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[51].setRotationPoint(47.5F, -7F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[52].setRotationPoint(56.5F, -7F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Du loco part41
		bodyModel[53].setRotationPoint(49F, -7F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[54].setRotationPoint(50F, -6.5F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[55].setRotationPoint(54F, -6.5F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[56].setRotationPoint(47.5F, -7F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[57].setRotationPoint(56.5F, -7F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part41
		bodyModel[58].setRotationPoint(49F, -7F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[59].setRotationPoint(50F, -6.5F, 6F);

		bodyModel[60].addBox(0F, 0F, 0F, 65, 12, 1, 0F); // Du loco part41
		bodyModel[60].setRotationPoint(-2F, -21F, -10F);

		bodyModel[61].addBox(0F, 0F, 0F, 65, 12, 1, 0F); // Du loco part41
		bodyModel[61].setRotationPoint(-2F, -21F, 9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Du loco part41
		bodyModel[62].setRotationPoint(14F, -7F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[63].setRotationPoint(37F, -7F, 6F);

		bodyModel[64].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part41
		bodyModel[64].setRotationPoint(24F, -7F, 6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F); // Du loco part41
		bodyModel[65].setRotationPoint(14F, -7F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[66].setRotationPoint(37F, -7F, -7F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part41
		bodyModel[67].setRotationPoint(24F, -7F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Du loco part41
		bodyModel[68].setRotationPoint(56.25F, -8.5F, -5.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Du loco part41
		bodyModel[69].setRotationPoint(56.25F, -8.5F, 4.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part41
		bodyModel[70].setRotationPoint(48.75F, -8.5F, -5.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part41
		bodyModel[71].setRotationPoint(48.75F, -8.5F, 4.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Du loco part41
		bodyModel[72].setRotationPoint(11.25F, -8.5F, -5.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Du loco part41
		bodyModel[73].setRotationPoint(11.25F, -8.5F, 4.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part41
		bodyModel[74].setRotationPoint(3.75F, -8.5F, -5.25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part41
		bodyModel[75].setRotationPoint(3.75F, -8.5F, 4.25F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[76].setRotationPoint(-18.5F, -7.5F, -6.05F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[77].setRotationPoint(26.5F, -7.5F, 6.05F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[78].setRotationPoint(26.5F, -7.5F, -6.05F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part41
		bodyModel[79].setRotationPoint(36F, -7F, 6F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part41
		bodyModel[80].setRotationPoint(36F, -7F, -7F);

		bodyModel[81].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Du loco part41
		bodyModel[81].setRotationPoint(25F, -4F, 6F);

		bodyModel[82].addBox(0F, 0F, 0F, 11, 1, 1, 0F); // Du loco part41
		bodyModel[82].setRotationPoint(25F, -4F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[83].setRotationPoint(26F, -21F, 10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[84].setRotationPoint(26F, -21F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[85].setRotationPoint(64F, -21F, -4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[86].setRotationPoint(64F, -21F, 3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part41
		bodyModel[87].setRotationPoint(-4F, -21F, -4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part41
		bodyModel[88].setRotationPoint(-4F, -21F, 3F);

		bodyModel[89].addBox(0F, 0F, 0F, 65, 1, 1, 0F); // Du loco part41
		bodyModel[89].setRotationPoint(-2F, -8F, -10F);

		bodyModel[90].addBox(0F, 0F, 0F, 65, 1, 1, 0F); // Du loco part41
		bodyModel[90].setRotationPoint(-2F, -8F, 9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 65, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Du loco part41
		bodyModel[91].setRotationPoint(-2F, -22F, 9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 65, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[92].setRotationPoint(-2F, -22F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Du loco part41
		bodyModel[93].setRotationPoint(-3F, -22F, -10F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Du loco part41
		bodyModel[94].setRotationPoint(63F, -22F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[95].setRotationPoint(18F, -21F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[96].setRotationPoint(10F, -21F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[97].setRotationPoint(2F, -21F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[98].setRotationPoint(34F, -21F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[99].setRotationPoint(42F, -21F, -11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[100].setRotationPoint(50F, -21F, -11F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[101].setRotationPoint(58F, -21F, -11F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[102].setRotationPoint(18F, -21F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[103].setRotationPoint(10F, -21F, 10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[104].setRotationPoint(2F, -21F, 10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[105].setRotationPoint(34F, -21F, 10F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[106].setRotationPoint(42F, -21F, 10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[107].setRotationPoint(50F, -21F, 10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[108].setRotationPoint(58F, -21F, 10F);

		bodyModel[109].addBox(0F, 0F, 0F, 65, 0, 18, 0F); // Load3
		bodyModel[109].setRotationPoint(-2F, -20F, -9F);

		bodyModel[110].addBox(0F, 0F, 0F, 65, 0, 18, 0F); // Load2
		bodyModel[110].setRotationPoint(-2F, -16F, -9F);

		bodyModel[111].addBox(0F, 0F, 0F, 65, 0, 18, 0F); // Load1
		bodyModel[111].setRotationPoint(-2F, -12F, -9F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[112].setRotationPoint(-4F, -9.25F, 4.43F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[113].setRotationPoint(-3.75F, -9F, 4.9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[114].setRotationPoint(-6.5F, -8.75F, 5.15F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[115].setRotationPoint(-4F, -9.25F, -6.63F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[116].setRotationPoint(-6.5F, -8.75F, -5.88F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[117].setRotationPoint(-4F, -8.75F, 0F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[118].setRotationPoint(-4F, -8.75F, -1F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[119].setRotationPoint(-3.5F, -8.5F, -0.25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[120].setRotationPoint(-5.5F, -7F, -0.25F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[121].setRotationPoint(-4.5F, -8.75F, -0.25F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[122].setRotationPoint(-5.5F, -8.5F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[123].setRotationPoint(-5.5F, -8.5F, -0.75F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[124].setRotationPoint(-4F, -8.75F, 0.25F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[125].setRotationPoint(-4F, -8.5F, -0.25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[126].setRotationPoint(-4F, -9F, -0.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[127].setRotationPoint(-4F, -6F, -0.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[128].setRotationPoint(-4F, -8.75F, -1F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[129].setRotationPoint(-5.5F, -6F, -0.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[130].setRotationPoint(-5.5F, -5.25F, -0.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[131].setRotationPoint(-7.5F, -8.87F, 4.03F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[132].setRotationPoint(-7.5F, -9.87F, 4.03F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[133].setRotationPoint(-7.5F, -9.37F, 4.03F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[134].setRotationPoint(-7.5F, -7.87F, 4.03F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[135].setRotationPoint(-7.5F, -8.37F, 4.03F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[136].setRotationPoint(-7.5F, -8.87F, -7.03F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[137].setRotationPoint(-7.5F, -9.87F, -7.03F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[138].setRotationPoint(-7.5F, -9.37F, -7.03F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[139].setRotationPoint(-7.5F, -7.87F, -7.03F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[140].setRotationPoint(-7.5F, -8.37F, -7.03F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[141].setRotationPoint(-3.75F, -9.5F, 4.9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[142].setRotationPoint(-3.75F, -8.25F, 4.9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[143].setRotationPoint(-3.75F, -9F, -6.13F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[144].setRotationPoint(-3.75F, -9.5F, -6.13F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[145].setRotationPoint(-3.75F, -8.25F, -6.13F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[146].setRotationPoint(64F, -9.25F, 4.43F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[147].setRotationPoint(63.75F, -9F, 4.9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[148].setRotationPoint(64.5F, -8.75F, 5.15F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[149].setRotationPoint(64F, -9.25F, -6.63F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[150].setRotationPoint(64.5F, -8.75F, -5.88F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[151].setRotationPoint(64F, -8.75F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[152].setRotationPoint(64F, -8.75F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[153].setRotationPoint(63.5F, -8.5F, -0.25F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[154].setRotationPoint(64.5F, -7F, -0.25F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[155].setRotationPoint(64.5F, -8.75F, -0.25F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[156].setRotationPoint(63.5F, -8.5F, 0F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[157].setRotationPoint(63.5F, -8.5F, -0.75F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[158].setRotationPoint(64F, -8.75F, 0.25F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[159].setRotationPoint(64F, -8.5F, -0.25F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[160].setRotationPoint(64F, -9F, -0.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[161].setRotationPoint(64F, -6F, -0.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[162].setRotationPoint(64F, -8.75F, -1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[163].setRotationPoint(64.5F, -6F, -0.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[164].setRotationPoint(65.5F, -5.25F, -0.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[165].setRotationPoint(67.5F, -8.87F, 4.03F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[166].setRotationPoint(67.5F, -9.87F, 4.03F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[167].setRotationPoint(67.5F, -9.37F, 4.03F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[168].setRotationPoint(67.5F, -7.87F, 4.03F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[169].setRotationPoint(67.5F, -8.37F, 4.03F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[170].setRotationPoint(67.5F, -8.87F, -7.03F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[171].setRotationPoint(67.5F, -9.87F, -7.03F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[172].setRotationPoint(67.5F, -9.37F, -7.03F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[173].setRotationPoint(67.5F, -7.87F, -7.03F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[174].setRotationPoint(67.5F, -8.37F, -7.03F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[175].setRotationPoint(63.75F, -9.5F, 4.9F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[176].setRotationPoint(63.75F, -8.25F, 4.9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[177].setRotationPoint(63.75F, -9F, -6.13F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[178].setRotationPoint(63.75F, -9.5F, -6.13F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[179].setRotationPoint(63.75F, -8.25F, -6.13F);
	}


	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bodyModel[0].render(f5);
		bodyModel[1].render(f5);
		bodyModel[2].render(f5);
		bodyModel[3].render(f5);
		bodyModel[4].render(f5);
		bodyModel[5].render(f5);
		bodyModel[6].render(f5);
		bodyModel[7].render(f5);
		bodyModel[8].render(f5);
		bodyModel[9].render(f5);
		bodyModel[10].render(f5);
		bodyModel[11].render(f5);
		bodyModel[12].render(f5);
		bodyModel[13].render(f5);
		bodyModel[14].render(f5);
		bodyModel[15].render(f5);
		bodyModel[16].render(f5);
		bodyModel[17].render(f5);
		bodyModel[18].render(f5);
		bodyModel[19].render(f5);
		bodyModel[20].render(f5);
		bodyModel[21].render(f5);
		bodyModel[22].render(f5);
		bodyModel[23].render(f5);
		bodyModel[24].render(f5);
		bodyModel[25].render(f5);
		bodyModel[26].render(f5);
		bodyModel[27].render(f5);
		bodyModel[28].render(f5);
		bodyModel[29].render(f5);
		bodyModel[30].render(f5);
		bodyModel[31].render(f5);
		bodyModel[32].render(f5);
		bodyModel[33].render(f5);
		bodyModel[34].render(f5);
		bodyModel[35].render(f5);
		bodyModel[36].render(f5);
		bodyModel[37].render(f5);
		bodyModel[38].render(f5);
		bodyModel[39].render(f5);
		bodyModel[40].render(f5);
		bodyModel[41].render(f5);
		bodyModel[42].render(f5);
		bodyModel[43].render(f5);
		bodyModel[44].render(f5);
		bodyModel[45].render(f5);
		bodyModel[46].render(f5);
		bodyModel[47].render(f5);
		bodyModel[48].render(f5);
		bodyModel[49].render(f5);
		bodyModel[50].render(f5);
		bodyModel[51].render(f5);
		bodyModel[52].render(f5);
		bodyModel[53].render(f5);
		bodyModel[54].render(f5);
		bodyModel[55].render(f5);
		bodyModel[56].render(f5);
		bodyModel[57].render(f5);
		bodyModel[58].render(f5);
		bodyModel[59].render(f5);
		bodyModel[60].render(f5);
		bodyModel[61].render(f5);
		bodyModel[62].render(f5);
		bodyModel[63].render(f5);
		bodyModel[64].render(f5);
		bodyModel[65].render(f5);
		bodyModel[66].render(f5);
		bodyModel[67].render(f5);
		bodyModel[68].render(f5);
		bodyModel[69].render(f5);
		bodyModel[70].render(f5);
		bodyModel[71].render(f5);
		bodyModel[72].render(f5);
		bodyModel[73].render(f5);
		bodyModel[74].render(f5);
		bodyModel[75].render(f5);
		bodyModel[76].render(f5);
		bodyModel[77].render(f5);
		bodyModel[78].render(f5);
		bodyModel[79].render(f5);
		bodyModel[80].render(f5);
		bodyModel[81].render(f5);
		bodyModel[82].render(f5);
		bodyModel[83].render(f5);
		bodyModel[84].render(f5);
		bodyModel[85].render(f5);
		bodyModel[86].render(f5);
		bodyModel[87].render(f5);
		bodyModel[88].render(f5);
		bodyModel[89].render(f5);
		bodyModel[90].render(f5);
		bodyModel[91].render(f5);
		bodyModel[92].render(f5);
		bodyModel[93].render(f5);
		bodyModel[94].render(f5);
		bodyModel[95].render(f5);
		bodyModel[96].render(f5);
		bodyModel[97].render(f5);
		bodyModel[98].render(f5);
		bodyModel[99].render(f5);
		bodyModel[100].render(f5);
		bodyModel[101].render(f5);
		bodyModel[102].render(f5);
		bodyModel[103].render(f5);
		bodyModel[104].render(f5);
		bodyModel[105].render(f5);
		bodyModel[106].render(f5);
		bodyModel[107].render(f5);
		bodyModel[108].render(f5);
		bodyModel[112].render(f5);
		bodyModel[113].render(f5);
		bodyModel[114].render(f5);
		bodyModel[115].render(f5);
		bodyModel[116].render(f5);
		bodyModel[117].render(f5);
		bodyModel[118].render(f5);
		bodyModel[119].render(f5);
		bodyModel[120].render(f5);
		bodyModel[121].render(f5);
		bodyModel[122].render(f5);
		bodyModel[123].render(f5);
		bodyModel[124].render(f5);
		bodyModel[125].render(f5);
		bodyModel[126].render(f5);
		bodyModel[127].render(f5);
		bodyModel[128].render(f5);
		bodyModel[129].render(f5);
		bodyModel[130].render(f5);
		bodyModel[131].render(f5);
		bodyModel[132].render(f5);
		bodyModel[133].render(f5);
		bodyModel[134].render(f5);
		bodyModel[135].render(f5);
		bodyModel[136].render(f5);
		bodyModel[137].render(f5);
		bodyModel[138].render(f5);
		bodyModel[139].render(f5);
		bodyModel[130].render(f5);
		bodyModel[131].render(f5);
		bodyModel[132].render(f5);
		bodyModel[133].render(f5);
		bodyModel[134].render(f5);
		bodyModel[135].render(f5);
		bodyModel[136].render(f5);
		bodyModel[137].render(f5);
		bodyModel[138].render(f5);
		bodyModel[139].render(f5);
		bodyModel[140].render(f5);
		bodyModel[141].render(f5);
		bodyModel[142].render(f5);
		bodyModel[143].render(f5);
		bodyModel[144].render(f5);
		bodyModel[145].render(f5);
		bodyModel[146].render(f5);
		bodyModel[147].render(f5);
		bodyModel[148].render(f5);
		bodyModel[149].render(f5);
		bodyModel[150].render(f5);
		bodyModel[151].render(f5);
		bodyModel[152].render(f5);
		bodyModel[153].render(f5);
		bodyModel[154].render(f5);
		bodyModel[155].render(f5);
		bodyModel[156].render(f5);
		bodyModel[157].render(f5);
		bodyModel[158].render(f5);
		bodyModel[159].render(f5);
		bodyModel[160].render(f5);
		bodyModel[161].render(f5);
		bodyModel[162].render(f5);
		bodyModel[163].render(f5);
		bodyModel[164].render(f5);
		bodyModel[165].render(f5);
		bodyModel[166].render(f5);
		bodyModel[167].render(f5);
		bodyModel[168].render(f5);
		bodyModel[169].render(f5);
		bodyModel[170].render(f5);
		bodyModel[171].render(f5);
		bodyModel[172].render(f5);
		bodyModel[173].render(f5);
		bodyModel[174].render(f5);
		bodyModel[175].render(f5);
		bodyModel[176].render(f5);
		bodyModel[177].render(f5);
		bodyModel[178].render(f5);
		bodyModel[179].render(f5);
		int cargo = ((Freight) entity).getAmmountOfCargo();
		if (cargo != 0) {

			if (cargo >= 1 && cargo < 13) {
				bodyModel[111].render(f5);
			}
			else if (cargo >= 25 && cargo < 37) {
				bodyModel[109].render(f5);
			}
			else{
				bodyModel[110].render(f5);
			}
		}





	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	}











}