//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Lgns-081
// Model Creator: EnaqleElectric
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.common.api.AbstractTrains;

public class ModelSJLittLgns_081 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittLgns_081() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[254];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 3, 1, textureX, textureY); // Du loco part41
		bodyModel[1] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Du loco part41
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
		bodyModel[19] = new ModelRendererTurbo(this, 148, 51, textureX, textureY); // Du loco part41
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
		bodyModel[60] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part41
		bodyModel[61] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Du loco part41
		bodyModel[62] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Du loco part41
		bodyModel[63] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Du loco part41
		bodyModel[64] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Du loco part41
		bodyModel[65] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part41
		bodyModel[66] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Du loco part41
		bodyModel[67] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Du loco part41
		bodyModel[68] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Du loco part41
		bodyModel[69] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Du loco part41
		bodyModel[70] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Du loco part41
		bodyModel[71] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Du loco part41
		bodyModel[72] = new ModelRendererTurbo(this, 142, 49, textureX, textureY); // Du loco part41
		bodyModel[73] = new ModelRendererTurbo(this, 142, 49, textureX, textureY); // Du loco part41
		bodyModel[74] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Du loco part09
		bodyModel[75] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Du loco part09
		bodyModel[76] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Du loco part09
		bodyModel[77] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Du loco part41
		bodyModel[78] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part41
		bodyModel[79] = new ModelRendererTurbo(this, 65, 60, textureX, textureY); // Du loco part41
		bodyModel[80] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Du loco part41
		bodyModel[81] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[82] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[83] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[84] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[85] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[86] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[87] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[88] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[89] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[90] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[91] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[92] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[93] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[94] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[95] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[97] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[98] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[99] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[100] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[104] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[105] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[106] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[107] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[108] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[109] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[110] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[111] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[112] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 148, 51, textureX, textureY); // Du loco part41
		bodyModel[133] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Du loco part41
		bodyModel[134] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Du loco part41
		bodyModel[135] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Du loco part41
		bodyModel[136] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Du loco part41
		bodyModel[137] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Du loco part41
		bodyModel[138] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[139] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[147] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[156] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 3, 1, textureX, textureY); // Du loco part41
		bodyModel[163] = new ModelRendererTurbo(this, 51, 1, textureX, textureY); // Du loco part41
		bodyModel[164] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Du loco part41
		bodyModel[165] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Du loco part41
		bodyModel[166] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Du loco part41
		bodyModel[167] = new ModelRendererTurbo(this, 57, 7, textureX, textureY); // Du loco part41
		bodyModel[168] = new ModelRendererTurbo(this, 57, 7, textureX, textureY); // Du loco part41
		bodyModel[169] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Du loco part41
		bodyModel[170] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Du loco part41
		bodyModel[171] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Du loco part41
		bodyModel[172] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Du loco part41
		bodyModel[173] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[174] = new ModelRendererTurbo(this, 69, 25, textureX, textureY); // Du loco part41
		bodyModel[175] = new ModelRendererTurbo(this, 74, 30, textureX, textureY); // Du loco part41
		bodyModel[176] = new ModelRendererTurbo(this, 74, 30, textureX, textureY); // Du loco part41
		bodyModel[177] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[178] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[179] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[180] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[181] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[182] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[183] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[184] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[185] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[186] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[187] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[188] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[189] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[190] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[191] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[192] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[193] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[194] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[195] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[196] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[197] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[198] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[199] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[200] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[201] = new ModelRendererTurbo(this, 3, 1, textureX, textureY); // Du loco part41
		bodyModel[202] = new ModelRendererTurbo(this, 3, 1, textureX, textureY); // Du loco part41
		bodyModel[203] = new ModelRendererTurbo(this, 57, 7, textureX, textureY); // Du loco part41
		bodyModel[204] = new ModelRendererTurbo(this, 57, 7, textureX, textureY); // Du loco part41
		bodyModel[205] = new ModelRendererTurbo(this, 57, 7, textureX, textureY); // Du loco part41
		bodyModel[206] = new ModelRendererTurbo(this, 57, 7, textureX, textureY); // Du loco part41
		bodyModel[207] = new ModelRendererTurbo(this, 57, 7, textureX, textureY); // Du loco part41
		bodyModel[208] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Du loco part41
		bodyModel[209] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part41
		bodyModel[210] = new ModelRendererTurbo(this, 5, 3, textureX, textureY); // Du loco part41
		bodyModel[211] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[212] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[213] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[214] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[215] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[216] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[217] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[218] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[219] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[220] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[221] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[222] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[223] = new ModelRendererTurbo(this, 5, 3, textureX, textureY); // Du loco part41
		bodyModel[224] = new ModelRendererTurbo(this, 5, 3, textureX, textureY); // Du loco part41
		bodyModel[225] = new ModelRendererTurbo(this, 5, 3, textureX, textureY); // Du loco part41
		bodyModel[226] = new ModelRendererTurbo(this, 16, 14, textureX, textureY); // Du loco part41
		bodyModel[227] = new ModelRendererTurbo(this, 16, 14, textureX, textureY); // Du loco part41
		bodyModel[228] = new ModelRendererTurbo(this, 16, 14, textureX, textureY); // Du loco part41
		bodyModel[229] = new ModelRendererTurbo(this, 16, 14, textureX, textureY); // Du loco part41
		bodyModel[230] = new ModelRendererTurbo(this, 172, 55, textureX, textureY); // Du loco part41
		bodyModel[231] = new ModelRendererTurbo(this, 145, 55, textureX, textureY); // Du loco part41
		bodyModel[232] = new ModelRendererTurbo(this, 136, 62, textureX, textureY); // Du loco part41
		bodyModel[233] = new ModelRendererTurbo(this, 136, 62, textureX, textureY); // Du loco part41
		bodyModel[234] = new ModelRendererTurbo(this, 225, 37, textureX, textureY); // Du loco part41
		bodyModel[235] = new ModelRendererTurbo(this, 225, 37, textureX, textureY); // Du loco part41
		bodyModel[236] = new ModelRendererTurbo(this, 225, 37, textureX, textureY); // Du loco part41
		bodyModel[237] = new ModelRendererTurbo(this, 225, 37, textureX, textureY); // Du loco part41
		bodyModel[238] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[239] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[240] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[241] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[242] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[243] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[244] = new ModelRendererTurbo(this, 16, 14, textureX, textureY); // Du loco part41
		bodyModel[245] = new ModelRendererTurbo(this, 16, 14, textureX, textureY); // Du loco part41
		bodyModel[246] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[247] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[248] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[249] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[250] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[251] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[252] = new ModelRendererTurbo(this, 16, 14, textureX, textureY); // Du loco part41
		bodyModel[253] = new ModelRendererTurbo(this, 16, 14, textureX, textureY); // Du loco part41

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[0].setRotationPoint(-3F, -10F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part41
		bodyModel[1].setRotationPoint(70F, -10F, -9F);

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

		bodyModel[19].addShapeBox(0F, 0F, 0F, 72, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[19].setRotationPoint(-2F, -10F, -9F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part41
		bodyModel[20].setRotationPoint(59.5F, -4.5F, -6F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[21].setRotationPoint(59F, -5F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[22].setRotationPoint(59F, -5F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part41
		bodyModel[23].setRotationPoint(59F, -4F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[24].setRotationPoint(55.75F, -5.25F, -6.25F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[25].setRotationPoint(59F, -5F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[26].setRotationPoint(58F, -5F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[27].setRotationPoint(58F, -4F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part41
		bodyModel[28].setRotationPoint(56F, -4.5F, 5.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[29].setRotationPoint(56F, -6.5F, 5.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part41
		bodyModel[30].setRotationPoint(56F, -4.5F, -6.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[31].setRotationPoint(56F, -6.5F, -6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[32].setRotationPoint(63.25F, -5.25F, -6.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part41
		bodyModel[33].setRotationPoint(63F, -4.5F, 5.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part41
		bodyModel[34].setRotationPoint(63F, -6.5F, 5.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[35].setRotationPoint(63F, -4.5F, -6.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[36].setRotationPoint(63F, -6.5F, -6.75F);

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

		bodyModel[42].addBox(0F, 0F, 0F, 70, 2, 1, 0F); // Du loco part41
		bodyModel[42].setRotationPoint(-1F, -9F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[43].setRotationPoint(5F, -6.5F, -7F);

		bodyModel[44].addBox(0F, 0F, 0F, 70, 2, 1, 0F); // Du loco part41
		bodyModel[44].setRotationPoint(-1F, -9F, 6F);

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
		bodyModel[50].setRotationPoint(61F, -6.5F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[51].setRotationPoint(54.5F, -7F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[52].setRotationPoint(63.5F, -7F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Du loco part41
		bodyModel[53].setRotationPoint(56F, -7F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[54].setRotationPoint(57F, -6.5F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[55].setRotationPoint(61F, -6.5F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Du loco part41
		bodyModel[56].setRotationPoint(54.5F, -7F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Du loco part41
		bodyModel[57].setRotationPoint(63.5F, -7F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part41
		bodyModel[58].setRotationPoint(56F, -7F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Du loco part41
		bodyModel[59].setRotationPoint(57F, -6.5F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,1F, 1F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, 0F, 1F, 1F, 0F, 1F, -4F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, -4F, 0F); // Du loco part41
		bodyModel[60].setRotationPoint(14F, -7F, 5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -3F, -0.5F, 1F, 1F, -0.5F, 1F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, -0.5F, 1F, -4F, -0.5F, 1F, -4F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[61].setRotationPoint(44F, -7F, 5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[62].setRotationPoint(24F, -7F, 5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,1F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, -0.5F, 1F, 1F, -0.5F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, -4F, -0.5F); // Du loco part41
		bodyModel[63].setRotationPoint(14F, -7F, -6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -3F, 0F, 1F, 1F, 0F, 1F, 1F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[64].setRotationPoint(44F, -7F, -6F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[65].setRotationPoint(24F, -7F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Du loco part41
		bodyModel[66].setRotationPoint(63.25F, -8.5F, -5.25F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Du loco part41
		bodyModel[67].setRotationPoint(63.25F, -8.5F, 4.25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part41
		bodyModel[68].setRotationPoint(55.75F, -8.5F, -5.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part41
		bodyModel[69].setRotationPoint(55.75F, -8.5F, 4.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Du loco part41
		bodyModel[70].setRotationPoint(11.25F, -8.5F, -5.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Du loco part41
		bodyModel[71].setRotationPoint(11.25F, -8.5F, 4.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part41
		bodyModel[72].setRotationPoint(3.75F, -8.5F, -5.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part41
		bodyModel[73].setRotationPoint(3.75F, -8.5F, 4.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[74].setRotationPoint(-18.5F, -7.5F, -6.05F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[75].setRotationPoint(33.5F, -7.5F, 6.05F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[76].setRotationPoint(33.5F, -7.5F, -6.05F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[77].setRotationPoint(43F, -7F, 5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[78].setRotationPoint(43F, -7F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[79].setRotationPoint(24F, -4F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[80].setRotationPoint(24F, -4F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[81].setRotationPoint(-4F, -9.25F, 5.43F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.375F, 1.5F, -0.25F, 0.375F, 1.5F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.375F, 1.5F, 0F, 0.375F); // Box 0
		bodyModel[82].setRotationPoint(-3.75F, -9F, 5.9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[83].setRotationPoint(-4F, -8.75F, 0F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[84].setRotationPoint(-4F, -8.75F, -1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[85].setRotationPoint(-3.5F, -8.5F, -0.25F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[86].setRotationPoint(-5.5F, -7F, -0.25F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[87].setRotationPoint(-4.5F, -8.75F, -0.25F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[88].setRotationPoint(-5.5F, -8.5F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[89].setRotationPoint(-5.5F, -8.5F, -0.75F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[90].setRotationPoint(-4F, -8.75F, 0.25F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[91].setRotationPoint(-4F, -8.5F, -0.25F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[92].setRotationPoint(-4F, -9F, -0.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[93].setRotationPoint(-4F, -6F, -0.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[94].setRotationPoint(-4F, -8.75F, -1F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[95].setRotationPoint(-5.5F, -6F, -0.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[96].setRotationPoint(-5.5F, -5.25F, -0.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 0
		bodyModel[97].setRotationPoint(-7.5F, -8.87F, 5.03F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Box 0
		bodyModel[98].setRotationPoint(-7.5F, -9.87F, 5.03F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F); // Box 0
		bodyModel[99].setRotationPoint(-7.5F, -9.37F, 5.03F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 0
		bodyModel[100].setRotationPoint(-7.5F, -7.87F, 5.03F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 0
		bodyModel[101].setRotationPoint(-7.5F, -8.37F, 5.03F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, 1.5F, -0.375F, 0F, 1.5F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.375F, 1.5F, -0.25F, 0.375F); // Box 0
		bodyModel[102].setRotationPoint(-3.75F, -9.5F, 5.9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.375F, 1.5F, -0.25F, 0.375F, 1.5F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, 1.5F, -0.375F, 0F); // Box 0
		bodyModel[103].setRotationPoint(-3.75F, -8.25F, 5.9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[104].setRotationPoint(73F, -8.75F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[105].setRotationPoint(73F, -8.75F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[106].setRotationPoint(72.5F, -8.5F, -0.25F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[107].setRotationPoint(73.5F, -7F, -0.25F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[108].setRotationPoint(73.5F, -8.75F, -0.25F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[109].setRotationPoint(72.5F, -8.5F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[110].setRotationPoint(72.5F, -8.5F, -0.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[111].setRotationPoint(73F, -8.75F, 0.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[112].setRotationPoint(73F, -8.5F, -0.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[113].setRotationPoint(73F, -9F, -0.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[114].setRotationPoint(73F, -8.75F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[115].setRotationPoint(73.5F, -6F, -0.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[116].setRotationPoint(74.5F, -5.25F, -0.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.25F, 1F, -0.125F, 0.25F, 1F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, 0.125F, 0.25F, 1F, 0.125F, 0.25F, 1F, 0.125F, 0.5F, 0F, 0.125F, 0.5F); // Box 0
		bodyModel[117].setRotationPoint(-6.5F, -9F, 5.9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.125F, 1F, -0.25F, -0.125F, 1F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.375F, 0.25F, 1F, -0.375F, 0.25F, 1F, -0.375F, 0.5F, 0F, -0.375F, 0.5F); // Box 0
		bodyModel[118].setRotationPoint(-6.5F, -9.5F, 5.9F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0.25F, 1F, -0.375F, 0.25F, 1F, -0.375F, 0.5F, 0F, -0.375F, 0.5F, 0F, -0.25F, -0.125F, 1F, -0.25F, -0.125F, 1F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 0
		bodyModel[119].setRotationPoint(-6.5F, -8.25F, 5.9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[120].setRotationPoint(-4F, -9.25F, -7.63F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.375F, 1.5F, -0.25F, 0.375F, 1.5F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.375F, 1.5F, 0F, 0.375F); // Box 0
		bodyModel[121].setRotationPoint(-3.75F, -9F, -7.16F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F); // Box 0
		bodyModel[122].setRotationPoint(-7.5F, -8.87F, -8.03F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F); // Box 0
		bodyModel[123].setRotationPoint(-7.5F, -9.87F, -8.03F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F); // Box 0
		bodyModel[124].setRotationPoint(-7.5F, -9.37F, -8.03F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 0
		bodyModel[125].setRotationPoint(-7.5F, -7.87F, -8.03F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F); // Box 0
		bodyModel[126].setRotationPoint(-7.5F, -8.37F, -8.03F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, 1.5F, -0.375F, 0F, 1.5F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.375F, 1.5F, -0.25F, 0.375F); // Box 0
		bodyModel[127].setRotationPoint(-3.75F, -9.5F, -7.16F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.5F, -0.25F, 0.125F, -0.375F, -0.25F, 0.125F, -0.375F, -0.25F, 0.375F, 1.5F, -0.25F, 0.375F, 1.5F, -0.375F, -0.25F, -0.375F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, 1.5F, -0.375F, 0F); // Box 0
		bodyModel[128].setRotationPoint(-3.75F, -8.25F, -7.16F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.125F, 0.25F, 1F, -0.125F, 0.25F, 1F, -0.125F, 0.5F, 0F, -0.125F, 0.5F, 0F, 0.125F, 0.25F, 1F, 0.125F, 0.25F, 1F, 0.125F, 0.5F, 0F, 0.125F, 0.5F); // Box 0
		bodyModel[129].setRotationPoint(-6.5F, -9F, -7.16F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, -0.125F, 1F, -0.25F, -0.125F, 1F, -0.25F, 0.125F, 0F, -0.25F, 0.125F, 0F, -0.375F, 0.25F, 1F, -0.375F, 0.25F, 1F, -0.375F, 0.5F, 0F, -0.375F, 0.5F); // Box 0
		bodyModel[130].setRotationPoint(-6.5F, -9.5F, -7.16F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0.25F, 1F, -0.375F, 0.25F, 1F, -0.375F, 0.5F, 0F, -0.375F, 0.5F, 0F, -0.25F, -0.125F, 1F, -0.25F, -0.125F, 1F, -0.25F, 0.125F, 0F, -0.25F, 0.125F); // Box 0
		bodyModel[131].setRotationPoint(-6.5F, -8.25F, -7.16F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 72, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[132].setRotationPoint(-2F, -10F, 7F);

		bodyModel[133].addBox(0F, 0F, 0F, 70, 2, 1, 0F); // Du loco part41
		bodyModel[133].setRotationPoint(-1F, -9F, -0.5F);

		bodyModel[134].addBox(0F, 0F, 0F, 70, 2, 1, 0F); // Du loco part41
		bodyModel[134].setRotationPoint(-1F, -9F, 1.63F);

		bodyModel[135].addBox(0F, 0F, 0F, 70, 2, 1, 0F); // Du loco part41
		bodyModel[135].setRotationPoint(-1F, -9F, 3.75F);

		bodyModel[136].addBox(0F, 0F, 0F, 70, 2, 1, 0F); // Du loco part41
		bodyModel[136].setRotationPoint(-1F, -9F, -2.63F);

		bodyModel[137].addBox(0F, 0F, 0F, 70, 2, 1, 0F); // Du loco part41
		bodyModel[137].setRotationPoint(-1F, -9F, -4.75F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[138].setRotationPoint(73F, -9.25F, 5.43F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.25F, 0.125F, 1.5F, -0.25F, 0.125F, 1.5F, -0.25F, 0.375F, -0.375F, -0.25F, 0.375F, -0.375F, 0F, 0.125F, 1.5F, 0F, 0.125F, 1.5F, 0F, 0.375F, -0.375F, 0F, 0.375F); // Box 0
		bodyModel[139].setRotationPoint(72.75F, -9F, 5.9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 0
		bodyModel[140].setRotationPoint(76.5F, -8.87F, 5.03F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 0
		bodyModel[141].setRotationPoint(76.5F, -9.87F, 5.03F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 0
		bodyModel[142].setRotationPoint(76.5F, -9.37F, 5.03F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[143].setRotationPoint(76.5F, -7.87F, 5.03F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 0
		bodyModel[144].setRotationPoint(76.5F, -8.37F, 5.03F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, -0.25F, 1.5F, -0.375F, -0.25F, 1.5F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.25F, 0.125F, 1.5F, -0.25F, 0.125F, 1.5F, -0.25F, 0.375F, -0.375F, -0.25F, 0.375F); // Box 0
		bodyModel[145].setRotationPoint(72.75F, -9.5F, 5.9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.25F, 0.125F, 1.5F, -0.25F, 0.125F, 1.5F, -0.25F, 0.375F, -0.375F, -0.25F, 0.375F, -0.375F, -0.375F, -0.25F, 1.5F, -0.375F, -0.25F, 1.5F, -0.375F, 0F, -0.375F, -0.375F, 0F); // Box 0
		bodyModel[146].setRotationPoint(72.75F, -8.25F, 5.9F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.5F, 1F, -0.125F, 0.5F, 1F, 0.125F, 0.25F, 0F, 0.125F, 0.25F, 0F, 0.125F, 0.5F, 1F, 0.125F, 0.5F); // Box 0
		bodyModel[147].setRotationPoint(75.5F, -9F, 5.9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0.125F, 1F, -0.25F, 0.125F, 1F, -0.375F, 0.25F, 0F, -0.375F, 0.25F, 0F, -0.375F, 0.5F, 1F, -0.375F, 0.5F); // Box 0
		bodyModel[148].setRotationPoint(75.5F, -9.5F, 5.9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -0.375F, 0.25F, 0F, -0.375F, 0.25F, 0F, -0.375F, 0.5F, 1F, -0.375F, 0.5F, 1F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0.125F, 1F, -0.25F, 0.125F); // Box 0
		bodyModel[149].setRotationPoint(75.5F, -8.25F, 5.9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[150].setRotationPoint(73F, -9.25F, -7.63F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.25F, 0.125F, 1.5F, -0.25F, 0.125F, 1.5F, -0.25F, 0.375F, -0.375F, -0.25F, 0.375F, -0.375F, 0F, 0.125F, 1.5F, 0F, 0.125F, 1.5F, 0F, 0.375F, -0.375F, 0F, 0.375F); // Box 0
		bodyModel[151].setRotationPoint(72.75F, -9F, -7.16F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 0
		bodyModel[152].setRotationPoint(76.5F, -8.87F, -8.03F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 0
		bodyModel[153].setRotationPoint(76.5F, -9.87F, -8.03F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F); // Box 0
		bodyModel[154].setRotationPoint(76.5F, -9.37F, -8.03F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 0
		bodyModel[155].setRotationPoint(76.5F, -7.87F, -8.03F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 0
		bodyModel[156].setRotationPoint(76.5F, -8.37F, -8.03F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, -0.25F, 1.5F, -0.375F, -0.25F, 1.5F, -0.375F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.25F, 0.125F, 1.5F, -0.25F, 0.125F, 1.5F, -0.25F, 0.375F, -0.375F, -0.25F, 0.375F); // Box 0
		bodyModel[157].setRotationPoint(72.75F, -9.5F, -7.16F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.25F, 0.125F, 1.5F, -0.25F, 0.125F, 1.5F, -0.25F, 0.375F, -0.375F, -0.25F, 0.375F, -0.375F, -0.375F, -0.25F, 1.5F, -0.375F, -0.25F, 1.5F, -0.375F, 0F, -0.375F, -0.375F, 0F); // Box 0
		bodyModel[158].setRotationPoint(72.75F, -8.25F, -7.16F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, 0F, -0.125F, 0.5F, 1F, -0.125F, 0.5F, 1F, 0.125F, 0.25F, 0F, 0.125F, 0.25F, 0F, 0.125F, 0.5F, 1F, 0.125F, 0.5F); // Box 0
		bodyModel[159].setRotationPoint(75.5F, -9F, -7.16F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0.125F, 1F, -0.25F, 0.125F, 1F, -0.375F, 0.25F, 0F, -0.375F, 0.25F, 0F, -0.375F, 0.5F, 1F, -0.375F, 0.5F); // Box 0
		bodyModel[160].setRotationPoint(75.5F, -9.5F, -7.16F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1F, -0.375F, 0.25F, 0F, -0.375F, 0.25F, 0F, -0.375F, 0.5F, 1F, -0.375F, 0.5F, 1F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0.125F, 1F, -0.25F, 0.125F); // Box 0
		bodyModel[161].setRotationPoint(75.5F, -8.25F, -7.16F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[162].setRotationPoint(-3F, -10F, -9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[163].setRotationPoint(70F, -10F, -9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F); // Du loco part41
		bodyModel[164].setRotationPoint(-4F, -10F, -9F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Du loco part41
		bodyModel[165].setRotationPoint(-4F, -10F, -5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F); // Du loco part41
		bodyModel[166].setRotationPoint(-4F, -10F, 4F);

		bodyModel[167].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Du loco part41
		bodyModel[167].setRotationPoint(24F, -9F, -6F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Du loco part41
		bodyModel[168].setRotationPoint(43F, -9F, -6F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[169].setRotationPoint(71F, -10F, -9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[170].setRotationPoint(71F, -10F, -5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[171].setRotationPoint(71F, -10F, 4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[172].setRotationPoint(71F, -10F, 8F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[173].setRotationPoint(73F, -6F, -0.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[174].setRotationPoint(71F, -9F, -4F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[175].setRotationPoint(71F, -9F, -8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[176].setRotationPoint(71F, -9F, 5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[177].setRotationPoint(-1F, -10F, -9F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[178].setRotationPoint(-1F, -11F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[179].setRotationPoint(-1F, -11F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[180].setRotationPoint(-1F, -10F, 8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[181].setRotationPoint(-1F, -11F, 8F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[182].setRotationPoint(-1F, -11F, 8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[183].setRotationPoint(32F, -10F, -9F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[184].setRotationPoint(32F, -11F, -9F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[185].setRotationPoint(32F, -11F, -9F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[186].setRotationPoint(32F, -10F, 8F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[187].setRotationPoint(32F, -11F, 8F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[188].setRotationPoint(32F, -11F, 8F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[189].setRotationPoint(35F, -10F, -9F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[190].setRotationPoint(35F, -11F, -9F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[191].setRotationPoint(35F, -11F, -9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[192].setRotationPoint(35F, -10F, 8F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[193].setRotationPoint(35F, -11F, 8F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[194].setRotationPoint(35F, -11F, 8F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[195].setRotationPoint(68F, -10F, -9F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[196].setRotationPoint(68F, -10F, 8F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[197].setRotationPoint(68F, -11F, -9F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[198].setRotationPoint(68F, -11F, -9F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[199].setRotationPoint(68F, -11F, 8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[200].setRotationPoint(68F, -11F, 8F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Du loco part41
		bodyModel[201].setRotationPoint(-2F, -9F, -9F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 2, 18, 0F); // Du loco part41
		bodyModel[202].setRotationPoint(69F, -9F, -9F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Du loco part41
		bodyModel[203].setRotationPoint(33.5F, -9F, -6F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Du loco part41
		bodyModel[204].setRotationPoint(5F, -9F, -6F);

		bodyModel[205].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Du loco part41
		bodyModel[205].setRotationPoint(14.5F, -9F, -6F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Du loco part41
		bodyModel[206].setRotationPoint(62F, -9F, -6F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 2, 12, 0F); // Du loco part41
		bodyModel[207].setRotationPoint(52.5F, -9F, -6F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[208].setRotationPoint(33.5F, -7F, 5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[209].setRotationPoint(33.5F, -7F, -6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[210].setRotationPoint(17F, -10F, -8F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[211].setRotationPoint(17F, -10F, -9F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[212].setRotationPoint(17F, -11F, -9F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[213].setRotationPoint(17F, -11F, -9F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[214].setRotationPoint(17F, -10F, 8F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[215].setRotationPoint(17F, -11F, 8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[216].setRotationPoint(17F, -11F, 8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[217].setRotationPoint(50F, -10F, -9F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[218].setRotationPoint(50F, -11F, -9F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[219].setRotationPoint(50F, -11F, -9F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[220].setRotationPoint(50F, -10F, 8F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[221].setRotationPoint(50F, -11F, 8F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[222].setRotationPoint(50F, -11F, 8F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[223].setRotationPoint(32F, -10F, -8F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[224].setRotationPoint(35F, -10F, -8F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[225].setRotationPoint(50F, -10F, -8F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F); // Du loco part41
		bodyModel[226].setRotationPoint(-1F, -10F, -8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[227].setRotationPoint(-1F, -10F, 3F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F); // Du loco part41
		bodyModel[228].setRotationPoint(68F, -10F, -8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[229].setRotationPoint(68F, -10F, 3F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 9, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[230].setRotationPoint(-2F, -10F, -2.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 8, 1, 5, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[231].setRotationPoint(62F, -10F, -2.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[232].setRotationPoint(7F, -10F, -7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 5, 1, 14, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[233].setRotationPoint(57F, -10F, -7F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 1F, 0F, 0F, -1.125F, 0F, 0F, 1.125F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.125F, 0F, 0F, 1.125F, 0F, 0F, -1F); // Du loco part41
		bodyModel[234].setRotationPoint(-1F, -9F, -3.75F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 1.125F, 0F, 0F, -1.125F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1.125F, 0F, 0F, -1.125F, 0F, 0F, 1F); // Du loco part41
		bodyModel[235].setRotationPoint(-1F, -9F, 2.75F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, -1.125F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1.125F, 0F, 0F, -1.125F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 1.125F); // Du loco part41
		bodyModel[236].setRotationPoint(63F, -9F, -3.75F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 1.125F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.125F, 0F, 0F, 1.125F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.125F); // Du loco part41
		bodyModel[237].setRotationPoint(63F, -9F, 2.75F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[238].setRotationPoint(8F, -10F, -9F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[239].setRotationPoint(8F, -11F, -9F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[240].setRotationPoint(8F, -11F, -9F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[241].setRotationPoint(8F, -10F, 8F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[242].setRotationPoint(8F, -11F, 8F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[243].setRotationPoint(8F, -11F, 8F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F); // Du loco part41
		bodyModel[244].setRotationPoint(8F, -10F, -8F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[245].setRotationPoint(8F, -10F, 3F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[246].setRotationPoint(59F, -10F, -9F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[247].setRotationPoint(59F, -10F, 8F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[248].setRotationPoint(59F, -11F, -9F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[249].setRotationPoint(59F, -11F, -9F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[250].setRotationPoint(59F, -11F, 8F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[251].setRotationPoint(59F, -11F, 8F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F); // Du loco part41
		bodyModel[252].setRotationPoint(59F, -10F, -8F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.25F, 0.375F, 0F, -0.25F, 0.375F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0.375F, 0F, 0F, 0.375F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[253].setRotationPoint(59F, -10F, 3F);
	}
	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale)
	{
		super.render(entity, f0, f1, f2, f3, f4, scale);
		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f0, f1, f2, f3, f4, scale);
	}
}