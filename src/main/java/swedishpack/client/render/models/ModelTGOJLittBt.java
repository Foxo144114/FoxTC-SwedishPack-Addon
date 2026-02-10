//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: TGOJ Litterera Bt
// Model Creator: Foxo
// Created on: 15.10.2023 - 14:58:21
// Last changed on: 15.10.2023 - 14:58:21

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelTGOJLittBt extends ModelConverter //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelTGOJLittBt() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1384];

		initbodyModel_1();
		initbodyModel_2();
		initbodyModel_3();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 490, textureX, textureY); // Du loco part03
		bodyModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Du loco part08
		bodyModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Du loco part09
		bodyModel[3] = new ModelRendererTurbo(this, 2, 1, textureX, textureY); // Du loco part19
		bodyModel[4] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Du loco part20
		bodyModel[5] = new ModelRendererTurbo(this, 136, 13, textureX, textureY); // Du loco part82
		bodyModel[6] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Du loco part83
		bodyModel[7] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Du loco part84
		bodyModel[8] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Du loco part85
		bodyModel[9] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Du loco part94
		bodyModel[10] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Du loco part95
		bodyModel[11] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Du loco part97
		bodyModel[12] = new ModelRendererTurbo(this, 87, 2, textureX, textureY); // Du loco part100
		bodyModel[13] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Du loco part101
		bodyModel[14] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 149
		bodyModel[15] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 167
		bodyModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 168
		bodyModel[17] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 177
		bodyModel[18] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 194
		bodyModel[19] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 195
		bodyModel[20] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 135
		bodyModel[21] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 136
		bodyModel[22] = new ModelRendererTurbo(this, 23, 7, textureX, textureY); // Box 149
		bodyModel[23] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Du loco part37
		bodyModel[24] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Du loco part37
		bodyModel[25] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Du loco part37
		bodyModel[26] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Du loco part37
		bodyModel[27] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Du loco part37
		bodyModel[28] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Du loco part37
		bodyModel[29] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Du loco part37
		bodyModel[30] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Du loco part37
		bodyModel[31] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Du loco part37
		bodyModel[32] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Du loco part37
		bodyModel[33] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Du loco part37
		bodyModel[34] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Du loco part37
		bodyModel[35] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Du loco part37
		bodyModel[36] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 149
		bodyModel[37] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Du loco part37
		bodyModel[38] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Du loco part09
		bodyModel[39] = new ModelRendererTurbo(this, 482, 25, textureX, textureY); // Box 168
		bodyModel[40] = new ModelRendererTurbo(this, 274, 33, textureX, textureY); // Box 167
		bodyModel[41] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 168
		bodyModel[42] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Du loco part71
		bodyModel[43] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Du loco part71
		bodyModel[44] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Du loco part28
		bodyModel[45] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Du loco part37
		bodyModel[46] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Du loco part37
		bodyModel[47] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Du loco part37
		bodyModel[48] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Du loco part37
		bodyModel[49] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Du loco part37
		bodyModel[50] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Du loco part37
		bodyModel[51] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Du loco part37
		bodyModel[52] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Du loco part37
		bodyModel[53] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Du loco part37
		bodyModel[54] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Du loco part37
		bodyModel[55] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Du loco part37
		bodyModel[56] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Du loco part37
		bodyModel[57] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Du loco part37
		bodyModel[58] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Du loco part37
		bodyModel[59] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Du loco part37
		bodyModel[60] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Du loco part37
		bodyModel[61] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Du loco part37
		bodyModel[62] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Du loco part37
		bodyModel[63] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Du loco part37
		bodyModel[64] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Du loco part37
		bodyModel[65] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Du loco part37
		bodyModel[66] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Du loco part37
		bodyModel[67] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Du loco part37
		bodyModel[68] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Du loco part37
		bodyModel[69] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Du loco part37
		bodyModel[70] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Du loco part37
		bodyModel[71] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Du loco part37
		bodyModel[72] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Du loco part37
		bodyModel[73] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Du loco part37
		bodyModel[74] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part37
		bodyModel[75] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Du loco part37
		bodyModel[76] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Du loco part37
		bodyModel[77] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Du loco part37
		bodyModel[78] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Du loco part37
		bodyModel[79] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Du loco part37
		bodyModel[80] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Du loco part37
		bodyModel[81] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Du loco part37
		bodyModel[82] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Du loco part37
		bodyModel[83] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Du loco part37
		bodyModel[84] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Du loco part37
		bodyModel[85] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Du loco part37
		bodyModel[86] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Du loco part37
		bodyModel[87] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Du loco part37
		bodyModel[88] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Du loco part37
		bodyModel[89] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Du loco part37
		bodyModel[90] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Du loco part37
		bodyModel[91] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Du loco part37
		bodyModel[92] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Du loco part37
		bodyModel[93] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Du loco part37
		bodyModel[94] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Du loco part37
		bodyModel[95] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Du loco part05
		bodyModel[96] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Du loco part05
		bodyModel[97] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Du loco part05
		bodyModel[98] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Du loco part05
		bodyModel[99] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Du loco part05
		bodyModel[100] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Du loco part05
		bodyModel[101] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Du loco part05
		bodyModel[102] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Du loco part05
		bodyModel[103] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Du loco part05
		bodyModel[104] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Du loco part05
		bodyModel[105] = new ModelRendererTurbo(this, 407, 430, textureX, textureY); // Du loco part05
		bodyModel[106] = new ModelRendererTurbo(this, 407, 427, textureX, textureY); // Du loco part05
		bodyModel[107] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Du loco part05
		bodyModel[108] = new ModelRendererTurbo(this, 407, 419, textureX, textureY); // Du loco part05
		bodyModel[109] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Du loco part05
		bodyModel[110] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Du loco part05
		bodyModel[111] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Du loco part01
		bodyModel[112] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 0
		bodyModel[114] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 0
		bodyModel[115] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 0
		bodyModel[116] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 0
		bodyModel[117] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 0
		bodyModel[118] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 0
		bodyModel[119] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 0
		bodyModel[120] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 0
		bodyModel[121] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 0
		bodyModel[122] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 0
		bodyModel[124] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 0
		bodyModel[135] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 0
		bodyModel[137] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 0
		bodyModel[138] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 0
		bodyModel[139] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 0
		bodyModel[147] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 0
		bodyModel[156] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 0
		bodyModel[164] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 0
		bodyModel[165] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 0
		bodyModel[166] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 0
		bodyModel[167] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 0
		bodyModel[168] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 0
		bodyModel[169] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 0
		bodyModel[170] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 0
		bodyModel[171] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 0
		bodyModel[172] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 0
		bodyModel[173] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 0
		bodyModel[174] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 0
		bodyModel[175] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 0
		bodyModel[176] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 0
		bodyModel[177] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 0
		bodyModel[178] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 0
		bodyModel[179] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 0
		bodyModel[180] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Du loco part05
		bodyModel[181] = new ModelRendererTurbo(this, 3, 90, textureX, textureY); // Du loco part05
		bodyModel[182] = new ModelRendererTurbo(this, 17, 93, textureX, textureY); // Du loco part37
		bodyModel[183] = new ModelRendererTurbo(this, 312, 337, textureX, textureY); // Du loco part42
		bodyModel[184] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 168
		bodyModel[185] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 168
		bodyModel[186] = new ModelRendererTurbo(this, 362, 89, textureX, textureY); // Du loco part19
		bodyModel[187] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 168
		bodyModel[188] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 168
		bodyModel[189] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 149
		bodyModel[190] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 149
		bodyModel[191] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 149
		bodyModel[192] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 168
		bodyModel[193] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 168
		bodyModel[194] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 168
		bodyModel[195] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 168
		bodyModel[196] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 168
		bodyModel[197] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 149
		bodyModel[198] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 168
		bodyModel[199] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 149
		bodyModel[200] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 168
		bodyModel[201] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 168
		bodyModel[202] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 168
		bodyModel[203] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 168
		bodyModel[204] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 168
		bodyModel[205] = new ModelRendererTurbo(this, 474, 97, textureX, textureY); // Box 167
		bodyModel[206] = new ModelRendererTurbo(this, 490, 97, textureX, textureY); // Box 168
		bodyModel[207] = new ModelRendererTurbo(this, 411, 98, textureX, textureY); // Du loco part05
		bodyModel[208] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Du loco part05
		bodyModel[209] = new ModelRendererTurbo(this, 459, 98, textureX, textureY); // Du loco part05
		bodyModel[210] = new ModelRendererTurbo(this, 5, 106, textureX, textureY); // Du loco part05
		bodyModel[211] = new ModelRendererTurbo(this, 18, 105, textureX, textureY); // Du loco part05
		bodyModel[212] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Du loco part05
		bodyModel[213] = new ModelRendererTurbo(this, 35, 106, textureX, textureY); // Du loco part05
		bodyModel[214] = new ModelRendererTurbo(this, 66, 105, textureX, textureY); // Du loco part05
		bodyModel[215] = new ModelRendererTurbo(this, 83, 106, textureX, textureY); // Du loco part05
		bodyModel[216] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Du loco part19
		bodyModel[217] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 167
		bodyModel[218] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 168
		bodyModel[219] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 168
		bodyModel[220] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 167
		bodyModel[221] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 168
		bodyModel[222] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 168
		bodyModel[223] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 167
		bodyModel[224] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 168
		bodyModel[225] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 0
		bodyModel[226] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 0
		bodyModel[227] = new ModelRendererTurbo(this, 510, 1, textureX, textureY); // Box 168
		bodyModel[228] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Du loco part19
		bodyModel[229] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 167
		bodyModel[230] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 168
		bodyModel[231] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 168
		bodyModel[232] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 167
		bodyModel[233] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 168
		bodyModel[234] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 168
		bodyModel[235] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 167
		bodyModel[236] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 168
		bodyModel[237] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Du loco part37
		bodyModel[238] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Du loco part37
		bodyModel[239] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Du loco part37
		bodyModel[240] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Du loco part08
		bodyModel[241] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 149
		bodyModel[242] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 149
		bodyModel[243] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Du loco part71
		bodyModel[244] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Du loco part71
		bodyModel[245] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Du loco part09
		bodyModel[246] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Du loco part09
		bodyModel[247] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Du loco part01
		bodyModel[248] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 135
		bodyModel[249] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 135
		bodyModel[250] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 135
		bodyModel[251] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 135
		bodyModel[252] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 135
		bodyModel[253] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 135
		bodyModel[254] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Du loco part05
		bodyModel[255] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Du loco part05
		bodyModel[256] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 135
		bodyModel[257] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Du loco part28
		bodyModel[258] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Du loco part28
		bodyModel[259] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 135
		bodyModel[260] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 135
		bodyModel[261] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Du loco part28
		bodyModel[262] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Du loco part28
		bodyModel[263] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Du loco part28
		bodyModel[264] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 135
		bodyModel[265] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Du loco part05
		bodyModel[266] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Du loco part05
		bodyModel[267] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Du loco part05
		bodyModel[268] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Du loco part05
		bodyModel[269] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Du loco part05
		bodyModel[270] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Du loco part05
		bodyModel[271] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Du loco part05
		bodyModel[272] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Du loco part05
		bodyModel[273] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Du loco part05
		bodyModel[274] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Du loco part05
		bodyModel[275] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Du loco part05
		bodyModel[276] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Du loco part05
		bodyModel[277] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Du loco part05
		bodyModel[278] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Du loco part05
		bodyModel[279] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Du loco part05
		bodyModel[280] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Du loco part05
		bodyModel[281] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Du loco part05
		bodyModel[282] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 135
		bodyModel[283] = new ModelRendererTurbo(this, 120, 145, textureX, textureY); // Box 135
		bodyModel[284] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Du loco part05
		bodyModel[285] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Du loco part05
		bodyModel[286] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Du loco part05
		bodyModel[287] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Du loco part05
		bodyModel[288] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Du loco part05
		bodyModel[289] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Du loco part05
		bodyModel[290] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Du loco part05
		bodyModel[291] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Du loco part05
		bodyModel[292] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Du loco part05
		bodyModel[293] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Du loco part05
		bodyModel[294] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Du loco part05
		bodyModel[295] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Du loco part05
		bodyModel[296] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Du loco part05
		bodyModel[297] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Du loco part05
		bodyModel[298] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Du loco part05
		bodyModel[299] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Du loco part05
		bodyModel[300] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Du loco part05
		bodyModel[301] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Du loco part05
		bodyModel[302] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Du loco part05
		bodyModel[303] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Du loco part05
		bodyModel[304] = new ModelRendererTurbo(this, 63, 153, textureX, textureY); // Box 135
		bodyModel[305] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 135
		bodyModel[306] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Du loco part05
		bodyModel[307] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Du loco part05
		bodyModel[308] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Du loco part05
		bodyModel[309] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Du loco part05
		bodyModel[310] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Du loco part05
		bodyModel[311] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Du loco part05
		bodyModel[312] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Du loco part05
		bodyModel[313] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Du loco part05
		bodyModel[314] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Du loco part05
		bodyModel[315] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Du loco part05
		bodyModel[316] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Du loco part05
		bodyModel[317] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Du loco part05
		bodyModel[318] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Du loco part05
		bodyModel[319] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Du loco part05
		bodyModel[320] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Du loco part05
		bodyModel[321] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Du loco part05
		bodyModel[322] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Du loco part05
		bodyModel[323] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Du loco part05
		bodyModel[324] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Du loco part05
		bodyModel[325] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Du loco part05
		bodyModel[326] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Du loco part05
		bodyModel[327] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Du loco part05
		bodyModel[328] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Du loco part05
		bodyModel[329] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Du loco part05
		bodyModel[330] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Du loco part05
		bodyModel[331] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Du loco part05
		bodyModel[332] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Du loco part05
		bodyModel[333] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Du loco part05
		bodyModel[334] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Du loco part05
		bodyModel[335] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Du loco part05
		bodyModel[336] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Du loco part05
		bodyModel[337] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part05
		bodyModel[338] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Du loco part05
		bodyModel[339] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Du loco part05
		bodyModel[340] = new ModelRendererTurbo(this, 9, 161, textureX, textureY); // Du loco part05
		bodyModel[341] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Du loco part05
		bodyModel[342] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Du loco part05
		bodyModel[343] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Du loco part05
		bodyModel[344] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Du loco part05
		bodyModel[345] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Du loco part05
		bodyModel[346] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Du loco part28
		bodyModel[347] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 135
		bodyModel[348] = new ModelRendererTurbo(this, 122, 161, textureX, textureY); // Box 135
		bodyModel[349] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Du loco part05
		bodyModel[350] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Du loco part05
		bodyModel[351] = new ModelRendererTurbo(this, 154, 161, textureX, textureY); // Box 135
		bodyModel[352] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Du loco part28
		bodyModel[353] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Du loco part28
		bodyModel[354] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 135
		bodyModel[355] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Du loco part28
		bodyModel[356] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Du loco part28
		bodyModel[357] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Du loco part28
		bodyModel[358] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 135
		bodyModel[359] = new ModelRendererTurbo(this, 232, 161, textureX, textureY); // Box 135
		bodyModel[360] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Du loco part05
		bodyModel[361] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Du loco part05
		bodyModel[362] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Du loco part05
		bodyModel[363] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Du loco part05
		bodyModel[364] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Du loco part05
		bodyModel[365] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Du loco part05
		bodyModel[366] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Du loco part05
		bodyModel[367] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Du loco part05
		bodyModel[368] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Du loco part05
		bodyModel[369] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Du loco part05
		bodyModel[370] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Du loco part05
		bodyModel[371] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Du loco part05
		bodyModel[372] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Du loco part05
		bodyModel[373] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Du loco part05
		bodyModel[374] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Du loco part05
		bodyModel[375] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Du loco part05
		bodyModel[376] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Du loco part05
		bodyModel[377] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Du loco part05
		bodyModel[378] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Du loco part05
		bodyModel[379] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Du loco part05
		bodyModel[380] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 135
		bodyModel[381] = new ModelRendererTurbo(this, 447, 161, textureX, textureY); // Box 135
		bodyModel[382] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Du loco part05
		bodyModel[383] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Du loco part05
		bodyModel[384] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Du loco part05
		bodyModel[385] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Du loco part05
		bodyModel[386] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Du loco part05
		bodyModel[387] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Du loco part05
		bodyModel[388] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Du loco part05
		bodyModel[389] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Du loco part05
		bodyModel[390] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Du loco part05
		bodyModel[391] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Du loco part05
		bodyModel[392] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Du loco part05
		bodyModel[393] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Du loco part05
		bodyModel[394] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Du loco part05
		bodyModel[395] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Du loco part05
		bodyModel[396] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Du loco part05
		bodyModel[397] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Du loco part05
		bodyModel[398] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Du loco part05
		bodyModel[399] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Du loco part05
		bodyModel[400] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Du loco part05
		bodyModel[401] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Du loco part05
		bodyModel[402] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Du loco part05
		bodyModel[403] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Du loco part05
		bodyModel[404] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Du loco part05
		bodyModel[405] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Du loco part05
		bodyModel[406] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Du loco part05
		bodyModel[407] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Du loco part05
		bodyModel[408] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Du loco part05
		bodyModel[409] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Du loco part05
		bodyModel[410] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Du loco part05
		bodyModel[411] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Du loco part05
		bodyModel[412] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Du loco part05
		bodyModel[413] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Du loco part05
		bodyModel[414] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Du loco part05
		bodyModel[415] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Du loco part05
		bodyModel[416] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Du loco part05
		bodyModel[417] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Du loco part05
		bodyModel[418] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Du loco part05
		bodyModel[419] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Du loco part05
		bodyModel[420] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Du loco part05
		bodyModel[421] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Du loco part05
		bodyModel[422] = new ModelRendererTurbo(this, 381, 169, textureX, textureY); // Box 135
		bodyModel[423] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Du loco part05
		bodyModel[424] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Du loco part05
		bodyModel[425] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Du loco part05
		bodyModel[426] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Du loco part05
		bodyModel[427] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Du loco part05
		bodyModel[428] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Du loco part05
		bodyModel[429] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Du loco part05
		bodyModel[430] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Du loco part05
		bodyModel[431] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Du loco part05
		bodyModel[432] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Du loco part05
		bodyModel[433] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Du loco part05
		bodyModel[434] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Du loco part05
		bodyModel[435] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Du loco part05
		bodyModel[436] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Du loco part05
		bodyModel[437] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Du loco part05
		bodyModel[438] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Du loco part05
		bodyModel[439] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Du loco part05
		bodyModel[440] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Du loco part05
		bodyModel[441] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Du loco part05
		bodyModel[442] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Du loco part05
		bodyModel[443] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Du loco part28
		bodyModel[444] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 135
		bodyModel[445] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 135
		bodyModel[446] = new ModelRendererTurbo(this, 329, 213, textureX, textureY); // Du loco part28
		bodyModel[447] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Du loco part28
		bodyModel[448] = new ModelRendererTurbo(this, 329, 213, textureX, textureY); // Du loco part28
		bodyModel[449] = new ModelRendererTurbo(this, 329, 213, textureX, textureY); // Du loco part28
		bodyModel[450] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 135
		bodyModel[451] = new ModelRendererTurbo(this, 152, 177, textureX, textureY); // Box 135
		bodyModel[452] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Du loco part09
		bodyModel[453] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Du loco part09
		bodyModel[454] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Du loco part01
		bodyModel[455] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Du loco part09
		bodyModel[456] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Du loco part09
		bodyModel[457] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Du loco part01
		bodyModel[458] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 135
		bodyModel[459] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 135
		bodyModel[460] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 135
		bodyModel[461] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 135
		bodyModel[462] = new ModelRendererTurbo(this, 409, 174, textureX, textureY); // Box 135
		bodyModel[463] = new ModelRendererTurbo(this, 1, 188, textureX, textureY); // Box 135
		bodyModel[464] = new ModelRendererTurbo(this, 510, 177, textureX, textureY); // Box 135
		bodyModel[465] = new ModelRendererTurbo(this, 12, 185, textureX, textureY); // Box 135
		bodyModel[466] = new ModelRendererTurbo(this, 25, 188, textureX, textureY); // Box 135
		bodyModel[467] = new ModelRendererTurbo(this, 41, 180, textureX, textureY); // Box 135
		bodyModel[468] = new ModelRendererTurbo(this, 14, 193, textureX, textureY); // Box 135
		bodyModel[469] = new ModelRendererTurbo(this, 107, 186, textureX, textureY); // Box 168
		bodyModel[470] = new ModelRendererTurbo(this, 138, 185, textureX, textureY); // Box 168
		bodyModel[471] = new ModelRendererTurbo(this, 378, 185, textureX, textureY); // Box 168
		bodyModel[472] = new ModelRendererTurbo(this, 491, 186, textureX, textureY); // Box 168
		bodyModel[473] = new ModelRendererTurbo(this, 170, 185, textureX, textureY); // Box 168
		bodyModel[474] = new ModelRendererTurbo(this, 90, 193, textureX, textureY); // Box 168
		bodyModel[475] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Du loco part08
		bodyModel[476] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Du loco part19
		bodyModel[477] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 149
		bodyModel[478] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 167
		bodyModel[479] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 168
		bodyModel[480] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 149
		bodyModel[481] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 168
		bodyModel[482] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 167
		bodyModel[483] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 168
		bodyModel[484] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Du loco part71
		bodyModel[485] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part71
		bodyModel[486] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 168
		bodyModel[487] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 168
		bodyModel[488] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Du loco part19
		bodyModel[489] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 168
		bodyModel[490] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 168
		bodyModel[491] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 149
		bodyModel[492] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 149
		bodyModel[493] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 149
		bodyModel[494] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 168
		bodyModel[495] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 168
		bodyModel[496] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 168
		bodyModel[497] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 168
		bodyModel[498] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 168
		bodyModel[499] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 149

		bodyModel[0].addBox(0F, 0F, 0F, 106, 1, 20, 0F); // Du loco part03
		bodyModel[0].setRotationPoint(-6F, -12F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[1].setRotationPoint(-5F, -32F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[2].setRotationPoint(-24F, -10F, 6.05F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[3].setRotationPoint(-10F, -22F, -1F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Du loco part20
		bodyModel[4].setRotationPoint(86F, -30F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part82
		bodyModel[5].setRotationPoint(-9F, -21F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[6].setRotationPoint(-2F, -13F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[7].setRotationPoint(-2F, -13F, -6F);
		bodyModel[7].rotateAngleY = -1.57079633F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[8].setRotationPoint(-2F, -13F, -3F);
		bodyModel[8].rotateAngleY = -1.57079633F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[9].setRotationPoint(-2F, -16F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[10].setRotationPoint(-2F, -16F, -3F);
		bodyModel[10].rotateAngleY = -1.57079633F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[11].setRotationPoint(-2F, -16F, -6F);
		bodyModel[11].rotateAngleY = -1.57079633F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[12].setRotationPoint(1F, -20F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[13].setRotationPoint(1F, -20F, -8F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[14].setRotationPoint(-5F, -31F, 7F);

		bodyModel[15].addShapeBox(0F, 0F, 1F, 2, 10, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[15].setRotationPoint(-10F, -22F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 1F, 2, 10, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[16].setRotationPoint(-10F, -22F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[17].setRotationPoint(1F, -16F, -7F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[18].setRotationPoint(0F, -15F, -4F);
		bodyModel[18].rotateAngleY = -1.57079633F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[19].setRotationPoint(-1F, -15F, -4F);
		bodyModel[19].rotateAngleY = -1.57079633F;

		bodyModel[20].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 135
		bodyModel[20].setRotationPoint(-6F, -22F, 10F);

		bodyModel[21].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 136
		bodyModel[21].setRotationPoint(7F, -30F, -10F);

		bodyModel[22].addBox(0F, 0F, 0F, 11, 12, 12, 0F); // Box 149
		bodyModel[22].setRotationPoint(47F, -29F, -6F);

		bodyModel[23].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[23].setRotationPoint(10F, -33F, -6F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[24].setRotationPoint(10F, -33F, 5F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[25].setRotationPoint(18F, -33F, -6F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[26].setRotationPoint(18F, -33F, 5F);

		bodyModel[27].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Du loco part37
		bodyModel[27].setRotationPoint(10F, -34F, -6F);

		bodyModel[28].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Du loco part37
		bodyModel[28].setRotationPoint(10F, -34F, 5F);

		bodyModel[29].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[29].setRotationPoint(13F, -37F, -4F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[30].setRotationPoint(13F, -37F, 3F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[31].setRotationPoint(14F, -38F, -6F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[32].setRotationPoint(14F, -38F, 6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[33].setRotationPoint(14F, -38F, -8F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[34].setRotationPoint(2F, -35F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[35].setRotationPoint(2F, -36F, -4F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[36].setRotationPoint(-5F, -32F, 1F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[37].setRotationPoint(25F, -33F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[38].setRotationPoint(-24F, -10F, -6.05F);

		bodyModel[39].addShapeBox(0F, 0F, 1F, 2, 10, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[39].setRotationPoint(-8F, -22F, 7F);

		bodyModel[40].addShapeBox(0F, 0F, 1F, 2, 10, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[40].setRotationPoint(-8F, -22F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[41].setRotationPoint(-8F, -30F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[42].setRotationPoint(-5F, -32F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[43].setRotationPoint(-5F, -31F, -10F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[44].setRotationPoint(1.25F, -27F, 10.5F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[45].setRotationPoint(75F, -33F, -6F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[46].setRotationPoint(75F, -33F, 5F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[47].setRotationPoint(83F, -33F, -6F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[48].setRotationPoint(83F, -33F, 5F);

		bodyModel[49].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Du loco part37
		bodyModel[49].setRotationPoint(75F, -34F, -6F);

		bodyModel[50].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Du loco part37
		bodyModel[50].setRotationPoint(75F, -34F, 5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[51].setRotationPoint(83F, -40F, 4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[52].setRotationPoint(70F, -40F, 4F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[53].setRotationPoint(80F, -46F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[54].setRotationPoint(70F, -46F, 3F);

		bodyModel[55].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[55].setRotationPoint(78F, -47F, -4F);

		bodyModel[56].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[56].setRotationPoint(78F, -47F, 3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[57].setRotationPoint(83F, -40F, -5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[58].setRotationPoint(70F, -40F, -5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[59].setRotationPoint(80F, -46F, -4F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[60].setRotationPoint(70F, -46F, -4F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[61].setRotationPoint(18F, -35F, 4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, 0F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -7F); // Du loco part37
		bodyModel[62].setRotationPoint(16F, -37F, -4F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[63].setRotationPoint(2F, -35F, 4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[64].setRotationPoint(2F, -36F, 3F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[65].setRotationPoint(18F, -35F, -5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[66].setRotationPoint(15F, -36F, -4F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[67].setRotationPoint(78F, -37F, -4F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[68].setRotationPoint(78F, -37F, 3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[69].setRotationPoint(67F, -35F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[70].setRotationPoint(67F, -36F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[71].setRotationPoint(83F, -35F, 4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[72].setRotationPoint(80F, -36F, 3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[73].setRotationPoint(67F, -35F, 4F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[74].setRotationPoint(67F, -36F, 3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[75].setRotationPoint(83F, -35F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[76].setRotationPoint(80F, -36F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[77].setRotationPoint(18F, -40F, 4F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[78].setRotationPoint(5F, -40F, 4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[79].setRotationPoint(15F, -46F, 3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[80].setRotationPoint(5F, -46F, 3F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[81].setRotationPoint(13F, -47F, -4F);

		bodyModel[82].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[82].setRotationPoint(13F, -47F, 3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[83].setRotationPoint(18F, -40F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[84].setRotationPoint(5F, -40F, -5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[85].setRotationPoint(15F, -46F, -4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[86].setRotationPoint(5F, -46F, -4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F); // Du loco part37
		bodyModel[87].setRotationPoint(16F, -46F, -4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F); // Du loco part37
		bodyModel[88].setRotationPoint(16F, -46F, -4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[89].setRotationPoint(15F, -36F, 3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, -7F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F); // Du loco part37
		bodyModel[90].setRotationPoint(16F, -37F, -4F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[91].setRotationPoint(67F, -37F, -4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[92].setRotationPoint(70F, -46F, -4F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[93].setRotationPoint(70F, -46F, -4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[94].setRotationPoint(67F, -37F, -4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[95].setRotationPoint(-5F, -28F, 10F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[96].setRotationPoint(-5F, -27.75F, 10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part05
		bodyModel[97].setRotationPoint(-1F, -27.75F, 10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[98].setRotationPoint(3.5F, -23F, 10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Du loco part05
		bodyModel[99].setRotationPoint(3.5F, -27.5F, 10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[100].setRotationPoint(2.5F, -27F, 10F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Du loco part05
		bodyModel[101].setRotationPoint(4.5F, -27F, 10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[102].setRotationPoint(16F, -23F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[103].setRotationPoint(16F, -27F, 10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[104].setRotationPoint(14F, -25F, 10F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[105].setRotationPoint(-5F, -23F, -11F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[106].setRotationPoint(-5F, -28F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[107].setRotationPoint(-5F, -28F, -11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[108].setRotationPoint(1F, -28F, -11F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.125F, -0.25F, -0.75F, -0.125F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.125F, -0.25F, -0.75F, -0.125F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[109].setRotationPoint(-7.5F, -28.5F, 8F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[110].setRotationPoint(-9F, -23.5F, 5F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[111].setRotationPoint(1F, -6F, -6F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[112].setRotationPoint(-11F, -9.25F, 5.43F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[113].setRotationPoint(-10.75F, -9F, 5.9F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[114].setRotationPoint(-13.5F, -8.75F, 6.15F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[115].setRotationPoint(-11F, -9.25F, -7.63F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[116].setRotationPoint(-13.5F, -8.75F, -6.88F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[117].setRotationPoint(-11F, -8.75F, 0F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[118].setRotationPoint(-11F, -8.75F, -1F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[119].setRotationPoint(-10.5F, -8.5F, -0.25F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[120].setRotationPoint(-12.5F, -7F, -0.25F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[121].setRotationPoint(-11.5F, -8.75F, -0.25F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[122].setRotationPoint(-12.5F, -8.5F, 0F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[123].setRotationPoint(-12.5F, -8.5F, -0.75F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[124].setRotationPoint(-11F, -8.75F, 0.25F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[125].setRotationPoint(-11F, -8.5F, -0.25F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[126].setRotationPoint(-11F, -9F, -0.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[127].setRotationPoint(-11F, -6F, -0.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[128].setRotationPoint(-11F, -8.75F, -1F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[129].setRotationPoint(-12.5F, -6F, -0.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[130].setRotationPoint(-12.5F, -5.25F, -0.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[131].setRotationPoint(-14.5F, -8.87F, 5.03F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[132].setRotationPoint(-14.5F, -9.87F, 5.03F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[133].setRotationPoint(-14.5F, -9.37F, 5.03F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[134].setRotationPoint(-14.5F, -7.87F, 5.03F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[135].setRotationPoint(-14.5F, -8.37F, 5.03F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[136].setRotationPoint(-14.5F, -8.87F, -8.03F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[137].setRotationPoint(-14.5F, -9.87F, -8.03F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[138].setRotationPoint(-14.5F, -9.37F, -8.03F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[139].setRotationPoint(-14.5F, -7.87F, -8.03F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[140].setRotationPoint(-14.5F, -8.37F, -8.03F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[141].setRotationPoint(-10.75F, -9.5F, 5.9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[142].setRotationPoint(-10.75F, -8.25F, 5.9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[143].setRotationPoint(-10.75F, -9F, -7.13F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[144].setRotationPoint(-10.75F, -9.5F, -7.13F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[145].setRotationPoint(-10.75F, -8.25F, -7.13F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[146].setRotationPoint(104F, -9.25F, 5.43F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[147].setRotationPoint(103.75F, -9F, 5.9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[148].setRotationPoint(104.5F, -8.75F, 6.15F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[149].setRotationPoint(104F, -9.25F, -7.63F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[150].setRotationPoint(104.5F, -8.75F, -6.88F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[151].setRotationPoint(104F, -8.75F, 0F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[152].setRotationPoint(104F, -8.75F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[153].setRotationPoint(103.5F, -8.5F, -0.25F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[154].setRotationPoint(104.5F, -7F, -0.25F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[155].setRotationPoint(104.5F, -8.75F, -0.25F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[156].setRotationPoint(103.5F, -8.5F, 0F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[157].setRotationPoint(103.5F, -8.5F, -0.75F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[158].setRotationPoint(104F, -8.75F, 0.25F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[159].setRotationPoint(104F, -8.5F, -0.25F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[160].setRotationPoint(104F, -9F, -0.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[161].setRotationPoint(104F, -6F, -0.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[162].setRotationPoint(104F, -8.75F, -1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[163].setRotationPoint(104.5F, -6F, -0.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[164].setRotationPoint(105.5F, -5.25F, -0.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[165].setRotationPoint(107.5F, -8.87F, 5.03F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[166].setRotationPoint(107.5F, -9.87F, 5.03F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[167].setRotationPoint(107.5F, -9.37F, 5.03F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[168].setRotationPoint(107.5F, -7.87F, 5.03F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[169].setRotationPoint(107.5F, -8.37F, 5.03F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[170].setRotationPoint(107.5F, -8.87F, -8.03F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[171].setRotationPoint(107.5F, -9.87F, -8.03F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[172].setRotationPoint(107.5F, -9.37F, -8.03F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[173].setRotationPoint(107.5F, -7.87F, -8.03F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[174].setRotationPoint(107.5F, -8.37F, -8.03F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[175].setRotationPoint(103.75F, -9.5F, 5.9F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[176].setRotationPoint(103.75F, -8.25F, 5.9F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[177].setRotationPoint(103.75F, -9F, -7.13F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[178].setRotationPoint(103.75F, -9.5F, -7.13F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[179].setRotationPoint(103.75F, -8.25F, -7.13F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Du loco part05
		bodyModel[180].setRotationPoint(-10F, -28.5F, 2F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[181].setRotationPoint(-10F, -23.5F, 2F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, 0F, 0F); // Du loco part37
		bodyModel[182].setRotationPoint(55F, -36F, 0F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,-2.875F, 0F, 0F, 0F, 0F, 0F, -2.625F, 0F, 0F, -0.25F, 0F, 0F, -2.375F, 0F, 0F, -0.5F, 0F, 0F, -3.125F, 0F, 0F, 0.25F, 0F, 0F); // Du loco part42
		bodyModel[183].setRotationPoint(-10F, -7F, -8F);

		bodyModel[184].addShapeBox(0F, 0F, 1F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[184].setRotationPoint(-7F, -22F, 9F);

		bodyModel[185].addShapeBox(0F, 0F, 1F, 1, 10, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[185].setRotationPoint(-7F, -22F, -12F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[186].setRotationPoint(-10F, -29F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 1F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[187].setRotationPoint(-7F, -29F, 9F);

		bodyModel[188].addShapeBox(0F, 0F, 1F, 2, 7, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[188].setRotationPoint(-7F, -29F, -12F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 149
		bodyModel[189].setRotationPoint(-10F, -30F, -5F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[190].setRotationPoint(-9F, -30F, 1F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,-4F, 1F, -6F, -2F, -1F, 0F, -2F, -1F, 0F, -4F, 1F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -6F); // Box 149
		bodyModel[191].setRotationPoint(-9F, -31F, -7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[192].setRotationPoint(-9F, -30F, 5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[193].setRotationPoint(-8F, -30F, 5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[194].setRotationPoint(-7F, -30F, 10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[195].setRotationPoint(-7F, -30F, 7F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 168
		bodyModel[196].setRotationPoint(-7F, -31F, 7F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, -2F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[197].setRotationPoint(-7F, -32F, -7F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 168
		bodyModel[198].setRotationPoint(-8F, -30F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[199].setRotationPoint(-9F, -30F, -5F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[200].setRotationPoint(-9F, -30F, -8F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[201].setRotationPoint(-8F, -30F, -8F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[202].setRotationPoint(-7F, -30F, -11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[203].setRotationPoint(-7F, -30F, -10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[204].setRotationPoint(-7F, -31F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 1F, 2, 10, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[205].setRotationPoint(-9F, -22F, -9F);

		bodyModel[206].addShapeBox(0F, 0F, 1F, 2, 10, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[206].setRotationPoint(-9F, -22F, 4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[207].setRotationPoint(-7.5F, -23.5F, 8F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[208].setRotationPoint(-9F, -28.5F, 5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[209].setRotationPoint(-10F, -28.5F, 2F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[210].setRotationPoint(-7.5F, -28.5F, 8F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[211].setRotationPoint(-9F, -23.5F, -8F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Du loco part05
		bodyModel[212].setRotationPoint(-10F, -28.5F, -3F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part05
		bodyModel[213].setRotationPoint(-10F, -23.5F, -5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[214].setRotationPoint(-9F, -28.5F, -8F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part05
		bodyModel[215].setRotationPoint(-10F, -28.5F, -5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[216].setRotationPoint(-10F, -11F, -1F);

		bodyModel[217].addShapeBox(0F, 0F, 1F, 4, 4, 4, 0F,-1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[217].setRotationPoint(-10F, -11F, -6F);

		bodyModel[218].addShapeBox(0F, 0F, 1F, 4, 4, 4, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[218].setRotationPoint(-10F, -11F, 0F);

		bodyModel[219].addShapeBox(0F, 0F, 1F, 2, 4, 2, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[219].setRotationPoint(-8F, -11F, 7F);

		bodyModel[220].addShapeBox(0F, 0F, 1F, 2, 4, 2, 0F,-1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[220].setRotationPoint(-8F, -11F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 1F, 1, 4, 1, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Box 168
		bodyModel[221].setRotationPoint(-7F, -11F, 9F);

		bodyModel[222].addShapeBox(0F, 0F, 1F, 1, 4, 1, 0F,-1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[222].setRotationPoint(-7F, -11F, -12F);

		bodyModel[223].addShapeBox(0F, 0F, 1F, 3, 4, 3, 0F,-1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[223].setRotationPoint(-9F, -11F, -9F);

		bodyModel[224].addShapeBox(0F, 0F, 1F, 3, 4, 3, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[224].setRotationPoint(-9F, -11F, 4F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[225].setRotationPoint(-10F, -9.25F, -7.88F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[226].setRotationPoint(-10F, -9.25F, 5.18F);

		bodyModel[227].addShapeBox(0F, 0F, 1F, 106, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 168
		bodyModel[227].setRotationPoint(-6F, -8F, 9F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Du loco part19
		bodyModel[228].setRotationPoint(-11F, -12F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 1F, 5, 1, 4, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 167
		bodyModel[229].setRotationPoint(-11F, -12F, -6F);

		bodyModel[230].addShapeBox(0F, 0F, 1F, 5, 1, 4, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1.75F, -0.75F, 0F); // Box 168
		bodyModel[230].setRotationPoint(-11F, -12F, 0F);

		bodyModel[231].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1.75F, -0.75F, 0F); // Box 168
		bodyModel[231].setRotationPoint(-9F, -12F, 7F);

		bodyModel[232].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 167
		bodyModel[232].setRotationPoint(-9F, -12F, -11F);

		bodyModel[233].addShapeBox(0F, 0F, 1F, 2, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1.75F, -0.75F, 0F); // Box 168
		bodyModel[233].setRotationPoint(-8F, -12F, 9F);

		bodyModel[234].addShapeBox(0F, 0F, 1F, 2, 1, 1, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 168
		bodyModel[234].setRotationPoint(-8F, -12F, -12F);

		bodyModel[235].addShapeBox(0F, 0F, 1F, 4, 1, 3, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Box 167
		bodyModel[235].setRotationPoint(-10F, -12F, -9F);

		bodyModel[236].addShapeBox(0F, 0F, 1F, 4, 1, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1.75F, -0.75F, 0F); // Box 168
		bodyModel[236].setRotationPoint(-10F, -12F, 4F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[237].setRotationPoint(14F, -48F, -6F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[238].setRotationPoint(14F, -48F, 6F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[239].setRotationPoint(14F, -48F, -8F);

		bodyModel[240].addBox(0F, 0F, 0F, 80, 2, 2, 0F); // Du loco part08
		bodyModel[240].setRotationPoint(7F, -32F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 80, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[241].setRotationPoint(7F, -31F, 7F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 80, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[242].setRotationPoint(7F, -32F, 1F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 80, 2, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[243].setRotationPoint(7F, -32F, -7F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 80, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[244].setRotationPoint(7F, -31F, -10F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[245].setRotationPoint(-1F, -10F, 6.05F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[246].setRotationPoint(-1F, -10F, -6.05F);

		bodyModel[247].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[247].setRotationPoint(24F, -6F, -6F);

		bodyModel[248].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 135
		bodyModel[248].setRotationPoint(-5F, -29F, 10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[249].setRotationPoint(0F, -28F, 10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[250].setRotationPoint(1F, -29F, 10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[251].setRotationPoint(2F, -8.5F, 10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[252].setRotationPoint(2F, -10.5F, 10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 135
		bodyModel[253].setRotationPoint(2.5F, -22F, 10F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Du loco part05
		bodyModel[254].setRotationPoint(1.5F, -29F, 10F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[255].setRotationPoint(5.5F, -29F, 10F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 135
		bodyModel[256].setRotationPoint(2.5F, -29F, 10F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[257].setRotationPoint(1.25F, -27F, 10.25F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[258].setRotationPoint(1.25F, -13.5F, 10.25F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 135
		bodyModel[259].setRotationPoint(6F, -29F, 10F);

		bodyModel[260].addBox(0F, 0F, 0F, 57, 14, 1, 0F); // Box 135
		bodyModel[260].setRotationPoint(7F, -22F, 10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[261].setRotationPoint(6.5F, -27F, 10.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[262].setRotationPoint(6.5F, -27F, 10.25F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[263].setRotationPoint(6.5F, -13.5F, 10.25F);

		bodyModel[264].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 135
		bodyModel[264].setRotationPoint(7F, -27F, 10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[265].setRotationPoint(14F, -27F, 10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[266].setRotationPoint(14F, -27F, 10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[267].setRotationPoint(14F, -27F, 10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[268].setRotationPoint(14F, -27F, 10F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[269].setRotationPoint(18F, -25F, 10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[270].setRotationPoint(17F, -27F, 10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[271].setRotationPoint(18F, -27F, 10F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[272].setRotationPoint(18F, -27F, 10F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[273].setRotationPoint(17F, -27F, 10F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[274].setRotationPoint(14F, -23F, 10F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[275].setRotationPoint(14F, -24F, 10F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[276].setRotationPoint(14F, -24F, 10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[277].setRotationPoint(14F, -23F, 10F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[278].setRotationPoint(17F, -23F, 10F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[279].setRotationPoint(18F, -24F, 10F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[280].setRotationPoint(18F, -24F, 10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[281].setRotationPoint(17F, -23F, 10F);

		bodyModel[282].addBox(0F, 0F, 0F, 57, 2, 1, 0F); // Box 135
		bodyModel[282].setRotationPoint(7F, -29F, 10F);

		bodyModel[283].addBox(0F, 0F, 0F, 15, 5, 1, 0F); // Box 135
		bodyModel[283].setRotationPoint(19F, -27F, 10F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[284].setRotationPoint(36F, -23F, 10F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[285].setRotationPoint(36F, -27F, 10F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[286].setRotationPoint(34F, -25F, 10F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[287].setRotationPoint(34F, -27F, 10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[288].setRotationPoint(34F, -27F, 10F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[289].setRotationPoint(34F, -27F, 10F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[290].setRotationPoint(34F, -27F, 10F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[291].setRotationPoint(38F, -25F, 10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[292].setRotationPoint(37F, -27F, 10F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[293].setRotationPoint(38F, -27F, 10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[294].setRotationPoint(38F, -27F, 10F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[295].setRotationPoint(37F, -27F, 10F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[296].setRotationPoint(34F, -23F, 10F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[297].setRotationPoint(34F, -24F, 10F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[298].setRotationPoint(34F, -24F, 10F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[299].setRotationPoint(34F, -23F, 10F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[300].setRotationPoint(37F, -23F, 10F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[301].setRotationPoint(38F, -24F, 10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[302].setRotationPoint(38F, -24F, 10F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[303].setRotationPoint(37F, -23F, 10F);

		bodyModel[304].addBox(0F, 0F, 0F, 16, 5, 1, 0F); // Box 135
		bodyModel[304].setRotationPoint(39F, -27F, 10F);

		bodyModel[305].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 135
		bodyModel[305].setRotationPoint(60F, -27F, 10F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[306].setRotationPoint(57F, -23F, 10F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[307].setRotationPoint(57F, -27F, 10F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[308].setRotationPoint(55F, -25F, 10F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[309].setRotationPoint(55F, -27F, 10F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[310].setRotationPoint(55F, -27F, 10F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[311].setRotationPoint(55F, -27F, 10F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[312].setRotationPoint(55F, -27F, 10F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[313].setRotationPoint(59F, -25F, 10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[314].setRotationPoint(58F, -27F, 10F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[315].setRotationPoint(59F, -27F, 10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[316].setRotationPoint(59F, -27F, 10F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[317].setRotationPoint(58F, -27F, 10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[318].setRotationPoint(55F, -23F, 10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[319].setRotationPoint(55F, -24F, 10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[320].setRotationPoint(55F, -24F, 10F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[321].setRotationPoint(55F, -23F, 10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[322].setRotationPoint(58F, -23F, 10F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[323].setRotationPoint(59F, -24F, 10F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[324].setRotationPoint(59F, -24F, 10F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[325].setRotationPoint(58F, -23F, 10F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[326].setRotationPoint(77F, -23F, 10F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[327].setRotationPoint(77F, -27F, 10F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[328].setRotationPoint(75F, -25F, 10F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[329].setRotationPoint(75F, -27F, 10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[330].setRotationPoint(75F, -27F, 10F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[331].setRotationPoint(75F, -27F, 10F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[332].setRotationPoint(75F, -27F, 10F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[333].setRotationPoint(79F, -25F, 10F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[334].setRotationPoint(78F, -27F, 10F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[335].setRotationPoint(79F, -27F, 10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[336].setRotationPoint(79F, -27F, 10F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[337].setRotationPoint(78F, -27F, 10F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[338].setRotationPoint(75F, -23F, 10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[339].setRotationPoint(75F, -24F, 10F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[340].setRotationPoint(75F, -24F, 10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[341].setRotationPoint(75F, -23F, 10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[342].setRotationPoint(78F, -23F, 10F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[343].setRotationPoint(79F, -24F, 10F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[344].setRotationPoint(79F, -24F, 10F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[345].setRotationPoint(78F, -23F, 10F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[346].setRotationPoint(87.25F, -27F, -11.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[347].setRotationPoint(87F, -29F, -11F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[348].setRotationPoint(88.5F, -22F, -11F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part05
		bodyModel[349].setRotationPoint(87.5F, -29F, -11F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[350].setRotationPoint(91.5F, -29F, -11F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 135
		bodyModel[351].setRotationPoint(88.5F, -29F, -11F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[352].setRotationPoint(87.25F, -27F, -11.25F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[353].setRotationPoint(87.25F, -13F, -11.25F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 135
		bodyModel[354].setRotationPoint(92F, -29F, -11F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[355].setRotationPoint(92.5F, -27F, -11.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[356].setRotationPoint(92.5F, -27F, -11.25F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[357].setRotationPoint(92.5F, -13F, -11.25F);

		bodyModel[358].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 135
		bodyModel[358].setRotationPoint(93F, -22F, -11F);

		bodyModel[359].addBox(0F, 0F, 0F, 15, 5, 1, 0F); // Box 135
		bodyModel[359].setRotationPoint(60F, -27F, -11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[360].setRotationPoint(77F, -23F, -11F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[361].setRotationPoint(77F, -27F, -11F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[362].setRotationPoint(75F, -25F, -11F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[363].setRotationPoint(75F, -27F, -11F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[364].setRotationPoint(75F, -27F, -11F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[365].setRotationPoint(75F, -27F, -11F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[366].setRotationPoint(75F, -27F, -11F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[367].setRotationPoint(79F, -25F, -11F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[368].setRotationPoint(78F, -27F, -11F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[369].setRotationPoint(79F, -27F, -11F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[370].setRotationPoint(79F, -27F, -11F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[371].setRotationPoint(78F, -27F, -11F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[372].setRotationPoint(75F, -23F, -11F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[373].setRotationPoint(75F, -24F, -11F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[374].setRotationPoint(75F, -24F, -11F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[375].setRotationPoint(75F, -23F, -11F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[376].setRotationPoint(78F, -23F, -11F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[377].setRotationPoint(79F, -24F, -11F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[378].setRotationPoint(79F, -24F, -11F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[379].setRotationPoint(78F, -23F, -11F);

		bodyModel[380].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 135
		bodyModel[380].setRotationPoint(80F, -27F, -11F);

		bodyModel[381].addBox(0F, 0F, 0F, 16, 5, 1, 0F); // Box 135
		bodyModel[381].setRotationPoint(39F, -27F, -11F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[382].setRotationPoint(57F, -23F, -11F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[383].setRotationPoint(57F, -27F, -11F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[384].setRotationPoint(55F, -25F, -11F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[385].setRotationPoint(55F, -27F, -11F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[386].setRotationPoint(55F, -27F, -11F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[387].setRotationPoint(55F, -27F, -11F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[388].setRotationPoint(55F, -27F, -11F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[389].setRotationPoint(59F, -25F, -11F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[390].setRotationPoint(58F, -27F, -11F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[391].setRotationPoint(59F, -27F, -11F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[392].setRotationPoint(59F, -27F, -11F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[393].setRotationPoint(58F, -27F, -11F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[394].setRotationPoint(55F, -23F, -11F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[395].setRotationPoint(55F, -24F, -11F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[396].setRotationPoint(55F, -24F, -11F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[397].setRotationPoint(55F, -23F, -11F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[398].setRotationPoint(58F, -23F, -11F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[399].setRotationPoint(59F, -24F, -11F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[400].setRotationPoint(59F, -24F, -11F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[401].setRotationPoint(58F, -23F, -11F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[402].setRotationPoint(36F, -23F, -11F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[403].setRotationPoint(36F, -27F, -11F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[404].setRotationPoint(34F, -25F, -11F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[405].setRotationPoint(34F, -27F, -11F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[406].setRotationPoint(34F, -27F, -11F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[407].setRotationPoint(34F, -27F, -11F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[408].setRotationPoint(34F, -27F, -11F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[409].setRotationPoint(38F, -25F, -11F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[410].setRotationPoint(37F, -27F, -11F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[411].setRotationPoint(38F, -27F, -11F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[412].setRotationPoint(38F, -27F, -11F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[413].setRotationPoint(37F, -27F, -11F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[414].setRotationPoint(34F, -23F, -11F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[415].setRotationPoint(34F, -24F, -11F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[416].setRotationPoint(34F, -24F, -11F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[417].setRotationPoint(34F, -23F, -11F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[418].setRotationPoint(37F, -23F, -11F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[419].setRotationPoint(38F, -24F, -11F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[420].setRotationPoint(38F, -24F, -11F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[421].setRotationPoint(37F, -23F, -11F);

		bodyModel[422].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 135
		bodyModel[422].setRotationPoint(7F, -27F, -11F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[423].setRotationPoint(16F, -23F, -11F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[424].setRotationPoint(16F, -27F, -11F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[425].setRotationPoint(14F, -25F, -11F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[426].setRotationPoint(14F, -27F, -11F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[427].setRotationPoint(14F, -27F, -11F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[428].setRotationPoint(14F, -27F, -11F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[429].setRotationPoint(14F, -27F, -11F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[430].setRotationPoint(18F, -25F, -11F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[431].setRotationPoint(17F, -27F, -11F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[432].setRotationPoint(18F, -27F, -11F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[433].setRotationPoint(18F, -27F, -11F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[434].setRotationPoint(17F, -27F, -11F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[435].setRotationPoint(14F, -23F, -11F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[436].setRotationPoint(14F, -24F, -11F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[437].setRotationPoint(14F, -24F, -11F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[438].setRotationPoint(14F, -23F, -11F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[439].setRotationPoint(17F, -23F, -11F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[440].setRotationPoint(18F, -24F, -11F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[441].setRotationPoint(18F, -24F, -11F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[442].setRotationPoint(17F, -23F, -11F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[443].setRotationPoint(64.25F, -27F, 10.5F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[444].setRotationPoint(64F, -29F, 10F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 5, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 135
		bodyModel[445].setRotationPoint(64.75F, -29F, 10F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[446].setRotationPoint(64.25F, -27F, 10.25F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[447].setRotationPoint(69.5F, -27F, 10.5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[448].setRotationPoint(69.5F, -27F, 10.25F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[449].setRotationPoint(69.5F, -13.5F, 10.25F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 135
		bodyModel[450].setRotationPoint(69F, -29F, 10F);

		bodyModel[451].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 135
		bodyModel[451].setRotationPoint(70F, -27F, 10F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[452].setRotationPoint(44F, -10F, 6.05F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[453].setRotationPoint(44F, -10F, -6.05F);

		bodyModel[454].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[454].setRotationPoint(69F, -6F, -6F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[455].setRotationPoint(67F, -10F, 6.05F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[456].setRotationPoint(67F, -10F, -6.05F);

		bodyModel[457].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[457].setRotationPoint(92F, -6F, -6F);

		bodyModel[458].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[458].setRotationPoint(1F, -12F, 10F);

		bodyModel[459].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[459].setRotationPoint(6F, -12F, 10F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 135
		bodyModel[460].setRotationPoint(2F, -12F, 10F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 135
		bodyModel[461].setRotationPoint(2F, -11.75F, 10F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[462].setRotationPoint(65F, -8.5F, 10F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[463].setRotationPoint(65F, -10.5F, 10F);

		bodyModel[464].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[464].setRotationPoint(64F, -12F, 10F);

		bodyModel[465].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[465].setRotationPoint(69F, -12F, 10F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 135
		bodyModel[466].setRotationPoint(65F, -12F, 10F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 135
		bodyModel[467].setRotationPoint(65F, -11.75F, 10F);

		bodyModel[468].addBox(0F, 0F, 0F, 17, 14, 1, 0F); // Box 135
		bodyModel[468].setRotationPoint(70F, -22F, 10F);

		bodyModel[469].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,-0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 168
		bodyModel[469].setRotationPoint(-10F, -29F, 1F);

		bodyModel[470].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 168
		bodyModel[470].setRotationPoint(-8F, -29F, 7F);

		bodyModel[471].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 168
		bodyModel[471].setRotationPoint(-9F, -29F, 4F);

		bodyModel[472].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 168
		bodyModel[472].setRotationPoint(-10F, -29F, -6F);

		bodyModel[473].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 168
		bodyModel[473].setRotationPoint(-8F, -29F, -11F);

		bodyModel[474].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 168
		bodyModel[474].setRotationPoint(-9F, -29F, -9F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[475].setRotationPoint(87F, -32F, -1F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[476].setRotationPoint(103F, -22F, -1F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[477].setRotationPoint(87F, -31F, 7F);

		bodyModel[478].addShapeBox(0F, 0F, 1F, 2, 10, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 167
		bodyModel[478].setRotationPoint(102F, -22F, -6F);

		bodyModel[479].addShapeBox(0F, 0F, 1F, 2, 10, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[479].setRotationPoint(102F, -22F, 0F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[480].setRotationPoint(87F, -32F, 1F);

		bodyModel[481].addShapeBox(0F, 0F, 1F, 2, 10, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[481].setRotationPoint(100F, -22F, 7F);

		bodyModel[482].addShapeBox(0F, 0F, 1F, 2, 10, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 167
		bodyModel[482].setRotationPoint(100F, -22F, -11F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, -1F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[483].setRotationPoint(101F, -30F, 7F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[484].setRotationPoint(87F, -32F, -7F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[485].setRotationPoint(87F, -31F, -10F);

		bodyModel[486].addShapeBox(0F, 0F, 1F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[486].setRotationPoint(100F, -22F, 9F);

		bodyModel[487].addShapeBox(0F, 0F, 1F, 1, 10, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[487].setRotationPoint(100F, -22F, -12F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[488].setRotationPoint(103F, -29F, -1F);

		bodyModel[489].addShapeBox(0F, 0F, 1F, 2, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[489].setRotationPoint(99F, -29F, 9F);

		bodyModel[490].addShapeBox(0F, 0F, 1F, 2, 7, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[490].setRotationPoint(99F, -29F, -12F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 149
		bodyModel[491].setRotationPoint(103F, -30F, -5F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[492].setRotationPoint(102F, -30F, 1F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,-2F, -1F, 0F, -4F, 1F, -6F, -4F, 1F, -6F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F); // Box 149
		bodyModel[493].setRotationPoint(99F, -31F, -7F);

		bodyModel[494].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[494].setRotationPoint(102F, -30F, 4F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[495].setRotationPoint(101F, -30F, 5F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[496].setRotationPoint(87F, -30F, 10F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[497].setRotationPoint(99F, -30F, 7F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[498].setRotationPoint(99F, -31F, 7F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 149
		bodyModel[499].setRotationPoint(99F, -32F, -7F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 168
		bodyModel[501] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 149
		bodyModel[502] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Box 168
		bodyModel[503] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 168
		bodyModel[504] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 168
		bodyModel[505] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 168
		bodyModel[506] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 168
		bodyModel[507] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 167
		bodyModel[508] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 168
		bodyModel[509] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Du loco part05
		bodyModel[510] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Du loco part05
		bodyModel[511] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Du loco part19
		bodyModel[512] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 167
		bodyModel[513] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 168
		bodyModel[514] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 168
		bodyModel[515] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 167
		bodyModel[516] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 168
		bodyModel[517] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 168
		bodyModel[518] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 167
		bodyModel[519] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 168
		bodyModel[520] = new ModelRendererTurbo(this, 178, 217, textureX, textureY); // Du loco part19
		bodyModel[521] = new ModelRendererTurbo(this, 250, 217, textureX, textureY); // Box 167
		bodyModel[522] = new ModelRendererTurbo(this, 386, 217, textureX, textureY); // Box 168
		bodyModel[523] = new ModelRendererTurbo(this, 210, 217, textureX, textureY); // Box 168
		bodyModel[524] = new ModelRendererTurbo(this, 282, 217, textureX, textureY); // Box 167
		bodyModel[525] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 168
		bodyModel[526] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 168
		bodyModel[527] = new ModelRendererTurbo(this, 450, 217, textureX, textureY); // Box 167
		bodyModel[528] = new ModelRendererTurbo(this, 474, 217, textureX, textureY); // Box 168
		bodyModel[529] = new ModelRendererTurbo(this, 498, 218, textureX, textureY); // Box 168
		bodyModel[530] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 168
		bodyModel[531] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 168
		bodyModel[532] = new ModelRendererTurbo(this, 66, 226, textureX, textureY); // Box 168
		bodyModel[533] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 168
		bodyModel[534] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 168
		bodyModel[535] = new ModelRendererTurbo(this, 317, 225, textureX, textureY); // Box 135
		bodyModel[536] = new ModelRendererTurbo(this, 358, 225, textureX, textureY); // Box 135
		bodyModel[537] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 135
		bodyModel[538] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Box 135
		bodyModel[539] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 135
		bodyModel[540] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 135
		bodyModel[541] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 135
		bodyModel[542] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 135
		bodyModel[543] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 135
		bodyModel[544] = new ModelRendererTurbo(this, 508, 218, textureX, textureY); // Box 135
		bodyModel[545] = new ModelRendererTurbo(this, 508, 218, textureX, textureY); // Box 135
		bodyModel[546] = new ModelRendererTurbo(this, 222, 226, textureX, textureY); // Box 135
		bodyModel[547] = new ModelRendererTurbo(this, 284, 226, textureX, textureY); // Box 135
		bodyModel[548] = new ModelRendererTurbo(this, 508, 218, textureX, textureY); // Box 135
		bodyModel[549] = new ModelRendererTurbo(this, 121, 227, textureX, textureY); // Box 135
		bodyModel[550] = new ModelRendererTurbo(this, 150, 233, textureX, textureY); // Box 135
		bodyModel[551] = new ModelRendererTurbo(this, 510, 4, textureX, textureY); // Box 168
		bodyModel[552] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 0
		bodyModel[553] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Box 0
		bodyModel[554] = new ModelRendererTurbo(this, 234, 233, textureX, textureY); // Box 135
		bodyModel[555] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Box 135
		bodyModel[556] = new ModelRendererTurbo(this, 329, 213, textureX, textureY); // Du loco part28
		bodyModel[557] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Du loco part28
		bodyModel[558] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Box 135
		bodyModel[559] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 135
		bodyModel[560] = new ModelRendererTurbo(this, 329, 213, textureX, textureY); // Du loco part28
		bodyModel[561] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Du loco part28
		bodyModel[562] = new ModelRendererTurbo(this, 329, 213, textureX, textureY); // Du loco part28
		bodyModel[563] = new ModelRendererTurbo(this, 329, 213, textureX, textureY); // Du loco part28
		bodyModel[564] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 135
		bodyModel[565] = new ModelRendererTurbo(this, 329, 213, textureX, textureY); // Du loco part28
		bodyModel[566] = new ModelRendererTurbo(this, 454, 233, textureX, textureY); // Box 135
		bodyModel[567] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 168
		bodyModel[568] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Box 135
		bodyModel[569] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 135
		bodyModel[570] = new ModelRendererTurbo(this, 435, 241, textureX, textureY); // Du loco part05
		bodyModel[571] = new ModelRendererTurbo(this, 459, 241, textureX, textureY); // Du loco part05
		bodyModel[572] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Du loco part05
		bodyModel[573] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Du loco part05
		bodyModel[574] = new ModelRendererTurbo(this, 161, 249, textureX, textureY); // Box 168
		bodyModel[575] = new ModelRendererTurbo(this, 360, 249, textureX, textureY); // Lamp
		bodyModel[576] = new ModelRendererTurbo(this, 400, 249, textureX, textureY); // Lamp
		bodyModel[577] = new ModelRendererTurbo(this, 432, 249, textureX, textureY); // Lamp
		bodyModel[578] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Du loco part37
		bodyModel[579] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Du loco part37
		bodyModel[580] = new ModelRendererTurbo(this, 465, 249, textureX, textureY); // Du loco part37
		bodyModel[581] = new ModelRendererTurbo(this, 481, 249, textureX, textureY); // Du loco part37
		bodyModel[582] = new ModelRendererTurbo(this, 497, 249, textureX, textureY); // Du loco part37
		bodyModel[583] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Du loco part37
		bodyModel[584] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Du loco part37
		bodyModel[585] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Du loco part37
		bodyModel[586] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Du loco part37
		bodyModel[587] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Du loco part37
		bodyModel[588] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Du loco part37
		bodyModel[589] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Du loco part37
		bodyModel[590] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Du loco part37
		bodyModel[591] = new ModelRendererTurbo(this, 409, 257, textureX, textureY); // Du loco part37
		bodyModel[592] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Du loco part37
		bodyModel[593] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Du loco part37
		bodyModel[594] = new ModelRendererTurbo(this, 457, 257, textureX, textureY); // Du loco part37
		bodyModel[595] = new ModelRendererTurbo(this, 459, 257, textureX, textureY); // Du loco part37
		bodyModel[596] = new ModelRendererTurbo(this, 490, 259, textureX, textureY); // Du loco part37
		bodyModel[597] = new ModelRendererTurbo(this, 326, 265, textureX, textureY); // Du loco part06
		bodyModel[598] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Du loco part06
		bodyModel[599] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Du loco part06
		bodyModel[600] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Du loco part06
		bodyModel[601] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[602] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Du loco part06
		bodyModel[603] = new ModelRendererTurbo(this, 297, 273, textureX, textureY); // Du loco part06
		bodyModel[604] = new ModelRendererTurbo(this, 305, 273, textureX, textureY); // Du loco part06
		bodyModel[605] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Du loco part06
		bodyModel[606] = new ModelRendererTurbo(this, 321, 273, textureX, textureY); // Du loco part06
		bodyModel[607] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Du loco part06
		bodyModel[608] = new ModelRendererTurbo(this, 337, 273, textureX, textureY); // Du loco part06
		bodyModel[609] = new ModelRendererTurbo(this, 345, 273, textureX, textureY); // Du loco part06
		bodyModel[610] = new ModelRendererTurbo(this, 353, 273, textureX, textureY); // Du loco part06
		bodyModel[611] = new ModelRendererTurbo(this, 418, 272, textureX, textureY); // Du loco part06
		bodyModel[612] = new ModelRendererTurbo(this, 450, 272, textureX, textureY); // Du loco part06
		bodyModel[613] = new ModelRendererTurbo(this, 121, 289, textureX, textureY); // Du loco part06
		bodyModel[614] = new ModelRendererTurbo(this, 185, 289, textureX, textureY); // Du loco part06
		bodyModel[615] = new ModelRendererTurbo(this, 193, 289, textureX, textureY); // Du loco part06
		bodyModel[616] = new ModelRendererTurbo(this, 201, 289, textureX, textureY); // Du loco part06
		bodyModel[617] = new ModelRendererTurbo(this, 209, 289, textureX, textureY); // Du loco part06
		bodyModel[618] = new ModelRendererTurbo(this, 217, 289, textureX, textureY); // Du loco part06
		bodyModel[619] = new ModelRendererTurbo(this, 225, 289, textureX, textureY); // Du loco part06
		bodyModel[620] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Du loco part06
		bodyModel[621] = new ModelRendererTurbo(this, 150, 297, textureX, textureY); // Du loco part06
		bodyModel[622] = new ModelRendererTurbo(this, 225, 297, textureX, textureY); // Du loco part06
		bodyModel[623] = new ModelRendererTurbo(this, 153, 305, textureX, textureY); // Du loco part06
		bodyModel[624] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Du loco part06
		bodyModel[625] = new ModelRendererTurbo(this, 169, 305, textureX, textureY); // Du loco part06
		bodyModel[626] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Du loco part06
		bodyModel[627] = new ModelRendererTurbo(this, 185, 305, textureX, textureY); // Du loco part06
		bodyModel[628] = new ModelRendererTurbo(this, 193, 305, textureX, textureY); // Du loco part06
		bodyModel[629] = new ModelRendererTurbo(this, 201, 305, textureX, textureY); // Du loco part06
		bodyModel[630] = new ModelRendererTurbo(this, 209, 305, textureX, textureY); // Du loco part06
		bodyModel[631] = new ModelRendererTurbo(this, 273, 305, textureX, textureY); // Du loco part06
		bodyModel[632] = new ModelRendererTurbo(this, 409, 304, textureX, textureY); // Du loco part06
		bodyModel[633] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Du loco part06
		bodyModel[634] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Du loco part06
		bodyModel[635] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Du loco part06
		bodyModel[636] = new ModelRendererTurbo(this, 57, 321, textureX, textureY); // Du loco part06
		bodyModel[637] = new ModelRendererTurbo(this, 81, 321, textureX, textureY); // Du loco part06
		bodyModel[638] = new ModelRendererTurbo(this, 89, 321, textureX, textureY); // Du loco part06
		bodyModel[639] = new ModelRendererTurbo(this, 97, 321, textureX, textureY); // Du loco part06
		bodyModel[640] = new ModelRendererTurbo(this, 105, 321, textureX, textureY); // Du loco part06
		bodyModel[641] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 0
		bodyModel[642] = new ModelRendererTurbo(this, 345, 321, textureX, textureY); // Box 0
		bodyModel[643] = new ModelRendererTurbo(this, 377, 321, textureX, textureY); // Box 0
		bodyModel[644] = new ModelRendererTurbo(this, 409, 321, textureX, textureY); // Box 0
		bodyModel[645] = new ModelRendererTurbo(this, 17, 329, textureX, textureY); // Box 0
		bodyModel[646] = new ModelRendererTurbo(this, 209, 329, textureX, textureY); // Box 0
		bodyModel[647] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Box 0
		bodyModel[648] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 0
		bodyModel[649] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 0
		bodyModel[650] = new ModelRendererTurbo(this, 337, 329, textureX, textureY); // Box 0
		bodyModel[651] = new ModelRendererTurbo(this, 497, 321, textureX, textureY); // Box 0
		bodyModel[652] = new ModelRendererTurbo(this, 505, 321, textureX, textureY); // Box 0
		bodyModel[653] = new ModelRendererTurbo(this, 505, 329, textureX, textureY); // Box 0
		bodyModel[654] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 0
		bodyModel[655] = new ModelRendererTurbo(this, 97, 337, textureX, textureY); // Box 0
		bodyModel[656] = new ModelRendererTurbo(this, 145, 337, textureX, textureY); // Box 0
		bodyModel[657] = new ModelRendererTurbo(this, 177, 337, textureX, textureY); // Du loco part42
		bodyModel[658] = new ModelRendererTurbo(this, 169, 337, textureX, textureY); // Du loco part42
		bodyModel[659] = new ModelRendererTurbo(this, 193, 337, textureX, textureY); // Du loco part42
		bodyModel[660] = new ModelRendererTurbo(this, 217, 337, textureX, textureY); // Du loco part42
		bodyModel[661] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Du loco part42
		bodyModel[662] = new ModelRendererTurbo(this, 241, 337, textureX, textureY); // Du loco part42
		bodyModel[663] = new ModelRendererTurbo(this, 289, 337, textureX, textureY); // Du loco part42
		bodyModel[664] = new ModelRendererTurbo(this, 257, 337, textureX, textureY); // Du loco part42
		bodyModel[665] = new ModelRendererTurbo(this, 281, 337, textureX, textureY); // Du loco part42
		bodyModel[666] = new ModelRendererTurbo(this, 305, 337, textureX, textureY); // Du loco part42
		bodyModel[667] = new ModelRendererTurbo(this, 329, 337, textureX, textureY); // Du loco part42
		bodyModel[668] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 168
		bodyModel[669] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 168
		bodyModel[670] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 168
		bodyModel[671] = new ModelRendererTurbo(this, 1, 367, textureX, textureY); // Box 168
		bodyModel[672] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 168
		bodyModel[673] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 168
		bodyModel[674] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 168
		bodyModel[675] = new ModelRendererTurbo(this, 1, 361, textureX, textureY); // Box 168
		bodyModel[676] = new ModelRendererTurbo(this, 1, 367, textureX, textureY); // Box 168
		bodyModel[677] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 168
		bodyModel[678] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[679] = new ModelRendererTurbo(this, 20, 373, textureX, textureY); // Lamp
		bodyModel[680] = new ModelRendererTurbo(this, 43, 373, textureX, textureY); // Lamp
		bodyModel[681] = new ModelRendererTurbo(this, 1, 373, textureX, textureY); // Lamp
		bodyModel[682] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Lamp
		bodyModel[683] = new ModelRendererTurbo(this, 337, 353, textureX, textureY); // Lamp
		bodyModel[684] = new ModelRendererTurbo(this, 457, 361, textureX, textureY); // Lamp
		bodyModel[685] = new ModelRendererTurbo(this, 169, 369, textureX, textureY); // Lamp
		bodyModel[686] = new ModelRendererTurbo(this, 249, 385, textureX, textureY); // Lamp
		bodyModel[687] = new ModelRendererTurbo(this, 257, 385, textureX, textureY); // Lamp
		bodyModel[688] = new ModelRendererTurbo(this, 265, 385, textureX, textureY); // Lamp
		bodyModel[689] = new ModelRendererTurbo(this, 273, 385, textureX, textureY); // Lamp
		bodyModel[690] = new ModelRendererTurbo(this, 281, 385, textureX, textureY); // Lamp
		bodyModel[691] = new ModelRendererTurbo(this, 20, 382, textureX, textureY); // Lamp
		bodyModel[692] = new ModelRendererTurbo(this, 1, 382, textureX, textureY); // Lamp
		bodyModel[693] = new ModelRendererTurbo(this, 43, 382, textureX, textureY); // Lamp
		bodyModel[694] = new ModelRendererTurbo(this, 305, 385, textureX, textureY); // Lamp
		bodyModel[695] = new ModelRendererTurbo(this, 329, 385, textureX, textureY); // Lamp
		bodyModel[696] = new ModelRendererTurbo(this, 337, 385, textureX, textureY); // Lamp
		bodyModel[697] = new ModelRendererTurbo(this, 345, 385, textureX, textureY); // Lamp
		bodyModel[698] = new ModelRendererTurbo(this, 353, 385, textureX, textureY); // Lamp
		bodyModel[699] = new ModelRendererTurbo(this, 361, 385, textureX, textureY); // Lamp
		bodyModel[700] = new ModelRendererTurbo(this, 369, 385, textureX, textureY); // Lamp
		bodyModel[701] = new ModelRendererTurbo(this, 377, 385, textureX, textureY); // Lamp
		bodyModel[702] = new ModelRendererTurbo(this, 385, 385, textureX, textureY); // Lamp
		bodyModel[703] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Du loco part37
		bodyModel[704] = new ModelRendererTurbo(this, 409, 385, textureX, textureY); // Du loco part37
		bodyModel[705] = new ModelRendererTurbo(this, 417, 385, textureX, textureY); // Du loco part37
		bodyModel[706] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Du loco part37
		bodyModel[707] = new ModelRendererTurbo(this, 425, 385, textureX, textureY); // Du loco part37
		bodyModel[708] = new ModelRendererTurbo(this, 433, 385, textureX, textureY); // Du loco part37
		bodyModel[709] = new ModelRendererTurbo(this, 9, 281, textureX, textureY); // Du loco part28
		bodyModel[710] = new ModelRendererTurbo(this, 113, 393, textureX, textureY); // Du loco part28
		bodyModel[711] = new ModelRendererTurbo(this, 114, 394, textureX, textureY); // Du loco part28
		bodyModel[712] = new ModelRendererTurbo(this, 137, 393, textureX, textureY); // Du loco part28
		bodyModel[713] = new ModelRendererTurbo(this, 116, 396, textureX, textureY); // Du loco part28
		bodyModel[714] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Du loco part28
		bodyModel[715] = new ModelRendererTurbo(this, 185, 393, textureX, textureY); // Du loco part28
		bodyModel[716] = new ModelRendererTurbo(this, 193, 393, textureX, textureY); // Du loco part28
		bodyModel[717] = new ModelRendererTurbo(this, 201, 393, textureX, textureY); // Du loco part28
		bodyModel[718] = new ModelRendererTurbo(this, 217, 393, textureX, textureY); // Du loco part28
		bodyModel[719] = new ModelRendererTurbo(this, 228, 393, textureX, textureY); // Du loco part28
		bodyModel[720] = new ModelRendererTurbo(this, 228, 393, textureX, textureY); // Du loco part28
		bodyModel[721] = new ModelRendererTurbo(this, 227, 400, textureX, textureY); // Du loco part28
		bodyModel[722] = new ModelRendererTurbo(this, 227, 400, textureX, textureY); // Du loco part28
		bodyModel[723] = new ModelRendererTurbo(this, 228, 393, textureX, textureY); // Du loco part28
		bodyModel[724] = new ModelRendererTurbo(this, 228, 393, textureX, textureY); // Du loco part28
		bodyModel[725] = new ModelRendererTurbo(this, 227, 400, textureX, textureY); // Du loco part28
		bodyModel[726] = new ModelRendererTurbo(this, 227, 400, textureX, textureY); // Du loco part28
		bodyModel[727] = new ModelRendererTurbo(this, 329, 393, textureX, textureY); // Du loco part28
		bodyModel[728] = new ModelRendererTurbo(this, 337, 393, textureX, textureY); // Du loco part28
		bodyModel[729] = new ModelRendererTurbo(this, 345, 393, textureX, textureY); // Du loco part28
		bodyModel[730] = new ModelRendererTurbo(this, 361, 393, textureX, textureY); // Du loco part28
		bodyModel[731] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[732] = new ModelRendererTurbo(this, 257, 483, textureX, textureY); // Du loco part28
		bodyModel[733] = new ModelRendererTurbo(this, 257, 465, textureX, textureY); // Du loco part28
		bodyModel[734] = new ModelRendererTurbo(this, 257, 447, textureX, textureY); // Du loco part28
		bodyModel[735] = new ModelRendererTurbo(this, 257, 480, textureX, textureY); // Du loco part28
		bodyModel[736] = new ModelRendererTurbo(this, 257, 462, textureX, textureY); // Du loco part28
		bodyModel[737] = new ModelRendererTurbo(this, 257, 444, textureX, textureY); // Du loco part28
		bodyModel[738] = new ModelRendererTurbo(this, 1, 418, textureX, textureY); // Du loco part28
		bodyModel[739] = new ModelRendererTurbo(this, 1, 427, textureX, textureY); // Du loco part28
		bodyModel[740] = new ModelRendererTurbo(this, 1, 436, textureX, textureY); // Du loco part28
		bodyModel[741] = new ModelRendererTurbo(this, 116, 418, textureX, textureY); // Du loco part28
		bodyModel[742] = new ModelRendererTurbo(this, 116, 427, textureX, textureY); // Du loco part28
		bodyModel[743] = new ModelRendererTurbo(this, 116, 436, textureX, textureY); // Du loco part28
		bodyModel[744] = new ModelRendererTurbo(this, 350, 409, textureX, textureY); // Box 135
		bodyModel[745] = new ModelRendererTurbo(this, 468, 60, textureX, textureY); // Du loco part28
		bodyModel[746] = new ModelRendererTurbo(this, 475, 60, textureX, textureY); // Du loco part28
		bodyModel[747] = new ModelRendererTurbo(this, 490, 66, textureX, textureY); // Du loco part28
		bodyModel[748] = new ModelRendererTurbo(this, 495, 66, textureX, textureY); // Du loco part28
		bodyModel[749] = new ModelRendererTurbo(this, 468, 60, textureX, textureY); // Du loco part28
		bodyModel[750] = new ModelRendererTurbo(this, 475, 60, textureX, textureY); // Du loco part28
		bodyModel[751] = new ModelRendererTurbo(this, 490, 66, textureX, textureY); // Du loco part28
		bodyModel[752] = new ModelRendererTurbo(this, 495, 66, textureX, textureY); // Du loco part28
		bodyModel[753] = new ModelRendererTurbo(this, 440, 35, textureX, textureY); // Du loco part28
		bodyModel[754] = new ModelRendererTurbo(this, 447, 35, textureX, textureY); // Du loco part28
		bodyModel[755] = new ModelRendererTurbo(this, 460, 34, textureX, textureY); // Du loco part28
		bodyModel[756] = new ModelRendererTurbo(this, 466, 34, textureX, textureY); // Du loco part28
		bodyModel[757] = new ModelRendererTurbo(this, 440, 35, textureX, textureY); // Du loco part28
		bodyModel[758] = new ModelRendererTurbo(this, 447, 35, textureX, textureY); // Du loco part28
		bodyModel[759] = new ModelRendererTurbo(this, 460, 34, textureX, textureY); // Du loco part28
		bodyModel[760] = new ModelRendererTurbo(this, 466, 34, textureX, textureY); // Du loco part28
		bodyModel[761] = new ModelRendererTurbo(this, 434, 22, textureX, textureY); // Du loco part28
		bodyModel[762] = new ModelRendererTurbo(this, 441, 22, textureX, textureY); // Du loco part28
		bodyModel[763] = new ModelRendererTurbo(this, 435, 14, textureX, textureY); // Du loco part28
		bodyModel[764] = new ModelRendererTurbo(this, 459, 15, textureX, textureY); // Du loco part28
		bodyModel[765] = new ModelRendererTurbo(this, 434, 22, textureX, textureY); // Du loco part28
		bodyModel[766] = new ModelRendererTurbo(this, 441, 22, textureX, textureY); // Du loco part28
		bodyModel[767] = new ModelRendererTurbo(this, 435, 14, textureX, textureY); // Du loco part28
		bodyModel[768] = new ModelRendererTurbo(this, 434, 8, textureX, textureY); // Du loco part28
		bodyModel[769] = new ModelRendererTurbo(this, 448, 22, textureX, textureY); // Du loco part28
		bodyModel[770] = new ModelRendererTurbo(this, 455, 22, textureX, textureY); // Du loco part28
		bodyModel[771] = new ModelRendererTurbo(this, 447, 14, textureX, textureY); // Du loco part28
		bodyModel[772] = new ModelRendererTurbo(this, 440, 15, textureX, textureY); // Du loco part28
		bodyModel[773] = new ModelRendererTurbo(this, 448, 22, textureX, textureY); // Du loco part28
		bodyModel[774] = new ModelRendererTurbo(this, 455, 22, textureX, textureY); // Du loco part28
		bodyModel[775] = new ModelRendererTurbo(this, 447, 14, textureX, textureY); // Du loco part28
		bodyModel[776] = new ModelRendererTurbo(this, 452, 15, textureX, textureY); // Du loco part28
		bodyModel[777] = new ModelRendererTurbo(this, 25, 10, textureX, textureY); // Box 149
		bodyModel[778] = new ModelRendererTurbo(this, 34, 8, textureX, textureY); // Box 149
		bodyModel[779] = new ModelRendererTurbo(this, 25, 8, textureX, textureY); // Box 149
		bodyModel[780] = new ModelRendererTurbo(this, 27, 7, textureX, textureY); // Box 149
		bodyModel[781] = new ModelRendererTurbo(this, 33, 6, textureX, textureY); // Box 149
		bodyModel[782] = new ModelRendererTurbo(this, 46, 5, textureX, textureY); // Box 149
		bodyModel[783] = new ModelRendererTurbo(this, 34, 7, textureX, textureY); // Box 149
		bodyModel[784] = new ModelRendererTurbo(this, 39, 7, textureX, textureY); // Box 149
		bodyModel[785] = new ModelRendererTurbo(this, 43, 15, textureX, textureY); // Box 149
		bodyModel[786] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 149
		bodyModel[787] = new ModelRendererTurbo(this, 51, 7, textureX, textureY); // Box 149
		bodyModel[788] = new ModelRendererTurbo(this, 47, 10, textureX, textureY); // Box 149
		bodyModel[789] = new ModelRendererTurbo(this, 45, 11, textureX, textureY); // Box 149
		bodyModel[790] = new ModelRendererTurbo(this, 47, 9, textureX, textureY); // Box 149
		bodyModel[791] = new ModelRendererTurbo(this, 31, 13, textureX, textureY); // Box 149
		bodyModel[792] = new ModelRendererTurbo(this, 44, 13, textureX, textureY); // Box 149
		bodyModel[793] = new ModelRendererTurbo(this, 47, 7, textureX, textureY); // Box 149
		bodyModel[794] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Box 149
		bodyModel[795] = new ModelRendererTurbo(this, 41, 10, textureX, textureY); // Box 149
		bodyModel[796] = new ModelRendererTurbo(this, 47, 6, textureX, textureY); // Box 149
		bodyModel[797] = new ModelRendererTurbo(this, 43, 9, textureX, textureY); // Box 149
		bodyModel[798] = new ModelRendererTurbo(this, 44, 12, textureX, textureY); // Box 149
		bodyModel[799] = new ModelRendererTurbo(this, 47, 14, textureX, textureY); // Box 149
		bodyModel[800] = new ModelRendererTurbo(this, 39, 16, textureX, textureY); // Box 149
		bodyModel[801] = new ModelRendererTurbo(this, 38, 14, textureX, textureY); // Box 149
		bodyModel[802] = new ModelRendererTurbo(this, 36, 9, textureX, textureY); // Box 149
		bodyModel[803] = new ModelRendererTurbo(this, 36, 15, textureX, textureY); // Box 149
		bodyModel[804] = new ModelRendererTurbo(this, 40, 8, textureX, textureY); // Box 149
		bodyModel[805] = new ModelRendererTurbo(this, 71, 4, textureX, textureY); // Box 149
		bodyModel[806] = new ModelRendererTurbo(this, 40, 7, textureX, textureY); // Box 149
		bodyModel[807] = new ModelRendererTurbo(this, 46, 8, textureX, textureY); // Box 149
		bodyModel[808] = new ModelRendererTurbo(this, 47, 6, textureX, textureY); // Box 149
		bodyModel[809] = new ModelRendererTurbo(this, 46, 13, textureX, textureY); // Box 149
		bodyModel[810] = new ModelRendererTurbo(this, 41, 13, textureX, textureY); // Box 149
		bodyModel[811] = new ModelRendererTurbo(this, 71, 4, textureX, textureY); // Box 149
		bodyModel[812] = new ModelRendererTurbo(this, 71, 4, textureX, textureY); // Box 149
		bodyModel[813] = new ModelRendererTurbo(this, 71, 4, textureX, textureY); // Box 149
		bodyModel[814] = new ModelRendererTurbo(this, 45, 6, textureX, textureY); // Box 149
		bodyModel[815] = new ModelRendererTurbo(this, 43, 7, textureX, textureY); // Box 149
		bodyModel[816] = new ModelRendererTurbo(this, 50, 13, textureX, textureY); // Box 149
		bodyModel[817] = new ModelRendererTurbo(this, 52, 18, textureX, textureY); // Box 149
		bodyModel[818] = new ModelRendererTurbo(this, 48, 12, textureX, textureY); // Box 149
		bodyModel[819] = new ModelRendererTurbo(this, 48, 16, textureX, textureY); // Box 149
		bodyModel[820] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 149
		bodyModel[821] = new ModelRendererTurbo(this, 45, 10, textureX, textureY); // Box 149
		bodyModel[822] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Box 149
		bodyModel[823] = new ModelRendererTurbo(this, 46, 14, textureX, textureY); // Box 149
		bodyModel[824] = new ModelRendererTurbo(this, 49, 15, textureX, textureY); // Box 149
		bodyModel[825] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Du loco part100
		bodyModel[826] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Du loco part102
		bodyModel[827] = new ModelRendererTurbo(this, 121, 11, textureX, textureY); // Du loco part82
		bodyModel[828] = new ModelRendererTurbo(this, 104, 17, textureX, textureY); // Du loco part82
		bodyModel[829] = new ModelRendererTurbo(this, 126, 4, textureX, textureY); // Du loco part82
		bodyModel[830] = new ModelRendererTurbo(this, 74, 12, textureX, textureY); // Du loco part82
		bodyModel[831] = new ModelRendererTurbo(this, 90, 12, textureX, textureY); // Du loco part82
		bodyModel[832] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[833] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[834] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[835] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[836] = new ModelRendererTurbo(this, 152, 1, textureX, textureY); // Du loco part82
		bodyModel[837] = new ModelRendererTurbo(this, 135, 5, textureX, textureY); // Du loco part82
		bodyModel[838] = new ModelRendererTurbo(this, 112, 9, textureX, textureY); // Du loco part82
		bodyModel[839] = new ModelRendererTurbo(this, 79, 18, textureX, textureY); // Du loco part82
		bodyModel[840] = new ModelRendererTurbo(this, 136, 22, textureX, textureY); // Du loco part82
		bodyModel[841] = new ModelRendererTurbo(this, 100, 29, textureX, textureY); // Du loco part82
		bodyModel[842] = new ModelRendererTurbo(this, 152, 1, textureX, textureY); // Du loco part82
		bodyModel[843] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[844] = new ModelRendererTurbo(this, 142, 5, textureX, textureY); // Du loco part82
		bodyModel[845] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Du loco part83
		bodyModel[846] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Du loco part84
		bodyModel[847] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Du loco part85
		bodyModel[848] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Du loco part94
		bodyModel[849] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Du loco part95
		bodyModel[850] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Du loco part97
		bodyModel[851] = new ModelRendererTurbo(this, 87, 2, textureX, textureY); // Du loco part100
		bodyModel[852] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Du loco part101
		bodyModel[853] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 177
		bodyModel[854] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 194
		bodyModel[855] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 195
		bodyModel[856] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Du loco part100
		bodyModel[857] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Du loco part102
		bodyModel[858] = new ModelRendererTurbo(this, 119, 30, textureX, textureY); // Du loco part82
		bodyModel[859] = new ModelRendererTurbo(this, 119, 19, textureX, textureY); // Du loco part82
		bodyModel[860] = new ModelRendererTurbo(this, 158, 15, textureX, textureY); // Du loco part82
		bodyModel[861] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Du loco part83
		bodyModel[862] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Du loco part84
		bodyModel[863] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Du loco part85
		bodyModel[864] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Du loco part94
		bodyModel[865] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Du loco part95
		bodyModel[866] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Du loco part97
		bodyModel[867] = new ModelRendererTurbo(this, 99, 2, textureX, textureY); // Du loco part100
		bodyModel[868] = new ModelRendererTurbo(this, 392, 6, textureX, textureY); // Du loco part101
		bodyModel[869] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 177
		bodyModel[870] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 194
		bodyModel[871] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 195
		bodyModel[872] = new ModelRendererTurbo(this, 87, 24, textureX, textureY); // Du loco part100
		bodyModel[873] = new ModelRendererTurbo(this, 397, 6, textureX, textureY); // Du loco part102
		bodyModel[874] = new ModelRendererTurbo(this, 121, 11, textureX, textureY); // Du loco part82
		bodyModel[875] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Du loco part82
		bodyModel[876] = new ModelRendererTurbo(this, 74, 12, textureX, textureY); // Du loco part82
		bodyModel[877] = new ModelRendererTurbo(this, 90, 12, textureX, textureY); // Du loco part82
		bodyModel[878] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[879] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[880] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[881] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[882] = new ModelRendererTurbo(this, 152, 1, textureX, textureY); // Du loco part82
		bodyModel[883] = new ModelRendererTurbo(this, 135, 5, textureX, textureY); // Du loco part82
		bodyModel[884] = new ModelRendererTurbo(this, 112, 9, textureX, textureY); // Du loco part82
		bodyModel[885] = new ModelRendererTurbo(this, 70, 18, textureX, textureY); // Du loco part82
		bodyModel[886] = new ModelRendererTurbo(this, 178, 17, textureX, textureY); // Du loco part82
		bodyModel[887] = new ModelRendererTurbo(this, 194, 3, textureX, textureY); // Du loco part82
		bodyModel[888] = new ModelRendererTurbo(this, 152, 1, textureX, textureY); // Du loco part82
		bodyModel[889] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Du loco part83
		bodyModel[890] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Du loco part84
		bodyModel[891] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Du loco part85
		bodyModel[892] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Du loco part94
		bodyModel[893] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Du loco part95
		bodyModel[894] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Du loco part97
		bodyModel[895] = new ModelRendererTurbo(this, 99, 2, textureX, textureY); // Du loco part100
		bodyModel[896] = new ModelRendererTurbo(this, 392, 6, textureX, textureY); // Du loco part101
		bodyModel[897] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 194
		bodyModel[898] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 195
		bodyModel[899] = new ModelRendererTurbo(this, 87, 24, textureX, textureY); // Du loco part100
		bodyModel[900] = new ModelRendererTurbo(this, 397, 6, textureX, textureY); // Du loco part102
		bodyModel[901] = new ModelRendererTurbo(this, 158, 4, textureX, textureY); // Du loco part82
		bodyModel[902] = new ModelRendererTurbo(this, 176, 4, textureX, textureY); // Du loco part82
		bodyModel[903] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 177
		bodyModel[904] = new ModelRendererTurbo(this, 126, 4, textureX, textureY); // Du loco part82
		bodyModel[905] = new ModelRendererTurbo(this, 1, 451, textureX, textureY); // Du loco part08
		bodyModel[906] = new ModelRendererTurbo(this, 17, 457, textureX, textureY); // Du loco part08
		bodyModel[907] = new ModelRendererTurbo(this, 22, 461, textureX, textureY); // Du loco part08
		bodyModel[908] = new ModelRendererTurbo(this, 24, 459, textureX, textureY); // Du loco part08
		bodyModel[909] = new ModelRendererTurbo(this, 1, 451, textureX, textureY); // Du loco part08
		bodyModel[910] = new ModelRendererTurbo(this, 17, 457, textureX, textureY); // Du loco part08
		bodyModel[911] = new ModelRendererTurbo(this, 22, 461, textureX, textureY); // Du loco part08
		bodyModel[912] = new ModelRendererTurbo(this, 24, 459, textureX, textureY); // Du loco part08
		bodyModel[913] = new ModelRendererTurbo(this, 455, 404, textureX, textureY); // Du loco part82
		bodyModel[914] = new ModelRendererTurbo(this, 404, 444, textureX, textureY); // Du loco part82
		bodyModel[915] = new ModelRendererTurbo(this, 454, 444, textureX, textureY); // Du loco part82
		bodyModel[916] = new ModelRendererTurbo(this, 491, 444, textureX, textureY); // Du loco part82
		bodyModel[917] = new ModelRendererTurbo(this, 326, 505, textureX, textureY); // Du loco part19
		bodyModel[918] = new ModelRendererTurbo(this, 457, 505, textureX, textureY); // Du loco part19
		bodyModel[919] = new ModelRendererTurbo(this, 326, 634, textureX, textureY); // Du loco part19
		bodyModel[920] = new ModelRendererTurbo(this, 455, 634, textureX, textureY); // Du loco part19
		bodyModel[921] = new ModelRendererTurbo(this, 497, 321, textureX, textureY); // Box 0
		bodyModel[922] = new ModelRendererTurbo(this, 505, 321, textureX, textureY); // Box 0
		bodyModel[923] = new ModelRendererTurbo(this, 505, 329, textureX, textureY); // Box 0
		bodyModel[924] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 0
		bodyModel[925] = new ModelRendererTurbo(this, 97, 337, textureX, textureY); // Box 0
		bodyModel[926] = new ModelRendererTurbo(this, 145, 337, textureX, textureY); // Box 0
		bodyModel[927] = new ModelRendererTurbo(this, 713, 634, textureX, textureY); // Du loco part19
		bodyModel[928] = new ModelRendererTurbo(this, 584, 634, textureX, textureY); // Du loco part19
		bodyModel[929] = new ModelRendererTurbo(this, 66, 210, textureX, textureY); // Du loco part19
		bodyModel[930] = new ModelRendererTurbo(this, 97, 210, textureX, textureY); // Du loco part19
		bodyModel[931] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Du loco part05
		bodyModel[932] = new ModelRendererTurbo(this, 50, 210, textureX, textureY); // Du loco part05
		bodyModel[933] = new ModelRendererTurbo(this, 482, 210, textureX, textureY); // Du loco part05
		bodyModel[934] = new ModelRendererTurbo(this, 66, 210, textureX, textureY); // Du loco part19
		bodyModel[935] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Du loco part05
		bodyModel[936] = new ModelRendererTurbo(this, 450, 210, textureX, textureY); // Du loco part05
		bodyModel[937] = new ModelRendererTurbo(this, 2, 218, textureX, textureY); // Du loco part05
		bodyModel[938] = new ModelRendererTurbo(this, 97, 210, textureX, textureY); // Du loco part19
		bodyModel[939] = new ModelRendererTurbo(this, 424, 427, textureX, textureY); // Du loco part05
		bodyModel[940] = new ModelRendererTurbo(this, 424, 430, textureX, textureY); // Du loco part05
		bodyModel[941] = new ModelRendererTurbo(this, 424, 419, textureX, textureY); // Du loco part05
		bodyModel[942] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Du loco part05
		bodyModel[943] = new ModelRendererTurbo(this, 55, 373, textureX, textureY); // Box 168
		bodyModel[944] = new ModelRendererTurbo(this, 55, 373, textureX, textureY); // Box 168
		bodyModel[945] = new ModelRendererTurbo(this, 55, 373, textureX, textureY); // Box 168
		bodyModel[946] = new ModelRendererTurbo(this, 55, 373, textureX, textureY); // Box 168
		bodyModel[947] = new ModelRendererTurbo(this, 55, 373, textureX, textureY); // Box 168
		bodyModel[948] = new ModelRendererTurbo(this, 55, 373, textureX, textureY); // Box 168
		bodyModel[949] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[950] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[951] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[952] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[953] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[954] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[955] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[956] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[957] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[958] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[959] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[960] = new ModelRendererTurbo(this, 115, 395, textureX, textureY); // Du loco part28
		bodyModel[961] = new ModelRendererTurbo(this, 117, 397, textureX, textureY); // Du loco part28
		bodyModel[962] = new ModelRendererTurbo(this, 374, 446, textureX, textureY); // Box 135
		bodyModel[963] = new ModelRendererTurbo(this, 370, 477, textureX, textureY); // Du loco part05
		bodyModel[964] = new ModelRendererTurbo(this, 370, 477, textureX, textureY); // Du loco part05
		bodyModel[965] = new ModelRendererTurbo(this, 372, 480, textureX, textureY); // Du loco part05
		bodyModel[966] = new ModelRendererTurbo(this, 144, 99, textureX, textureY); // Box 135
		bodyModel[967] = new ModelRendererTurbo(this, 383, 462, textureX, textureY); // Box 135
		bodyModel[968] = new ModelRendererTurbo(this, 383, 462, textureX, textureY); // Box 135
		bodyModel[969] = new ModelRendererTurbo(this, 374, 462, textureX, textureY); // Box 135
		bodyModel[970] = new ModelRendererTurbo(this, 383, 462, textureX, textureY); // Du loco part05
		bodyModel[971] = new ModelRendererTurbo(this, 383, 462, textureX, textureY); // Du loco part05
		bodyModel[972] = new ModelRendererTurbo(this, 374, 474, textureX, textureY); // Box 135
		bodyModel[973] = new ModelRendererTurbo(this, 383, 462, textureX, textureY); // Box 135
		bodyModel[974] = new ModelRendererTurbo(this, 407, 411, textureX, textureY); // Box 135
		bodyModel[975] = new ModelRendererTurbo(this, 407, 433, textureX, textureY); // Box 135
		bodyModel[976] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Box 135
		bodyModel[977] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Box 135
		bodyModel[978] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 135
		bodyModel[979] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Box 135
		bodyModel[980] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 135
		bodyModel[981] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Box 135
		bodyModel[982] = new ModelRendererTurbo(this, 377, 411, textureX, textureY); // Box 135
		bodyModel[983] = new ModelRendererTurbo(this, 377, 423, textureX, textureY); // Box 135
		bodyModel[984] = new ModelRendererTurbo(this, 515, 225, textureX, textureY); // Du loco part28
		bodyModel[985] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Du loco part28
		bodyModel[986] = new ModelRendererTurbo(this, 329, 213, textureX, textureY); // Du loco part28
		bodyModel[987] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Du loco part28
		bodyModel[988] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Du loco part28
		bodyModel[989] = new ModelRendererTurbo(this, 510, 225, textureX, textureY); // Du loco part28
		bodyModel[990] = new ModelRendererTurbo(this, 515, 225, textureX, textureY); // Du loco part28
		bodyModel[991] = new ModelRendererTurbo(this, 510, 225, textureX, textureY); // Du loco part28
		bodyModel[992] = new ModelRendererTurbo(this, 323, 213, textureX, textureY); // Du loco part28
		bodyModel[993] = new ModelRendererTurbo(this, 323, 213, textureX, textureY); // Du loco part28
		bodyModel[994] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[995] = new ModelRendererTurbo(this, 55, 373, textureX, textureY); // Box 168
		bodyModel[996] = new ModelRendererTurbo(this, 55, 373, textureX, textureY); // Box 168
		bodyModel[997] = new ModelRendererTurbo(this, 55, 373, textureX, textureY); // Box 168
		bodyModel[998] = new ModelRendererTurbo(this, 55, 373, textureX, textureY); // Box 168
		bodyModel[999] = new ModelRendererTurbo(this, 55, 373, textureX, textureY); // Box 168

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 168
		bodyModel[500].setRotationPoint(101F, -30F, -10F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[501].setRotationPoint(102F, -30F, -5F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[502].setRotationPoint(102F, -30F, -8F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[503].setRotationPoint(101F, -30F, -8F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[504].setRotationPoint(87F, -30F, -11F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[505].setRotationPoint(99F, -30F, -10F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[506].setRotationPoint(99F, -31F, -10F);

		bodyModel[507].addShapeBox(0F, 0F, 1F, 2, 10, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 167
		bodyModel[507].setRotationPoint(101F, -22F, -9F);

		bodyModel[508].addShapeBox(0F, 0F, 1F, 2, 10, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[508].setRotationPoint(101F, -22F, 4F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[509].setRotationPoint(101F, -23.5F, -8F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[510].setRotationPoint(101F, -28.5F, -8F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[511].setRotationPoint(100F, -11F, -1F);

		bodyModel[512].addShapeBox(0F, 0F, 1F, 4, 4, 4, 0F,0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[512].setRotationPoint(100F, -11F, -6F);

		bodyModel[513].addShapeBox(0F, 0F, 1F, 4, 4, 4, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[513].setRotationPoint(100F, -11F, 0F);

		bodyModel[514].addShapeBox(0F, 0F, 1F, 2, 4, 2, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[514].setRotationPoint(100F, -11F, 7F);

		bodyModel[515].addShapeBox(0F, 0F, 1F, 2, 4, 2, 0F,0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[515].setRotationPoint(100F, -11F, -11F);

		bodyModel[516].addShapeBox(0F, 0F, 1F, 1, 4, 1, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F); // Box 168
		bodyModel[516].setRotationPoint(100F, -11F, 9F);

		bodyModel[517].addShapeBox(0F, 0F, 1F, 1, 4, 1, 0F,0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[517].setRotationPoint(100F, -11F, -12F);

		bodyModel[518].addShapeBox(0F, 0F, 1F, 3, 4, 3, 0F,0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[518].setRotationPoint(100F, -11F, -9F);

		bodyModel[519].addShapeBox(0F, 0F, 1F, 3, 4, 3, 0F,0F, 0.75F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[519].setRotationPoint(100F, -11F, 4F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part19
		bodyModel[520].setRotationPoint(100F, -12F, -1F);

		bodyModel[521].addShapeBox(0F, 0F, 1F, 5, 1, 4, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 167
		bodyModel[521].setRotationPoint(100F, -12F, -6F);

		bodyModel[522].addShapeBox(0F, 0F, 1F, 5, 1, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -1.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 168
		bodyModel[522].setRotationPoint(100F, -12F, 0F);

		bodyModel[523].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -1.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 168
		bodyModel[523].setRotationPoint(100F, -12F, 7F);

		bodyModel[524].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 167
		bodyModel[524].setRotationPoint(100F, -12F, -11F);

		bodyModel[525].addShapeBox(0F, 0F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -1.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 168
		bodyModel[525].setRotationPoint(100F, -12F, 9F);

		bodyModel[526].addShapeBox(0F, 0F, 1F, 2, 1, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 168
		bodyModel[526].setRotationPoint(100F, -12F, -12F);

		bodyModel[527].addShapeBox(0F, 0F, 1F, 4, 1, 3, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 167
		bodyModel[527].setRotationPoint(100F, -12F, -9F);

		bodyModel[528].addShapeBox(0F, 0F, 1F, 4, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -1.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 168
		bodyModel[528].setRotationPoint(100F, -12F, 4F);

		bodyModel[529].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,-0.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 168
		bodyModel[529].setRotationPoint(102F, -29F, 1F);

		bodyModel[530].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 168
		bodyModel[530].setRotationPoint(100F, -29F, 7F);

		bodyModel[531].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 168
		bodyModel[531].setRotationPoint(101F, -29F, 4F);

		bodyModel[532].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 168
		bodyModel[532].setRotationPoint(102F, -29F, -6F);

		bodyModel[533].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 168
		bodyModel[533].setRotationPoint(100F, -29F, -11F);

		bodyModel[534].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 168
		bodyModel[534].setRotationPoint(101F, -29F, -9F);

		bodyModel[535].addBox(0F, 0F, 0F, 7, 5, 1, 0F); // Box 135
		bodyModel[535].setRotationPoint(80F, -27F, 10F);

		bodyModel[536].addBox(0F, 0F, 0F, 17, 2, 1, 0F); // Box 135
		bodyModel[536].setRotationPoint(70F, -29F, 10F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[537].setRotationPoint(88F, -8.5F, -11F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[538].setRotationPoint(88F, -10.5F, -11F);

		bodyModel[539].addBox(0F, 0F, 0F, 57, 14, 1, 0F); // Box 135
		bodyModel[539].setRotationPoint(30F, -22F, -11F);

		bodyModel[540].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[540].setRotationPoint(87F, -12F, -11F);

		bodyModel[541].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[541].setRotationPoint(92F, -12F, -11F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 135
		bodyModel[542].setRotationPoint(88F, -12F, -11F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 135
		bodyModel[543].setRotationPoint(88F, -11.75F, -11F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[544].setRotationPoint(25F, -8.5F, -11F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[545].setRotationPoint(25F, -10.5F, -11F);

		bodyModel[546].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[546].setRotationPoint(24F, -12F, -11F);

		bodyModel[547].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[547].setRotationPoint(29F, -12F, -11F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 135
		bodyModel[548].setRotationPoint(25F, -12F, -11F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 135
		bodyModel[549].setRotationPoint(25F, -11.75F, -11F);

		bodyModel[550].addBox(0F, 0F, 0F, 17, 14, 1, 0F); // Box 135
		bodyModel[550].setRotationPoint(7F, -22F, -11F);

		bodyModel[551].addShapeBox(0F, 0F, 1F, 106, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[551].setRotationPoint(-6F, -8F, -12F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[552].setRotationPoint(102F, -9.25F, -7.88F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F); // Box 0
		bodyModel[553].setRotationPoint(102F, -9.25F, 5.18F);

		bodyModel[554].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 135
		bodyModel[554].setRotationPoint(93F, -29F, -11F);

		bodyModel[555].addBox(0F, 0F, 0F, 57, 2, 1, 0F); // Box 135
		bodyModel[555].setRotationPoint(30F, -29F, -11F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[556].setRotationPoint(64.25F, -13.5F, 10.25F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Du loco part28
		bodyModel[557].setRotationPoint(24.25F, -27F, -11.5F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[558].setRotationPoint(24F, -29F, -11F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 5, 17, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[559].setRotationPoint(24.75F, -29F, -11F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[560].setRotationPoint(24.25F, -27F, -11.25F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Du loco part28
		bodyModel[561].setRotationPoint(29.5F, -27F, -11.5F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[562].setRotationPoint(29.5F, -27F, -11.25F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[563].setRotationPoint(29.5F, -13.5F, -11.25F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 135
		bodyModel[564].setRotationPoint(29F, -29F, -11F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[565].setRotationPoint(24.25F, -13.5F, -11.25F);

		bodyModel[566].addBox(0F, 0F, 0F, 17, 2, 1, 0F); // Box 135
		bodyModel[566].setRotationPoint(7F, -29F, -11F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 80, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[567].setRotationPoint(7F, -30F, -11F);

		bodyModel[568].addBox(0F, 0F, 0F, 5, 5, 1, 0F); // Box 135
		bodyModel[568].setRotationPoint(19F, -27F, -11F);

		bodyModel[569].addBox(0F, 0F, 0F, 4, 5, 1, 0F); // Box 135
		bodyModel[569].setRotationPoint(30F, -27F, -11F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[570].setRotationPoint(94F, -23F, -11F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[571].setRotationPoint(94F, -28F, -11F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[572].setRotationPoint(94F, -28F, -11F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[573].setRotationPoint(98F, -28F, -11F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 80, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[574].setRotationPoint(7F, -30F, 10F);

		bodyModel[575].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,-0.5F, 0.25F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, 0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0.5F); // Lamp
		bodyModel[575].setRotationPoint(101F, -15.75F, -9F);

		bodyModel[576].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.25F, 0.5F); // Lamp
		bodyModel[576].setRotationPoint(101F, -14.75F, -9F);

		bodyModel[577].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0.5F, -0.5F, 0.25F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, 0.25F, -0.5F); // Lamp
		bodyModel[577].setRotationPoint(101F, -14.25F, -9F);

		bodyModel[578].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Du loco part37
		bodyModel[578].setRotationPoint(19F, -33F, -6F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[579].setRotationPoint(61F, -32.5F, -3F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F); // Du loco part37
		bodyModel[580].setRotationPoint(61F, -32.5F, 0F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[581].setRotationPoint(58F, -32.5F, -3F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F); // Du loco part37
		bodyModel[582].setRotationPoint(58F, -32.5F, 0F);

		bodyModel[583].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[583].setRotationPoint(54F, -35F, 1F);

		bodyModel[584].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part37
		bodyModel[584].setRotationPoint(49F, -34F, -1.5F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[585].setRotationPoint(53F, -33F, 0F);

		bodyModel[586].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[586].setRotationPoint(66F, -33F, -6F);

		bodyModel[587].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[587].setRotationPoint(45F, -33F, -6F);

		bodyModel[588].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Du loco part37
		bodyModel[588].setRotationPoint(26F, -33F, -6F);

		bodyModel[589].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Du loco part37
		bodyModel[589].setRotationPoint(46F, -33F, -6F);

		bodyModel[590].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Du loco part37
		bodyModel[590].setRotationPoint(67F, -33F, -6F);

		bodyModel[591].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[591].setRotationPoint(29F, -33F, -6F);

		bodyModel[592].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Du loco part37
		bodyModel[592].setRotationPoint(30F, -33F, -6F);

		bodyModel[593].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part37
		bodyModel[593].setRotationPoint(60.5F, -35F, -2.5F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, -4F); // Du loco part37
		bodyModel[594].setRotationPoint(54F, -35F, -6F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F); // Du loco part37
		bodyModel[595].setRotationPoint(61F, -35F, -6F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, -2F); // Du loco part37
		bodyModel[596].setRotationPoint(50F, -35F, -1F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 36, 4, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[597].setRotationPoint(-5F, -10F, -7F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 36, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[598].setRotationPoint(-5F, -10F, 6F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[599].setRotationPoint(-1F, -6F, 6F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Du loco part06
		bodyModel[600].setRotationPoint(-4F, -3F, 6F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[601].setRotationPoint(5.75F, -6F, 6.25F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part06
		bodyModel[602].setRotationPoint(0F, -4.25F, 6.5F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[603].setRotationPoint(23.5F, -6.5F, 7F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[604].setRotationPoint(23.5F, -5.5F, 7F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[605].setRotationPoint(24.5F, -6.5F, 7F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[606].setRotationPoint(24.5F, -5.5F, 7F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[607].setRotationPoint(0.5F, -6.5F, 7F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[608].setRotationPoint(0.5F, -5.5F, 7F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[609].setRotationPoint(1.5F, -6.5F, 7F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[610].setRotationPoint(1.5F, -5.5F, 7F);

		bodyModel[611].addBox(0F, 0F, 0F, 1, 5, 12, 0F); // Du loco part06
		bodyModel[611].setRotationPoint(-5F, -10F, -6F);

		bodyModel[612].addBox(0F, 0F, 0F, 1, 5, 12, 0F); // Du loco part06
		bodyModel[612].setRotationPoint(30F, -10F, -6F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[613].setRotationPoint(23.5F, -6.5F, -8F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[614].setRotationPoint(23.5F, -5.5F, -8F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[615].setRotationPoint(24.5F, -6.5F, -8F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[616].setRotationPoint(24.5F, -5.5F, -8F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[617].setRotationPoint(0.5F, -6.5F, -8F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[618].setRotationPoint(0.5F, -5.5F, -8F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[619].setRotationPoint(1.5F, -6.5F, -8F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[620].setRotationPoint(1.5F, -5.5F, -8F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 36, 4, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[621].setRotationPoint(63F, -10F, -7F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 36, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[622].setRotationPoint(63F, -10F, 6F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[623].setRotationPoint(91.5F, -6.5F, 7F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[624].setRotationPoint(91.5F, -5.5F, 7F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[625].setRotationPoint(92.5F, -6.5F, 7F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[626].setRotationPoint(92.5F, -5.5F, 7F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[627].setRotationPoint(68.5F, -6.5F, 7F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[628].setRotationPoint(68.5F, -5.5F, 7F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[629].setRotationPoint(69.5F, -6.5F, 7F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[630].setRotationPoint(69.5F, -5.5F, 7F);

		bodyModel[631].addBox(0F, 0F, 0F, 1, 5, 12, 0F); // Du loco part06
		bodyModel[631].setRotationPoint(63F, -10F, -6F);

		bodyModel[632].addBox(0F, 0F, 0F, 1, 5, 12, 0F); // Du loco part06
		bodyModel[632].setRotationPoint(98F, -10F, -6F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[633].setRotationPoint(91.5F, -6.5F, -8F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[634].setRotationPoint(91.5F, -5.5F, -8F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[635].setRotationPoint(92.5F, -6.5F, -8F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[636].setRotationPoint(92.5F, -5.5F, -8F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[637].setRotationPoint(68.5F, -6.5F, -8F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[638].setRotationPoint(68.5F, -5.5F, -8F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[639].setRotationPoint(69.5F, -6.5F, -8F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[640].setRotationPoint(69.5F, -5.5F, -8F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 0
		bodyModel[641].setRotationPoint(37.85F, -7.5F, 5.25F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F); // Box 0
		bodyModel[642].setRotationPoint(37.85F, -8.5F, 5.25F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 0
		bodyModel[643].setRotationPoint(37.85F, -8F, 5.25F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F); // Box 0
		bodyModel[644].setRotationPoint(37.85F, -5.75F, 5.25F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F); // Box 0
		bodyModel[645].setRotationPoint(37.85F, -6.25F, 5.25F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 0
		bodyModel[646].setRotationPoint(37.85F, -7.5F, -9.25F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F); // Box 0
		bodyModel[647].setRotationPoint(37.85F, -8.5F, -9.25F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 0
		bodyModel[648].setRotationPoint(37.85F, -8F, -9.25F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F); // Box 0
		bodyModel[649].setRotationPoint(37.85F, -5.75F, -9.25F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F); // Box 0
		bodyModel[650].setRotationPoint(37.85F, -6.25F, -9.25F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[651].setRotationPoint(13F, -8F, -11F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[652].setRotationPoint(12F, -7F, -11F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[653].setRotationPoint(11F, -8F, -11F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[654].setRotationPoint(82F, -8F, -11F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[655].setRotationPoint(81F, -7F, -11F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[656].setRotationPoint(80F, -8F, -11F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,-0.25F, 0F, 0F, -2.625F, 0F, 0F, 0F, 0F, 0F, -2.875F, 0F, 0F, 0.25F, 0F, 0F, -3.125F, 0F, 0F, -0.5F, 0F, 0F, -2.375F, 0F, 0F); // Du loco part42
		bodyModel[657].setRotationPoint(-10F, -7F, 0F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-0.625F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, -2.875F, 0F, 0F, -0.125F, 0F, 0F, -2.75F, 0F, 0F, -0.5F, -1F, 0F, -2.375F, -1F, 0F); // Du loco part42
		bodyModel[658].setRotationPoint(-7.75F, -7F, 8F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.625F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0F, 0F, 0F, -2.875F, 0F, 0F, -0.125F, 0F, -0.5F, -3.75F, 0F, -0.5F, -1.5F, -2F, 0F, -2.375F, -2F, 0F); // Du loco part42
		bodyModel[659].setRotationPoint(-5.5F, -8F, 9.5F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-2.875F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -0.625F, 0F, 0F, -2.375F, -1F, 0F, -0.5F, -1F, 0F, -2.75F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part42
		bodyModel[660].setRotationPoint(-7.75F, -7F, -10F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-2.875F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, -0.5F, -0.625F, 0F, -0.5F, -2.375F, -2F, 0F, -1.5F, -2F, 0F, -3.75F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Du loco part42
		bodyModel[661].setRotationPoint(-5.5F, -8F, -10.5F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,0F, 0F, 0F, -2.875F, 0F, 0F, -0.25F, 0F, 0F, -2.625F, 0F, 0F, -0.5F, 0F, 0F, -2.375F, 0F, 0F, 0.25F, 0F, 0F, -3.125F, 0F, 0F); // Du loco part42
		bodyModel[662].setRotationPoint(101F, -7F, -8F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 3, 5, 8, 0F,-2.625F, 0F, 0F, -0.25F, 0F, 0F, -2.875F, 0F, 0F, 0F, 0F, 0F, -3.125F, 0F, 0F, 0.25F, 0F, 0F, -2.375F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part42
		bodyModel[663].setRotationPoint(101F, -7F, 0F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,-2.25F, 0F, 0F, -0.625F, 0F, 0F, -2.875F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -0.125F, 0F, 0F, -2.375F, -1F, 0F, -0.5F, -1F, 0F); // Du loco part42
		bodyModel[664].setRotationPoint(98.75F, -7F, 8F);

		bodyModel[665].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-2.25F, 0F, -0.5F, -0.625F, 0F, -0.5F, -2.875F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -0.5F, -0.125F, 0F, -0.5F, -2.375F, -2F, 0F, -1.5F, -2F, 0F); // Du loco part42
		bodyModel[665].setRotationPoint(95.5F, -8F, 9.5F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, 0F, -2.875F, 0F, 0F, -0.625F, 0F, 0F, -2.25F, 0F, 0F, -0.5F, -1F, 0F, -2.375F, -1F, 0F, -0.125F, 0F, 0F, -2.75F, 0F, 0F); // Du loco part42
		bodyModel[666].setRotationPoint(98.75F, -7F, -10F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, 0F, 0F, -2.875F, 0F, 0F, -0.625F, 0F, -0.5F, -2.25F, 0F, -0.5F, -1.5F, -2F, 0F, -2.375F, -2F, 0F, -0.125F, 0F, -0.5F, -3.75F, 0F, -0.5F); // Du loco part42
		bodyModel[667].setRotationPoint(95.5F, -8F, -10.5F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[668].setRotationPoint(8F, -32F, 7F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[669].setRotationPoint(85F, -32F, 7F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 76, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[670].setRotationPoint(9F, -32F, 9F);

		bodyModel[671].addShapeBox(0F, 0F, 0F, 76, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[671].setRotationPoint(9F, -32F, 9F);

		bodyModel[672].addShapeBox(0F, 0F, 0F, 76, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[672].setRotationPoint(9F, -32F, 7F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 168
		bodyModel[673].setRotationPoint(8F, -32F, -11F);

		bodyModel[674].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 168
		bodyModel[674].setRotationPoint(85F, -32F, -11F);

		bodyModel[675].addShapeBox(0F, 0F, 0F, 76, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 168
		bodyModel[675].setRotationPoint(9F, -32F, -11F);

		bodyModel[676].addShapeBox(0F, 0F, 0F, 76, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[676].setRotationPoint(9F, -32F, -10F);

		bodyModel[677].addShapeBox(0F, 0F, 0F, 76, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[677].setRotationPoint(9F, -32F, -9F);

		bodyModel[678].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[678].setRotationPoint(13.75F, -32F, -11F);

		bodyModel[679].addShapeBox(0F, 0F, 1F, 4, 1, 7, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[679].setRotationPoint(-10F, -31.25F, -4.5F);

		bodyModel[680].addShapeBox(0F, 0F, 1F, 2, 1, 7, 0F,0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[680].setRotationPoint(-10F, -30.25F, -4.5F);

		bodyModel[681].addShapeBox(0F, 0F, 1F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[681].setRotationPoint(-10F, -29.75F, -4.5F);

		bodyModel[682].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[682].setRotationPoint(-10.5F, -31.25F, -4.5F);

		bodyModel[683].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[683].setRotationPoint(-10.5F, -30.25F, -4.5F);

		bodyModel[684].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[684].setRotationPoint(-10.5F, -29.75F, -4.5F);

		bodyModel[685].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[685].setRotationPoint(-10.5F, -31.25F, -2F);

		bodyModel[686].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[686].setRotationPoint(-10.5F, -30.25F, -2F);

		bodyModel[687].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[687].setRotationPoint(-10.5F, -29.75F, -2F);

		bodyModel[688].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[688].setRotationPoint(-10.5F, -31.25F, 0.5F);

		bodyModel[689].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[689].setRotationPoint(-10.5F, -30.25F, 0.5F);

		bodyModel[690].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[690].setRotationPoint(-10.5F, -29.75F, 0.5F);

		bodyModel[691].addShapeBox(0F, 0F, 1F, 4, 1, 7, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[691].setRotationPoint(100F, -31.25F, -4.5F);

		bodyModel[692].addShapeBox(0F, 0F, 1F, 2, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[692].setRotationPoint(102F, -30.25F, -4.5F);

		bodyModel[693].addShapeBox(0F, 0F, 1F, 2, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F); // Lamp
		bodyModel[693].setRotationPoint(102F, -29.75F, -4.5F);

		bodyModel[694].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[694].setRotationPoint(103.5F, -31.25F, -4.5F);

		bodyModel[695].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Lamp
		bodyModel[695].setRotationPoint(103.5F, -30.25F, -4.5F);

		bodyModel[696].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Lamp
		bodyModel[696].setRotationPoint(103.5F, -29.75F, -4.5F);

		bodyModel[697].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[697].setRotationPoint(103.5F, -31.25F, -2F);

		bodyModel[698].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Lamp
		bodyModel[698].setRotationPoint(103.5F, -30.25F, -2F);

		bodyModel[699].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Lamp
		bodyModel[699].setRotationPoint(103.5F, -29.75F, -2F);

		bodyModel[700].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[700].setRotationPoint(103.5F, -31.25F, 0.5F);

		bodyModel[701].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Lamp
		bodyModel[701].setRotationPoint(103.5F, -30.25F, 0.5F);

		bodyModel[702].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Lamp
		bodyModel[702].setRotationPoint(103.5F, -29.75F, 0.5F);

		bodyModel[703].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[703].setRotationPoint(79F, -48F, -6F);

		bodyModel[704].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[704].setRotationPoint(79F, -48F, 6F);

		bodyModel[705].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[705].setRotationPoint(79F, -48F, -8F);

		bodyModel[706].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[706].setRotationPoint(79F, -38F, -6F);

		bodyModel[707].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[707].setRotationPoint(79F, -38F, 6F);

		bodyModel[708].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[708].setRotationPoint(79F, -38F, -8F);

		bodyModel[709].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F); // Du loco part28
		bodyModel[709].setRotationPoint(-11F, -21F, -1.25F);

		bodyModel[710].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, 0.125F, -0.25F, -0.75F, 0.125F); // Du loco part28
		bodyModel[710].setRotationPoint(103.5F, -21F, -1F);

		bodyModel[711].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.25F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, -0.75F, 0F, -1.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1.25F, -0.75F, 0F); // Du loco part28
		bodyModel[711].setRotationPoint(103F, -21F, -5F);

		bodyModel[712].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F); // Du loco part28
		bodyModel[712].setRotationPoint(99.75F, -21F, -10.75F);

		bodyModel[713].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, -0.75F, 0F, -1.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1.25F, -0.75F, 0F); // Du loco part28
		bodyModel[713].setRotationPoint(101F, -21F, -10F);

		bodyModel[714].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F); // Du loco part28
		bodyModel[714].setRotationPoint(104F, -21F, -1.25F);

		bodyModel[715].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[715].setRotationPoint(5.75F, -8F, 9.75F);

		bodyModel[716].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[716].setRotationPoint(1.25F, -8F, 9.75F);

		bodyModel[717].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[717].setRotationPoint(2.25F, -4F, 9.75F);

		bodyModel[718].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[718].setRotationPoint(2.25F, -6.25F, 9.75F);

		bodyModel[719].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[719].setRotationPoint(68.75F, -8F, 9.75F);

		bodyModel[720].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[720].setRotationPoint(64.25F, -8F, 9.75F);

		bodyModel[721].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[721].setRotationPoint(65.25F, -4F, 9.75F);

		bodyModel[722].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[722].setRotationPoint(65.25F, -6.25F, 9.75F);

		bodyModel[723].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[723].setRotationPoint(28.75F, -8F, -11.5F);

		bodyModel[724].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[724].setRotationPoint(24.25F, -8F, -11.5F);

		bodyModel[725].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[725].setRotationPoint(25.25F, -4F, -11.5F);

		bodyModel[726].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[726].setRotationPoint(25.25F, -6.25F, -11.5F);

		bodyModel[727].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[727].setRotationPoint(91.75F, -8F, -11.5F);

		bodyModel[728].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[728].setRotationPoint(87.25F, -8F, -11.5F);

		bodyModel[729].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[729].setRotationPoint(88.25F, -4F, -11.5F);

		bodyModel[730].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[730].setRotationPoint(88.25F, -6.25F, -11.5F);

		bodyModel[731].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1.125F, 0F, -0.875F, -0.625F, 0F, -0.875F, -0.625F, 0F, 0F, -1.125F, 0F, 0F, -0.625F, -0.875F, -0.875F, -1.125F, -1F, -0.875F, -1.125F, -1F, 0F, -0.625F, -0.875F, 0F); // Du loco part28
		bodyModel[731].setRotationPoint(-6.25F, -7F, 8.75F);

		bodyModel[732].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[732].setRotationPoint(8F, -13.25F, 10.25F);

		bodyModel[733].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[733].setRotationPoint(8F, -16.25F, 10.25F);

		bodyModel[734].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[734].setRotationPoint(8F, -19.25F, 10.25F);

		bodyModel[735].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[735].setRotationPoint(70F, -13.25F, 10.25F);

		bodyModel[736].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[736].setRotationPoint(70F, -16.25F, 10.25F);

		bodyModel[737].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[737].setRotationPoint(70F, -19.25F, 10.25F);

		bodyModel[738].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[738].setRotationPoint(30F, -13.25F, -12F);

		bodyModel[739].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[739].setRotationPoint(30F, -16.25F, -12F);

		bodyModel[740].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[740].setRotationPoint(30F, -19.25F, -12F);

		bodyModel[741].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[741].setRotationPoint(8F, -13.25F, -12F);

		bodyModel[742].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[742].setRotationPoint(8F, -16.25F, -12F);

		bodyModel[743].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[743].setRotationPoint(8F, -19.25F, -12F);

		bodyModel[744].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 135
		bodyModel[744].setRotationPoint(93F, -28F, -11F);

		bodyModel[745].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Du loco part28
		bodyModel[745].setRotationPoint(-5.5F, -27.75F, 11F);

		bodyModel[746].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Du loco part28
		bodyModel[746].setRotationPoint(-5.5F, -22.5F, 11F);

		bodyModel[747].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[747].setRotationPoint(-5.5F, -27.5F, 11.5F);

		bodyModel[748].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F); // Du loco part28
		bodyModel[748].setRotationPoint(-5.75F, -27F, 11.25F);

		bodyModel[749].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Du loco part28
		bodyModel[749].setRotationPoint(-5.5F, -27.75F, -12.5F);

		bodyModel[750].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Du loco part28
		bodyModel[750].setRotationPoint(-5.5F, -22.5F, -12.5F);

		bodyModel[751].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[751].setRotationPoint(-5.5F, -27.5F, -13.25F);

		bodyModel[752].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F); // Du loco part28
		bodyModel[752].setRotationPoint(-5.75F, -27F, -13.5F);

		bodyModel[753].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F); // Du loco part28
		bodyModel[753].setRotationPoint(98.5F, -27.75F, 11F);

		bodyModel[754].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F); // Du loco part28
		bodyModel[754].setRotationPoint(98.5F, -22.5F, 11F);

		bodyModel[755].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part28
		bodyModel[755].setRotationPoint(98.5F, -27.5F, 11.5F);

		bodyModel[756].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.25F, 0F, 0F); // Du loco part28
		bodyModel[756].setRotationPoint(98.75F, -27F, 11.25F);

		bodyModel[757].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F); // Du loco part28
		bodyModel[757].setRotationPoint(98.5F, -27.75F, -12.5F);

		bodyModel[758].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F); // Du loco part28
		bodyModel[758].setRotationPoint(98.5F, -22.5F, -12.5F);

		bodyModel[759].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part28
		bodyModel[759].setRotationPoint(98.5F, -27.5F, -13.25F);

		bodyModel[760].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.25F, 0F, 0F); // Du loco part28
		bodyModel[760].setRotationPoint(98.75F, -27F, -13.5F);

		bodyModel[761].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, 0F); // Du loco part28
		bodyModel[761].setRotationPoint(97.5F, -27.75F, 10.75F);

		bodyModel[762].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, 0F); // Du loco part28
		bodyModel[762].setRotationPoint(97.5F, -22.5F, 10.75F);

		bodyModel[763].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[763].setRotationPoint(98F, -27.5F, 10.75F);

		bodyModel[764].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[764].setRotationPoint(97.25F, -27F, 11F);

		bodyModel[765].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, -0.5F, -0.75F, -0.75F); // Du loco part28
		bodyModel[765].setRotationPoint(97.5F, -27.75F, -11.75F);

		bodyModel[766].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, -0.5F, -0.75F, -0.75F); // Du loco part28
		bodyModel[766].setRotationPoint(97.5F, -22.5F, -11.75F);

		bodyModel[767].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[767].setRotationPoint(98F, -27.5F, -11.75F);

		bodyModel[768].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part28
		bodyModel[768].setRotationPoint(97.25F, -27F, -12F);

		bodyModel[769].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[769].setRotationPoint(-5.5F, -27.75F, -11.75F);

		bodyModel[770].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[770].setRotationPoint(-5.5F, -22.5F, -11.75F);

		bodyModel[771].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[771].setRotationPoint(-4.25F, -27.5F, -11.75F);

		bodyModel[772].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part28
		bodyModel[772].setRotationPoint(-5F, -27F, -12F);

		bodyModel[773].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[773].setRotationPoint(-5.5F, -27.75F, 10.75F);

		bodyModel[774].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[774].setRotationPoint(-5.5F, -22.5F, 10.75F);

		bodyModel[775].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[775].setRotationPoint(-4.25F, -27.5F, 10.75F);

		bodyModel[776].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[776].setRotationPoint(-5F, -27F, 11F);

		bodyModel[777].addBox(0F, 0F, 0F, 9, 5, 10, 0F); // Box 149
		bodyModel[777].setRotationPoint(48F, -17F, -5F);

		bodyModel[778].addBox(0F, 0F, 0F, 4, 17, 7, 0F); // Box 149
		bodyModel[778].setRotationPoint(58F, -29F, -6F);

		bodyModel[779].addBox(0F, 0F, 0F, 9, 17, 12, 0F); // Box 149
		bodyModel[779].setRotationPoint(36F, -29F, -6F);

		bodyModel[780].addBox(0F, 0F, 0F, 7, 17, 11, 0F); // Box 149
		bodyModel[780].setRotationPoint(29F, -29F, -5F);

		bodyModel[781].addBox(0F, 0F, 0F, 2, 17, 12, 0F); // Box 149
		bodyModel[781].setRotationPoint(45F, -29F, -6F);

		bodyModel[782].addBox(0F, 0F, 0F, 5, 12, 4, 0F); // Box 149
		bodyModel[782].setRotationPoint(8F, -24F, 1F);

		bodyModel[783].addBox(0F, 0F, 0F, 6, 17, 9, 0F); // Box 149
		bodyModel[783].setRotationPoint(13F, -29F, -5F);

		bodyModel[784].addBox(0F, 0F, 0F, 6, 17, 3, 0F); // Box 149
		bodyModel[784].setRotationPoint(19F, -29F, 1F);

		bodyModel[785].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[785].setRotationPoint(8.5F, -29F, -1F);

		bodyModel[786].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[786].setRotationPoint(10.5F, -29F, -1F);

		bodyModel[787].addShapeBox(0F, 0F, 0F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 149
		bodyModel[787].setRotationPoint(20.5F, -30F, -1.5F);

		bodyModel[788].addShapeBox(0F, 0F, 0F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 149
		bodyModel[788].setRotationPoint(22.5F, -30F, -1.5F);

		bodyModel[789].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[789].setRotationPoint(20.5F, -30F, -3.5F);

		bodyModel[790].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[790].setRotationPoint(22.5F, -30F, -3.5F);

		bodyModel[791].addBox(0F, 0F, 0F, 10, 8, 5, 0F); // Box 149
		bodyModel[791].setRotationPoint(19F, -20F, -5F);

		bodyModel[792].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 149
		bodyModel[792].setRotationPoint(8.5F, -29F, 1F);

		bodyModel[793].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 149
		bodyModel[793].setRotationPoint(10.5F, -29F, 1F);

		bodyModel[794].addBox(0F, 0F, 0F, 6, 17, 4, 0F); // Box 149
		bodyModel[794].setRotationPoint(68F, -29F, -5F);

		bodyModel[795].addBox(0F, 0F, 0F, 5, 12, 4, 0F); // Box 149
		bodyModel[795].setRotationPoint(68F, -24F, 2F);

		bodyModel[796].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[796].setRotationPoint(68.5F, -29F, 0F);

		bodyModel[797].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[797].setRotationPoint(70.5F, -29F, 0F);

		bodyModel[798].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 149
		bodyModel[798].setRotationPoint(68.5F, -29F, 2F);

		bodyModel[799].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 149
		bodyModel[799].setRotationPoint(70.5F, -29F, 2F);

		bodyModel[800].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 149
		bodyModel[800].setRotationPoint(74F, -29F, 2F);

		bodyModel[801].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 149
		bodyModel[801].setRotationPoint(74F, -26F, 2F);

		bodyModel[802].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 149
		bodyModel[802].setRotationPoint(75F, -22F, -2F);

		bodyModel[803].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 149
		bodyModel[803].setRotationPoint(75F, -19F, -2F);

		bodyModel[804].addBox(0F, 0F, 0F, 4, 5, 8, 0F); // Box 149
		bodyModel[804].setRotationPoint(75F, -17F, -2F);

		bodyModel[805].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[805].setRotationPoint(80F, -26F, 1F);

		bodyModel[806].addBox(0F, 0F, 0F, 5, 12, 4, 0F); // Box 149
		bodyModel[806].setRotationPoint(79F, -24F, -5F);

		bodyModel[807].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 149
		bodyModel[807].setRotationPoint(79.5F, -29F, -1F);

		bodyModel[808].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 149
		bodyModel[808].setRotationPoint(81.5F, -29F, -1F);

		bodyModel[809].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[809].setRotationPoint(79.5F, -29F, -3F);

		bodyModel[810].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[810].setRotationPoint(81.5F, -29F, -3F);

		bodyModel[811].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[811].setRotationPoint(82F, -26F, 1F);

		bodyModel[812].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 149
		bodyModel[812].setRotationPoint(80F, -24F, 1F);

		bodyModel[813].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[813].setRotationPoint(82F, -24F, 1F);

		bodyModel[814].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Box 149
		bodyModel[814].setRotationPoint(79F, -19F, 2F);

		bodyModel[815].addBox(0F, 0F, 0F, 5, 14, 2, 0F); // Box 149
		bodyModel[815].setRotationPoint(79F, -26F, 0F);

		bodyModel[816].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[816].setRotationPoint(74.5F, -17F, -4F);

		bodyModel[817].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[817].setRotationPoint(75.5F, -17F, -4F);

		bodyModel[818].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 149
		bodyModel[818].setRotationPoint(74.5F, -17F, -3F);

		bodyModel[819].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 149
		bodyModel[819].setRotationPoint(75.5F, -17F, -3F);

		bodyModel[820].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[820].setRotationPoint(76.5F, -17F, -4F);

		bodyModel[821].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[821].setRotationPoint(77.5F, -17F, -4F);

		bodyModel[822].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 149
		bodyModel[822].setRotationPoint(76.5F, -17F, -3F);

		bodyModel[823].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 149
		bodyModel[823].setRotationPoint(77.5F, -17F, -3F);

		bodyModel[824].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 149
		bodyModel[824].setRotationPoint(75F, -15F, -5F);

		bodyModel[825].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[825].setRotationPoint(1F, -22F, -6F);

		bodyModel[826].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[826].setRotationPoint(1F, -20F, -3F);

		bodyModel[827].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part82
		bodyModel[827].setRotationPoint(-7F, -23F, -6F);

		bodyModel[828].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Du loco part82
		bodyModel[828].setRotationPoint(-7.5F, -24F, -6F);

		bodyModel[829].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part82
		bodyModel[829].setRotationPoint(-7F, -21F, -10F);

		bodyModel[830].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[830].setRotationPoint(-5F, -21F, -10F);

		bodyModel[831].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[831].setRotationPoint(-5.5F, -19F, -10.5F);

		bodyModel[832].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[832].setRotationPoint(-5F, -22F, -10F);

		bodyModel[833].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[833].setRotationPoint(-4F, -22F, -10F);

		bodyModel[834].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Du loco part82
		bodyModel[834].setRotationPoint(-5F, -22F, -9F);

		bodyModel[835].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Du loco part82
		bodyModel[835].setRotationPoint(-4F, -22F, -9F);

		bodyModel[836].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[836].setRotationPoint(-4F, -23F, -10F);

		bodyModel[837].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.125F, -0.75F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part82
		bodyModel[837].setRotationPoint(-4F, -23F, -9F);

		bodyModel[838].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part82
		bodyModel[838].setRotationPoint(-7F, -23F, -8.5F);

		bodyModel[839].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part82
		bodyModel[839].setRotationPoint(-5.5F, -23F, -2F);

		bodyModel[840].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part82
		bodyModel[840].setRotationPoint(-9F, -21F, 1F);

		bodyModel[841].addShapeBox(0F, 0F, 0F, 7, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[841].setRotationPoint(-9F, -21F, -1F);

		bodyModel[842].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part82
		bodyModel[842].setRotationPoint(-5F, -23F, -10F);

		bodyModel[843].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.5F, -0.625F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, -0.5F); // Du loco part82
		bodyModel[843].setRotationPoint(-3.5F, -23F, -4.5F);

		bodyModel[844].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.125F, -0.625F, 0F, -0.875F, -0.625F, 0F, -0.75F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0.125F, -0.125F, 0F, -0.875F, -0.125F, 0F, -0.75F, 0.125F, -0.5F, 0F, 0.125F, -0.5F); // Du loco part82
		bodyModel[844].setRotationPoint(-4F, -22.25F, -7F);

		bodyModel[845].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[845].setRotationPoint(-3F, -13F, 4F);

		bodyModel[846].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[846].setRotationPoint(-3F, -13F, 4F);
		bodyModel[846].rotateAngleY = -1.57079633F;

		bodyModel[847].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[847].setRotationPoint(-3F, -13F, 7F);
		bodyModel[847].rotateAngleY = -1.57079633F;

		bodyModel[848].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[848].setRotationPoint(-3F, -16F, 4F);

		bodyModel[849].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[849].setRotationPoint(-3F, -16F, 7F);
		bodyModel[849].rotateAngleY = -1.57079633F;

		bodyModel[850].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[850].setRotationPoint(-3F, -16F, 4F);
		bodyModel[850].rotateAngleY = -1.57079633F;

		bodyModel[851].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[851].setRotationPoint(0F, -20F, 3F);

		bodyModel[852].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[852].setRotationPoint(0F, -20F, 2F);

		bodyModel[853].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[853].setRotationPoint(0F, -16F, 3F);

		bodyModel[854].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[854].setRotationPoint(-1F, -15F, 6F);
		bodyModel[854].rotateAngleY = -1.57079633F;

		bodyModel[855].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[855].setRotationPoint(-2F, -15F, 6F);
		bodyModel[855].rotateAngleY = -1.57079633F;

		bodyModel[856].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[856].setRotationPoint(0F, -22F, 4F);

		bodyModel[857].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[857].setRotationPoint(0F, -20F, 7F);

		bodyModel[858].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[858].setRotationPoint(-9F, -20F, 1F);

		bodyModel[859].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[859].setRotationPoint(-9F, -21F, -2F);

		bodyModel[860].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part82
		bodyModel[860].setRotationPoint(96F, -21F, 1F);

		bodyModel[861].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[861].setRotationPoint(93F, -13F, -6F);

		bodyModel[862].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[862].setRotationPoint(93F, -13F, -6F);
		bodyModel[862].rotateAngleY = -1.57079633F;

		bodyModel[863].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[863].setRotationPoint(93F, -13F, -3F);
		bodyModel[863].rotateAngleY = -1.57079633F;

		bodyModel[864].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[864].setRotationPoint(94F, -16F, -6F);

		bodyModel[865].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[865].setRotationPoint(94F, -16F, -3F);
		bodyModel[865].rotateAngleY = -1.57079633F;

		bodyModel[866].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[866].setRotationPoint(94F, -16F, -6F);
		bodyModel[866].rotateAngleY = -1.57079633F;

		bodyModel[867].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[867].setRotationPoint(93F, -20F, -7F);

		bodyModel[868].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[868].setRotationPoint(93F, -20F, -8F);

		bodyModel[869].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[869].setRotationPoint(93F, -16F, -7F);

		bodyModel[870].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[870].setRotationPoint(95F, -15F, -4F);
		bodyModel[870].rotateAngleY = -1.57079633F;

		bodyModel[871].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[871].setRotationPoint(94F, -15F, -4F);
		bodyModel[871].rotateAngleY = -1.57079633F;

		bodyModel[872].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[872].setRotationPoint(93F, -22F, -6F);

		bodyModel[873].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[873].setRotationPoint(93F, -20F, -3F);

		bodyModel[874].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[874].setRotationPoint(99F, -23F, 2F);

		bodyModel[875].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[875].setRotationPoint(100.5F, -24F, 3F);

		bodyModel[876].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[876].setRotationPoint(97F, -21F, 8F);

		bodyModel[877].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[877].setRotationPoint(96.5F, -19F, 7.5F);

		bodyModel[878].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[878].setRotationPoint(97F, -22F, 8F);

		bodyModel[879].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[879].setRotationPoint(98F, -22F, 8F);

		bodyModel[880].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Du loco part82
		bodyModel[880].setRotationPoint(97F, -22F, 9F);

		bodyModel[881].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Du loco part82
		bodyModel[881].setRotationPoint(98F, -22F, 9F);

		bodyModel[882].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F); // Du loco part82
		bodyModel[882].setRotationPoint(98F, -23F, 9F);

		bodyModel[883].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.125F, -0.75F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part82
		bodyModel[883].setRotationPoint(98F, -23F, 7F);

		bodyModel[884].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[884].setRotationPoint(99F, -23F, 6.5F);

		bodyModel[885].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part82
		bodyModel[885].setRotationPoint(96.5F, -23F, 0F);

		bodyModel[886].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[886].setRotationPoint(97F, -21F, -10F);

		bodyModel[887].addShapeBox(0F, 0F, 0F, 7, 9, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[887].setRotationPoint(96F, -21F, -1F);

		bodyModel[888].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F); // Du loco part82
		bodyModel[888].setRotationPoint(97F, -23F, 9F);

		bodyModel[889].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[889].setRotationPoint(92F, -13F, 4F);

		bodyModel[890].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[890].setRotationPoint(92F, -13F, 4F);
		bodyModel[890].rotateAngleY = -1.57079633F;

		bodyModel[891].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[891].setRotationPoint(92F, -13F, 7F);
		bodyModel[891].rotateAngleY = -1.57079633F;

		bodyModel[892].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[892].setRotationPoint(93F, -16F, 4F);

		bodyModel[893].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[893].setRotationPoint(93F, -16F, 7F);
		bodyModel[893].rotateAngleY = -1.57079633F;

		bodyModel[894].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[894].setRotationPoint(93F, -16F, 4F);
		bodyModel[894].rotateAngleY = -1.57079633F;

		bodyModel[895].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[895].setRotationPoint(92F, -20F, 3F);

		bodyModel[896].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[896].setRotationPoint(92F, -20F, 2F);

		bodyModel[897].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[897].setRotationPoint(94F, -15F, 6F);
		bodyModel[897].rotateAngleY = -1.57079633F;

		bodyModel[898].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[898].setRotationPoint(93F, -15F, 6F);
		bodyModel[898].rotateAngleY = -1.57079633F;

		bodyModel[899].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[899].setRotationPoint(92F, -22F, 4F);

		bodyModel[900].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[900].setRotationPoint(92F, -20F, 7F);

		bodyModel[901].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[901].setRotationPoint(97F, -20F, -3F);

		bodyModel[902].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[902].setRotationPoint(96F, -21F, 1F);

		bodyModel[903].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[903].setRotationPoint(92F, -16F, 3F);

		bodyModel[904].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part82
		bodyModel[904].setRotationPoint(99F, -21F, 8F);

		bodyModel[905].addShapeBox(0F, 0F, 0F, 12, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[905].setRotationPoint(-5F, -30F, -10F);

		bodyModel[906].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Du loco part08
		bodyModel[906].setRotationPoint(-7F, -30F, -7F);

		bodyModel[907].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[907].setRotationPoint(-8F, -30F, -5F);

		bodyModel[908].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Du loco part08
		bodyModel[908].setRotationPoint(-9F, -30F, -1F);

		bodyModel[909].addShapeBox(0F, 0F, 0F, 12, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[909].setRotationPoint(87F, -30F, -10F);

		bodyModel[910].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Du loco part08
		bodyModel[910].setRotationPoint(99F, -30F, -7F);

		bodyModel[911].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[911].setRotationPoint(101F, -30F, -5F);

		bodyModel[912].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Du loco part08
		bodyModel[912].setRotationPoint(102F, -30F, -1F);

		bodyModel[913].addShapeBox(0F, 0F, 0F, 2, 20, 20, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -18F, -1.5F, 0F, -18F, 0F, -18F, 0F, -2F, -18F, 0F, -2F, -18F, -18F, 0F, -18F, -18F); // Du loco part82
		bodyModel[913].setRotationPoint(99F, -23.01F, 6.5F);

		bodyModel[914].addShapeBox(0F, 0F, 0F, 2, 20, 40, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -36F, -1.5F, 0F, -36F, 0F, -18F, 0F, -2F, -18F, 0F, -2F, -18F, -36F, 0F, -18F, -36F); // Du loco part82
		bodyModel[914].setRotationPoint(99F, -23.01F, 2F);

		bodyModel[915].addShapeBox(0F, 0F, 0F, 2, 20, 20, 0F,-0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -18F, -0.5F, 0F, -18F, -2F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, -18F, -2F, -18F, -18F); // Du loco part82
		bodyModel[915].setRotationPoint(-7F, -23.01F, -8.5F);

		bodyModel[916].addShapeBox(0F, 0F, 0F, 2, 20, 40, 0F,-0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -36F, -0.5F, 0F, -36F, -2F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, -36F, -2F, -18F, -36F); // Du loco part82
		bodyModel[916].setRotationPoint(-7F, -23.01F, -6F);

		bodyModel[917].addShapeBox(0F, 0F, 0F, 1, 64, 64, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -61F, -0.5F, 0F, -61F, -0.5F, -61F, 0F, -0.5F, -61F, 0F, -0.5F, -61F, -61F, -0.5F, -61F, -61F); // Du loco part19
		bodyModel[917].setRotationPoint(-10.55F, -20.5F, -1.5F);

		bodyModel[918].addShapeBox(0F, 0F, 0F, 1, 64, 64, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -61F, -0.5F, 0F, -61F, -0.5F, -61F, 0F, -0.5F, -61F, 0F, -0.5F, -61F, -61F, -0.5F, -61F, -61F); // Du loco part19
		bodyModel[918].setRotationPoint(103.55F, -20.5F, -1.5F);

		bodyModel[919].addShapeBox(0F, 0F, 0F, 64, 64, 0, 0F,-49F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -49F, 0F, 0F, -49F, -49F, 0F, 0F, -49F, 0F, 0F, -49F, 0F, -49F, -49F, 0F); // Du loco part19
		bodyModel[919].setRotationPoint(-9.5F, -29F, -11.26F);

		bodyModel[920].addShapeBox(0F, 0F, 0F, 64, 64, 0, 0F,-49F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -49F, 0F, 0F, -49F, -49F, 0F, 0F, -49F, 0F, 0F, -49F, 0F, -49F, -49F, 0F); // Du loco part19
		bodyModel[920].setRotationPoint(-9.5F, -29F, 11.26F);

		bodyModel[921].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[921].setRotationPoint(13F, -8F, 10F);

		bodyModel[922].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[922].setRotationPoint(12F, -7F, 10F);

		bodyModel[923].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[923].setRotationPoint(11F, -8F, 10F);

		bodyModel[924].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[924].setRotationPoint(82F, -8F, 10F);

		bodyModel[925].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[925].setRotationPoint(81F, -7F, 10F);

		bodyModel[926].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[926].setRotationPoint(80F, -8F, 10F);

		bodyModel[927].addShapeBox(0F, 0F, 0F, 64, 64, 0, 0F,-56F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -56F, 0F, 0F, -56F, -56F, 0F, 0F, -56F, 0F, 0F, -56F, 0F, -56F, -56F, 0F); // Du loco part19
		bodyModel[927].setRotationPoint(-48F, -15F, 11.26F);

		bodyModel[928].addShapeBox(0F, 0F, 0F, 64, 64, 0, 0F,-56F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -56F, 0F, 0F, -56F, -56F, 0F, 0F, -56F, 0F, 0F, -56F, 0F, -56F, -56F, 0F); // Du loco part19
		bodyModel[928].setRotationPoint(22F, -15F, -11.26F);

		bodyModel[929].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Du loco part19
		bodyModel[929].setRotationPoint(103F, -29F, 1F);

		bodyModel[930].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[930].setRotationPoint(100F, -28.5F, 9F);

		bodyModel[931].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, -0.75F, -0.125F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.125F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[931].setRotationPoint(102.75F, -28.5F, -3F);

		bodyModel[932].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[932].setRotationPoint(102F, -23.5F, -5F);

		bodyModel[933].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Du loco part05
		bodyModel[933].setRotationPoint(102F, -28.5F, -5F);

		bodyModel[934].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[934].setRotationPoint(103F, -29F, -2F);

		bodyModel[935].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.125F, -0.25F, -0.75F, -0.125F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.125F, -0.25F, -0.75F, -0.125F, -0.25F, -0.75F); // Du loco part05
		bodyModel[935].setRotationPoint(100.5F, -28.5F, -9F);

		bodyModel[936].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part05
		bodyModel[936].setRotationPoint(100.5F, -23.5F, -9F);

		bodyModel[937].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Du loco part05
		bodyModel[937].setRotationPoint(100.5F, -28.5F, -9F);

		bodyModel[938].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part19
		bodyModel[938].setRotationPoint(100F, -28.5F, -10F);

		bodyModel[939].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[939].setRotationPoint(92F, -23F, 10F);

		bodyModel[940].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[940].setRotationPoint(92F, -28F, 10F);

		bodyModel[941].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[941].setRotationPoint(92F, -28F, 10F);

		bodyModel[942].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[942].setRotationPoint(98F, -28F, 10F);

		bodyModel[943].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F,0F, -0.75F, -0.05F, 0F, -0.75F, -0.05F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[943].setRotationPoint(9F, -30.25F, -10.88F);

		bodyModel[944].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F,0F, -0.75F, -0.05F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[944].setRotationPoint(9F, -30.75F, -10.75F);

		bodyModel[945].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F,0F, -0.75F, -0.05F, 0F, -0.75F, -0.05F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[945].setRotationPoint(9F, -31.25F, -10.55F);

		bodyModel[946].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F,0F, -0.75F, -0.05F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[946].setRotationPoint(9F, -31.75F, -10.42F);

		bodyModel[947].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F,0F, -0.75F, -0.05F, 0F, -0.75F, -0.05F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[947].setRotationPoint(9F, -32.25F, -10.2F);

		bodyModel[948].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F,0F, -0.75F, -0.05F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[948].setRotationPoint(9F, -32.75F, -10.07F);

		bodyModel[949].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[949].setRotationPoint(19.75F, -32F, -11F);

		bodyModel[950].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[950].setRotationPoint(25.75F, -32F, -11F);

		bodyModel[951].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[951].setRotationPoint(31.75F, -32F, -11F);

		bodyModel[952].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[952].setRotationPoint(37.75F, -32F, -11F);

		bodyModel[953].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[953].setRotationPoint(43.75F, -32F, -11F);

		bodyModel[954].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[954].setRotationPoint(49.75F, -32F, -11F);

		bodyModel[955].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[955].setRotationPoint(55.75F, -32F, -11F);

		bodyModel[956].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[956].setRotationPoint(61.75F, -32F, -11F);

		bodyModel[957].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[957].setRotationPoint(67.75F, -32F, -11F);

		bodyModel[958].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[958].setRotationPoint(73.75F, -32F, -11F);

		bodyModel[959].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[959].setRotationPoint(79.75F, -32F, -11F);

		bodyModel[960].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, -0.75F, 0F, -1.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1.25F, -0.75F, 0F); // Du loco part28
		bodyModel[960].setRotationPoint(102F, -21F, -8F);

		bodyModel[961].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0.25F, -1.5F, 0F, 0.25F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, -0.75F, 0.25F, -1.5F, -0.75F, 0.25F, -0.5F, -0.75F, 0F, -1.25F, -0.75F, 0F); // Du loco part28
		bodyModel[961].setRotationPoint(100F, -21F, -11F);

		bodyModel[962].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 135
		bodyModel[962].setRotationPoint(-6F, -22F, -11F);

		bodyModel[963].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[963].setRotationPoint(-5F, -23F, -11F);

		bodyModel[964].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[964].setRotationPoint(-5F, -28F, -11F);

		bodyModel[965].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[965].setRotationPoint(-1F, -28F, -11F);

		bodyModel[966].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 135
		bodyModel[966].setRotationPoint(-5F, -29F, -11F);

		bodyModel[967].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 135
		bodyModel[967].setRotationPoint(0F, -28F, -11F);

		bodyModel[968].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[968].setRotationPoint(1F, -29F, -11F);

		bodyModel[969].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[969].setRotationPoint(2.5F, -22F, -11F);

		bodyModel[970].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part05
		bodyModel[970].setRotationPoint(1.5F, -29F, -11F);

		bodyModel[971].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[971].setRotationPoint(5.5F, -29F, -11F);

		bodyModel[972].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 135
		bodyModel[972].setRotationPoint(2.5F, -29F, -11F);

		bodyModel[973].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 135
		bodyModel[973].setRotationPoint(6F, -29F, -11F);

		bodyModel[974].addBox(0F, 0F, 0F, 5, 6, 1, 0F); // Box 135
		bodyModel[974].setRotationPoint(2F, -28F, -11F);

		bodyModel[975].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 135
		bodyModel[975].setRotationPoint(1F, -29F, -11F);

		bodyModel[976].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[976].setRotationPoint(2F, -8.5F, -11F);

		bodyModel[977].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[977].setRotationPoint(2F, -10.5F, -11F);

		bodyModel[978].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[978].setRotationPoint(1F, -12F, -11F);

		bodyModel[979].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[979].setRotationPoint(6F, -12F, -11F);

		bodyModel[980].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 135
		bodyModel[980].setRotationPoint(2F, -12F, -11F);

		bodyModel[981].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 135
		bodyModel[981].setRotationPoint(2F, -11.75F, -11F);

		bodyModel[982].addBox(0F, 0F, 0F, 6, 10, 1, 0F); // Box 135
		bodyModel[982].setRotationPoint(1F, -22F, -11F);

		bodyModel[983].addBox(0F, 0F, 0F, 6, 21, 1, 0F); // Box 135
		bodyModel[983].setRotationPoint(24F, -29F, -11F);

		bodyModel[984].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Du loco part28
		bodyModel[984].setRotationPoint(1.25F, -21F, -11.5F);

		bodyModel[985].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[985].setRotationPoint(0.25F, -21F, -11.25F);

		bodyModel[986].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[986].setRotationPoint(6.5F, -21F, -11.25F);

		bodyModel[987].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[987].setRotationPoint(6.5F, -13.5F, -11.25F);

		bodyModel[988].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[988].setRotationPoint(1.25F, -13.5F, -11.25F);

		bodyModel[989].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[989].setRotationPoint(1.25F, -27F, -11.5F);

		bodyModel[990].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Du loco part28
		bodyModel[990].setRotationPoint(6.5F, -21F, -11.5F);

		bodyModel[991].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[991].setRotationPoint(6.5F, -27F, -11.5F);

		bodyModel[992].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[992].setRotationPoint(1.25F, -27F, -11.25F);

		bodyModel[993].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[993].setRotationPoint(6.5F, -27F, -11.25F);

		bodyModel[994].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[994].setRotationPoint(13.75F, -32F, 10F);

		bodyModel[995].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.05F, 0F, -0.75F, -0.05F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[995].setRotationPoint(9F, -30.25F, 9.88F);

		bodyModel[996].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.05F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[996].setRotationPoint(9F, -30.75F, 9.75F);

		bodyModel[997].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.05F, 0F, -0.75F, -0.05F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[997].setRotationPoint(9F, -31.25F, 9.55F);

		bodyModel[998].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.05F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[998].setRotationPoint(9F, -31.75F, 9.42F);

		bodyModel[999].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.05F, 0F, -0.75F, -0.05F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[999].setRotationPoint(9F, -32.25F, 9.2F);
	}

	private void initbodyModel_3()
	{
		bodyModel[1000] = new ModelRendererTurbo(this, 55, 373, textureX, textureY); // Box 168
		bodyModel[1001] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[1002] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[1003] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[1004] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[1005] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[1006] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[1007] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[1008] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[1009] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[1010] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[1011] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[1012] = new ModelRendererTurbo(this, 127, 397, textureX, textureY); // Du loco part28
		bodyModel[1013] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Du loco part28
		bodyModel[1014] = new ModelRendererTurbo(this, 114, 394, textureX, textureY); // Du loco part28
		bodyModel[1015] = new ModelRendererTurbo(this, 137, 393, textureX, textureY); // Du loco part28
		bodyModel[1016] = new ModelRendererTurbo(this, 116, 396, textureX, textureY); // Du loco part28
		bodyModel[1017] = new ModelRendererTurbo(this, 115, 395, textureX, textureY); // Du loco part28
		bodyModel[1018] = new ModelRendererTurbo(this, 117, 397, textureX, textureY); // Du loco part28
		bodyModel[1019] = new ModelRendererTurbo(this, 127, 397, textureX, textureY); // Du loco part28
		bodyModel[1020] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Du loco part28
		bodyModel[1021] = new ModelRendererTurbo(this, 400, 462, textureX, textureY); // Box 135
		bodyModel[1022] = new ModelRendererTurbo(this, 391, 462, textureX, textureY); // Box 135
		bodyModel[1023] = new ModelRendererTurbo(this, 400, 462, textureX, textureY); // Du loco part05
		bodyModel[1024] = new ModelRendererTurbo(this, 400, 462, textureX, textureY); // Du loco part05
		bodyModel[1025] = new ModelRendererTurbo(this, 391, 474, textureX, textureY); // Box 135
		bodyModel[1026] = new ModelRendererTurbo(this, 400, 462, textureX, textureY); // Box 135
		bodyModel[1027] = new ModelRendererTurbo(this, 391, 446, textureX, textureY); // Box 135
		bodyModel[1028] = new ModelRendererTurbo(this, 388, 481, textureX, textureY); // Box 135
		bodyModel[1029] = new ModelRendererTurbo(this, 435, 241, textureX, textureY); // Du loco part05
		bodyModel[1030] = new ModelRendererTurbo(this, 459, 241, textureX, textureY); // Du loco part05
		bodyModel[1031] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Du loco part05
		bodyModel[1032] = new ModelRendererTurbo(this, 355, 409, textureX, textureY); // Box 135
		bodyModel[1033] = new ModelRendererTurbo(this, 424, 411, textureX, textureY); // Box 135
		bodyModel[1034] = new ModelRendererTurbo(this, 424, 433, textureX, textureY); // Box 135
		bodyModel[1035] = new ModelRendererTurbo(this, 392, 411, textureX, textureY); // Box 135
		bodyModel[1036] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 135
		bodyModel[1037] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 135
		bodyModel[1038] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 135
		bodyModel[1039] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 135
		bodyModel[1040] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 135
		bodyModel[1041] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 135
		bodyModel[1042] = new ModelRendererTurbo(this, 515, 225, textureX, textureY); // Du loco part28
		bodyModel[1043] = new ModelRendererTurbo(this, 510, 225, textureX, textureY); // Du loco part28
		bodyModel[1044] = new ModelRendererTurbo(this, 515, 225, textureX, textureY); // Du loco part28
		bodyModel[1045] = new ModelRendererTurbo(this, 510, 225, textureX, textureY); // Du loco part28
		bodyModel[1046] = new ModelRendererTurbo(this, 323, 213, textureX, textureY); // Du loco part28
		bodyModel[1047] = new ModelRendererTurbo(this, 323, 213, textureX, textureY); // Du loco part28
		bodyModel[1048] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Du loco part28
		bodyModel[1049] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Du loco part28
		bodyModel[1050] = new ModelRendererTurbo(this, 329, 213, textureX, textureY); // Du loco part28
		bodyModel[1051] = new ModelRendererTurbo(this, 329, 213, textureX, textureY); // Du loco part28
		bodyModel[1052] = new ModelRendererTurbo(this, 392, 423, textureX, textureY); // Box 135
		bodyModel[1053] = new ModelRendererTurbo(this, 113, 393, textureX, textureY); // Du loco part28
		bodyModel[1054] = new ModelRendererTurbo(this, 114, 394, textureX, textureY); // Du loco part28
		bodyModel[1055] = new ModelRendererTurbo(this, 137, 393, textureX, textureY); // Du loco part28
		bodyModel[1056] = new ModelRendererTurbo(this, 116, 396, textureX, textureY); // Du loco part28
		bodyModel[1057] = new ModelRendererTurbo(this, 115, 395, textureX, textureY); // Du loco part28
		bodyModel[1058] = new ModelRendererTurbo(this, 117, 397, textureX, textureY); // Du loco part28
		bodyModel[1059] = new ModelRendererTurbo(this, 127, 397, textureX, textureY); // Du loco part28
		bodyModel[1060] = new ModelRendererTurbo(this, 329, 213, textureX, textureY); // Du loco part28
		bodyModel[1061] = new ModelRendererTurbo(this, 114, 394, textureX, textureY); // Du loco part28
		bodyModel[1062] = new ModelRendererTurbo(this, 137, 393, textureX, textureY); // Du loco part28
		bodyModel[1063] = new ModelRendererTurbo(this, 116, 396, textureX, textureY); // Du loco part28
		bodyModel[1064] = new ModelRendererTurbo(this, 115, 395, textureX, textureY); // Du loco part28
		bodyModel[1065] = new ModelRendererTurbo(this, 117, 397, textureX, textureY); // Du loco part28
		bodyModel[1066] = new ModelRendererTurbo(this, 127, 397, textureX, textureY); // Du loco part28
		bodyModel[1067] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Du loco part28
		bodyModel[1068] = new ModelRendererTurbo(this, 96, 87, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[1069] = new ModelRendererTurbo(this, 111, 92, textureX, textureY); // Lamp
		bodyModel[1070] = new ModelRendererTurbo(this, 111, 87, textureX, textureY); // Lamp
		bodyModel[1071] = new ModelRendererTurbo(this, 120, 87, textureX, textureY); // Lamp
		bodyModel[1072] = new ModelRendererTurbo(this, 106, 74, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[1073] = new ModelRendererTurbo(this, 139, 74, textureX, textureY); // Lamp
		bodyModel[1074] = new ModelRendererTurbo(this, 121, 74, textureX, textureY); // Lamp
		bodyModel[1075] = new ModelRendererTurbo(this, 130, 74, textureX, textureY); // Lamp
		bodyModel[1076] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1077] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1078] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1079] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1080] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1081] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1082] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1083] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1084] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1085] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1086] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1087] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1088] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1089] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1090] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1091] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1092] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1093] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1094] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1095] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1096] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1097] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1098] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1099] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1100] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1101] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1102] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1103] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1104] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1105] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1106] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1107] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1108] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1109] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1110] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1111] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1112] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1113] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1114] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1115] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1116] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1117] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1118] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1119] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1120] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1121] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1122] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1123] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1124] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1125] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1126] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1127] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1128] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1129] = new ModelRendererTurbo(this, 63, 376, textureX, textureY); // Box 168
		bodyModel[1130] = new ModelRendererTurbo(this, 63, 376, textureX, textureY); // Box 168
		bodyModel[1131] = new ModelRendererTurbo(this, 73, 299, textureX, textureY); // Box 156
		bodyModel[1132] = new ModelRendererTurbo(this, 67, 299, textureX, textureY); // Box 154
		bodyModel[1133] = new ModelRendererTurbo(this, 70, 298, textureX, textureY); // Box 154
		bodyModel[1134] = new ModelRendererTurbo(this, 73, 299, textureX, textureY); // Box 156
		bodyModel[1135] = new ModelRendererTurbo(this, 67, 299, textureX, textureY); // Box 154
		bodyModel[1136] = new ModelRendererTurbo(this, 70, 298, textureX, textureY); // Box 154
		bodyModel[1137] = new ModelRendererTurbo(this, 73, 299, textureX, textureY); // Box 156
		bodyModel[1138] = new ModelRendererTurbo(this, 73, 299, textureX, textureY); // Box 156
		bodyModel[1139] = new ModelRendererTurbo(this, 171, 94, textureX, textureY); // Lamp
		bodyModel[1140] = new ModelRendererTurbo(this, 158, 94, textureX, textureY); // Lamp
		bodyModel[1141] = new ModelRendererTurbo(this, 145, 94, textureX, textureY); // Lamp
		bodyModel[1142] = new ModelRendererTurbo(this, 360, 249, textureX, textureY); // Lamp
		bodyModel[1143] = new ModelRendererTurbo(this, 400, 249, textureX, textureY); // Lamp
		bodyModel[1144] = new ModelRendererTurbo(this, 432, 249, textureX, textureY); // Lamp
		bodyModel[1145] = new ModelRendererTurbo(this, 360, 253, textureX, textureY); // Lamp
		bodyModel[1146] = new ModelRendererTurbo(this, 398, 253, textureX, textureY); // Lamp
		bodyModel[1147] = new ModelRendererTurbo(this, 432, 253, textureX, textureY); // Lamp
		bodyModel[1148] = new ModelRendererTurbo(this, 360, 253, textureX, textureY); // Lamp
		bodyModel[1149] = new ModelRendererTurbo(this, 398, 253, textureX, textureY); // Lamp
		bodyModel[1150] = new ModelRendererTurbo(this, 432, 253, textureX, textureY); // Lamp
		bodyModel[1151] = new ModelRendererTurbo(this, 357, 90, textureX, textureY); // Du loco part19
		bodyModel[1152] = new ModelRendererTurbo(this, 357, 90, textureX, textureY); // Du loco part19
		bodyModel[1153] = new ModelRendererTurbo(this, 481, 78, textureX, textureY); // Box 168
		bodyModel[1154] = new ModelRendererTurbo(this, 481, 78, textureX, textureY); // Box 168
		bodyModel[1155] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Du loco part05
		bodyModel[1156] = new ModelRendererTurbo(this, 265, 68, textureX, textureY); // Du loco part05
		bodyModel[1157] = new ModelRendererTurbo(this, 270, 65, textureX, textureY); // Du loco part05
		bodyModel[1158] = new ModelRendererTurbo(this, 265, 68, textureX, textureY); // Du loco part05
		bodyModel[1159] = new ModelRendererTurbo(this, 270, 65, textureX, textureY); // Du loco part05
		bodyModel[1160] = new ModelRendererTurbo(this, 265, 68, textureX, textureY); // Du loco part05
		bodyModel[1161] = new ModelRendererTurbo(this, 270, 65, textureX, textureY); // Du loco part05
		bodyModel[1162] = new ModelRendererTurbo(this, 265, 68, textureX, textureY); // Du loco part05
		bodyModel[1163] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1164] = new ModelRendererTurbo(this, 417, 278, textureX, textureY); // Du loco part06
		bodyModel[1165] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1166] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Du loco part06
		bodyModel[1167] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Du loco part06
		bodyModel[1168] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1169] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Du loco part06
		bodyModel[1170] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1171] = new ModelRendererTurbo(this, 417, 278, textureX, textureY); // Du loco part06
		bodyModel[1172] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1173] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Du loco part06
		bodyModel[1174] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Du loco part06
		bodyModel[1175] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1176] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Du loco part06
		bodyModel[1177] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1178] = new ModelRendererTurbo(this, 417, 278, textureX, textureY); // Du loco part06
		bodyModel[1179] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1180] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Du loco part06
		bodyModel[1181] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Du loco part06
		bodyModel[1182] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1183] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Du loco part06
		bodyModel[1184] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1185] = new ModelRendererTurbo(this, 417, 278, textureX, textureY); // Du loco part06
		bodyModel[1186] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1187] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Du loco part06
		bodyModel[1188] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Du loco part06
		bodyModel[1189] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1190] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Du loco part06
		bodyModel[1191] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1192] = new ModelRendererTurbo(this, 417, 278, textureX, textureY); // Du loco part06
		bodyModel[1193] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1194] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Du loco part06
		bodyModel[1195] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Du loco part06
		bodyModel[1196] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1197] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Du loco part06
		bodyModel[1198] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1199] = new ModelRendererTurbo(this, 417, 278, textureX, textureY); // Du loco part06
		bodyModel[1200] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1201] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Du loco part06
		bodyModel[1202] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Du loco part06
		bodyModel[1203] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1204] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Du loco part06
		bodyModel[1205] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1206] = new ModelRendererTurbo(this, 417, 278, textureX, textureY); // Du loco part06
		bodyModel[1207] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1208] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Du loco part06
		bodyModel[1209] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Du loco part06
		bodyModel[1210] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1211] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Du loco part06
		bodyModel[1212] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1213] = new ModelRendererTurbo(this, 417, 278, textureX, textureY); // Du loco part06
		bodyModel[1214] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[1215] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Du loco part05
		bodyModel[1216] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Du loco part05
		bodyModel[1217] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Du loco part05
		bodyModel[1218] = new ModelRendererTurbo(this, 50, 210, textureX, textureY); // Du loco part05
		bodyModel[1219] = new ModelRendererTurbo(this, 482, 210, textureX, textureY); // Du loco part05
		bodyModel[1220] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Du loco part05
		bodyModel[1221] = new ModelRendererTurbo(this, 450, 210, textureX, textureY); // Du loco part05
		bodyModel[1222] = new ModelRendererTurbo(this, 2, 218, textureX, textureY); // Du loco part05
		bodyModel[1223] = new ModelRendererTurbo(this, 184, 99, textureX, textureY); // Lamp
		bodyModel[1224] = new ModelRendererTurbo(this, 171, 99, textureX, textureY); // Lamp
		bodyModel[1225] = new ModelRendererTurbo(this, 158, 99, textureX, textureY); // Lamp
		bodyModel[1226] = new ModelRendererTurbo(this, 171, 94, textureX, textureY); // Lamp
		bodyModel[1227] = new ModelRendererTurbo(this, 158, 94, textureX, textureY); // Lamp
		bodyModel[1228] = new ModelRendererTurbo(this, 145, 94, textureX, textureY); // Lamp
		bodyModel[1229] = new ModelRendererTurbo(this, 184, 99, textureX, textureY); // Lamp
		bodyModel[1230] = new ModelRendererTurbo(this, 171, 99, textureX, textureY); // Lamp
		bodyModel[1231] = new ModelRendererTurbo(this, 158, 99, textureX, textureY); // Lamp
		bodyModel[1232] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Du loco part05
		bodyModel[1233] = new ModelRendererTurbo(this, 411, 98, textureX, textureY); // Du loco part05
		bodyModel[1234] = new ModelRendererTurbo(this, 5, 106, textureX, textureY); // Du loco part05
		bodyModel[1235] = new ModelRendererTurbo(this, 104, 210, textureX, textureY); // Du loco part19
		bodyModel[1236] = new ModelRendererTurbo(this, 104, 210, textureX, textureY); // Du loco part19
		bodyModel[1237] = new ModelRendererTurbo(this, 276, 65, textureX, textureY); // Du loco part05
		bodyModel[1238] = new ModelRendererTurbo(this, 276, 65, textureX, textureY); // Du loco part05
		bodyModel[1239] = new ModelRendererTurbo(this, 306, 50, textureX, textureY); // Du loco part05
		bodyModel[1240] = new ModelRendererTurbo(this, 301, 50, textureX, textureY); // Du loco part05
		bodyModel[1241] = new ModelRendererTurbo(this, 276, 65, textureX, textureY); // Du loco part05
		bodyModel[1242] = new ModelRendererTurbo(this, 270, 68, textureX, textureY); // Du loco part05
		bodyModel[1243] = new ModelRendererTurbo(this, 276, 65, textureX, textureY); // Du loco part05
		bodyModel[1244] = new ModelRendererTurbo(this, 270, 68, textureX, textureY); // Du loco part05
		bodyModel[1245] = new ModelRendererTurbo(this, 276, 65, textureX, textureY); // Du loco part05
		bodyModel[1246] = new ModelRendererTurbo(this, 270, 68, textureX, textureY); // Du loco part05
		bodyModel[1247] = new ModelRendererTurbo(this, 276, 65, textureX, textureY); // Du loco part05
		bodyModel[1248] = new ModelRendererTurbo(this, 270, 68, textureX, textureY); // Du loco part05
		bodyModel[1249] = new ModelRendererTurbo(this, 276, 65, textureX, textureY); // Du loco part05
		bodyModel[1250] = new ModelRendererTurbo(this, 276, 65, textureX, textureY); // Du loco part05
		bodyModel[1251] = new ModelRendererTurbo(this, 306, 50, textureX, textureY); // Du loco part05
		bodyModel[1252] = new ModelRendererTurbo(this, 301, 50, textureX, textureY); // Du loco part05
		bodyModel[1253] = new ModelRendererTurbo(this, 276, 65, textureX, textureY); // Du loco part05
		bodyModel[1254] = new ModelRendererTurbo(this, 270, 71, textureX, textureY); // Du loco part05
		bodyModel[1255] = new ModelRendererTurbo(this, 276, 65, textureX, textureY); // Du loco part05
		bodyModel[1256] = new ModelRendererTurbo(this, 270, 71, textureX, textureY); // Du loco part05
		bodyModel[1257] = new ModelRendererTurbo(this, 276, 65, textureX, textureY); // Du loco part05
		bodyModel[1258] = new ModelRendererTurbo(this, 270, 71, textureX, textureY); // Du loco part05
		bodyModel[1259] = new ModelRendererTurbo(this, 276, 65, textureX, textureY); // Du loco part05
		bodyModel[1260] = new ModelRendererTurbo(this, 270, 71, textureX, textureY); // Du loco part05
		bodyModel[1261] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Du loco part05
		bodyModel[1262] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Du loco part05
		bodyModel[1263] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Du loco part05
		bodyModel[1264] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Du loco part05
		bodyModel[1265] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Du loco part05
		bodyModel[1266] = new ModelRendererTurbo(this, 265, 71, textureX, textureY); // Du loco part05
		bodyModel[1267] = new ModelRendererTurbo(this, 270, 65, textureX, textureY); // Du loco part05
		bodyModel[1268] = new ModelRendererTurbo(this, 265, 71, textureX, textureY); // Du loco part05
		bodyModel[1269] = new ModelRendererTurbo(this, 270, 65, textureX, textureY); // Du loco part05
		bodyModel[1270] = new ModelRendererTurbo(this, 265, 71, textureX, textureY); // Du loco part05
		bodyModel[1271] = new ModelRendererTurbo(this, 270, 65, textureX, textureY); // Du loco part05
		bodyModel[1272] = new ModelRendererTurbo(this, 265, 71, textureX, textureY); // Du loco part05
		bodyModel[1273] = new ModelRendererTurbo(this, 233, 393, textureX, textureY); // Du loco part28
		bodyModel[1274] = new ModelRendererTurbo(this, 241, 393, textureX, textureY); // Du loco part28
		bodyModel[1275] = new ModelRendererTurbo(this, 249, 393, textureX, textureY); // Du loco part28
		bodyModel[1276] = new ModelRendererTurbo(this, 265, 393, textureX, textureY); // Du loco part28
		bodyModel[1277] = new ModelRendererTurbo(this, 481, 78, textureX, textureY); // Box 168
		bodyModel[1278] = new ModelRendererTurbo(this, 481, 78, textureX, textureY); // Box 168
		bodyModel[1279] = new ModelRendererTurbo(this, 107, 186, textureX, textureY); // Box 168
		bodyModel[1280] = new ModelRendererTurbo(this, 138, 185, textureX, textureY); // Box 168
		bodyModel[1281] = new ModelRendererTurbo(this, 378, 185, textureX, textureY); // Box 168
		bodyModel[1282] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Du loco part05
		bodyModel[1283] = new ModelRendererTurbo(this, 491, 186, textureX, textureY); // Box 168
		bodyModel[1284] = new ModelRendererTurbo(this, 170, 185, textureX, textureY); // Box 168
		bodyModel[1285] = new ModelRendererTurbo(this, 90, 193, textureX, textureY); // Box 168
		bodyModel[1286] = new ModelRendererTurbo(this, 66, 226, textureX, textureY); // Box 168
		bodyModel[1287] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 168
		bodyModel[1288] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 168
		bodyModel[1289] = new ModelRendererTurbo(this, 498, 218, textureX, textureY); // Box 168
		bodyModel[1290] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 168
		bodyModel[1291] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 168
		bodyModel[1292] = new ModelRendererTurbo(this, 2, 258, textureX, textureY); // Du loco part37
		bodyModel[1293] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1294] = new ModelRendererTurbo(this, 289, 393, textureX, textureY); // Du loco part28
		bodyModel[1295] = new ModelRendererTurbo(this, 297, 393, textureX, textureY); // Du loco part28
		bodyModel[1296] = new ModelRendererTurbo(this, 313, 393, textureX, textureY); // Du loco part28
		bodyModel[1297] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Du loco part37
		bodyModel[1298] = new ModelRendererTurbo(this, 463, 258, textureX, textureY); // Du loco part37
		bodyModel[1299] = new ModelRendererTurbo(this, 463, 258, textureX, textureY); // Du loco part37
		bodyModel[1300] = new ModelRendererTurbo(this, 184, 293, textureX, textureY); // Du loco part06
		bodyModel[1301] = new ModelRendererTurbo(this, 184, 293, textureX, textureY); // Du loco part06
		bodyModel[1302] = new ModelRendererTurbo(this, 184, 293, textureX, textureY); // Du loco part06
		bodyModel[1303] = new ModelRendererTurbo(this, 184, 293, textureX, textureY); // Du loco part06
		bodyModel[1304] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1305] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1306] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1307] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1308] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1309] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1310] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1311] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1312] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1313] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1314] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1315] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1316] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1317] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1318] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1319] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1320] = new ModelRendererTurbo(this, 184, 293, textureX, textureY); // Du loco part06
		bodyModel[1321] = new ModelRendererTurbo(this, 184, 293, textureX, textureY); // Du loco part06
		bodyModel[1322] = new ModelRendererTurbo(this, 184, 293, textureX, textureY); // Du loco part06
		bodyModel[1323] = new ModelRendererTurbo(this, 184, 293, textureX, textureY); // Du loco part06
		bodyModel[1324] = new ModelRendererTurbo(this, 151, 418, textureX, textureY); // Du loco part28
		bodyModel[1325] = new ModelRendererTurbo(this, 151, 427, textureX, textureY); // Du loco part28
		bodyModel[1326] = new ModelRendererTurbo(this, 151, 436, textureX, textureY); // Du loco part28
		bodyModel[1327] = new ModelRendererTurbo(this, 257, 477, textureX, textureY); // Du loco part28
		bodyModel[1328] = new ModelRendererTurbo(this, 257, 459, textureX, textureY); // Du loco part28
		bodyModel[1329] = new ModelRendererTurbo(this, 257, 441, textureX, textureY); // Du loco part28
		bodyModel[1330] = new ModelRendererTurbo(this, 391, 396, textureX, textureY); // Du loco part28
		bodyModel[1331] = new ModelRendererTurbo(this, 376, 392, textureX, textureY); // Du loco part28
		bodyModel[1332] = new ModelRendererTurbo(this, 391, 396, textureX, textureY); // Du loco part28
		bodyModel[1333] = new ModelRendererTurbo(this, 376, 392, textureX, textureY); // Du loco part28
		bodyModel[1334] = new ModelRendererTurbo(this, 391, 396, textureX, textureY); // Du loco part28
		bodyModel[1335] = new ModelRendererTurbo(this, 376, 392, textureX, textureY); // Du loco part28
		bodyModel[1336] = new ModelRendererTurbo(this, 391, 396, textureX, textureY); // Du loco part28
		bodyModel[1337] = new ModelRendererTurbo(this, 376, 392, textureX, textureY); // Du loco part28
		bodyModel[1338] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1339] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1340] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1341] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1342] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1343] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1344] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1345] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1346] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1347] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1348] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1349] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1350] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1351] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1352] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1353] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1354] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1355] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1356] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1357] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1358] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1359] = new ModelRendererTurbo(this, 143, 6, textureX, textureY); // Du loco part82
		bodyModel[1360] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1361] = new ModelRendererTurbo(this, 142, 5, textureX, textureY); // Du loco part82
		bodyModel[1362] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1363] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1364] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1365] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1366] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1367] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1368] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1369] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1370] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1371] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1372] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1373] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1374] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1375] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1376] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1377] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1378] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1379] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1380] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1381] = new ModelRendererTurbo(this, 143, 6, textureX, textureY); // Du loco part82
		bodyModel[1382] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1383] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82

		bodyModel[1000].addShapeBox(0F, 0F, 0F, 76, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.1F, 0F, -0.75F, -0.05F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1000].setRotationPoint(9F, -32.75F, 9.07F);

		bodyModel[1001].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1001].setRotationPoint(19.75F, -32F, 10F);

		bodyModel[1002].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1002].setRotationPoint(25.75F, -32F, 10F);

		bodyModel[1003].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1003].setRotationPoint(31.75F, -32F, 10F);

		bodyModel[1004].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1004].setRotationPoint(37.75F, -32F, 10F);

		bodyModel[1005].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1005].setRotationPoint(43.75F, -32F, 10F);

		bodyModel[1006].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1006].setRotationPoint(49.75F, -32F, 10F);

		bodyModel[1007].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1007].setRotationPoint(55.75F, -32F, 10F);

		bodyModel[1008].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1008].setRotationPoint(61.75F, -32F, 10F);

		bodyModel[1009].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1009].setRotationPoint(67.75F, -32F, 10F);

		bodyModel[1010].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1010].setRotationPoint(73.75F, -32F, 10F);

		bodyModel[1011].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1011].setRotationPoint(79.75F, -32F, 10F);

		bodyModel[1012].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1012].setRotationPoint(93.25F, -21F, -11.5F);

		bodyModel[1013].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1013].setRotationPoint(93.25F, -21F, -11.25F);

		bodyModel[1014].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1.25F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part28
		bodyModel[1014].setRotationPoint(103F, -21F, 1F);

		bodyModel[1015].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part28
		bodyModel[1015].setRotationPoint(99.75F, -21F, 9.75F);

		bodyModel[1016].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1.25F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part28
		bodyModel[1016].setRotationPoint(101F, -21F, 8F);

		bodyModel[1017].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1.25F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part28
		bodyModel[1017].setRotationPoint(102F, -21F, 5F);

		bodyModel[1018].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -1.25F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1.5F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F); // Du loco part28
		bodyModel[1018].setRotationPoint(100F, -21F, 10F);

		bodyModel[1019].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part28
		bodyModel[1019].setRotationPoint(93.25F, -21F, 10.5F);

		bodyModel[1020].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[1020].setRotationPoint(93.25F, -21F, 10.25F);

		bodyModel[1021].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[1021].setRotationPoint(87F, -29F, 10F);

		bodyModel[1022].addShapeBox(0F, 0F, 0F, 3, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 135
		bodyModel[1022].setRotationPoint(88.5F, -22F, 10F);

		bodyModel[1023].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Du loco part05
		bodyModel[1023].setRotationPoint(87.5F, -29F, 10F);

		bodyModel[1024].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[1024].setRotationPoint(91.5F, -29F, 10F);

		bodyModel[1025].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F); // Box 135
		bodyModel[1025].setRotationPoint(88.5F, -29F, 10F);

		bodyModel[1026].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 135
		bodyModel[1026].setRotationPoint(92F, -29F, 10F);

		bodyModel[1027].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 135
		bodyModel[1027].setRotationPoint(93F, -22F, 10F);

		bodyModel[1028].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 135
		bodyModel[1028].setRotationPoint(93F, -29F, 10F);

		bodyModel[1029].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1029].setRotationPoint(94F, -23F, 10F);

		bodyModel[1030].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[1030].setRotationPoint(94F, -28F, 10F);

		bodyModel[1031].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[1031].setRotationPoint(94F, -28F, 10F);

		bodyModel[1032].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 135
		bodyModel[1032].setRotationPoint(93F, -28F, 10F);

		bodyModel[1033].addBox(0F, 0F, 0F, 5, 6, 1, 0F); // Box 135
		bodyModel[1033].setRotationPoint(87F, -28F, 10F);

		bodyModel[1034].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Box 135
		bodyModel[1034].setRotationPoint(87F, -29F, 10F);

		bodyModel[1035].addBox(0F, 0F, 0F, 6, 10, 1, 0F); // Box 135
		bodyModel[1035].setRotationPoint(87F, -22F, 10F);

		bodyModel[1036].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[1036].setRotationPoint(88F, -8.5F, 10F);

		bodyModel[1037].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[1037].setRotationPoint(88F, -10.5F, 10F);

		bodyModel[1038].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[1038].setRotationPoint(87F, -12F, 10F);

		bodyModel[1039].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[1039].setRotationPoint(92F, -12F, 10F);

		bodyModel[1040].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 135
		bodyModel[1040].setRotationPoint(88F, -12F, 10F);

		bodyModel[1041].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 135
		bodyModel[1041].setRotationPoint(88F, -11.75F, 10F);

		bodyModel[1042].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Du loco part28
		bodyModel[1042].setRotationPoint(87.25F, -21F, 11.25F);

		bodyModel[1043].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[1043].setRotationPoint(87.25F, -27F, 11.25F);

		bodyModel[1044].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Du loco part28
		bodyModel[1044].setRotationPoint(92.5F, -21F, 11.25F);

		bodyModel[1045].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[1045].setRotationPoint(92.5F, -27F, 11.25F);

		bodyModel[1046].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[1046].setRotationPoint(87.25F, -27F, 10.25F);

		bodyModel[1047].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[1047].setRotationPoint(92.5F, -27F, 10.25F);

		bodyModel[1048].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[1048].setRotationPoint(92.5F, -13.5F, 10.25F);

		bodyModel[1049].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[1049].setRotationPoint(87.25F, -13.5F, 10.25F);

		bodyModel[1050].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[1050].setRotationPoint(87.25F, -21F, 10.25F);

		bodyModel[1051].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[1051].setRotationPoint(92.5F, -21F, 10.25F);

		bodyModel[1052].addBox(0F, 0F, 0F, 6, 21, 1, 0F); // Box 135
		bodyModel[1052].setRotationPoint(64F, -29F, 10F);

		bodyModel[1053].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0.125F, -0.25F, 0F, 0.125F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F, 0.125F, -0.25F, -0.75F, 0.125F); // Du loco part28
		bodyModel[1053].setRotationPoint(-10.5F, -21F, -1F);

		bodyModel[1054].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1.5F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Du loco part28
		bodyModel[1054].setRotationPoint(-11F, -21F, -5F);

		bodyModel[1055].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1055].setRotationPoint(-7F, -21F, -10.75F);

		bodyModel[1056].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1.5F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Du loco part28
		bodyModel[1056].setRotationPoint(-9F, -21F, -10F);

		bodyModel[1057].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1.5F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Du loco part28
		bodyModel[1057].setRotationPoint(-10F, -21F, -8F);

		bodyModel[1058].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.5F, 0F, 0.25F, -0.25F, 0F, 0.25F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -1.25F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Du loco part28
		bodyModel[1058].setRotationPoint(-8F, -21F, -11F);

		bodyModel[1059].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1059].setRotationPoint(-6.5F, -21F, -11.5F);

		bodyModel[1060].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1060].setRotationPoint(1.25F, -21F, -11.25F);

		bodyModel[1061].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Du loco part28
		bodyModel[1061].setRotationPoint(-11F, -21F, 1F);

		bodyModel[1062].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part28
		bodyModel[1062].setRotationPoint(-7F, -21F, 9.75F);

		bodyModel[1063].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Du loco part28
		bodyModel[1063].setRotationPoint(-9F, -21F, 8F);

		bodyModel[1064].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Du loco part28
		bodyModel[1064].setRotationPoint(-10F, -21F, 5F);

		bodyModel[1065].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0.25F, -1.5F, 0F, 0.25F, -0.5F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.25F, -0.75F, 0.25F, -1.5F, -0.75F, 0.25F); // Du loco part28
		bodyModel[1065].setRotationPoint(-8F, -21F, 10F);

		bodyModel[1066].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part28
		bodyModel[1066].setRotationPoint(-6.5F, -21F, 10.5F);

		bodyModel[1067].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[1067].setRotationPoint(0.25F, -21F, 10.25F);

		bodyModel[1068].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Du loco part Ligjhtpart8
		bodyModel[1068].setRotationPoint(-8F, -32F, -1.5F);

		bodyModel[1069].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[1069].setRotationPoint(-11F, -32F, -2.5F);

		bodyModel[1070].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Lamp
		bodyModel[1070].setRotationPoint(-11F, -30F, -2.5F);

		bodyModel[1071].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[1071].setRotationPoint(-11F, -31F, -2.5F);

		bodyModel[1072].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -1F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Du loco part Ligjhtpart8
		bodyModel[1072].setRotationPoint(98F, -32F, -1.5F);

		bodyModel[1073].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1073].setRotationPoint(102F, -32F, -2.5F);

		bodyModel[1074].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[1074].setRotationPoint(104F, -30F, -2.5F);

		bodyModel[1075].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1075].setRotationPoint(104F, -31F, -2.5F);

		bodyModel[1076].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, -0.875F, -1.25F, -0.625F, -0.875F, -1.25F, -0.625F, 0F, -0.5F, -0.5F, 0F); // Du loco part28
		bodyModel[1076].setRotationPoint(-7F, -7F, 8F);

		bodyModel[1077].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1.125F, 0F, -0.875F, -0.625F, 0F, -0.875F, -0.625F, 0F, 0F, -1.125F, 0F, 0F, -0.625F, -0.125F, -0.875F, -1.125F, -0.25F, -0.875F, -1.125F, -0.25F, 0F, -0.625F, -0.125F, 0F); // Du loco part28
		bodyModel[1077].setRotationPoint(-8F, -7F, 7.25F);

		bodyModel[1078].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[1078].setRotationPoint(-8.5F, -7F, 5.75F);

		bodyModel[1079].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[1079].setRotationPoint(-8.75F, -7F, 5F);

		bodyModel[1080].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[1080].setRotationPoint(-9F, -7F, 4.25F);

		bodyModel[1081].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[1081].setRotationPoint(-9.25F, -7F, 3.5F);

		bodyModel[1082].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[1082].setRotationPoint(-9.5F, -7F, 2.75F);

		bodyModel[1083].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[1083].setRotationPoint(-9.75F, -7F, 2F);

		bodyModel[1084].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[1084].setRotationPoint(-10F, -7F, 1.25F);

		bodyModel[1085].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[1085].setRotationPoint(-10.25F, -7F, 0.5F);

		bodyModel[1086].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[1086].setRotationPoint(-10.5F, -7F, -0.25F);

		bodyModel[1087].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F); // Du loco part28
		bodyModel[1087].setRotationPoint(-10.5F, -7F, -0.75F);

		bodyModel[1088].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F); // Du loco part28
		bodyModel[1088].setRotationPoint(-10.25F, -7F, -1.5F);

		bodyModel[1089].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0.125F, -1F, 0F, 0.125F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F, -1.25F, 0F, 0.125F, -0.5F, 0F, 0.125F); // Du loco part28
		bodyModel[1089].setRotationPoint(-10.75F, -7F, -1F);

		bodyModel[1090].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F); // Du loco part28
		bodyModel[1090].setRotationPoint(-10F, -7F, -2.25F);

		bodyModel[1091].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F); // Du loco part28
		bodyModel[1091].setRotationPoint(-9.75F, -7F, -3F);

		bodyModel[1092].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F); // Du loco part28
		bodyModel[1092].setRotationPoint(-9.5F, -7F, -3.75F);

		bodyModel[1093].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F); // Du loco part28
		bodyModel[1093].setRotationPoint(-9.25F, -7F, -4.5F);

		bodyModel[1094].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F); // Du loco part28
		bodyModel[1094].setRotationPoint(-9F, -7F, -5.25F);

		bodyModel[1095].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F); // Du loco part28
		bodyModel[1095].setRotationPoint(-8.75F, -7F, -6F);

		bodyModel[1096].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F); // Du loco part28
		bodyModel[1096].setRotationPoint(-8.5F, -7F, -6.75F);

		bodyModel[1097].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F); // Du loco part28
		bodyModel[1097].setRotationPoint(-8.25F, -7F, -7.5F);

		bodyModel[1098].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.875F, -1.125F, 0F, -0.875F, -0.625F, -0.875F, 0F, -1.125F, -1F, 0F, -1.125F, -1F, -0.875F, -0.625F, -0.875F, -0.875F); // Du loco part28
		bodyModel[1098].setRotationPoint(-6.25F, -7F, -9.75F);

		bodyModel[1099].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -0.5F, -0.5F, 0F, -1.25F, -0.625F, 0F, -1.25F, -0.625F, -0.875F, -0.5F, -0.5F, -0.875F); // Du loco part28
		bodyModel[1099].setRotationPoint(-7F, -7F, -9F);

		bodyModel[1100].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1.125F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.875F, -1.125F, 0F, -0.875F, -0.625F, -0.125F, 0F, -1.125F, -0.25F, 0F, -1.125F, -0.25F, -0.875F, -0.625F, -0.125F, -0.875F); // Du loco part28
		bodyModel[1100].setRotationPoint(-8F, -7F, -8.25F);

		bodyModel[1101].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.625F, 0F, -0.875F, -1.125F, 0F, -0.875F, -1.125F, 0F, 0F, -0.625F, 0F, 0F, -1.125F, -1F, -0.875F, -0.625F, -0.875F, -0.875F, -0.625F, -0.875F, 0F, -1.125F, -1F, 0F); // Du loco part28
		bodyModel[1101].setRotationPoint(98.25F, -7F, 8.75F);

		bodyModel[1102].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, -0.625F, -0.875F, -0.5F, -0.5F, -0.875F, -0.5F, -0.5F, 0F, -1.25F, -0.625F, 0F); // Du loco part28
		bodyModel[1102].setRotationPoint(99F, -7F, 8F);

		bodyModel[1103].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.625F, 0F, -0.875F, -1.125F, 0F, -0.875F, -1.125F, 0F, 0F, -0.625F, 0F, 0F, -1.125F, -0.25F, -0.875F, -0.625F, -0.125F, -0.875F, -0.625F, -0.125F, 0F, -1.125F, -0.25F, 0F); // Du loco part28
		bodyModel[1103].setRotationPoint(100F, -7F, 7.25F);

		bodyModel[1104].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F); // Du loco part28
		bodyModel[1104].setRotationPoint(100.5F, -7F, 5.75F);

		bodyModel[1105].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F); // Du loco part28
		bodyModel[1105].setRotationPoint(100.75F, -7F, 5F);

		bodyModel[1106].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F); // Du loco part28
		bodyModel[1106].setRotationPoint(101F, -7F, 4.25F);

		bodyModel[1107].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F); // Du loco part28
		bodyModel[1107].setRotationPoint(101.25F, -7F, 3.5F);

		bodyModel[1108].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F); // Du loco part28
		bodyModel[1108].setRotationPoint(101.5F, -7F, 2.75F);

		bodyModel[1109].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F); // Du loco part28
		bodyModel[1109].setRotationPoint(101.75F, -7F, 2F);

		bodyModel[1110].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F); // Du loco part28
		bodyModel[1110].setRotationPoint(102F, -7F, 1.25F);

		bodyModel[1111].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F); // Du loco part28
		bodyModel[1111].setRotationPoint(102.25F, -7F, 0.5F);

		bodyModel[1112].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F); // Du loco part28
		bodyModel[1112].setRotationPoint(102.5F, -7F, -0.25F);

		bodyModel[1113].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F); // Du loco part28
		bodyModel[1113].setRotationPoint(102.5F, -7F, -0.75F);

		bodyModel[1114].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F); // Du loco part28
		bodyModel[1114].setRotationPoint(102.25F, -7F, -1.5F);

		bodyModel[1115].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, 0.125F, -0.75F, 0F, 0.125F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0.125F, -1.25F, 0F, 0.125F); // Du loco part28
		bodyModel[1115].setRotationPoint(102.75F, -7F, -1F);

		bodyModel[1116].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F); // Du loco part28
		bodyModel[1116].setRotationPoint(102F, -7F, -2.25F);

		bodyModel[1117].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F); // Du loco part28
		bodyModel[1117].setRotationPoint(101.75F, -7F, -3F);

		bodyModel[1118].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F); // Du loco part28
		bodyModel[1118].setRotationPoint(101.5F, -7F, -3.75F);

		bodyModel[1119].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F); // Du loco part28
		bodyModel[1119].setRotationPoint(101.25F, -7F, -4.5F);

		bodyModel[1120].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F); // Du loco part28
		bodyModel[1120].setRotationPoint(101F, -7F, -5.25F);

		bodyModel[1121].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F); // Du loco part28
		bodyModel[1121].setRotationPoint(100.75F, -7F, -6F);

		bodyModel[1122].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F); // Du loco part28
		bodyModel[1122].setRotationPoint(100.5F, -7F, -6.75F);

		bodyModel[1123].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F); // Du loco part28
		bodyModel[1123].setRotationPoint(100.25F, -7F, -7.5F);

		bodyModel[1124].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.625F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, -0.875F, -0.625F, 0F, -0.875F, -1.125F, -1F, 0F, -0.625F, -0.875F, 0F, -0.625F, -0.875F, -0.875F, -1.125F, -1F, -0.875F); // Du loco part28
		bodyModel[1124].setRotationPoint(98.25F, -7F, -9.75F);

		bodyModel[1125].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -1.25F, -0.625F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.875F, -1.25F, -0.625F, -0.875F); // Du loco part28
		bodyModel[1125].setRotationPoint(99F, -7F, -9F);

		bodyModel[1126].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.625F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, -0.875F, -0.625F, 0F, -0.875F, -1.125F, -0.25F, 0F, -0.625F, -0.125F, 0F, -0.625F, -0.125F, -0.875F, -1.125F, -0.25F, -0.875F); // Du loco part28
		bodyModel[1126].setRotationPoint(100F, -7F, -8.25F);

		bodyModel[1127].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.875F, -1.25F, 0F, -0.875F, -1.25F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[1127].setRotationPoint(-8.25F, -7F, 6.5F);

		bodyModel[1128].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, 0F, -0.875F, -1F, 0F, -0.875F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, -0.875F, -0.5F, 0F, -0.875F, -0.5F, 0F, 0F, -1.25F, 0F, 0F); // Du loco part28
		bodyModel[1128].setRotationPoint(100.25F, -7F, 6.5F);

		bodyModel[1129].addShapeBox(0F, 0F, 0F, 78, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 168
		bodyModel[1129].setRotationPoint(8F, -32F, -12F);

		bodyModel[1130].addShapeBox(0F, 0F, 0F, 78, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1130].setRotationPoint(8F, -32F, 10F);

		bodyModel[1131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[1131].setRotationPoint(-7F, -29F, 10F);

		bodyModel[1132].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[1132].setRotationPoint(-7.5F, -31F, 11F);

		bodyModel[1133].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[1133].setRotationPoint(-7F, -31F, 10.5F);

		bodyModel[1134].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 156
		bodyModel[1134].setRotationPoint(-7F, -29F, -11F);

		bodyModel[1135].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[1135].setRotationPoint(-7.5F, -31F, -11F);

		bodyModel[1136].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[1136].setRotationPoint(-7F, -31F, -11.5F);

		bodyModel[1137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[1137].setRotationPoint(100F, -29F, 10F);

		bodyModel[1138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 156
		bodyModel[1138].setRotationPoint(100F, -29F, -11F);

		bodyModel[1139].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Lamp
		bodyModel[1139].setRotationPoint(101F, -16F, -9.5F);

		bodyModel[1140].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F); // Lamp
		bodyModel[1140].setRotationPoint(101F, -14F, -9.5F);

		bodyModel[1141].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Lamp
		bodyModel[1141].setRotationPoint(101F, -15F, -9.5F);

		bodyModel[1142].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,-1F, 0.25F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, 0.25F, -0.5F, -1F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F); // Lamp
		bodyModel[1142].setRotationPoint(101F, -15.75F, 5F);

		bodyModel[1143].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,-1F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0.5F, -1F, -0.25F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.5F); // Lamp
		bodyModel[1143].setRotationPoint(101F, -14.75F, 5F);

		bodyModel[1144].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,-1F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, -1F, 0.25F, -0.5F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, 0.25F, -0.5F); // Lamp
		bodyModel[1144].setRotationPoint(101F, -14.25F, 5F);

		bodyModel[1145].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, -0.25F, -0.75F, -0.5F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, 0F, 0F, 0F); // Lamp
		bodyModel[1145].setRotationPoint(-10F, -15.75F, -9F);

		bodyModel[1146].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, 0F, -0.5F, 0F); // Lamp
		bodyModel[1146].setRotationPoint(-10F, -14.75F, -9F);

		bodyModel[1147].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0.5F, -1F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.5F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[1147].setRotationPoint(-10F, -14.25F, -9F);

		bodyModel[1148].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, -0.25F, -0.75F, -1F, 0.25F, -0.5F, -0.5F, 0.25F, -0.5F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -1F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F); // Lamp
		bodyModel[1148].setRotationPoint(-10F, -15.75F, 5F);

		bodyModel[1149].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, 0F, 0F, -1F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.5F, 0F); // Lamp
		bodyModel[1149].setRotationPoint(-10F, -14.75F, 5F);

		bodyModel[1150].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, 0F, 0F, -1F, -0.25F, 0.5F, -0.5F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -1F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[1150].setRotationPoint(-10F, -14.25F, 5F);

		bodyModel[1151].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part19
		bodyModel[1151].setRotationPoint(-10F, -29F, 1F);

		bodyModel[1152].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[1152].setRotationPoint(-10F, -29F, -2F);

		bodyModel[1153].addShapeBox(0F, 0F, 1F, 6, 1, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 168
		bodyModel[1153].setRotationPoint(-6F, -12F, 10F);

		bodyModel[1154].addShapeBox(0F, 0F, 1F, 6, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F); // Box 168
		bodyModel[1154].setRotationPoint(-6F, -12F, -13F);

		bodyModel[1155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F); // Du loco part05
		bodyModel[1155].setRotationPoint(4.5F, -27.5F, 10F);

		bodyModel[1156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Du loco part05
		bodyModel[1156].setRotationPoint(4.5F, -27.5F, 10F);

		bodyModel[1157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F); // Du loco part05
		bodyModel[1157].setRotationPoint(2.5F, -27.5F, 10F);

		bodyModel[1158].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[1158].setRotationPoint(2.5F, -27.5F, 10F);

		bodyModel[1159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[1159].setRotationPoint(4.5F, -23F, 10F);

		bodyModel[1160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[1160].setRotationPoint(4.5F, -23F, 10F);

		bodyModel[1161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Du loco part05
		bodyModel[1161].setRotationPoint(2.5F, -23F, 10F);

		bodyModel[1162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[1162].setRotationPoint(2.5F, -23F, 10F);

		bodyModel[1163].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1163].setRotationPoint(1F, -4F, 6.25F);

		bodyModel[1164].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, -1F, 0F, 0F); // Du loco part06
		bodyModel[1164].setRotationPoint(-5F, -6F, 6F);

		bodyModel[1165].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1165].setRotationPoint(-4.25F, -5F, 6.25F);

		bodyModel[1166].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[1166].setRotationPoint(22F, -6F, 6F);

		bodyModel[1167].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Du loco part06
		bodyModel[1167].setRotationPoint(19F, -3F, 6F);

		bodyModel[1168].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1168].setRotationPoint(18.75F, -6F, 6.25F);

		bodyModel[1169].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part06
		bodyModel[1169].setRotationPoint(23F, -4.25F, 6.5F);

		bodyModel[1170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1170].setRotationPoint(24F, -4F, 6.25F);

		bodyModel[1171].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.05F); // Du loco part06
		bodyModel[1171].setRotationPoint(26F, -6F, 6F);

		bodyModel[1172].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1172].setRotationPoint(28.75F, -5F, 6.25F);

		bodyModel[1173].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[1173].setRotationPoint(-1F, -6F, -7F);

		bodyModel[1174].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Du loco part06
		bodyModel[1174].setRotationPoint(-4F, -3F, -7F);

		bodyModel[1175].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1175].setRotationPoint(5.75F, -6F, -6.75F);

		bodyModel[1176].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part06
		bodyModel[1176].setRotationPoint(0F, -4.25F, -7.5F);

		bodyModel[1177].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part06
		bodyModel[1177].setRotationPoint(1F, -4F, -7.25F);

		bodyModel[1178].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1178].setRotationPoint(-5F, -6F, -7F);

		bodyModel[1179].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1179].setRotationPoint(-4.25F, -5F, -6.75F);

		bodyModel[1180].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[1180].setRotationPoint(22F, -6F, -7F);

		bodyModel[1181].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Du loco part06
		bodyModel[1181].setRotationPoint(19F, -3F, -7F);

		bodyModel[1182].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1182].setRotationPoint(18.75F, -6F, -6.75F);

		bodyModel[1183].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part06
		bodyModel[1183].setRotationPoint(23F, -4.25F, -7.5F);

		bodyModel[1184].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part06
		bodyModel[1184].setRotationPoint(24F, -4F, -7.25F);

		bodyModel[1185].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.05F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1185].setRotationPoint(26F, -6F, -7F);

		bodyModel[1186].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1186].setRotationPoint(28.75F, -5F, -6.75F);

		bodyModel[1187].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[1187].setRotationPoint(67F, -6F, 6F);

		bodyModel[1188].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Du loco part06
		bodyModel[1188].setRotationPoint(64F, -3F, 6F);

		bodyModel[1189].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1189].setRotationPoint(73.75F, -6F, 6.25F);

		bodyModel[1190].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part06
		bodyModel[1190].setRotationPoint(68F, -4.25F, 6.5F);

		bodyModel[1191].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1191].setRotationPoint(69F, -4F, 6.25F);

		bodyModel[1192].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, -1F, 0F, 0F); // Du loco part06
		bodyModel[1192].setRotationPoint(63F, -6F, 6F);

		bodyModel[1193].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1193].setRotationPoint(63.75F, -5F, 6.25F);

		bodyModel[1194].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[1194].setRotationPoint(90F, -6F, 6F);

		bodyModel[1195].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Du loco part06
		bodyModel[1195].setRotationPoint(87F, -3F, 6F);

		bodyModel[1196].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1196].setRotationPoint(86.75F, -6F, 6.25F);

		bodyModel[1197].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part06
		bodyModel[1197].setRotationPoint(91F, -4.25F, 6.5F);

		bodyModel[1198].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1198].setRotationPoint(92F, -4F, 6.25F);

		bodyModel[1199].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.05F); // Du loco part06
		bodyModel[1199].setRotationPoint(94F, -6F, 6F);

		bodyModel[1200].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1200].setRotationPoint(96.75F, -5F, 6.25F);

		bodyModel[1201].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[1201].setRotationPoint(67F, -6F, -7F);

		bodyModel[1202].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Du loco part06
		bodyModel[1202].setRotationPoint(64F, -3F, -7F);

		bodyModel[1203].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1203].setRotationPoint(73.75F, -6F, -6.75F);

		bodyModel[1204].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part06
		bodyModel[1204].setRotationPoint(68F, -4.25F, -7.5F);

		bodyModel[1205].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part06
		bodyModel[1205].setRotationPoint(69F, -4F, -7.25F);

		bodyModel[1206].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.05F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1206].setRotationPoint(63F, -6F, -7F);

		bodyModel[1207].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1207].setRotationPoint(63.75F, -5F, -6.75F);

		bodyModel[1208].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[1208].setRotationPoint(90F, -6F, -7F);

		bodyModel[1209].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Du loco part06
		bodyModel[1209].setRotationPoint(87F, -3F, -7F);

		bodyModel[1210].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1210].setRotationPoint(86.75F, -6F, -6.75F);

		bodyModel[1211].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part06
		bodyModel[1211].setRotationPoint(91F, -4.25F, -7.5F);

		bodyModel[1212].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part06
		bodyModel[1212].setRotationPoint(92F, -4F, -7.25F);

		bodyModel[1213].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.05F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.05F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1213].setRotationPoint(94F, -6F, -7F);

		bodyModel[1214].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[1214].setRotationPoint(96.75F, -5F, -6.75F);

		bodyModel[1215].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1215].setRotationPoint(101F, -23.5F, 5F);

		bodyModel[1216].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[1216].setRotationPoint(101F, -28.5F, 5F);

		bodyModel[1217].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[1217].setRotationPoint(102.75F, -28.5F, 2F);

		bodyModel[1218].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.75F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1218].setRotationPoint(102F, -23.5F, 2F);

		bodyModel[1219].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[1219].setRotationPoint(102F, -28.5F, 2F);

		bodyModel[1220].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.125F, -0.25F, -0.75F, 0.125F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, -0.75F, 0.125F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[1220].setRotationPoint(100.5F, -28.5F, 8F);

		bodyModel[1221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1221].setRotationPoint(100.5F, -23.5F, 8F);

		bodyModel[1222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[1222].setRotationPoint(100.5F, -28.5F, 8F);

		bodyModel[1223].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1223].setRotationPoint(-10F, -16F, -9.5F);

		bodyModel[1224].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[1224].setRotationPoint(-10F, -14F, -9.5F);

		bodyModel[1225].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1225].setRotationPoint(-10F, -15F, -9.5F);

		bodyModel[1226].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1226].setRotationPoint(101F, -16F, 4.5F);

		bodyModel[1227].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Lamp
		bodyModel[1227].setRotationPoint(101F, -14F, 4.5F);

		bodyModel[1228].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1228].setRotationPoint(101F, -15F, 4.5F);

		bodyModel[1229].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, -1F, -1F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1229].setRotationPoint(-10F, -16F, 4.5F);

		bodyModel[1230].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[1230].setRotationPoint(-10F, -14F, 4.5F);

		bodyModel[1231].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1231].setRotationPoint(-10F, -15F, 4.5F);

		bodyModel[1232].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, -0.75F, 0.125F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, -0.75F, 0.125F, -0.25F, -0.75F); // Du loco part05
		bodyModel[1232].setRotationPoint(-7.5F, -28.5F, -9F);

		bodyModel[1233].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Du loco part05
		bodyModel[1233].setRotationPoint(-7.5F, -23.5F, -9F);

		bodyModel[1234].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F); // Du loco part05
		bodyModel[1234].setRotationPoint(-7.5F, -28.5F, -9F);

		bodyModel[1235].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[1235].setRotationPoint(-8F, -28.5F, 9F);

		bodyModel[1236].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part19
		bodyModel[1236].setRotationPoint(-8F, -28.5F, -10F);

		bodyModel[1237].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[1237].setRotationPoint(89.5F, -23F, 10F);

		bodyModel[1238].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Du loco part05
		bodyModel[1238].setRotationPoint(89.5F, -27.5F, 10F);

		bodyModel[1239].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[1239].setRotationPoint(88.5F, -27F, 10F);

		bodyModel[1240].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Du loco part05
		bodyModel[1240].setRotationPoint(90.5F, -27F, 10F);

		bodyModel[1241].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F); // Du loco part05
		bodyModel[1241].setRotationPoint(90.5F, -27.5F, 10F);

		bodyModel[1242].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Du loco part05
		bodyModel[1242].setRotationPoint(90.5F, -27.5F, 10F);

		bodyModel[1243].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F); // Du loco part05
		bodyModel[1243].setRotationPoint(88.5F, -27.5F, 10F);

		bodyModel[1244].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[1244].setRotationPoint(88.5F, -27.5F, 10F);

		bodyModel[1245].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[1245].setRotationPoint(90.5F, -23F, 10F);

		bodyModel[1246].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[1246].setRotationPoint(90.5F, -23F, 10F);

		bodyModel[1247].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F); // Du loco part05
		bodyModel[1247].setRotationPoint(88.5F, -23F, 10F);

		bodyModel[1248].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[1248].setRotationPoint(88.5F, -23F, 10F);

		bodyModel[1249].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1249].setRotationPoint(3.5F, -23F, -11F);

		bodyModel[1250].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[1250].setRotationPoint(3.5F, -27.5F, -11F);

		bodyModel[1251].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1251].setRotationPoint(2.5F, -27F, -11F);

		bodyModel[1252].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[1252].setRotationPoint(4.5F, -27F, -11F);

		bodyModel[1253].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[1253].setRotationPoint(4.5F, -27.5F, -11F);

		bodyModel[1254].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part05
		bodyModel[1254].setRotationPoint(4.5F, -27.5F, -11F);

		bodyModel[1255].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, -0.25F, 0F, 0F); // Du loco part05
		bodyModel[1255].setRotationPoint(2.5F, -27.5F, -11F);

		bodyModel[1256].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1256].setRotationPoint(2.5F, -27.5F, -11F);

		bodyModel[1257].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1257].setRotationPoint(4.5F, -23F, -11F);

		bodyModel[1258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1258].setRotationPoint(4.5F, -23F, -11F);

		bodyModel[1259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part05
		bodyModel[1259].setRotationPoint(2.5F, -23F, -11F);

		bodyModel[1260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1260].setRotationPoint(2.5F, -23F, -11F);

		bodyModel[1261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1261].setRotationPoint(89.5F, -23F, -11F);

		bodyModel[1262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[1262].setRotationPoint(89.5F, -27.5F, -11F);

		bodyModel[1263].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1263].setRotationPoint(88.5F, -27F, -11F);

		bodyModel[1264].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[1264].setRotationPoint(90.5F, -27F, -11F);

		bodyModel[1265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[1265].setRotationPoint(90.5F, -27.5F, -11F);

		bodyModel[1266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part05
		bodyModel[1266].setRotationPoint(90.5F, -27.5F, -11F);

		bodyModel[1267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, -0.25F, 0F, 0F); // Du loco part05
		bodyModel[1267].setRotationPoint(88.5F, -27.5F, -11F);

		bodyModel[1268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1268].setRotationPoint(88.5F, -27.5F, -11F);

		bodyModel[1269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1269].setRotationPoint(90.5F, -23F, -11F);

		bodyModel[1270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1270].setRotationPoint(90.5F, -23F, -11F);

		bodyModel[1271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part05
		bodyModel[1271].setRotationPoint(88.5F, -23F, -11F);

		bodyModel[1272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1272].setRotationPoint(88.5F, -23F, -11F);

		bodyModel[1273].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1273].setRotationPoint(91.75F, -8F, 9.75F);

		bodyModel[1274].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1274].setRotationPoint(87.25F, -8F, 9.75F);

		bodyModel[1275].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1275].setRotationPoint(88.25F, -4F, 9.75F);

		bodyModel[1276].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1276].setRotationPoint(88.25F, -6.25F, 9.75F);

		bodyModel[1277].addShapeBox(0F, 0F, 1F, 6, 1, 1, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 168
		bodyModel[1277].setRotationPoint(94F, -12F, 10F);

		bodyModel[1278].addShapeBox(0F, 0F, 1F, 6, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 168
		bodyModel[1278].setRotationPoint(94F, -12F, -13F);

		bodyModel[1279].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,-0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[1279].setRotationPoint(-10F, -23F, 1F);

		bodyModel[1280].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[1280].setRotationPoint(-8F, -23F, 7F);

		bodyModel[1281].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[1281].setRotationPoint(-9F, -23F, 4F);

		bodyModel[1282].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[1282].setRotationPoint(-5F, -23F, 10F);

		bodyModel[1283].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F); // Box 168
		bodyModel[1283].setRotationPoint(-10F, -23F, -6F);

		bodyModel[1284].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1284].setRotationPoint(-8F, -23F, -11F);

		bodyModel[1285].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1285].setRotationPoint(-9F, -23F, -9F);

		bodyModel[1286].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F); // Box 168
		bodyModel[1286].setRotationPoint(102F, -23F, -6F);

		bodyModel[1287].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[1287].setRotationPoint(100F, -23F, -11F);

		bodyModel[1288].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[1288].setRotationPoint(101F, -23F, -9F);

		bodyModel[1289].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,-0.75F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1289].setRotationPoint(102F, -23F, 1F);

		bodyModel[1290].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1290].setRotationPoint(100F, -23F, 7F);

		bodyModel[1291].addShapeBox(0F, 0F, 1F, 2, 1, 3, 0F,-1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1291].setRotationPoint(101F, -23F, 4F);

		bodyModel[1292].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Du loco part37
		bodyModel[1292].setRotationPoint(60F, -36F, -1F);

		bodyModel[1293].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1293].setRotationPoint(5.75F, -8F, -11.5F);

		bodyModel[1294].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1294].setRotationPoint(1.25F, -8F, -11.5F);

		bodyModel[1295].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1295].setRotationPoint(2.25F, -4F, -11.5F);

		bodyModel[1296].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1296].setRotationPoint(2.25F, -6.25F, -11.5F);

		bodyModel[1297].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part37
		bodyModel[1297].setRotationPoint(60.5F, -35F, 1.5F);

		bodyModel[1298].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -1F); // Du loco part37
		bodyModel[1298].setRotationPoint(61F, -36F, -2F);

		bodyModel[1299].addShapeBox(0F, 0F, 0F, 0, 2, 1, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1299].setRotationPoint(61F, -36F, 1F);

		bodyModel[1300].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1300].setRotationPoint(51.5F, -7.5F, -9F);

		bodyModel[1301].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1301].setRotationPoint(51.5F, -6.5F, -9F);

		bodyModel[1302].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1302].setRotationPoint(51.5F, -7.5F, -8F);

		bodyModel[1303].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part06
		bodyModel[1303].setRotationPoint(51.5F, -6.5F, -8F);

		bodyModel[1304].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1304].setRotationPoint(38.75F, -11F, -9.5F);

		bodyModel[1305].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1305].setRotationPoint(38.75F, -11F, -6.75F);

		bodyModel[1306].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1306].setRotationPoint(48.75F, -11F, -9.5F);

		bodyModel[1307].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1307].setRotationPoint(48.75F, -11F, -6.75F);

		bodyModel[1308].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1308].setRotationPoint(38.75F, -11F, 5F);

		bodyModel[1309].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1309].setRotationPoint(38.75F, -11F, 7.75F);

		bodyModel[1310].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1310].setRotationPoint(48.75F, -11F, 5F);

		bodyModel[1311].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1311].setRotationPoint(48.75F, -11F, 7.75F);

		bodyModel[1312].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1312].setRotationPoint(51.75F, -11F, -9.5F);

		bodyModel[1313].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1313].setRotationPoint(53.75F, -11F, -9.5F);

		bodyModel[1314].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1314].setRotationPoint(51.75F, -11F, -8.25F);

		bodyModel[1315].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1315].setRotationPoint(53.75F, -11F, -8.25F);

		bodyModel[1316].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1316].setRotationPoint(51.75F, -11F, 6.5F);

		bodyModel[1317].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1317].setRotationPoint(53.75F, -11F, 6.5F);

		bodyModel[1318].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1318].setRotationPoint(51.75F, -11F, 7.75F);

		bodyModel[1319].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1319].setRotationPoint(53.75F, -11F, 7.75F);

		bodyModel[1320].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1320].setRotationPoint(51.5F, -7.5F, 7F);

		bodyModel[1321].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1321].setRotationPoint(51.5F, -6.5F, 7F);

		bodyModel[1322].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[1322].setRotationPoint(51.5F, -7.5F, 8F);

		bodyModel[1323].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part06
		bodyModel[1323].setRotationPoint(51.5F, -6.5F, 8F);

		bodyModel[1324].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1324].setRotationPoint(24F, -13.25F, -12F);

		bodyModel[1325].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1325].setRotationPoint(24F, -16.25F, -12F);

		bodyModel[1326].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1326].setRotationPoint(24F, -19.25F, -12F);

		bodyModel[1327].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1327].setRotationPoint(64F, -13.25F, 10.25F);

		bodyModel[1328].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1328].setRotationPoint(64F, -16.25F, 10.25F);

		bodyModel[1329].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1329].setRotationPoint(64F, -19.25F, 10.25F);

		bodyModel[1330].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.125F, -2F, 0F, -0.875F, -0.25F, 0.375F, -0.875F, -1.75F, 0F, 0.125F, 0.25F, 0F, -1F, -2F, 0F, 0F, -0.25F, 0.375F, 0F, -1.75F, 0F, -1F, 0.25F); // Du loco part28
		bodyModel[1330].setRotationPoint(99.25F, -3F, 7.75F);

		bodyModel[1331].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.625F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, -2.5F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, -2.625F, -0.75F, 0.25F, 0F, -0.75F, 0.25F); // Du loco part28
		bodyModel[1331].setRotationPoint(101.25F, -2.25F, -0.25F);

		bodyModel[1332].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0.125F, 0.25F, 0.375F, -0.875F, -1.75F, 0F, -0.875F, -0.25F, 0F, 0.125F, -2F, 0F, -1F, 0.25F, 0.375F, 0F, -1.75F, 0F, 0F, -0.25F, 0F, -1F, -2F); // Du loco part28
		bodyModel[1332].setRotationPoint(99.25F, -3F, -9.75F);

		bodyModel[1333].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -0.125F, 0.25F, -2.625F, -0.125F, 0.25F, 0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, 0F, -0.75F, 0.25F, -2.625F, -0.75F, 0.25F, 0F, -0.625F, -0.25F, -2.5F, -0.625F, -0.25F); // Du loco part28
		bodyModel[1333].setRotationPoint(101.25F, -2.25F, -7.75F);

		bodyModel[1334].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.875F, -0.25F, 0F, 0.125F, -2F, 0F, 0.125F, 0.25F, 0.375F, -0.875F, -1.75F, 0F, 0F, -0.25F, 0F, -1F, -2F, 0F, -1F, 0.25F, 0.375F, 0F, -1.75F); // Du loco part28
		bodyModel[1334].setRotationPoint(-7.25F, -3F, 7.75F);

		bodyModel[1335].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,0F, -0.25F, -0.25F, -2.5F, -0.25F, -0.25F, 0F, -0.125F, 0.25F, -2.625F, -0.125F, 0.25F, 0F, -0.625F, -0.25F, -2.5F, -0.625F, -0.25F, 0F, -0.75F, 0.25F, -2.625F, -0.75F, 0.25F); // Du loco part28
		bodyModel[1335].setRotationPoint(-10.25F, -2.25F, -0.25F);

		bodyModel[1336].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.375F, -0.875F, -1.75F, 0F, 0.125F, 0.25F, 0F, 0.125F, -2F, 0F, -0.875F, -0.25F, 0.375F, 0F, -1.75F, 0F, -1F, 0.25F, 0F, -1F, -2F, 0F, 0F, -0.25F); // Du loco part28
		bodyModel[1336].setRotationPoint(-7.25F, -3F, -9.75F);

		bodyModel[1337].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2.625F, -0.125F, 0.25F, 0F, -0.125F, 0.25F, -2.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.625F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -2.5F, -0.625F, -0.25F, 0F, -0.625F, -0.25F); // Du loco part28
		bodyModel[1337].setRotationPoint(-10.25F, -2.25F, -7.75F);

		bodyModel[1338].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.625F, -0.5F, -0.625F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.625F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1338].setRotationPoint(-3.5F, -23F, -5.5F);

		bodyModel[1339].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.625F, -0.5F, -0.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.625F); // Du loco part82
		bodyModel[1339].setRotationPoint(-4.5F, -23F, -4.5F);

		bodyModel[1340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.625F, -0.5F, -0.625F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part82
		bodyModel[1340].setRotationPoint(-4.5F, -23F, -5.5F);

		bodyModel[1341].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, -0.375F, -0.75F, -0.375F, -0.5F, -0.75F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.375F, -0.5F, 0F, -0.5F); // Du loco part82
		bodyModel[1341].setRotationPoint(-3F, -23F, -4F);

		bodyModel[1342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.5F, -0.375F, 0F, -0.375F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1342].setRotationPoint(-3F, -23F, -4F);

		bodyModel[1343].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, 0F, -0.5F, -0.375F, 0F, -0.375F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part82
		bodyModel[1343].setRotationPoint(-3F, -23F, -6F);

		bodyModel[1344].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.375F, -0.75F, -0.375F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.375F, 0F, -0.375F, -0.5F, 0F, -0.5F, 0F, 0F, -0.75F); // Du loco part82
		bodyModel[1344].setRotationPoint(-3F, -23F, -6F);

		bodyModel[1345].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part82
		bodyModel[1345].setRotationPoint(-3F, -23F, -5F);

		bodyModel[1346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part82
		bodyModel[1346].setRotationPoint(-4F, -23F, -6F);

		bodyModel[1347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1347].setRotationPoint(-4F, -23F, -4F);

		bodyModel[1348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, 0F, -0.375F); // Du loco part82
		bodyModel[1348].setRotationPoint(-5F, -23F, -4F);

		bodyModel[1349].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, -0.375F, -0.75F, -0.375F, -0.5F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.375F, 0F, -0.375F); // Du loco part82
		bodyModel[1349].setRotationPoint(-5F, -23F, -4F);

		bodyModel[1350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.75F, -0.375F, -0.5F, -0.75F, -0.5F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, -0.375F, 0F, -0.375F, -0.5F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1350].setRotationPoint(-5F, -23F, -6F);

		bodyModel[1351].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.75F, -0.375F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.5F); // Du loco part82
		bodyModel[1351].setRotationPoint(-5F, -23F, -6F);

		bodyModel[1352].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1352].setRotationPoint(-5F, -23F, -5F);

		bodyModel[1353].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.375F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, 0F, -1F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0.25F, -0.375F); // Du loco part82
		bodyModel[1353].setRotationPoint(-3.25F, -23F, -5F);

		bodyModel[1354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.25F, -0.75F, -0.75F, 0F, 0F, -1F, -0.25F, -0.75F, -1F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0.25F, -0.25F, -0.75F, 0.25F, 0F); // Du loco part82
		bodyModel[1354].setRotationPoint(-4.65F, -23F, -5.65F);

		bodyModel[1355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, -0.375F, -0.75F, -0.375F, -0.5F, -0.75F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.375F, -0.5F, 0F, -0.5F); // Du loco part82
		bodyModel[1355].setRotationPoint(-3F, -23.5F, -4F);

		bodyModel[1356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.5F, -0.375F, 0F, -0.375F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1356].setRotationPoint(-3F, -23.5F, -4F);

		bodyModel[1357].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -1F, 0F, 0F, -1F, -0.25F, -0.75F, -0.75F, 0F, 0F, -0.75F, -0.25F, -0.75F, 0.25F, 0F, 0F, 0.25F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, -0.25F); // Du loco part82
		bodyModel[1357].setRotationPoint(-4.65F, -23F, -4.35F);

		bodyModel[1358].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, -0.75F, -1F, 0F, 0F, -0.75F, -0.25F, -0.75F, -0.75F, 0F, 0F, 0.25F, -0.25F, -0.75F, 0.25F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Du loco part82
		bodyModel[1358].setRotationPoint(-3.35F, -23.5F, -4.35F);

		bodyModel[1359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0.25F, 0F, -0.75F, 0.25F, 0F, -0.75F, 0.25F, -0.75F, 0F, 0.25F, -0.75F); // Du loco part82
		bodyModel[1359].setRotationPoint(-4F, -22.25F, -5.5F);

		bodyModel[1360].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.625F, -0.5F, -0.625F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, -0.5F); // Du loco part82
		bodyModel[1360].setRotationPoint(97.5F, -23F, 4.5F);

		bodyModel[1361].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.875F, -0.5F, -0.75F, -0.875F, -0.5F, -0.875F, -0.625F, 0F, 0.125F, -0.625F, 0F, 0F, 0.125F, -0.5F, -0.75F, 0.125F, -0.5F, -0.875F, -0.125F, 0F, 0.125F, -0.125F, 0F); // Du loco part82
		bodyModel[1361].setRotationPoint(97.75F, -22.25F, 5F);

		bodyModel[1362].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, -0.5F, -0.625F, -0.5F, -0.625F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.625F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1362].setRotationPoint(97.5F, -23F, 3.5F);

		bodyModel[1363].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.625F, -0.5F, -0.625F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.625F, 0F, -0.625F); // Du loco part82
		bodyModel[1363].setRotationPoint(96.5F, -23F, 4.5F);

		bodyModel[1364].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.625F, -0.5F, -0.625F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.625F, 0F, -0.625F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part82
		bodyModel[1364].setRotationPoint(96.5F, -23F, 3.5F);

		bodyModel[1365].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, -0.375F, -0.75F, -0.375F, -0.5F, -0.75F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.375F, -0.5F, 0F, -0.5F); // Du loco part82
		bodyModel[1365].setRotationPoint(98F, -23F, 5F);

		bodyModel[1366].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.5F, -0.375F, 0F, -0.375F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1366].setRotationPoint(98F, -23F, 5F);

		bodyModel[1367].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, 0F, -0.5F, -0.375F, 0F, -0.375F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part82
		bodyModel[1367].setRotationPoint(98F, -23F, 3F);

		bodyModel[1368].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.375F, -0.75F, -0.375F, -0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.375F, 0F, -0.375F, -0.5F, 0F, -0.5F, 0F, 0F, -0.75F); // Du loco part82
		bodyModel[1368].setRotationPoint(98F, -23F, 3F);

		bodyModel[1369].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part82
		bodyModel[1369].setRotationPoint(98F, -23F, 4F);

		bodyModel[1370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part82
		bodyModel[1370].setRotationPoint(97F, -23F, 3F);

		bodyModel[1371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1371].setRotationPoint(97F, -23F, 5F);

		bodyModel[1372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, -0.375F, -0.75F, -0.375F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.5F, -0.375F, 0F, -0.375F); // Du loco part82
		bodyModel[1372].setRotationPoint(96F, -23F, 5F);

		bodyModel[1373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.5F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, -0.375F, -0.75F, -0.375F, -0.5F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.375F, 0F, -0.375F); // Du loco part82
		bodyModel[1373].setRotationPoint(96F, -23F, 5F);

		bodyModel[1374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.75F, -0.375F, -0.5F, -0.75F, -0.5F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, -0.375F, 0F, -0.375F, -0.5F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1374].setRotationPoint(96F, -23F, 3F);

		bodyModel[1375].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.75F, -0.375F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.5F); // Du loco part82
		bodyModel[1375].setRotationPoint(96F, -23F, 3F);

		bodyModel[1376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1376].setRotationPoint(96F, -23F, 4F);

		bodyModel[1377].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.375F, 0F, -1F, -0.375F, 0F, -1F, -0.375F, 0F, -0.75F, -0.375F, 0F, 0F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0.25F, -0.375F, 0F, 0F, -0.375F); // Du loco part82
		bodyModel[1377].setRotationPoint(96.25F, -23F, 4F);

		bodyModel[1378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, -0.25F, -0.75F, -1F, 0F, 0F, -1F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0.25F, 0F, 0F, 0.25F, -0.25F); // Du loco part82
		bodyModel[1378].setRotationPoint(97.65F, -23F, 3.35F);

		bodyModel[1379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, -0.75F, -1F, 0F, 0F, -0.75F, -0.25F, -0.75F, -0.75F, 0F, 0F, 0.25F, -0.25F, -0.75F, 0.25F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F); // Du loco part82
		bodyModel[1379].setRotationPoint(97.65F, -23F, 4.65F);

		bodyModel[1380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.25F, -0.75F, -0.75F, 0F, 0F, -1F, -0.25F, -0.75F, -1F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0.25F, -0.25F, -0.75F, 0.25F, 0F); // Du loco part82
		bodyModel[1380].setRotationPoint(96.35F, -23.5F, 3.35F);

		bodyModel[1381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, 0F, 0F, 0.25F, 0F); // Du loco part82
		bodyModel[1381].setRotationPoint(97.75F, -22.25F, 4.5F);

		bodyModel[1382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.75F, -0.375F, -0.5F, -0.75F, -0.5F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, -0.375F, 0F, -0.375F, -0.5F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1382].setRotationPoint(96F, -23.5F, 3F);

		bodyModel[1383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.75F, -0.375F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, -0.5F, -0.375F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.5F); // Du loco part82
		bodyModel[1383].setRotationPoint(96F, -23.5F, 3F);
	}
}