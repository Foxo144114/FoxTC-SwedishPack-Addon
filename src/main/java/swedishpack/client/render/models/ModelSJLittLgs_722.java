//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Lgs-722
// Model Creator: EnaqleElectric
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.common.api.AbstractTrains;

public class ModelSJLittLgs_722 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittLgs_722() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[259];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Wagon part
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Wagon part
		bodyModel[2] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Wagon part
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Wagon part
		bodyModel[4] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Wagon part
		bodyModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Wagon part
		bodyModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Wagon part
		bodyModel[7] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Wagon part
		bodyModel[8] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Wagon part
		bodyModel[9] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Wagon part
		bodyModel[10] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Wagon part
		bodyModel[11] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Wagon part
		bodyModel[12] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Wagon part
		bodyModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Wagon part
		bodyModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Wagon part
		bodyModel[15] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Wagon part
		bodyModel[16] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Wagon part
		bodyModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Wagon part
		bodyModel[18] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Wagon part
		bodyModel[19] = new ModelRendererTurbo(this, 131, 49, textureX, textureY); // Wagon part
		bodyModel[20] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Wagon part
		bodyModel[21] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Wagon part
		bodyModel[22] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Wagon part
		bodyModel[23] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Wagon part
		bodyModel[24] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Wagon part
		bodyModel[25] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Wagon part
		bodyModel[26] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Wagon part
		bodyModel[27] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Wagon part
		bodyModel[28] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Wagon part
		bodyModel[29] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Wagon part
		bodyModel[30] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Wagon part
		bodyModel[31] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Wagon part
		bodyModel[32] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Wagon part
		bodyModel[33] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Wagon part
		bodyModel[34] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Wagon part
		bodyModel[35] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Wagon part
		bodyModel[36] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Wagon part
		bodyModel[37] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Wagon part
		bodyModel[38] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Wagon part
		bodyModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Wagon part
		bodyModel[40] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Wagon part
		bodyModel[41] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Wagon part
		bodyModel[42] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Wagon part
		bodyModel[43] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Wagon part
		bodyModel[44] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Wagon part
		bodyModel[45] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Wagon part
		bodyModel[46] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Wagon part
		bodyModel[47] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Wagon part
		bodyModel[48] = new ModelRendererTurbo(this, 73, 9, textureX, textureY); // Wagon part
		bodyModel[49] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Wagon part
		bodyModel[50] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Wagon part
		bodyModel[51] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Wagon part
		bodyModel[52] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Wagon part
		bodyModel[53] = new ModelRendererTurbo(this, 137, 9, textureX, textureY); // Wagon part
		bodyModel[54] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Wagon part
		bodyModel[55] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Wagon part
		bodyModel[56] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Wagon part
		bodyModel[57] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Wagon part
		bodyModel[58] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Wagon part
		bodyModel[59] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Wagon part
		bodyModel[60] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Wagon part
		bodyModel[61] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Wagon part
		bodyModel[62] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Wagon part
		bodyModel[63] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Wagon part
		bodyModel[64] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Wagon part
		bodyModel[65] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Wagon part
		bodyModel[66] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Wagon part
		bodyModel[67] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Wagon part
		bodyModel[68] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Wagon part
		bodyModel[69] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Wagon part
		bodyModel[70] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Wagon part
		bodyModel[71] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Wagon part
		bodyModel[72] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Wagon part
		bodyModel[73] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Wagon part
		bodyModel[74] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Wagon part
		bodyModel[75] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Wagon part
		bodyModel[76] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Wagonpart
		bodyModel[77] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Wagon part
		bodyModel[78] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Wagon part
		bodyModel[79] = new ModelRendererTurbo(this, 65, 60, textureX, textureY); // Wagon part
		bodyModel[80] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Wagon part
		bodyModel[81] = new ModelRendererTurbo(this, 16, 114, textureX, textureY); // Wagon part
		bodyModel[82] = new ModelRendererTurbo(this, 1, 114, textureX, textureY); // Wagon part
		bodyModel[83] = new ModelRendererTurbo(this, 11, 114, textureX, textureY); // Wagon part
		bodyModel[84] = new ModelRendererTurbo(this, 6, 114, textureX, textureY); // Wagon part
		bodyModel[85] = new ModelRendererTurbo(this, 16, 102, textureX, textureY); // Wagon part
		bodyModel[86] = new ModelRendererTurbo(this, 1, 102, textureX, textureY); // Wagon part
		bodyModel[87] = new ModelRendererTurbo(this, 11, 102, textureX, textureY); // Wagon part
		bodyModel[88] = new ModelRendererTurbo(this, 6, 102, textureX, textureY); // Wagon part
		bodyModel[89] = new ModelRendererTurbo(this, 1, 96, textureX, textureY); // Wagon part
		bodyModel[90] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Wagon part
		bodyModel[91] = new ModelRendererTurbo(this, 22, 96, textureX, textureY); // Wagon part
		bodyModel[92] = new ModelRendererTurbo(this, 15, 96, textureX, textureY); // Wagon part
		bodyModel[93] = new ModelRendererTurbo(this, 8, 96, textureX, textureY); // Wagon part
		bodyModel[94] = new ModelRendererTurbo(this, 6, 99, textureX, textureY); // Wagon part
		bodyModel[95] = new ModelRendererTurbo(this, 1, 90, textureX, textureY); // Wagon part
		bodyModel[96] = new ModelRendererTurbo(this, 1, 93, textureX, textureY); // Wagon part
		bodyModel[97] = new ModelRendererTurbo(this, 22, 90, textureX, textureY); // Wagon part
		bodyModel[98] = new ModelRendererTurbo(this, 15, 90, textureX, textureY); // Wagon part
		bodyModel[99] = new ModelRendererTurbo(this, 8, 90, textureX, textureY); // Wagon part
		bodyModel[100] = new ModelRendererTurbo(this, 6, 93, textureX, textureY); // Du loco part41
		bodyModel[101] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Wagon part
		bodyModel[102] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Wagon part
		bodyModel[103] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Wagon part
		bodyModel[104] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Wagon part
		bodyModel[105] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Wagon part
		bodyModel[106] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Wagon part
		bodyModel[107] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Wagon part
		bodyModel[108] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Wagon part
		bodyModel[109] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Wagon part
		bodyModel[110] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Wagon part
		bodyModel[111] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Wagon part
		bodyModel[112] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Wagon part
		bodyModel[113] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Wagon part
		bodyModel[114] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Wagon part
		bodyModel[115] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Wagon part
		bodyModel[116] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Wagon part
		bodyModel[117] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Wagon part
		bodyModel[118] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Wagon part
		bodyModel[119] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Wagon part
		bodyModel[120] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Wagon part
		bodyModel[121] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Wagon part
		bodyModel[122] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Wagon part
		bodyModel[123] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Wagon part
		bodyModel[124] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Wagon part
		bodyModel[125] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Wagon part
		bodyModel[126] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Wagon part
		bodyModel[127] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Wagon part
		bodyModel[128] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Wagon part
		bodyModel[129] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Wagon part
		bodyModel[130] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Wagon part
		bodyModel[131] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Wagon part
		bodyModel[132] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Wagon part
		bodyModel[133] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Wagon part
		bodyModel[134] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Wagon part
		bodyModel[135] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Wagon part
		bodyModel[136] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Wagon part
		bodyModel[137] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Wagon part
		bodyModel[138] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Wagon part
		bodyModel[139] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Wagon part
		bodyModel[140] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Wagon part
		bodyModel[141] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Wagon part
		bodyModel[142] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Wagon part
		bodyModel[143] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Wagon part
		bodyModel[144] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Wagon part
		bodyModel[145] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Wagon part
		bodyModel[146] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Wagon part
		bodyModel[147] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Wagon part
		bodyModel[148] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Wagon part
		bodyModel[149] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Wagon part
		bodyModel[150] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Wagon part
		bodyModel[151] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Wagon part
		bodyModel[152] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Wagon part
		bodyModel[153] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Wagon part
		bodyModel[154] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Wagon part
		bodyModel[155] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Wagon part
		bodyModel[156] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Wagon part
		bodyModel[157] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Wagon part
		bodyModel[158] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Wagon part
		bodyModel[159] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Wagon part
		bodyModel[160] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Wagon part
		bodyModel[161] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Wagon part
		bodyModel[162] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Wagon part
		bodyModel[163] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Wagon part
		bodyModel[164] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Wagon part
		bodyModel[165] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Wagon part
		bodyModel[166] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Wagon part
		bodyModel[167] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Wagon part
		bodyModel[168] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Wagon part
		bodyModel[169] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Wagon part
		bodyModel[170] = new ModelRendererTurbo(this, 1, 93, textureX, textureY); // Wagon part
		bodyModel[171] = new ModelRendererTurbo(this, 1, 99, textureX, textureY); // Wagon part
		bodyModel[172] = new ModelRendererTurbo(this, 1, 93, textureX, textureY); // Wagon part
		bodyModel[173] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Wagon part
		bodyModel[174] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Wagon part
		bodyModel[175] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Wagon part
		bodyModel[176] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Wagon part
		bodyModel[177] = new ModelRendererTurbo(this, 31, 118, textureX, textureY); // Wagon part
		bodyModel[178] = new ModelRendererTurbo(this, 21, 118, textureX, textureY); // Wagon part
		bodyModel[179] = new ModelRendererTurbo(this, 36, 118, textureX, textureY); // Wagon part
		bodyModel[180] = new ModelRendererTurbo(this, 26, 118, textureX, textureY); // Wagon part
		bodyModel[181] = new ModelRendererTurbo(this, 16, 145, textureX, textureY); // Wagon part
		bodyModel[182] = new ModelRendererTurbo(this, 21, 145, textureX, textureY); // Wagon part
		bodyModel[183] = new ModelRendererTurbo(this, 26, 145, textureX, textureY); // Wagon part
		bodyModel[184] = new ModelRendererTurbo(this, 31, 145, textureX, textureY); // Wagon part
		bodyModel[185] = new ModelRendererTurbo(this, 6, 145, textureX, textureY); // Wagon part
		bodyModel[186] = new ModelRendererTurbo(this, 11, 145, textureX, textureY); // Wagon part
		bodyModel[187] = new ModelRendererTurbo(this, 36, 145, textureX, textureY); // Wagon part
		bodyModel[188] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Wagon part
		bodyModel[189] = new ModelRendererTurbo(this, 16, 126, textureX, textureY); // Wagon part
		bodyModel[190] = new ModelRendererTurbo(this, 21, 126, textureX, textureY); // Wagon part
		bodyModel[191] = new ModelRendererTurbo(this, 26, 126, textureX, textureY); // Wagon part
		bodyModel[192] = new ModelRendererTurbo(this, 31, 126, textureX, textureY); // Wagon part
		bodyModel[193] = new ModelRendererTurbo(this, 6, 126, textureX, textureY); // Wagon part
		bodyModel[194] = new ModelRendererTurbo(this, 11, 126, textureX, textureY); // Wagon part
		bodyModel[195] = new ModelRendererTurbo(this, 36, 126, textureX, textureY); // Wagon part
		bodyModel[196] = new ModelRendererTurbo(this, 1, 126, textureX, textureY); // Wagon part
		bodyModel[197] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Wagon part
		bodyModel[198] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Wagon part
		bodyModel[199] = new ModelRendererTurbo(this, 112, 61, textureX, textureY); // Wagon part
		bodyModel[200] = new ModelRendererTurbo(this, 112, 61, textureX, textureY); // Wagon part
		bodyModel[201] = new ModelRendererTurbo(this, 112, 61, textureX, textureY); // Wagon part
		bodyModel[202] = new ModelRendererTurbo(this, 112, 61, textureX, textureY); // Wagon part
		bodyModel[203] = new ModelRendererTurbo(this, 112, 61, textureX, textureY); // Wagon part
		bodyModel[204] = new ModelRendererTurbo(this, 112, 61, textureX, textureY); // Wagon part
		bodyModel[205] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[206] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[207] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[208] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[209] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[210] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[211] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[212] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[213] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[214] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[215] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[216] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[217] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[218] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[219] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[220] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[221] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[222] = new ModelRendererTurbo(this, 105, 58, textureX, textureY); // Wagon part
		bodyModel[223] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[224] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[225] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[226] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[227] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[228] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[229] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[230] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[231] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[232] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[233] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[234] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[235] = new ModelRendererTurbo(this, 111, 78, textureX, textureY); // Wagon part
		bodyModel[236] = new ModelRendererTurbo(this, 111, 78, textureX, textureY); // Wagon part
		bodyModel[237] = new ModelRendererTurbo(this, 111, 78, textureX, textureY); // Wagon part
		bodyModel[238] = new ModelRendererTurbo(this, 111, 78, textureX, textureY); // Wagon part
		bodyModel[239] = new ModelRendererTurbo(this, 106, 63, textureX, textureY); // Wagon part
		bodyModel[240] = new ModelRendererTurbo(this, 106, 63, textureX, textureY); // Wagon part
		bodyModel[241] = new ModelRendererTurbo(this, 106, 63, textureX, textureY); // Wagon part
		bodyModel[242] = new ModelRendererTurbo(this, 106, 63, textureX, textureY); // Wagon part
		bodyModel[243] = new ModelRendererTurbo(this, 106, 63, textureX, textureY); // Wagon part
		bodyModel[244] = new ModelRendererTurbo(this, 106, 63, textureX, textureY); // Wagon part
		bodyModel[245] = new ModelRendererTurbo(this, 106, 63, textureX, textureY); // Wagon part
		bodyModel[246] = new ModelRendererTurbo(this, 106, 63, textureX, textureY); // Wagon part
		bodyModel[247] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[248] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[249] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[250] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[251] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[252] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[253] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[254] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[255] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[256] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[257] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41
		bodyModel[258] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // Du loco part41

		bodyModel[0].addBox(0F, 0F, 0F, 1, 8, 20, 0F); // Wagon part
		bodyModel[0].setRotationPoint(-3F, -15F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 8, 20, 0F); // Wagon part
		bodyModel[1].setRotationPoint(70F, -15F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Wagon part
		bodyModel[2].setRotationPoint(-17.5F, -7.5F, 6.05F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Wagon part
		bodyModel[3].setRotationPoint(8.5F, -4.5F, -6F);

		bodyModel[4].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Wagon part
		bodyModel[4].setRotationPoint(8F, -5F, 6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Wagon part
		bodyModel[5].setRotationPoint(8F, -5F, 7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Wagon part
		bodyModel[6].setRotationPoint(8F, -4F, 7F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Wagon part
		bodyModel[7].setRotationPoint(4.75F, -5.25F, -6.25F);

		bodyModel[8].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Wagon part
		bodyModel[8].setRotationPoint(8F, -5F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Wagon part
		bodyModel[9].setRotationPoint(10F, -6.5F, -7F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Wagon part
		bodyModel[10].setRotationPoint(3.5F, -7F, -7F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Wagon part
		bodyModel[11].setRotationPoint(11.5F, -7F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Wagon part
		bodyModel[12].setRotationPoint(5F, -7F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[13].setRotationPoint(8F, -5F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Wagon part
		bodyModel[14].setRotationPoint(8F, -4F, -8F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Wagon part
		bodyModel[15].setRotationPoint(5F, -4.5F, 5.75F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Wagon part
		bodyModel[16].setRotationPoint(5F, -6.5F, 5.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Wagon part
		bodyModel[17].setRotationPoint(5F, -4.5F, -6.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[18].setRotationPoint(5F, -6.5F, -6.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 72, 1, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Wagon part
		bodyModel[19].setRotationPoint(-2F, -9F, -9.5F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Wagon part
		bodyModel[20].setRotationPoint(58.5F, -4.5F, -6F);

		bodyModel[21].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Wagon part
		bodyModel[21].setRotationPoint(58F, -5F, 6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Wagon part
		bodyModel[22].setRotationPoint(58F, -5F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F); // Wagon part
		bodyModel[23].setRotationPoint(58F, -4F, 7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Wagon part
		bodyModel[24].setRotationPoint(54.75F, -5.25F, -6.25F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Wagon part
		bodyModel[25].setRotationPoint(58F, -5F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[26].setRotationPoint(58F, -5F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F); // Wagon part
		bodyModel[27].setRotationPoint(58F, -4F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Wagon part
		bodyModel[28].setRotationPoint(55F, -4.5F, 5.75F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Wagon part
		bodyModel[29].setRotationPoint(55F, -6.5F, 5.75F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Wagon part
		bodyModel[30].setRotationPoint(55F, -4.5F, -6.75F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[31].setRotationPoint(55F, -6.5F, -6.75F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Wagon part
		bodyModel[32].setRotationPoint(62.25F, -5.25F, -6.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Wagon part
		bodyModel[33].setRotationPoint(62F, -4.5F, 5.75F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Wagon part
		bodyModel[34].setRotationPoint(62F, -6.5F, 5.75F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Wagon part
		bodyModel[35].setRotationPoint(62F, -4.5F, -6.75F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Wagon part
		bodyModel[36].setRotationPoint(62F, -6.5F, -6.75F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 1, 13, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Wagon part
		bodyModel[37].setRotationPoint(12.25F, -5.25F, -6.25F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Wagon part
		bodyModel[38].setRotationPoint(12F, -4.5F, 5.75F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Wagon part
		bodyModel[39].setRotationPoint(12F, -6.5F, 5.75F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Wagon part
		bodyModel[40].setRotationPoint(12F, -4.5F, -6.75F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Wagon part
		bodyModel[41].setRotationPoint(12F, -6.5F, -6.75F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 72, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[42].setRotationPoint(-2F, -8F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Wagon part
		bodyModel[43].setRotationPoint(6F, -6.5F, -7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 72, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[44].setRotationPoint(-2F, -8F, 6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Wagon part
		bodyModel[45].setRotationPoint(10F, -6.5F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Wagon part
		bodyModel[46].setRotationPoint(3.5F, -7F, 6F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Wagon part
		bodyModel[47].setRotationPoint(12.5F, -7F, 6F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Wagon part
		bodyModel[48].setRotationPoint(5F, -7F, 6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Wagon part
		bodyModel[49].setRotationPoint(6F, -6.5F, 6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Wagon part
		bodyModel[50].setRotationPoint(60F, -6.5F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Wagon part
		bodyModel[51].setRotationPoint(53.5F, -7F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Wagon part
		bodyModel[52].setRotationPoint(62.5F, -7F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Wagon part
		bodyModel[53].setRotationPoint(55F, -7F, -7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Wagon part
		bodyModel[54].setRotationPoint(56F, -6.5F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F); // Wagon part
		bodyModel[55].setRotationPoint(60F, -6.5F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F); // Wagon part
		bodyModel[56].setRotationPoint(53.5F, -7F, 6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, -1.75F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, 0.25F, -1.75F, 0F); // Wagon part
		bodyModel[57].setRotationPoint(62.5F, -7F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Wagon part
		bodyModel[58].setRotationPoint(55F, -7F, 6F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,-1.75F, 0.5F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -1.75F, 0.5F, -0.25F, 0F, -3.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.5F, -0.25F); // Wagon part
		bodyModel[59].setRotationPoint(56F, -6.5F, 6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F); // Wagon part
		bodyModel[60].setRotationPoint(15F, -7F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[61].setRotationPoint(43F, -7F, 6F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Wagon part
		bodyModel[62].setRotationPoint(25F, -7F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,-2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F); // Wagon part
		bodyModel[63].setRotationPoint(15F, -7F, -7F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[64].setRotationPoint(43F, -7F, -7F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Wagon part
		bodyModel[65].setRotationPoint(25F, -7F, -7F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Wagon part
		bodyModel[66].setRotationPoint(62.25F, -8.5F, -5.25F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Wagon part
		bodyModel[67].setRotationPoint(62.25F, -8.5F, 4.25F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Wagon part
		bodyModel[68].setRotationPoint(54.75F, -8.5F, -5.25F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Wagon part
		bodyModel[69].setRotationPoint(54.75F, -8.5F, 4.25F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Wagon part
		bodyModel[70].setRotationPoint(12.25F, -8.5F, -5.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Wagon part
		bodyModel[71].setRotationPoint(12.25F, -8.5F, 4.25F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Wagon part
		bodyModel[72].setRotationPoint(4.75F, -8.5F, -5.25F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Wagon part
		bodyModel[73].setRotationPoint(4.75F, -8.5F, 4.25F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Wagon part
		bodyModel[74].setRotationPoint(-17.5F, -7.5F, -6.05F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Wagon part
		bodyModel[75].setRotationPoint(32.5F, -7.5F, 6.05F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Wagonpart
		bodyModel[76].setRotationPoint(32.5F, -7.5F, -6.05F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Wagon part
		bodyModel[77].setRotationPoint(42F, -7F, 6F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Wagon part
		bodyModel[78].setRotationPoint(42F, -7F, -7F);

		bodyModel[79].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Wagon part
		bodyModel[79].setRotationPoint(26F, -4F, 6F);

		bodyModel[80].addBox(0F, 0F, 0F, 16, 1, 1, 0F); // Wagon part
		bodyModel[80].setRotationPoint(26F, -4F, -7F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Wagon part
		bodyModel[81].setRotationPoint(71F, -17F, -9F);

		bodyModel[82].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Wagon part
		bodyModel[82].setRotationPoint(71F, -17F, 8F);

		bodyModel[83].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Wagon part
		bodyModel[83].setRotationPoint(71F, -17F, -4F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Wagon part
		bodyModel[84].setRotationPoint(71F, -17F, 3F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Wagon part
		bodyModel[85].setRotationPoint(-4F, -17F, -9F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Wagon part
		bodyModel[86].setRotationPoint(-4F, -17F, 8F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Wagon part
		bodyModel[87].setRotationPoint(-4F, -17F, -4F);

		bodyModel[88].addBox(0F, 0F, 0F, 1, 10, 1, 0F); // Wagon part
		bodyModel[88].setRotationPoint(-4F, -17F, 3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Wagon part
		bodyModel[89].setRotationPoint(-2F, -10F, 9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Wagon part
		bodyModel[90].setRotationPoint(-2F, -10F, 8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Wagon part
		bodyModel[91].setRotationPoint(32F, -10F, 9F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Wagon part
		bodyModel[92].setRotationPoint(34F, -10F, 9F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Wagon part
		bodyModel[93].setRotationPoint(68F, -10F, 9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[94].setRotationPoint(69F, -10F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Wagon part
		bodyModel[95].setRotationPoint(-2F, -10F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Wagon part
		bodyModel[96].setRotationPoint(-2F, -10F, -9F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[97].setRotationPoint(32F, -10F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Wagon part
		bodyModel[98].setRotationPoint(34F, -10F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[99].setRotationPoint(68F, -10F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[100].setRotationPoint(69F, -10F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Wagon part
		bodyModel[101].setRotationPoint(-4F, -9.25F, 4.43F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Wagon part
		bodyModel[102].setRotationPoint(-3.75F, -9F, 4.9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Wagon part
		bodyModel[103].setRotationPoint(-6.5F, -8.75F, 5.15F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Wagon part
		bodyModel[104].setRotationPoint(-4F, -9.25F, -6.63F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Wagon part
		bodyModel[105].setRotationPoint(-6.5F, -8.75F, -5.88F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Wagon part
		bodyModel[106].setRotationPoint(-4F, -8.75F, 0F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Wagon part
		bodyModel[107].setRotationPoint(-4F, -8.75F, -1F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Wagon part
		bodyModel[108].setRotationPoint(-3.5F, -8.5F, -0.25F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Wagon part
		bodyModel[109].setRotationPoint(-5.5F, -7F, -0.25F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Wagon part
		bodyModel[110].setRotationPoint(-4.5F, -8.75F, -0.25F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Wagon part
		bodyModel[111].setRotationPoint(-5.5F, -8.5F, 0F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Wagon part
		bodyModel[112].setRotationPoint(-5.5F, -8.5F, -0.75F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Wagon part
		bodyModel[113].setRotationPoint(-4F, -8.75F, 0.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Wagon part
		bodyModel[114].setRotationPoint(-4F, -8.5F, -0.25F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Wagon part
		bodyModel[115].setRotationPoint(-4F, -9F, -0.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Wagon part
		bodyModel[116].setRotationPoint(-4F, -6F, -0.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Wagon part
		bodyModel[117].setRotationPoint(-4F, -8.75F, -1F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Wagon part
		bodyModel[118].setRotationPoint(-5.5F, -6F, -0.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Wagon part
		bodyModel[119].setRotationPoint(-5.5F, -5.25F, -0.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Wagon part
		bodyModel[120].setRotationPoint(-7.5F, -8.87F, 4.03F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Wagon part
		bodyModel[121].setRotationPoint(-7.5F, -9.87F, 4.03F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Wagon part
		bodyModel[122].setRotationPoint(-7.5F, -9.37F, 4.03F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Wagon part
		bodyModel[123].setRotationPoint(-7.5F, -7.87F, 4.03F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Wagon part
		bodyModel[124].setRotationPoint(-7.5F, -8.37F, 4.03F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Wagon part
		bodyModel[125].setRotationPoint(-7.5F, -8.87F, -7.03F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Wagon part
		bodyModel[126].setRotationPoint(-7.5F, -9.87F, -7.03F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Wagon part
		bodyModel[127].setRotationPoint(-7.5F, -9.37F, -7.03F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Wagon part
		bodyModel[128].setRotationPoint(-7.5F, -7.87F, -7.03F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Wagon part
		bodyModel[129].setRotationPoint(-7.5F, -8.37F, -7.03F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Wagon part
		bodyModel[130].setRotationPoint(-3.75F, -9.5F, 4.9F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Wagon part
		bodyModel[131].setRotationPoint(-3.75F, -8.25F, 4.9F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Wagon part
		bodyModel[132].setRotationPoint(-3.75F, -9F, -6.13F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Wagon part
		bodyModel[133].setRotationPoint(-3.75F, -9.5F, -6.13F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Wagon part
		bodyModel[134].setRotationPoint(-3.75F, -8.25F, -6.13F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Wagon part
		bodyModel[135].setRotationPoint(71F, -9.25F, 4.43F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Wagon part
		bodyModel[136].setRotationPoint(70.75F, -9F, 4.9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Wagon part
		bodyModel[137].setRotationPoint(71.5F, -8.75F, 5.15F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Wagon part
		bodyModel[138].setRotationPoint(71F, -9.25F, -6.63F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Wagon part
		bodyModel[139].setRotationPoint(71.5F, -8.75F, -5.88F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Wagon part
		bodyModel[140].setRotationPoint(71F, -8.75F, 0F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[141].setRotationPoint(71F, -8.75F, -1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Wagon part
		bodyModel[142].setRotationPoint(70.5F, -8.5F, -0.25F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Wagon part
		bodyModel[143].setRotationPoint(71.5F, -7F, -0.25F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Wagon part
		bodyModel[144].setRotationPoint(71.5F, -8.75F, -0.25F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Wagon part
		bodyModel[145].setRotationPoint(70.5F, -8.5F, 0F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Wagon part
		bodyModel[146].setRotationPoint(70.5F, -8.5F, -0.75F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Wagon part
		bodyModel[147].setRotationPoint(71F, -8.75F, 0.25F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Wagon part
		bodyModel[148].setRotationPoint(71F, -8.5F, -0.25F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Wagon part
		bodyModel[149].setRotationPoint(71F, -9F, -0.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Wagon part
		bodyModel[150].setRotationPoint(71F, -8.75F, -1F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Wagon part
		bodyModel[151].setRotationPoint(71.5F, -6F, -0.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Wagon part
		bodyModel[152].setRotationPoint(72.5F, -5.25F, -0.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[153].setRotationPoint(74.5F, -8.87F, 4.03F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Wagon part
		bodyModel[154].setRotationPoint(74.5F, -9.87F, 4.03F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Wagon part
		bodyModel[155].setRotationPoint(74.5F, -9.37F, 4.03F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Wagon part
		bodyModel[156].setRotationPoint(74.5F, -7.87F, 4.03F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Wagon part
		bodyModel[157].setRotationPoint(74.5F, -8.37F, 4.03F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[158].setRotationPoint(74.5F, -8.87F, -7.03F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Wagon part
		bodyModel[159].setRotationPoint(74.5F, -9.87F, -7.03F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Wagon part
		bodyModel[160].setRotationPoint(74.5F, -9.37F, -7.03F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Wagon part
		bodyModel[161].setRotationPoint(74.5F, -7.87F, -7.03F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Wagon part
		bodyModel[162].setRotationPoint(74.5F, -8.37F, -7.03F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Wagon part
		bodyModel[163].setRotationPoint(70.75F, -9.5F, 4.9F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Wagon part
		bodyModel[164].setRotationPoint(70.75F, -8.25F, 4.9F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Wagon part
		bodyModel[165].setRotationPoint(70.75F, -9F, -6.13F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Wagon part
		bodyModel[166].setRotationPoint(70.75F, -9.5F, -6.13F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Wagon part
		bodyModel[167].setRotationPoint(70.75F, -8.25F, -6.13F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Wagon part
		bodyModel[168].setRotationPoint(71F, -6F, -0.5F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Wagon part
		bodyModel[169].setRotationPoint(34F, -10F, 8F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Wagon part
		bodyModel[170].setRotationPoint(34F, -10F, -9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[171].setRotationPoint(33F, -10F, 8F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[172].setRotationPoint(33F, -10F, -9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 72, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[173].setRotationPoint(-2F, -9F, 9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 72, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Wagon part
		bodyModel[174].setRotationPoint(-2F, -9F, -10F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Wagon part
		bodyModel[175].setRotationPoint(-3F, -10F, -10F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 3, 20, 0F); // Wagon part
		bodyModel[176].setRotationPoint(70F, -10F, -10F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Wagon part
		bodyModel[177].setRotationPoint(-4F, -13F, -9F);

		bodyModel[178].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Wagon part
		bodyModel[178].setRotationPoint(-4F, -13F, 8F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Wagon part
		bodyModel[179].setRotationPoint(71F, -13F, -9F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Wagon part
		bodyModel[180].setRotationPoint(71F, -13F, 8F);

		bodyModel[181].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[181].setRotationPoint(29F, -24F, 9.5F);

		bodyModel[182].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[182].setRotationPoint(38F, -24F, 9.5F);

		bodyModel[183].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[183].setRotationPoint(48F, -24F, 9.5F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[184].setRotationPoint(58F, -24F, 9.5F);

		bodyModel[185].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[185].setRotationPoint(9F, -24F, 9.5F);

		bodyModel[186].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[186].setRotationPoint(19F, -24F, 9.5F);

		bodyModel[187].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[187].setRotationPoint(68F, -24F, 9.5F);

		bodyModel[188].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[188].setRotationPoint(-1F, -24F, 9.5F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[189].setRotationPoint(29F, -24F, -10.5F);

		bodyModel[190].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[190].setRotationPoint(38F, -24F, -10.5F);

		bodyModel[191].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[191].setRotationPoint(48F, -24F, -10.5F);

		bodyModel[192].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[192].setRotationPoint(58F, -24F, -10.5F);

		bodyModel[193].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[193].setRotationPoint(9F, -24F, -10.5F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[194].setRotationPoint(19F, -24F, -10.5F);

		bodyModel[195].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[195].setRotationPoint(68F, -24F, -10.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 1, 17, 1, 0F); // Wagon part
		bodyModel[196].setRotationPoint(-1F, -24F, -10.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 72, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[197].setRotationPoint(-2F, -8F, -2F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 72, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[198].setRotationPoint(-2F, -8F, 1F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Wagon part
		bodyModel[199].setRotationPoint(4.5F, -8.5F, -7F);

		bodyModel[200].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Wagon part
		bodyModel[200].setRotationPoint(12.5F, -8.5F, -7F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Wagon part
		bodyModel[201].setRotationPoint(54.5F, -8.5F, -7F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Wagon part
		bodyModel[202].setRotationPoint(62.5F, -8.5F, -7F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Wagon part
		bodyModel[203].setRotationPoint(26.5F, -8.5F, -7F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 1, 14, 0F); // Wagon part
		bodyModel[204].setRotationPoint(40.5F, -8.5F, -7F);

		bodyModel[205].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Wagon part
		bodyModel[205].setRotationPoint(3.5F, -8.5F, -9.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Wagon part
		bodyModel[206].setRotationPoint(3.5F, -8.5F, 6.5F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Wagon part
		bodyModel[207].setRotationPoint(12.5F, -8.5F, -9.5F);

		bodyModel[208].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Wagon part
		bodyModel[208].setRotationPoint(12.5F, -8.5F, 6.5F);

		bodyModel[209].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Wagon part
		bodyModel[209].setRotationPoint(53.5F, -8.5F, -9.5F);

		bodyModel[210].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Wagon part
		bodyModel[210].setRotationPoint(53.5F, -8.5F, 6.5F);

		bodyModel[211].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Wagon part
		bodyModel[211].setRotationPoint(62.5F, -8.5F, -9.5F);

		bodyModel[212].addBox(0F, 0F, 0F, 2, 1, 3, 0F); // Wagon part
		bodyModel[212].setRotationPoint(62.5F, -8.5F, 6.5F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Wagon part
		bodyModel[213].setRotationPoint(17F, -8.5F, -9.5F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Wagon part
		bodyModel[214].setRotationPoint(17F, -8.5F, 6.5F);

		bodyModel[215].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Wagon part
		bodyModel[215].setRotationPoint(50F, -8.5F, -9.5F);

		bodyModel[216].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Wagon part
		bodyModel[216].setRotationPoint(50F, -8.5F, 6.5F);

		bodyModel[217].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Wagon part
		bodyModel[217].setRotationPoint(33.5F, -8.5F, -9.5F);

		bodyModel[218].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Wagon part
		bodyModel[218].setRotationPoint(33.5F, -8.5F, 6.5F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Wagon part
		bodyModel[219].setRotationPoint(23.5F, -8.5F, -9.5F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Wagon part
		bodyModel[220].setRotationPoint(23.5F, -8.5F, 6.5F);

		bodyModel[221].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Wagon part
		bodyModel[221].setRotationPoint(43.5F, -8.5F, -9.5F);

		bodyModel[222].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Wagon part
		bodyModel[222].setRotationPoint(43.5F, -8.5F, 6.5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[223].setRotationPoint(-1F, -9.25F, -9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[224].setRotationPoint(-1F, -10.25F, -9F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[225].setRotationPoint(-1F, -10.25F, -9F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[226].setRotationPoint(-1F, -9.25F, 8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[227].setRotationPoint(-1F, -10.25F, 8F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[228].setRotationPoint(-1F, -10.25F, 8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[229].setRotationPoint(32F, -9.25F, -9F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[230].setRotationPoint(32F, -10.25F, -9F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[231].setRotationPoint(32F, -10.25F, -9F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[232].setRotationPoint(32F, -9.25F, 8F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[233].setRotationPoint(32F, -10.25F, 8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[234].setRotationPoint(32F, -10.25F, 8F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F); // Wagon part
		bodyModel[235].setRotationPoint(-2F, -8.25F, -6F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F); // Wagon part
		bodyModel[236].setRotationPoint(-2F, -8.25F, 5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Wagon part
		bodyModel[237].setRotationPoint(55F, -8.25F, -6F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Wagon part
		bodyModel[238].setRotationPoint(55F, -8.25F, 5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Wagon part
		bodyModel[239].setRotationPoint(-1F, -9.5F, -9.5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Wagon part
		bodyModel[240].setRotationPoint(32F, -9.5F, -9.5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Wagon part
		bodyModel[241].setRotationPoint(35F, -9.5F, -9.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Wagon part
		bodyModel[242].setRotationPoint(68F, -9.5F, -9.5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[243].setRotationPoint(-1F, -9.5F, 6.5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[244].setRotationPoint(32F, -9.5F, 6.5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[245].setRotationPoint(35F, -9.5F, 6.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Wagon part
		bodyModel[246].setRotationPoint(68F, -9.5F, 6.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[247].setRotationPoint(35F, -9.25F, -9F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[248].setRotationPoint(35F, -10.25F, -9F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[249].setRotationPoint(35F, -10.25F, -9F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[250].setRotationPoint(35F, -9.25F, 8F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[251].setRotationPoint(35F, -10.25F, 8F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[252].setRotationPoint(35F, -10.25F, 8F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[253].setRotationPoint(68F, -9.25F, -9F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[254].setRotationPoint(68F, -10.25F, -9F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[255].setRotationPoint(68F, -10.25F, -9F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part41
		bodyModel[256].setRotationPoint(68F, -9.25F, 8F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Du loco part41
		bodyModel[257].setRotationPoint(68F, -10.25F, 8F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F); // Du loco part41
		bodyModel[258].setRotationPoint(68F, -10.25F, 8F);
	}
	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale)
	{
		super.render(entity, f0, f1, f2, f3, f4, scale);
		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f0, f1, f2, f3, f4, scale);
	}
}