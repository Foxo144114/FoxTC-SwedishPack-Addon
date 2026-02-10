//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera Os
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittOs extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittOs() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[160];

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
		bodyModel[19] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Du loco part41
		bodyModel[20] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Du loco part09
		bodyModel[21] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Du loco part09
		bodyModel[22] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Du loco part41
		bodyModel[23] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part41
		bodyModel[24] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Du loco part41
		bodyModel[25] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part41
		bodyModel[26] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Du loco part41
		bodyModel[27] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Du loco part41
		bodyModel[28] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part41
		bodyModel[29] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Du loco part41
		bodyModel[30] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Du loco part41
		bodyModel[31] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Du loco part41
		bodyModel[32] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Du loco part41
		bodyModel[33] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Du loco part41
		bodyModel[34] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Du loco part09
		bodyModel[35] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Du loco part41
		bodyModel[36] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Du loco part41
		bodyModel[37] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Du loco part41
		bodyModel[38] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Du loco part41
		bodyModel[39] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Du loco part41
		bodyModel[40] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Du loco part41
		bodyModel[41] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Du loco part41
		bodyModel[42] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Du loco part41
		bodyModel[43] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Du loco part41
		bodyModel[44] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Du loco part41
		bodyModel[45] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Du loco part41
		bodyModel[46] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Du loco part41
		bodyModel[47] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Du loco part41
		bodyModel[48] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Du loco part41
		bodyModel[49] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Du loco part41
		bodyModel[50] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Du loco part41
		bodyModel[51] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Du loco part41
		bodyModel[52] = new ModelRendererTurbo(this, 361, 9, textureX, textureY); // Du loco part41
		bodyModel[53] = new ModelRendererTurbo(this, 377, 9, textureX, textureY); // Du loco part41
		bodyModel[54] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Du loco part41
		bodyModel[55] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Du loco part41
		bodyModel[56] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Du loco part41
		bodyModel[57] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Du loco part41
		bodyModel[58] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Du loco part41
		bodyModel[59] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part41
		bodyModel[60] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Du loco part41
		bodyModel[61] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Du loco part41
		bodyModel[62] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Du loco part41
		bodyModel[63] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Du loco part41
		bodyModel[64] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Du loco part41
		bodyModel[65] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Du loco part41
		bodyModel[66] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Du loco part41
		bodyModel[67] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Du loco part41
		bodyModel[68] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Du loco part41
		bodyModel[69] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Du loco part41
		bodyModel[70] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Du loco part41
		bodyModel[71] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Du loco part41
		bodyModel[72] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Du loco part41
		bodyModel[73] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Du loco part41
		bodyModel[74] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Du loco part41
		bodyModel[75] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Du loco part41
		bodyModel[76] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Du loco part41
		bodyModel[77] = new ModelRendererTurbo(this, 9, 33, textureX, textureY); // Du loco part41
		bodyModel[78] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Du loco part41
		bodyModel[79] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Du loco part41
		bodyModel[80] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Du loco part41
		bodyModel[81] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Du loco part41
		bodyModel[82] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Du loco part41
		bodyModel[83] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Du loco part41
		bodyModel[84] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Du loco part41
		bodyModel[85] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Du loco part41
		bodyModel[86] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Du loco part41
		bodyModel[87] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Du loco part41
		bodyModel[88] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Du loco part41
		bodyModel[89] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Du loco part41
		bodyModel[90] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Du loco part41
		bodyModel[91] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Du loco part41
		bodyModel[92] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[99] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[100] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[106] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[135] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[137] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[138] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[139] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[147] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[156] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 1, 8, 20, 0F); // Du loco part41
		bodyModel[0].setRotationPoint(-3F, -15F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 8, 20, 0F); // Du loco part41
		bodyModel[1].setRotationPoint(45F, -15F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[2].setRotationPoint(-20F, -7F, 6.05F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part41
		bodyModel[3].setRotationPoint(6.5F, -4.5F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[4].setRotationPoint(6F, -5F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[5].setRotationPoint(6F, -5F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part41
		bodyModel[6].setRotationPoint(6F, -4F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[7].setRotationPoint(3F, -5.25F, -6.25F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[8].setRotationPoint(6F, -5F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[9].setRotationPoint(8F, -6.5F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[10].setRotationPoint(1.5F, -7F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[11].setRotationPoint(10.5F, -7F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Du loco part41
		bodyModel[12].setRotationPoint(3F, -7F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[13].setRotationPoint(6F, -5F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[14].setRotationPoint(6F, -4F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part41
		bodyModel[15].setRotationPoint(3.25F, -4.5F, 5.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[16].setRotationPoint(3.25F, -6.5F, 5.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part41
		bodyModel[17].setRotationPoint(3.25F, -4.5F, -6.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[18].setRotationPoint(3.25F, -6.5F, -6.75F);

		bodyModel[19].addBox(0F, 0F, 0F, 47, 1, 20, 0F); // Du loco part41
		bodyModel[19].setRotationPoint(-2F, -9F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[20].setRotationPoint(-20F, -7F, -6.05F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[21].setRotationPoint(9F, -7F, 6.05F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part41
		bodyModel[22].setRotationPoint(35.5F, -4.5F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[23].setRotationPoint(35F, -5F, 6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[24].setRotationPoint(35F, -5F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part41
		bodyModel[25].setRotationPoint(35F, -4F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[26].setRotationPoint(32F, -5.25F, -6.25F);

		bodyModel[27].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[27].setRotationPoint(35F, -5F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[28].setRotationPoint(35F, -5F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[29].setRotationPoint(35F, -4F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part41
		bodyModel[30].setRotationPoint(32.25F, -4.5F, 5.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[31].setRotationPoint(32.25F, -6.5F, 5.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part41
		bodyModel[32].setRotationPoint(32.25F, -4.5F, -6.75F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[33].setRotationPoint(32.25F, -6.5F, -6.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[34].setRotationPoint(9F, -7F, -6.05F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[35].setRotationPoint(39F, -5.25F, -6.25F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part41
		bodyModel[36].setRotationPoint(38.75F, -4.5F, 5.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part41
		bodyModel[37].setRotationPoint(38.75F, -6.5F, 5.75F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[38].setRotationPoint(38.75F, -4.5F, -6.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[39].setRotationPoint(38.75F, -6.5F, -6.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[40].setRotationPoint(10F, -5.25F, -6.25F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part41
		bodyModel[41].setRotationPoint(9.75F, -4.5F, 5.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part41
		bodyModel[42].setRotationPoint(9.75F, -6.5F, 5.75F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[43].setRotationPoint(9.75F, -4.5F, -6.75F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[44].setRotationPoint(9.75F, -6.5F, -6.75F);

		bodyModel[45].addBox(0F, 0F, 0F, 47, 1, 1, 0F); // Du loco part41
		bodyModel[45].setRotationPoint(-2F, -8F, -7F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[46].setRotationPoint(4F, -6.5F, -7F);

		bodyModel[47].addBox(0F, 0F, 0F, 47, 1, 1, 0F); // Du loco part41
		bodyModel[47].setRotationPoint(-2F, -8F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[48].setRotationPoint(8F, -6.5F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[49].setRotationPoint(1.5F, -7F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[50].setRotationPoint(10.5F, -7F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part41
		bodyModel[51].setRotationPoint(3F, -7F, 6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[52].setRotationPoint(4F, -6.5F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[53].setRotationPoint(37F, -6.5F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[54].setRotationPoint(30.5F, -7F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[55].setRotationPoint(39.5F, -7F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Du loco part41
		bodyModel[56].setRotationPoint(32F, -7F, -7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[57].setRotationPoint(33F, -6.5F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[58].setRotationPoint(37F, -6.5F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[59].setRotationPoint(30.5F, -7F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[60].setRotationPoint(39.5F, -7F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part41
		bodyModel[61].setRotationPoint(32F, -7F, 6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[62].setRotationPoint(33F, -6.5F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[63].setRotationPoint(-3F, -18F, -10F);

		bodyModel[64].addBox(0F, 0F, 0F, 47, 6, 1, 0F); // Du loco part41
		bodyModel[64].setRotationPoint(-2F, -15F, -10F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 20, 0F,0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[65].setRotationPoint(45F, -18F, -10F);

		bodyModel[66].addBox(0F, 0F, 0F, 47, 6, 1, 0F); // Du loco part41
		bodyModel[66].setRotationPoint(-2F, -15F, 9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[67].setRotationPoint(22F, -7F, 6F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part41
		bodyModel[68].setRotationPoint(21F, -7F, 6F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Du loco part41
		bodyModel[69].setRotationPoint(21F, -24F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Du loco part41
		bodyModel[70].setRotationPoint(12.5F, -24F, -11F);

		bodyModel[71].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Du loco part41
		bodyModel[71].setRotationPoint(3F, -24F, -11F);

		bodyModel[72].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Du loco part41
		bodyModel[72].setRotationPoint(39F, -24F, -11F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Du loco part41
		bodyModel[73].setRotationPoint(29.5F, -24F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Du loco part41
		bodyModel[74].setRotationPoint(39F, -8.5F, -5.25F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Du loco part41
		bodyModel[75].setRotationPoint(39F, -8.5F, 4.25F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part41
		bodyModel[76].setRotationPoint(32F, -8.5F, -5.25F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part41
		bodyModel[77].setRotationPoint(32F, -8.5F, 4.25F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Du loco part41
		bodyModel[78].setRotationPoint(10F, -8.5F, -5.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Du loco part41
		bodyModel[79].setRotationPoint(10F, -8.5F, 4.25F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part41
		bodyModel[80].setRotationPoint(3F, -8.5F, -5.25F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part41
		bodyModel[81].setRotationPoint(3F, -8.5F, 4.25F);

		bodyModel[82].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Du loco part41
		bodyModel[82].setRotationPoint(39F, -8F, 7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part41
		bodyModel[83].setRotationPoint(14F, -7F, 6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[84].setRotationPoint(22F, -7F, -7F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part41
		bodyModel[85].setRotationPoint(21F, -7F, -7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 7, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part41
		bodyModel[86].setRotationPoint(14F, -7F, -7F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Du loco part41
		bodyModel[87].setRotationPoint(21F, -24F, 10F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Du loco part41
		bodyModel[88].setRotationPoint(12.5F, -24F, 10F);

		bodyModel[89].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Du loco part41
		bodyModel[89].setRotationPoint(3F, -24F, 10F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Du loco part41
		bodyModel[90].setRotationPoint(39F, -24F, 10F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Du loco part41
		bodyModel[91].setRotationPoint(29.5F, -24F, 10F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[92].setRotationPoint(-4F, -9.25F, 4.43F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[93].setRotationPoint(-3.75F, -9F, 4.9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[94].setRotationPoint(-6.5F, -8.75F, 5.15F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[95].setRotationPoint(-4F, -9.25F, -6.63F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[96].setRotationPoint(-6.5F, -8.75F, -5.88F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[97].setRotationPoint(-4F, -8.75F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[98].setRotationPoint(-4F, -8.75F, -1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[99].setRotationPoint(-3.5F, -8.5F, -0.25F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[100].setRotationPoint(-5.5F, -7F, -0.25F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[101].setRotationPoint(-4.5F, -8.75F, -0.25F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[102].setRotationPoint(-5.5F, -8.5F, 0F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[103].setRotationPoint(-5.5F, -8.5F, -0.75F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[104].setRotationPoint(-4F, -8.75F, 0.25F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[105].setRotationPoint(-4F, -8.5F, -0.25F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[106].setRotationPoint(-4F, -9F, -0.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[107].setRotationPoint(-4F, -6F, -0.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[108].setRotationPoint(-4F, -8.75F, -1F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[109].setRotationPoint(-5.5F, -6F, -0.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[110].setRotationPoint(-5.5F, -5.25F, -0.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[111].setRotationPoint(-7.5F, -8.87F, 4.03F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[112].setRotationPoint(-7.5F, -9.87F, 4.03F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[113].setRotationPoint(-7.5F, -9.37F, 4.03F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[114].setRotationPoint(-7.5F, -7.87F, 4.03F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[115].setRotationPoint(-7.5F, -8.37F, 4.03F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[116].setRotationPoint(-7.5F, -8.87F, -7.03F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[117].setRotationPoint(-7.5F, -9.87F, -7.03F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[118].setRotationPoint(-7.5F, -9.37F, -7.03F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[119].setRotationPoint(-7.5F, -7.87F, -7.03F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[120].setRotationPoint(-7.5F, -8.37F, -7.03F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[121].setRotationPoint(-3.75F, -9.5F, 4.9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[122].setRotationPoint(-3.75F, -8.25F, 4.9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[123].setRotationPoint(-3.75F, -9F, -6.13F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[124].setRotationPoint(-3.75F, -9.5F, -6.13F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[125].setRotationPoint(-3.75F, -8.25F, -6.13F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[126].setRotationPoint(46F, -9.25F, 4.43F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[127].setRotationPoint(45.75F, -9F, 4.9F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[128].setRotationPoint(46F, -9.25F, -6.63F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[129].setRotationPoint(46.5F, -8.75F, -5.88F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[130].setRotationPoint(46F, -8.75F, 0F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[131].setRotationPoint(46F, -8.75F, -1F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[132].setRotationPoint(45.5F, -8.5F, -0.25F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[133].setRotationPoint(46.5F, -7F, -0.25F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[134].setRotationPoint(46.5F, -8.75F, -0.25F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[135].setRotationPoint(45.5F, -8.5F, 0F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[136].setRotationPoint(45.5F, -8.5F, -0.75F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[137].setRotationPoint(46F, -8.75F, 0.25F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[138].setRotationPoint(46F, -8.5F, -0.25F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[139].setRotationPoint(46F, -9F, -0.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[140].setRotationPoint(46F, -6F, -0.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[141].setRotationPoint(46F, -8.75F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[142].setRotationPoint(46.5F, -6F, -0.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[143].setRotationPoint(47.5F, -5.25F, -0.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[144].setRotationPoint(49.5F, -8.87F, 4.03F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[145].setRotationPoint(49.5F, -9.87F, 4.03F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[146].setRotationPoint(49.5F, -9.37F, 4.03F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[147].setRotationPoint(49.5F, -7.87F, 4.03F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[148].setRotationPoint(49.5F, -8.37F, 4.03F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[149].setRotationPoint(49.5F, -8.87F, -7.03F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[150].setRotationPoint(49.5F, -9.87F, -7.03F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[151].setRotationPoint(49.5F, -9.37F, -7.03F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[152].setRotationPoint(49.5F, -7.87F, -7.03F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[153].setRotationPoint(49.5F, -8.37F, -7.03F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[154].setRotationPoint(45.75F, -9.5F, 4.9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[155].setRotationPoint(45.75F, -8.25F, 4.9F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[156].setRotationPoint(45.75F, -9F, -6.13F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[157].setRotationPoint(45.75F, -9.5F, -6.13F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[158].setRotationPoint(45.75F, -8.25F, -6.13F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[159].setRotationPoint(46.5F, -8.75F, 5.15F);
	}
}