//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera M1
// Model Creator: Foxo, Electric
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.common.api.AbstractTrains;

public class ModelSJLittM1 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittM1()  //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[213];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part09
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Du loco part41
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Du loco part41
		bodyModel[3] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Du loco part09
		bodyModel[4] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Du loco part09
		bodyModel[5] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Du loco part09
		bodyModel[6] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Du loco part09
		bodyModel[7] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Du loco part09
		bodyModel[8] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Du loco part01
		bodyModel[9] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Du loco part01
		bodyModel[10] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Du loco part01
		bodyModel[11] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Du loco part01
		bodyModel[12] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Du loco part01
		bodyModel[13] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Du loco part01
		bodyModel[14] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Du loco part41
		bodyModel[15] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Du loco part41
		bodyModel[16] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Du loco part41
		bodyModel[17] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Du loco part41
		bodyModel[18] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Du loco part41
		bodyModel[19] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Du loco part41
		bodyModel[20] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Du loco part41
		bodyModel[21] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Du loco part41
		bodyModel[22] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Du loco part41
		bodyModel[23] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Du loco part41
		bodyModel[24] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Du loco part41
		bodyModel[25] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Du loco part41
		bodyModel[26] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Du loco part41
		bodyModel[27] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Du loco part41
		bodyModel[28] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Du loco part41
		bodyModel[29] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Du loco part41
		bodyModel[30] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Du loco part41
		bodyModel[31] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Du loco part41
		bodyModel[32] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Du loco part41
		bodyModel[33] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Du loco part41
		bodyModel[34] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Du loco part41
		bodyModel[35] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Du loco part41
		bodyModel[36] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Du loco part41
		bodyModel[37] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Du loco part41
		bodyModel[38] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part41
		bodyModel[39] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Du loco part41
		bodyModel[40] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Du loco part41
		bodyModel[41] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Du loco part41
		bodyModel[42] = new ModelRendererTurbo(this, 129, 41, textureX, textureY); // Du loco part41
		bodyModel[43] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Du loco part41
		bodyModel[44] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Du loco part41
		bodyModel[45] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Du loco part41
		bodyModel[46] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Du loco part41
		bodyModel[47] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Du loco part41
		bodyModel[48] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Du loco part41
		bodyModel[49] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Du loco part41
		bodyModel[50] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Du loco part41
		bodyModel[51] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Du loco part41
		bodyModel[52] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Du loco part41
		bodyModel[53] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Du loco part41
		bodyModel[54] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Du loco part41
		bodyModel[55] = new ModelRendererTurbo(this, 305, 41, textureX, textureY); // Du loco part41
		bodyModel[56] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Du loco part41
		bodyModel[57] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Du loco part41
		bodyModel[58] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Du loco part41
		bodyModel[59] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Du loco part41
		bodyModel[60] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Du loco part41
		bodyModel[61] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Du loco part41
		bodyModel[62] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Du loco part41
		bodyModel[63] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Du loco part41
		bodyModel[64] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Du loco part41
		bodyModel[65] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Du loco part41
		bodyModel[66] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Du loco part41
		bodyModel[67] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Du loco part41
		bodyModel[68] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Du loco part41
		bodyModel[69] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Du loco part41
		bodyModel[70] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Du loco part41
		bodyModel[71] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Du loco part41
		bodyModel[72] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Du loco part41
		bodyModel[73] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Du loco part41
		bodyModel[74] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Du loco part41
		bodyModel[75] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Du loco part41
		bodyModel[76] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Du loco part41
		bodyModel[77] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Du loco part41
		bodyModel[78] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Du loco part41
		bodyModel[79] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Du loco part41
		bodyModel[80] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Du loco part41
		bodyModel[81] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Du loco part41
		bodyModel[82] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Du loco part41
		bodyModel[83] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Du loco part41
		bodyModel[84] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Du loco part41
		bodyModel[85] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Du loco part41
		bodyModel[86] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Du loco part41
		bodyModel[87] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Du loco part41
		bodyModel[88] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Du loco part41
		bodyModel[89] = new ModelRendererTurbo(this, 17, 57, textureX, textureY); // Du loco part41
		bodyModel[90] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Du loco part41
		bodyModel[91] = new ModelRendererTurbo(this, 49, 57, textureX, textureY); // Du loco part41
		bodyModel[92] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Du loco part01
		bodyModel[93] = new ModelRendererTurbo(this, 129, 57, textureX, textureY); // Du loco part01
		bodyModel[94] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Du loco part41
		bodyModel[95] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Du loco part41
		bodyModel[96] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Du loco part41
		bodyModel[97] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Du loco part41
		bodyModel[98] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Du loco part41
		bodyModel[99] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[100] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[101] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[102] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[103] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
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
		bodyModel[114] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[135] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[137] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[138] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[139] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[147] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[156] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[164] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[165] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[166] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[167] = new ModelRendererTurbo(this, 7, 63, textureX, textureY); // Du loco part41
		bodyModel[168] = new ModelRendererTurbo(this, 226, 66, textureX, textureY); // Du loco part01
		bodyModel[169] = new ModelRendererTurbo(this, 226, 66, textureX, textureY); // Du loco part01
		bodyModel[170] = new ModelRendererTurbo(this, 7, 63, textureX, textureY); // Du loco part41
		bodyModel[171] = new ModelRendererTurbo(this, 226, 66, textureX, textureY); // Du loco part01
		bodyModel[172] = new ModelRendererTurbo(this, 226, 66, textureX, textureY); // Du loco part01
		bodyModel[173] = new ModelRendererTurbo(this, 7, 63, textureX, textureY); // Du loco part41
		bodyModel[174] = new ModelRendererTurbo(this, 226, 66, textureX, textureY); // Du loco part01
		bodyModel[175] = new ModelRendererTurbo(this, 226, 66, textureX, textureY); // Du loco part01
		bodyModel[176] = new ModelRendererTurbo(this, 7, 63, textureX, textureY); // Du loco part41
		bodyModel[177] = new ModelRendererTurbo(this, 226, 66, textureX, textureY); // Du loco part01
		bodyModel[178] = new ModelRendererTurbo(this, 226, 66, textureX, textureY); // Du loco part01
		bodyModel[179] = new ModelRendererTurbo(this, 192, 63, textureX, textureY); // Du loco part41
		bodyModel[180] = new ModelRendererTurbo(this, 192, 63, textureX, textureY); // Du loco part41
		bodyModel[181] = new ModelRendererTurbo(this, 192, 71, textureX, textureY); // Du loco part41
		bodyModel[182] = new ModelRendererTurbo(this, 192, 71, textureX, textureY); // Du loco part41
		bodyModel[183] = new ModelRendererTurbo(this, 192, 71, textureX, textureY); // Du loco part41
		bodyModel[184] = new ModelRendererTurbo(this, 192, 71, textureX, textureY); // Du loco part41
		bodyModel[185] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Du loco part41
		bodyModel[186] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Du loco part41
		bodyModel[187] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Du loco part41
		bodyModel[188] = new ModelRendererTurbo(this, 253, 64, textureX, textureY); // Du loco part41
		bodyModel[189] = new ModelRendererTurbo(this, 288, 70, textureX, textureY); // Du loco part41
		bodyModel[190] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Du loco part41
		bodyModel[191] = new ModelRendererTurbo(this, 253, 63, textureX, textureY); // Du loco part41
		bodyModel[192] = new ModelRendererTurbo(this, 271, 67, textureX, textureY); // Du loco part41
		bodyModel[193] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Du loco part41
		bodyModel[194] = new ModelRendererTurbo(this, 253, 64, textureX, textureY); // Du loco part41
		bodyModel[195] = new ModelRendererTurbo(this, 288, 70, textureX, textureY); // Du loco part41
		bodyModel[196] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Du loco part41
		bodyModel[197] = new ModelRendererTurbo(this, 253, 63, textureX, textureY); // Du loco part41
		bodyModel[198] = new ModelRendererTurbo(this, 271, 67, textureX, textureY); // Du loco part41
		bodyModel[199] = new ModelRendererTurbo(this, 265, 56, textureX, textureY); // Du loco part41
		bodyModel[200] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Du loco part41
		bodyModel[201] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Du loco part41
		bodyModel[202] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Du loco part41
		bodyModel[203] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Du loco part41
		bodyModel[204] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Du loco part41
		bodyModel[205] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Du loco part41
		bodyModel[206] = new ModelRendererTurbo(this, 196, 67, textureX, textureY); // Du loco part41
		bodyModel[207] = new ModelRendererTurbo(this, 196, 67, textureX, textureY); // Du loco part41
		bodyModel[208] = new ModelRendererTurbo(this, 196, 67, textureX, textureY); // Du loco part41
		bodyModel[209] = new ModelRendererTurbo(this, 196, 67, textureX, textureY); // Du loco part41
		bodyModel[210] = new ModelRendererTurbo(this, 196, 67, textureX, textureY); // Du loco part41
		bodyModel[211] = new ModelRendererTurbo(this, 196, 67, textureX, textureY); // Du loco part41
		bodyModel[212] = new ModelRendererTurbo(this, 157, 86, textureX, textureY); // Du loco part41

		bodyModel[0].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[0].setRotationPoint(-4F, -8F, 6.05F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Du loco part41
		bodyModel[1].setRotationPoint(-2F, -9F, -7F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Du loco part41
		bodyModel[2].setRotationPoint(26F, -9F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[3].setRotationPoint(-4F, -8F, -6.05F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[4].setRotationPoint(-14F, -8F, 6.05F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[5].setRotationPoint(-14F, -8F, -6.05F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[6].setRotationPoint(-24F, -8F, 6.05F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[7].setRotationPoint(-24F, -8F, -6.05F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part01
		bodyModel[8].setRotationPoint(-1F, -9F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[9].setRotationPoint(-1F, -8F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F,0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Du loco part01
		bodyModel[10].setRotationPoint(-1F, -9F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part01
		bodyModel[11].setRotationPoint(-1F, -9F, 6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 27, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[12].setRotationPoint(-1F, -8F, 6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 27, 2, 1, 0F,0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F, 0F, -0.25F, -0.375F); // Du loco part01
		bodyModel[13].setRotationPoint(-1F, -9F, 6F);

		bodyModel[14].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part41
		bodyModel[14].setRotationPoint(22F, -5F, -6F);

		bodyModel[15].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part41
		bodyModel[15].setRotationPoint(12F, -5F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part41
		bodyModel[16].setRotationPoint(2F, -5F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[17].setRotationPoint(21.5F, -5.5F, 6F);

		bodyModel[18].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[18].setRotationPoint(11.5F, -5.5F, 6F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[19].setRotationPoint(1.5F, -5.5F, 6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part41
		bodyModel[20].setRotationPoint(21.5F, -4.5F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part41
		bodyModel[21].setRotationPoint(11.5F, -4.5F, 7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Du loco part41
		bodyModel[22].setRotationPoint(-0.5F, -6.5F, 6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[23].setRotationPoint(21.5F, -5.5F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[24].setRotationPoint(11.5F, -5.5F, 7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[25].setRotationPoint(1.5F, -5.5F, 7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Du loco part41
		bodyModel[26].setRotationPoint(9.5F, -7F, 6F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[27].setRotationPoint(13.5F, -7F, 6F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[28].setRotationPoint(2.5F, -7.5F, 6F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[29].setRotationPoint(1.5F, -7.5F, 6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Du loco part41
		bodyModel[30].setRotationPoint(-0.5F, -7F, 6F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[31].setRotationPoint(3.5F, -7F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Du loco part41
		bodyModel[32].setRotationPoint(5.5F, -7F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part41
		bodyModel[33].setRotationPoint(1.5F, -4.5F, 7F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Du loco part41
		bodyModel[34].setRotationPoint(19.5F, -6.5F, 6F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[35].setRotationPoint(22.5F, -7.5F, 6F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[36].setRotationPoint(21.5F, -7.5F, 6F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Du loco part41
		bodyModel[37].setRotationPoint(19.5F, -7F, 6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[38].setRotationPoint(23.5F, -7F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F); // Du loco part41
		bodyModel[39].setRotationPoint(9.5F, -6.5F, 6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part41
		bodyModel[40].setRotationPoint(12.5F, -7.5F, 6F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[41].setRotationPoint(11.5F, -7.5F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[42].setRotationPoint(-1.75F, -3.5F, 6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[43].setRotationPoint(-1.75F, -3.5F, -6.25F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 29, 1, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[44].setRotationPoint(-1.75F, -3.5F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[45].setRotationPoint(26.25F, -3.5F, -6.25F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[46].setRotationPoint(21.5F, -5.5F, -7F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[47].setRotationPoint(11.5F, -5.5F, -7F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part41
		bodyModel[48].setRotationPoint(1.5F, -5.5F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Du loco part41
		bodyModel[49].setRotationPoint(9.5F, -7F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[50].setRotationPoint(13.5F, -7F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Du loco part41
		bodyModel[51].setRotationPoint(-0.5F, -7F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[52].setRotationPoint(3.5F, -7F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F); // Du loco part41
		bodyModel[53].setRotationPoint(19.5F, -7F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[54].setRotationPoint(23.5F, -7F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[55].setRotationPoint(21.5F, -4.5F, -8F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[56].setRotationPoint(11.5F, -4.5F, -8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F); // Du loco part41
		bodyModel[57].setRotationPoint(-0.5F, -6.5F, -7F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[58].setRotationPoint(21.5F, -5.5F, -8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[59].setRotationPoint(11.5F, -5.5F, -8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[60].setRotationPoint(1.5F, -5.5F, -8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part41
		bodyModel[61].setRotationPoint(2.5F, -7.5F, -7F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[62].setRotationPoint(1.5F, -7.5F, -7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[63].setRotationPoint(1.5F, -4.5F, -8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F); // Du loco part41
		bodyModel[64].setRotationPoint(19.5F, -6.5F, -7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part41
		bodyModel[65].setRotationPoint(22.5F, -7.5F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[66].setRotationPoint(21.5F, -7.5F, -7F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, -0.5F, -2.5F, 0F, -0.5F); // Du loco part41
		bodyModel[67].setRotationPoint(9.5F, -6.5F, -7F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part41
		bodyModel[68].setRotationPoint(12.5F, -7.5F, -7F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[69].setRotationPoint(11.5F, -7.5F, -7F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Du loco part41
		bodyModel[70].setRotationPoint(5.5F, -7F, -7F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part41
		bodyModel[71].setRotationPoint(25.5F, -4.75F, 5.75F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part41
		bodyModel[72].setRotationPoint(25.5F, -6.75F, 5.75F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[73].setRotationPoint(25.5F, -4.75F, -6.75F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[74].setRotationPoint(25.5F, -6.75F, -6.75F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part41
		bodyModel[75].setRotationPoint(-1.5F, -4.75F, 5.75F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[76].setRotationPoint(-1.5F, -6.75F, 5.75F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part41
		bodyModel[77].setRotationPoint(-1.5F, -4.75F, -6.75F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[78].setRotationPoint(-1.5F, -6.75F, -6.75F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part41
		bodyModel[79].setRotationPoint(-2.25F, -7F, -6.5F);

		bodyModel[80].addBox(0F, 0F, 0F, 27, 1, 1, 0F); // Du loco part41
		bodyModel[80].setRotationPoint(-1F, -9F, -4F);

		bodyModel[81].addBox(0F, 0F, 0F, 27, 1, 1, 0F); // Du loco part41
		bodyModel[81].setRotationPoint(-1F, -9F, 3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 27, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, 0F, -5F, 0F, 0F); // Du loco part41
		bodyModel[82].setRotationPoint(-1F, -15F, -7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 6, 12, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, -3F, -5F, 0F, -3F, -5F, 0F, -3F, 0F, 0F, -3F); // Du loco part41
		bodyModel[83].setRotationPoint(20F, -15F, -6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 27, 6, 4, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -3F, -5F, 0F, -3F); // Du loco part41
		bodyModel[84].setRotationPoint(-1F, -15F, 3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 6, 12, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, -3F); // Du loco part41
		bodyModel[85].setRotationPoint(-1F, -15F, -6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[86].setRotationPoint(6.5F, -15F, -7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[87].setRotationPoint(12F, -15F, -7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[88].setRotationPoint(17.5F, -15F, -7F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[89].setRotationPoint(6.5F, -15F, 4F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[90].setRotationPoint(12F, -15F, 4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 6, 3, 0F,-0.25F, 0F, -3F, -0.25F, 0F, -3F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part41
		bodyModel[91].setRotationPoint(17.5F, -15F, 4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 28, 1, 2, 0F,-0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F); // Du loco part01
		bodyModel[92].setRotationPoint(-1.5F, -16F, 6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 28, 1, 2, 0F,-0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part01
		bodyModel[93].setRotationPoint(-1.5F, -16F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, -5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, -5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[94].setRotationPoint(21F, -14F, -4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,0F, -5F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.25F, 0F, -5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[95].setRotationPoint(21F, -14F, 3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[96].setRotationPoint(15F, -8F, -4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,-2F, 0F, -0.25F, 0F, -5F, -0.25F, 0F, -5F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[97].setRotationPoint(-2F, -14F, -4F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 6, 5, 1, 0F,-2F, 0F, -0.25F, 0F, -5F, -0.25F, 0F, -5F, -0.25F, -2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part41
		bodyModel[98].setRotationPoint(-2F, -14F, 3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[99].setRotationPoint(-3F, -9.25F, 4.43F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[100].setRotationPoint(-2.75F, -9F, 4.9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[101].setRotationPoint(-5.5F, -8.75F, 5.15F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[102].setRotationPoint(-3F, -9.25F, -6.63F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[103].setRotationPoint(-5.5F, -8.75F, -5.88F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[104].setRotationPoint(-3F, -8.75F, 0F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[105].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[106].setRotationPoint(-2.5F, -8.5F, -0.25F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[107].setRotationPoint(-4.5F, -7F, -0.25F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[108].setRotationPoint(-3.5F, -8.75F, -0.25F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[109].setRotationPoint(-4.5F, -8.5F, 0F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[110].setRotationPoint(-4.5F, -8.5F, -0.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[111].setRotationPoint(-3F, -8.75F, 0.25F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[112].setRotationPoint(-3F, -8.5F, -0.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[113].setRotationPoint(-3F, -9F, -0.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[114].setRotationPoint(-3F, -6F, -0.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[115].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[116].setRotationPoint(-4.5F, -6F, -0.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[117].setRotationPoint(-4.5F, -5.25F, -0.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[118].setRotationPoint(-6.5F, -8.87F, 4.03F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[119].setRotationPoint(-6.5F, -9.87F, 4.03F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[120].setRotationPoint(-6.5F, -9.37F, 4.03F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[121].setRotationPoint(-6.5F, -7.87F, 4.03F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[122].setRotationPoint(-6.5F, -8.37F, 4.03F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[123].setRotationPoint(-6.5F, -8.87F, -7.03F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[124].setRotationPoint(-6.5F, -9.87F, -7.03F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[125].setRotationPoint(-6.5F, -9.37F, -7.03F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[126].setRotationPoint(-6.5F, -7.87F, -7.03F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[127].setRotationPoint(-6.5F, -8.37F, -7.03F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[128].setRotationPoint(-2.75F, -9.5F, 4.9F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[129].setRotationPoint(-2.75F, -8.25F, 4.9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[130].setRotationPoint(-2.75F, -9F, -6.13F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[131].setRotationPoint(-2.75F, -9.5F, -6.13F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[132].setRotationPoint(-2.75F, -8.25F, -6.13F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[133].setRotationPoint(27F, -9.25F, 4.43F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[134].setRotationPoint(26.75F, -9F, 4.9F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[135].setRotationPoint(27.5F, -8.75F, 5.15F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[136].setRotationPoint(27F, -9.25F, -6.63F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[137].setRotationPoint(27.5F, -8.75F, -5.88F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[138].setRotationPoint(27F, -8.75F, 0F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[139].setRotationPoint(27F, -8.75F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[140].setRotationPoint(26.5F, -8.5F, -0.25F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[141].setRotationPoint(27.5F, -7F, -0.25F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[142].setRotationPoint(27.5F, -8.75F, -0.25F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[143].setRotationPoint(26.5F, -8.5F, 0F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[144].setRotationPoint(26.5F, -8.5F, -0.75F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[145].setRotationPoint(27F, -8.75F, 0.25F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[146].setRotationPoint(27F, -8.5F, -0.25F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[147].setRotationPoint(27F, -9F, -0.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[148].setRotationPoint(27F, -6F, -0.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[149].setRotationPoint(27F, -8.75F, -1F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[150].setRotationPoint(27.5F, -6F, -0.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[151].setRotationPoint(28.5F, -5.25F, -0.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[152].setRotationPoint(30.5F, -8.87F, 4.03F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[153].setRotationPoint(30.5F, -9.87F, 4.03F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[154].setRotationPoint(30.5F, -9.37F, 4.03F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[155].setRotationPoint(30.5F, -7.87F, 4.03F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[156].setRotationPoint(30.5F, -8.37F, 4.03F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[157].setRotationPoint(30.5F, -8.87F, -7.03F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[158].setRotationPoint(30.5F, -9.87F, -7.03F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[159].setRotationPoint(30.5F, -9.37F, -7.03F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[160].setRotationPoint(30.5F, -7.87F, -7.03F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[161].setRotationPoint(30.5F, -8.37F, -7.03F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[162].setRotationPoint(26.75F, -9.5F, 4.9F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[163].setRotationPoint(26.75F, -8.25F, 4.9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[164].setRotationPoint(26.75F, -9F, -6.13F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[165].setRotationPoint(26.75F, -9.5F, -6.13F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[166].setRotationPoint(26.75F, -8.25F, -6.13F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.375F, -0.5F, -3F, 0.375F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[167].setRotationPoint(-1F, -16F, 0F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part01
		bodyModel[168].setRotationPoint(-1.75F, -16F, 0F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.125F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.5F, 0F, -0.875F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part01
		bodyModel[169].setRotationPoint(-1.5F, -16F, 3F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0.375F, -0.5F, -3F, -0.375F, -0.5F, -3F, -0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[170].setRotationPoint(-1F, -16F, -6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part01
		bodyModel[171].setRotationPoint(-1.75F, -16F, -3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.875F, -0.25F, 0F, 0.125F, -0.25F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.875F, -0.5F, 0F, 0.125F, -0.5F, 0F); // Du loco part01
		bodyModel[172].setRotationPoint(-1.5F, -16F, -6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.375F, -0.5F, -3F, -0.375F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[173].setRotationPoint(25F, -16F, 0F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Du loco part01
		bodyModel[174].setRotationPoint(24.75F, -16F, 0F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.875F, -0.25F, 0F, 0.125F, -0.25F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.875F, -0.5F, 0F, 0.125F, -0.5F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part01
		bodyModel[175].setRotationPoint(24.5F, -16F, 3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.375F, -0.5F, -3F, 0.375F, -0.5F, -3F, 0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[176].setRotationPoint(25F, -16F, -6F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Du loco part01
		bodyModel[177].setRotationPoint(24.75F, -16F, -3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0.125F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.125F, -0.5F, 0F, -0.875F, -0.5F, 0F); // Du loco part01
		bodyModel[178].setRotationPoint(24.5F, -16F, -6F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[179].setRotationPoint(3F, -9F, -3F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Du loco part41
		bodyModel[180].setRotationPoint(21F, -9F, -3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F); // Du loco part41
		bodyModel[181].setRotationPoint(22F, -9F, -3F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part41
		bodyModel[182].setRotationPoint(22F, -9F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -2.5F); // Du loco part41
		bodyModel[183].setRotationPoint(-1F, -9F, -3F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part41
		bodyModel[184].setRotationPoint(-1F, -9F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part41
		bodyModel[185].setRotationPoint(-2.25F, -7F, 5.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part41
		bodyModel[186].setRotationPoint(25.75F, -7F, -6.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Du loco part41
		bodyModel[187].setRotationPoint(25.75F, -7F, 5.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[188].setRotationPoint(19F, -9F, -3F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[189].setRotationPoint(16F, -8F, -3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[190].setRotationPoint(15F, -8F, 3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F); // Du loco part41
		bodyModel[191].setRotationPoint(14F, -9F, -3F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, -3F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 0F, -0.75F, -0.75F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, -0.75F, -0.75F, 0F); // Du loco part41
		bodyModel[192].setRotationPoint(18F, -8F, -3F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[193].setRotationPoint(5F, -8F, -4F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[194].setRotationPoint(4F, -9F, -3F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[195].setRotationPoint(5F, -8F, -3F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[196].setRotationPoint(5F, -8F, 3F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -1F, 0F); // Du loco part41
		bodyModel[197].setRotationPoint(9F, -9F, -3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,-1F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 0F, -4F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -4F, 0F); // Du loco part41
		bodyModel[198].setRotationPoint(5F, -8F, -3F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,-2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[199].setRotationPoint(10F, -11F, -4F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Du loco part41
		bodyModel[200].setRotationPoint(15.5F, -7F, 6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Du loco part41
		bodyModel[201].setRotationPoint(15.5F, -7F, -7F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[202].setRotationPoint(-1.5F, -7F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[203].setRotationPoint(-1.5F, -7F, 6F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Du loco part41
		bodyModel[204].setRotationPoint(25.5F, -7F, -7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Du loco part41
		bodyModel[205].setRotationPoint(25.5F, -7F, 6F);

		bodyModel[206].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Du loco part41
		bodyModel[206].setRotationPoint(6.5F, -9F, -6F);

		bodyModel[207].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Du loco part41
		bodyModel[207].setRotationPoint(12F, -9F, -6F);

		bodyModel[208].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Du loco part41
		bodyModel[208].setRotationPoint(17.5F, -9F, -6F);

		bodyModel[209].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Du loco part41
		bodyModel[209].setRotationPoint(6.5F, -9F, 4F);

		bodyModel[210].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Du loco part41
		bodyModel[210].setRotationPoint(12F, -9F, 4F);

		bodyModel[211].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Du loco part41
		bodyModel[211].setRotationPoint(17.5F, -9F, 4F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 25, 1, 12, 0F,-4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[212].setRotationPoint(0F, -15.5F, -6F);
	}
@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale)
	{
		super.render(entity, f0, f1, f2, f3, f4, scale);
		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f0, f1, f2, f3, f4, scale);
	}
}