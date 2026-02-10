//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2025 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera Rc
// Model Creator: Foxo
// Created on: 06.05.2022 - 18:16:35
// Last changed on: 06.05.2022 - 18:16:35
package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittRc extends ModelConverter //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelSJLittRc() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[1929];

		initbodyModel_1();
		initbodyModel_2();
		initbodyModel_3();
		initbodyModel_4();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 490, textureX, textureY); // Du loco part03
		bodyModel[1] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Du loco part08
		bodyModel[2] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Du loco part09
		bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part19
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
		bodyModel[14] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Lamp
		bodyModel[15] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 149
		bodyModel[16] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 167
		bodyModel[17] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 168
		bodyModel[18] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 177
		bodyModel[19] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 194
		bodyModel[20] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 195
		bodyModel[21] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 135
		bodyModel[22] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 136
		bodyModel[23] = new ModelRendererTurbo(this, 23, 7, textureX, textureY); // Box 149
		bodyModel[24] = new ModelRendererTurbo(this, 241, 9, textureX, textureY); // Du loco part37
		bodyModel[25] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Du loco part37
		bodyModel[26] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Du loco part37
		bodyModel[27] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Du loco part37
		bodyModel[28] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Du loco part37
		bodyModel[29] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Du loco part37
		bodyModel[30] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Du loco part37
		bodyModel[31] = new ModelRendererTurbo(this, 217, 17, textureX, textureY); // Du loco part37
		bodyModel[32] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Du loco part37
		bodyModel[33] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Du loco part37
		bodyModel[34] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Du loco part37
		bodyModel[35] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Du loco part37
		bodyModel[36] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Du loco part37
		bodyModel[37] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Lamp
		bodyModel[38] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 149
		bodyModel[39] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Du loco part37
		bodyModel[40] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Du loco part09
		bodyModel[41] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 168
		bodyModel[42] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 167
		bodyModel[43] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 168
		bodyModel[44] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Du loco part71
		bodyModel[45] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Du loco part71
		bodyModel[46] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Du loco part28
		bodyModel[47] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Du loco part37
		bodyModel[48] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Du loco part37
		bodyModel[49] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Du loco part37
		bodyModel[50] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Du loco part37
		bodyModel[51] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Du loco part37
		bodyModel[52] = new ModelRendererTurbo(this, 105, 41, textureX, textureY); // Du loco part37
		bodyModel[53] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Du loco part37
		bodyModel[54] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Du loco part37
		bodyModel[55] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Du loco part37
		bodyModel[56] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Du loco part37
		bodyModel[57] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Du loco part37
		bodyModel[58] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Du loco part37
		bodyModel[59] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Du loco part37
		bodyModel[60] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Du loco part37
		bodyModel[61] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Du loco part37
		bodyModel[62] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Du loco part37
		bodyModel[63] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Du loco part37
		bodyModel[64] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Du loco part37
		bodyModel[65] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Du loco part37
		bodyModel[66] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Du loco part37
		bodyModel[67] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Du loco part37
		bodyModel[68] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Du loco part37
		bodyModel[69] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Du loco part37
		bodyModel[70] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Du loco part37
		bodyModel[71] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Du loco part37
		bodyModel[72] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Du loco part37
		bodyModel[73] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Du loco part37
		bodyModel[74] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Du loco part37
		bodyModel[75] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Du loco part37
		bodyModel[76] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Du loco part37
		bodyModel[77] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Du loco part37
		bodyModel[78] = new ModelRendererTurbo(this, 113, 57, textureX, textureY); // Du loco part37
		bodyModel[79] = new ModelRendererTurbo(this, 145, 57, textureX, textureY); // Du loco part37
		bodyModel[80] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Du loco part37
		bodyModel[81] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Du loco part37
		bodyModel[82] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part37
		bodyModel[83] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Du loco part37
		bodyModel[84] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Du loco part37
		bodyModel[85] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Du loco part37
		bodyModel[86] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Du loco part37
		bodyModel[87] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Du loco part37
		bodyModel[88] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Du loco part37
		bodyModel[89] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Du loco part37
		bodyModel[90] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Du loco part37
		bodyModel[91] = new ModelRendererTurbo(this, 73, 57, textureX, textureY); // Du loco part37
		bodyModel[92] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Du loco part37
		bodyModel[93] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Du loco part37
		bodyModel[94] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Du loco part37
		bodyModel[95] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Du loco part37
		bodyModel[96] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Du loco part37
		bodyModel[97] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Du loco part37
		bodyModel[98] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Du loco part37
		bodyModel[99] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Du loco part37
		bodyModel[100] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Du loco part37
		bodyModel[101] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Du loco part37
		bodyModel[102] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Du loco part37
		bodyModel[103] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Du loco part37
		bodyModel[104] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Du loco part37
		bodyModel[105] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Du loco part37
		bodyModel[106] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Du loco part05
		bodyModel[107] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Du loco part05
		bodyModel[108] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Du loco part05
		bodyModel[109] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Du loco part05
		bodyModel[110] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Du loco part05
		bodyModel[111] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Du loco part05
		bodyModel[112] = new ModelRendererTurbo(this, 305, 65, textureX, textureY); // Du loco part05
		bodyModel[113] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Du loco part05
		bodyModel[114] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Du loco part05
		bodyModel[115] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Du loco part05
		bodyModel[116] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Du loco part05
		bodyModel[117] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Du loco part05
		bodyModel[118] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Du loco part05
		bodyModel[119] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Du loco part05
		bodyModel[120] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Du loco part05
		bodyModel[121] = new ModelRendererTurbo(this, 65, 73, textureX, textureY); // Du loco part05
		bodyModel[122] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Du loco part05
		bodyModel[123] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Du loco part01
		bodyModel[124] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 0
		bodyModel[125] = new ModelRendererTurbo(this, 81, 33, textureX, textureY); // Box 0
		bodyModel[126] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 0
		bodyModel[127] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 0
		bodyModel[129] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 0
		bodyModel[130] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 0
		bodyModel[131] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 0
		bodyModel[132] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 0
		bodyModel[133] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 0
		bodyModel[134] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 0
		bodyModel[135] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 0
		bodyModel[136] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 0
		bodyModel[137] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 0
		bodyModel[138] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 0
		bodyModel[139] = new ModelRendererTurbo(this, 41, 81, textureX, textureY); // Box 0
		bodyModel[140] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 0
		bodyModel[141] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 0
		bodyModel[142] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 0
		bodyModel[143] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Box 0
		bodyModel[144] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 0
		bodyModel[145] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 0
		bodyModel[146] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 0
		bodyModel[147] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 0
		bodyModel[148] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 0
		bodyModel[150] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 0
		bodyModel[151] = new ModelRendererTurbo(this, 169, 81, textureX, textureY); // Box 0
		bodyModel[152] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 0
		bodyModel[153] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 0
		bodyModel[154] = new ModelRendererTurbo(this, 97, 81, textureX, textureY); // Box 0
		bodyModel[155] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 0
		bodyModel[156] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 0
		bodyModel[157] = new ModelRendererTurbo(this, 145, 81, textureX, textureY); // Box 0
		bodyModel[158] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 0
		bodyModel[159] = new ModelRendererTurbo(this, 161, 81, textureX, textureY); // Box 0
		bodyModel[160] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 0
		bodyModel[161] = new ModelRendererTurbo(this, 217, 81, textureX, textureY); // Box 0
		bodyModel[162] = new ModelRendererTurbo(this, 193, 81, textureX, textureY); // Box 0
		bodyModel[163] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 0
		bodyModel[164] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 0
		bodyModel[165] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 0
		bodyModel[166] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 0
		bodyModel[167] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 0
		bodyModel[168] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 0
		bodyModel[169] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 0
		bodyModel[170] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 0
		bodyModel[171] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 0
		bodyModel[172] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 0
		bodyModel[173] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 0
		bodyModel[174] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 0
		bodyModel[175] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 0
		bodyModel[176] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 0
		bodyModel[177] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 0
		bodyModel[178] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 0
		bodyModel[179] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 0
		bodyModel[180] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Box 0
		bodyModel[181] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Box 0
		bodyModel[182] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 0
		bodyModel[183] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 0
		bodyModel[184] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 0
		bodyModel[185] = new ModelRendererTurbo(this, 473, 81, textureX, textureY); // Box 0
		bodyModel[186] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 0
		bodyModel[187] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 0
		bodyModel[188] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Box 0
		bodyModel[189] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 0
		bodyModel[190] = new ModelRendererTurbo(this, 401, 81, textureX, textureY); // Box 0
		bodyModel[191] = new ModelRendererTurbo(this, 417, 81, textureX, textureY); // Box 0
		bodyModel[192] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Du loco part05
		bodyModel[193] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Du loco part05
		bodyModel[194] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Du loco part37
		bodyModel[195] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Du loco part37
		bodyModel[196] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Du loco part42
		bodyModel[197] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Du loco part42
		bodyModel[198] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Du loco part42
		bodyModel[199] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Du loco part42
		bodyModel[200] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 168
		bodyModel[201] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 168
		bodyModel[202] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Du loco part19
		bodyModel[203] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 168
		bodyModel[204] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 168
		bodyModel[205] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 149
		bodyModel[206] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 149
		bodyModel[207] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 149
		bodyModel[208] = new ModelRendererTurbo(this, 137, 89, textureX, textureY); // Box 168
		bodyModel[209] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 168
		bodyModel[210] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 168
		bodyModel[211] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 168
		bodyModel[212] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 168
		bodyModel[213] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 149
		bodyModel[214] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 168
		bodyModel[215] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 149
		bodyModel[216] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 168
		bodyModel[217] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 168
		bodyModel[218] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 168
		bodyModel[219] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 168
		bodyModel[220] = new ModelRendererTurbo(this, 369, 97, textureX, textureY); // Box 168
		bodyModel[221] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 167
		bodyModel[222] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 168
		bodyModel[223] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Du loco part05
		bodyModel[224] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Du loco part05
		bodyModel[225] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Du loco part05
		bodyModel[226] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Du loco part05
		bodyModel[227] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Du loco part05
		bodyModel[228] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Du loco part05
		bodyModel[229] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Du loco part05
		bodyModel[230] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Du loco part05
		bodyModel[231] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Du loco part05
		bodyModel[232] = new ModelRendererTurbo(this, 65, 105, textureX, textureY); // Du loco part05
		bodyModel[233] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Du loco part05
		bodyModel[234] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Du loco part05
		bodyModel[235] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Lamp
		bodyModel[236] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Lamp
		bodyModel[237] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Lamp
		bodyModel[238] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Lamp
		bodyModel[239] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Du loco part19
		bodyModel[240] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 167
		bodyModel[241] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 168
		bodyModel[242] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 168
		bodyModel[243] = new ModelRendererTurbo(this, 313, 105, textureX, textureY); // Box 167
		bodyModel[244] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 168
		bodyModel[245] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 168
		bodyModel[246] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 167
		bodyModel[247] = new ModelRendererTurbo(this, 345, 105, textureX, textureY); // Box 168
		bodyModel[248] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 0
		bodyModel[249] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 0
		bodyModel[250] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 168
		bodyModel[251] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Du loco part19
		bodyModel[252] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 167
		bodyModel[253] = new ModelRendererTurbo(this, 25, 113, textureX, textureY); // Box 168
		bodyModel[254] = new ModelRendererTurbo(this, 49, 113, textureX, textureY); // Box 168
		bodyModel[255] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 167
		bodyModel[256] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 168
		bodyModel[257] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 168
		bodyModel[258] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 167
		bodyModel[259] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 168
		bodyModel[260] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Du loco part37
		bodyModel[261] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Du loco part37
		bodyModel[262] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Du loco part37
		bodyModel[263] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Du loco part37
		bodyModel[264] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Du loco part37
		bodyModel[265] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Du loco part37
		bodyModel[266] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Du loco part08
		bodyModel[267] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 149
		bodyModel[268] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Box 149
		bodyModel[269] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Du loco part71
		bodyModel[270] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Du loco part71
		bodyModel[271] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Du loco part09
		bodyModel[272] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Du loco part09
		bodyModel[273] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Du loco part01
		bodyModel[274] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 135
		bodyModel[275] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 135
		bodyModel[276] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 135
		bodyModel[277] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 135
		bodyModel[278] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 135
		bodyModel[279] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Box 135
		bodyModel[280] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 135
		bodyModel[281] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Du loco part05
		bodyModel[282] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Du loco part05
		bodyModel[283] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 135
		bodyModel[284] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Du loco part28
		bodyModel[285] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Du loco part28
		bodyModel[286] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 135
		bodyModel[287] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 135
		bodyModel[288] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Du loco part28
		bodyModel[289] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Du loco part28
		bodyModel[290] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Du loco part28
		bodyModel[291] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Box 135
		bodyModel[292] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Du loco part05
		bodyModel[293] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Du loco part05
		bodyModel[294] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Du loco part05
		bodyModel[295] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Du loco part05
		bodyModel[296] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Du loco part05
		bodyModel[297] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Du loco part05
		bodyModel[298] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Du loco part05
		bodyModel[299] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Du loco part05
		bodyModel[300] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Du loco part05
		bodyModel[301] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Du loco part05
		bodyModel[302] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Du loco part05
		bodyModel[303] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Du loco part05
		bodyModel[304] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Du loco part05
		bodyModel[305] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Du loco part05
		bodyModel[306] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Du loco part05
		bodyModel[307] = new ModelRendererTurbo(this, 169, 121, textureX, textureY); // Du loco part05
		bodyModel[308] = new ModelRendererTurbo(this, 337, 137, textureX, textureY); // Du loco part05
		bodyModel[309] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 135
		bodyModel[310] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 135
		bodyModel[311] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Du loco part05
		bodyModel[312] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Du loco part05
		bodyModel[313] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Du loco part05
		bodyModel[314] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Du loco part05
		bodyModel[315] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Du loco part05
		bodyModel[316] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Du loco part05
		bodyModel[317] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Du loco part05
		bodyModel[318] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Du loco part05
		bodyModel[319] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Du loco part05
		bodyModel[320] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Du loco part05
		bodyModel[321] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Du loco part05
		bodyModel[322] = new ModelRendererTurbo(this, 505, 145, textureX, textureY); // Du loco part05
		bodyModel[323] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Du loco part05
		bodyModel[324] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Du loco part05
		bodyModel[325] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Du loco part05
		bodyModel[326] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Du loco part05
		bodyModel[327] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Du loco part05
		bodyModel[328] = new ModelRendererTurbo(this, 41, 153, textureX, textureY); // Du loco part05
		bodyModel[329] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Du loco part05
		bodyModel[330] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Du loco part05
		bodyModel[331] = new ModelRendererTurbo(this, 65, 153, textureX, textureY); // Box 135
		bodyModel[332] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 135
		bodyModel[333] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Du loco part05
		bodyModel[334] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Du loco part05
		bodyModel[335] = new ModelRendererTurbo(this, 129, 153, textureX, textureY); // Du loco part05
		bodyModel[336] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Du loco part05
		bodyModel[337] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Du loco part05
		bodyModel[338] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Du loco part05
		bodyModel[339] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Du loco part05
		bodyModel[340] = new ModelRendererTurbo(this, 169, 153, textureX, textureY); // Du loco part05
		bodyModel[341] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Du loco part05
		bodyModel[342] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Du loco part05
		bodyModel[343] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Du loco part05
		bodyModel[344] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Du loco part05
		bodyModel[345] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Du loco part05
		bodyModel[346] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Du loco part05
		bodyModel[347] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Du loco part05
		bodyModel[348] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Du loco part05
		bodyModel[349] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Du loco part05
		bodyModel[350] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Du loco part05
		bodyModel[351] = new ModelRendererTurbo(this, 265, 153, textureX, textureY); // Du loco part05
		bodyModel[352] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Du loco part05
		bodyModel[353] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Du loco part05
		bodyModel[354] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Du loco part05
		bodyModel[355] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Du loco part05
		bodyModel[356] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Du loco part05
		bodyModel[357] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Du loco part05
		bodyModel[358] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Du loco part05
		bodyModel[359] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Du loco part05
		bodyModel[360] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Du loco part05
		bodyModel[361] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Du loco part05
		bodyModel[362] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Du loco part05
		bodyModel[363] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Du loco part05
		bodyModel[364] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part05
		bodyModel[365] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Du loco part05
		bodyModel[366] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Du loco part05
		bodyModel[367] = new ModelRendererTurbo(this, 9, 161, textureX, textureY); // Du loco part05
		bodyModel[368] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Du loco part05
		bodyModel[369] = new ModelRendererTurbo(this, 25, 161, textureX, textureY); // Du loco part05
		bodyModel[370] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Du loco part05
		bodyModel[371] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Du loco part05
		bodyModel[372] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Du loco part05
		bodyModel[373] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Du loco part28
		bodyModel[374] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Du loco part05
		bodyModel[375] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Du loco part05
		bodyModel[376] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Du loco part05
		bodyModel[377] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Du loco part05
		bodyModel[378] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 135
		bodyModel[379] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 135
		bodyModel[380] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Du loco part05
		bodyModel[381] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Du loco part05
		bodyModel[382] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 135
		bodyModel[383] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Du loco part28
		bodyModel[384] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Du loco part28
		bodyModel[385] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 135
		bodyModel[386] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Du loco part28
		bodyModel[387] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Du loco part28
		bodyModel[388] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Du loco part28
		bodyModel[389] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 135
		bodyModel[390] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 135
		bodyModel[391] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Du loco part05
		bodyModel[392] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Du loco part05
		bodyModel[393] = new ModelRendererTurbo(this, 281, 161, textureX, textureY); // Du loco part05
		bodyModel[394] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Du loco part05
		bodyModel[395] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Du loco part05
		bodyModel[396] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Du loco part05
		bodyModel[397] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Du loco part05
		bodyModel[398] = new ModelRendererTurbo(this, 321, 161, textureX, textureY); // Du loco part05
		bodyModel[399] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Du loco part05
		bodyModel[400] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Du loco part05
		bodyModel[401] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Du loco part05
		bodyModel[402] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Du loco part05
		bodyModel[403] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Du loco part05
		bodyModel[404] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Du loco part05
		bodyModel[405] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Du loco part05
		bodyModel[406] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Du loco part05
		bodyModel[407] = new ModelRendererTurbo(this, 393, 161, textureX, textureY); // Du loco part05
		bodyModel[408] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Du loco part05
		bodyModel[409] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Du loco part05
		bodyModel[410] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Du loco part05
		bodyModel[411] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 135
		bodyModel[412] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 135
		bodyModel[413] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Du loco part05
		bodyModel[414] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Du loco part05
		bodyModel[415] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Du loco part05
		bodyModel[416] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Du loco part05
		bodyModel[417] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Du loco part05
		bodyModel[418] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Du loco part05
		bodyModel[419] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Du loco part05
		bodyModel[420] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Du loco part05
		bodyModel[421] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Du loco part05
		bodyModel[422] = new ModelRendererTurbo(this, 41, 169, textureX, textureY); // Du loco part05
		bodyModel[423] = new ModelRendererTurbo(this, 49, 169, textureX, textureY); // Du loco part05
		bodyModel[424] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Du loco part05
		bodyModel[425] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Du loco part05
		bodyModel[426] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Du loco part05
		bodyModel[427] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Du loco part05
		bodyModel[428] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Du loco part05
		bodyModel[429] = new ModelRendererTurbo(this, 105, 169, textureX, textureY); // Du loco part05
		bodyModel[430] = new ModelRendererTurbo(this, 153, 169, textureX, textureY); // Du loco part05
		bodyModel[431] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Du loco part05
		bodyModel[432] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Du loco part05
		bodyModel[433] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Du loco part05
		bodyModel[434] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Du loco part05
		bodyModel[435] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Du loco part05
		bodyModel[436] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Du loco part05
		bodyModel[437] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Du loco part05
		bodyModel[438] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Du loco part05
		bodyModel[439] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Du loco part05
		bodyModel[440] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Du loco part05
		bodyModel[441] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Du loco part05
		bodyModel[442] = new ModelRendererTurbo(this, 289, 169, textureX, textureY); // Du loco part05
		bodyModel[443] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Du loco part05
		bodyModel[444] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Du loco part05
		bodyModel[445] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Du loco part05
		bodyModel[446] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Du loco part05
		bodyModel[447] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Du loco part05
		bodyModel[448] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Du loco part05
		bodyModel[449] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Du loco part05
		bodyModel[450] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Du loco part05
		bodyModel[451] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Du loco part05
		bodyModel[452] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Du loco part05
		bodyModel[453] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 135
		bodyModel[454] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Du loco part05
		bodyModel[455] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Du loco part05
		bodyModel[456] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Du loco part05
		bodyModel[457] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Du loco part05
		bodyModel[458] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Du loco part05
		bodyModel[459] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Du loco part05
		bodyModel[460] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Du loco part05
		bodyModel[461] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Du loco part05
		bodyModel[462] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Du loco part05
		bodyModel[463] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Du loco part05
		bodyModel[464] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Du loco part05
		bodyModel[465] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Du loco part05
		bodyModel[466] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Du loco part05
		bodyModel[467] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Du loco part05
		bodyModel[468] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Du loco part05
		bodyModel[469] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Du loco part05
		bodyModel[470] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Du loco part05
		bodyModel[471] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Du loco part05
		bodyModel[472] = new ModelRendererTurbo(this, 41, 177, textureX, textureY); // Du loco part05
		bodyModel[473] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Du loco part05
		bodyModel[474] = new ModelRendererTurbo(this, 57, 177, textureX, textureY); // Du loco part28
		bodyModel[475] = new ModelRendererTurbo(this, 65, 177, textureX, textureY); // Box 135
		bodyModel[476] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 135
		bodyModel[477] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Du loco part28
		bodyModel[478] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Du loco part28
		bodyModel[479] = new ModelRendererTurbo(this, 105, 177, textureX, textureY); // Du loco part28
		bodyModel[480] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Du loco part28
		bodyModel[481] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 135
		bodyModel[482] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 135
		bodyModel[483] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Du loco part09
		bodyModel[484] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Du loco part09
		bodyModel[485] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Du loco part01
		bodyModel[486] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Du loco part09
		bodyModel[487] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Du loco part09
		bodyModel[488] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Du loco part01
		bodyModel[489] = new ModelRendererTurbo(this, 169, 177, textureX, textureY); // Box 135
		bodyModel[490] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 135
		bodyModel[491] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 135
		bodyModel[492] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 135
		bodyModel[493] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 135
		bodyModel[494] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 135
		bodyModel[495] = new ModelRendererTurbo(this, 505, 177, textureX, textureY); // Box 135
		bodyModel[496] = new ModelRendererTurbo(this, 17, 185, textureX, textureY); // Box 135
		bodyModel[497] = new ModelRendererTurbo(this, 25, 185, textureX, textureY); // Box 135
		bodyModel[498] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 135
		bodyModel[499] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 135

		bodyModel[0].addBox(0F, 0F, 0F, 106, 1, 20, 0F); // Du loco part03
		bodyModel[0].setRotationPoint(-6F, -12F, -10F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Du loco part08
		bodyModel[1].setRotationPoint(-5F, -32F, -1F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[2].setRotationPoint(-19F, -10F, 6.05F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[3].setRotationPoint(-11F, -21F, -1F);

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

		bodyModel[14].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[14].setRotationPoint(-10.25F, -17F, 5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 149
		bodyModel[15].setRotationPoint(-5F, -31F, 7F);

		bodyModel[16].addShapeBox(0F, 0F, 1F, 3, 9, 4, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[16].setRotationPoint(-11F, -21F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 1F, 3, 9, 4, 0F,-0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[17].setRotationPoint(-11F, -21F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[18].setRotationPoint(1F, -16F, -7F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[19].setRotationPoint(0F, -15F, -4F);
		bodyModel[19].rotateAngleY = -1.57079633F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[20].setRotationPoint(-1F, -15F, -4F);
		bodyModel[20].rotateAngleY = -1.57079633F;

		bodyModel[21].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 135
		bodyModel[21].setRotationPoint(-6F, -22F, 10F);

		bodyModel[22].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 136
		bodyModel[22].setRotationPoint(7F, -30F, -10F);

		bodyModel[23].addBox(0F, 0F, 0F, 11, 12, 12, 0F); // Box 149
		bodyModel[23].setRotationPoint(47F, -29F, -6F);

		bodyModel[24].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[24].setRotationPoint(10F, -33F, -6F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[25].setRotationPoint(10F, -33F, 5F);

		bodyModel[26].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[26].setRotationPoint(18F, -33F, -6F);

		bodyModel[27].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[27].setRotationPoint(18F, -33F, 5F);

		bodyModel[28].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Du loco part37
		bodyModel[28].setRotationPoint(10F, -34F, -6F);

		bodyModel[29].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Du loco part37
		bodyModel[29].setRotationPoint(10F, -34F, 5F);

		bodyModel[30].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[30].setRotationPoint(13F, -37F, -4F);

		bodyModel[31].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[31].setRotationPoint(13F, -37F, 3F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[32].setRotationPoint(15F, -38F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[33].setRotationPoint(15F, -38F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[34].setRotationPoint(15F, -38F, -8F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[35].setRotationPoint(2F, -35F, -5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[36].setRotationPoint(2F, -36F, -4F);

		bodyModel[37].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[37].setRotationPoint(-10.25F, -16F, 5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 149
		bodyModel[38].setRotationPoint(-5F, -32F, 1F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[39].setRotationPoint(25F, -33F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[40].setRotationPoint(-19F, -10F, -6.05F);

		bodyModel[41].addShapeBox(0F, 0F, 1F, 3, 9, 2, 0F,-0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[41].setRotationPoint(-9F, -21F, 7F);

		bodyModel[42].addShapeBox(0F, 0F, 1F, 3, 9, 2, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[42].setRotationPoint(-9F, -21F, -11F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[43].setRotationPoint(-8.25F, -30F, 7F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Du loco part71
		bodyModel[44].setRotationPoint(-5F, -32F, -7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Du loco part71
		bodyModel[45].setRotationPoint(-5F, -31F, -10F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[46].setRotationPoint(1.25F, -24F, 10F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[47].setRotationPoint(75F, -33F, -6F);

		bodyModel[48].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[48].setRotationPoint(75F, -33F, 5F);

		bodyModel[49].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[49].setRotationPoint(83F, -33F, -6F);

		bodyModel[50].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[50].setRotationPoint(83F, -33F, 5F);

		bodyModel[51].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Du loco part37
		bodyModel[51].setRotationPoint(75F, -34F, -6F);

		bodyModel[52].addBox(0F, 0F, 0F, 9, 1, 1, 0F); // Du loco part37
		bodyModel[52].setRotationPoint(75F, -34F, 5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[53].setRotationPoint(83F, -40F, 4F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[54].setRotationPoint(70F, -40F, 4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[55].setRotationPoint(80F, -46F, 3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[56].setRotationPoint(70F, -46F, 3F);

		bodyModel[57].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[57].setRotationPoint(78F, -47F, -4F);

		bodyModel[58].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[58].setRotationPoint(78F, -47F, 3F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[59].setRotationPoint(80F, -48F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[60].setRotationPoint(80F, -48F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[61].setRotationPoint(80F, -48F, -8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[62].setRotationPoint(83F, -40F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[63].setRotationPoint(70F, -40F, -5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[64].setRotationPoint(80F, -46F, -4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[65].setRotationPoint(70F, -46F, -4F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[66].setRotationPoint(18F, -35F, 4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, 0F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -7F); // Du loco part37
		bodyModel[67].setRotationPoint(16F, -37F, -4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[68].setRotationPoint(2F, -35F, 4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[69].setRotationPoint(2F, -36F, 3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[70].setRotationPoint(18F, -35F, -5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[71].setRotationPoint(15F, -36F, -4F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[72].setRotationPoint(78F, -37F, -4F);

		bodyModel[73].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[73].setRotationPoint(78F, -37F, 3F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[74].setRotationPoint(80F, -38F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[75].setRotationPoint(80F, -38F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[76].setRotationPoint(80F, -38F, -8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[77].setRotationPoint(67F, -35F, -5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[78].setRotationPoint(67F, -36F, -4F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[79].setRotationPoint(83F, -35F, 4F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[80].setRotationPoint(80F, -36F, 3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[81].setRotationPoint(67F, -35F, 4F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[82].setRotationPoint(67F, -36F, 3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[83].setRotationPoint(83F, -35F, -5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[84].setRotationPoint(80F, -36F, -4F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[85].setRotationPoint(18F, -40F, 4F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[86].setRotationPoint(5F, -40F, 4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[87].setRotationPoint(15F, -46F, 3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[88].setRotationPoint(5F, -46F, 3F);

		bodyModel[89].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[89].setRotationPoint(13F, -47F, -4F);

		bodyModel[90].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[90].setRotationPoint(13F, -47F, 3F);

		bodyModel[91].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[91].setRotationPoint(15F, -48F, -6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[92].setRotationPoint(15F, -48F, 6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[93].setRotationPoint(15F, -48F, -8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[94].setRotationPoint(18F, -40F, -5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[95].setRotationPoint(5F, -40F, -5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[96].setRotationPoint(15F, -46F, -4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[97].setRotationPoint(5F, -46F, -4F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F); // Du loco part37
		bodyModel[98].setRotationPoint(16F, -46F, -4F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F); // Du loco part37
		bodyModel[99].setRotationPoint(16F, -46F, -4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[100].setRotationPoint(15F, -36F, 3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, -7F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F); // Du loco part37
		bodyModel[101].setRotationPoint(16F, -37F, -4F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[102].setRotationPoint(67F, -37F, -4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[103].setRotationPoint(70F, -46F, -4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[104].setRotationPoint(70F, -46F, -4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[105].setRotationPoint(67F, -37F, -4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[106].setRotationPoint(-5F, -23F, 10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[107].setRotationPoint(-5F, -28F, 10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[108].setRotationPoint(-5F, -28F, 10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[109].setRotationPoint(-1F, -28F, 10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[110].setRotationPoint(2F, -23F, 10F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Du loco part05
		bodyModel[111].setRotationPoint(2F, -28F, 10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part05
		bodyModel[112].setRotationPoint(2F, -28F, 10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Du loco part05
		bodyModel[113].setRotationPoint(5F, -28F, 10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[114].setRotationPoint(16F, -23F, 10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[115].setRotationPoint(16F, -28F, 10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[116].setRotationPoint(14F, -26F, 10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[117].setRotationPoint(-5F, -23F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[118].setRotationPoint(-5F, -28F, -11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[119].setRotationPoint(-5F, -28F, -11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[120].setRotationPoint(2F, -28F, -11F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-0.625F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Du loco part05
		bodyModel[121].setRotationPoint(-8F, -28F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Du loco part05
		bodyModel[122].setRotationPoint(-10F, -23F, 5F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[123].setRotationPoint(6F, -6F, -6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[124].setRotationPoint(-11F, -9.25F, 5.43F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[125].setRotationPoint(-10.75F, -9F, 5.9F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[126].setRotationPoint(-13.5F, -8.75F, 6.15F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[127].setRotationPoint(-11F, -9.25F, -7.63F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[128].setRotationPoint(-13.5F, -8.75F, -6.88F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[129].setRotationPoint(-11F, -8.75F, 0F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[130].setRotationPoint(-11F, -8.75F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[131].setRotationPoint(-10.5F, -8.5F, -0.25F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[132].setRotationPoint(-12.5F, -7F, -0.25F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[133].setRotationPoint(-11.5F, -8.75F, -0.25F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[134].setRotationPoint(-12.5F, -8.5F, 0F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[135].setRotationPoint(-12.5F, -8.5F, -0.75F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[136].setRotationPoint(-11F, -8.75F, 0.25F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[137].setRotationPoint(-11F, -8.5F, -0.25F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[138].setRotationPoint(-11F, -9F, -0.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[139].setRotationPoint(-11F, -6F, -0.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[140].setRotationPoint(-11F, -8.75F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[141].setRotationPoint(-12.5F, -6F, -0.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[142].setRotationPoint(-12.5F, -5.25F, -0.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[143].setRotationPoint(-14.5F, -8.87F, 5.03F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[144].setRotationPoint(-14.5F, -9.87F, 5.03F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[145].setRotationPoint(-14.5F, -9.37F, 5.03F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[146].setRotationPoint(-14.5F, -7.87F, 5.03F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[147].setRotationPoint(-14.5F, -8.37F, 5.03F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[148].setRotationPoint(-14.5F, -8.87F, -8.03F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[149].setRotationPoint(-14.5F, -9.87F, -8.03F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[150].setRotationPoint(-14.5F, -9.37F, -8.03F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[151].setRotationPoint(-14.5F, -7.87F, -8.03F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[152].setRotationPoint(-14.5F, -8.37F, -8.03F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[153].setRotationPoint(-10.75F, -9.5F, 5.9F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[154].setRotationPoint(-10.75F, -8.25F, 5.9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[155].setRotationPoint(-10.75F, -9F, -7.13F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[156].setRotationPoint(-10.75F, -9.5F, -7.13F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[157].setRotationPoint(-10.75F, -8.25F, -7.13F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[158].setRotationPoint(104F, -9.25F, 5.43F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[159].setRotationPoint(103.75F, -9F, 5.9F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[160].setRotationPoint(104.5F, -8.75F, 6.15F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[161].setRotationPoint(104F, -9.25F, -7.63F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[162].setRotationPoint(104.5F, -8.75F, -6.88F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[163].setRotationPoint(104F, -8.75F, 0F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[164].setRotationPoint(104F, -8.75F, -1F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[165].setRotationPoint(103.5F, -8.5F, -0.25F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[166].setRotationPoint(104.5F, -7F, -0.25F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[167].setRotationPoint(104.5F, -8.75F, -0.25F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[168].setRotationPoint(103.5F, -8.5F, 0F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[169].setRotationPoint(103.5F, -8.5F, -0.75F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[170].setRotationPoint(104F, -8.75F, 0.25F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[171].setRotationPoint(104F, -8.5F, -0.25F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[172].setRotationPoint(104F, -9F, -0.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[173].setRotationPoint(104F, -6F, -0.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[174].setRotationPoint(104F, -8.75F, -1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[175].setRotationPoint(104.5F, -6F, -0.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[176].setRotationPoint(105.5F, -5.25F, -0.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[177].setRotationPoint(107.5F, -8.87F, 5.03F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[178].setRotationPoint(107.5F, -9.87F, 5.03F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[179].setRotationPoint(107.5F, -9.37F, 5.03F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[180].setRotationPoint(107.5F, -7.87F, 5.03F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[181].setRotationPoint(107.5F, -8.37F, 5.03F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[182].setRotationPoint(107.5F, -8.87F, -8.03F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[183].setRotationPoint(107.5F, -9.87F, -8.03F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[184].setRotationPoint(107.5F, -9.37F, -8.03F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[185].setRotationPoint(107.5F, -7.87F, -8.03F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[186].setRotationPoint(107.5F, -8.37F, -8.03F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[187].setRotationPoint(103.75F, -9.5F, 5.9F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[188].setRotationPoint(103.75F, -8.25F, 5.9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[189].setRotationPoint(103.75F, -9F, -7.13F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[190].setRotationPoint(103.75F, -9.5F, -7.13F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[191].setRotationPoint(103.75F, -8.25F, -7.13F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-0.625F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.625F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Du loco part05
		bodyModel[192].setRotationPoint(-11F, -28F, 1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Du loco part05
		bodyModel[193].setRotationPoint(-11F, -23F, 1F);

		bodyModel[194].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[194].setRotationPoint(61F, -33F, -4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Du loco part37
		bodyModel[195].setRotationPoint(62F, -35F, 0F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part42
		bodyModel[196].setRotationPoint(-9F, -6F, 1F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -1F, -1F, -5.875F, -1F, -1F, -2F, 0F, -1F, -3.875F, 0F, -1F, -1F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -5.875F, 0F, 0F); // Du loco part42
		bodyModel[197].setRotationPoint(-10F, -7F, 1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,-1F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F, 1F, 1F, 0F, -6.875F, 1F, 0F, -3F, 1F, -2F, -2.875F, 1F, -2F); // Du loco part42
		bodyModel[198].setRotationPoint(-10F, -3F, 1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,-2.875F, 0F, 0F, 0F, 0F, 0F, -2.375F, 0F, 0F, -0.5F, 0F, 0F, -2.375F, 0F, 0F, -0.5F, 0F, 0F, -2.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[199].setRotationPoint(-10F, -7F, -8F);

		bodyModel[200].addShapeBox(0F, 0F, 1F, 2, 9, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[200].setRotationPoint(-8F, -21F, 9F);

		bodyModel[201].addShapeBox(0F, 0F, 1F, 2, 9, 1, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[201].setRotationPoint(-8F, -21F, -12F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part19
		bodyModel[202].setRotationPoint(-11F, -29F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 1F, 2, 8, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 168
		bodyModel[203].setRotationPoint(-8F, -29F, 9F);

		bodyModel[204].addShapeBox(0F, 0F, 1F, 2, 8, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 168
		bodyModel[204].setRotationPoint(-8F, -29F, -12F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 149
		bodyModel[205].setRotationPoint(-10.25F, -30F, -5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[206].setRotationPoint(-9.25F, -30F, 1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,-4F, 1F, -6F, -2F, -1F, 0F, -2F, -1F, 0F, -4F, 1F, -6F, 0F, 0F, -6F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -6F); // Box 149
		bodyModel[207].setRotationPoint(-9.25F, -31F, -7F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[208].setRotationPoint(-9.25F, -30F, 5F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[209].setRotationPoint(-8.25F, -30F, 5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[210].setRotationPoint(-7.25F, -30F, 10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[211].setRotationPoint(-7.25F, -30F, 7F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 168
		bodyModel[212].setRotationPoint(-7.25F, -31F, 7F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, -2F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[213].setRotationPoint(-7.25F, -32F, -7F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 168
		bodyModel[214].setRotationPoint(-8.25F, -30F, -10F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[215].setRotationPoint(-9.25F, -30F, -5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[216].setRotationPoint(-9.25F, -30F, -8F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[217].setRotationPoint(-8.25F, -30F, -8F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,-2F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, -2F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[218].setRotationPoint(-7.25F, -30F, -11F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[219].setRotationPoint(-7.25F, -30F, -10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[220].setRotationPoint(-7.25F, -31F, -10F);

		bodyModel[221].addShapeBox(0F, 0F, 1F, 3, 9, 3, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[221].setRotationPoint(-10F, -21F, -9F);

		bodyModel[222].addShapeBox(0F, 0F, 1F, 3, 9, 3, 0F,-0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[222].setRotationPoint(-10F, -21F, 4F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Du loco part05
		bodyModel[223].setRotationPoint(-9F, -23F, 8F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.625F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.625F, 0F, 0F, -0.625F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1.625F, -0.75F, 0F); // Du loco part05
		bodyModel[224].setRotationPoint(-10F, -28F, 5F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-0.625F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1.625F, 0F, 0F, -0.625F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1.625F, -0.75F, 0F); // Du loco part05
		bodyModel[225].setRotationPoint(-11F, -28F, 1F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.625F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.625F, 0F, 0F, -0.625F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -1.625F, -0.75F, 0F); // Du loco part05
		bodyModel[226].setRotationPoint(-9F, -28F, 8F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-0.625F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.625F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Du loco part05
		bodyModel[227].setRotationPoint(-8F, -28F, -10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.25F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part05
		bodyModel[228].setRotationPoint(-10F, -23F, -8F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-0.625F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Du loco part05
		bodyModel[229].setRotationPoint(-11F, -28F, -2F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1.25F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part05
		bodyModel[230].setRotationPoint(-11F, -23F, -5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1.25F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part05
		bodyModel[231].setRotationPoint(-9F, -23F, -10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1.625F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.625F, 0F, 0F, -1.625F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.625F, -0.75F, 0F); // Du loco part05
		bodyModel[232].setRotationPoint(-10F, -28F, -8F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.625F, 0F, 0F, -1.625F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.625F, -0.75F, 0F); // Du loco part05
		bodyModel[233].setRotationPoint(-11F, -28F, -5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1.625F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.625F, 0F, 0F, -1.625F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.625F, -0.75F, 0F); // Du loco part05
		bodyModel[234].setRotationPoint(-9F, -28F, -10F);

		bodyModel[235].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[235].setRotationPoint(-10.25F, -15.5F, 5F);

		bodyModel[236].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[236].setRotationPoint(-10.25F, -17F, -9F);

		bodyModel[237].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[237].setRotationPoint(-10.25F, -16F, -9F);

		bodyModel[238].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[238].setRotationPoint(-10.25F, -15.5F, -9F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[239].setRotationPoint(-10F, -11F, -1F);

		bodyModel[240].addShapeBox(0F, 0F, 1F, 4, 4, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[240].setRotationPoint(-10F, -11F, -6F);

		bodyModel[241].addShapeBox(0F, 0F, 1F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[241].setRotationPoint(-10F, -11F, 0F);

		bodyModel[242].addShapeBox(0F, 0F, 1F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[242].setRotationPoint(-8F, -11F, 7F);

		bodyModel[243].addShapeBox(0F, 0F, 1F, 2, 4, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[243].setRotationPoint(-8F, -11F, -11F);

		bodyModel[244].addShapeBox(0F, 0F, 1F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[244].setRotationPoint(-7F, -11F, 9F);

		bodyModel[245].addShapeBox(0F, 0F, 1F, 1, 4, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[245].setRotationPoint(-7F, -11F, -12F);

		bodyModel[246].addShapeBox(0F, 0F, 1F, 3, 4, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[246].setRotationPoint(-9F, -11F, -9F);

		bodyModel[247].addShapeBox(0F, 0F, 1F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[247].setRotationPoint(-9F, -11F, 4F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 0
		bodyModel[248].setRotationPoint(-10F, -9.5F, -7.88F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 0
		bodyModel[249].setRotationPoint(-10F, -9.5F, 5.18F);

		bodyModel[250].addShapeBox(0F, 0F, 1F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[250].setRotationPoint(-6F, -8F, 9F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part19
		bodyModel[251].setRotationPoint(-12F, -12F, -1F);

		bodyModel[252].addShapeBox(0F, 0F, 1F, 6, 1, 4, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 167
		bodyModel[252].setRotationPoint(-12F, -12F, -6F);

		bodyModel[253].addShapeBox(0F, 0F, 1F, 6, 1, 4, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Box 168
		bodyModel[253].setRotationPoint(-12F, -12F, 0F);

		bodyModel[254].addShapeBox(0F, 0F, 1F, 4, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Box 168
		bodyModel[254].setRotationPoint(-10F, -12F, 7F);

		bodyModel[255].addShapeBox(0F, 0F, 1F, 4, 1, 2, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 167
		bodyModel[255].setRotationPoint(-10F, -12F, -11F);

		bodyModel[256].addShapeBox(0F, 0F, 1F, 3, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Box 168
		bodyModel[256].setRotationPoint(-9F, -12F, 9F);

		bodyModel[257].addShapeBox(0F, 0F, 1F, 3, 1, 1, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 168
		bodyModel[257].setRotationPoint(-9F, -12F, -12F);

		bodyModel[258].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 167
		bodyModel[258].setRotationPoint(-11F, -12F, -9F);

		bodyModel[259].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Box 168
		bodyModel[259].setRotationPoint(-11F, -12F, 4F);

		bodyModel[260].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[260].setRotationPoint(13F, -48F, -6F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[261].setRotationPoint(13F, -48F, 6F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[262].setRotationPoint(13F, -48F, -8F);

		bodyModel[263].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[263].setRotationPoint(13F, -38F, -6F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[264].setRotationPoint(13F, -38F, 6F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[265].setRotationPoint(13F, -38F, -8F);

		bodyModel[266].addBox(0F, 0F, 0F, 80, 2, 2, 0F); // Du loco part08
		bodyModel[266].setRotationPoint(7F, -32F, -1F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 80, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[267].setRotationPoint(7F, -31F, 7F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 80, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[268].setRotationPoint(7F, -32F, 1F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 80, 2, 6, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[269].setRotationPoint(7F, -32F, -7F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 80, 1, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[270].setRotationPoint(7F, -31F, -10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[271].setRotationPoint(2F, -10F, 6.05F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[272].setRotationPoint(2F, -10F, -6.05F);

		bodyModel[273].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[273].setRotationPoint(27F, -6F, -6F);

		bodyModel[274].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 135
		bodyModel[274].setRotationPoint(-6F, -29F, 10F);

		bodyModel[275].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 135
		bodyModel[275].setRotationPoint(-6F, -28F, 10F);

		bodyModel[276].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 135
		bodyModel[276].setRotationPoint(0F, -28F, 10F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 135
		bodyModel[277].setRotationPoint(1F, -29F, 10F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[278].setRotationPoint(2F, -8.5F, 10F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[279].setRotationPoint(2F, -10.5F, 10F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 135
		bodyModel[280].setRotationPoint(2F, -22F, 10F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F); // Du loco part05
		bodyModel[281].setRotationPoint(1F, -29F, 10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[282].setRotationPoint(6F, -29F, 10F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 135
		bodyModel[283].setRotationPoint(2F, -29F, 10F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[284].setRotationPoint(1.25F, -24F, 9.75F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[285].setRotationPoint(1.25F, -13.5F, 9.75F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 135
		bodyModel[286].setRotationPoint(6F, -29F, 10F);

		bodyModel[287].addBox(0F, 0F, 0F, 57, 14, 1, 0F); // Box 135
		bodyModel[287].setRotationPoint(7F, -22F, 10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[288].setRotationPoint(6.5F, -24F, 10F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[289].setRotationPoint(6.5F, -24F, 9.75F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[290].setRotationPoint(6.5F, -13.5F, 9.75F);

		bodyModel[291].addBox(0F, 0F, 0F, 7, 6, 1, 0F); // Box 135
		bodyModel[291].setRotationPoint(7F, -28F, 10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[292].setRotationPoint(14F, -28F, 10F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[293].setRotationPoint(14F, -28F, 10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[294].setRotationPoint(14F, -28F, 10F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[295].setRotationPoint(14F, -28F, 10F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[296].setRotationPoint(19F, -26F, 10F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[297].setRotationPoint(18F, -28F, 10F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[298].setRotationPoint(19F, -28F, 10F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[299].setRotationPoint(19F, -28F, 10F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[300].setRotationPoint(18F, -28F, 10F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[301].setRotationPoint(14F, -23F, 10F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[302].setRotationPoint(14F, -24F, 10F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[303].setRotationPoint(14F, -24F, 10F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[304].setRotationPoint(14F, -23F, 10F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[305].setRotationPoint(18F, -23F, 10F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[306].setRotationPoint(19F, -24F, 10F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[307].setRotationPoint(19F, -24F, 10F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[308].setRotationPoint(18F, -23F, 10F);

		bodyModel[309].addBox(0F, 0F, 0F, 57, 1, 1, 0F); // Box 135
		bodyModel[309].setRotationPoint(7F, -29F, 10F);

		bodyModel[310].addBox(0F, 0F, 0F, 14, 6, 1, 0F); // Box 135
		bodyModel[310].setRotationPoint(20F, -28F, 10F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[311].setRotationPoint(36F, -23F, 10F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[312].setRotationPoint(36F, -28F, 10F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[313].setRotationPoint(34F, -26F, 10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[314].setRotationPoint(34F, -28F, 10F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[315].setRotationPoint(34F, -28F, 10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[316].setRotationPoint(34F, -28F, 10F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[317].setRotationPoint(34F, -28F, 10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[318].setRotationPoint(39F, -26F, 10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[319].setRotationPoint(38F, -28F, 10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[320].setRotationPoint(39F, -28F, 10F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[321].setRotationPoint(39F, -28F, 10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[322].setRotationPoint(38F, -28F, 10F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[323].setRotationPoint(34F, -23F, 10F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[324].setRotationPoint(34F, -24F, 10F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[325].setRotationPoint(34F, -24F, 10F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[326].setRotationPoint(34F, -23F, 10F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[327].setRotationPoint(38F, -23F, 10F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[328].setRotationPoint(39F, -24F, 10F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[329].setRotationPoint(39F, -24F, 10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[330].setRotationPoint(38F, -23F, 10F);

		bodyModel[331].addBox(0F, 0F, 0F, 14, 6, 1, 0F); // Box 135
		bodyModel[331].setRotationPoint(40F, -28F, 10F);

		bodyModel[332].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 135
		bodyModel[332].setRotationPoint(60F, -28F, 10F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[333].setRotationPoint(56F, -23F, 10F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[334].setRotationPoint(56F, -28F, 10F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[335].setRotationPoint(54F, -26F, 10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[336].setRotationPoint(54F, -28F, 10F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[337].setRotationPoint(54F, -28F, 10F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[338].setRotationPoint(54F, -28F, 10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[339].setRotationPoint(54F, -28F, 10F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[340].setRotationPoint(59F, -26F, 10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[341].setRotationPoint(58F, -28F, 10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[342].setRotationPoint(59F, -28F, 10F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[343].setRotationPoint(59F, -28F, 10F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[344].setRotationPoint(58F, -28F, 10F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[345].setRotationPoint(54F, -23F, 10F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[346].setRotationPoint(54F, -24F, 10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[347].setRotationPoint(54F, -24F, 10F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[348].setRotationPoint(54F, -23F, 10F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[349].setRotationPoint(58F, -23F, 10F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[350].setRotationPoint(59F, -24F, 10F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[351].setRotationPoint(59F, -24F, 10F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[352].setRotationPoint(58F, -23F, 10F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[353].setRotationPoint(76F, -23F, 10F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[354].setRotationPoint(76F, -28F, 10F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[355].setRotationPoint(74F, -26F, 10F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[356].setRotationPoint(74F, -28F, 10F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[357].setRotationPoint(74F, -28F, 10F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[358].setRotationPoint(74F, -28F, 10F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[359].setRotationPoint(74F, -28F, 10F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[360].setRotationPoint(79F, -26F, 10F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[361].setRotationPoint(78F, -28F, 10F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[362].setRotationPoint(79F, -28F, 10F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[363].setRotationPoint(79F, -28F, 10F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[364].setRotationPoint(78F, -28F, 10F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[365].setRotationPoint(74F, -23F, 10F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[366].setRotationPoint(74F, -24F, 10F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[367].setRotationPoint(74F, -24F, 10F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[368].setRotationPoint(74F, -23F, 10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[369].setRotationPoint(78F, -23F, 10F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[370].setRotationPoint(79F, -24F, 10F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[371].setRotationPoint(79F, -24F, 10F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[372].setRotationPoint(78F, -23F, 10F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[373].setRotationPoint(87.25F, -24F, -11F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[374].setRotationPoint(88F, -23F, -11F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[375].setRotationPoint(88F, -28F, -11F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[376].setRotationPoint(88F, -28F, -11F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[377].setRotationPoint(91F, -28F, -11F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[378].setRotationPoint(87F, -29F, -11F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 4, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[379].setRotationPoint(88F, -22F, -11F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[380].setRotationPoint(87F, -29F, -11F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[381].setRotationPoint(92F, -29F, -11F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[382].setRotationPoint(88F, -29F, -11F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[383].setRotationPoint(87.25F, -24F, -10.75F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[384].setRotationPoint(87.25F, -13F, -10.75F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 135
		bodyModel[385].setRotationPoint(92F, -29F, -11F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[386].setRotationPoint(92.5F, -24F, -11F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[387].setRotationPoint(92.5F, -24F, -10.75F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[388].setRotationPoint(92.5F, -13F, -10.75F);

		bodyModel[389].addBox(0F, 0F, 0F, 7, 14, 1, 0F); // Box 135
		bodyModel[389].setRotationPoint(93F, -22F, -11F);

		bodyModel[390].addBox(0F, 0F, 0F, 14, 6, 1, 0F); // Box 135
		bodyModel[390].setRotationPoint(60F, -28F, -11F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[391].setRotationPoint(76F, -23F, -11F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[392].setRotationPoint(76F, -28F, -11F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[393].setRotationPoint(74F, -26F, -11F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[394].setRotationPoint(74F, -28F, -11F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[395].setRotationPoint(74F, -28F, -11F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[396].setRotationPoint(74F, -28F, -11F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[397].setRotationPoint(74F, -28F, -11F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[398].setRotationPoint(79F, -26F, -11F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[399].setRotationPoint(78F, -28F, -11F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[400].setRotationPoint(79F, -28F, -11F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[401].setRotationPoint(79F, -28F, -11F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[402].setRotationPoint(78F, -28F, -11F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[403].setRotationPoint(74F, -23F, -11F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[404].setRotationPoint(74F, -24F, -11F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[405].setRotationPoint(74F, -24F, -11F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[406].setRotationPoint(74F, -23F, -11F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[407].setRotationPoint(78F, -23F, -11F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[408].setRotationPoint(79F, -24F, -11F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[409].setRotationPoint(79F, -24F, -11F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[410].setRotationPoint(78F, -23F, -11F);

		bodyModel[411].addBox(0F, 0F, 0F, 7, 6, 1, 0F); // Box 135
		bodyModel[411].setRotationPoint(80F, -28F, -11F);

		bodyModel[412].addBox(0F, 0F, 0F, 14, 6, 1, 0F); // Box 135
		bodyModel[412].setRotationPoint(40F, -28F, -11F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[413].setRotationPoint(56F, -23F, -11F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[414].setRotationPoint(56F, -28F, -11F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[415].setRotationPoint(54F, -26F, -11F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[416].setRotationPoint(54F, -28F, -11F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[417].setRotationPoint(54F, -28F, -11F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[418].setRotationPoint(54F, -28F, -11F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[419].setRotationPoint(54F, -28F, -11F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[420].setRotationPoint(59F, -26F, -11F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[421].setRotationPoint(58F, -28F, -11F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[422].setRotationPoint(59F, -28F, -11F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[423].setRotationPoint(59F, -28F, -11F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[424].setRotationPoint(58F, -28F, -11F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[425].setRotationPoint(54F, -23F, -11F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[426].setRotationPoint(54F, -24F, -11F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[427].setRotationPoint(54F, -24F, -11F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[428].setRotationPoint(54F, -23F, -11F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[429].setRotationPoint(58F, -23F, -11F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[430].setRotationPoint(59F, -24F, -11F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[431].setRotationPoint(59F, -24F, -11F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[432].setRotationPoint(58F, -23F, -11F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[433].setRotationPoint(36F, -23F, -11F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[434].setRotationPoint(36F, -28F, -11F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[435].setRotationPoint(34F, -26F, -11F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[436].setRotationPoint(34F, -28F, -11F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[437].setRotationPoint(34F, -28F, -11F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[438].setRotationPoint(34F, -28F, -11F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[439].setRotationPoint(34F, -28F, -11F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[440].setRotationPoint(39F, -26F, -11F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[441].setRotationPoint(38F, -28F, -11F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[442].setRotationPoint(39F, -28F, -11F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[443].setRotationPoint(39F, -28F, -11F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[444].setRotationPoint(38F, -28F, -11F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[445].setRotationPoint(34F, -23F, -11F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[446].setRotationPoint(34F, -24F, -11F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[447].setRotationPoint(34F, -24F, -11F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[448].setRotationPoint(34F, -23F, -11F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[449].setRotationPoint(38F, -23F, -11F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[450].setRotationPoint(39F, -24F, -11F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[451].setRotationPoint(39F, -24F, -11F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[452].setRotationPoint(38F, -23F, -11F);

		bodyModel[453].addBox(0F, 0F, 0F, 11, 6, 1, 0F); // Box 135
		bodyModel[453].setRotationPoint(3F, -28F, -11F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[454].setRotationPoint(16F, -23F, -11F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[455].setRotationPoint(16F, -28F, -11F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[456].setRotationPoint(14F, -26F, -11F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F); // Du loco part05
		bodyModel[457].setRotationPoint(14F, -28F, -11F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[458].setRotationPoint(14F, -28F, -11F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[459].setRotationPoint(14F, -28F, -11F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F); // Du loco part05
		bodyModel[460].setRotationPoint(14F, -28F, -11F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[461].setRotationPoint(19F, -26F, -11F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[462].setRotationPoint(18F, -28F, -11F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[463].setRotationPoint(19F, -28F, -11F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[464].setRotationPoint(19F, -28F, -11F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F); // Du loco part05
		bodyModel[465].setRotationPoint(18F, -28F, -11F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[466].setRotationPoint(14F, -23F, -11F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F); // Du loco part05
		bodyModel[467].setRotationPoint(14F, -24F, -11F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F); // Du loco part05
		bodyModel[468].setRotationPoint(14F, -24F, -11F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.375F, 0F, -1.25F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[469].setRotationPoint(14F, -23F, -11F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[470].setRotationPoint(18F, -23F, -11F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, -0.75F, 0F, -0.75F, -0.625F, 0F, -0.75F, -0.625F, 0F, -0.125F, -0.75F, 0F); // Du loco part05
		bodyModel[471].setRotationPoint(19F, -24F, -11F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.25F, -0.625F, 0F); // Du loco part05
		bodyModel[472].setRotationPoint(19F, -24F, -11F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.25F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, -1.25F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[473].setRotationPoint(18F, -23F, -11F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[474].setRotationPoint(64.25F, -24F, 10F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 135
		bodyModel[475].setRotationPoint(64F, -29F, 10F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 5, 17, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 135
		bodyModel[476].setRotationPoint(64.75F, -29F, 10F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[477].setRotationPoint(64.25F, -24F, 9.75F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[478].setRotationPoint(69.5F, -24F, 10F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[479].setRotationPoint(69.5F, -24F, 9.75F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[480].setRotationPoint(69.5F, -13.5F, 9.75F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Box 135
		bodyModel[481].setRotationPoint(69F, -29F, 10F);

		bodyModel[482].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 135
		bodyModel[482].setRotationPoint(70F, -28F, 10F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[483].setRotationPoint(41F, -10F, 6.05F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[484].setRotationPoint(41F, -10F, -6.05F);

		bodyModel[485].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[485].setRotationPoint(66F, -6F, -6F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[486].setRotationPoint(62F, -10F, 6.05F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[487].setRotationPoint(62F, -10F, -6.05F);

		bodyModel[488].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[488].setRotationPoint(87F, -6F, -6F);

		bodyModel[489].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[489].setRotationPoint(1F, -12F, 10F);

		bodyModel[490].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[490].setRotationPoint(6F, -12F, 10F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 135
		bodyModel[491].setRotationPoint(2F, -12F, 10F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 135
		bodyModel[492].setRotationPoint(2F, -11.75F, 10F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[493].setRotationPoint(65F, -8.5F, 10F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[494].setRotationPoint(65F, -10.5F, 10F);

		bodyModel[495].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[495].setRotationPoint(64F, -12F, 10F);

		bodyModel[496].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[496].setRotationPoint(69F, -12F, 10F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 135
		bodyModel[497].setRotationPoint(65F, -12F, 10F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Box 135
		bodyModel[498].setRotationPoint(65F, -11.75F, 10F);

		bodyModel[499].addBox(0F, 0F, 0F, 30, 14, 1, 0F); // Box 135
		bodyModel[499].setRotationPoint(70F, -22F, 10F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 168
		bodyModel[501] = new ModelRendererTurbo(this, 137, 185, textureX, textureY); // Box 168
		bodyModel[502] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Box 168
		bodyModel[503] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Box 168
		bodyModel[504] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 168
		bodyModel[505] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 168
		bodyModel[506] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Box 168
		bodyModel[507] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 168
		bodyModel[508] = new ModelRendererTurbo(this, 89, 193, textureX, textureY); // Box 168
		bodyModel[509] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 168
		bodyModel[510] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Box 168
		bodyModel[511] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 168
		bodyModel[512] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Du loco part08
		bodyModel[513] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Du loco part19
		bodyModel[514] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Box 149
		bodyModel[515] = new ModelRendererTurbo(this, 409, 193, textureX, textureY); // Box 167
		bodyModel[516] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 168
		bodyModel[517] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 149
		bodyModel[518] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 168
		bodyModel[519] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 167
		bodyModel[520] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 168
		bodyModel[521] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Du loco part71
		bodyModel[522] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part71
		bodyModel[523] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Du loco part05
		bodyModel[524] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Du loco part05
		bodyModel[525] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Du loco part05
		bodyModel[526] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Du loco part05
		bodyModel[527] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Box 168
		bodyModel[528] = new ModelRendererTurbo(this, 505, 201, textureX, textureY); // Box 168
		bodyModel[529] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Du loco part19
		bodyModel[530] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 168
		bodyModel[531] = new ModelRendererTurbo(this, 89, 209, textureX, textureY); // Box 168
		bodyModel[532] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 149
		bodyModel[533] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 149
		bodyModel[534] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 149
		bodyModel[535] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 168
		bodyModel[536] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 168
		bodyModel[537] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 168
		bodyModel[538] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 168
		bodyModel[539] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 168
		bodyModel[540] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 149
		bodyModel[541] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Box 168
		bodyModel[542] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 149
		bodyModel[543] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Box 168
		bodyModel[544] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 168
		bodyModel[545] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Box 168
		bodyModel[546] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 168
		bodyModel[547] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 168
		bodyModel[548] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 167
		bodyModel[549] = new ModelRendererTurbo(this, 433, 209, textureX, textureY); // Box 168
		bodyModel[550] = new ModelRendererTurbo(this, 449, 209, textureX, textureY); // Du loco part05
		bodyModel[551] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Du loco part05
		bodyModel[552] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Du loco part05
		bodyModel[553] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Du loco part05
		bodyModel[554] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Du loco part05
		bodyModel[555] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Du loco part05
		bodyModel[556] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Du loco part05
		bodyModel[557] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Du loco part05
		bodyModel[558] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Du loco part05
		bodyModel[559] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Du loco part05
		bodyModel[560] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Du loco part05
		bodyModel[561] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Du loco part05
		bodyModel[562] = new ModelRendererTurbo(this, 161, 217, textureX, textureY); // Du loco part19
		bodyModel[563] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Box 167
		bodyModel[564] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 168
		bodyModel[565] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 168
		bodyModel[566] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 167
		bodyModel[567] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 168
		bodyModel[568] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 168
		bodyModel[569] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 167
		bodyModel[570] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Box 168
		bodyModel[571] = new ModelRendererTurbo(this, 177, 217, textureX, textureY); // Du loco part19
		bodyModel[572] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Box 167
		bodyModel[573] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Box 168
		bodyModel[574] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 168
		bodyModel[575] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Box 167
		bodyModel[576] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 168
		bodyModel[577] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 168
		bodyModel[578] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Box 167
		bodyModel[579] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 168
		bodyModel[580] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 168
		bodyModel[581] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 168
		bodyModel[582] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 168
		bodyModel[583] = new ModelRendererTurbo(this, 17, 225, textureX, textureY); // Box 168
		bodyModel[584] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 168
		bodyModel[585] = new ModelRendererTurbo(this, 49, 225, textureX, textureY); // Box 168
		bodyModel[586] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Box 168
		bodyModel[587] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Box 168
		bodyModel[588] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 168
		bodyModel[589] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 168
		bodyModel[590] = new ModelRendererTurbo(this, 129, 225, textureX, textureY); // Box 168
		bodyModel[591] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 168
		bodyModel[592] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Du loco part05
		bodyModel[593] = new ModelRendererTurbo(this, 185, 225, textureX, textureY); // Du loco part05
		bodyModel[594] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Du loco part05
		bodyModel[595] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Du loco part05
		bodyModel[596] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 135
		bodyModel[597] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Box 135
		bodyModel[598] = new ModelRendererTurbo(this, 409, 217, textureX, textureY); // Box 135
		bodyModel[599] = new ModelRendererTurbo(this, 409, 225, textureX, textureY); // Box 168
		bodyModel[600] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 168
		bodyModel[601] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Box 135
		bodyModel[602] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Box 135
		bodyModel[603] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 135
		bodyModel[604] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 135
		bodyModel[605] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 135
		bodyModel[606] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 135
		bodyModel[607] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 135
		bodyModel[608] = new ModelRendererTurbo(this, 489, 217, textureX, textureY); // Box 135
		bodyModel[609] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Box 135
		bodyModel[610] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 135
		bodyModel[611] = new ModelRendererTurbo(this, 289, 225, textureX, textureY); // Box 135
		bodyModel[612] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Box 135
		bodyModel[613] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Box 135
		bodyModel[614] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Box 135
		bodyModel[615] = new ModelRendererTurbo(this, 201, 233, textureX, textureY); // Box 168
		bodyModel[616] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 0
		bodyModel[617] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Box 0
		bodyModel[618] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Box 135
		bodyModel[619] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Box 135
		bodyModel[620] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Du loco part28
		bodyModel[621] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Du loco part28
		bodyModel[622] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Box 135
		bodyModel[623] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Box 135
		bodyModel[624] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Du loco part28
		bodyModel[625] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Du loco part28
		bodyModel[626] = new ModelRendererTurbo(this, 409, 233, textureX, textureY); // Du loco part28
		bodyModel[627] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Du loco part28
		bodyModel[628] = new ModelRendererTurbo(this, 425, 233, textureX, textureY); // Box 135
		bodyModel[629] = new ModelRendererTurbo(this, 433, 233, textureX, textureY); // Du loco part28
		bodyModel[630] = new ModelRendererTurbo(this, 441, 233, textureX, textureY); // Box 135
		bodyModel[631] = new ModelRendererTurbo(this, 201, 241, textureX, textureY); // Box 168
		bodyModel[632] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Du loco part08
		bodyModel[633] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Box 135
		bodyModel[634] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 135
		bodyModel[635] = new ModelRendererTurbo(this, 435, 241, textureX, textureY); // Du loco part05
		bodyModel[636] = new ModelRendererTurbo(this, 459, 241, textureX, textureY); // Du loco part05
		bodyModel[637] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Du loco part05
		bodyModel[638] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Du loco part05
		bodyModel[639] = new ModelRendererTurbo(this, 161, 249, textureX, textureY); // Box 168
		bodyModel[640] = new ModelRendererTurbo(this, 489, 241, textureX, textureY); // Lamp
		bodyModel[641] = new ModelRendererTurbo(this, 329, 249, textureX, textureY); // Lamp
		bodyModel[642] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Lamp
		bodyModel[643] = new ModelRendererTurbo(this, 361, 249, textureX, textureY); // Lamp
		bodyModel[644] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Lamp
		bodyModel[645] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Lamp
		bodyModel[646] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Du loco part37
		bodyModel[647] = new ModelRendererTurbo(this, 161, 257, textureX, textureY); // Du loco part08
		bodyModel[648] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Du loco part37
		bodyModel[649] = new ModelRendererTurbo(this, 465, 249, textureX, textureY); // Du loco part37
		bodyModel[650] = new ModelRendererTurbo(this, 481, 249, textureX, textureY); // Du loco part37
		bodyModel[651] = new ModelRendererTurbo(this, 497, 249, textureX, textureY); // Du loco part37
		bodyModel[652] = new ModelRendererTurbo(this, 409, 249, textureX, textureY); // Du loco part37
		bodyModel[653] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Du loco part37
		bodyModel[654] = new ModelRendererTurbo(this, 321, 257, textureX, textureY); // Du loco part37
		bodyModel[655] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Du loco part37
		bodyModel[656] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Du loco part37
		bodyModel[657] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Du loco part37
		bodyModel[658] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Du loco part37
		bodyModel[659] = new ModelRendererTurbo(this, 361, 257, textureX, textureY); // Du loco part37
		bodyModel[660] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Du loco part37
		bodyModel[661] = new ModelRendererTurbo(this, 409, 257, textureX, textureY); // Du loco part37
		bodyModel[662] = new ModelRendererTurbo(this, 417, 257, textureX, textureY); // Du loco part37
		bodyModel[663] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Du loco part37
		bodyModel[664] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Du loco part37
		bodyModel[665] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Du loco part37
		bodyModel[666] = new ModelRendererTurbo(this, 457, 257, textureX, textureY); // Du loco part37
		bodyModel[667] = new ModelRendererTurbo(this, 473, 257, textureX, textureY); // Du loco part37
		bodyModel[668] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Du loco part37
		bodyModel[669] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part06
		bodyModel[670] = new ModelRendererTurbo(this, 17, 265, textureX, textureY); // Du loco part06
		bodyModel[671] = new ModelRendererTurbo(this, 33, 265, textureX, textureY); // Du loco part06
		bodyModel[672] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Du loco part06
		bodyModel[673] = new ModelRendererTurbo(this, 57, 265, textureX, textureY); // Du loco part06
		bodyModel[674] = new ModelRendererTurbo(this, 81, 265, textureX, textureY); // Du loco part06
		bodyModel[675] = new ModelRendererTurbo(this, 377, 257, textureX, textureY); // Du loco part06
		bodyModel[676] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Du loco part06
		bodyModel[677] = new ModelRendererTurbo(this, 129, 265, textureX, textureY); // Du loco part06
		bodyModel[678] = new ModelRendererTurbo(this, 401, 257, textureX, textureY); // Du loco part06
		bodyModel[679] = new ModelRendererTurbo(this, 329, 265, textureX, textureY); // Du loco part06
		bodyModel[680] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Du loco part06
		bodyModel[681] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Du loco part06
		bodyModel[682] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Du loco part06
		bodyModel[683] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Du loco part06
		bodyModel[684] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Du loco part06
		bodyModel[685] = new ModelRendererTurbo(this, 17, 273, textureX, textureY); // Du loco part06
		bodyModel[686] = new ModelRendererTurbo(this, 33, 273, textureX, textureY); // Du loco part06
		bodyModel[687] = new ModelRendererTurbo(this, 49, 273, textureX, textureY); // Du loco part06
		bodyModel[688] = new ModelRendererTurbo(this, 65, 273, textureX, textureY); // Du loco part06
		bodyModel[689] = new ModelRendererTurbo(this, 81, 273, textureX, textureY); // Du loco part06
		bodyModel[690] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Du loco part06
		bodyModel[691] = new ModelRendererTurbo(this, 505, 265, textureX, textureY); // Du loco part06
		bodyModel[692] = new ModelRendererTurbo(this, 49, 265, textureX, textureY); // Du loco part06
		bodyModel[693] = new ModelRendererTurbo(this, 105, 273, textureX, textureY); // Du loco part06
		bodyModel[694] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Du loco part06
		bodyModel[695] = new ModelRendererTurbo(this, 129, 273, textureX, textureY); // Du loco part06
		bodyModel[696] = new ModelRendererTurbo(this, 137, 273, textureX, textureY); // Du loco part06
		bodyModel[697] = new ModelRendererTurbo(this, 161, 273, textureX, textureY); // Du loco part06
		bodyModel[698] = new ModelRendererTurbo(this, 177, 273, textureX, textureY); // Du loco part06
		bodyModel[699] = new ModelRendererTurbo(this, 121, 265, textureX, textureY); // Du loco part06
		bodyModel[700] = new ModelRendererTurbo(this, 193, 273, textureX, textureY); // Du loco part06
		bodyModel[701] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Du loco part06
		bodyModel[702] = new ModelRendererTurbo(this, 201, 273, textureX, textureY); // Du loco part06
		bodyModel[703] = new ModelRendererTurbo(this, 217, 273, textureX, textureY); // Du loco part06
		bodyModel[704] = new ModelRendererTurbo(this, 217, 273, textureX, textureY); // Du loco part06
		bodyModel[705] = new ModelRendererTurbo(this, 233, 273, textureX, textureY); // Du loco part06
		bodyModel[706] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Du loco part06
		bodyModel[707] = new ModelRendererTurbo(this, 265, 273, textureX, textureY); // Du loco part06
		bodyModel[708] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Du loco part06
		bodyModel[709] = new ModelRendererTurbo(this, 297, 273, textureX, textureY); // Du loco part06
		bodyModel[710] = new ModelRendererTurbo(this, 305, 273, textureX, textureY); // Du loco part06
		bodyModel[711] = new ModelRendererTurbo(this, 313, 273, textureX, textureY); // Du loco part06
		bodyModel[712] = new ModelRendererTurbo(this, 321, 273, textureX, textureY); // Du loco part06
		bodyModel[713] = new ModelRendererTurbo(this, 329, 273, textureX, textureY); // Du loco part06
		bodyModel[714] = new ModelRendererTurbo(this, 337, 273, textureX, textureY); // Du loco part06
		bodyModel[715] = new ModelRendererTurbo(this, 345, 273, textureX, textureY); // Du loco part06
		bodyModel[716] = new ModelRendererTurbo(this, 353, 273, textureX, textureY); // Du loco part06
		bodyModel[717] = new ModelRendererTurbo(this, 361, 273, textureX, textureY); // Du loco part06
		bodyModel[718] = new ModelRendererTurbo(this, 377, 273, textureX, textureY); // Du loco part06
		bodyModel[719] = new ModelRendererTurbo(this, 393, 273, textureX, textureY); // Du loco part06
		bodyModel[720] = new ModelRendererTurbo(this, 401, 273, textureX, textureY); // Du loco part06
		bodyModel[721] = new ModelRendererTurbo(this, 409, 273, textureX, textureY); // Du loco part06
		bodyModel[722] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Du loco part06
		bodyModel[723] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Du loco part06
		bodyModel[724] = new ModelRendererTurbo(this, 449, 273, textureX, textureY); // Du loco part06
		bodyModel[725] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Du loco part06
		bodyModel[726] = new ModelRendererTurbo(this, 441, 273, textureX, textureY); // Du loco part06
		bodyModel[727] = new ModelRendererTurbo(this, 505, 273, textureX, textureY); // Du loco part06
		bodyModel[728] = new ModelRendererTurbo(this, 105, 281, textureX, textureY); // Du loco part06
		bodyModel[729] = new ModelRendererTurbo(this, 121, 281, textureX, textureY); // Du loco part06
		bodyModel[730] = new ModelRendererTurbo(this, 137, 281, textureX, textureY); // Du loco part06
		bodyModel[731] = new ModelRendererTurbo(this, 153, 281, textureX, textureY); // Du loco part06
		bodyModel[732] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Du loco part06
		bodyModel[733] = new ModelRendererTurbo(this, 185, 281, textureX, textureY); // Du loco part06
		bodyModel[734] = new ModelRendererTurbo(this, 177, 281, textureX, textureY); // Du loco part06
		bodyModel[735] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Du loco part06
		bodyModel[736] = new ModelRendererTurbo(this, 201, 281, textureX, textureY); // Du loco part06
		bodyModel[737] = new ModelRendererTurbo(this, 257, 281, textureX, textureY); // Du loco part06
		bodyModel[738] = new ModelRendererTurbo(this, 265, 281, textureX, textureY); // Du loco part06
		bodyModel[739] = new ModelRendererTurbo(this, 281, 281, textureX, textureY); // Du loco part06
		bodyModel[740] = new ModelRendererTurbo(this, 297, 281, textureX, textureY); // Du loco part06
		bodyModel[741] = new ModelRendererTurbo(this, 313, 281, textureX, textureY); // Du loco part06
		bodyModel[742] = new ModelRendererTurbo(this, 329, 281, textureX, textureY); // Du loco part06
		bodyModel[743] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Du loco part06
		bodyModel[744] = new ModelRendererTurbo(this, 361, 281, textureX, textureY); // Du loco part06
		bodyModel[745] = new ModelRendererTurbo(this, 377, 281, textureX, textureY); // Du loco part06
		bodyModel[746] = new ModelRendererTurbo(this, 393, 281, textureX, textureY); // Du loco part06
		bodyModel[747] = new ModelRendererTurbo(this, 481, 281, textureX, textureY); // Du loco part06
		bodyModel[748] = new ModelRendererTurbo(this, 489, 281, textureX, textureY); // Du loco part06
		bodyModel[749] = new ModelRendererTurbo(this, 417, 281, textureX, textureY); // Du loco part06
		bodyModel[750] = new ModelRendererTurbo(this, 441, 281, textureX, textureY); // Du loco part06
		bodyModel[751] = new ModelRendererTurbo(this, 473, 281, textureX, textureY); // Du loco part06
		bodyModel[752] = new ModelRendererTurbo(this, 497, 281, textureX, textureY); // Du loco part06
		bodyModel[753] = new ModelRendererTurbo(this, 505, 281, textureX, textureY); // Du loco part06
		bodyModel[754] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Du loco part06
		bodyModel[755] = new ModelRendererTurbo(this, 17, 289, textureX, textureY); // Du loco part06
		bodyModel[756] = new ModelRendererTurbo(this, 33, 289, textureX, textureY); // Du loco part06
		bodyModel[757] = new ModelRendererTurbo(this, 41, 289, textureX, textureY); // Du loco part06
		bodyModel[758] = new ModelRendererTurbo(this, 49, 289, textureX, textureY); // Du loco part06
		bodyModel[759] = new ModelRendererTurbo(this, 49, 289, textureX, textureY); // Du loco part06
		bodyModel[760] = new ModelRendererTurbo(this, 121, 289, textureX, textureY); // Du loco part06
		bodyModel[761] = new ModelRendererTurbo(this, 65, 289, textureX, textureY); // Du loco part06
		bodyModel[762] = new ModelRendererTurbo(this, 105, 289, textureX, textureY); // Du loco part06
		bodyModel[763] = new ModelRendererTurbo(this, 137, 289, textureX, textureY); // Du loco part06
		bodyModel[764] = new ModelRendererTurbo(this, 153, 289, textureX, textureY); // Du loco part06
		bodyModel[765] = new ModelRendererTurbo(this, 169, 289, textureX, textureY); // Du loco part06
		bodyModel[766] = new ModelRendererTurbo(this, 121, 289, textureX, textureY); // Du loco part06
		bodyModel[767] = new ModelRendererTurbo(this, 185, 289, textureX, textureY); // Du loco part06
		bodyModel[768] = new ModelRendererTurbo(this, 193, 289, textureX, textureY); // Du loco part06
		bodyModel[769] = new ModelRendererTurbo(this, 201, 289, textureX, textureY); // Du loco part06
		bodyModel[770] = new ModelRendererTurbo(this, 209, 289, textureX, textureY); // Du loco part06
		bodyModel[771] = new ModelRendererTurbo(this, 217, 289, textureX, textureY); // Du loco part06
		bodyModel[772] = new ModelRendererTurbo(this, 225, 289, textureX, textureY); // Du loco part06
		bodyModel[773] = new ModelRendererTurbo(this, 233, 289, textureX, textureY); // Du loco part06
		bodyModel[774] = new ModelRendererTurbo(this, 241, 289, textureX, textureY); // Du loco part06
		bodyModel[775] = new ModelRendererTurbo(this, 393, 289, textureX, textureY); // Du loco part06
		bodyModel[776] = new ModelRendererTurbo(this, 257, 289, textureX, textureY); // Du loco part06
		bodyModel[777] = new ModelRendererTurbo(this, 409, 289, textureX, textureY); // Du loco part06
		bodyModel[778] = new ModelRendererTurbo(this, 417, 289, textureX, textureY); // Du loco part06
		bodyModel[779] = new ModelRendererTurbo(this, 425, 289, textureX, textureY); // Du loco part06
		bodyModel[780] = new ModelRendererTurbo(this, 433, 289, textureX, textureY); // Du loco part06
		bodyModel[781] = new ModelRendererTurbo(this, 449, 289, textureX, textureY); // Du loco part06
		bodyModel[782] = new ModelRendererTurbo(this, 457, 289, textureX, textureY); // Du loco part06
		bodyModel[783] = new ModelRendererTurbo(this, 473, 289, textureX, textureY); // Du loco part06
		bodyModel[784] = new ModelRendererTurbo(this, 489, 289, textureX, textureY); // Du loco part06
		bodyModel[785] = new ModelRendererTurbo(this, 505, 289, textureX, textureY); // Du loco part06
		bodyModel[786] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Du loco part06
		bodyModel[787] = new ModelRendererTurbo(this, 25, 297, textureX, textureY); // Du loco part06
		bodyModel[788] = new ModelRendererTurbo(this, 17, 297, textureX, textureY); // Du loco part06
		bodyModel[789] = new ModelRendererTurbo(this, 41, 297, textureX, textureY); // Du loco part06
		bodyModel[790] = new ModelRendererTurbo(this, 137, 297, textureX, textureY); // Du loco part06
		bodyModel[791] = new ModelRendererTurbo(this, 113, 297, textureX, textureY); // Du loco part06
		bodyModel[792] = new ModelRendererTurbo(this, 153, 297, textureX, textureY); // Du loco part06
		bodyModel[793] = new ModelRendererTurbo(this, 225, 297, textureX, textureY); // Du loco part06
		bodyModel[794] = new ModelRendererTurbo(this, 297, 297, textureX, textureY); // Du loco part06
		bodyModel[795] = new ModelRendererTurbo(this, 313, 297, textureX, textureY); // Du loco part06
		bodyModel[796] = new ModelRendererTurbo(this, 329, 297, textureX, textureY); // Du loco part06
		bodyModel[797] = new ModelRendererTurbo(this, 345, 297, textureX, textureY); // Du loco part06
		bodyModel[798] = new ModelRendererTurbo(this, 361, 297, textureX, textureY); // Du loco part06
		bodyModel[799] = new ModelRendererTurbo(this, 377, 297, textureX, textureY); // Du loco part06
		bodyModel[800] = new ModelRendererTurbo(this, 393, 297, textureX, textureY); // Du loco part06
		bodyModel[801] = new ModelRendererTurbo(this, 409, 297, textureX, textureY); // Du loco part06
		bodyModel[802] = new ModelRendererTurbo(this, 425, 297, textureX, textureY); // Du loco part06
		bodyModel[803] = new ModelRendererTurbo(this, 449, 297, textureX, textureY); // Du loco part06
		bodyModel[804] = new ModelRendererTurbo(this, 457, 297, textureX, textureY); // Du loco part06
		bodyModel[805] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Du loco part06
		bodyModel[806] = new ModelRendererTurbo(this, 473, 297, textureX, textureY); // Du loco part06
		bodyModel[807] = new ModelRendererTurbo(this, 497, 297, textureX, textureY); // Du loco part06
		bodyModel[808] = new ModelRendererTurbo(this, 505, 297, textureX, textureY); // Du loco part06
		bodyModel[809] = new ModelRendererTurbo(this, 1, 305, textureX, textureY); // Du loco part06
		bodyModel[810] = new ModelRendererTurbo(this, 9, 305, textureX, textureY); // Du loco part06
		bodyModel[811] = new ModelRendererTurbo(this, 25, 305, textureX, textureY); // Du loco part06
		bodyModel[812] = new ModelRendererTurbo(this, 41, 305, textureX, textureY); // Du loco part06
		bodyModel[813] = new ModelRendererTurbo(this, 49, 305, textureX, textureY); // Du loco part06
		bodyModel[814] = new ModelRendererTurbo(this, 57, 305, textureX, textureY); // Du loco part06
		bodyModel[815] = new ModelRendererTurbo(this, 57, 305, textureX, textureY); // Du loco part06
		bodyModel[816] = new ModelRendererTurbo(this, 73, 305, textureX, textureY); // Du loco part06
		bodyModel[817] = new ModelRendererTurbo(this, 73, 305, textureX, textureY); // Du loco part06
		bodyModel[818] = new ModelRendererTurbo(this, 89, 305, textureX, textureY); // Du loco part06
		bodyModel[819] = new ModelRendererTurbo(this, 105, 305, textureX, textureY); // Du loco part06
		bodyModel[820] = new ModelRendererTurbo(this, 121, 305, textureX, textureY); // Du loco part06
		bodyModel[821] = new ModelRendererTurbo(this, 137, 305, textureX, textureY); // Du loco part06
		bodyModel[822] = new ModelRendererTurbo(this, 153, 305, textureX, textureY); // Du loco part06
		bodyModel[823] = new ModelRendererTurbo(this, 161, 305, textureX, textureY); // Du loco part06
		bodyModel[824] = new ModelRendererTurbo(this, 169, 305, textureX, textureY); // Du loco part06
		bodyModel[825] = new ModelRendererTurbo(this, 177, 305, textureX, textureY); // Du loco part06
		bodyModel[826] = new ModelRendererTurbo(this, 185, 305, textureX, textureY); // Du loco part06
		bodyModel[827] = new ModelRendererTurbo(this, 193, 305, textureX, textureY); // Du loco part06
		bodyModel[828] = new ModelRendererTurbo(this, 201, 305, textureX, textureY); // Du loco part06
		bodyModel[829] = new ModelRendererTurbo(this, 209, 305, textureX, textureY); // Du loco part06
		bodyModel[830] = new ModelRendererTurbo(this, 217, 305, textureX, textureY); // Du loco part06
		bodyModel[831] = new ModelRendererTurbo(this, 233, 305, textureX, textureY); // Du loco part06
		bodyModel[832] = new ModelRendererTurbo(this, 249, 305, textureX, textureY); // Du loco part06
		bodyModel[833] = new ModelRendererTurbo(this, 257, 305, textureX, textureY); // Du loco part06
		bodyModel[834] = new ModelRendererTurbo(this, 265, 305, textureX, textureY); // Du loco part06
		bodyModel[835] = new ModelRendererTurbo(this, 273, 305, textureX, textureY); // Du loco part06
		bodyModel[836] = new ModelRendererTurbo(this, 273, 305, textureX, textureY); // Du loco part06
		bodyModel[837] = new ModelRendererTurbo(this, 409, 305, textureX, textureY); // Du loco part06
		bodyModel[838] = new ModelRendererTurbo(this, 441, 305, textureX, textureY); // Du loco part06
		bodyModel[839] = new ModelRendererTurbo(this, 433, 305, textureX, textureY); // Du loco part06
		bodyModel[840] = new ModelRendererTurbo(this, 481, 305, textureX, textureY); // Du loco part06
		bodyModel[841] = new ModelRendererTurbo(this, 489, 305, textureX, textureY); // Du loco part06
		bodyModel[842] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Du loco part06
		bodyModel[843] = new ModelRendererTurbo(this, 17, 313, textureX, textureY); // Du loco part06
		bodyModel[844] = new ModelRendererTurbo(this, 505, 305, textureX, textureY); // Du loco part06
		bodyModel[845] = new ModelRendererTurbo(this, 41, 313, textureX, textureY); // Du loco part06
		bodyModel[846] = new ModelRendererTurbo(this, 89, 313, textureX, textureY); // Du loco part06
		bodyModel[847] = new ModelRendererTurbo(this, 33, 313, textureX, textureY); // Du loco part06
		bodyModel[848] = new ModelRendererTurbo(this, 105, 313, textureX, textureY); // Du loco part06
		bodyModel[849] = new ModelRendererTurbo(this, 137, 313, textureX, textureY); // Du loco part06
		bodyModel[850] = new ModelRendererTurbo(this, 57, 313, textureX, textureY); // Du loco part06
		bodyModel[851] = new ModelRendererTurbo(this, 65, 313, textureX, textureY); // Du loco part06
		bodyModel[852] = new ModelRendererTurbo(this, 153, 313, textureX, textureY); // Du loco part06
		bodyModel[853] = new ModelRendererTurbo(this, 169, 313, textureX, textureY); // Du loco part06
		bodyModel[854] = new ModelRendererTurbo(this, 185, 313, textureX, textureY); // Du loco part06
		bodyModel[855] = new ModelRendererTurbo(this, 201, 313, textureX, textureY); // Du loco part06
		bodyModel[856] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Du loco part06
		bodyModel[857] = new ModelRendererTurbo(this, 233, 313, textureX, textureY); // Du loco part06
		bodyModel[858] = new ModelRendererTurbo(this, 249, 313, textureX, textureY); // Du loco part06
		bodyModel[859] = new ModelRendererTurbo(this, 265, 313, textureX, textureY); // Du loco part06
		bodyModel[860] = new ModelRendererTurbo(this, 305, 313, textureX, textureY); // Du loco part06
		bodyModel[861] = new ModelRendererTurbo(this, 313, 313, textureX, textureY); // Du loco part06
		bodyModel[862] = new ModelRendererTurbo(this, 129, 313, textureX, textureY); // Du loco part06
		bodyModel[863] = new ModelRendererTurbo(this, 321, 313, textureX, textureY); // Du loco part06
		bodyModel[864] = new ModelRendererTurbo(this, 297, 313, textureX, textureY); // Du loco part06
		bodyModel[865] = new ModelRendererTurbo(this, 345, 313, textureX, textureY); // Du loco part06
		bodyModel[866] = new ModelRendererTurbo(this, 353, 313, textureX, textureY); // Du loco part06
		bodyModel[867] = new ModelRendererTurbo(this, 361, 313, textureX, textureY); // Du loco part06
		bodyModel[868] = new ModelRendererTurbo(this, 377, 313, textureX, textureY); // Du loco part06
		bodyModel[869] = new ModelRendererTurbo(this, 393, 313, textureX, textureY); // Du loco part06
		bodyModel[870] = new ModelRendererTurbo(this, 401, 313, textureX, textureY); // Du loco part06
		bodyModel[871] = new ModelRendererTurbo(this, 409, 313, textureX, textureY); // Du loco part06
		bodyModel[872] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Du loco part06
		bodyModel[873] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Du loco part06
		bodyModel[874] = new ModelRendererTurbo(this, 433, 313, textureX, textureY); // Du loco part06
		bodyModel[875] = new ModelRendererTurbo(this, 441, 313, textureX, textureY); // Du loco part06
		bodyModel[876] = new ModelRendererTurbo(this, 481, 313, textureX, textureY); // Du loco part06
		bodyModel[877] = new ModelRendererTurbo(this, 17, 321, textureX, textureY); // Du loco part06
		bodyModel[878] = new ModelRendererTurbo(this, 33, 321, textureX, textureY); // Du loco part06
		bodyModel[879] = new ModelRendererTurbo(this, 497, 313, textureX, textureY); // Du loco part06
		bodyModel[880] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Du loco part06
		bodyModel[881] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Du loco part06
		bodyModel[882] = new ModelRendererTurbo(this, 57, 321, textureX, textureY); // Du loco part06
		bodyModel[883] = new ModelRendererTurbo(this, 81, 321, textureX, textureY); // Du loco part06
		bodyModel[884] = new ModelRendererTurbo(this, 89, 321, textureX, textureY); // Du loco part06
		bodyModel[885] = new ModelRendererTurbo(this, 97, 321, textureX, textureY); // Du loco part06
		bodyModel[886] = new ModelRendererTurbo(this, 105, 321, textureX, textureY); // Du loco part06
		bodyModel[887] = new ModelRendererTurbo(this, 113, 321, textureX, textureY); // Du loco part06
		bodyModel[888] = new ModelRendererTurbo(this, 129, 321, textureX, textureY); // Du loco part06
		bodyModel[889] = new ModelRendererTurbo(this, 145, 321, textureX, textureY); // Du loco part06
		bodyModel[890] = new ModelRendererTurbo(this, 265, 321, textureX, textureY); // Du loco part06
		bodyModel[891] = new ModelRendererTurbo(this, 273, 321, textureX, textureY); // Du loco part06
		bodyModel[892] = new ModelRendererTurbo(this, 281, 321, textureX, textureY); // Du loco part06
		bodyModel[893] = new ModelRendererTurbo(this, 289, 321, textureX, textureY); // Du loco part06
		bodyModel[894] = new ModelRendererTurbo(this, 305, 321, textureX, textureY); // Du loco part06
		bodyModel[895] = new ModelRendererTurbo(this, 313, 321, textureX, textureY); // Box 0
		bodyModel[896] = new ModelRendererTurbo(this, 345, 321, textureX, textureY); // Box 0
		bodyModel[897] = new ModelRendererTurbo(this, 377, 321, textureX, textureY); // Box 0
		bodyModel[898] = new ModelRendererTurbo(this, 409, 321, textureX, textureY); // Box 0
		bodyModel[899] = new ModelRendererTurbo(this, 17, 329, textureX, textureY); // Box 0
		bodyModel[900] = new ModelRendererTurbo(this, 49, 329, textureX, textureY); // Box 0
		bodyModel[901] = new ModelRendererTurbo(this, 81, 329, textureX, textureY); // Box 0
		bodyModel[902] = new ModelRendererTurbo(this, 113, 329, textureX, textureY); // Box 0
		bodyModel[903] = new ModelRendererTurbo(this, 145, 329, textureX, textureY); // Box 0
		bodyModel[904] = new ModelRendererTurbo(this, 177, 329, textureX, textureY); // Box 0
		bodyModel[905] = new ModelRendererTurbo(this, 209, 329, textureX, textureY); // Box 0
		bodyModel[906] = new ModelRendererTurbo(this, 241, 329, textureX, textureY); // Box 0
		bodyModel[907] = new ModelRendererTurbo(this, 273, 329, textureX, textureY); // Box 0
		bodyModel[908] = new ModelRendererTurbo(this, 305, 329, textureX, textureY); // Box 0
		bodyModel[909] = new ModelRendererTurbo(this, 337, 329, textureX, textureY); // Box 0
		bodyModel[910] = new ModelRendererTurbo(this, 369, 329, textureX, textureY); // Box 0
		bodyModel[911] = new ModelRendererTurbo(this, 401, 329, textureX, textureY); // Box 0
		bodyModel[912] = new ModelRendererTurbo(this, 433, 329, textureX, textureY); // Box 0
		bodyModel[913] = new ModelRendererTurbo(this, 465, 329, textureX, textureY); // Box 0
		bodyModel[914] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 0
		bodyModel[915] = new ModelRendererTurbo(this, 17, 337, textureX, textureY); // Box 0
		bodyModel[916] = new ModelRendererTurbo(this, 57, 337, textureX, textureY); // Box 0
		bodyModel[917] = new ModelRendererTurbo(this, 105, 337, textureX, textureY); // Box 0
		bodyModel[918] = new ModelRendererTurbo(this, 497, 321, textureX, textureY); // Box 0
		bodyModel[919] = new ModelRendererTurbo(this, 505, 321, textureX, textureY); // Box 0
		bodyModel[920] = new ModelRendererTurbo(this, 497, 329, textureX, textureY); // Box 0
		bodyModel[921] = new ModelRendererTurbo(this, 505, 329, textureX, textureY); // Box 0
		bodyModel[922] = new ModelRendererTurbo(this, 57, 337, textureX, textureY); // Box 0
		bodyModel[923] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 0
		bodyModel[924] = new ModelRendererTurbo(this, 97, 337, textureX, textureY); // Box 0
		bodyModel[925] = new ModelRendererTurbo(this, 105, 337, textureX, textureY); // Box 0
		bodyModel[926] = new ModelRendererTurbo(this, 145, 337, textureX, textureY); // Box 0
		bodyModel[927] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Box 0
		bodyModel[928] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Du loco part42
		bodyModel[929] = new ModelRendererTurbo(this, 177, 337, textureX, textureY); // Du loco part42
		bodyModel[930] = new ModelRendererTurbo(this, 201, 337, textureX, textureY); // Du loco part42
		bodyModel[931] = new ModelRendererTurbo(this, 169, 337, textureX, textureY); // Du loco part42
		bodyModel[932] = new ModelRendererTurbo(this, 193, 337, textureX, textureY); // Du loco part42
		bodyModel[933] = new ModelRendererTurbo(this, 217, 337, textureX, textureY); // Du loco part42
		bodyModel[934] = new ModelRendererTurbo(this, 233, 337, textureX, textureY); // Du loco part42
		bodyModel[935] = new ModelRendererTurbo(this, 241, 337, textureX, textureY); // Du loco part42
		bodyModel[936] = new ModelRendererTurbo(this, 265, 337, textureX, textureY); // Du loco part42
		bodyModel[937] = new ModelRendererTurbo(this, 289, 337, textureX, textureY); // Du loco part42
		bodyModel[938] = new ModelRendererTurbo(this, 313, 337, textureX, textureY); // Du loco part42
		bodyModel[939] = new ModelRendererTurbo(this, 257, 337, textureX, textureY); // Du loco part42
		bodyModel[940] = new ModelRendererTurbo(this, 281, 337, textureX, textureY); // Du loco part42
		bodyModel[941] = new ModelRendererTurbo(this, 305, 337, textureX, textureY); // Du loco part42
		bodyModel[942] = new ModelRendererTurbo(this, 329, 337, textureX, textureY); // Du loco part42
		bodyModel[943] = new ModelRendererTurbo(this, 337, 337, textureX, textureY); // Du loco part42
		bodyModel[944] = new ModelRendererTurbo(this, 369, 337, textureX, textureY); // Du loco part42
		bodyModel[945] = new ModelRendererTurbo(this, 401, 337, textureX, textureY); // Du loco part42
		bodyModel[946] = new ModelRendererTurbo(this, 434, 338, textureX, textureY); // Box 0
		bodyModel[947] = new ModelRendererTurbo(this, 361, 337, textureX, textureY); // Box 0
		bodyModel[948] = new ModelRendererTurbo(this, 457, 337, textureX, textureY); // Du loco part42
		bodyModel[949] = new ModelRendererTurbo(this, 217, 345, textureX, textureY); // Du loco part42
		bodyModel[950] = new ModelRendererTurbo(this, 481, 345, textureX, textureY); // Du loco part42
		bodyModel[951] = new ModelRendererTurbo(this, 65, 353, textureX, textureY); // Du loco part42
		bodyModel[952] = new ModelRendererTurbo(this, 97, 353, textureX, textureY); // Du loco part42
		bodyModel[953] = new ModelRendererTurbo(this, 129, 353, textureX, textureY); // Du loco part42
		bodyModel[954] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 0
		bodyModel[955] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Box 0
		bodyModel[956] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 168
		bodyModel[957] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 168
		bodyModel[958] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 168
		bodyModel[959] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 168
		bodyModel[960] = new ModelRendererTurbo(this, 249, 353, textureX, textureY); // Box 168
		bodyModel[961] = new ModelRendererTurbo(this, 345, 353, textureX, textureY); // Box 168
		bodyModel[962] = new ModelRendererTurbo(this, 161, 361, textureX, textureY); // Box 168
		bodyModel[963] = new ModelRendererTurbo(this, 153, 353, textureX, textureY); // Box 168
		bodyModel[964] = new ModelRendererTurbo(this, 433, 353, textureX, textureY); // Box 168
		bodyModel[965] = new ModelRendererTurbo(this, 25, 361, textureX, textureY); // Box 168
		bodyModel[966] = new ModelRendererTurbo(this, 249, 361, textureX, textureY); // Box 168
		bodyModel[967] = new ModelRendererTurbo(this, 289, 361, textureX, textureY); // Box 168
		bodyModel[968] = new ModelRendererTurbo(this, 329, 361, textureX, textureY); // Box 168
		bodyModel[969] = new ModelRendererTurbo(this, 361, 337, textureX, textureY); // Box 168
		bodyModel[970] = new ModelRendererTurbo(this, 393, 337, textureX, textureY); // Box 168
		bodyModel[971] = new ModelRendererTurbo(this, 425, 337, textureX, textureY); // Box 168
		bodyModel[972] = new ModelRendererTurbo(this, 433, 337, textureX, textureY); // Box 168
		bodyModel[973] = new ModelRendererTurbo(this, 449, 337, textureX, textureY); // Box 168
		bodyModel[974] = new ModelRendererTurbo(this, 457, 337, textureX, textureY); // Box 168
		bodyModel[975] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Box 168
		bodyModel[976] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 168
		bodyModel[977] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Box 168
		bodyModel[978] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 168
		bodyModel[979] = new ModelRendererTurbo(this, 369, 361, textureX, textureY); // Box 168
		bodyModel[980] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 168
		bodyModel[981] = new ModelRendererTurbo(this, 89, 369, textureX, textureY); // Box 168
		bodyModel[982] = new ModelRendererTurbo(this, 465, 361, textureX, textureY); // Box 168
		bodyModel[983] = new ModelRendererTurbo(this, 177, 369, textureX, textureY); // Box 168
		bodyModel[984] = new ModelRendererTurbo(this, 217, 369, textureX, textureY); // Box 168
		bodyModel[985] = new ModelRendererTurbo(this, 257, 369, textureX, textureY); // Box 168
		bodyModel[986] = new ModelRendererTurbo(this, 297, 369, textureX, textureY); // Box 168
		bodyModel[987] = new ModelRendererTurbo(this, 337, 369, textureX, textureY); // Box 168
		bodyModel[988] = new ModelRendererTurbo(this, 481, 337, textureX, textureY); // Box 168
		bodyModel[989] = new ModelRendererTurbo(this, 489, 337, textureX, textureY); // Box 168
		bodyModel[990] = new ModelRendererTurbo(this, 497, 337, textureX, textureY); // Box 168
		bodyModel[991] = new ModelRendererTurbo(this, 505, 337, textureX, textureY); // Box 168
		bodyModel[992] = new ModelRendererTurbo(this, 1, 345, textureX, textureY); // Box 168
		bodyModel[993] = new ModelRendererTurbo(this, 9, 345, textureX, textureY); // Box 168
		bodyModel[994] = new ModelRendererTurbo(this, 17, 345, textureX, textureY); // Box 168
		bodyModel[995] = new ModelRendererTurbo(this, 25, 345, textureX, textureY); // Box 168
		bodyModel[996] = new ModelRendererTurbo(this, 505, 345, textureX, textureY); // Box 168
		bodyModel[997] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 168
		bodyModel[998] = new ModelRendererTurbo(this, 89, 353, textureX, textureY); // Box 168
		bodyModel[999] = new ModelRendererTurbo(this, 97, 353, textureX, textureY); // Box 168

		bodyModel[500].addShapeBox(0F, 0F, 1F, 3, 1, 4, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.675F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.675F, 0F, 0F); // Box 168
		bodyModel[500].setRotationPoint(-11F, -29F, 0F);

		bodyModel[501].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.675F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.675F, 0F, 0F); // Box 168
		bodyModel[501].setRotationPoint(-9F, -29F, 7F);

		bodyModel[502].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,-0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.675F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.675F, 0F, 0F); // Box 168
		bodyModel[502].setRotationPoint(-10F, -29F, 4F);

		bodyModel[503].addShapeBox(0F, 0F, 1F, 3, 1, 4, 0F,-0.325F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 168
		bodyModel[503].setRotationPoint(-11F, -22F, 0F);

		bodyModel[504].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,-0.325F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 168
		bodyModel[504].setRotationPoint(-9F, -22F, 7F);

		bodyModel[505].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,-0.325F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.325F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 168
		bodyModel[505].setRotationPoint(-10F, -22F, 4F);

		bodyModel[506].addShapeBox(0F, 0F, 1F, 3, 1, 4, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.675F, 0F, 0F); // Box 168
		bodyModel[506].setRotationPoint(-11F, -29F, -6F);

		bodyModel[507].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.675F, 0F, 0F); // Box 168
		bodyModel[507].setRotationPoint(-9F, -29F, -11F);

		bodyModel[508].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.675F, 0F, 0F); // Box 168
		bodyModel[508].setRotationPoint(-10F, -29F, -9F);

		bodyModel[509].addShapeBox(0F, 0F, 1F, 3, 1, 4, 0F,-1.325F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.325F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F); // Box 168
		bodyModel[509].setRotationPoint(-11F, -22F, -6F);

		bodyModel[510].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,-1.325F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.325F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F); // Box 168
		bodyModel[510].setRotationPoint(-9F, -22F, -11F);

		bodyModel[511].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,-1.325F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.325F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F); // Box 168
		bodyModel[511].setRotationPoint(-10F, -22F, -9F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 12, 2, 2, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[512].setRotationPoint(87F, -32F, -1F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 9, 2, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[513].setRotationPoint(103F, -21F, -1F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[514].setRotationPoint(87F, -31F, 7F);

		bodyModel[515].addShapeBox(0F, 0F, 1F, 3, 9, 4, 0F,0F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 167
		bodyModel[515].setRotationPoint(102F, -21F, -6F);

		bodyModel[516].addShapeBox(0F, 0F, 1F, 3, 9, 4, 0F,-1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[516].setRotationPoint(102F, -21F, 0F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[517].setRotationPoint(87F, -32F, 1F);

		bodyModel[518].addShapeBox(0F, 0F, 1F, 3, 9, 2, 0F,-1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[518].setRotationPoint(100F, -21F, 7F);

		bodyModel[519].addShapeBox(0F, 0F, 1F, 3, 9, 2, 0F,0F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 167
		bodyModel[519].setRotationPoint(100F, -21F, -11F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, -1F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[520].setRotationPoint(101.25F, -30F, 7F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 12, 2, 6, 0F,0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[521].setRotationPoint(87F, -32F, -7F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[522].setRotationPoint(87F, -31F, -10F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -0.25F, -0.75F, -0.625F, -0.25F, -0.75F, -0.625F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[523].setRotationPoint(100F, -28F, 9F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[524].setRotationPoint(101F, -23F, 5F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[525].setRotationPoint(103F, -28F, 1F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[526].setRotationPoint(102F, -23F, 1F);

		bodyModel[527].addShapeBox(0F, 0F, 1F, 2, 9, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[527].setRotationPoint(100F, -21F, 9F);

		bodyModel[528].addShapeBox(0F, 0F, 1F, 2, 9, 1, 0F,0F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[528].setRotationPoint(100F, -21F, -12F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[529].setRotationPoint(103F, -29F, -1F);

		bodyModel[530].addShapeBox(0F, 0F, 1F, 2, 8, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[530].setRotationPoint(100F, -29F, 9F);

		bodyModel[531].addShapeBox(0F, 0F, 1F, 2, 8, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[531].setRotationPoint(100F, -29F, -12F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -4F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 149
		bodyModel[532].setRotationPoint(103.25F, -30F, -5F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[533].setRotationPoint(102.25F, -30F, 1F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,-2F, -1F, 0F, -4F, 1F, -6F, -4F, 1F, -6F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, -2F, 0F, 0F); // Box 149
		bodyModel[534].setRotationPoint(99.25F, -31F, -7F);

		bodyModel[535].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 1F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[535].setRotationPoint(102.25F, -30F, 4F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[536].setRotationPoint(101.25F, -30F, 5F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0.25F, 0F, -1F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 168
		bodyModel[537].setRotationPoint(87.25F, -30F, 10F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[538].setRotationPoint(99.25F, -30F, 7F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[539].setRotationPoint(99.25F, -31F, 7F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0F, -6F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 149
		bodyModel[540].setRotationPoint(99.25F, -32F, -7F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 168
		bodyModel[541].setRotationPoint(101.25F, -30F, -10F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[542].setRotationPoint(102.25F, -30F, -5F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[543].setRotationPoint(102.25F, -30F, -8F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[544].setRotationPoint(101.25F, -30F, -8F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0.25F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 168
		bodyModel[545].setRotationPoint(87.25F, -30F, -11F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[546].setRotationPoint(99.25F, -30F, -10F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -1F, 0F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[547].setRotationPoint(99.25F, -31F, -10F);

		bodyModel[548].addShapeBox(0F, 0F, 1F, 3, 9, 3, 0F,0F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 167
		bodyModel[548].setRotationPoint(101F, -21F, -9F);

		bodyModel[549].addShapeBox(0F, 0F, 1F, 3, 9, 3, 0F,-1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[549].setRotationPoint(101F, -21F, 4F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[550].setRotationPoint(100F, -23F, 8F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, -0.625F, 0F, 0F, -1.625F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -0.625F, -0.75F, 0F, -1.625F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[551].setRotationPoint(101F, -28F, 5F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-0.75F, 0F, 0F, -0.625F, 0F, 0F, -1.625F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -0.625F, -0.75F, 0F, -1.625F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[552].setRotationPoint(102F, -28F, 1F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-1F, 0F, 0F, -0.625F, 0F, 0F, -1.625F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -0.625F, -0.75F, 0F, -1.625F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[553].setRotationPoint(100F, -28F, 8F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[554].setRotationPoint(100F, -28F, -10F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[555].setRotationPoint(101F, -23F, -8F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -0.25F, -0.75F, -0.625F, -0.25F, -0.75F, -0.625F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[556].setRotationPoint(103F, -28F, -2F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[557].setRotationPoint(102F, -23F, -5F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[558].setRotationPoint(100F, -23F, -10F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -1.625F, 0F, 0F, -0.625F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, -1.625F, -0.75F, 0F, -0.625F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[559].setRotationPoint(101F, -28F, -8F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -1.625F, 0F, 0F, -0.625F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, -1.625F, -0.75F, 0F, -0.625F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[560].setRotationPoint(102F, -28F, -5F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, -1.625F, 0F, 0F, -0.625F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, -1.625F, -0.75F, 0F, -0.625F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[561].setRotationPoint(100F, -28F, -10F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[562].setRotationPoint(100F, -11F, -1F);

		bodyModel[563].addShapeBox(0F, 0F, 1F, 4, 4, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[563].setRotationPoint(100F, -11F, -6F);

		bodyModel[564].addShapeBox(0F, 0F, 1F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[564].setRotationPoint(100F, -11F, 0F);

		bodyModel[565].addShapeBox(0F, 0F, 1F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[565].setRotationPoint(100F, -11F, 7F);

		bodyModel[566].addShapeBox(0F, 0F, 1F, 2, 4, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[566].setRotationPoint(100F, -11F, -11F);

		bodyModel[567].addShapeBox(0F, 0F, 1F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[567].setRotationPoint(100F, -11F, 9F);

		bodyModel[568].addShapeBox(0F, 0F, 1F, 1, 4, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[568].setRotationPoint(100F, -11F, -12F);

		bodyModel[569].addShapeBox(0F, 0F, 1F, 3, 4, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[569].setRotationPoint(100F, -11F, -9F);

		bodyModel[570].addShapeBox(0F, 0F, 1F, 3, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[570].setRotationPoint(100F, -11F, 4F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[571].setRotationPoint(100F, -12F, -1F);

		bodyModel[572].addShapeBox(0F, 0F, 1F, 6, 1, 4, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[572].setRotationPoint(100F, -12F, -6F);

		bodyModel[573].addShapeBox(0F, 0F, 1F, 6, 1, 4, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[573].setRotationPoint(100F, -12F, 0F);

		bodyModel[574].addShapeBox(0F, 0F, 1F, 4, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[574].setRotationPoint(100F, -12F, 7F);

		bodyModel[575].addShapeBox(0F, 0F, 1F, 4, 1, 2, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[575].setRotationPoint(100F, -12F, -11F);

		bodyModel[576].addShapeBox(0F, 0F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[576].setRotationPoint(100F, -12F, 9F);

		bodyModel[577].addShapeBox(0F, 0F, 1F, 3, 1, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[577].setRotationPoint(100F, -12F, -12F);

		bodyModel[578].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[578].setRotationPoint(100F, -12F, -9F);

		bodyModel[579].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[579].setRotationPoint(100F, -12F, 4F);

		bodyModel[580].addShapeBox(0F, 0F, 1F, 3, 1, 4, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.675F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[580].setRotationPoint(102F, -29F, 0F);

		bodyModel[581].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.675F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[581].setRotationPoint(100F, -29F, 7F);

		bodyModel[582].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,-1F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.675F, 0F, 0F, -1.675F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[582].setRotationPoint(101F, -29F, 4F);

		bodyModel[583].addShapeBox(0F, 0F, 1F, 3, 1, 4, 0F,-1F, 0F, 0F, -0.325F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[583].setRotationPoint(102F, -22F, 0F);

		bodyModel[584].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,-1F, 0F, 0F, -0.325F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[584].setRotationPoint(100F, -22F, 7F);

		bodyModel[585].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,-1F, 0F, 0F, -0.325F, 0F, 0F, -1.325F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[585].setRotationPoint(101F, -22F, 4F);

		bodyModel[586].addShapeBox(0F, 0F, 1F, 3, 1, 4, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.675F, 0F, 0F, -0.675F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[586].setRotationPoint(102F, -29F, -6F);

		bodyModel[587].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.675F, 0F, 0F, -0.675F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[587].setRotationPoint(100F, -29F, -11F);

		bodyModel[588].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.675F, 0F, 0F, -0.675F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[588].setRotationPoint(101F, -29F, -9F);

		bodyModel[589].addShapeBox(0F, 0F, 1F, 3, 1, 4, 0F,0F, 0F, 0F, -1.325F, 0F, 0F, -0.325F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[589].setRotationPoint(102F, -22F, -6F);

		bodyModel[590].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, 0F, 0F, -1.325F, 0F, 0F, -0.325F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[590].setRotationPoint(100F, -22F, -11F);

		bodyModel[591].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, -1.325F, 0F, 0F, -0.325F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[591].setRotationPoint(101F, -22F, -9F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[592].setRotationPoint(91F, -23F, 10F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[593].setRotationPoint(91F, -28F, 10F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[594].setRotationPoint(91F, -28F, 10F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[595].setRotationPoint(98F, -28F, 10F);

		bodyModel[596].addBox(0F, 0F, 0F, 11, 6, 1, 0F); // Box 135
		bodyModel[596].setRotationPoint(80F, -28F, 10F);

		bodyModel[597].addBox(0F, 0F, 0F, 30, 1, 1, 0F); // Box 135
		bodyModel[597].setRotationPoint(70F, -29F, 10F);

		bodyModel[598].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 135
		bodyModel[598].setRotationPoint(99F, -28F, 10F);

		bodyModel[599].addShapeBox(0F, 0F, 1F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 168
		bodyModel[599].setRotationPoint(86F, -8F, 9F);

		bodyModel[600].addShapeBox(0F, 0F, 1F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F); // Box 168
		bodyModel[600].setRotationPoint(86F, -8F, -12F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[601].setRotationPoint(88F, -8.5F, -11F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[602].setRotationPoint(88F, -10.5F, -11F);

		bodyModel[603].addBox(0F, 0F, 0F, 57, 14, 1, 0F); // Box 135
		bodyModel[603].setRotationPoint(30F, -22F, -11F);

		bodyModel[604].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[604].setRotationPoint(87F, -12F, -11F);

		bodyModel[605].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[605].setRotationPoint(92F, -12F, -11F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 135
		bodyModel[606].setRotationPoint(88F, -12F, -11F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 135
		bodyModel[607].setRotationPoint(88F, -11.75F, -11F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 135
		bodyModel[608].setRotationPoint(25F, -8.5F, -11F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 135
		bodyModel[609].setRotationPoint(25F, -10.5F, -11F);

		bodyModel[610].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[610].setRotationPoint(24F, -12F, -11F);

		bodyModel[611].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 135
		bodyModel[611].setRotationPoint(29F, -12F, -11F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 135
		bodyModel[612].setRotationPoint(25F, -12F, -11F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 135
		bodyModel[613].setRotationPoint(25F, -11.75F, -11F);

		bodyModel[614].addBox(0F, 0F, 0F, 30, 14, 1, 0F); // Box 135
		bodyModel[614].setRotationPoint(-6F, -22F, -11F);

		bodyModel[615].addShapeBox(0F, 0F, 1F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[615].setRotationPoint(-6F, -8F, -12F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 0
		bodyModel[616].setRotationPoint(102F, -9.5F, -7.88F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F); // Box 0
		bodyModel[617].setRotationPoint(102F, -9.5F, 5.18F);

		bodyModel[618].addBox(0F, 0F, 0F, 7, 1, 1, 0F); // Box 135
		bodyModel[618].setRotationPoint(93F, -29F, -11F);

		bodyModel[619].addBox(0F, 0F, 0F, 57, 1, 1, 0F); // Box 135
		bodyModel[619].setRotationPoint(30F, -29F, -11F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[620].setRotationPoint(64.25F, -13.5F, 9.75F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Du loco part28
		bodyModel[621].setRotationPoint(24.25F, -24F, -11F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[622].setRotationPoint(24F, -29F, -11F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 5, 17, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[623].setRotationPoint(24.75F, -29F, -11F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[624].setRotationPoint(24.25F, -24F, -10.75F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Du loco part28
		bodyModel[625].setRotationPoint(29.5F, -24F, -11F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[626].setRotationPoint(29.5F, -24F, -10.75F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[627].setRotationPoint(29.5F, -13.5F, -10.75F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 135
		bodyModel[628].setRotationPoint(29F, -29F, -11F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[629].setRotationPoint(24.25F, -13.5F, -10.75F);

		bodyModel[630].addBox(0F, 0F, 0F, 30, 1, 1, 0F); // Box 135
		bodyModel[630].setRotationPoint(-6F, -29F, -11F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 80, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[631].setRotationPoint(7F, -30F, -11F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 76, 2, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part08
		bodyModel[632].setRotationPoint(9F, -32F, -7F);

		bodyModel[633].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 135
		bodyModel[633].setRotationPoint(20F, -28F, -11F);

		bodyModel[634].addBox(0F, 0F, 0F, 4, 6, 1, 0F); // Box 135
		bodyModel[634].setRotationPoint(30F, -28F, -11F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[635].setRotationPoint(94F, -23F, -11F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[636].setRotationPoint(94F, -28F, -11F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[637].setRotationPoint(94F, -28F, -11F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[638].setRotationPoint(98F, -28F, -11F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 80, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[639].setRotationPoint(7F, -30F, 10F);

		bodyModel[640].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[640].setRotationPoint(102.25F, -17F, 5F);

		bodyModel[641].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[641].setRotationPoint(102.25F, -16F, 5F);

		bodyModel[642].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[642].setRotationPoint(102.25F, -15.5F, 5F);

		bodyModel[643].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[643].setRotationPoint(102.25F, -17F, -9F);

		bodyModel[644].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[644].setRotationPoint(102.25F, -16F, -9F);

		bodyModel[645].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[645].setRotationPoint(102.25F, -15.5F, -9F);

		bodyModel[646].addBox(0F, 0F, 0F, 6, 1, 0, 0F); // Du loco part37
		bodyModel[646].setRotationPoint(19F, -33F, -6F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 76, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[647].setRotationPoint(9F, -32F, 1F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[648].setRotationPoint(61F, -32.5F, -5F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F); // Du loco part37
		bodyModel[649].setRotationPoint(61F, -32.5F, -2F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[650].setRotationPoint(58F, -32.5F, -5F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F); // Du loco part37
		bodyModel[651].setRotationPoint(58F, -32.5F, -2F);

		bodyModel[652].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Du loco part37
		bodyModel[652].setRotationPoint(60.5F, -35F, -4F);

		bodyModel[653].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[653].setRotationPoint(61F, -35F, 3F);

		bodyModel[654].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part37
		bodyModel[654].setRotationPoint(64F, -36F, -0.5F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[655].setRotationPoint(60F, -33F, 2F);

		bodyModel[656].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[656].setRotationPoint(66F, -33F, -6F);

		bodyModel[657].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[657].setRotationPoint(45F, -33F, -6F);

		bodyModel[658].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Du loco part37
		bodyModel[658].setRotationPoint(26F, -33F, -6F);

		bodyModel[659].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Du loco part37
		bodyModel[659].setRotationPoint(46F, -33F, -6F);

		bodyModel[660].addBox(0F, 0F, 0F, 8, 1, 0, 0F); // Du loco part37
		bodyModel[660].setRotationPoint(67F, -33F, -6F);

		bodyModel[661].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[661].setRotationPoint(29F, -33F, -6F);

		bodyModel[662].addBox(0F, 0F, 0F, 15, 1, 0, 0F); // Du loco part37
		bodyModel[662].setRotationPoint(30F, -33F, -6F);

		bodyModel[663].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Du loco part37
		bodyModel[663].setRotationPoint(60F, -35F, -2F);

		bodyModel[664].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part37
		bodyModel[664].setRotationPoint(59F, -35F, -3F);

		bodyModel[665].addBox(0F, 0F, 0F, 2, 1, 0, 0F); // Du loco part37
		bodyModel[665].setRotationPoint(57F, -35F, -2F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -2F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, -4F); // Du loco part37
		bodyModel[666].setRotationPoint(54F, -35F, -6F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, 0F, -4F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -2F, 0F); // Du loco part37
		bodyModel[667].setRotationPoint(63F, -35F, -6F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F); // Du loco part37
		bodyModel[668].setRotationPoint(59F, -35F, -2F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[669].setRotationPoint(26F, -7F, 6F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[670].setRotationPoint(5F, -7F, 6F);

		bodyModel[671].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, -3F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -3F, -3F, 0F, -3F); // Du loco part06
		bodyModel[671].setRotationPoint(20F, -7F, 7F);

		bodyModel[672].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[672].setRotationPoint(23F, -4F, 7.5F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -0.4F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1.5F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[673].setRotationPoint(20F, -8F, 7F);

		bodyModel[674].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -0.5F); // Du loco part06
		bodyModel[674].setRotationPoint(21F, -8F, 7F);

		bodyModel[675].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.25F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[675].setRotationPoint(24F, -8F, 8F);

		bodyModel[676].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[676].setRotationPoint(12F, -8F, 7F);

		bodyModel[677].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -2F); // Du loco part06
		bodyModel[677].setRotationPoint(9F, -8F, 7F);

		bodyModel[678].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F); // Du loco part06
		bodyModel[678].setRotationPoint(8F, -8F, 7F);

		bodyModel[679].addShapeBox(0F, 0F, 0F, 32, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[679].setRotationPoint(1F, -10F, -8F);

		bodyModel[680].addShapeBox(0F, 0F, 0F, 32, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[680].setRotationPoint(1F, -10F, 6F);

		bodyModel[681].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F); // Du loco part06
		bodyModel[681].setRotationPoint(16F, -6F, 9F);

		bodyModel[682].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F); // Du loco part06
		bodyModel[682].setRotationPoint(18F, -6F, 9F);

		bodyModel[683].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F); // Du loco part06
		bodyModel[683].setRotationPoint(16F, -6F, 7F);

		bodyModel[684].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F); // Du loco part06
		bodyModel[684].setRotationPoint(18F, -6F, 7F);

		bodyModel[685].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F); // Du loco part06
		bodyModel[685].setRotationPoint(12F, -6F, 9F);

		bodyModel[686].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F); // Du loco part06
		bodyModel[686].setRotationPoint(14F, -6F, 9F);

		bodyModel[687].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F); // Du loco part06
		bodyModel[687].setRotationPoint(12F, -6F, 7F);

		bodyModel[688].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F); // Du loco part06
		bodyModel[688].setRotationPoint(14F, -6F, 7F);

		bodyModel[689].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part06
		bodyModel[689].setRotationPoint(24F, -4F, 7F);

		bodyModel[690].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[690].setRotationPoint(30F, -7F, 7F);

		bodyModel[691].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[691].setRotationPoint(24.5F, -7F, 8F);

		bodyModel[692].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[692].setRotationPoint(24.5F, -4F, 7.5F);

		bodyModel[693].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[693].setRotationPoint(17.5F, -4F, 7F);

		bodyModel[694].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[694].setRotationPoint(17F, -4F, 8.5F);

		bodyModel[695].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[695].setRotationPoint(9F, -7F, 7F);

		bodyModel[696].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part06
		bodyModel[696].setRotationPoint(2F, -7F, 7F);

		bodyModel[697].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part06
		bodyModel[697].setRotationPoint(3F, -4F, 7F);

		bodyModel[698].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part06
		bodyModel[698].setRotationPoint(10.5F, -7F, 5.5F);

		bodyModel[699].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[699].setRotationPoint(10.5F, -7F, 9.5F);

		bodyModel[700].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part06
		bodyModel[700].setRotationPoint(7.5F, -8F, 8F);

		bodyModel[701].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[701].setRotationPoint(7.5F, -4F, 7.5F);

		bodyModel[702].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part06
		bodyModel[702].setRotationPoint(15.5F, -5F, 5F);

		bodyModel[703].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part06
		bodyModel[703].setRotationPoint(15.5F, -6.5F, 5F);

		bodyModel[704].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part06
		bodyModel[704].setRotationPoint(15.5F, -5.75F, 10F);

		bodyModel[705].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Du loco part06
		bodyModel[705].setRotationPoint(16F, -5.75F, 10F);

		bodyModel[706].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Du loco part06
		bodyModel[706].setRotationPoint(12F, -4F, 9F);

		bodyModel[707].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[707].setRotationPoint(16F, -4F, 9F);

		bodyModel[708].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part06
		bodyModel[708].setRotationPoint(13F, -5.75F, 10F);

		bodyModel[709].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[709].setRotationPoint(26.5F, -6.5F, 7F);

		bodyModel[710].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[710].setRotationPoint(26.5F, -5.5F, 7F);

		bodyModel[711].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[711].setRotationPoint(27.5F, -6.5F, 7F);

		bodyModel[712].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[712].setRotationPoint(27.5F, -5.5F, 7F);

		bodyModel[713].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[713].setRotationPoint(5.5F, -6.5F, 7F);

		bodyModel[714].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[714].setRotationPoint(5.5F, -5.5F, 7F);

		bodyModel[715].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[715].setRotationPoint(6.5F, -6.5F, 7F);

		bodyModel[716].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[716].setRotationPoint(6.5F, -5.5F, 7F);

		bodyModel[717].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[717].setRotationPoint(12F, -4F, 7F);

		bodyModel[718].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[718].setRotationPoint(16F, -4F, 7F);

		bodyModel[719].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.2F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -1F); // Du loco part06
		bodyModel[719].setRotationPoint(8F, -6F, 7F);

		bodyModel[720].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -0.5F); // Du loco part06
		bodyModel[720].setRotationPoint(4F, -6F, 7F);

		bodyModel[721].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.2F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -1F); // Du loco part06
		bodyModel[721].setRotationPoint(29F, -6F, 7F);

		bodyModel[722].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 1F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, -1F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, -0.5F); // Du loco part06
		bodyModel[722].setRotationPoint(24F, -6F, 7F);

		bodyModel[723].addBox(0F, 0F, 0F, 2, 3, 12, 0F); // Du loco part06
		bodyModel[723].setRotationPoint(1F, -10F, -6F);

		bodyModel[724].addBox(0F, 0F, 0F, 2, 3, 12, 0F); // Du loco part06
		bodyModel[724].setRotationPoint(31F, -10F, -6F);

		bodyModel[725].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // Du loco part06
		bodyModel[725].setRotationPoint(11F, -9F, -6F);

		bodyModel[726].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F); // Du loco part06
		bodyModel[726].setRotationPoint(9.5F, -4F, 7F);

		bodyModel[727].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[727].setRotationPoint(14F, -4F, 8.5F);

		bodyModel[728].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[728].setRotationPoint(26F, -7F, -7F);

		bodyModel[729].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[729].setRotationPoint(5F, -7F, -7F);

		bodyModel[730].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, 0F, -3F, 0F, -0.5F, -3F, 0F, -0.5F, -0.5F, -3F, 0F, -0.5F); // Du loco part06
		bodyModel[730].setRotationPoint(20F, -7F, -11F);

		bodyModel[731].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[731].setRotationPoint(23F, -4F, -8.5F);

		bodyModel[732].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, -3F, 0F, -0.4F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.5F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[732].setRotationPoint(20F, -8F, -11F);

		bodyModel[733].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part06
		bodyModel[733].setRotationPoint(21F, -8F, -11F);

		bodyModel[734].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.5F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[734].setRotationPoint(24F, -8F, -10F);

		bodyModel[735].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[735].setRotationPoint(12F, -8F, -11F);

		bodyModel[736].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Du loco part06
		bodyModel[736].setRotationPoint(9F, -8F, -11F);

		bodyModel[737].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Du loco part06
		bodyModel[737].setRotationPoint(8F, -8F, -9F);

		bodyModel[738].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F); // Du loco part06
		bodyModel[738].setRotationPoint(16F, -6F, -9F);

		bodyModel[739].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F); // Du loco part06
		bodyModel[739].setRotationPoint(18F, -6F, -9F);

		bodyModel[740].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F); // Du loco part06
		bodyModel[740].setRotationPoint(16F, -6F, -11F);

		bodyModel[741].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F); // Du loco part06
		bodyModel[741].setRotationPoint(18F, -6F, -11F);

		bodyModel[742].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F); // Du loco part06
		bodyModel[742].setRotationPoint(12F, -6F, -9F);

		bodyModel[743].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F); // Du loco part06
		bodyModel[743].setRotationPoint(14F, -6F, -9F);

		bodyModel[744].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F); // Du loco part06
		bodyModel[744].setRotationPoint(12F, -6F, -11F);

		bodyModel[745].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F); // Du loco part06
		bodyModel[745].setRotationPoint(14F, -6F, -11F);

		bodyModel[746].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[746].setRotationPoint(24F, -4F, -8F);

		bodyModel[747].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[747].setRotationPoint(30F, -7F, -8F);

		bodyModel[748].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part06
		bodyModel[748].setRotationPoint(24.5F, -7F, -9F);

		bodyModel[749].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[749].setRotationPoint(24.5F, -4F, -8.5F);

		bodyModel[750].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[750].setRotationPoint(17.5F, -4F, -9F);

		bodyModel[751].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[751].setRotationPoint(17F, -4F, -9.5F);

		bodyModel[752].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[752].setRotationPoint(9F, -7F, -8F);

		bodyModel[753].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[753].setRotationPoint(2F, -7F, -8F);

		bodyModel[754].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[754].setRotationPoint(3F, -4F, -8F);

		bodyModel[755].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F); // Du loco part06
		bodyModel[755].setRotationPoint(10.5F, -7F, -11.5F);

		bodyModel[756].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[756].setRotationPoint(10.5F, -7F, -11.5F);

		bodyModel[757].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part06
		bodyModel[757].setRotationPoint(7.5F, -8F, -9F);

		bodyModel[758].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[758].setRotationPoint(7.5F, -4F, -8.5F);

		bodyModel[759].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part06
		bodyModel[759].setRotationPoint(15.5F, -5F, -11F);

		bodyModel[760].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part06
		bodyModel[760].setRotationPoint(15.5F, -6.5F, -11F);

		bodyModel[761].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Du loco part06
		bodyModel[761].setRotationPoint(15.5F, -5.75F, -11F);

		bodyModel[762].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Du loco part06
		bodyModel[762].setRotationPoint(16F, -5.75F, -11F);

		bodyModel[763].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[763].setRotationPoint(12F, -4F, -11F);

		bodyModel[764].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[764].setRotationPoint(16F, -4F, -11F);

		bodyModel[765].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part06
		bodyModel[765].setRotationPoint(13F, -5.75F, -11F);

		bodyModel[766].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[766].setRotationPoint(26.5F, -6.5F, -8F);

		bodyModel[767].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[767].setRotationPoint(26.5F, -5.5F, -8F);

		bodyModel[768].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[768].setRotationPoint(27.5F, -6.5F, -8F);

		bodyModel[769].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[769].setRotationPoint(27.5F, -5.5F, -8F);

		bodyModel[770].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[770].setRotationPoint(5.5F, -6.5F, -8F);

		bodyModel[771].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[771].setRotationPoint(5.5F, -5.5F, -8F);

		bodyModel[772].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[772].setRotationPoint(6.5F, -6.5F, -8F);

		bodyModel[773].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[773].setRotationPoint(6.5F, -5.5F, -8F);

		bodyModel[774].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[774].setRotationPoint(12F, -4F, -9F);

		bodyModel[775].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[775].setRotationPoint(16F, -4F, -9F);

		bodyModel[776].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F); // Du loco part06
		bodyModel[776].setRotationPoint(8F, -6F, -8F);

		bodyModel[777].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, -0.5F, 0.2F, 0F, -1F, 0.2F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[777].setRotationPoint(4F, -6F, -8F);

		bodyModel[778].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F); // Du loco part06
		bodyModel[778].setRotationPoint(29F, -6F, -8F);

		bodyModel[779].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 1F, -0.5F, 0.2F, 0F, -1F, 0.2F, 0F, 0.5F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -1F, 0F); // Du loco part06
		bodyModel[779].setRotationPoint(24F, -6F, -8F);

		bodyModel[780].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[780].setRotationPoint(9.5F, -4F, -9F);

		bodyModel[781].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[781].setRotationPoint(14F, -4F, -9.5F);

		bodyModel[782].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[782].setRotationPoint(86F, -7F, 6F);

		bodyModel[783].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[783].setRotationPoint(65F, -7F, 6F);

		bodyModel[784].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -3F, 0F, -0.5F, -3F); // Du loco part06
		bodyModel[784].setRotationPoint(70F, -7F, 7F);

		bodyModel[785].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[785].setRotationPoint(70F, -4F, 7.5F);

		bodyModel[786].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.4F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1.5F); // Du loco part06
		bodyModel[786].setRotationPoint(70F, -8F, 7F);

		bodyModel[787].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1.5F); // Du loco part06
		bodyModel[787].setRotationPoint(70F, -8F, 7F);

		bodyModel[788].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -1.25F); // Du loco part06
		bodyModel[788].setRotationPoint(68F, -8F, 8F);

		bodyModel[789].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[789].setRotationPoint(74F, -8F, 7F);

		bodyModel[790].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, -2F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[790].setRotationPoint(82F, -8F, 7F);

		bodyModel[791].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F); // Du loco part06
		bodyModel[791].setRotationPoint(85F, -8F, 7F);

		bodyModel[792].addShapeBox(0F, 0F, 0F, 32, 3, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[792].setRotationPoint(61F, -10F, -8F);

		bodyModel[793].addShapeBox(0F, 0F, 0F, 32, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[793].setRotationPoint(61F, -10F, 6F);

		bodyModel[794].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F); // Du loco part06
		bodyModel[794].setRotationPoint(78F, -6F, 9F);

		bodyModel[795].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F); // Du loco part06
		bodyModel[795].setRotationPoint(80F, -6F, 9F);

		bodyModel[796].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F); // Du loco part06
		bodyModel[796].setRotationPoint(78F, -6F, 7F);

		bodyModel[797].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F); // Du loco part06
		bodyModel[797].setRotationPoint(80F, -6F, 7F);

		bodyModel[798].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F); // Du loco part06
		bodyModel[798].setRotationPoint(74F, -6F, 9F);

		bodyModel[799].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F); // Du loco part06
		bodyModel[799].setRotationPoint(76F, -6F, 9F);

		bodyModel[800].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F); // Du loco part06
		bodyModel[800].setRotationPoint(74F, -6F, 7F);

		bodyModel[801].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F); // Du loco part06
		bodyModel[801].setRotationPoint(76F, -6F, 7F);

		bodyModel[802].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part06
		bodyModel[802].setRotationPoint(84F, -4F, 7F);

		bodyModel[803].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[803].setRotationPoint(90F, -7F, 7F);

		bodyModel[804].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[804].setRotationPoint(68.5F, -7F, 8F);

		bodyModel[805].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[805].setRotationPoint(68.5F, -4F, 7.5F);

		bodyModel[806].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F); // Du loco part06
		bodyModel[806].setRotationPoint(70.5F, -4F, 7F);

		bodyModel[807].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[807].setRotationPoint(79F, -4F, 8.5F);

		bodyModel[808].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part06
		bodyModel[808].setRotationPoint(83F, -7F, 7F);

		bodyModel[809].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Du loco part06
		bodyModel[809].setRotationPoint(62F, -7F, 7F);

		bodyModel[810].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part06
		bodyModel[810].setRotationPoint(63F, -4F, 7F);

		bodyModel[811].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[811].setRotationPoint(82.5F, -7F, 5.5F);

		bodyModel[812].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[812].setRotationPoint(82.5F, -7F, 9.5F);

		bodyModel[813].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[813].setRotationPoint(85.5F, -8F, 8F);

		bodyModel[814].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[814].setRotationPoint(85.5F, -4F, 7.5F);

		bodyModel[815].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part06
		bodyModel[815].setRotationPoint(77.5F, -5F, 5F);

		bodyModel[816].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part06
		bodyModel[816].setRotationPoint(77.5F, -6.5F, 5F);

		bodyModel[817].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part06
		bodyModel[817].setRotationPoint(77.5F, -5.75F, 10F);

		bodyModel[818].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Du loco part06
		bodyModel[818].setRotationPoint(78F, -5.75F, 10F);

		bodyModel[819].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F); // Du loco part06
		bodyModel[819].setRotationPoint(74F, -4F, 9F);

		bodyModel[820].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[820].setRotationPoint(78F, -4F, 9F);

		bodyModel[821].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part06
		bodyModel[821].setRotationPoint(75F, -5.75F, 10F);

		bodyModel[822].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[822].setRotationPoint(86.5F, -6.5F, 7F);

		bodyModel[823].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[823].setRotationPoint(86.5F, -5.5F, 7F);

		bodyModel[824].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[824].setRotationPoint(87.5F, -6.5F, 7F);

		bodyModel[825].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[825].setRotationPoint(87.5F, -5.5F, 7F);

		bodyModel[826].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[826].setRotationPoint(65.5F, -6.5F, 7F);

		bodyModel[827].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[827].setRotationPoint(65.5F, -5.5F, 7F);

		bodyModel[828].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[828].setRotationPoint(66.5F, -6.5F, 7F);

		bodyModel[829].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[829].setRotationPoint(66.5F, -5.5F, 7F);

		bodyModel[830].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[830].setRotationPoint(74F, -4F, 7F);

		bodyModel[831].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[831].setRotationPoint(78F, -4F, 7F);

		bodyModel[832].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -0.5F); // Du loco part06
		bodyModel[832].setRotationPoint(85F, -6F, 7F);

		bodyModel[833].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -0.5F); // Du loco part06
		bodyModel[833].setRotationPoint(64F, -6F, 7F);

		bodyModel[834].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0.2F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -1F); // Du loco part06
		bodyModel[834].setRotationPoint(89F, -6F, 7F);

		bodyModel[835].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0F, 0.5F, 0F, 1F, 0F, 0F, 1F, -0.5F, 0.2F, 0F, -1F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -1F); // Du loco part06
		bodyModel[835].setRotationPoint(68F, -6F, 7F);

		bodyModel[836].addBox(0F, 0F, 0F, 2, 3, 12, 0F); // Du loco part06
		bodyModel[836].setRotationPoint(61F, -10F, -6F);

		bodyModel[837].addBox(0F, 0F, 0F, 2, 3, 12, 0F); // Du loco part06
		bodyModel[837].setRotationPoint(91F, -10F, -6F);

		bodyModel[838].addBox(0F, 0F, 0F, 12, 5, 12, 0F); // Du loco part06
		bodyModel[838].setRotationPoint(71F, -9F, -6F);

		bodyModel[839].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[839].setRotationPoint(79.5F, -4F, 7F);

		bodyModel[840].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part06
		bodyModel[840].setRotationPoint(76F, -4F, 8.5F);

		bodyModel[841].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[841].setRotationPoint(86F, -7F, -7F);

		bodyModel[842].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[842].setRotationPoint(65F, -7F, -7F);

		bodyModel[843].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, -3F, 0F, -3F, -3F, 0F, -0.5F, 0F, -0.5F, -0.5F); // Du loco part06
		bodyModel[843].setRotationPoint(70F, -7F, -11F);

		bodyModel[844].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[844].setRotationPoint(70F, -4F, -8.5F);

		bodyModel[845].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-3F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, -1F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F); // Du loco part06
		bodyModel[845].setRotationPoint(70F, -8F, -11F);

		bodyModel[846].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[846].setRotationPoint(70F, -8F, -11F);

		bodyModel[847].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part06
		bodyModel[847].setRotationPoint(68F, -8F, -10F);

		bodyModel[848].addShapeBox(0F, 0F, 0F, 8, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[848].setRotationPoint(74F, -8F, -11F);

		bodyModel[849].addShapeBox(0F, 0F, 0F, 3, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[849].setRotationPoint(82F, -8F, -11F);

		bodyModel[850].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[850].setRotationPoint(85F, -8F, -9F);

		bodyModel[851].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F); // Du loco part06
		bodyModel[851].setRotationPoint(78F, -6F, -9F);

		bodyModel[852].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F); // Du loco part06
		bodyModel[852].setRotationPoint(80F, -6F, -9F);

		bodyModel[853].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F); // Du loco part06
		bodyModel[853].setRotationPoint(78F, -6F, -11F);

		bodyModel[854].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F); // Du loco part06
		bodyModel[854].setRotationPoint(80F, -6F, -11F);

		bodyModel[855].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F); // Du loco part06
		bodyModel[855].setRotationPoint(74F, -6F, -9F);

		bodyModel[856].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F); // Du loco part06
		bodyModel[856].setRotationPoint(76F, -6F, -9F);

		bodyModel[857].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,-1F, 0.5F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, -6F, -1F, 0F, -6F, -0.5F, 0F, -6F, 0F, -0.5F, -6F, 0F); // Du loco part06
		bodyModel[857].setRotationPoint(74F, -6F, -11F);

		bodyModel[858].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0.5F, -0.5F, -1F, 0.5F, -1F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -6F, -0.5F, -1F, -6F, -1F, -0.5F, -6F, 0F, 0F, -6F, 0F); // Du loco part06
		bodyModel[858].setRotationPoint(76F, -6F, -11F);

		bodyModel[859].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[859].setRotationPoint(84F, -4F, -8F);

		bodyModel[860].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[860].setRotationPoint(90F, -7F, -8F);

		bodyModel[861].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[861].setRotationPoint(68.5F, -7F, -9F);

		bodyModel[862].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[862].setRotationPoint(68.5F, -4F, -8.5F);

		bodyModel[863].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, -1.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[863].setRotationPoint(70.5F, -4F, -9F);

		bodyModel[864].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[864].setRotationPoint(79F, -4F, -9.5F);

		bodyModel[865].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[865].setRotationPoint(83F, -7F, -8F);

		bodyModel[866].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[866].setRotationPoint(62F, -7F, -8F);

		bodyModel[867].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[867].setRotationPoint(63F, -4F, -8F);

		bodyModel[868].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Du loco part06
		bodyModel[868].setRotationPoint(82.5F, -7F, -11.5F);

		bodyModel[869].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[869].setRotationPoint(82.5F, -7F, -11.5F);

		bodyModel[870].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[870].setRotationPoint(85.5F, -8F, -9F);

		bodyModel[871].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[871].setRotationPoint(85.5F, -4F, -8.5F);

		bodyModel[872].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part06
		bodyModel[872].setRotationPoint(77.5F, -5F, -11F);

		bodyModel[873].addShapeBox(0F, 0F, 0F, 1, 2, 6, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F); // Du loco part06
		bodyModel[873].setRotationPoint(77.5F, -6.5F, -11F);

		bodyModel[874].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Du loco part06
		bodyModel[874].setRotationPoint(77.5F, -5.75F, -11F);

		bodyModel[875].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Du loco part06
		bodyModel[875].setRotationPoint(78F, -5.75F, -11F);

		bodyModel[876].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[876].setRotationPoint(74F, -4F, -11F);

		bodyModel[877].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[877].setRotationPoint(78F, -4F, -11F);

		bodyModel[878].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Du loco part06
		bodyModel[878].setRotationPoint(75F, -5.75F, -11F);

		bodyModel[879].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[879].setRotationPoint(86.5F, -6.5F, -8F);

		bodyModel[880].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[880].setRotationPoint(86.5F, -5.5F, -8F);

		bodyModel[881].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[881].setRotationPoint(87.5F, -6.5F, -8F);

		bodyModel[882].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[882].setRotationPoint(87.5F, -5.5F, -8F);

		bodyModel[883].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[883].setRotationPoint(65.5F, -6.5F, -8F);

		bodyModel[884].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F); // Du loco part06
		bodyModel[884].setRotationPoint(65.5F, -5.5F, -8F);

		bodyModel[885].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[885].setRotationPoint(66.5F, -6.5F, -8F);

		bodyModel[886].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[886].setRotationPoint(66.5F, -5.5F, -8F);

		bodyModel[887].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[887].setRotationPoint(74F, -4F, -9F);

		bodyModel[888].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part06
		bodyModel[888].setRotationPoint(78F, -4F, -9F);

		bodyModel[889].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, -0.5F, 0.2F, 0F, -1F, 0.2F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[889].setRotationPoint(85F, -6F, -8F);

		bodyModel[890].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0.5F, -0.5F, 0.2F, 0F, -1F, 0.2F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[890].setRotationPoint(64F, -6F, -8F);

		bodyModel[891].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.2F, 0F, -1F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0.5F); // Du loco part06
		bodyModel[891].setRotationPoint(89F, -6F, -8F);

		bodyModel[892].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.2F, 0F, -1F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0.2F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0.5F); // Du loco part06
		bodyModel[892].setRotationPoint(68F, -6F, -8F);

		bodyModel[893].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[893].setRotationPoint(79.5F, -4F, -9F);

		bodyModel[894].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[894].setRotationPoint(76F, -4F, -9.5F);

		bodyModel[895].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 0
		bodyModel[895].setRotationPoint(35.85F, -7.5F, 5.25F);

		bodyModel[896].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F); // Box 0
		bodyModel[896].setRotationPoint(35.85F, -8.5F, 5.25F);

		bodyModel[897].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 0
		bodyModel[897].setRotationPoint(35.85F, -8F, 5.25F);

		bodyModel[898].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F); // Box 0
		bodyModel[898].setRotationPoint(35.85F, -5.75F, 5.25F);

		bodyModel[899].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F); // Box 0
		bodyModel[899].setRotationPoint(35.85F, -6.25F, 5.25F);

		bodyModel[900].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 0
		bodyModel[900].setRotationPoint(47.85F, -7.5F, 5.25F);

		bodyModel[901].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F); // Box 0
		bodyModel[901].setRotationPoint(47.85F, -8.5F, 5.25F);

		bodyModel[902].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 0
		bodyModel[902].setRotationPoint(47.85F, -8F, 5.25F);

		bodyModel[903].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F); // Box 0
		bodyModel[903].setRotationPoint(47.85F, -5.75F, 5.25F);

		bodyModel[904].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F); // Box 0
		bodyModel[904].setRotationPoint(47.85F, -6.25F, 5.25F);

		bodyModel[905].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 0
		bodyModel[905].setRotationPoint(35.85F, -7.5F, -9.25F);

		bodyModel[906].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F); // Box 0
		bodyModel[906].setRotationPoint(35.85F, -8.5F, -9.25F);

		bodyModel[907].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 0
		bodyModel[907].setRotationPoint(35.85F, -8F, -9.25F);

		bodyModel[908].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F); // Box 0
		bodyModel[908].setRotationPoint(35.85F, -5.75F, -9.25F);

		bodyModel[909].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F); // Box 0
		bodyModel[909].setRotationPoint(35.85F, -6.25F, -9.25F);

		bodyModel[910].addShapeBox(0F, 0F, 0F, 10, 2, 4, 0F,0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F); // Box 0
		bodyModel[910].setRotationPoint(47.85F, -7.5F, -9.25F);

		bodyModel[911].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F); // Box 0
		bodyModel[911].setRotationPoint(47.85F, -8.5F, -9.25F);

		bodyModel[912].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F); // Box 0
		bodyModel[912].setRotationPoint(47.85F, -8F, -9.25F);

		bodyModel[913].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, -0.55F, -0.45F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F, 0F, 0F, -1.125F); // Box 0
		bodyModel[913].setRotationPoint(47.85F, -5.75F, -9.25F);

		bodyModel[914].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F, 0F, 0.05F, -0.45F); // Box 0
		bodyModel[914].setRotationPoint(47.85F, -6.25F, -9.25F);

		bodyModel[915].addBox(0F, 0F, 0F, 10, 7, 16, 0F); // Box 0
		bodyModel[915].setRotationPoint(47.85F, -11F, -8F);

		bodyModel[916].addBox(0F, 0F, 0F, 10, 4, 10, 0F); // Box 0
		bodyModel[916].setRotationPoint(35.85F, -11F, -5F);

		bodyModel[917].addBox(0F, 0F, 0F, 12, 4, 10, 0F); // Box 0
		bodyModel[917].setRotationPoint(45.85F, -11F, -5F);

		bodyModel[918].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[918].setRotationPoint(35F, -8F, -11F);

		bodyModel[919].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[919].setRotationPoint(34F, -8F, -11F);

		bodyModel[920].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[920].setRotationPoint(35F, -8F, -11F);

		bodyModel[921].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 0
		bodyModel[921].setRotationPoint(33F, -8F, -11F);

		bodyModel[922].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[922].setRotationPoint(33F, -8F, -11F);

		bodyModel[923].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[923].setRotationPoint(60F, -8F, -11F);

		bodyModel[924].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[924].setRotationPoint(59F, -8F, -11F);

		bodyModel[925].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[925].setRotationPoint(60F, -8F, -11F);

		bodyModel[926].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Box 0
		bodyModel[926].setRotationPoint(58F, -8F, -11F);

		bodyModel[927].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Box 0
		bodyModel[927].setRotationPoint(58F, -8F, -11F);

		bodyModel[928].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2.625F, 0F, 0F, -0.25F, 0F, 0F, -2.625F, 0F, 0F, -0.25F, 0F, 0F, -2.375F, 0F, 0F, -0.5F, 0F, 0F, -2.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[928].setRotationPoint(-10.25F, -3F, -8F);

		bodyModel[929].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,-0.5F, 0F, 0F, -2.375F, 0F, 0F, 0F, 0F, 0F, -2.875F, 0F, 0F, 0F, 0F, 0F, -2.875F, 0F, 0F, -0.5F, 0F, 0F, -2.375F, 0F, 0F); // Du loco part42
		bodyModel[929].setRotationPoint(-10F, -7F, 0F);

		bodyModel[930].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.25F, 0F, 0F, -2.625F, 0F, 0F, -0.25F, 0F, 0F, -2.625F, 0F, 0F, 0F, 0F, 0F, -2.875F, 0F, 0F, -0.5F, 0F, 0F, -2.375F, 0F, 0F); // Du loco part42
		bodyModel[930].setRotationPoint(-10.25F, -3F, 0F);

		bodyModel[931].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.625F, 0F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, -2.875F, 0F, 0F, -0.125F, 0F, 0F, -2.75F, 0F, 0F, -0.5F, -1F, 0F, -2.375F, -1F, 0F); // Du loco part42
		bodyModel[931].setRotationPoint(-7.75F, -7F, 8F);

		bodyModel[932].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-0.625F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0F, 0F, 0F, -2.875F, 0F, 0F, -0.125F, 0F, -0.5F, -3.75F, 0F, -0.5F, -1.5F, -2F, 0F, -2.375F, -2F, 0F); // Du loco part42
		bodyModel[932].setRotationPoint(-5.5F, -7F, 9.5F);

		bodyModel[933].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-2.875F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, 0F, -0.625F, 0F, 0F, -2.375F, -1F, 0F, -0.5F, -1F, 0F, -2.75F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part42
		bodyModel[933].setRotationPoint(-7.75F, -7F, -10F);

		bodyModel[934].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-2.875F, 0F, 0F, 0F, 0F, 0F, -2.25F, 0F, -0.5F, -0.625F, 0F, -0.5F, -2.375F, -2F, 0F, -1.5F, -2F, 0F, -3.75F, 0F, -0.5F, -0.125F, 0F, -0.5F); // Du loco part42
		bodyModel[934].setRotationPoint(-5.5F, -7F, -10.5F);

		bodyModel[935].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, -2.875F, 0F, 0F, -0.5F, 0F, 0F, -2.375F, 0F, 0F, -0.5F, 0F, 0F, -2.375F, 0F, 0F, 0F, 0F, 0F, -2.875F, 0F, 0F); // Du loco part42
		bodyModel[935].setRotationPoint(101F, -7F, -8F);

		bodyModel[936].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-0.25F, 0F, 0F, -2.625F, 0F, 0F, -0.25F, 0F, 0F, -2.625F, 0F, 0F, -0.5F, 0F, 0F, -2.375F, 0F, 0F, 0F, 0F, 0F, -2.875F, 0F, 0F); // Du loco part42
		bodyModel[936].setRotationPoint(101.25F, -3F, -8F);

		bodyModel[937].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,-2.375F, 0F, 0F, -0.5F, 0F, 0F, -2.875F, 0F, 0F, 0F, 0F, 0F, -2.875F, 0F, 0F, 0F, 0F, 0F, -2.375F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part42
		bodyModel[937].setRotationPoint(101F, -7F, 0F);

		bodyModel[938].addShapeBox(0F, 0F, 0F, 3, 1, 8, 0F,-2.625F, 0F, 0F, -0.25F, 0F, 0F, -2.625F, 0F, 0F, -0.25F, 0F, 0F, -2.875F, 0F, 0F, 0F, 0F, 0F, -2.375F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part42
		bodyModel[938].setRotationPoint(101.25F, -3F, 0F);

		bodyModel[939].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-2.25F, 0F, 0F, -0.625F, 0F, 0F, -2.875F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -0.125F, 0F, 0F, -2.375F, -1F, 0F, -0.5F, -1F, 0F); // Du loco part42
		bodyModel[939].setRotationPoint(98.75F, -7F, 8F);

		bodyModel[940].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,-2.25F, 0F, -0.5F, -0.625F, 0F, -0.5F, -2.875F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, -0.5F, -0.125F, 0F, -0.5F, -2.375F, -2F, 0F, -1.5F, -2F, 0F); // Du loco part42
		bodyModel[940].setRotationPoint(95.5F, -7F, 9.5F);

		bodyModel[941].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, -2.875F, 0F, 0F, -0.625F, 0F, 0F, -2.25F, 0F, 0F, -0.5F, -1F, 0F, -2.375F, -1F, 0F, -0.125F, 0F, 0F, -2.75F, 0F, 0F); // Du loco part42
		bodyModel[941].setRotationPoint(98.75F, -7F, -10F);

		bodyModel[942].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, -2.875F, 0F, 0F, -0.625F, 0F, -0.5F, -2.25F, 0F, -0.5F, -1.5F, -2F, 0F, -2.375F, -2F, 0F, -0.125F, 0F, -0.5F, -3.75F, 0F, -0.5F); // Du loco part42
		bodyModel[942].setRotationPoint(95.5F, -7F, -10.5F);

		bodyModel[943].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[943].setRotationPoint(-9F, -6F, -10F);

		bodyModel[944].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,-3.875F, 0F, -1F, -2F, 0F, -1F, -5.875F, -1F, -1F, 0F, -1F, -1F, -5.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, -1F, 1F, 0F); // Du loco part42
		bodyModel[944].setRotationPoint(-10F, -7F, -10F);

		bodyModel[945].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,-5.875F, 1F, 0F, 0F, 1F, 0F, -4.875F, 0F, 0F, -1F, 0F, 0F, -2.875F, 1F, -2F, -3F, 1F, -2F, -6.875F, 1F, 0F, 1F, 1F, 0F); // Du loco part42
		bodyModel[945].setRotationPoint(-10F, -3F, -10F);

		bodyModel[946].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.5F, -0.25F, 0F, -0.5F, 1.75F, 0F, -0.5F, 1.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 0
		bodyModel[946].setRotationPoint(-8.5F, -2.25F, -4.5F);

		bodyModel[947].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, -1.25F, 0F, -0.5F, 1.25F, 0F, -0.5F, 1F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 1.75F, 0F, 0F, -0.25F); // Box 0
		bodyModel[947].setRotationPoint(-8.5F, -3.25F, -3.5F);

		bodyModel[948].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[948].setRotationPoint(98F, -6F, 1F);

		bodyModel[949].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,-5.875F, -1F, -1F, 0F, -1F, -1F, -3.875F, 0F, -1F, -2F, 0F, -1F, -4.875F, 1F, 0F, -1F, 1F, 0F, -5.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[949].setRotationPoint(98F, -7F, 1F);

		bodyModel[950].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,-4.875F, 0F, 0F, -1F, 0F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F, -6.875F, 1F, 0F, 1F, 1F, 0F, -2.875F, 1F, -2F, -3F, 1F, -2F); // Du loco part42
		bodyModel[950].setRotationPoint(98F, -3F, 1F);

		bodyModel[951].addShapeBox(0F, 0F, 0F, 5, 2, 9, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[951].setRotationPoint(98F, -6F, -10F);

		bodyModel[952].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,-2F, 0F, -1F, -3.875F, 0F, -1F, 0F, -1F, -1F, -5.875F, -1F, -1F, 0F, 0F, 0F, -5.875F, 0F, 0F, -1F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[952].setRotationPoint(98F, -7F, -10F);

		bodyModel[953].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 1F, 0F, -5.875F, 1F, 0F, -1F, 0F, 0F, -4.875F, 0F, 0F, -3F, 1F, -2F, -2.875F, 1F, -2F, 1F, 1F, 0F, -6.875F, 1F, 0F); // Du loco part42
		bodyModel[953].setRotationPoint(98F, -3F, -10F);

		bodyModel[954].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,0F, -0.5F, 1.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, 1.75F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 2.25F); // Box 0
		bodyModel[954].setRotationPoint(101.5F, -2.25F, -4.5F);

		bodyModel[955].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.5F, 1F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.25F, 0F, 0F, 1.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 0
		bodyModel[955].setRotationPoint(101.5F, -3.25F, -3.5F);

		bodyModel[956].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[956].setRotationPoint(8F, -32F, 7F);

		bodyModel[957].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[957].setRotationPoint(26F, -32F, 7F);

		bodyModel[958].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[958].setRotationPoint(67F, -32F, 7F);

		bodyModel[959].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[959].setRotationPoint(85F, -32F, 7F);

		bodyModel[960].addShapeBox(0F, 0F, 0F, 40, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[960].setRotationPoint(27F, -32F, 7F);

		bodyModel[961].addShapeBox(0F, 0F, 0F, 40, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[961].setRotationPoint(27F, -32F, 9F);

		bodyModel[962].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[962].setRotationPoint(27F, -31.95F, 9F);

		bodyModel[963].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[963].setRotationPoint(9F, -32F, 9F);

		bodyModel[964].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[964].setRotationPoint(9F, -32F, 9F);

		bodyModel[965].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[965].setRotationPoint(68F, -32F, 9F);

		bodyModel[966].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[966].setRotationPoint(68F, -32F, 9F);

		bodyModel[967].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[967].setRotationPoint(68F, -32F, 7F);

		bodyModel[968].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[968].setRotationPoint(9F, -32F, 7F);

		bodyModel[969].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[969].setRotationPoint(9.25F, -32F, 10F);

		bodyModel[970].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[970].setRotationPoint(9.75F, -32F, 10F);

		bodyModel[971].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[971].setRotationPoint(10.25F, -32F, 10F);

		bodyModel[972].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[972].setRotationPoint(11.25F, -32F, 10F);

		bodyModel[973].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[973].setRotationPoint(11.75F, -32F, 10F);

		bodyModel[974].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[974].setRotationPoint(10.75F, -32F, 10F);

		bodyModel[975].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 168
		bodyModel[975].setRotationPoint(8F, -32F, -11F);

		bodyModel[976].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 168
		bodyModel[976].setRotationPoint(26F, -32F, -11F);

		bodyModel[977].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 168
		bodyModel[977].setRotationPoint(67F, -32F, -11F);

		bodyModel[978].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 168
		bodyModel[978].setRotationPoint(85F, -32F, -11F);

		bodyModel[979].addShapeBox(0F, 0F, 0F, 40, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 168
		bodyModel[979].setRotationPoint(27F, -32F, -11F);

		bodyModel[980].addShapeBox(0F, 0F, 0F, 40, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 168
		bodyModel[980].setRotationPoint(27F, -32F, -11F);

		bodyModel[981].addShapeBox(0F, 0F, 0F, 40, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[981].setRotationPoint(27F, -31.95F, -10F);

		bodyModel[982].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 168
		bodyModel[982].setRotationPoint(9F, -32F, -11F);

		bodyModel[983].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[983].setRotationPoint(9F, -32F, -10F);

		bodyModel[984].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 168
		bodyModel[984].setRotationPoint(68F, -32F, -11F);

		bodyModel[985].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[985].setRotationPoint(68F, -32F, -10F);

		bodyModel[986].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[986].setRotationPoint(68F, -32F, -9F);

		bodyModel[987].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[987].setRotationPoint(9F, -32F, -9F);

		bodyModel[988].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[988].setRotationPoint(12.25F, -32F, 10F);

		bodyModel[989].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[989].setRotationPoint(12.75F, -32F, 10F);

		bodyModel[990].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[990].setRotationPoint(13.25F, -32F, 10F);

		bodyModel[991].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[991].setRotationPoint(14.25F, -32F, 10F);

		bodyModel[992].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[992].setRotationPoint(14.75F, -32F, 10F);

		bodyModel[993].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[993].setRotationPoint(13.75F, -32F, 10F);

		bodyModel[994].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[994].setRotationPoint(15.25F, -32F, 10F);

		bodyModel[995].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[995].setRotationPoint(15.75F, -32F, 10F);

		bodyModel[996].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[996].setRotationPoint(16.25F, -32F, 10F);

		bodyModel[997].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[997].setRotationPoint(17.25F, -32F, 10F);

		bodyModel[998].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[998].setRotationPoint(17.75F, -32F, 10F);

		bodyModel[999].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[999].setRotationPoint(16.75F, -32F, 10F);
	}

	private void initbodyModel_3()
	{
		bodyModel[1000] = new ModelRendererTurbo(this, 121, 353, textureX, textureY); // Box 168
		bodyModel[1001] = new ModelRendererTurbo(this, 129, 353, textureX, textureY); // Box 168
		bodyModel[1002] = new ModelRendererTurbo(this, 193, 353, textureX, textureY); // Box 168
		bodyModel[1003] = new ModelRendererTurbo(this, 201, 353, textureX, textureY); // Box 168
		bodyModel[1004] = new ModelRendererTurbo(this, 209, 353, textureX, textureY); // Box 168
		bodyModel[1005] = new ModelRendererTurbo(this, 473, 353, textureX, textureY); // Box 168
		bodyModel[1006] = new ModelRendererTurbo(this, 505, 361, textureX, textureY); // Box 168
		bodyModel[1007] = new ModelRendererTurbo(this, 377, 369, textureX, textureY); // Box 168
		bodyModel[1008] = new ModelRendererTurbo(this, 385, 369, textureX, textureY); // Box 168
		bodyModel[1009] = new ModelRendererTurbo(this, 393, 369, textureX, textureY); // Box 168
		bodyModel[1010] = new ModelRendererTurbo(this, 401, 369, textureX, textureY); // Box 168
		bodyModel[1011] = new ModelRendererTurbo(this, 409, 369, textureX, textureY); // Box 168
		bodyModel[1012] = new ModelRendererTurbo(this, 417, 369, textureX, textureY); // Box 168
		bodyModel[1013] = new ModelRendererTurbo(this, 425, 369, textureX, textureY); // Box 168
		bodyModel[1014] = new ModelRendererTurbo(this, 433, 369, textureX, textureY); // Box 168
		bodyModel[1015] = new ModelRendererTurbo(this, 441, 369, textureX, textureY); // Box 168
		bodyModel[1016] = new ModelRendererTurbo(this, 449, 369, textureX, textureY); // Box 168
		bodyModel[1017] = new ModelRendererTurbo(this, 457, 369, textureX, textureY); // Box 168
		bodyModel[1018] = new ModelRendererTurbo(this, 465, 369, textureX, textureY); // Box 168
		bodyModel[1019] = new ModelRendererTurbo(this, 473, 369, textureX, textureY); // Box 168
		bodyModel[1020] = new ModelRendererTurbo(this, 481, 369, textureX, textureY); // Box 168
		bodyModel[1021] = new ModelRendererTurbo(this, 489, 369, textureX, textureY); // Box 168
		bodyModel[1022] = new ModelRendererTurbo(this, 497, 369, textureX, textureY); // Box 168
		bodyModel[1023] = new ModelRendererTurbo(this, 505, 369, textureX, textureY); // Box 168
		bodyModel[1024] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 168
		bodyModel[1025] = new ModelRendererTurbo(this, 9, 377, textureX, textureY); // Box 168
		bodyModel[1026] = new ModelRendererTurbo(this, 17, 377, textureX, textureY); // Box 168
		bodyModel[1027] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Box 168
		bodyModel[1028] = new ModelRendererTurbo(this, 33, 377, textureX, textureY); // Box 168
		bodyModel[1029] = new ModelRendererTurbo(this, 41, 377, textureX, textureY); // Box 168
		bodyModel[1030] = new ModelRendererTurbo(this, 49, 377, textureX, textureY); // Box 168
		bodyModel[1031] = new ModelRendererTurbo(this, 57, 377, textureX, textureY); // Box 168
		bodyModel[1032] = new ModelRendererTurbo(this, 65, 377, textureX, textureY); // Box 168
		bodyModel[1033] = new ModelRendererTurbo(this, 73, 377, textureX, textureY); // Box 168
		bodyModel[1034] = new ModelRendererTurbo(this, 81, 377, textureX, textureY); // Box 168
		bodyModel[1035] = new ModelRendererTurbo(this, 89, 377, textureX, textureY); // Box 168
		bodyModel[1036] = new ModelRendererTurbo(this, 97, 377, textureX, textureY); // Box 168
		bodyModel[1037] = new ModelRendererTurbo(this, 105, 377, textureX, textureY); // Box 168
		bodyModel[1038] = new ModelRendererTurbo(this, 113, 377, textureX, textureY); // Box 168
		bodyModel[1039] = new ModelRendererTurbo(this, 121, 377, textureX, textureY); // Box 168
		bodyModel[1040] = new ModelRendererTurbo(this, 129, 377, textureX, textureY); // Box 168
		bodyModel[1041] = new ModelRendererTurbo(this, 137, 377, textureX, textureY); // Box 168
		bodyModel[1042] = new ModelRendererTurbo(this, 145, 377, textureX, textureY); // Box 168
		bodyModel[1043] = new ModelRendererTurbo(this, 153, 377, textureX, textureY); // Box 168
		bodyModel[1044] = new ModelRendererTurbo(this, 161, 377, textureX, textureY); // Box 168
		bodyModel[1045] = new ModelRendererTurbo(this, 169, 377, textureX, textureY); // Box 168
		bodyModel[1046] = new ModelRendererTurbo(this, 177, 377, textureX, textureY); // Box 168
		bodyModel[1047] = new ModelRendererTurbo(this, 185, 377, textureX, textureY); // Box 168
		bodyModel[1048] = new ModelRendererTurbo(this, 193, 377, textureX, textureY); // Box 168
		bodyModel[1049] = new ModelRendererTurbo(this, 201, 377, textureX, textureY); // Box 168
		bodyModel[1050] = new ModelRendererTurbo(this, 209, 377, textureX, textureY); // Box 168
		bodyModel[1051] = new ModelRendererTurbo(this, 217, 377, textureX, textureY); // Box 168
		bodyModel[1052] = new ModelRendererTurbo(this, 225, 377, textureX, textureY); // Box 168
		bodyModel[1053] = new ModelRendererTurbo(this, 233, 377, textureX, textureY); // Box 168
		bodyModel[1054] = new ModelRendererTurbo(this, 241, 377, textureX, textureY); // Box 168
		bodyModel[1055] = new ModelRendererTurbo(this, 249, 377, textureX, textureY); // Box 168
		bodyModel[1056] = new ModelRendererTurbo(this, 257, 377, textureX, textureY); // Box 168
		bodyModel[1057] = new ModelRendererTurbo(this, 265, 377, textureX, textureY); // Box 168
		bodyModel[1058] = new ModelRendererTurbo(this, 273, 377, textureX, textureY); // Box 168
		bodyModel[1059] = new ModelRendererTurbo(this, 281, 377, textureX, textureY); // Box 168
		bodyModel[1060] = new ModelRendererTurbo(this, 289, 377, textureX, textureY); // Box 168
		bodyModel[1061] = new ModelRendererTurbo(this, 297, 377, textureX, textureY); // Box 168
		bodyModel[1062] = new ModelRendererTurbo(this, 305, 377, textureX, textureY); // Box 168
		bodyModel[1063] = new ModelRendererTurbo(this, 313, 377, textureX, textureY); // Box 168
		bodyModel[1064] = new ModelRendererTurbo(this, 321, 377, textureX, textureY); // Box 168
		bodyModel[1065] = new ModelRendererTurbo(this, 329, 377, textureX, textureY); // Box 168
		bodyModel[1066] = new ModelRendererTurbo(this, 337, 377, textureX, textureY); // Box 168
		bodyModel[1067] = new ModelRendererTurbo(this, 345, 377, textureX, textureY); // Box 168
		bodyModel[1068] = new ModelRendererTurbo(this, 353, 377, textureX, textureY); // Box 168
		bodyModel[1069] = new ModelRendererTurbo(this, 361, 377, textureX, textureY); // Box 168
		bodyModel[1070] = new ModelRendererTurbo(this, 369, 377, textureX, textureY); // Box 168
		bodyModel[1071] = new ModelRendererTurbo(this, 377, 377, textureX, textureY); // Box 168
		bodyModel[1072] = new ModelRendererTurbo(this, 385, 377, textureX, textureY); // Box 168
		bodyModel[1073] = new ModelRendererTurbo(this, 393, 377, textureX, textureY); // Box 168
		bodyModel[1074] = new ModelRendererTurbo(this, 401, 377, textureX, textureY); // Box 168
		bodyModel[1075] = new ModelRendererTurbo(this, 409, 377, textureX, textureY); // Box 168
		bodyModel[1076] = new ModelRendererTurbo(this, 417, 377, textureX, textureY); // Box 168
		bodyModel[1077] = new ModelRendererTurbo(this, 425, 377, textureX, textureY); // Box 168
		bodyModel[1078] = new ModelRendererTurbo(this, 433, 377, textureX, textureY); // Box 168
		bodyModel[1079] = new ModelRendererTurbo(this, 441, 377, textureX, textureY); // Box 168
		bodyModel[1080] = new ModelRendererTurbo(this, 449, 377, textureX, textureY); // Box 168
		bodyModel[1081] = new ModelRendererTurbo(this, 457, 377, textureX, textureY); // Box 168
		bodyModel[1082] = new ModelRendererTurbo(this, 465, 377, textureX, textureY); // Box 168
		bodyModel[1083] = new ModelRendererTurbo(this, 473, 377, textureX, textureY); // Box 168
		bodyModel[1084] = new ModelRendererTurbo(this, 481, 377, textureX, textureY); // Box 168
		bodyModel[1085] = new ModelRendererTurbo(this, 489, 377, textureX, textureY); // Box 168
		bodyModel[1086] = new ModelRendererTurbo(this, 497, 377, textureX, textureY); // Box 168
		bodyModel[1087] = new ModelRendererTurbo(this, 505, 377, textureX, textureY); // Box 168
		bodyModel[1088] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 168
		bodyModel[1089] = new ModelRendererTurbo(this, 9, 385, textureX, textureY); // Box 168
		bodyModel[1090] = new ModelRendererTurbo(this, 17, 385, textureX, textureY); // Box 168
		bodyModel[1091] = new ModelRendererTurbo(this, 25, 385, textureX, textureY); // Box 168
		bodyModel[1092] = new ModelRendererTurbo(this, 33, 385, textureX, textureY); // Box 168
		bodyModel[1093] = new ModelRendererTurbo(this, 41, 385, textureX, textureY); // Box 168
		bodyModel[1094] = new ModelRendererTurbo(this, 49, 385, textureX, textureY); // Box 168
		bodyModel[1095] = new ModelRendererTurbo(this, 57, 385, textureX, textureY); // Box 168
		bodyModel[1096] = new ModelRendererTurbo(this, 65, 385, textureX, textureY); // Box 168
		bodyModel[1097] = new ModelRendererTurbo(this, 73, 385, textureX, textureY); // Box 168
		bodyModel[1098] = new ModelRendererTurbo(this, 81, 385, textureX, textureY); // Box 168
		bodyModel[1099] = new ModelRendererTurbo(this, 89, 385, textureX, textureY); // Box 168
		bodyModel[1100] = new ModelRendererTurbo(this, 97, 385, textureX, textureY); // Box 168
		bodyModel[1101] = new ModelRendererTurbo(this, 105, 385, textureX, textureY); // Box 168
		bodyModel[1102] = new ModelRendererTurbo(this, 113, 385, textureX, textureY); // Box 168
		bodyModel[1103] = new ModelRendererTurbo(this, 121, 385, textureX, textureY); // Box 168
		bodyModel[1104] = new ModelRendererTurbo(this, 129, 385, textureX, textureY); // Box 168
		bodyModel[1105] = new ModelRendererTurbo(this, 137, 385, textureX, textureY); // Box 168
		bodyModel[1106] = new ModelRendererTurbo(this, 145, 385, textureX, textureY); // Box 168
		bodyModel[1107] = new ModelRendererTurbo(this, 153, 385, textureX, textureY); // Box 168
		bodyModel[1108] = new ModelRendererTurbo(this, 161, 385, textureX, textureY); // Box 168
		bodyModel[1109] = new ModelRendererTurbo(this, 169, 385, textureX, textureY); // Box 168
		bodyModel[1110] = new ModelRendererTurbo(this, 177, 385, textureX, textureY); // Box 168
		bodyModel[1111] = new ModelRendererTurbo(this, 185, 385, textureX, textureY); // Box 168
		bodyModel[1112] = new ModelRendererTurbo(this, 193, 385, textureX, textureY); // Box 168
		bodyModel[1113] = new ModelRendererTurbo(this, 201, 385, textureX, textureY); // Box 168
		bodyModel[1114] = new ModelRendererTurbo(this, 209, 385, textureX, textureY); // Box 168
		bodyModel[1115] = new ModelRendererTurbo(this, 217, 385, textureX, textureY); // Box 168
		bodyModel[1116] = new ModelRendererTurbo(this, 225, 385, textureX, textureY); // Box 168
		bodyModel[1117] = new ModelRendererTurbo(this, 233, 385, textureX, textureY); // Box 168
		bodyModel[1118] = new ModelRendererTurbo(this, 233, 385, textureX, textureY); // Lamp
		bodyModel[1119] = new ModelRendererTurbo(this, 425, 353, textureX, textureY); // Lamp
		bodyModel[1120] = new ModelRendererTurbo(this, 241, 361, textureX, textureY); // Lamp
		bodyModel[1121] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Lamp
		bodyModel[1122] = new ModelRendererTurbo(this, 337, 353, textureX, textureY); // Lamp
		bodyModel[1123] = new ModelRendererTurbo(this, 457, 361, textureX, textureY); // Lamp
		bodyModel[1124] = new ModelRendererTurbo(this, 169, 369, textureX, textureY); // Lamp
		bodyModel[1125] = new ModelRendererTurbo(this, 249, 385, textureX, textureY); // Lamp
		bodyModel[1126] = new ModelRendererTurbo(this, 257, 385, textureX, textureY); // Lamp
		bodyModel[1127] = new ModelRendererTurbo(this, 265, 385, textureX, textureY); // Lamp
		bodyModel[1128] = new ModelRendererTurbo(this, 273, 385, textureX, textureY); // Lamp
		bodyModel[1129] = new ModelRendererTurbo(this, 281, 385, textureX, textureY); // Lamp
		bodyModel[1130] = new ModelRendererTurbo(this, 289, 385, textureX, textureY); // Lamp
		bodyModel[1131] = new ModelRendererTurbo(this, 81, 369, textureX, textureY); // Lamp
		bodyModel[1132] = new ModelRendererTurbo(this, 313, 385, textureX, textureY); // Lamp
		bodyModel[1133] = new ModelRendererTurbo(this, 305, 385, textureX, textureY); // Lamp
		bodyModel[1134] = new ModelRendererTurbo(this, 329, 385, textureX, textureY); // Lamp
		bodyModel[1135] = new ModelRendererTurbo(this, 337, 385, textureX, textureY); // Lamp
		bodyModel[1136] = new ModelRendererTurbo(this, 345, 385, textureX, textureY); // Lamp
		bodyModel[1137] = new ModelRendererTurbo(this, 353, 385, textureX, textureY); // Lamp
		bodyModel[1138] = new ModelRendererTurbo(this, 361, 385, textureX, textureY); // Lamp
		bodyModel[1139] = new ModelRendererTurbo(this, 369, 385, textureX, textureY); // Lamp
		bodyModel[1140] = new ModelRendererTurbo(this, 377, 385, textureX, textureY); // Lamp
		bodyModel[1141] = new ModelRendererTurbo(this, 385, 385, textureX, textureY); // Lamp
		bodyModel[1142] = new ModelRendererTurbo(this, 393, 385, textureX, textureY); // Du loco part28
		bodyModel[1143] = new ModelRendererTurbo(this, 289, 385, textureX, textureY); // Du loco part28
		bodyModel[1144] = new ModelRendererTurbo(this, 313, 385, textureX, textureY); // Du loco part28
		bodyModel[1145] = new ModelRendererTurbo(this, 401, 385, textureX, textureY); // Du loco part28
		bodyModel[1146] = new ModelRendererTurbo(this, 145, 265, textureX, textureY); // Du loco part37
		bodyModel[1147] = new ModelRendererTurbo(this, 409, 385, textureX, textureY); // Du loco part37
		bodyModel[1148] = new ModelRendererTurbo(this, 417, 385, textureX, textureY); // Du loco part37
		bodyModel[1149] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Du loco part37
		bodyModel[1150] = new ModelRendererTurbo(this, 425, 385, textureX, textureY); // Du loco part37
		bodyModel[1151] = new ModelRendererTurbo(this, 433, 385, textureX, textureY); // Du loco part37
		bodyModel[1152] = new ModelRendererTurbo(this, 441, 385, textureX, textureY); // Du loco part28
		bodyModel[1153] = new ModelRendererTurbo(this, 449, 385, textureX, textureY); // Du loco part28
		bodyModel[1154] = new ModelRendererTurbo(this, 465, 385, textureX, textureY); // Du loco part28
		bodyModel[1155] = new ModelRendererTurbo(this, 465, 385, textureX, textureY); // Du loco part28
		bodyModel[1156] = new ModelRendererTurbo(this, 481, 385, textureX, textureY); // Du loco part28
		bodyModel[1157] = new ModelRendererTurbo(this, 481, 385, textureX, textureY); // Du loco part28
		bodyModel[1158] = new ModelRendererTurbo(this, 497, 385, textureX, textureY); // Du loco part28
		bodyModel[1159] = new ModelRendererTurbo(this, 505, 385, textureX, textureY); // Du loco part28
		bodyModel[1160] = new ModelRendererTurbo(this, 1, 393, textureX, textureY); // Du loco part28
		bodyModel[1161] = new ModelRendererTurbo(this, 9, 393, textureX, textureY); // Du loco part28
		bodyModel[1162] = new ModelRendererTurbo(this, 17, 393, textureX, textureY); // Du loco part28
		bodyModel[1163] = new ModelRendererTurbo(this, 25, 393, textureX, textureY); // Du loco part28
		bodyModel[1164] = new ModelRendererTurbo(this, 9, 281, textureX, textureY); // Du loco part28
		bodyModel[1165] = new ModelRendererTurbo(this, 41, 393, textureX, textureY); // Du loco part28
		bodyModel[1166] = new ModelRendererTurbo(this, 49, 393, textureX, textureY); // Du loco part28
		bodyModel[1167] = new ModelRendererTurbo(this, 57, 393, textureX, textureY); // Du loco part28
		bodyModel[1168] = new ModelRendererTurbo(this, 65, 393, textureX, textureY); // Du loco part28
		bodyModel[1169] = new ModelRendererTurbo(this, 73, 393, textureX, textureY); // Du loco part28
		bodyModel[1170] = new ModelRendererTurbo(this, 81, 393, textureX, textureY); // Du loco part28
		bodyModel[1171] = new ModelRendererTurbo(this, 97, 393, textureX, textureY); // Du loco part28
		bodyModel[1172] = new ModelRendererTurbo(this, 97, 393, textureX, textureY); // Du loco part28
		bodyModel[1173] = new ModelRendererTurbo(this, 113, 393, textureX, textureY); // Du loco part28
		bodyModel[1174] = new ModelRendererTurbo(this, 113, 393, textureX, textureY); // Du loco part28
		bodyModel[1175] = new ModelRendererTurbo(this, 129, 393, textureX, textureY); // Du loco part28
		bodyModel[1176] = new ModelRendererTurbo(this, 137, 393, textureX, textureY); // Du loco part28
		bodyModel[1177] = new ModelRendererTurbo(this, 145, 393, textureX, textureY); // Du loco part28
		bodyModel[1178] = new ModelRendererTurbo(this, 153, 393, textureX, textureY); // Du loco part28
		bodyModel[1179] = new ModelRendererTurbo(this, 161, 393, textureX, textureY); // Du loco part28
		bodyModel[1180] = new ModelRendererTurbo(this, 169, 393, textureX, textureY); // Du loco part28
		bodyModel[1181] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Du loco part28
		bodyModel[1182] = new ModelRendererTurbo(this, 185, 393, textureX, textureY); // Du loco part28
		bodyModel[1183] = new ModelRendererTurbo(this, 193, 393, textureX, textureY); // Du loco part28
		bodyModel[1184] = new ModelRendererTurbo(this, 201, 393, textureX, textureY); // Du loco part28
		bodyModel[1185] = new ModelRendererTurbo(this, 217, 393, textureX, textureY); // Du loco part28
		bodyModel[1186] = new ModelRendererTurbo(this, 233, 393, textureX, textureY); // Du loco part28
		bodyModel[1187] = new ModelRendererTurbo(this, 241, 393, textureX, textureY); // Du loco part28
		bodyModel[1188] = new ModelRendererTurbo(this, 249, 393, textureX, textureY); // Du loco part28
		bodyModel[1189] = new ModelRendererTurbo(this, 265, 393, textureX, textureY); // Du loco part28
		bodyModel[1190] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Du loco part28
		bodyModel[1191] = new ModelRendererTurbo(this, 289, 393, textureX, textureY); // Du loco part28
		bodyModel[1192] = new ModelRendererTurbo(this, 297, 393, textureX, textureY); // Du loco part28
		bodyModel[1193] = new ModelRendererTurbo(this, 313, 393, textureX, textureY); // Du loco part28
		bodyModel[1194] = new ModelRendererTurbo(this, 329, 393, textureX, textureY); // Du loco part28
		bodyModel[1195] = new ModelRendererTurbo(this, 337, 393, textureX, textureY); // Du loco part28
		bodyModel[1196] = new ModelRendererTurbo(this, 345, 393, textureX, textureY); // Du loco part28
		bodyModel[1197] = new ModelRendererTurbo(this, 361, 393, textureX, textureY); // Du loco part28
		bodyModel[1198] = new ModelRendererTurbo(this, 377, 393, textureX, textureY); // Du loco part28
		bodyModel[1199] = new ModelRendererTurbo(this, 385, 393, textureX, textureY); // Du loco part28
		bodyModel[1200] = new ModelRendererTurbo(this, 401, 393, textureX, textureY); // Du loco part28
		bodyModel[1201] = new ModelRendererTurbo(this, 417, 393, textureX, textureY); // Du loco part28
		bodyModel[1202] = new ModelRendererTurbo(this, 433, 393, textureX, textureY); // Du loco part28
		bodyModel[1203] = new ModelRendererTurbo(this, 449, 393, textureX, textureY); // Du loco part28
		bodyModel[1204] = new ModelRendererTurbo(this, 41, 281, textureX, textureY); // Du loco part28
		bodyModel[1205] = new ModelRendererTurbo(this, 57, 281, textureX, textureY); // Du loco part28
		bodyModel[1206] = new ModelRendererTurbo(this, 465, 393, textureX, textureY); // Du loco part28
		bodyModel[1207] = new ModelRendererTurbo(this, 481, 393, textureX, textureY); // Du loco part28
		bodyModel[1208] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Du loco part28
		bodyModel[1209] = new ModelRendererTurbo(this, 273, 289, textureX, textureY); // Du loco part28
		bodyModel[1210] = new ModelRendererTurbo(this, 289, 289, textureX, textureY); // Du loco part28
		bodyModel[1211] = new ModelRendererTurbo(this, 305, 289, textureX, textureY); // Du loco part28
		bodyModel[1212] = new ModelRendererTurbo(this, 321, 289, textureX, textureY); // Du loco part28
		bodyModel[1213] = new ModelRendererTurbo(this, 505, 393, textureX, textureY); // Du loco part28
		bodyModel[1214] = new ModelRendererTurbo(this, 17, 401, textureX, textureY); // Du loco part28
		bodyModel[1215] = new ModelRendererTurbo(this, 25, 401, textureX, textureY); // Du loco part28
		bodyModel[1216] = new ModelRendererTurbo(this, 49, 401, textureX, textureY); // Du loco part28
		bodyModel[1217] = new ModelRendererTurbo(this, 65, 401, textureX, textureY); // Du loco part28
		bodyModel[1218] = new ModelRendererTurbo(this, 81, 401, textureX, textureY); // Du loco part28
		bodyModel[1219] = new ModelRendererTurbo(this, 337, 289, textureX, textureY); // Du loco part28
		bodyModel[1220] = new ModelRendererTurbo(this, 353, 289, textureX, textureY); // Du loco part28
		bodyModel[1221] = new ModelRendererTurbo(this, 97, 401, textureX, textureY); // Du loco part28
		bodyModel[1222] = new ModelRendererTurbo(this, 113, 401, textureX, textureY); // Du loco part28
		bodyModel[1223] = new ModelRendererTurbo(this, 137, 401, textureX, textureY); // Du loco part28
		bodyModel[1224] = new ModelRendererTurbo(this, 369, 289, textureX, textureY); // Du loco part28
		bodyModel[1225] = new ModelRendererTurbo(this, 305, 305, textureX, textureY); // Du loco part28
		bodyModel[1226] = new ModelRendererTurbo(this, 321, 305, textureX, textureY); // Du loco part28
		bodyModel[1227] = new ModelRendererTurbo(this, 337, 305, textureX, textureY); // Du loco part28
		bodyModel[1228] = new ModelRendererTurbo(this, 153, 401, textureX, textureY); // Du loco part28
		bodyModel[1229] = new ModelRendererTurbo(this, 169, 401, textureX, textureY); // Du loco part28
		bodyModel[1230] = new ModelRendererTurbo(this, 185, 401, textureX, textureY); // Du loco part28
		bodyModel[1231] = new ModelRendererTurbo(this, 353, 305, textureX, textureY); // Du loco part28
		bodyModel[1232] = new ModelRendererTurbo(this, 369, 305, textureX, textureY); // Du loco part28
		bodyModel[1233] = new ModelRendererTurbo(this, 201, 401, textureX, textureY); // Du loco part28
		bodyModel[1234] = new ModelRendererTurbo(this, 217, 401, textureX, textureY); // Du loco part28
		bodyModel[1235] = new ModelRendererTurbo(this, 233, 401, textureX, textureY); // Du loco part28
		bodyModel[1236] = new ModelRendererTurbo(this, 385, 305, textureX, textureY); // Du loco part28
		bodyModel[1237] = new ModelRendererTurbo(this, 401, 305, textureX, textureY); // Du loco part28
		bodyModel[1238] = new ModelRendererTurbo(this, 249, 401, textureX, textureY); // Du loco part28
		bodyModel[1239] = new ModelRendererTurbo(this, 73, 321, textureX, textureY); // Du loco part28
		bodyModel[1240] = new ModelRendererTurbo(this, 161, 321, textureX, textureY); // Du loco part28
		bodyModel[1241] = new ModelRendererTurbo(this, 265, 401, textureX, textureY); // Du loco part28
		bodyModel[1242] = new ModelRendererTurbo(this, 281, 401, textureX, textureY); // Du loco part28
		bodyModel[1243] = new ModelRendererTurbo(this, 297, 401, textureX, textureY); // Du loco part28
		bodyModel[1244] = new ModelRendererTurbo(this, 177, 321, textureX, textureY); // Du loco part28
		bodyModel[1245] = new ModelRendererTurbo(this, 193, 321, textureX, textureY); // Du loco part28
		bodyModel[1246] = new ModelRendererTurbo(this, 313, 401, textureX, textureY); // Du loco part28
		bodyModel[1247] = new ModelRendererTurbo(this, 329, 401, textureX, textureY); // Du loco part28
		bodyModel[1248] = new ModelRendererTurbo(this, 345, 401, textureX, textureY); // Du loco part28
		bodyModel[1249] = new ModelRendererTurbo(this, 209, 321, textureX, textureY); // Du loco part28
		bodyModel[1250] = new ModelRendererTurbo(this, 225, 321, textureX, textureY); // Du loco part28
		bodyModel[1251] = new ModelRendererTurbo(this, 361, 401, textureX, textureY); // Du loco part28
		bodyModel[1252] = new ModelRendererTurbo(this, 241, 321, textureX, textureY); // Du loco part28
		bodyModel[1253] = new ModelRendererTurbo(this, 209, 393, textureX, textureY); // Du loco part28
		bodyModel[1254] = new ModelRendererTurbo(this, 257, 393, textureX, textureY); // Du loco part28
		bodyModel[1255] = new ModelRendererTurbo(this, 305, 393, textureX, textureY); // Du loco part28
		bodyModel[1256] = new ModelRendererTurbo(this, 377, 401, textureX, textureY); // Du loco part28
		bodyModel[1257] = new ModelRendererTurbo(this, 385, 401, textureX, textureY); // Du loco part28
		bodyModel[1258] = new ModelRendererTurbo(this, 393, 401, textureX, textureY); // Du loco part28
		bodyModel[1259] = new ModelRendererTurbo(this, 409, 401, textureX, textureY); // Du loco part28
		bodyModel[1260] = new ModelRendererTurbo(this, 425, 401, textureX, textureY); // Du loco part28
		bodyModel[1261] = new ModelRendererTurbo(this, 441, 401, textureX, textureY); // Du loco part28
		bodyModel[1262] = new ModelRendererTurbo(this, 353, 393, textureX, textureY); // Du loco part28
		bodyModel[1263] = new ModelRendererTurbo(this, 409, 393, textureX, textureY); // Du loco part28
		bodyModel[1264] = new ModelRendererTurbo(this, 457, 401, textureX, textureY); // Du loco part28
		bodyModel[1265] = new ModelRendererTurbo(this, 473, 401, textureX, textureY); // Du loco part28
		bodyModel[1266] = new ModelRendererTurbo(this, 489, 401, textureX, textureY); // Du loco part28
		bodyModel[1267] = new ModelRendererTurbo(this, 33, 401, textureX, textureY); // Du loco part28
		bodyModel[1268] = new ModelRendererTurbo(this, 57, 401, textureX, textureY); // Du loco part28
		bodyModel[1269] = new ModelRendererTurbo(this, 89, 401, textureX, textureY); // Du loco part28
		bodyModel[1270] = new ModelRendererTurbo(this, 121, 401, textureX, textureY); // Du loco part28
		bodyModel[1271] = new ModelRendererTurbo(this, 505, 401, textureX, textureY); // Du loco part28
		bodyModel[1272] = new ModelRendererTurbo(this, 1, 409, textureX, textureY); // Du loco part28
		bodyModel[1273] = new ModelRendererTurbo(this, 9, 409, textureX, textureY); // Du loco part28
		bodyModel[1274] = new ModelRendererTurbo(this, 25, 409, textureX, textureY); // Du loco part28
		bodyModel[1275] = new ModelRendererTurbo(this, 41, 409, textureX, textureY); // Du loco part28
		bodyModel[1276] = new ModelRendererTurbo(this, 57, 409, textureX, textureY); // Du loco part28
		bodyModel[1277] = new ModelRendererTurbo(this, 145, 401, textureX, textureY); // Du loco part28
		bodyModel[1278] = new ModelRendererTurbo(this, 161, 401, textureX, textureY); // Du loco part28
		bodyModel[1279] = new ModelRendererTurbo(this, 73, 409, textureX, textureY); // Du loco part28
		bodyModel[1280] = new ModelRendererTurbo(this, 89, 409, textureX, textureY); // Du loco part28
		bodyModel[1281] = new ModelRendererTurbo(this, 105, 409, textureX, textureY); // Du loco part28
		bodyModel[1282] = new ModelRendererTurbo(this, 177, 401, textureX, textureY); // Du loco part28
		bodyModel[1283] = new ModelRendererTurbo(this, 193, 401, textureX, textureY); // Du loco part28
		bodyModel[1284] = new ModelRendererTurbo(this, 209, 401, textureX, textureY); // Du loco part28
		bodyModel[1285] = new ModelRendererTurbo(this, 225, 401, textureX, textureY); // Du loco part28
		bodyModel[1286] = new ModelRendererTurbo(this, 121, 409, textureX, textureY); // Du loco part28
		bodyModel[1287] = new ModelRendererTurbo(this, 137, 409, textureX, textureY); // Du loco part28
		bodyModel[1288] = new ModelRendererTurbo(this, 153, 409, textureX, textureY); // Du loco part28
		bodyModel[1289] = new ModelRendererTurbo(this, 241, 401, textureX, textureY); // Du loco part28
		bodyModel[1290] = new ModelRendererTurbo(this, 257, 401, textureX, textureY); // Du loco part28
		bodyModel[1291] = new ModelRendererTurbo(this, 169, 409, textureX, textureY); // Du loco part28
		bodyModel[1292] = new ModelRendererTurbo(this, 185, 409, textureX, textureY); // Du loco part28
		bodyModel[1293] = new ModelRendererTurbo(this, 201, 409, textureX, textureY); // Du loco part28
		bodyModel[1294] = new ModelRendererTurbo(this, 273, 401, textureX, textureY); // Du loco part28
		bodyModel[1295] = new ModelRendererTurbo(this, 289, 401, textureX, textureY); // Du loco part28
		bodyModel[1296] = new ModelRendererTurbo(this, 217, 409, textureX, textureY); // Du loco part28
		bodyModel[1297] = new ModelRendererTurbo(this, 305, 401, textureX, textureY); // Du loco part28
		bodyModel[1298] = new ModelRendererTurbo(this, 321, 401, textureX, textureY); // Du loco part28
		bodyModel[1299] = new ModelRendererTurbo(this, 233, 409, textureX, textureY); // Du loco part28
		bodyModel[1300] = new ModelRendererTurbo(this, 249, 409, textureX, textureY); // Du loco part28
		bodyModel[1301] = new ModelRendererTurbo(this, 265, 409, textureX, textureY); // Du loco part28
		bodyModel[1302] = new ModelRendererTurbo(this, 337, 401, textureX, textureY); // Du loco part28
		bodyModel[1303] = new ModelRendererTurbo(this, 353, 401, textureX, textureY); // Du loco part28
		bodyModel[1304] = new ModelRendererTurbo(this, 281, 409, textureX, textureY); // Du loco part28
		bodyModel[1305] = new ModelRendererTurbo(this, 297, 409, textureX, textureY); // Du loco part28
		bodyModel[1306] = new ModelRendererTurbo(this, 313, 409, textureX, textureY); // Du loco part28
		bodyModel[1307] = new ModelRendererTurbo(this, 401, 401, textureX, textureY); // Du loco part28
		bodyModel[1308] = new ModelRendererTurbo(this, 433, 401, textureX, textureY); // Du loco part28
		bodyModel[1309] = new ModelRendererTurbo(this, 329, 409, textureX, textureY); // Du loco part28
		bodyModel[1310] = new ModelRendererTurbo(this, 449, 401, textureX, textureY); // Du loco part28
		bodyModel[1311] = new ModelRendererTurbo(this, 465, 401, textureX, textureY); // Du loco part28
		bodyModel[1312] = new ModelRendererTurbo(this, 481, 401, textureX, textureY); // Du loco part28
		bodyModel[1313] = new ModelRendererTurbo(this, 17, 409, textureX, textureY); // Du loco part28
		bodyModel[1314] = new ModelRendererTurbo(this, 345, 409, textureX, textureY); // Box 135
		bodyModel[1315] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 0
		bodyModel[1316] = new ModelRendererTurbo(this, 337, 249, textureX, textureY); // Box 0
		bodyModel[1317] = new ModelRendererTurbo(this, 353, 249, textureX, textureY); // Box 0
		bodyModel[1318] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 0
		bodyModel[1319] = new ModelRendererTurbo(this, 97, 273, textureX, textureY); // Box 0
		bodyModel[1320] = new ModelRendererTurbo(this, 241, 273, textureX, textureY); // Box 0
		bodyModel[1321] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Box 0
		bodyModel[1322] = new ModelRendererTurbo(this, 177, 289, textureX, textureY); // Box 0
		bodyModel[1323] = new ModelRendererTurbo(this, 385, 289, textureX, textureY); // Box 0
		bodyModel[1324] = new ModelRendererTurbo(this, 489, 297, textureX, textureY); // Box 0
		bodyModel[1325] = new ModelRendererTurbo(this, 97, 305, textureX, textureY); // Box 0
		bodyModel[1326] = new ModelRendererTurbo(this, 145, 305, textureX, textureY); // Box 0
		bodyModel[1327] = new ModelRendererTurbo(this, 41, 321, textureX, textureY); // Box 0
		bodyModel[1328] = new ModelRendererTurbo(this, 257, 321, textureX, textureY); // Box 0
		bodyModel[1329] = new ModelRendererTurbo(this, 281, 361, textureX, textureY); // Box 0
		bodyModel[1330] = new ModelRendererTurbo(this, 289, 369, textureX, textureY); // Box 0
		bodyModel[1331] = new ModelRendererTurbo(this, 33, 409, textureX, textureY); // Box 0
		bodyModel[1332] = new ModelRendererTurbo(this, 65, 409, textureX, textureY); // Box 0
		bodyModel[1333] = new ModelRendererTurbo(this, 97, 409, textureX, textureY); // Box 0
		bodyModel[1334] = new ModelRendererTurbo(this, 113, 409, textureX, textureY); // Box 0
		bodyModel[1335] = new ModelRendererTurbo(this, 257, 489, textureX, textureY); // Du loco part28
		bodyModel[1336] = new ModelRendererTurbo(this, 257, 483, textureX, textureY); // Du loco part28
		bodyModel[1337] = new ModelRendererTurbo(this, 257, 477, textureX, textureY); // Du loco part28
		bodyModel[1338] = new ModelRendererTurbo(this, 257, 471, textureX, textureY); // Du loco part28
		bodyModel[1339] = new ModelRendererTurbo(this, 257, 465, textureX, textureY); // Du loco part28
		bodyModel[1340] = new ModelRendererTurbo(this, 257, 459, textureX, textureY); // Du loco part28
		bodyModel[1341] = new ModelRendererTurbo(this, 257, 453, textureX, textureY); // Du loco part28
		bodyModel[1342] = new ModelRendererTurbo(this, 257, 447, textureX, textureY); // Du loco part28
		bodyModel[1343] = new ModelRendererTurbo(this, 257, 441, textureX, textureY); // Du loco part28
		bodyModel[1344] = new ModelRendererTurbo(this, 257, 435, textureX, textureY); // Du loco part28
		bodyModel[1345] = new ModelRendererTurbo(this, 257, 429, textureX, textureY); // Du loco part28
		bodyModel[1346] = new ModelRendererTurbo(this, 257, 423, textureX, textureY); // Du loco part28
		bodyModel[1347] = new ModelRendererTurbo(this, 258, 416, textureX, textureY); // Du loco part28
		bodyModel[1348] = new ModelRendererTurbo(this, 273, 416, textureX, textureY); // Du loco part28
		bodyModel[1349] = new ModelRendererTurbo(this, 288, 416, textureX, textureY); // Du loco part28
		bodyModel[1350] = new ModelRendererTurbo(this, 295, 423, textureX, textureY); // Du loco part28
		bodyModel[1351] = new ModelRendererTurbo(this, 276, 423, textureX, textureY); // Du loco part28
		bodyModel[1352] = new ModelRendererTurbo(this, 257, 492, textureX, textureY); // Du loco part28
		bodyModel[1353] = new ModelRendererTurbo(this, 221, 427, textureX, textureY); // Du loco part28
		bodyModel[1354] = new ModelRendererTurbo(this, 257, 486, textureX, textureY); // Du loco part28
		bodyModel[1355] = new ModelRendererTurbo(this, 257, 480, textureX, textureY); // Du loco part28
		bodyModel[1356] = new ModelRendererTurbo(this, 257, 474, textureX, textureY); // Du loco part28
		bodyModel[1357] = new ModelRendererTurbo(this, 257, 468, textureX, textureY); // Du loco part28
		bodyModel[1358] = new ModelRendererTurbo(this, 257, 462, textureX, textureY); // Du loco part28
		bodyModel[1359] = new ModelRendererTurbo(this, 257, 456, textureX, textureY); // Du loco part28
		bodyModel[1360] = new ModelRendererTurbo(this, 257, 450, textureX, textureY); // Du loco part28
		bodyModel[1361] = new ModelRendererTurbo(this, 257, 444, textureX, textureY); // Du loco part28
		bodyModel[1362] = new ModelRendererTurbo(this, 257, 438, textureX, textureY); // Du loco part28
		bodyModel[1363] = new ModelRendererTurbo(this, 257, 432, textureX, textureY); // Du loco part28
		bodyModel[1364] = new ModelRendererTurbo(this, 292, 432, textureX, textureY); // Du loco part28
		bodyModel[1365] = new ModelRendererTurbo(this, 257, 426, textureX, textureY); // Du loco part28
		bodyModel[1366] = new ModelRendererTurbo(this, 221, 415, textureX, textureY); // Du loco part28
		bodyModel[1367] = new ModelRendererTurbo(this, 221, 418, textureX, textureY); // Du loco part28
		bodyModel[1368] = new ModelRendererTurbo(this, 221, 424, textureX, textureY); // Du loco part28
		bodyModel[1369] = new ModelRendererTurbo(this, 221, 421, textureX, textureY); // Du loco part28
		bodyModel[1370] = new ModelRendererTurbo(this, 292, 426, textureX, textureY); // Du loco part28
		bodyModel[1371] = new ModelRendererTurbo(this, 219, 479, textureX, textureY); // Du loco part28
		bodyModel[1372] = new ModelRendererTurbo(this, 219, 467, textureX, textureY); // Du loco part28
		bodyModel[1373] = new ModelRendererTurbo(this, 219, 470, textureX, textureY); // Du loco part28
		bodyModel[1374] = new ModelRendererTurbo(this, 219, 476, textureX, textureY); // Du loco part28
		bodyModel[1375] = new ModelRendererTurbo(this, 219, 473, textureX, textureY); // Du loco part28
		bodyModel[1376] = new ModelRendererTurbo(this, 327, 426, textureX, textureY); // Du loco part28
		bodyModel[1377] = new ModelRendererTurbo(this, 238, 433, textureX, textureY); // Du loco part28
		bodyModel[1378] = new ModelRendererTurbo(this, 238, 463, textureX, textureY); // Du loco part28
		bodyModel[1379] = new ModelRendererTurbo(this, 238, 457, textureX, textureY); // Du loco part28
		bodyModel[1380] = new ModelRendererTurbo(this, 238, 451, textureX, textureY); // Du loco part28
		bodyModel[1381] = new ModelRendererTurbo(this, 238, 445, textureX, textureY); // Du loco part28
		bodyModel[1382] = new ModelRendererTurbo(this, 238, 439, textureX, textureY); // Du loco part28
		bodyModel[1383] = new ModelRendererTurbo(this, 238, 430, textureX, textureY); // Du loco part28
		bodyModel[1384] = new ModelRendererTurbo(this, 238, 460, textureX, textureY); // Du loco part28
		bodyModel[1385] = new ModelRendererTurbo(this, 238, 454, textureX, textureY); // Du loco part28
		bodyModel[1386] = new ModelRendererTurbo(this, 238, 448, textureX, textureY); // Du loco part28
		bodyModel[1387] = new ModelRendererTurbo(this, 238, 442, textureX, textureY); // Du loco part28
		bodyModel[1388] = new ModelRendererTurbo(this, 238, 436, textureX, textureY); // Du loco part28
		bodyModel[1389] = new ModelRendererTurbo(this, 220, 430, textureX, textureY); // Du loco part28
		bodyModel[1390] = new ModelRendererTurbo(this, 221, 445, textureX, textureY); // Du loco part28
		bodyModel[1391] = new ModelRendererTurbo(this, 221, 442, textureX, textureY); // Du loco part28
		bodyModel[1392] = new ModelRendererTurbo(this, 221, 439, textureX, textureY); // Du loco part28
		bodyModel[1393] = new ModelRendererTurbo(this, 220, 436, textureX, textureY); // Du loco part28
		bodyModel[1394] = new ModelRendererTurbo(this, 220, 433, textureX, textureY); // Du loco part28
		bodyModel[1395] = new ModelRendererTurbo(this, 1, 415, textureX, textureY); // Du loco part28
		bodyModel[1396] = new ModelRendererTurbo(this, 1, 418, textureX, textureY); // Du loco part28
		bodyModel[1397] = new ModelRendererTurbo(this, 1, 421, textureX, textureY); // Du loco part28
		bodyModel[1398] = new ModelRendererTurbo(this, 1, 424, textureX, textureY); // Du loco part28
		bodyModel[1399] = new ModelRendererTurbo(this, 1, 427, textureX, textureY); // Du loco part28
		bodyModel[1400] = new ModelRendererTurbo(this, 1, 430, textureX, textureY); // Du loco part28
		bodyModel[1401] = new ModelRendererTurbo(this, 1, 433, textureX, textureY); // Du loco part28
		bodyModel[1402] = new ModelRendererTurbo(this, 1, 436, textureX, textureY); // Du loco part28
		bodyModel[1403] = new ModelRendererTurbo(this, 1, 439, textureX, textureY); // Du loco part28
		bodyModel[1404] = new ModelRendererTurbo(this, 1, 442, textureX, textureY); // Du loco part28
		bodyModel[1405] = new ModelRendererTurbo(this, 1, 445, textureX, textureY); // Du loco part28
		bodyModel[1406] = new ModelRendererTurbo(this, 257, 420, textureX, textureY); // Du loco part28
		bodyModel[1407] = new ModelRendererTurbo(this, 258, 413, textureX, textureY); // Du loco part28
		bodyModel[1408] = new ModelRendererTurbo(this, 273, 413, textureX, textureY); // Du loco part28
		bodyModel[1409] = new ModelRendererTurbo(this, 288, 413, textureX, textureY); // Du loco part28
		bodyModel[1410] = new ModelRendererTurbo(this, 295, 420, textureX, textureY); // Du loco part28
		bodyModel[1411] = new ModelRendererTurbo(this, 276, 420, textureX, textureY); // Du loco part28
		bodyModel[1412] = new ModelRendererTurbo(this, 1, 448, textureX, textureY); // Du loco part28
		bodyModel[1413] = new ModelRendererTurbo(this, 151, 442, textureX, textureY); // Du loco part28
		bodyModel[1414] = new ModelRendererTurbo(this, 116, 415, textureX, textureY); // Du loco part28
		bodyModel[1415] = new ModelRendererTurbo(this, 116, 418, textureX, textureY); // Du loco part28
		bodyModel[1416] = new ModelRendererTurbo(this, 116, 421, textureX, textureY); // Du loco part28
		bodyModel[1417] = new ModelRendererTurbo(this, 116, 424, textureX, textureY); // Du loco part28
		bodyModel[1418] = new ModelRendererTurbo(this, 116, 427, textureX, textureY); // Du loco part28
		bodyModel[1419] = new ModelRendererTurbo(this, 116, 430, textureX, textureY); // Du loco part28
		bodyModel[1420] = new ModelRendererTurbo(this, 116, 433, textureX, textureY); // Du loco part28
		bodyModel[1421] = new ModelRendererTurbo(this, 116, 436, textureX, textureY); // Du loco part28
		bodyModel[1422] = new ModelRendererTurbo(this, 116, 439, textureX, textureY); // Du loco part28
		bodyModel[1423] = new ModelRendererTurbo(this, 116, 442, textureX, textureY); // Du loco part28
		bodyModel[1424] = new ModelRendererTurbo(this, 116, 445, textureX, textureY); // Du loco part28
		bodyModel[1425] = new ModelRendererTurbo(this, 116, 448, textureX, textureY); // Du loco part28
		bodyModel[1426] = new ModelRendererTurbo(this, 151, 418, textureX, textureY); // Du loco part28
		bodyModel[1427] = new ModelRendererTurbo(this, 151, 424, textureX, textureY); // Du loco part28
		bodyModel[1428] = new ModelRendererTurbo(this, 151, 436, textureX, textureY); // Du loco part28
		bodyModel[1429] = new ModelRendererTurbo(this, 151, 430, textureX, textureY); // Du loco part28
		bodyModel[1430] = new ModelRendererTurbo(this, 151, 445, textureX, textureY); // Du loco part28
		bodyModel[1431] = new ModelRendererTurbo(this, 151, 439, textureX, textureY); // Du loco part28
		bodyModel[1432] = new ModelRendererTurbo(this, 151, 415, textureX, textureY); // Du loco part28
		bodyModel[1433] = new ModelRendererTurbo(this, 151, 421, textureX, textureY); // Du loco part28
		bodyModel[1434] = new ModelRendererTurbo(this, 151, 433, textureX, textureY); // Du loco part28
		bodyModel[1435] = new ModelRendererTurbo(this, 151, 427, textureX, textureY); // Du loco part28
		bodyModel[1436] = new ModelRendererTurbo(this, 151, 448, textureX, textureY); // Du loco part28
		bodyModel[1437] = new ModelRendererTurbo(this, 186, 436, textureX, textureY); // Du loco part28
		bodyModel[1438] = new ModelRendererTurbo(this, 186, 463, textureX, textureY); // Du loco part28
		bodyModel[1439] = new ModelRendererTurbo(this, 186, 457, textureX, textureY); // Du loco part28
		bodyModel[1440] = new ModelRendererTurbo(this, 186, 451, textureX, textureY); // Du loco part28
		bodyModel[1441] = new ModelRendererTurbo(this, 186, 445, textureX, textureY); // Du loco part28
		bodyModel[1442] = new ModelRendererTurbo(this, 186, 466, textureX, textureY); // Du loco part28
		bodyModel[1443] = new ModelRendererTurbo(this, 186, 433, textureX, textureY); // Du loco part28
		bodyModel[1444] = new ModelRendererTurbo(this, 186, 460, textureX, textureY); // Du loco part28
		bodyModel[1445] = new ModelRendererTurbo(this, 186, 454, textureX, textureY); // Du loco part28
		bodyModel[1446] = new ModelRendererTurbo(this, 186, 448, textureX, textureY); // Du loco part28
		bodyModel[1447] = new ModelRendererTurbo(this, 186, 442, textureX, textureY); // Du loco part28
		bodyModel[1448] = new ModelRendererTurbo(this, 186, 439, textureX, textureY); // Du loco part28
		bodyModel[1449] = new ModelRendererTurbo(this, 186, 415, textureX, textureY); // Du loco part28
		bodyModel[1450] = new ModelRendererTurbo(this, 186, 430, textureX, textureY); // Du loco part28
		bodyModel[1451] = new ModelRendererTurbo(this, 186, 427, textureX, textureY); // Du loco part28
		bodyModel[1452] = new ModelRendererTurbo(this, 186, 424, textureX, textureY); // Du loco part28
		bodyModel[1453] = new ModelRendererTurbo(this, 186, 421, textureX, textureY); // Du loco part28
		bodyModel[1454] = new ModelRendererTurbo(this, 186, 418, textureX, textureY); // Du loco part28
		bodyModel[1455] = new ModelRendererTurbo(this, 350, 409, textureX, textureY); // Box 135
		bodyModel[1456] = new ModelRendererTurbo(this, 355, 409, textureX, textureY); // Box 135
		bodyModel[1457] = new ModelRendererTurbo(this, 468, 60, textureX, textureY); // Du loco part28
		bodyModel[1458] = new ModelRendererTurbo(this, 475, 60, textureX, textureY); // Du loco part28
		bodyModel[1459] = new ModelRendererTurbo(this, 490, 66, textureX, textureY); // Du loco part28
		bodyModel[1460] = new ModelRendererTurbo(this, 495, 66, textureX, textureY); // Du loco part28
		bodyModel[1461] = new ModelRendererTurbo(this, 155, 364, textureX, textureY); // Lamp
		bodyModel[1462] = new ModelRendererTurbo(this, 168, 364, textureX, textureY); // Lamp
		bodyModel[1463] = new ModelRendererTurbo(this, 177, 364, textureX, textureY); // Lamp
		bodyModel[1464] = new ModelRendererTurbo(this, 217, 364, textureX, textureY); // Lamp
		bodyModel[1465] = new ModelRendererTurbo(this, 212, 364, textureX, textureY); // Lamp
		bodyModel[1466] = new ModelRendererTurbo(this, 207, 364, textureX, textureY); // Lamp
		bodyModel[1467] = new ModelRendererTurbo(this, 186, 363, textureX, textureY); // Lamp
		bodyModel[1468] = new ModelRendererTurbo(this, 200, 363, textureX, textureY); // Lamp
		bodyModel[1469] = new ModelRendererTurbo(this, 193, 363, textureX, textureY); // Lamp
		bodyModel[1470] = new ModelRendererTurbo(this, 155, 364, textureX, textureY); // Lamp
		bodyModel[1471] = new ModelRendererTurbo(this, 168, 364, textureX, textureY); // Lamp
		bodyModel[1472] = new ModelRendererTurbo(this, 177, 364, textureX, textureY); // Lamp
		bodyModel[1473] = new ModelRendererTurbo(this, 217, 366, textureX, textureY); // Lamp
		bodyModel[1474] = new ModelRendererTurbo(this, 212, 366, textureX, textureY); // Lamp
		bodyModel[1475] = new ModelRendererTurbo(this, 207, 366, textureX, textureY); // Lamp
		bodyModel[1476] = new ModelRendererTurbo(this, 222, 363, textureX, textureY); // Lamp
		bodyModel[1477] = new ModelRendererTurbo(this, 236, 363, textureX, textureY); // Lamp
		bodyModel[1478] = new ModelRendererTurbo(this, 229, 363, textureX, textureY); // Lamp
		bodyModel[1479] = new ModelRendererTurbo(this, 468, 60, textureX, textureY); // Du loco part28
		bodyModel[1480] = new ModelRendererTurbo(this, 475, 60, textureX, textureY); // Du loco part28
		bodyModel[1481] = new ModelRendererTurbo(this, 490, 66, textureX, textureY); // Du loco part28
		bodyModel[1482] = new ModelRendererTurbo(this, 495, 66, textureX, textureY); // Du loco part28
		bodyModel[1483] = new ModelRendererTurbo(this, 440, 35, textureX, textureY); // Du loco part28
		bodyModel[1484] = new ModelRendererTurbo(this, 447, 35, textureX, textureY); // Du loco part28
		bodyModel[1485] = new ModelRendererTurbo(this, 460, 34, textureX, textureY); // Du loco part28
		bodyModel[1486] = new ModelRendererTurbo(this, 466, 34, textureX, textureY); // Du loco part28
		bodyModel[1487] = new ModelRendererTurbo(this, 440, 35, textureX, textureY); // Du loco part28
		bodyModel[1488] = new ModelRendererTurbo(this, 447, 35, textureX, textureY); // Du loco part28
		bodyModel[1489] = new ModelRendererTurbo(this, 460, 34, textureX, textureY); // Du loco part28
		bodyModel[1490] = new ModelRendererTurbo(this, 466, 34, textureX, textureY); // Du loco part28
		bodyModel[1491] = new ModelRendererTurbo(this, 434, 22, textureX, textureY); // Du loco part28
		bodyModel[1492] = new ModelRendererTurbo(this, 441, 22, textureX, textureY); // Du loco part28
		bodyModel[1493] = new ModelRendererTurbo(this, 435, 14, textureX, textureY); // Du loco part28
		bodyModel[1494] = new ModelRendererTurbo(this, 459, 15, textureX, textureY); // Du loco part28
		bodyModel[1495] = new ModelRendererTurbo(this, 434, 22, textureX, textureY); // Du loco part28
		bodyModel[1496] = new ModelRendererTurbo(this, 441, 22, textureX, textureY); // Du loco part28
		bodyModel[1497] = new ModelRendererTurbo(this, 435, 14, textureX, textureY); // Du loco part28
		bodyModel[1498] = new ModelRendererTurbo(this, 434, 8, textureX, textureY); // Du loco part28
		bodyModel[1499] = new ModelRendererTurbo(this, 448, 22, textureX, textureY); // Du loco part28

		bodyModel[1000].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1000].setRotationPoint(18.25F, -32F, 10F);

		bodyModel[1001].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1001].setRotationPoint(18.75F, -32F, 10F);

		bodyModel[1002].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1002].setRotationPoint(19.25F, -32F, 10F);

		bodyModel[1003].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1003].setRotationPoint(20.25F, -32F, 10F);

		bodyModel[1004].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1004].setRotationPoint(20.75F, -32F, 10F);

		bodyModel[1005].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1005].setRotationPoint(19.75F, -32F, 10F);

		bodyModel[1006].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1006].setRotationPoint(21.25F, -32F, 10F);

		bodyModel[1007].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1007].setRotationPoint(21.75F, -32F, 10F);

		bodyModel[1008].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1008].setRotationPoint(22.25F, -32F, 10F);

		bodyModel[1009].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1009].setRotationPoint(23.25F, -32F, 10F);

		bodyModel[1010].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1010].setRotationPoint(23.75F, -32F, 10F);

		bodyModel[1011].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1011].setRotationPoint(22.75F, -32F, 10F);

		bodyModel[1012].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1012].setRotationPoint(24.25F, -32F, 10F);

		bodyModel[1013].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1013].setRotationPoint(24.75F, -32F, 10F);

		bodyModel[1014].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1014].setRotationPoint(25.25F, -32F, 10F);

		bodyModel[1015].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1015].setRotationPoint(25.75F, -32F, 10F);

		bodyModel[1016].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1016].setRotationPoint(68.25F, -32F, 10F);

		bodyModel[1017].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1017].setRotationPoint(68.75F, -32F, 10F);

		bodyModel[1018].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1018].setRotationPoint(69.25F, -32F, 10F);

		bodyModel[1019].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1019].setRotationPoint(70.25F, -32F, 10F);

		bodyModel[1020].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1020].setRotationPoint(70.75F, -32F, 10F);

		bodyModel[1021].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1021].setRotationPoint(69.75F, -32F, 10F);

		bodyModel[1022].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1022].setRotationPoint(71.25F, -32F, 10F);

		bodyModel[1023].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1023].setRotationPoint(71.75F, -32F, 10F);

		bodyModel[1024].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1024].setRotationPoint(72.25F, -32F, 10F);

		bodyModel[1025].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1025].setRotationPoint(73.25F, -32F, 10F);

		bodyModel[1026].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1026].setRotationPoint(73.75F, -32F, 10F);

		bodyModel[1027].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1027].setRotationPoint(72.75F, -32F, 10F);

		bodyModel[1028].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1028].setRotationPoint(74.25F, -32F, 10F);

		bodyModel[1029].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1029].setRotationPoint(74.75F, -32F, 10F);

		bodyModel[1030].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1030].setRotationPoint(75.25F, -32F, 10F);

		bodyModel[1031].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1031].setRotationPoint(76.25F, -32F, 10F);

		bodyModel[1032].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1032].setRotationPoint(76.75F, -32F, 10F);

		bodyModel[1033].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1033].setRotationPoint(75.75F, -32F, 10F);

		bodyModel[1034].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1034].setRotationPoint(77.25F, -32F, 10F);

		bodyModel[1035].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1035].setRotationPoint(77.75F, -32F, 10F);

		bodyModel[1036].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1036].setRotationPoint(78.25F, -32F, 10F);

		bodyModel[1037].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1037].setRotationPoint(79.25F, -32F, 10F);

		bodyModel[1038].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1038].setRotationPoint(79.75F, -32F, 10F);

		bodyModel[1039].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1039].setRotationPoint(78.75F, -32F, 10F);

		bodyModel[1040].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1040].setRotationPoint(80.25F, -32F, 10F);

		bodyModel[1041].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1041].setRotationPoint(80.75F, -32F, 10F);

		bodyModel[1042].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1042].setRotationPoint(81.25F, -32F, 10F);

		bodyModel[1043].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1043].setRotationPoint(82.25F, -32F, 10F);

		bodyModel[1044].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1044].setRotationPoint(82.75F, -32F, 10F);

		bodyModel[1045].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1045].setRotationPoint(81.75F, -32F, 10F);

		bodyModel[1046].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1046].setRotationPoint(83.25F, -32F, 10F);

		bodyModel[1047].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1047].setRotationPoint(83.75F, -32F, 10F);

		bodyModel[1048].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1048].setRotationPoint(84.25F, -32F, 10F);

		bodyModel[1049].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1049].setRotationPoint(84.75F, -32F, 10F);

		bodyModel[1050].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1050].setRotationPoint(9.25F, -32F, -11F);

		bodyModel[1051].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1051].setRotationPoint(9.75F, -32F, -11F);

		bodyModel[1052].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1052].setRotationPoint(10.25F, -32F, -11F);

		bodyModel[1053].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1053].setRotationPoint(11.25F, -32F, -11F);

		bodyModel[1054].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1054].setRotationPoint(11.75F, -32F, -11F);

		bodyModel[1055].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1055].setRotationPoint(10.75F, -32F, -11F);

		bodyModel[1056].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1056].setRotationPoint(12.25F, -32F, -11F);

		bodyModel[1057].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1057].setRotationPoint(12.75F, -32F, -11F);

		bodyModel[1058].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1058].setRotationPoint(13.25F, -32F, -11F);

		bodyModel[1059].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1059].setRotationPoint(14.25F, -32F, -11F);

		bodyModel[1060].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1060].setRotationPoint(14.75F, -32F, -11F);

		bodyModel[1061].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1061].setRotationPoint(13.75F, -32F, -11F);

		bodyModel[1062].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1062].setRotationPoint(15.25F, -32F, -11F);

		bodyModel[1063].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1063].setRotationPoint(15.75F, -32F, -11F);

		bodyModel[1064].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1064].setRotationPoint(16.25F, -32F, -11F);

		bodyModel[1065].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1065].setRotationPoint(17.25F, -32F, -11F);

		bodyModel[1066].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1066].setRotationPoint(17.75F, -32F, -11F);

		bodyModel[1067].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1067].setRotationPoint(16.75F, -32F, -11F);

		bodyModel[1068].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1068].setRotationPoint(18.25F, -32F, -11F);

		bodyModel[1069].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1069].setRotationPoint(18.75F, -32F, -11F);

		bodyModel[1070].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1070].setRotationPoint(19.25F, -32F, -11F);

		bodyModel[1071].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1071].setRotationPoint(20.25F, -32F, -11F);

		bodyModel[1072].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1072].setRotationPoint(20.75F, -32F, -11F);

		bodyModel[1073].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1073].setRotationPoint(19.75F, -32F, -11F);

		bodyModel[1074].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1074].setRotationPoint(21.25F, -32F, -11F);

		bodyModel[1075].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1075].setRotationPoint(21.75F, -32F, -11F);

		bodyModel[1076].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1076].setRotationPoint(22.25F, -32F, -11F);

		bodyModel[1077].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1077].setRotationPoint(23.25F, -32F, -11F);

		bodyModel[1078].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1078].setRotationPoint(23.75F, -32F, -11F);

		bodyModel[1079].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1079].setRotationPoint(22.75F, -32F, -11F);

		bodyModel[1080].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1080].setRotationPoint(24.25F, -32F, -11F);

		bodyModel[1081].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1081].setRotationPoint(24.75F, -32F, -11F);

		bodyModel[1082].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1082].setRotationPoint(25.25F, -32F, -11F);

		bodyModel[1083].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1083].setRotationPoint(25.75F, -32F, -11F);

		bodyModel[1084].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1084].setRotationPoint(68.25F, -32F, -11F);

		bodyModel[1085].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1085].setRotationPoint(68.75F, -32F, -11F);

		bodyModel[1086].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1086].setRotationPoint(69.25F, -32F, -11F);

		bodyModel[1087].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1087].setRotationPoint(70.25F, -32F, -11F);

		bodyModel[1088].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1088].setRotationPoint(70.75F, -32F, -11F);

		bodyModel[1089].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1089].setRotationPoint(69.75F, -32F, -11F);

		bodyModel[1090].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1090].setRotationPoint(71.25F, -32F, -11F);

		bodyModel[1091].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1091].setRotationPoint(71.75F, -32F, -11F);

		bodyModel[1092].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1092].setRotationPoint(72.25F, -32F, -11F);

		bodyModel[1093].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1093].setRotationPoint(73.25F, -32F, -11F);

		bodyModel[1094].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1094].setRotationPoint(73.75F, -32F, -11F);

		bodyModel[1095].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1095].setRotationPoint(72.75F, -32F, -11F);

		bodyModel[1096].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1096].setRotationPoint(74.25F, -32F, -11F);

		bodyModel[1097].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1097].setRotationPoint(74.75F, -32F, -11F);

		bodyModel[1098].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1098].setRotationPoint(75.25F, -32F, -11F);

		bodyModel[1099].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1099].setRotationPoint(76.25F, -32F, -11F);

		bodyModel[1100].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1100].setRotationPoint(76.75F, -32F, -11F);

		bodyModel[1101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1101].setRotationPoint(75.75F, -32F, -11F);

		bodyModel[1102].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1102].setRotationPoint(77.25F, -32F, -11F);

		bodyModel[1103].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1103].setRotationPoint(77.75F, -32F, -11F);

		bodyModel[1104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1104].setRotationPoint(78.25F, -32F, -11F);

		bodyModel[1105].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1105].setRotationPoint(79.25F, -32F, -11F);

		bodyModel[1106].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1106].setRotationPoint(79.75F, -32F, -11F);

		bodyModel[1107].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1107].setRotationPoint(78.75F, -32F, -11F);

		bodyModel[1108].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1108].setRotationPoint(80.25F, -32F, -11F);

		bodyModel[1109].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1109].setRotationPoint(80.75F, -32F, -11F);

		bodyModel[1110].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1110].setRotationPoint(81.25F, -32F, -11F);

		bodyModel[1111].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1111].setRotationPoint(82.25F, -32F, -11F);

		bodyModel[1112].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1112].setRotationPoint(82.75F, -32F, -11F);

		bodyModel[1113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1113].setRotationPoint(81.75F, -32F, -11F);

		bodyModel[1114].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1114].setRotationPoint(83.25F, -32F, -11F);

		bodyModel[1115].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1115].setRotationPoint(83.75F, -32F, -11F);

		bodyModel[1116].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1116].setRotationPoint(84.25F, -32F, -11F);

		bodyModel[1117].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1117].setRotationPoint(84.75F, -32F, -11F);

		bodyModel[1118].addShapeBox(0F, 0F, 1F, 3, 1, 6, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1118].setRotationPoint(-10F, -31F, -4F);

		bodyModel[1119].addShapeBox(0F, 0F, 1F, 1, 1, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[1119].setRotationPoint(-10F, -30F, -4F);

		bodyModel[1120].addShapeBox(0F, 0F, 1F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[1120].setRotationPoint(-10F, -29.5F, -4F);

		bodyModel[1121].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1121].setRotationPoint(-10.5F, -31F, -4F);

		bodyModel[1122].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[1122].setRotationPoint(-10.5F, -30F, -4F);

		bodyModel[1123].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[1123].setRotationPoint(-10.5F, -29.5F, -4F);

		bodyModel[1124].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1124].setRotationPoint(-10.5F, -31F, -2F);

		bodyModel[1125].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[1125].setRotationPoint(-10.5F, -30F, -2F);

		bodyModel[1126].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[1126].setRotationPoint(-10.5F, -29.5F, -2F);

		bodyModel[1127].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1127].setRotationPoint(-10.5F, -31F, 0F);

		bodyModel[1128].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[1128].setRotationPoint(-10.5F, -30F, 0F);

		bodyModel[1129].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[1129].setRotationPoint(-10.5F, -29.5F, 0F);

		bodyModel[1130].addShapeBox(0F, 0F, 1F, 3, 1, 6, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[1130].setRotationPoint(101F, -31F, -4F);

		bodyModel[1131].addShapeBox(0F, 0F, 1F, 1, 1, 6, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[1131].setRotationPoint(103F, -30F, -4F);

		bodyModel[1132].addShapeBox(0F, 0F, 1F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Lamp
		bodyModel[1132].setRotationPoint(103F, -29.5F, -4F);

		bodyModel[1133].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[1133].setRotationPoint(103.5F, -31F, -4F);

		bodyModel[1134].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Lamp
		bodyModel[1134].setRotationPoint(103.5F, -30F, -4F);

		bodyModel[1135].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Lamp
		bodyModel[1135].setRotationPoint(103.5F, -29.5F, -4F);

		bodyModel[1136].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[1136].setRotationPoint(103.5F, -31F, -2F);

		bodyModel[1137].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Lamp
		bodyModel[1137].setRotationPoint(103.5F, -30F, -2F);

		bodyModel[1138].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Lamp
		bodyModel[1138].setRotationPoint(103.5F, -29.5F, -2F);

		bodyModel[1139].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[1139].setRotationPoint(103.5F, -31F, 0F);

		bodyModel[1140].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Lamp
		bodyModel[1140].setRotationPoint(103.5F, -30F, 0F);

		bodyModel[1141].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Lamp
		bodyModel[1141].setRotationPoint(103.5F, -29.5F, 0F);

		bodyModel[1142].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1142].setRotationPoint(-7.75F, -20F, 9.75F);

		bodyModel[1143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[1143].setRotationPoint(-7.75F, -20F, 9.25F);

		bodyModel[1144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[1144].setRotationPoint(-7.75F, -13.5F, 9.5F);

		bodyModel[1145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part28
		bodyModel[1145].setRotationPoint(-9.53F, -21F, 6.25F);

		bodyModel[1146].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[1146].setRotationPoint(78F, -48F, -6F);

		bodyModel[1147].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1147].setRotationPoint(78F, -48F, 6F);

		bodyModel[1148].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[1148].setRotationPoint(78F, -48F, -8F);

		bodyModel[1149].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[1149].setRotationPoint(78F, -38F, -6F);

		bodyModel[1150].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1150].setRotationPoint(78F, -38F, 6F);

		bodyModel[1151].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[1151].setRotationPoint(78F, -38F, -8F);

		bodyModel[1152].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[1152].setRotationPoint(-7.75F, -21F, 9.5F);

		bodyModel[1153].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-0.25F, 0F, -0.75F, -1.5F, 0F, -0.75F, 0F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.75F, -1.5F, -0.75F, -0.75F, 0F, -0.75F, 0F, -1.75F, -0.75F, 0F); // Du loco part28
		bodyModel[1153].setRotationPoint(-9.75F, -21F, 6.25F);

		bodyModel[1154].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-0.5F, 0F, -0.75F, -1.25F, 0F, -0.75F, 0F, 0F, 0F, -1.75F, 0F, 0F, -0.5F, -0.75F, -0.75F, -1.25F, -0.75F, -0.75F, 0F, -0.75F, 0F, -1.75F, -0.75F, 0F); // Du loco part28
		bodyModel[1154].setRotationPoint(-11.75F, -21F, 0.25F);

		bodyModel[1155].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1155].setRotationPoint(-10.25F, -21F, 5.25F);

		bodyModel[1156].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part28
		bodyModel[1156].setRotationPoint(-10.25F, -21F, -6.25F);

		bodyModel[1157].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-1.75F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -1.75F, -0.75F, 0F, 0F, -0.75F, 0F, -1.25F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1157].setRotationPoint(-11.75F, -21F, -5.25F);

		bodyModel[1158].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F); // Du loco part28
		bodyModel[1158].setRotationPoint(-7.75F, -20F, -10.75F);

		bodyModel[1159].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1159].setRotationPoint(-7.75F, -20F, -10.25F);

		bodyModel[1160].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part28
		bodyModel[1160].setRotationPoint(-7.75F, -13.5F, -10.75F);

		bodyModel[1161].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1161].setRotationPoint(-9.53F, -21F, -7.25F);

		bodyModel[1162].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.25F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[1162].setRotationPoint(-7.75F, -21F, -10.5F);

		bodyModel[1163].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1.75F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -1.75F, -0.75F, 0F, 0F, -0.75F, 0F, -1.5F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1163].setRotationPoint(-9.75F, -21F, -10.25F);

		bodyModel[1164].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1164].setRotationPoint(-11.75F, -21F, -1.25F);

		bodyModel[1165].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1165].setRotationPoint(100.77F, -20F, 9.75F);

		bodyModel[1166].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Du loco part28
		bodyModel[1166].setRotationPoint(100.77F, -20F, 9.25F);

		bodyModel[1167].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part28
		bodyModel[1167].setRotationPoint(100.77F, -13.5F, 9.5F);

		bodyModel[1168].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.75F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part28
		bodyModel[1168].setRotationPoint(102.47F, -21F, 6.25F);

		bodyModel[1169].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.25F, -0.5F, 0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part28
		bodyModel[1169].setRotationPoint(100.77F, -21F, 9.5F);

		bodyModel[1170].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,-1.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -1.75F, 0F, -0.25F, 0F, 0F, -0.25F, -1.5F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -1.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[1170].setRotationPoint(101.77F, -21F, 6.25F);

		bodyModel[1171].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,-1.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.25F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -1.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[1171].setRotationPoint(103.75F, -21F, 0.25F);

		bodyModel[1172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1172].setRotationPoint(103.25F, -21F, 5.25F);

		bodyModel[1173].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part28
		bodyModel[1173].setRotationPoint(103.25F, -21F, -6.25F);

		bodyModel[1174].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -0.5F, 0F, -0.75F, -1.25F, 0F, -0.75F, 0F, -0.75F, 0F, -1.75F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, -1.25F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1174].setRotationPoint(103.75F, -21F, -5.25F);

		bodyModel[1175].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F); // Du loco part28
		bodyModel[1175].setRotationPoint(100.75F, -20F, -10.75F);

		bodyModel[1176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.75F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1176].setRotationPoint(100.75F, -20F, -10.25F);

		bodyModel[1177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Du loco part28
		bodyModel[1177].setRotationPoint(100.75F, -13.5F, -10.75F);

		bodyModel[1178].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1178].setRotationPoint(102.47F, -21F, -7.25F);

		bodyModel[1179].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F); // Du loco part28
		bodyModel[1179].setRotationPoint(100.75F, -21F, -10.5F);

		bodyModel[1180].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, 0F, -0.75F, -1.5F, 0F, -0.75F, 0F, -0.75F, 0F, -1.75F, -0.75F, 0F, -0.25F, -0.75F, -0.75F, -1.5F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1180].setRotationPoint(101.75F, -21F, -10.25F);

		bodyModel[1181].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1181].setRotationPoint(104.75F, -21F, -1.25F);

		bodyModel[1182].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1182].setRotationPoint(5.75F, -8F, 9.75F);

		bodyModel[1183].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1183].setRotationPoint(1.25F, -8F, 9.75F);

		bodyModel[1184].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1184].setRotationPoint(2.25F, -4F, 9.75F);

		bodyModel[1185].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1185].setRotationPoint(2.25F, -6.25F, 9.75F);

		bodyModel[1186].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1186].setRotationPoint(68.75F, -8F, 9.75F);

		bodyModel[1187].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1187].setRotationPoint(64.25F, -8F, 9.75F);

		bodyModel[1188].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1188].setRotationPoint(65.25F, -4F, 9.75F);

		bodyModel[1189].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1189].setRotationPoint(65.25F, -6.25F, 9.75F);

		bodyModel[1190].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1190].setRotationPoint(28.75F, -8F, -11.5F);

		bodyModel[1191].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1191].setRotationPoint(24.25F, -8F, -11.5F);

		bodyModel[1192].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1192].setRotationPoint(25.25F, -4F, -11.5F);

		bodyModel[1193].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1193].setRotationPoint(25.25F, -6.25F, -11.5F);

		bodyModel[1194].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1194].setRotationPoint(91.75F, -8F, -11.5F);

		bodyModel[1195].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1195].setRotationPoint(87.25F, -8F, -11.5F);

		bodyModel[1196].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1196].setRotationPoint(88.25F, -4F, -11.5F);

		bodyModel[1197].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1197].setRotationPoint(88.25F, -6.25F, -11.5F);

		bodyModel[1198].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1198].setRotationPoint(-6.25F, -7F, 9.75F);

		bodyModel[1199].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1199].setRotationPoint(-10.75F, -7F, 9.75F);

		bodyModel[1200].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1200].setRotationPoint(-9.75F, -5F, 9.75F);

		bodyModel[1201].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1201].setRotationPoint(-10.75F, -7.5F, 9.75F);

		bodyModel[1202].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1202].setRotationPoint(-10.75F, -7.5F, 7.25F);

		bodyModel[1203].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1203].setRotationPoint(-10.75F, -7.5F, 8.25F);

		bodyModel[1204].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1204].setRotationPoint(-10.75F, -7.5F, 7.75F);

		bodyModel[1205].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1205].setRotationPoint(-10.25F, -7.5F, 7.75F);

		bodyModel[1206].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1206].setRotationPoint(-10.75F, -7.5F, 7.75F);

		bodyModel[1207].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1207].setRotationPoint(-10.75F, -7.5F, 8.75F);

		bodyModel[1208].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1208].setRotationPoint(-10.75F, -7.5F, 9.25F);

		bodyModel[1209].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1209].setRotationPoint(-9.75F, -7.5F, 7.75F);

		bodyModel[1210].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1210].setRotationPoint(-9.25F, -7.5F, 7.75F);

		bodyModel[1211].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1211].setRotationPoint(-8.75F, -7.5F, 7.75F);

		bodyModel[1212].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1212].setRotationPoint(-8.25F, -7.5F, 7.75F);

		bodyModel[1213].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1213].setRotationPoint(-6.25F, -7F, -11.5F);

		bodyModel[1214].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1214].setRotationPoint(-10.75F, -7F, -11.5F);

		bodyModel[1215].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1215].setRotationPoint(-9.75F, -5F, -11.5F);

		bodyModel[1216].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1216].setRotationPoint(-10.75F, -7.5F, -9F);

		bodyModel[1217].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1217].setRotationPoint(-10.75F, -7.5F, -11.5F);

		bodyModel[1218].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1218].setRotationPoint(-10.75F, -7.5F, -10.5F);

		bodyModel[1219].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1219].setRotationPoint(-10.75F, -7.5F, -11F);

		bodyModel[1220].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1220].setRotationPoint(-10.25F, -7.5F, -11F);

		bodyModel[1221].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.75F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1221].setRotationPoint(-10.75F, -7.5F, -11F);

		bodyModel[1222].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1222].setRotationPoint(-10.75F, -7.5F, -10F);

		bodyModel[1223].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1223].setRotationPoint(-10.75F, -7.5F, -9.5F);

		bodyModel[1224].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1224].setRotationPoint(-9.75F, -7.5F, -11F);

		bodyModel[1225].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1225].setRotationPoint(-9.25F, -7.5F, -11F);

		bodyModel[1226].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1226].setRotationPoint(-8.75F, -7.5F, -11F);

		bodyModel[1227].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1227].setRotationPoint(-8.25F, -7.5F, -11F);

		bodyModel[1228].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1228].setRotationPoint(-11.75F, -10F, -6F);

		bodyModel[1229].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1229].setRotationPoint(-11.75F, -10F, -8.5F);

		bodyModel[1230].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1230].setRotationPoint(-11.75F, -10F, -7.5F);

		bodyModel[1231].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1231].setRotationPoint(-11.75F, -10F, -8F);

		bodyModel[1232].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1232].setRotationPoint(-11.25F, -10F, -8F);

		bodyModel[1233].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1233].setRotationPoint(-11.75F, -10F, -8F);

		bodyModel[1234].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1234].setRotationPoint(-11.75F, -10F, -7F);

		bodyModel[1235].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1235].setRotationPoint(-11.75F, -10F, -6.5F);

		bodyModel[1236].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1236].setRotationPoint(-10.75F, -10F, -8F);

		bodyModel[1237].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1237].setRotationPoint(-10.25F, -10F, -8F);

		bodyModel[1238].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1238].setRotationPoint(-11.75F, -10F, -9F);

		bodyModel[1239].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1239].setRotationPoint(-9.75F, -10F, -8F);

		bodyModel[1240].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1240].setRotationPoint(-9.25F, -10F, -8F);

		bodyModel[1241].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1241].setRotationPoint(-11.75F, -10F, 7.25F);

		bodyModel[1242].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1242].setRotationPoint(-11.75F, -10F, 4.75F);

		bodyModel[1243].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1243].setRotationPoint(-11.75F, -10F, 5.75F);

		bodyModel[1244].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1244].setRotationPoint(-11.75F, -10F, 5.25F);

		bodyModel[1245].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1245].setRotationPoint(-11.25F, -10F, 5.25F);

		bodyModel[1246].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1246].setRotationPoint(-11.75F, -10F, 5.25F);

		bodyModel[1247].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1247].setRotationPoint(-11.75F, -10F, 6.25F);

		bodyModel[1248].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1248].setRotationPoint(-11.75F, -10F, 6.75F);

		bodyModel[1249].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1249].setRotationPoint(-10.75F, -10F, 5.25F);

		bodyModel[1250].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1250].setRotationPoint(-10.25F, -10F, 5.25F);

		bodyModel[1251].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1251].setRotationPoint(-11.75F, -10F, 4.25F);

		bodyModel[1252].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1252].setRotationPoint(-9.75F, -10F, 5.25F);

		bodyModel[1253].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1253].setRotationPoint(-9.25F, -10F, 5.25F);

		bodyModel[1254].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1254].setRotationPoint(-7.75F, -7.5F, 7.75F);

		bodyModel[1255].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1255].setRotationPoint(-7.75F, -7.5F, -11F);

		bodyModel[1256].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1256].setRotationPoint(104F, -7F, 9.75F);

		bodyModel[1257].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1257].setRotationPoint(99.5F, -7F, 9.75F);

		bodyModel[1258].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1258].setRotationPoint(100.5F, -5F, 9.75F);

		bodyModel[1259].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1259].setRotationPoint(99.25F, -7.5F, 9.75F);

		bodyModel[1260].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1260].setRotationPoint(100.25F, -7.5F, 7.25F);

		bodyModel[1261].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1261].setRotationPoint(100.25F, -7.5F, 8.25F);

		bodyModel[1262].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1262].setRotationPoint(100.25F, -7.5F, 7.75F);

		bodyModel[1263].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1263].setRotationPoint(100.75F, -7.5F, 7.75F);

		bodyModel[1264].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1264].setRotationPoint(100.25F, -7.5F, 7.75F);

		bodyModel[1265].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1265].setRotationPoint(100.25F, -7.5F, 8.75F);

		bodyModel[1266].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Du loco part28
		bodyModel[1266].setRotationPoint(100.25F, -7.5F, 9.25F);

		bodyModel[1267].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1267].setRotationPoint(101.25F, -7.5F, 7.75F);

		bodyModel[1268].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1268].setRotationPoint(101.75F, -7.5F, 7.75F);

		bodyModel[1269].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1269].setRotationPoint(102.25F, -7.5F, 7.75F);

		bodyModel[1270].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1270].setRotationPoint(102.75F, -7.5F, 7.75F);

		bodyModel[1271].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1271].setRotationPoint(104F, -7F, -11.5F);

		bodyModel[1272].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1272].setRotationPoint(99.5F, -7F, -11.5F);

		bodyModel[1273].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1273].setRotationPoint(100.5F, -5F, -11.5F);

		bodyModel[1274].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1274].setRotationPoint(100.25F, -7.5F, -9F);

		bodyModel[1275].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1275].setRotationPoint(99.25F, -7.5F, -11.5F);

		bodyModel[1276].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1276].setRotationPoint(100.25F, -7.5F, -10.5F);

		bodyModel[1277].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1277].setRotationPoint(100.25F, -7.5F, -11F);

		bodyModel[1278].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1278].setRotationPoint(100.75F, -7.5F, -11F);

		bodyModel[1279].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.75F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1279].setRotationPoint(99.75F, -7.5F, -11F);

		bodyModel[1280].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1280].setRotationPoint(100.25F, -7.5F, -10F);

		bodyModel[1281].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1281].setRotationPoint(100.25F, -7.5F, -9.5F);

		bodyModel[1282].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1282].setRotationPoint(101.25F, -7.5F, -11F);

		bodyModel[1283].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1283].setRotationPoint(101.75F, -7.5F, -11F);

		bodyModel[1284].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1284].setRotationPoint(102.25F, -7.5F, -11F);

		bodyModel[1285].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1285].setRotationPoint(102.75F, -7.5F, -11F);

		bodyModel[1286].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1286].setRotationPoint(101F, -10F, -6F);

		bodyModel[1287].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1287].setRotationPoint(101F, -10F, -8.5F);

		bodyModel[1288].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1288].setRotationPoint(101F, -10F, -7.5F);

		bodyModel[1289].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1289].setRotationPoint(101.5F, -10F, -8F);

		bodyModel[1290].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1290].setRotationPoint(102F, -10F, -8F);

		bodyModel[1291].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1291].setRotationPoint(101F, -10F, -8F);

		bodyModel[1292].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1292].setRotationPoint(101F, -10F, -7F);

		bodyModel[1293].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1293].setRotationPoint(101F, -10F, -6.5F);

		bodyModel[1294].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1294].setRotationPoint(102.5F, -10F, -8F);

		bodyModel[1295].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1295].setRotationPoint(103F, -10F, -8F);

		bodyModel[1296].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1296].setRotationPoint(101F, -10F, -9F);

		bodyModel[1297].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1297].setRotationPoint(103.5F, -10F, -8F);

		bodyModel[1298].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1298].setRotationPoint(104F, -10F, -8F);

		bodyModel[1299].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1299].setRotationPoint(101F, -10F, 7.25F);

		bodyModel[1300].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1300].setRotationPoint(101F, -10F, 4.75F);

		bodyModel[1301].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1301].setRotationPoint(101F, -10F, 5.75F);

		bodyModel[1302].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1302].setRotationPoint(101.5F, -10F, 5.25F);

		bodyModel[1303].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1303].setRotationPoint(102F, -10F, 5.25F);

		bodyModel[1304].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1304].setRotationPoint(101F, -10F, 5.25F);

		bodyModel[1305].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1305].setRotationPoint(101F, -10F, 6.25F);

		bodyModel[1306].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1306].setRotationPoint(101F, -10F, 6.75F);

		bodyModel[1307].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1307].setRotationPoint(102.5F, -10F, 5.25F);

		bodyModel[1308].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1308].setRotationPoint(103F, -10F, 5.25F);

		bodyModel[1309].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1309].setRotationPoint(101F, -10F, 4.25F);

		bodyModel[1310].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1310].setRotationPoint(103.5F, -10F, 5.25F);

		bodyModel[1311].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1311].setRotationPoint(104F, -10F, 5.25F);

		bodyModel[1312].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1312].setRotationPoint(103.25F, -7.5F, 7.75F);

		bodyModel[1313].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1313].setRotationPoint(103.25F, -7.5F, -11F);

		bodyModel[1314].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 135
		bodyModel[1314].setRotationPoint(-6F, -28F, -11F);

		bodyModel[1315].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[1315].setRotationPoint(-14.5F, -8.87F, 4.53F);

		bodyModel[1316].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[1316].setRotationPoint(-14.5F, -9.37F, 4.53F);

		bodyModel[1317].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0.125F, 0F); // Box 0
		bodyModel[1317].setRotationPoint(-14.5F, -8.37F, 4.53F);

		bodyModel[1318].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, -0.625F, 0F); // Box 0
		bodyModel[1318].setRotationPoint(-14.5F, -9.87F, 4.53F);

		bodyModel[1319].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F); // Box 0
		bodyModel[1319].setRotationPoint(-14.5F, -7.87F, 4.53F);

		bodyModel[1320].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[1320].setRotationPoint(-14.5F, -8.87F, -8.53F);

		bodyModel[1321].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[1321].setRotationPoint(-14.5F, -9.37F, -8.53F);

		bodyModel[1322].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0.125F, 0F); // Box 0
		bodyModel[1322].setRotationPoint(-14.5F, -8.37F, -8.53F);

		bodyModel[1323].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, -0.625F, 0F); // Box 0
		bodyModel[1323].setRotationPoint(-14.5F, -9.87F, -8.53F);

		bodyModel[1324].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F); // Box 0
		bodyModel[1324].setRotationPoint(-14.5F, -7.87F, -8.53F);

		bodyModel[1325].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[1325].setRotationPoint(107F, -8.87F, 4.53F);

		bodyModel[1326].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[1326].setRotationPoint(107F, -9.37F, 4.53F);

		bodyModel[1327].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0.125F, 0F); // Box 0
		bodyModel[1327].setRotationPoint(107F, -8.37F, 4.53F);

		bodyModel[1328].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, -0.625F, 0F); // Box 0
		bodyModel[1328].setRotationPoint(107F, -9.87F, 4.53F);

		bodyModel[1329].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F); // Box 0
		bodyModel[1329].setRotationPoint(107F, -7.87F, 4.53F);

		bodyModel[1330].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[1330].setRotationPoint(107F, -8.87F, -8.53F);

		bodyModel[1331].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0.125F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[1331].setRotationPoint(107F, -9.37F, -8.53F);

		bodyModel[1332].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, -0.5F, 0.125F, 0F); // Box 0
		bodyModel[1332].setRotationPoint(107F, -8.37F, -8.53F);

		bodyModel[1333].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F, -0.5F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, -0.625F, 0F); // Box 0
		bodyModel[1333].setRotationPoint(107F, -9.87F, -8.53F);

		bodyModel[1334].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.625F, 0F, 0F, -0.625F, 0F, 0F, -0.625F, 0F, -0.5F, -0.625F, 0F, -0.5F, 0F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, 0F, -0.375F); // Box 0
		bodyModel[1334].setRotationPoint(107F, -7.87F, -8.53F);

		bodyModel[1335].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1335].setRotationPoint(8F, -12.25F, 10.25F);

		bodyModel[1336].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1336].setRotationPoint(8F, -13.25F, 10.25F);

		bodyModel[1337].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1337].setRotationPoint(8F, -14.25F, 10.25F);

		bodyModel[1338].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1338].setRotationPoint(8F, -15.25F, 10.25F);

		bodyModel[1339].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1339].setRotationPoint(8F, -16.25F, 10.25F);

		bodyModel[1340].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1340].setRotationPoint(8F, -17.25F, 10.25F);

		bodyModel[1341].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1341].setRotationPoint(8F, -18.25F, 10.25F);

		bodyModel[1342].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1342].setRotationPoint(8F, -19.25F, 10.25F);

		bodyModel[1343].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part28
		bodyModel[1343].setRotationPoint(8F, -20.25F, 10.25F);

		bodyModel[1344].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1344].setRotationPoint(8F, -21.25F, 10.25F);

		bodyModel[1345].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1345].setRotationPoint(8F, -22.25F, 10.25F);

		bodyModel[1346].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1346].setRotationPoint(8F, -23.25F, 10.25F);

		bodyModel[1347].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1347].setRotationPoint(8F, -24.25F, 10.25F);

		bodyModel[1348].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1348].setRotationPoint(8F, -25.25F, 10.25F);

		bodyModel[1349].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1349].setRotationPoint(8F, -26.25F, 10.25F);

		bodyModel[1350].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1350].setRotationPoint(8F, -27.25F, 10.25F);

		bodyModel[1351].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1351].setRotationPoint(8F, -28.25F, 10.25F);

		bodyModel[1352].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1352].setRotationPoint(8F, -29.25F, 10.25F);

		bodyModel[1353].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1353].setRotationPoint(19F, -28.25F, 10.25F);

		bodyModel[1354].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1354].setRotationPoint(70F, -12.25F, 10.25F);

		bodyModel[1355].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1355].setRotationPoint(70F, -13.25F, 10.25F);

		bodyModel[1356].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1356].setRotationPoint(70F, -14.25F, 10.25F);

		bodyModel[1357].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1357].setRotationPoint(70F, -15.25F, 10.25F);

		bodyModel[1358].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1358].setRotationPoint(70F, -16.25F, 10.25F);

		bodyModel[1359].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1359].setRotationPoint(70F, -17.25F, 10.25F);

		bodyModel[1360].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1360].setRotationPoint(70F, -18.25F, 10.25F);

		bodyModel[1361].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1361].setRotationPoint(70F, -19.25F, 10.25F);

		bodyModel[1362].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part28
		bodyModel[1362].setRotationPoint(70F, -20.25F, 10.25F);

		bodyModel[1363].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1363].setRotationPoint(70F, -21.25F, 10.25F);

		bodyModel[1364].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1364].setRotationPoint(70F, -22.25F, 10.25F);

		bodyModel[1365].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1365].setRotationPoint(70F, -29.25F, 10.25F);

		bodyModel[1366].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,-0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part28
		bodyModel[1366].setRotationPoint(19F, -23.25F, 10.25F);

		bodyModel[1367].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1367].setRotationPoint(20F, -24.25F, 10.25F);

		bodyModel[1368].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1368].setRotationPoint(20F, -25.25F, 10.25F);

		bodyModel[1369].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1369].setRotationPoint(20F, -26.25F, 10.25F);

		bodyModel[1370].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,-0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1370].setRotationPoint(19F, -27.25F, 10.25F);

		bodyModel[1371].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1371].setRotationPoint(39F, -28.25F, 10.25F);

		bodyModel[1372].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,-0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part28
		bodyModel[1372].setRotationPoint(39F, -23.25F, 10.25F);

		bodyModel[1373].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1373].setRotationPoint(40F, -24.25F, 10.25F);

		bodyModel[1374].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1374].setRotationPoint(40F, -25.25F, 10.25F);

		bodyModel[1375].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1375].setRotationPoint(40F, -26.25F, 10.25F);

		bodyModel[1376].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,-0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1376].setRotationPoint(39F, -27.25F, 10.25F);

		bodyModel[1377].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part28
		bodyModel[1377].setRotationPoint(59F, -23.25F, 10.25F);

		bodyModel[1378].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1378].setRotationPoint(60F, -24.25F, 10.25F);

		bodyModel[1379].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1379].setRotationPoint(60F, -25.25F, 10.25F);

		bodyModel[1380].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1380].setRotationPoint(60F, -26.25F, 10.25F);

		bodyModel[1381].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1381].setRotationPoint(59F, -27.25F, 10.25F);

		bodyModel[1382].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1382].setRotationPoint(59F, -28.25F, 10.25F);

		bodyModel[1383].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1383].setRotationPoint(70F, -23.25F, 10.25F);

		bodyModel[1384].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1384].setRotationPoint(70F, -24.25F, 10.25F);

		bodyModel[1385].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1385].setRotationPoint(70F, -25.25F, 10.25F);

		bodyModel[1386].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1386].setRotationPoint(70F, -26.25F, 10.25F);

		bodyModel[1387].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1387].setRotationPoint(70F, -27.25F, 10.25F);

		bodyModel[1388].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1388].setRotationPoint(70F, -28.25F, 10.25F);

		bodyModel[1389].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part28
		bodyModel[1389].setRotationPoint(79F, -23.25F, 10.25F);

		bodyModel[1390].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1390].setRotationPoint(80F, -24.25F, 10.25F);

		bodyModel[1391].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1391].setRotationPoint(80F, -25.25F, 10.25F);

		bodyModel[1392].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1392].setRotationPoint(80F, -26.25F, 10.25F);

		bodyModel[1393].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1393].setRotationPoint(79F, -27.25F, 10.25F);

		bodyModel[1394].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1394].setRotationPoint(79F, -28.25F, 10.25F);

		bodyModel[1395].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1395].setRotationPoint(30F, -12.25F, -12F);

		bodyModel[1396].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1396].setRotationPoint(30F, -13.25F, -12F);

		bodyModel[1397].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1397].setRotationPoint(30F, -14.25F, -12F);

		bodyModel[1398].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1398].setRotationPoint(30F, -15.25F, -12F);

		bodyModel[1399].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1399].setRotationPoint(30F, -16.25F, -12F);

		bodyModel[1400].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1400].setRotationPoint(30F, -17.25F, -12F);

		bodyModel[1401].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1401].setRotationPoint(30F, -18.25F, -12F);

		bodyModel[1402].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1402].setRotationPoint(30F, -19.25F, -12F);

		bodyModel[1403].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part28
		bodyModel[1403].setRotationPoint(30F, -20.25F, -12F);

		bodyModel[1404].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1404].setRotationPoint(30F, -21.25F, -12F);

		bodyModel[1405].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1405].setRotationPoint(30F, -22.25F, -12F);

		bodyModel[1406].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part28
		bodyModel[1406].setRotationPoint(79F, -23.25F, -12F);

		bodyModel[1407].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1407].setRotationPoint(80F, -24.25F, -12F);

		bodyModel[1408].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1408].setRotationPoint(80F, -25.25F, -12F);

		bodyModel[1409].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1409].setRotationPoint(80F, -26.25F, -12F);

		bodyModel[1410].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1410].setRotationPoint(79F, -27.25F, -12F);

		bodyModel[1411].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1411].setRotationPoint(79F, -28.25F, -12F);

		bodyModel[1412].addShapeBox(0F, 0F, 0F, 56, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1412].setRotationPoint(30F, -29.25F, -12F);

		bodyModel[1413].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1413].setRotationPoint(39F, -28.25F, -12F);

		bodyModel[1414].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1414].setRotationPoint(8F, -12.25F, -12F);

		bodyModel[1415].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1415].setRotationPoint(8F, -13.25F, -12F);

		bodyModel[1416].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1416].setRotationPoint(8F, -14.25F, -12F);

		bodyModel[1417].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1417].setRotationPoint(8F, -15.25F, -12F);

		bodyModel[1418].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1418].setRotationPoint(8F, -16.25F, -12F);

		bodyModel[1419].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1419].setRotationPoint(8F, -17.25F, -12F);

		bodyModel[1420].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1420].setRotationPoint(8F, -18.25F, -12F);

		bodyModel[1421].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1421].setRotationPoint(8F, -19.25F, -12F);

		bodyModel[1422].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part28
		bodyModel[1422].setRotationPoint(8F, -20.25F, -12F);

		bodyModel[1423].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1423].setRotationPoint(8F, -21.25F, -12F);

		bodyModel[1424].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1424].setRotationPoint(8F, -22.25F, -12F);

		bodyModel[1425].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1425].setRotationPoint(8F, -29.25F, -12F);

		bodyModel[1426].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,-0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part28
		bodyModel[1426].setRotationPoint(39F, -23.25F, -12F);

		bodyModel[1427].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1427].setRotationPoint(40F, -24.25F, -12F);

		bodyModel[1428].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1428].setRotationPoint(40F, -25.25F, -12F);

		bodyModel[1429].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1429].setRotationPoint(40F, -26.25F, -12F);

		bodyModel[1430].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,-0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1430].setRotationPoint(39F, -27.25F, -12F);

		bodyModel[1431].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1431].setRotationPoint(59F, -28.25F, -12F);

		bodyModel[1432].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,-0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part28
		bodyModel[1432].setRotationPoint(59F, -23.25F, -12F);

		bodyModel[1433].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1433].setRotationPoint(60F, -24.25F, -12F);

		bodyModel[1434].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1434].setRotationPoint(60F, -25.25F, -12F);

		bodyModel[1435].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1435].setRotationPoint(60F, -26.25F, -12F);

		bodyModel[1436].addShapeBox(0F, 0F, 0F, 16, 1, 1, 0F,-0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1436].setRotationPoint(59F, -27.25F, -12F);

		bodyModel[1437].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1437].setRotationPoint(30F, -23.25F, -12F);

		bodyModel[1438].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1438].setRotationPoint(30F, -24.25F, -12F);

		bodyModel[1439].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1439].setRotationPoint(30F, -25.25F, -12F);

		bodyModel[1440].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1440].setRotationPoint(30F, -26.25F, -12F);

		bodyModel[1441].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1441].setRotationPoint(30F, -27.25F, -12F);

		bodyModel[1442].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1442].setRotationPoint(30F, -28.25F, -12F);

		bodyModel[1443].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Du loco part28
		bodyModel[1443].setRotationPoint(19F, -23.25F, -12F);

		bodyModel[1444].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1444].setRotationPoint(20F, -24.25F, -12F);

		bodyModel[1445].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1445].setRotationPoint(20F, -25.25F, -12F);

		bodyModel[1446].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1446].setRotationPoint(20F, -26.25F, -12F);

		bodyModel[1447].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F); // Du loco part28
		bodyModel[1447].setRotationPoint(19F, -27.25F, -12F);

		bodyModel[1448].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1448].setRotationPoint(19F, -28.25F, -12F);

		bodyModel[1449].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1449].setRotationPoint(8F, -23.25F, -12F);

		bodyModel[1450].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1450].setRotationPoint(8F, -24.25F, -12F);

		bodyModel[1451].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1451].setRotationPoint(8F, -25.25F, -12F);

		bodyModel[1452].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1452].setRotationPoint(8F, -26.25F, -12F);

		bodyModel[1453].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1453].setRotationPoint(8F, -27.25F, -12F);

		bodyModel[1454].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[1454].setRotationPoint(8F, -28.25F, -12F);

		bodyModel[1455].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 135
		bodyModel[1455].setRotationPoint(93F, -28F, -11F);

		bodyModel[1456].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Box 135
		bodyModel[1456].setRotationPoint(99F, -28F, -11F);

		bodyModel[1457].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Du loco part28
		bodyModel[1457].setRotationPoint(-5.5F, -27.75F, 11F);

		bodyModel[1458].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Du loco part28
		bodyModel[1458].setRotationPoint(-5.5F, -22.5F, 11F);

		bodyModel[1459].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[1459].setRotationPoint(-5.5F, -27.5F, 11.5F);

		bodyModel[1460].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F); // Du loco part28
		bodyModel[1460].setRotationPoint(-5.75F, -27F, 11.25F);

		bodyModel[1461].addShapeBox(0F, 0F, 1F, 4, 1, 2, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1461].setRotationPoint(-10.5F, -31F, -2F);

		bodyModel[1462].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[1462].setRotationPoint(-10.5F, -30F, -2F);

		bodyModel[1463].addShapeBox(0F, 0F, 1F, 2, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -1.5F, -0.25F, -0.75F, -1.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[1463].setRotationPoint(-10.5F, -29.5F, -2F);

		bodyModel[1464].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.75F, -0.375F, -0.75F, -0.75F, -0.375F, -0.75F, -0.75F, -0.375F, 0F, -0.75F, -0.375F); // Lamp
		bodyModel[1464].setRotationPoint(-10.75F, -28F, -1.5F);

		bodyModel[1465].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, -0.75F, -0.125F, -0.75F, -0.75F, -0.125F, -0.75F, -0.75F, -0.125F, 0F, -0.75F, -0.125F); // Lamp
		bodyModel[1465].setRotationPoint(-10.75F, -28.25F, -1.5F);

		bodyModel[1466].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, -0.75F, -0.375F, -0.75F, -0.75F, -0.375F, -0.75F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, 0F, 0F, -0.125F); // Lamp
		bodyModel[1466].setRotationPoint(-10.75F, -29.25F, -1.5F);

		bodyModel[1467].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[1467].setRotationPoint(-11F, -31F, -2F);

		bodyModel[1468].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Lamp
		bodyModel[1468].setRotationPoint(-11F, -30F, -2F);

		bodyModel[1469].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Lamp
		bodyModel[1469].setRotationPoint(-11F, -29.5F, -2F);

		bodyModel[1470].addShapeBox(0F, 0F, 1F, 4, 1, 2, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[1470].setRotationPoint(100.5F, -31F, -2F);

		bodyModel[1471].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Lamp
		bodyModel[1471].setRotationPoint(102.5F, -30F, -2F);

		bodyModel[1472].addShapeBox(0F, 0F, 1F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1.5F, -0.25F, -0.75F); // Lamp
		bodyModel[1472].setRotationPoint(102.5F, -29.5F, -2F);

		bodyModel[1473].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,-0.75F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, -0.75F, -0.75F, -0.375F); // Lamp
		bodyModel[1473].setRotationPoint(103.75F, -28F, -1.5F);

		bodyModel[1474].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,-0.75F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.75F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, 0F, -0.75F, -0.125F, -0.75F, -0.75F, -0.125F); // Lamp
		bodyModel[1474].setRotationPoint(103.75F, -28.25F, -1.5F);

		bodyModel[1475].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,-0.75F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, 0F, -0.75F, -0.375F, -0.75F, -0.75F, -0.375F, -0.75F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.75F, 0F, -0.125F); // Lamp
		bodyModel[1475].setRotationPoint(103.75F, -29.25F, -1.5F);

		bodyModel[1476].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[1476].setRotationPoint(104F, -31F, -2F);

		bodyModel[1477].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Lamp
		bodyModel[1477].setRotationPoint(104F, -30F, -2F);

		bodyModel[1478].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Lamp
		bodyModel[1478].setRotationPoint(104F, -29.5F, -2F);

		bodyModel[1479].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Du loco part28
		bodyModel[1479].setRotationPoint(-5.5F, -27.75F, -12.5F);

		bodyModel[1480].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, -0.5F); // Du loco part28
		bodyModel[1480].setRotationPoint(-5.5F, -22.5F, -12.5F);

		bodyModel[1481].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[1481].setRotationPoint(-5.5F, -27.5F, -13.25F);

		bodyModel[1482].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, -0.5F); // Du loco part28
		bodyModel[1482].setRotationPoint(-5.75F, -27F, -13.5F);

		bodyModel[1483].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F); // Du loco part28
		bodyModel[1483].setRotationPoint(98.5F, -27.75F, 11F);

		bodyModel[1484].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F); // Du loco part28
		bodyModel[1484].setRotationPoint(98.5F, -22.5F, 11F);

		bodyModel[1485].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part28
		bodyModel[1485].setRotationPoint(98.5F, -27.5F, 11.5F);

		bodyModel[1486].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.25F, 0F, 0F); // Du loco part28
		bodyModel[1486].setRotationPoint(98.75F, -27F, 11.25F);

		bodyModel[1487].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F); // Du loco part28
		bodyModel[1487].setRotationPoint(98.5F, -27.75F, -12.5F);

		bodyModel[1488].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F); // Du loco part28
		bodyModel[1488].setRotationPoint(98.5F, -22.5F, -12.5F);

		bodyModel[1489].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part28
		bodyModel[1489].setRotationPoint(98.5F, -27.5F, -13.25F);

		bodyModel[1490].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.25F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.25F, 0F, 0F); // Du loco part28
		bodyModel[1490].setRotationPoint(98.75F, -27F, -13.5F);

		bodyModel[1491].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, 0F); // Du loco part28
		bodyModel[1491].setRotationPoint(97.5F, -27.75F, 10.75F);

		bodyModel[1492].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, 0F); // Du loco part28
		bodyModel[1492].setRotationPoint(97.5F, -22.5F, 10.75F);

		bodyModel[1493].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[1493].setRotationPoint(98F, -27.5F, 10.75F);

		bodyModel[1494].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[1494].setRotationPoint(97.25F, -27F, 11F);

		bodyModel[1495].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, -0.5F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1495].setRotationPoint(97.5F, -27.75F, -11.75F);

		bodyModel[1496].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, -0.5F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1496].setRotationPoint(97.5F, -22.5F, -11.75F);

		bodyModel[1497].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[1497].setRotationPoint(98F, -27.5F, -11.75F);

		bodyModel[1498].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part28
		bodyModel[1498].setRotationPoint(97.25F, -27F, -12F);

		bodyModel[1499].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[1499].setRotationPoint(-5.5F, -27.75F, -11.75F);
	}

	private void initbodyModel_4()
	{
		bodyModel[1500] = new ModelRendererTurbo(this, 455, 22, textureX, textureY); // Du loco part28
		bodyModel[1501] = new ModelRendererTurbo(this, 447, 14, textureX, textureY); // Du loco part28
		bodyModel[1502] = new ModelRendererTurbo(this, 440, 15, textureX, textureY); // Du loco part28
		bodyModel[1503] = new ModelRendererTurbo(this, 448, 22, textureX, textureY); // Du loco part28
		bodyModel[1504] = new ModelRendererTurbo(this, 455, 22, textureX, textureY); // Du loco part28
		bodyModel[1505] = new ModelRendererTurbo(this, 447, 14, textureX, textureY); // Du loco part28
		bodyModel[1506] = new ModelRendererTurbo(this, 452, 15, textureX, textureY); // Du loco part28
		bodyModel[1507] = new ModelRendererTurbo(this, 631, 395, textureX, textureY); // Du loco part37
		bodyModel[1508] = new ModelRendererTurbo(this, 634, 361, textureX, textureY); // Du loco part37
		bodyModel[1509] = new ModelRendererTurbo(this, 626, 385, textureX, textureY); // Du loco part37
		bodyModel[1510] = new ModelRendererTurbo(this, 512, 341, textureX, textureY); // Du loco part37
		bodyModel[1511] = new ModelRendererTurbo(this, 512, 341, textureX, textureY); // Du loco part37
		bodyModel[1512] = new ModelRendererTurbo(this, 631, 395, textureX, textureY); // Du loco part37
		bodyModel[1513] = new ModelRendererTurbo(this, 631, 395, textureX, textureY); // Du loco part37
		bodyModel[1514] = new ModelRendererTurbo(this, 626, 385, textureX, textureY); // Du loco part37
		bodyModel[1515] = new ModelRendererTurbo(this, 634, 361, textureX, textureY); // Du loco part37
		bodyModel[1516] = new ModelRendererTurbo(this, 634, 361, textureX, textureY); // Du loco part37
		bodyModel[1517] = new ModelRendererTurbo(this, 627, 366, textureX, textureY); // Du loco part37
		bodyModel[1518] = new ModelRendererTurbo(this, 627, 366, textureX, textureY); // Du loco part37
		bodyModel[1519] = new ModelRendererTurbo(this, 633, 361, textureX, textureY); // Du loco part37
		bodyModel[1520] = new ModelRendererTurbo(this, 631, 395, textureX, textureY); // Du loco part37
		bodyModel[1521] = new ModelRendererTurbo(this, 634, 404, textureX, textureY); // Du loco part37
		bodyModel[1522] = new ModelRendererTurbo(this, 636, 356, textureX, textureY); // Du loco part37
		bodyModel[1523] = new ModelRendererTurbo(this, 632, 380, textureX, textureY); // Du loco part37
		bodyModel[1524] = new ModelRendererTurbo(this, 634, 404, textureX, textureY); // Du loco part37
		bodyModel[1525] = new ModelRendererTurbo(this, 625, 385, textureX, textureY); // Du loco part37
		bodyModel[1526] = new ModelRendererTurbo(this, 625, 385, textureX, textureY); // Du loco part37
		bodyModel[1527] = new ModelRendererTurbo(this, 626, 365, textureX, textureY); // Du loco part37
		bodyModel[1528] = new ModelRendererTurbo(this, 626, 365, textureX, textureY); // Du loco part37
		bodyModel[1529] = new ModelRendererTurbo(this, 607, 395, textureX, textureY); // Du loco part37
		bodyModel[1530] = new ModelRendererTurbo(this, 602, 361, textureX, textureY); // Du loco part37
		bodyModel[1531] = new ModelRendererTurbo(this, 602, 385, textureX, textureY); // Du loco part37
		bodyModel[1532] = new ModelRendererTurbo(this, 607, 395, textureX, textureY); // Du loco part37
		bodyModel[1533] = new ModelRendererTurbo(this, 607, 395, textureX, textureY); // Du loco part37
		bodyModel[1534] = new ModelRendererTurbo(this, 602, 385, textureX, textureY); // Du loco part37
		bodyModel[1535] = new ModelRendererTurbo(this, 602, 361, textureX, textureY); // Du loco part37
		bodyModel[1536] = new ModelRendererTurbo(this, 602, 361, textureX, textureY); // Du loco part37
		bodyModel[1537] = new ModelRendererTurbo(this, 595, 366, textureX, textureY); // Du loco part37
		bodyModel[1538] = new ModelRendererTurbo(this, 595, 366, textureX, textureY); // Du loco part37
		bodyModel[1539] = new ModelRendererTurbo(this, 601, 361, textureX, textureY); // Du loco part37
		bodyModel[1540] = new ModelRendererTurbo(this, 607, 395, textureX, textureY); // Du loco part37
		bodyModel[1541] = new ModelRendererTurbo(this, 610, 404, textureX, textureY); // Du loco part37
		bodyModel[1542] = new ModelRendererTurbo(this, 604, 356, textureX, textureY); // Du loco part37
		bodyModel[1543] = new ModelRendererTurbo(this, 608, 380, textureX, textureY); // Du loco part37
		bodyModel[1544] = new ModelRendererTurbo(this, 610, 404, textureX, textureY); // Du loco part37
		bodyModel[1545] = new ModelRendererTurbo(this, 601, 385, textureX, textureY); // Du loco part37
		bodyModel[1546] = new ModelRendererTurbo(this, 601, 385, textureX, textureY); // Du loco part37
		bodyModel[1547] = new ModelRendererTurbo(this, 594, 365, textureX, textureY); // Du loco part37
		bodyModel[1548] = new ModelRendererTurbo(this, 594, 365, textureX, textureY); // Du loco part37
		bodyModel[1549] = new ModelRendererTurbo(this, 25, 10, textureX, textureY); // Box 149
		bodyModel[1550] = new ModelRendererTurbo(this, 34, 8, textureX, textureY); // Box 149
		bodyModel[1551] = new ModelRendererTurbo(this, 25, 8, textureX, textureY); // Box 149
		bodyModel[1552] = new ModelRendererTurbo(this, 27, 7, textureX, textureY); // Box 149
		bodyModel[1553] = new ModelRendererTurbo(this, 33, 6, textureX, textureY); // Box 149
		bodyModel[1554] = new ModelRendererTurbo(this, 46, 5, textureX, textureY); // Box 149
		bodyModel[1555] = new ModelRendererTurbo(this, 34, 7, textureX, textureY); // Box 149
		bodyModel[1556] = new ModelRendererTurbo(this, 39, 7, textureX, textureY); // Box 149
		bodyModel[1557] = new ModelRendererTurbo(this, 43, 15, textureX, textureY); // Box 149
		bodyModel[1558] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 149
		bodyModel[1559] = new ModelRendererTurbo(this, 51, 7, textureX, textureY); // Box 149
		bodyModel[1560] = new ModelRendererTurbo(this, 47, 10, textureX, textureY); // Box 149
		bodyModel[1561] = new ModelRendererTurbo(this, 45, 11, textureX, textureY); // Box 149
		bodyModel[1562] = new ModelRendererTurbo(this, 47, 9, textureX, textureY); // Box 149
		bodyModel[1563] = new ModelRendererTurbo(this, 31, 13, textureX, textureY); // Box 149
		bodyModel[1564] = new ModelRendererTurbo(this, 44, 13, textureX, textureY); // Box 149
		bodyModel[1565] = new ModelRendererTurbo(this, 47, 7, textureX, textureY); // Box 149
		bodyModel[1566] = new ModelRendererTurbo(this, 41, 6, textureX, textureY); // Box 149
		bodyModel[1567] = new ModelRendererTurbo(this, 41, 10, textureX, textureY); // Box 149
		bodyModel[1568] = new ModelRendererTurbo(this, 47, 6, textureX, textureY); // Box 149
		bodyModel[1569] = new ModelRendererTurbo(this, 43, 9, textureX, textureY); // Box 149
		bodyModel[1570] = new ModelRendererTurbo(this, 44, 12, textureX, textureY); // Box 149
		bodyModel[1571] = new ModelRendererTurbo(this, 47, 14, textureX, textureY); // Box 149
		bodyModel[1572] = new ModelRendererTurbo(this, 39, 16, textureX, textureY); // Box 149
		bodyModel[1573] = new ModelRendererTurbo(this, 38, 14, textureX, textureY); // Box 149
		bodyModel[1574] = new ModelRendererTurbo(this, 36, 9, textureX, textureY); // Box 149
		bodyModel[1575] = new ModelRendererTurbo(this, 36, 15, textureX, textureY); // Box 149
		bodyModel[1576] = new ModelRendererTurbo(this, 40, 8, textureX, textureY); // Box 149
		bodyModel[1577] = new ModelRendererTurbo(this, 71, 4, textureX, textureY); // Box 149
		bodyModel[1578] = new ModelRendererTurbo(this, 40, 7, textureX, textureY); // Box 149
		bodyModel[1579] = new ModelRendererTurbo(this, 46, 8, textureX, textureY); // Box 149
		bodyModel[1580] = new ModelRendererTurbo(this, 47, 6, textureX, textureY); // Box 149
		bodyModel[1581] = new ModelRendererTurbo(this, 46, 13, textureX, textureY); // Box 149
		bodyModel[1582] = new ModelRendererTurbo(this, 41, 13, textureX, textureY); // Box 149
		bodyModel[1583] = new ModelRendererTurbo(this, 71, 4, textureX, textureY); // Box 149
		bodyModel[1584] = new ModelRendererTurbo(this, 71, 4, textureX, textureY); // Box 149
		bodyModel[1585] = new ModelRendererTurbo(this, 71, 4, textureX, textureY); // Box 149
		bodyModel[1586] = new ModelRendererTurbo(this, 45, 6, textureX, textureY); // Box 149
		bodyModel[1587] = new ModelRendererTurbo(this, 43, 7, textureX, textureY); // Box 149
		bodyModel[1588] = new ModelRendererTurbo(this, 50, 13, textureX, textureY); // Box 149
		bodyModel[1589] = new ModelRendererTurbo(this, 52, 18, textureX, textureY); // Box 149
		bodyModel[1590] = new ModelRendererTurbo(this, 48, 12, textureX, textureY); // Box 149
		bodyModel[1591] = new ModelRendererTurbo(this, 48, 16, textureX, textureY); // Box 149
		bodyModel[1592] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // Box 149
		bodyModel[1593] = new ModelRendererTurbo(this, 45, 10, textureX, textureY); // Box 149
		bodyModel[1594] = new ModelRendererTurbo(this, 47, 13, textureX, textureY); // Box 149
		bodyModel[1595] = new ModelRendererTurbo(this, 46, 14, textureX, textureY); // Box 149
		bodyModel[1596] = new ModelRendererTurbo(this, 49, 15, textureX, textureY); // Box 149
		bodyModel[1597] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Du loco part100
		bodyModel[1598] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Du loco part102
		bodyModel[1599] = new ModelRendererTurbo(this, 121, 11, textureX, textureY); // Du loco part82
		bodyModel[1600] = new ModelRendererTurbo(this, 104, 17, textureX, textureY); // Du loco part82
		bodyModel[1601] = new ModelRendererTurbo(this, 126, 4, textureX, textureY); // Du loco part82
		bodyModel[1602] = new ModelRendererTurbo(this, 74, 12, textureX, textureY); // Du loco part82
		bodyModel[1603] = new ModelRendererTurbo(this, 90, 12, textureX, textureY); // Du loco part82
		bodyModel[1604] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[1605] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[1606] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[1607] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[1608] = new ModelRendererTurbo(this, 152, 1, textureX, textureY); // Du loco part82
		bodyModel[1609] = new ModelRendererTurbo(this, 135, 5, textureX, textureY); // Du loco part82
		bodyModel[1610] = new ModelRendererTurbo(this, 112, 9, textureX, textureY); // Du loco part82
		bodyModel[1611] = new ModelRendererTurbo(this, 79, 18, textureX, textureY); // Du loco part82
		bodyModel[1612] = new ModelRendererTurbo(this, 136, 22, textureX, textureY); // Du loco part82
		bodyModel[1613] = new ModelRendererTurbo(this, 100, 29, textureX, textureY); // Du loco part82
		bodyModel[1614] = new ModelRendererTurbo(this, 152, 1, textureX, textureY); // Du loco part82
		bodyModel[1615] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1616] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1617] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1618] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1619] = new ModelRendererTurbo(this, 128, 1, textureX, textureY); // Du loco part82
		bodyModel[1620] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1621] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1622] = new ModelRendererTurbo(this, 142, 5, textureX, textureY); // Du loco part82
		bodyModel[1623] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Du loco part83
		bodyModel[1624] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Du loco part84
		bodyModel[1625] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Du loco part85
		bodyModel[1626] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Du loco part94
		bodyModel[1627] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Du loco part95
		bodyModel[1628] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Du loco part97
		bodyModel[1629] = new ModelRendererTurbo(this, 87, 2, textureX, textureY); // Du loco part100
		bodyModel[1630] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Du loco part101
		bodyModel[1631] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 177
		bodyModel[1632] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 194
		bodyModel[1633] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 195
		bodyModel[1634] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Du loco part100
		bodyModel[1635] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Du loco part102
		bodyModel[1636] = new ModelRendererTurbo(this, 119, 30, textureX, textureY); // Du loco part82
		bodyModel[1637] = new ModelRendererTurbo(this, 119, 19, textureX, textureY); // Du loco part82
		bodyModel[1638] = new ModelRendererTurbo(this, 158, 15, textureX, textureY); // Du loco part82
		bodyModel[1639] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Du loco part83
		bodyModel[1640] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Du loco part84
		bodyModel[1641] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Du loco part85
		bodyModel[1642] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Du loco part94
		bodyModel[1643] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Du loco part95
		bodyModel[1644] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Du loco part97
		bodyModel[1645] = new ModelRendererTurbo(this, 99, 2, textureX, textureY); // Du loco part100
		bodyModel[1646] = new ModelRendererTurbo(this, 392, 6, textureX, textureY); // Du loco part101
		bodyModel[1647] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 177
		bodyModel[1648] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 194
		bodyModel[1649] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 195
		bodyModel[1650] = new ModelRendererTurbo(this, 87, 24, textureX, textureY); // Du loco part100
		bodyModel[1651] = new ModelRendererTurbo(this, 397, 6, textureX, textureY); // Du loco part102
		bodyModel[1652] = new ModelRendererTurbo(this, 121, 11, textureX, textureY); // Du loco part82
		bodyModel[1653] = new ModelRendererTurbo(this, 104, 12, textureX, textureY); // Du loco part82
		bodyModel[1654] = new ModelRendererTurbo(this, 74, 12, textureX, textureY); // Du loco part82
		bodyModel[1655] = new ModelRendererTurbo(this, 90, 12, textureX, textureY); // Du loco part82
		bodyModel[1656] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[1657] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[1658] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[1659] = new ModelRendererTurbo(this, 147, 1, textureX, textureY); // Du loco part82
		bodyModel[1660] = new ModelRendererTurbo(this, 152, 1, textureX, textureY); // Du loco part82
		bodyModel[1661] = new ModelRendererTurbo(this, 135, 5, textureX, textureY); // Du loco part82
		bodyModel[1662] = new ModelRendererTurbo(this, 112, 9, textureX, textureY); // Du loco part82
		bodyModel[1663] = new ModelRendererTurbo(this, 70, 18, textureX, textureY); // Du loco part82
		bodyModel[1664] = new ModelRendererTurbo(this, 178, 17, textureX, textureY); // Du loco part82
		bodyModel[1665] = new ModelRendererTurbo(this, 194, 3, textureX, textureY); // Du loco part82
		bodyModel[1666] = new ModelRendererTurbo(this, 152, 1, textureX, textureY); // Du loco part82
		bodyModel[1667] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1668] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1669] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1670] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1671] = new ModelRendererTurbo(this, 128, 1, textureX, textureY); // Du loco part82
		bodyModel[1672] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1673] = new ModelRendererTurbo(this, 133, 3, textureX, textureY); // Du loco part82
		bodyModel[1674] = new ModelRendererTurbo(this, 142, 5, textureX, textureY); // Du loco part82
		bodyModel[1675] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Du loco part83
		bodyModel[1676] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Du loco part84
		bodyModel[1677] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Du loco part85
		bodyModel[1678] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Du loco part94
		bodyModel[1679] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Du loco part95
		bodyModel[1680] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Du loco part97
		bodyModel[1681] = new ModelRendererTurbo(this, 99, 2, textureX, textureY); // Du loco part100
		bodyModel[1682] = new ModelRendererTurbo(this, 392, 6, textureX, textureY); // Du loco part101
		bodyModel[1683] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 194
		bodyModel[1684] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 195
		bodyModel[1685] = new ModelRendererTurbo(this, 87, 24, textureX, textureY); // Du loco part100
		bodyModel[1686] = new ModelRendererTurbo(this, 397, 6, textureX, textureY); // Du loco part102
		bodyModel[1687] = new ModelRendererTurbo(this, 158, 4, textureX, textureY); // Du loco part82
		bodyModel[1688] = new ModelRendererTurbo(this, 176, 4, textureX, textureY); // Du loco part82
		bodyModel[1689] = new ModelRendererTurbo(this, 9, 9, textureX, textureY); // Box 177
		bodyModel[1690] = new ModelRendererTurbo(this, 126, 4, textureX, textureY); // Du loco part82
		bodyModel[1691] = new ModelRendererTurbo(this, 1, 451, textureX, textureY); // Du loco part08
		bodyModel[1692] = new ModelRendererTurbo(this, 17, 457, textureX, textureY); // Du loco part08
		bodyModel[1693] = new ModelRendererTurbo(this, 22, 461, textureX, textureY); // Du loco part08
		bodyModel[1694] = new ModelRendererTurbo(this, 24, 459, textureX, textureY); // Du loco part08
		bodyModel[1695] = new ModelRendererTurbo(this, 1, 451, textureX, textureY); // Du loco part08
		bodyModel[1696] = new ModelRendererTurbo(this, 17, 457, textureX, textureY); // Du loco part08
		bodyModel[1697] = new ModelRendererTurbo(this, 22, 461, textureX, textureY); // Du loco part08
		bodyModel[1698] = new ModelRendererTurbo(this, 24, 459, textureX, textureY); // Du loco part08
		bodyModel[1699] = new ModelRendererTurbo(this, 455, 404, textureX, textureY); // Du loco part82
		bodyModel[1700] = new ModelRendererTurbo(this, 404, 444, textureX, textureY); // Du loco part82
		bodyModel[1701] = new ModelRendererTurbo(this, 454, 444, textureX, textureY); // Du loco part82
		bodyModel[1702] = new ModelRendererTurbo(this, 491, 444, textureX, textureY); // Du loco part82
		bodyModel[1703] = new ModelRendererTurbo(this, 1, 512, textureX, textureY); // Box 135
		bodyModel[1704] = new ModelRendererTurbo(this, 1, 573, textureX, textureY); // Box 135
		bodyModel[1705] = new ModelRendererTurbo(this, 326, 505, textureX, textureY); // Du loco part19
		bodyModel[1706] = new ModelRendererTurbo(this, 457, 505, textureX, textureY); // Du loco part19
		bodyModel[1707] = new ModelRendererTurbo(this, 326, 634, textureX, textureY); // Du loco part19
		bodyModel[1708] = new ModelRendererTurbo(this, 455, 634, textureX, textureY); // Du loco part19
		bodyModel[1709] = new ModelRendererTurbo(this, 147, 689, textureX, textureY); // Du loco part19
		bodyModel[1710] = new ModelRendererTurbo(this, 105, 719, textureX, textureY); // Du loco part19
		bodyModel[1711] = new ModelRendererTurbo(this, 1, 689, textureX, textureY); // Du loco part19
		bodyModel[1712] = new ModelRendererTurbo(this, 251, 689, textureX, textureY); // Du loco part19
		bodyModel[1713] = new ModelRendererTurbo(this, 355, 719, textureX, textureY); // Du loco part19
		bodyModel[1714] = new ModelRendererTurbo(this, 397, 689, textureX, textureY); // Du loco part19
		bodyModel[1715] = new ModelRendererTurbo(this, 543, 395, textureX, textureY); // Du loco part37
		bodyModel[1716] = new ModelRendererTurbo(this, 539, 361, textureX, textureY); // Du loco part37
		bodyModel[1717] = new ModelRendererTurbo(this, 538, 385, textureX, textureY); // Du loco part37
		bodyModel[1718] = new ModelRendererTurbo(this, 512, 341, textureX, textureY); // Du loco part37
		bodyModel[1719] = new ModelRendererTurbo(this, 512, 341, textureX, textureY); // Du loco part37
		bodyModel[1720] = new ModelRendererTurbo(this, 512, 355, textureX, textureY); // Du loco part37
		bodyModel[1721] = new ModelRendererTurbo(this, 543, 395, textureX, textureY); // Du loco part37
		bodyModel[1722] = new ModelRendererTurbo(this, 543, 395, textureX, textureY); // Du loco part37
		bodyModel[1723] = new ModelRendererTurbo(this, 538, 385, textureX, textureY); // Du loco part37
		bodyModel[1724] = new ModelRendererTurbo(this, 539, 361, textureX, textureY); // Du loco part37
		bodyModel[1725] = new ModelRendererTurbo(this, 539, 361, textureX, textureY); // Du loco part37
		bodyModel[1726] = new ModelRendererTurbo(this, 532, 366, textureX, textureY); // Du loco part37
		bodyModel[1727] = new ModelRendererTurbo(this, 532, 366, textureX, textureY); // Du loco part37
		bodyModel[1728] = new ModelRendererTurbo(this, 538, 361, textureX, textureY); // Du loco part37
		bodyModel[1729] = new ModelRendererTurbo(this, 543, 395, textureX, textureY); // Du loco part37
		bodyModel[1730] = new ModelRendererTurbo(this, 546, 404, textureX, textureY); // Du loco part37
		bodyModel[1731] = new ModelRendererTurbo(this, 541, 356, textureX, textureY); // Du loco part37
		bodyModel[1732] = new ModelRendererTurbo(this, 544, 380, textureX, textureY); // Du loco part37
		bodyModel[1733] = new ModelRendererTurbo(this, 546, 404, textureX, textureY); // Du loco part37
		bodyModel[1734] = new ModelRendererTurbo(this, 537, 385, textureX, textureY); // Du loco part37
		bodyModel[1735] = new ModelRendererTurbo(this, 537, 385, textureX, textureY); // Du loco part37
		bodyModel[1736] = new ModelRendererTurbo(this, 531, 365, textureX, textureY); // Du loco part37
		bodyModel[1737] = new ModelRendererTurbo(this, 531, 365, textureX, textureY); // Du loco part37
		bodyModel[1738] = new ModelRendererTurbo(this, 569, 395, textureX, textureY); // Du loco part37
		bodyModel[1739] = new ModelRendererTurbo(this, 568, 361, textureX, textureY); // Du loco part37
		bodyModel[1740] = new ModelRendererTurbo(this, 564, 385, textureX, textureY); // Du loco part37
		bodyModel[1741] = new ModelRendererTurbo(this, 512, 355, textureX, textureY); // Du loco part37
		bodyModel[1742] = new ModelRendererTurbo(this, 569, 395, textureX, textureY); // Du loco part37
		bodyModel[1743] = new ModelRendererTurbo(this, 569, 395, textureX, textureY); // Du loco part37
		bodyModel[1744] = new ModelRendererTurbo(this, 564, 385, textureX, textureY); // Du loco part37
		bodyModel[1745] = new ModelRendererTurbo(this, 568, 361, textureX, textureY); // Du loco part37
		bodyModel[1746] = new ModelRendererTurbo(this, 568, 361, textureX, textureY); // Du loco part37
		bodyModel[1747] = new ModelRendererTurbo(this, 561, 366, textureX, textureY); // Du loco part37
		bodyModel[1748] = new ModelRendererTurbo(this, 561, 366, textureX, textureY); // Du loco part37
		bodyModel[1749] = new ModelRendererTurbo(this, 567, 361, textureX, textureY); // Du loco part37
		bodyModel[1750] = new ModelRendererTurbo(this, 569, 395, textureX, textureY); // Du loco part37
		bodyModel[1751] = new ModelRendererTurbo(this, 572, 404, textureX, textureY); // Du loco part37
		bodyModel[1752] = new ModelRendererTurbo(this, 570, 356, textureX, textureY); // Du loco part37
		bodyModel[1753] = new ModelRendererTurbo(this, 570, 380, textureX, textureY); // Du loco part37
		bodyModel[1754] = new ModelRendererTurbo(this, 572, 404, textureX, textureY); // Du loco part37
		bodyModel[1755] = new ModelRendererTurbo(this, 563, 385, textureX, textureY); // Du loco part37
		bodyModel[1756] = new ModelRendererTurbo(this, 563, 385, textureX, textureY); // Du loco part37
		bodyModel[1757] = new ModelRendererTurbo(this, 560, 365, textureX, textureY); // Du loco part37
		bodyModel[1758] = new ModelRendererTurbo(this, 560, 365, textureX, textureY); // Du loco part37
		bodyModel[1759] = new ModelRendererTurbo(this, 497, 321, textureX, textureY); // Box 0
		bodyModel[1760] = new ModelRendererTurbo(this, 505, 321, textureX, textureY); // Box 0
		bodyModel[1761] = new ModelRendererTurbo(this, 497, 329, textureX, textureY); // Box 0
		bodyModel[1762] = new ModelRendererTurbo(this, 505, 329, textureX, textureY); // Box 0
		bodyModel[1763] = new ModelRendererTurbo(this, 57, 337, textureX, textureY); // Box 0
		bodyModel[1764] = new ModelRendererTurbo(this, 89, 337, textureX, textureY); // Box 0
		bodyModel[1765] = new ModelRendererTurbo(this, 97, 337, textureX, textureY); // Box 0
		bodyModel[1766] = new ModelRendererTurbo(this, 105, 337, textureX, textureY); // Box 0
		bodyModel[1767] = new ModelRendererTurbo(this, 145, 337, textureX, textureY); // Box 0
		bodyModel[1768] = new ModelRendererTurbo(this, 153, 337, textureX, textureY); // Box 0
		bodyModel[1769] = new ModelRendererTurbo(this, 535, 14, textureX, textureY); // Box 168
		bodyModel[1770] = new ModelRendererTurbo(this, 546, 14, textureX, textureY); // Box 168
		bodyModel[1771] = new ModelRendererTurbo(this, 589, 15, textureX, textureY); // Box 168
		bodyModel[1772] = new ModelRendererTurbo(this, 591, 21, textureX, textureY); // Box 168
		bodyModel[1773] = new ModelRendererTurbo(this, 522, 22, textureX, textureY); // Box 168
		bodyModel[1774] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1775] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1776] = new ModelRendererTurbo(this, 534, 40, textureX, textureY); // Box 168
		bodyModel[1777] = new ModelRendererTurbo(this, 545, 40, textureX, textureY); // Box 168
		bodyModel[1778] = new ModelRendererTurbo(this, 589, 46, textureX, textureY); // Box 168
		bodyModel[1779] = new ModelRendererTurbo(this, 590, 52, textureX, textureY); // Box 168
		bodyModel[1780] = new ModelRendererTurbo(this, 523, 48, textureX, textureY); // Box 168
		bodyModel[1781] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1782] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1783] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1784] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1785] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1786] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1787] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1788] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1789] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1790] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1791] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1792] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1793] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1794] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1795] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1796] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1797] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1798] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1799] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1800] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1801] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1802] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1803] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1804] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1805] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1806] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1807] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1808] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1809] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1810] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1811] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1812] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1813] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1814] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1815] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1816] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1817] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1818] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1819] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1820] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1821] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1822] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1823] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1824] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1825] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1826] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1827] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1828] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1829] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1830] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1831] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1832] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1833] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1834] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1835] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1836] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1837] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1838] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1839] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1840] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1841] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1842] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1843] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1844] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1845] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1846] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1847] = new ModelRendererTurbo(this, 535, 14, textureX, textureY); // Box 168
		bodyModel[1848] = new ModelRendererTurbo(this, 546, 14, textureX, textureY); // Box 168
		bodyModel[1849] = new ModelRendererTurbo(this, 589, 15, textureX, textureY); // Box 168
		bodyModel[1850] = new ModelRendererTurbo(this, 591, 21, textureX, textureY); // Box 168
		bodyModel[1851] = new ModelRendererTurbo(this, 522, 22, textureX, textureY); // Box 168
		bodyModel[1852] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1853] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1854] = new ModelRendererTurbo(this, 534, 40, textureX, textureY); // Box 168
		bodyModel[1855] = new ModelRendererTurbo(this, 545, 40, textureX, textureY); // Box 168
		bodyModel[1856] = new ModelRendererTurbo(this, 589, 46, textureX, textureY); // Box 168
		bodyModel[1857] = new ModelRendererTurbo(this, 590, 52, textureX, textureY); // Box 168
		bodyModel[1858] = new ModelRendererTurbo(this, 523, 48, textureX, textureY); // Box 168
		bodyModel[1859] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1860] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1861] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1862] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1863] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1864] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1865] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1866] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1867] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1868] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1869] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1870] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1871] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1872] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1873] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1874] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1875] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1876] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1877] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1878] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1879] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1880] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1881] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1882] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1883] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1884] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1885] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1886] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1887] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1888] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1889] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1890] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1891] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1892] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1893] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1894] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1895] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1896] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1897] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1898] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1899] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1900] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1901] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1902] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1903] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1904] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1905] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1906] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1907] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1908] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1909] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1910] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1911] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1912] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1913] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1914] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1915] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1916] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1917] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1918] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1919] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1920] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1921] = new ModelRendererTurbo(this, 542, 13, textureX, textureY); // Box 168
		bodyModel[1922] = new ModelRendererTurbo(this, 534, 13, textureX, textureY); // Box 168
		bodyModel[1923] = new ModelRendererTurbo(this, 541, 39, textureX, textureY); // Box 168
		bodyModel[1924] = new ModelRendererTurbo(this, 533, 39, textureX, textureY); // Box 168
		bodyModel[1925] = new ModelRendererTurbo(this, 584, 634, textureX, textureY); // Du loco part19
		bodyModel[1926] = new ModelRendererTurbo(this, 713, 634, textureX, textureY); // Du loco part19
		bodyModel[1927] = new ModelRendererTurbo(this, 713, 634, textureX, textureY); // Du loco part19
		bodyModel[1928] = new ModelRendererTurbo(this, 584, 634, textureX, textureY); // Du loco part19

		bodyModel[1500].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[1500].setRotationPoint(-5.5F, -22.5F, -11.75F);

		bodyModel[1501].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part28
		bodyModel[1501].setRotationPoint(-4.25F, -27.5F, -11.75F);

		bodyModel[1502].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,-0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part28
		bodyModel[1502].setRotationPoint(-5F, -27F, -12F);

		bodyModel[1503].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1503].setRotationPoint(-5.5F, -27.75F, 10.75F);

		bodyModel[1504].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, -0.5F, -0.75F, -0.75F, -0.5F, -0.75F, 0F, 0F, -0.75F, -0.75F); // Du loco part28
		bodyModel[1504].setRotationPoint(-5.5F, -22.5F, 10.75F);

		bodyModel[1505].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[1505].setRotationPoint(-4.25F, -27.5F, 10.75F);

		bodyModel[1506].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[1506].setRotationPoint(-5F, -27F, 11F);

		bodyModel[1507].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3F, 0F); // Du loco part37
		bodyModel[1507].setRotationPoint(7F, -42F, -0.5F);

		bodyModel[1508].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Du loco part37
		bodyModel[1508].setRotationPoint(9F, -37F, 0.5F);

		bodyModel[1509].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,0F, -5F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -6F, -1F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1509].setRotationPoint(8F, -47F, -2.5F);

		bodyModel[1510].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[1510].setRotationPoint(18F, -34F, -6F);

		bodyModel[1511].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[1511].setRotationPoint(10F, -34F, -6F);

		bodyModel[1512].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -0.25F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F); // Du loco part37
		bodyModel[1512].setRotationPoint(10F, -40F, -1.5F);

		bodyModel[1513].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -0.25F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F); // Du loco part37
		bodyModel[1513].setRotationPoint(10F, -40F, 0.5F);

		bodyModel[1514].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,0F, -5F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, -1F); // Du loco part37
		bodyModel[1514].setRotationPoint(8F, -47F, 0.5F);

		bodyModel[1515].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Du loco part37
		bodyModel[1515].setRotationPoint(5F, -37F, -0.5F);

		bodyModel[1516].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Du loco part37
		bodyModel[1516].setRotationPoint(9F, -37F, -1.5F);

		bodyModel[1517].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -0.5F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -0.5F, 0F); // Du loco part37
		bodyModel[1517].setRotationPoint(5F, -37F, -2.5F);

		bodyModel[1518].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -0.5F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -0.5F, -1F); // Du loco part37
		bodyModel[1518].setRotationPoint(5F, -37F, 0.5F);

		bodyModel[1519].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.5F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -1F, -0.25F); // Du loco part37
		bodyModel[1519].setRotationPoint(4F, -36F, -0.5F);

		bodyModel[1520].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, -0.25F, -0.25F, 0F, -6.25F, -0.25F, 0F, -6.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -6.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -6.25F, -0.25F); // Du loco part37
		bodyModel[1520].setRotationPoint(6F, -41F, -0.5F);

		bodyModel[1521].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part37
		bodyModel[1521].setRotationPoint(6F, -42F, -1F);

		bodyModel[1522].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part37
		bodyModel[1522].setRotationPoint(4F, -36.5F, -1.5F);

		bodyModel[1523].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part37
		bodyModel[1523].setRotationPoint(7F, -42F, -1.5F);

		bodyModel[1524].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part37
		bodyModel[1524].setRotationPoint(6F, -42F, 0F);

		bodyModel[1525].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, -5F, -3F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1525].setRotationPoint(8F, -47F, -2.5F);

		bodyModel[1526].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, -3F); // Du loco part37
		bodyModel[1526].setRotationPoint(8F, -47F, -1.5F);

		bodyModel[1527].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -0.5F, 0F); // Du loco part37
		bodyModel[1527].setRotationPoint(5F, -37F, -2.5F);

		bodyModel[1528].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, -0.5F, -3F); // Du loco part37
		bodyModel[1528].setRotationPoint(5F, -37F, -1.5F);

		bodyModel[1529].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.25F, 0F); // Du loco part37
		bodyModel[1529].setRotationPoint(83F, -42F, -0.5F);

		bodyModel[1530].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1530].setRotationPoint(80F, -37F, 0.5F);

		bodyModel[1531].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,-1F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, 0F, -1F, 0F, -1F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -6F, -1F); // Du loco part37
		bodyModel[1531].setRotationPoint(78F, -47F, -2.5F);

		bodyModel[1532].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1532].setRotationPoint(80F, -40F, -1.5F);

		bodyModel[1533].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1533].setRotationPoint(80F, -40F, 0.5F);

		bodyModel[1534].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,-1F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, -1F, -1F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, 0F); // Du loco part37
		bodyModel[1534].setRotationPoint(78F, -47F, 0.5F);

		bodyModel[1535].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F); // Du loco part37
		bodyModel[1535].setRotationPoint(84F, -37F, -0.5F);

		bodyModel[1536].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1536].setRotationPoint(80F, -37F, -1.5F);

		bodyModel[1537].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,-1F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -1F, 0F, -1F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -2F, -1F); // Du loco part37
		bodyModel[1537].setRotationPoint(78F, -37F, -2.5F);

		bodyModel[1538].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,-1F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -1F, 0F, 0F, 0F, -2F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -2F, 0F); // Du loco part37
		bodyModel[1538].setRotationPoint(78F, -37F, 0.5F);

		bodyModel[1539].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -1.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part37
		bodyModel[1539].setRotationPoint(84F, -36F, -0.5F);

		bodyModel[1540].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, -6.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -6.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -6.25F, -0.25F, 0F, -6.25F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part37
		bodyModel[1540].setRotationPoint(84F, -41F, -0.5F);

		bodyModel[1541].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F); // Du loco part37
		bodyModel[1541].setRotationPoint(87F, -42F, -1F);

		bodyModel[1542].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part37
		bodyModel[1542].setRotationPoint(89F, -36.5F, -1.5F);

		bodyModel[1543].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part37
		bodyModel[1543].setRotationPoint(86F, -42F, -1.5F);

		bodyModel[1544].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F); // Du loco part37
		bodyModel[1544].setRotationPoint(87F, -42F, 0F);

		bodyModel[1545].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,0F, 0F, 0F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5F, -3F); // Du loco part37
		bodyModel[1545].setRotationPoint(79F, -47F, -2.5F);

		bodyModel[1546].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,0F, 0F, -3F, 0F, -5F, 0F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, 0F); // Du loco part37
		bodyModel[1546].setRotationPoint(79F, -47F, -1.5F);

		bodyModel[1547].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -1F, -3F); // Du loco part37
		bodyModel[1547].setRotationPoint(79F, -37F, -2.5F);

		bodyModel[1548].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -1F, 0F); // Du loco part37
		bodyModel[1548].setRotationPoint(79F, -37F, -1.5F);

		bodyModel[1549].addBox(0F, 0F, 0F, 9, 5, 10, 0F); // Box 149
		bodyModel[1549].setRotationPoint(48F, -17F, -5F);

		bodyModel[1550].addBox(0F, 0F, 0F, 4, 17, 7, 0F); // Box 149
		bodyModel[1550].setRotationPoint(58F, -29F, -6F);

		bodyModel[1551].addBox(0F, 0F, 0F, 9, 17, 12, 0F); // Box 149
		bodyModel[1551].setRotationPoint(36F, -29F, -6F);

		bodyModel[1552].addBox(0F, 0F, 0F, 7, 17, 11, 0F); // Box 149
		bodyModel[1552].setRotationPoint(29F, -29F, -5F);

		bodyModel[1553].addBox(0F, 0F, 0F, 2, 17, 12, 0F); // Box 149
		bodyModel[1553].setRotationPoint(45F, -29F, -6F);

		bodyModel[1554].addBox(0F, 0F, 0F, 5, 12, 4, 0F); // Box 149
		bodyModel[1554].setRotationPoint(8F, -24F, 1F);

		bodyModel[1555].addBox(0F, 0F, 0F, 6, 17, 9, 0F); // Box 149
		bodyModel[1555].setRotationPoint(13F, -29F, -5F);

		bodyModel[1556].addBox(0F, 0F, 0F, 6, 17, 3, 0F); // Box 149
		bodyModel[1556].setRotationPoint(19F, -29F, 1F);

		bodyModel[1557].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1557].setRotationPoint(8.5F, -29F, -1F);

		bodyModel[1558].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1558].setRotationPoint(10.5F, -29F, -1F);

		bodyModel[1559].addShapeBox(0F, 0F, 0F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 149
		bodyModel[1559].setRotationPoint(20.5F, -30F, -1.5F);

		bodyModel[1560].addShapeBox(0F, 0F, 0F, 2, 18, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 149
		bodyModel[1560].setRotationPoint(22.5F, -30F, -1.5F);

		bodyModel[1561].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1561].setRotationPoint(20.5F, -30F, -3.5F);

		bodyModel[1562].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1562].setRotationPoint(22.5F, -30F, -3.5F);

		bodyModel[1563].addBox(0F, 0F, 0F, 10, 8, 5, 0F); // Box 149
		bodyModel[1563].setRotationPoint(19F, -20F, -5F);

		bodyModel[1564].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 149
		bodyModel[1564].setRotationPoint(8.5F, -29F, 1F);

		bodyModel[1565].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 149
		bodyModel[1565].setRotationPoint(10.5F, -29F, 1F);

		bodyModel[1566].addBox(0F, 0F, 0F, 6, 17, 4, 0F); // Box 149
		bodyModel[1566].setRotationPoint(68F, -29F, -5F);

		bodyModel[1567].addBox(0F, 0F, 0F, 5, 12, 4, 0F); // Box 149
		bodyModel[1567].setRotationPoint(68F, -24F, 2F);

		bodyModel[1568].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1568].setRotationPoint(68.5F, -29F, 0F);

		bodyModel[1569].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1569].setRotationPoint(70.5F, -29F, 0F);

		bodyModel[1570].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 149
		bodyModel[1570].setRotationPoint(68.5F, -29F, 2F);

		bodyModel[1571].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 149
		bodyModel[1571].setRotationPoint(70.5F, -29F, 2F);

		bodyModel[1572].addBox(0F, 0F, 0F, 6, 3, 4, 0F); // Box 149
		bodyModel[1572].setRotationPoint(74F, -29F, 2F);

		bodyModel[1573].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 149
		bodyModel[1573].setRotationPoint(74F, -26F, 2F);

		bodyModel[1574].addBox(0F, 0F, 0F, 4, 3, 8, 0F); // Box 149
		bodyModel[1574].setRotationPoint(75F, -22F, -2F);

		bodyModel[1575].addBox(0F, 0F, 0F, 4, 2, 7, 0F); // Box 149
		bodyModel[1575].setRotationPoint(75F, -19F, -2F);

		bodyModel[1576].addBox(0F, 0F, 0F, 4, 5, 8, 0F); // Box 149
		bodyModel[1576].setRotationPoint(75F, -17F, -2F);

		bodyModel[1577].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1577].setRotationPoint(80F, -26F, 1F);

		bodyModel[1578].addBox(0F, 0F, 0F, 5, 12, 4, 0F); // Box 149
		bodyModel[1578].setRotationPoint(79F, -24F, -5F);

		bodyModel[1579].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F); // Box 149
		bodyModel[1579].setRotationPoint(79.5F, -29F, -1F);

		bodyModel[1580].addShapeBox(0F, 0F, 0F, 2, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 149
		bodyModel[1580].setRotationPoint(81.5F, -29F, -1F);

		bodyModel[1581].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1581].setRotationPoint(79.5F, -29F, -3F);

		bodyModel[1582].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1582].setRotationPoint(81.5F, -29F, -3F);

		bodyModel[1583].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1583].setRotationPoint(82F, -26F, 1F);

		bodyModel[1584].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F); // Box 149
		bodyModel[1584].setRotationPoint(80F, -24F, 1F);

		bodyModel[1585].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1585].setRotationPoint(82F, -24F, 1F);

		bodyModel[1586].addBox(0F, 0F, 0F, 4, 7, 4, 0F); // Box 149
		bodyModel[1586].setRotationPoint(79F, -19F, 2F);

		bodyModel[1587].addBox(0F, 0F, 0F, 5, 14, 2, 0F); // Box 149
		bodyModel[1587].setRotationPoint(79F, -26F, 0F);

		bodyModel[1588].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1588].setRotationPoint(74.5F, -17F, -4F);

		bodyModel[1589].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1589].setRotationPoint(75.5F, -17F, -4F);

		bodyModel[1590].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 149
		bodyModel[1590].setRotationPoint(74.5F, -17F, -3F);

		bodyModel[1591].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 149
		bodyModel[1591].setRotationPoint(75.5F, -17F, -3F);

		bodyModel[1592].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1592].setRotationPoint(76.5F, -17F, -4F);

		bodyModel[1593].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[1593].setRotationPoint(77.5F, -17F, -4F);

		bodyModel[1594].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Box 149
		bodyModel[1594].setRotationPoint(76.5F, -17F, -3F);

		bodyModel[1595].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Box 149
		bodyModel[1595].setRotationPoint(77.5F, -17F, -3F);

		bodyModel[1596].addBox(0F, 0F, 0F, 3, 3, 1, 0F); // Box 149
		bodyModel[1596].setRotationPoint(75F, -15F, -5F);

		bodyModel[1597].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[1597].setRotationPoint(1F, -22F, -6F);

		bodyModel[1598].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[1598].setRotationPoint(1F, -20F, -3F);

		bodyModel[1599].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part82
		bodyModel[1599].setRotationPoint(-7F, -23F, -6F);

		bodyModel[1600].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Du loco part82
		bodyModel[1600].setRotationPoint(-7.5F, -24F, -6F);

		bodyModel[1601].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part82
		bodyModel[1601].setRotationPoint(-7F, -21F, -10F);

		bodyModel[1602].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1602].setRotationPoint(-5F, -21F, -10F);

		bodyModel[1603].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1603].setRotationPoint(-5.5F, -19F, -10.5F);

		bodyModel[1604].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1604].setRotationPoint(-5F, -22F, -10F);

		bodyModel[1605].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1605].setRotationPoint(-4F, -22F, -10F);

		bodyModel[1606].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Du loco part82
		bodyModel[1606].setRotationPoint(-5F, -22F, -9F);

		bodyModel[1607].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1607].setRotationPoint(-4F, -22F, -9F);

		bodyModel[1608].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1608].setRotationPoint(-4F, -23F, -10F);

		bodyModel[1609].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.125F, -0.75F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part82
		bodyModel[1609].setRotationPoint(-4F, -23F, -9F);

		bodyModel[1610].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part82
		bodyModel[1610].setRotationPoint(-7F, -23F, -8.5F);

		bodyModel[1611].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part82
		bodyModel[1611].setRotationPoint(-5.5F, -23F, -2F);

		bodyModel[1612].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part82
		bodyModel[1612].setRotationPoint(-9F, -21F, 1F);

		bodyModel[1613].addShapeBox(0F, 0F, 0F, 7, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1613].setRotationPoint(-9F, -21F, -1F);

		bodyModel[1614].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part82
		bodyModel[1614].setRotationPoint(-5F, -23F, -10F);

		bodyModel[1615].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1615].setRotationPoint(-4F, -22F, -5F);

		bodyModel[1616].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part82
		bodyModel[1616].setRotationPoint(-5F, -22F, -5F);

		bodyModel[1617].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F); // Du loco part82
		bodyModel[1617].setRotationPoint(-4F, -22F, -4F);

		bodyModel[1618].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F); // Du loco part82
		bodyModel[1618].setRotationPoint(-5F, -22F, -4F);

		bodyModel[1619].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F); // Du loco part82
		bodyModel[1619].setRotationPoint(-2.25F, -22F, -4F);

		bodyModel[1620].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.625F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.125F, -0.625F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1620].setRotationPoint(-3F, -22F, -4.5F);

		bodyModel[1621].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.125F, -0.625F, 0F, -0.125F, -0.625F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part82
		bodyModel[1621].setRotationPoint(-3F, -22F, -4.5F);

		bodyModel[1622].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.125F, -0.75F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part82
		bodyModel[1622].setRotationPoint(-4F, -22.5F, -6F);

		bodyModel[1623].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[1623].setRotationPoint(-3F, -13F, 4F);

		bodyModel[1624].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[1624].setRotationPoint(-3F, -13F, 4F);
		bodyModel[1624].rotateAngleY = -1.57079633F;

		bodyModel[1625].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[1625].setRotationPoint(-3F, -13F, 7F);
		bodyModel[1625].rotateAngleY = -1.57079633F;

		bodyModel[1626].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[1626].setRotationPoint(-3F, -16F, 4F);

		bodyModel[1627].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[1627].setRotationPoint(-3F, -16F, 7F);
		bodyModel[1627].rotateAngleY = -1.57079633F;

		bodyModel[1628].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[1628].setRotationPoint(-3F, -16F, 4F);
		bodyModel[1628].rotateAngleY = -1.57079633F;

		bodyModel[1629].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[1629].setRotationPoint(0F, -20F, 3F);

		bodyModel[1630].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[1630].setRotationPoint(0F, -20F, 2F);

		bodyModel[1631].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[1631].setRotationPoint(0F, -16F, 3F);

		bodyModel[1632].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[1632].setRotationPoint(-1F, -15F, 6F);
		bodyModel[1632].rotateAngleY = -1.57079633F;

		bodyModel[1633].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[1633].setRotationPoint(-2F, -15F, 6F);
		bodyModel[1633].rotateAngleY = -1.57079633F;

		bodyModel[1634].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[1634].setRotationPoint(0F, -22F, 4F);

		bodyModel[1635].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[1635].setRotationPoint(0F, -20F, 7F);

		bodyModel[1636].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1636].setRotationPoint(-9F, -20F, 1F);

		bodyModel[1637].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1637].setRotationPoint(-9F, -21F, -2F);

		bodyModel[1638].addShapeBox(0F, 0F, 0F, 7, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part82
		bodyModel[1638].setRotationPoint(96F, -21F, 1F);

		bodyModel[1639].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[1639].setRotationPoint(93F, -13F, -6F);

		bodyModel[1640].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[1640].setRotationPoint(93F, -13F, -6F);
		bodyModel[1640].rotateAngleY = -1.57079633F;

		bodyModel[1641].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[1641].setRotationPoint(93F, -13F, -3F);
		bodyModel[1641].rotateAngleY = -1.57079633F;

		bodyModel[1642].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[1642].setRotationPoint(94F, -16F, -6F);

		bodyModel[1643].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[1643].setRotationPoint(94F, -16F, -3F);
		bodyModel[1643].rotateAngleY = -1.57079633F;

		bodyModel[1644].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[1644].setRotationPoint(94F, -16F, -6F);
		bodyModel[1644].rotateAngleY = -1.57079633F;

		bodyModel[1645].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[1645].setRotationPoint(93F, -20F, -7F);

		bodyModel[1646].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[1646].setRotationPoint(93F, -20F, -8F);

		bodyModel[1647].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[1647].setRotationPoint(93F, -16F, -7F);

		bodyModel[1648].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[1648].setRotationPoint(95F, -15F, -4F);
		bodyModel[1648].rotateAngleY = -1.57079633F;

		bodyModel[1649].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[1649].setRotationPoint(94F, -15F, -4F);
		bodyModel[1649].rotateAngleY = -1.57079633F;

		bodyModel[1650].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[1650].setRotationPoint(93F, -22F, -6F);

		bodyModel[1651].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[1651].setRotationPoint(93F, -20F, -3F);

		bodyModel[1652].addShapeBox(0F, 0F, 0F, 2, 2, 4, 0F,-1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1652].setRotationPoint(99F, -23F, 2F);

		bodyModel[1653].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, -0.75F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1653].setRotationPoint(100.5F, -24F, 3F);

		bodyModel[1654].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1654].setRotationPoint(97F, -21F, 8F);

		bodyModel[1655].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1655].setRotationPoint(96.5F, -19F, 7.5F);

		bodyModel[1656].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1656].setRotationPoint(97F, -22F, 8F);

		bodyModel[1657].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1657].setRotationPoint(98F, -22F, 8F);

		bodyModel[1658].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F); // Du loco part82
		bodyModel[1658].setRotationPoint(97F, -22F, 9F);

		bodyModel[1659].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1659].setRotationPoint(98F, -22F, 9F);

		bodyModel[1660].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F); // Du loco part82
		bodyModel[1660].setRotationPoint(98F, -23F, 9F);

		bodyModel[1661].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.125F, -0.75F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part82
		bodyModel[1661].setRotationPoint(98F, -23F, 7F);

		bodyModel[1662].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1662].setRotationPoint(99F, -23F, 6.5F);

		bodyModel[1663].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part82
		bodyModel[1663].setRotationPoint(96.5F, -23F, 0F);

		bodyModel[1664].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1664].setRotationPoint(97F, -21F, -10F);

		bodyModel[1665].addShapeBox(0F, 0F, 0F, 7, 9, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1665].setRotationPoint(96F, -21F, -1F);

		bodyModel[1666].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F); // Du loco part82
		bodyModel[1666].setRotationPoint(97F, -23F, 9F);

		bodyModel[1667].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1667].setRotationPoint(98F, -22F, 3F);

		bodyModel[1668].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part82
		bodyModel[1668].setRotationPoint(97F, -22F, 3F);

		bodyModel[1669].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.25F); // Du loco part82
		bodyModel[1669].setRotationPoint(98F, -22F, 4F);

		bodyModel[1670].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.5F); // Du loco part82
		bodyModel[1670].setRotationPoint(97F, -22F, 4F);

		bodyModel[1671].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0.125F, 0F, -0.75F, 0.125F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F); // Du loco part82
		bodyModel[1671].setRotationPoint(95.25F, -22F, 4F);

		bodyModel[1672].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.625F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.125F, -0.625F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1672].setRotationPoint(96F, -22F, 3.5F);

		bodyModel[1673].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, -0.125F, -0.625F, 0F, -0.125F, -0.625F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part82
		bodyModel[1673].setRotationPoint(96F, -22F, 3.5F);

		bodyModel[1674].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.125F, -0.75F, 0F, -0.875F, -0.75F, 0F, -0.875F, -0.75F, 0F, 0.125F, -0.75F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part82
		bodyModel[1674].setRotationPoint(98F, -22.5F, 4F);

		bodyModel[1675].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[1675].setRotationPoint(92F, -13F, 4F);

		bodyModel[1676].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[1676].setRotationPoint(92F, -13F, 4F);
		bodyModel[1676].rotateAngleY = -1.57079633F;

		bodyModel[1677].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[1677].setRotationPoint(92F, -13F, 7F);
		bodyModel[1677].rotateAngleY = -1.57079633F;

		bodyModel[1678].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[1678].setRotationPoint(93F, -16F, 4F);

		bodyModel[1679].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[1679].setRotationPoint(93F, -16F, 7F);
		bodyModel[1679].rotateAngleY = -1.57079633F;

		bodyModel[1680].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[1680].setRotationPoint(93F, -16F, 4F);
		bodyModel[1680].rotateAngleY = -1.57079633F;

		bodyModel[1681].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[1681].setRotationPoint(92F, -20F, 3F);

		bodyModel[1682].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[1682].setRotationPoint(92F, -20F, 2F);

		bodyModel[1683].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[1683].setRotationPoint(94F, -15F, 6F);
		bodyModel[1683].rotateAngleY = -1.57079633F;

		bodyModel[1684].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[1684].setRotationPoint(93F, -15F, 6F);
		bodyModel[1684].rotateAngleY = -1.57079633F;

		bodyModel[1685].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[1685].setRotationPoint(92F, -22F, 4F);

		bodyModel[1686].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[1686].setRotationPoint(92F, -20F, 7F);

		bodyModel[1687].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1687].setRotationPoint(97F, -20F, -3F);

		bodyModel[1688].addShapeBox(0F, 0F, 0F, 7, 9, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[1688].setRotationPoint(96F, -21F, 1F);

		bodyModel[1689].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[1689].setRotationPoint(92F, -16F, 3F);

		bodyModel[1690].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part82
		bodyModel[1690].setRotationPoint(99F, -21F, 8F);

		bodyModel[1691].addShapeBox(0F, 0F, 0F, 12, 1, 20, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[1691].setRotationPoint(-5.25F, -30F, -10F);

		bodyModel[1692].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Du loco part08
		bodyModel[1692].setRotationPoint(-7.25F, -30F, -7F);

		bodyModel[1693].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[1693].setRotationPoint(-8.25F, -30F, -5F);

		bodyModel[1694].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Du loco part08
		bodyModel[1694].setRotationPoint(-9.25F, -30F, -1F);

		bodyModel[1695].addShapeBox(0F, 0F, 0F, 12, 1, 20, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Du loco part08
		bodyModel[1695].setRotationPoint(87.25F, -30F, -10F);

		bodyModel[1696].addBox(0F, 0F, 0F, 2, 1, 14, 0F); // Du loco part08
		bodyModel[1696].setRotationPoint(99.25F, -30F, -7F);

		bodyModel[1697].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[1697].setRotationPoint(101.25F, -30F, -5F);

		bodyModel[1698].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Du loco part08
		bodyModel[1698].setRotationPoint(102.25F, -30F, -1F);

		bodyModel[1699].addShapeBox(0F, 0F, 0F, 2, 20, 20, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -18F, -1.5F, 0F, -18F, 0F, -18F, 0F, -2F, -18F, 0F, -2F, -18F, -18F, 0F, -18F, -18F); // Du loco part82
		bodyModel[1699].setRotationPoint(99F, -23.01F, 6.5F);

		bodyModel[1700].addShapeBox(0F, 0F, 0F, 2, 20, 40, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -36F, -1.5F, 0F, -36F, 0F, -18F, 0F, -2F, -18F, 0F, -2F, -18F, -36F, 0F, -18F, -36F); // Du loco part82
		bodyModel[1700].setRotationPoint(99F, -23.01F, 2F);

		bodyModel[1701].addShapeBox(0F, 0F, 0F, 2, 20, 20, 0F,-0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -18F, -0.5F, 0F, -18F, -2F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, -18F, -2F, -18F, -18F); // Du loco part82
		bodyModel[1701].setRotationPoint(-7F, -23.01F, -8.5F);

		bodyModel[1702].addShapeBox(0F, 0F, 0F, 2, 20, 40, 0F,-0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -36F, -0.5F, 0F, -36F, -2F, -18F, 0F, 0F, -18F, 0F, 0F, -18F, -36F, -2F, -18F, -36F); // Du loco part82
		bodyModel[1702].setRotationPoint(-7F, -23.01F, -6F);

		bodyModel[1703].addShapeBox(0F, 0F, 0F, 162, 60, 0, 0F,0F, 0F, 0F, -108F, 0F, 0F, -108F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, -108F, -40F, 0F, -108F, -40F, 0F, 0F, -40F, 0F); // Box 135
		bodyModel[1703].setRotationPoint(9F, -29F, 11.26F);

		bodyModel[1704].addShapeBox(0F, 0F, 0F, 162, 60, 0, 0F,0F, 0F, 0F, -108F, 0F, 0F, -108F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, -108F, -40F, 0F, -108F, -40F, 0F, 0F, -40F, 0F); // Box 135
		bodyModel[1704].setRotationPoint(31F, -29F, -11.26F);

		bodyModel[1705].addShapeBox(0F, 0F, 0F, 1, 64, 64, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -60F, -0.5F, 0F, -60F, -0.5F, -60F, 0F, -0.5F, -60F, 0F, -0.5F, -60F, -60F, -0.5F, -60F, -60F); // Du loco part19
		bodyModel[1705].setRotationPoint(-11.5F, -20F, -2F);

		bodyModel[1706].addShapeBox(0F, 0F, 0F, 1, 64, 64, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -60F, -0.5F, 0F, -60F, -0.5F, -60F, 0F, -0.5F, -60F, 0F, -0.5F, -60F, -60F, -0.5F, -60F, -60F); // Du loco part19
		bodyModel[1706].setRotationPoint(104.5F, -20F, -2F);

		bodyModel[1707].addShapeBox(0F, 0F, 0F, 64, 64, 0, 0F,-53F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -53F, 0F, 0F, -53F, -53F, 0F, 0F, -53F, 0F, 0F, -53F, 0F, -53F, -53F, 0F); // Du loco part19
		bodyModel[1707].setRotationPoint(-11.5F, -30F, -11.26F);

		bodyModel[1708].addShapeBox(0F, 0F, 0F, 64, 64, 0, 0F,-53F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -53F, 0F, 0F, -53F, -53F, 0F, 0F, -53F, 0F, 0F, -53F, 0F, -53F, -53F, 0F); // Du loco part19
		bodyModel[1708].setRotationPoint(-11.5F, -30F, 11.26F);

		bodyModel[1709].addShapeBox(0F, 0F, 0F, 2, 40, 50, 0F,-1.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, 0F, -45F, -0.25F, 0F, -45F, -1.25F, -36F, 0F, -0.75F, -36F, 0F, -2F, -36F, -45F, 0F, -36F, -45F); // Du loco part19
		bodyModel[1709].setRotationPoint(-11F, -20.5F, -6F);

		bodyModel[1710].addShapeBox(0F, 0F, 0F, 1, 40, 20, 0F,-0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -18F, -0.75F, 0F, -18F, -0.5F, -36F, 0F, -0.5F, -36F, 0F, -0.5F, -36F, -18F, -0.5F, -36F, -18F); // Du loco part19
		bodyModel[1710].setRotationPoint(-11.5F, -20.5F, -1F);

		bodyModel[1711].addShapeBox(0F, 0F, 0F, 2, 40, 50, 0F,-0.25F, 0F, -45F, -1.75F, 0F, -45F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -36F, -45F, -2F, -36F, -45F, -0.75F, -36F, 0F, -1.25F, -36F, 0F); // Du loco part19
		bodyModel[1711].setRotationPoint(-11F, -20.5F, -44F);

		bodyModel[1712].addShapeBox(0F, 0F, 0F, 2, 40, 50, 0F,-0.5F, 0F, 0F, -1.5F, 0F, 0F, -0.25F, 0F, -45F, -1.75F, 0F, -45F, -0.75F, -36F, 0F, -1.25F, -36F, 0F, 0F, -36F, -45F, -2F, -36F, -45F); // Du loco part19
		bodyModel[1712].setRotationPoint(103F, -20.5F, -6F);

		bodyModel[1713].addShapeBox(0F, 0F, 0F, 1, 40, 20, 0F,-0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -18F, -0.25F, 0F, -18F, -0.5F, -36F, 0F, -0.5F, -36F, 0F, -0.5F, -36F, -18F, -0.5F, -36F, -18F); // Du loco part19
		bodyModel[1713].setRotationPoint(104.5F, -20.5F, -1F);

		bodyModel[1714].addShapeBox(0F, 0F, 0F, 2, 40, 50, 0F,-1.75F, 0F, -45F, -0.25F, 0F, -45F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, -36F, -45F, 0F, -36F, -45F, -1.25F, -36F, 0F, -0.75F, -36F, 0F); // Du loco part19
		bodyModel[1714].setRotationPoint(103F, -20.5F, -44F);

		bodyModel[1715].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3F, 0F); // Du loco part37
		bodyModel[1715].setRotationPoint(72F, -42F, -0.5F);

		bodyModel[1716].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Du loco part37
		bodyModel[1716].setRotationPoint(74F, -37F, 0.5F);

		bodyModel[1717].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,0F, -5F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -5F, 0F, 0F, 0F, -1F, 0F, -6F, 0F, 0F, -6F, -1F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1717].setRotationPoint(73F, -47F, -2.5F);

		bodyModel[1718].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[1718].setRotationPoint(83F, -34F, -6F);

		bodyModel[1719].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[1719].setRotationPoint(75F, -34F, -6F);

		bodyModel[1720].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1720].setRotationPoint(75F, -35F, -2F);

		bodyModel[1721].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -0.25F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F); // Du loco part37
		bodyModel[1721].setRotationPoint(75F, -40F, -1.5F);

		bodyModel[1722].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -0.25F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F); // Du loco part37
		bodyModel[1722].setRotationPoint(75F, -40F, 0.5F);

		bodyModel[1723].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,0F, -5F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, -6F, -1F, 0F, -6F, 0F, 0F, 0F, -1F); // Du loco part37
		bodyModel[1723].setRotationPoint(73F, -47F, 0.5F);

		bodyModel[1724].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F); // Du loco part37
		bodyModel[1724].setRotationPoint(70F, -37F, -0.5F);

		bodyModel[1725].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -0.75F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F); // Du loco part37
		bodyModel[1725].setRotationPoint(74F, -37F, -1.5F);

		bodyModel[1726].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -0.5F, -1F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -0.5F, 0F); // Du loco part37
		bodyModel[1726].setRotationPoint(70F, -37F, -2.5F);

		bodyModel[1727].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,0F, -0.5F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -0.5F, -1F); // Du loco part37
		bodyModel[1727].setRotationPoint(70F, -37F, 0.5F);

		bodyModel[1728].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -0.5F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -1F, -0.25F); // Du loco part37
		bodyModel[1728].setRotationPoint(69F, -36F, -0.5F);

		bodyModel[1729].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, -0.25F, -0.25F, 0F, -6.25F, -0.25F, 0F, -6.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -6.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -6.25F, -0.25F); // Du loco part37
		bodyModel[1729].setRotationPoint(71F, -41F, -0.5F);

		bodyModel[1730].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part37
		bodyModel[1730].setRotationPoint(71F, -42F, -1F);

		bodyModel[1731].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part37
		bodyModel[1731].setRotationPoint(69F, -36.5F, -1.5F);

		bodyModel[1732].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part37
		bodyModel[1732].setRotationPoint(72F, -42F, -1.5F);

		bodyModel[1733].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part37
		bodyModel[1733].setRotationPoint(71F, -42F, 0F);

		bodyModel[1734].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, -5F, -3F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1734].setRotationPoint(73F, -47F, -2.5F);

		bodyModel[1735].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, -3F); // Du loco part37
		bodyModel[1735].setRotationPoint(73F, -47F, -1.5F);

		bodyModel[1736].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, -0.5F, 0F); // Du loco part37
		bodyModel[1736].setRotationPoint(70F, -37F, -2.5F);

		bodyModel[1737].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -0.5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -1F, -3F, 0F, -1F, 0F, 0F, -0.5F, -3F); // Du loco part37
		bodyModel[1737].setRotationPoint(70F, -37F, -1.5F);

		bodyModel[1738].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, 0.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.25F, 0F); // Du loco part37
		bodyModel[1738].setRotationPoint(18F, -42F, -0.5F);

		bodyModel[1739].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1739].setRotationPoint(15F, -37F, 0.5F);

		bodyModel[1740].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,-1F, 0F, 0F, 0F, -5F, -1F, 0F, -5F, 0F, -1F, 0F, -1F, 0F, -6F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -6F, -1F); // Du loco part37
		bodyModel[1740].setRotationPoint(13F, -47F, -2.5F);

		bodyModel[1741].addShapeBox(0F, 0F, 0F, 9, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1741].setRotationPoint(10F, -35F, -2F);

		bodyModel[1742].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1742].setRotationPoint(15F, -40F, -1.5F);

		bodyModel[1743].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,0F, -4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1743].setRotationPoint(15F, -40F, 0.5F);

		bodyModel[1744].addShapeBox(0F, 0F, 0F, 8, 6, 2, 0F,-1F, 0F, -1F, 0F, -5F, 0F, 0F, -5F, -1F, -1F, 0F, 0F, 0F, -6F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -6F, 0F); // Du loco part37
		bodyModel[1744].setRotationPoint(13F, -47F, 0.5F);

		bodyModel[1745].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F); // Du loco part37
		bodyModel[1745].setRotationPoint(19F, -37F, -0.5F);

		bodyModel[1746].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[1746].setRotationPoint(15F, -37F, -1.5F);

		bodyModel[1747].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,-1F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, -1F, 0F, -1F, 0F, -2F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, -2F, -1F); // Du loco part37
		bodyModel[1747].setRotationPoint(13F, -37F, -2.5F);

		bodyModel[1748].addShapeBox(0F, 0F, 0F, 11, 2, 2, 0F,-1F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -1F, 0F, 0F, 0F, -2F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, 0F, -2F, 0F); // Du loco part37
		bodyModel[1748].setRotationPoint(13F, -37F, 0.5F);

		bodyModel[1749].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, -1.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part37
		bodyModel[1749].setRotationPoint(19F, -36F, -0.5F);

		bodyModel[1750].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, -6.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -6.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -6.25F, -0.25F, 0F, -6.25F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part37
		bodyModel[1750].setRotationPoint(19F, -41F, -0.5F);

		bodyModel[1751].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F); // Du loco part37
		bodyModel[1751].setRotationPoint(22F, -42F, -1F);

		bodyModel[1752].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part37
		bodyModel[1752].setRotationPoint(24F, -36.5F, -1.5F);

		bodyModel[1753].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Du loco part37
		bodyModel[1753].setRotationPoint(21F, -42F, -1.5F);

		bodyModel[1754].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F); // Du loco part37
		bodyModel[1754].setRotationPoint(22F, -42F, 0F);

		bodyModel[1755].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,0F, 0F, 0F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, -5F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -5F, -3F); // Du loco part37
		bodyModel[1755].setRotationPoint(14F, -47F, -2.5F);

		bodyModel[1756].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,0F, 0F, -3F, 0F, -5F, 0F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, -5F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -5F, 0F); // Du loco part37
		bodyModel[1756].setRotationPoint(14F, -47F, -1.5F);

		bodyModel[1757].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, 0F, 0F, -1F, -3F); // Du loco part37
		bodyModel[1757].setRotationPoint(14F, -37F, -2.5F);

		bodyModel[1758].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -0.5F, 0F, 0F, -0.5F, -3F, 0F, -1F, 0F); // Du loco part37
		bodyModel[1758].setRotationPoint(14F, -37F, -1.5F);

		bodyModel[1759].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[1759].setRotationPoint(35F, -8F, 10F);

		bodyModel[1760].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[1760].setRotationPoint(34F, -8F, 10F);

		bodyModel[1761].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[1761].setRotationPoint(35F, -8F, 10F);

		bodyModel[1762].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 0
		bodyModel[1762].setRotationPoint(33F, -8F, 10F);

		bodyModel[1763].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 0
		bodyModel[1763].setRotationPoint(33F, -8F, 10F);

		bodyModel[1764].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 0
		bodyModel[1764].setRotationPoint(60F, -8F, 10F);

		bodyModel[1765].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[1765].setRotationPoint(59F, -8F, 10F);

		bodyModel[1766].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[1766].setRotationPoint(60F, -8F, 10F);

		bodyModel[1767].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F); // Box 0
		bodyModel[1767].setRotationPoint(58F, -8F, 10F);

		bodyModel[1768].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F); // Box 0
		bodyModel[1768].setRotationPoint(58F, -8F, 10F);

		bodyModel[1769].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 168
		bodyModel[1769].setRotationPoint(28F, -32F, -11F);

		bodyModel[1770].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 168
		bodyModel[1770].setRotationPoint(46F, -32F, -11F);

		bodyModel[1771].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 168
		bodyModel[1771].setRotationPoint(29F, -32F, -11F);

		bodyModel[1772].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1772].setRotationPoint(29F, -32F, -10F);

		bodyModel[1773].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1773].setRotationPoint(29F, -32F, -9F);

		bodyModel[1774].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1774].setRotationPoint(29.25F, -32F, -11F);

		bodyModel[1775].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1775].setRotationPoint(29.75F, -32F, -11F);

		bodyModel[1776].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 168
		bodyModel[1776].setRotationPoint(47F, -32F, -11F);

		bodyModel[1777].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 168
		bodyModel[1777].setRotationPoint(65F, -32F, -11F);

		bodyModel[1778].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 168
		bodyModel[1778].setRotationPoint(48F, -32F, -11F);

		bodyModel[1779].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1779].setRotationPoint(48F, -32F, -10F);

		bodyModel[1780].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1780].setRotationPoint(48F, -32F, -9F);

		bodyModel[1781].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1781].setRotationPoint(48.25F, -32F, -11F);

		bodyModel[1782].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1782].setRotationPoint(48.75F, -32F, -11F);

		bodyModel[1783].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1783].setRotationPoint(30.25F, -32F, -11F);

		bodyModel[1784].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1784].setRotationPoint(30.75F, -32F, -11F);

		bodyModel[1785].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1785].setRotationPoint(49.25F, -32F, -11F);

		bodyModel[1786].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1786].setRotationPoint(49.75F, -32F, -11F);

		bodyModel[1787].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1787].setRotationPoint(31.25F, -32F, -11F);

		bodyModel[1788].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1788].setRotationPoint(31.75F, -32F, -11F);

		bodyModel[1789].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1789].setRotationPoint(50.25F, -32F, -11F);

		bodyModel[1790].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1790].setRotationPoint(50.75F, -32F, -11F);

		bodyModel[1791].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1791].setRotationPoint(32.25F, -32F, -11F);

		bodyModel[1792].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1792].setRotationPoint(32.75F, -32F, -11F);

		bodyModel[1793].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1793].setRotationPoint(51.25F, -32F, -11F);

		bodyModel[1794].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1794].setRotationPoint(51.75F, -32F, -11F);

		bodyModel[1795].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1795].setRotationPoint(33.25F, -32F, -11F);

		bodyModel[1796].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1796].setRotationPoint(33.75F, -32F, -11F);

		bodyModel[1797].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1797].setRotationPoint(52.25F, -32F, -11F);

		bodyModel[1798].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1798].setRotationPoint(52.75F, -32F, -11F);

		bodyModel[1799].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1799].setRotationPoint(34.25F, -32F, -11F);

		bodyModel[1800].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1800].setRotationPoint(34.75F, -32F, -11F);

		bodyModel[1801].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1801].setRotationPoint(53.25F, -32F, -11F);

		bodyModel[1802].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1802].setRotationPoint(53.75F, -32F, -11F);

		bodyModel[1803].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1803].setRotationPoint(35.25F, -32F, -11F);

		bodyModel[1804].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1804].setRotationPoint(35.75F, -32F, -11F);

		bodyModel[1805].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1805].setRotationPoint(54.25F, -32F, -11F);

		bodyModel[1806].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1806].setRotationPoint(54.75F, -32F, -11F);

		bodyModel[1807].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1807].setRotationPoint(36.25F, -32F, -11F);

		bodyModel[1808].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1808].setRotationPoint(36.75F, -32F, -11F);

		bodyModel[1809].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1809].setRotationPoint(55.25F, -32F, -11F);

		bodyModel[1810].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1810].setRotationPoint(55.75F, -32F, -11F);

		bodyModel[1811].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1811].setRotationPoint(37.25F, -32F, -11F);

		bodyModel[1812].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1812].setRotationPoint(37.75F, -32F, -11F);

		bodyModel[1813].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1813].setRotationPoint(56.25F, -32F, -11F);

		bodyModel[1814].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1814].setRotationPoint(56.75F, -32F, -11F);

		bodyModel[1815].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1815].setRotationPoint(38.25F, -32F, -11F);

		bodyModel[1816].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1816].setRotationPoint(38.75F, -32F, -11F);

		bodyModel[1817].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1817].setRotationPoint(57.25F, -32F, -11F);

		bodyModel[1818].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1818].setRotationPoint(57.75F, -32F, -11F);

		bodyModel[1819].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1819].setRotationPoint(39.25F, -32F, -11F);

		bodyModel[1820].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1820].setRotationPoint(39.75F, -32F, -11F);

		bodyModel[1821].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1821].setRotationPoint(58.25F, -32F, -11F);

		bodyModel[1822].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1822].setRotationPoint(58.75F, -32F, -11F);

		bodyModel[1823].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1823].setRotationPoint(40.25F, -32F, -11F);

		bodyModel[1824].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1824].setRotationPoint(40.75F, -32F, -11F);

		bodyModel[1825].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1825].setRotationPoint(59.25F, -32F, -11F);

		bodyModel[1826].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1826].setRotationPoint(59.75F, -32F, -11F);

		bodyModel[1827].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1827].setRotationPoint(41.25F, -32F, -11F);

		bodyModel[1828].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1828].setRotationPoint(41.75F, -32F, -11F);

		bodyModel[1829].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1829].setRotationPoint(60.25F, -32F, -11F);

		bodyModel[1830].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1830].setRotationPoint(60.75F, -32F, -11F);

		bodyModel[1831].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1831].setRotationPoint(42.25F, -32F, -11F);

		bodyModel[1832].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1832].setRotationPoint(42.75F, -32F, -11F);

		bodyModel[1833].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1833].setRotationPoint(61.25F, -32F, -11F);

		bodyModel[1834].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1834].setRotationPoint(61.75F, -32F, -11F);

		bodyModel[1835].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1835].setRotationPoint(43.25F, -32F, -11F);

		bodyModel[1836].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1836].setRotationPoint(43.75F, -32F, -11F);

		bodyModel[1837].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1837].setRotationPoint(62.25F, -32F, -11F);

		bodyModel[1838].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1838].setRotationPoint(62.75F, -32F, -11F);

		bodyModel[1839].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1839].setRotationPoint(44.25F, -32F, -11F);

		bodyModel[1840].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1840].setRotationPoint(44.75F, -32F, -11F);

		bodyModel[1841].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1841].setRotationPoint(63.25F, -32F, -11F);

		bodyModel[1842].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1842].setRotationPoint(63.75F, -32F, -11F);

		bodyModel[1843].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1843].setRotationPoint(45.25F, -32F, -11F);

		bodyModel[1844].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1844].setRotationPoint(45.75F, -32F, -11F);

		bodyModel[1845].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1845].setRotationPoint(64.25F, -32F, -11F);

		bodyModel[1846].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -1F, -0.75F, 0F, -1F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 168
		bodyModel[1846].setRotationPoint(64.75F, -32F, -11F);

		bodyModel[1847].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1847].setRotationPoint(28F, -32F, 7F);

		bodyModel[1848].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1848].setRotationPoint(46F, -32F, 7F);

		bodyModel[1849].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1849].setRotationPoint(29F, -32F, 9F);

		bodyModel[1850].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1850].setRotationPoint(29F, -32F, 9F);

		bodyModel[1851].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1851].setRotationPoint(29F, -32F, 7F);

		bodyModel[1852].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1852].setRotationPoint(29.25F, -32F, 10F);

		bodyModel[1853].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1853].setRotationPoint(29.75F, -32F, 10F);

		bodyModel[1854].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1854].setRotationPoint(47F, -32F, 7F);

		bodyModel[1855].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1855].setRotationPoint(65F, -32F, 7F);

		bodyModel[1856].addShapeBox(0F, 0F, 0F, 17, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1856].setRotationPoint(48F, -32F, 9F);

		bodyModel[1857].addShapeBox(0F, 0F, 0F, 17, 0, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1857].setRotationPoint(48F, -32F, 9F);

		bodyModel[1858].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1858].setRotationPoint(48F, -32F, 7F);

		bodyModel[1859].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1859].setRotationPoint(48.25F, -32F, 10F);

		bodyModel[1860].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1860].setRotationPoint(48.75F, -32F, 10F);

		bodyModel[1861].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1861].setRotationPoint(30.25F, -32F, 10F);

		bodyModel[1862].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1862].setRotationPoint(30.75F, -32F, 10F);

		bodyModel[1863].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1863].setRotationPoint(49.25F, -32F, 10F);

		bodyModel[1864].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1864].setRotationPoint(49.75F, -32F, 10F);

		bodyModel[1865].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1865].setRotationPoint(31.25F, -32F, 10F);

		bodyModel[1866].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1866].setRotationPoint(31.75F, -32F, 10F);

		bodyModel[1867].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1867].setRotationPoint(50.25F, -32F, 10F);

		bodyModel[1868].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1868].setRotationPoint(50.75F, -32F, 10F);

		bodyModel[1869].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1869].setRotationPoint(32.25F, -32F, 10F);

		bodyModel[1870].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1870].setRotationPoint(32.75F, -32F, 10F);

		bodyModel[1871].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1871].setRotationPoint(51.25F, -32F, 10F);

		bodyModel[1872].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1872].setRotationPoint(51.75F, -32F, 10F);

		bodyModel[1873].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1873].setRotationPoint(33.25F, -32F, 10F);

		bodyModel[1874].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1874].setRotationPoint(33.75F, -32F, 10F);

		bodyModel[1875].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1875].setRotationPoint(52.25F, -32F, 10F);

		bodyModel[1876].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1876].setRotationPoint(52.75F, -32F, 10F);

		bodyModel[1877].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1877].setRotationPoint(34.25F, -32F, 10F);

		bodyModel[1878].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1878].setRotationPoint(34.75F, -32F, 10F);

		bodyModel[1879].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1879].setRotationPoint(53.25F, -32F, 10F);

		bodyModel[1880].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1880].setRotationPoint(53.75F, -32F, 10F);

		bodyModel[1881].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1881].setRotationPoint(35.25F, -32F, 10F);

		bodyModel[1882].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1882].setRotationPoint(35.75F, -32F, 10F);

		bodyModel[1883].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1883].setRotationPoint(54.25F, -32F, 10F);

		bodyModel[1884].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1884].setRotationPoint(54.75F, -32F, 10F);

		bodyModel[1885].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1885].setRotationPoint(36.25F, -32F, 10F);

		bodyModel[1886].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1886].setRotationPoint(36.75F, -32F, 10F);

		bodyModel[1887].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1887].setRotationPoint(55.25F, -32F, 10F);

		bodyModel[1888].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1888].setRotationPoint(55.75F, -32F, 10F);

		bodyModel[1889].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1889].setRotationPoint(37.25F, -32F, 10F);

		bodyModel[1890].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1890].setRotationPoint(37.75F, -32F, 10F);

		bodyModel[1891].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1891].setRotationPoint(56.25F, -32F, 10F);

		bodyModel[1892].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1892].setRotationPoint(56.75F, -32F, 10F);

		bodyModel[1893].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1893].setRotationPoint(38.25F, -32F, 10F);

		bodyModel[1894].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1894].setRotationPoint(38.75F, -32F, 10F);

		bodyModel[1895].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1895].setRotationPoint(57.25F, -32F, 10F);

		bodyModel[1896].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1896].setRotationPoint(57.75F, -32F, 10F);

		bodyModel[1897].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1897].setRotationPoint(39.25F, -32F, 10F);

		bodyModel[1898].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1898].setRotationPoint(39.75F, -32F, 10F);

		bodyModel[1899].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1899].setRotationPoint(58.25F, -32F, 10F);

		bodyModel[1900].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1900].setRotationPoint(58.75F, -32F, 10F);

		bodyModel[1901].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1901].setRotationPoint(40.25F, -32F, 10F);

		bodyModel[1902].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1902].setRotationPoint(40.75F, -32F, 10F);

		bodyModel[1903].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1903].setRotationPoint(59.25F, -32F, 10F);

		bodyModel[1904].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1904].setRotationPoint(59.75F, -32F, 10F);

		bodyModel[1905].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1905].setRotationPoint(41.25F, -32F, 10F);

		bodyModel[1906].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1906].setRotationPoint(41.75F, -32F, 10F);

		bodyModel[1907].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1907].setRotationPoint(60.25F, -32F, 10F);

		bodyModel[1908].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1908].setRotationPoint(60.75F, -32F, 10F);

		bodyModel[1909].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1909].setRotationPoint(42.25F, -32F, 10F);

		bodyModel[1910].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1910].setRotationPoint(42.75F, -32F, 10F);

		bodyModel[1911].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1911].setRotationPoint(61.25F, -32F, 10F);

		bodyModel[1912].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1912].setRotationPoint(61.75F, -32F, 10F);

		bodyModel[1913].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1913].setRotationPoint(43.25F, -32F, 10F);

		bodyModel[1914].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1914].setRotationPoint(43.75F, -32F, 10F);

		bodyModel[1915].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1915].setRotationPoint(62.25F, -32F, 10F);

		bodyModel[1916].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1916].setRotationPoint(62.75F, -32F, 10F);

		bodyModel[1917].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1917].setRotationPoint(44.25F, -32F, 10F);

		bodyModel[1918].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1918].setRotationPoint(44.75F, -32F, 10F);

		bodyModel[1919].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1919].setRotationPoint(63.25F, -32F, 10F);

		bodyModel[1920].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1920].setRotationPoint(63.75F, -32F, 10F);

		bodyModel[1921].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1921].setRotationPoint(45.25F, -32F, 10F);

		bodyModel[1922].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1922].setRotationPoint(45.75F, -32F, 10F);

		bodyModel[1923].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1923].setRotationPoint(64.25F, -32F, 10F);

		bodyModel[1924].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[1924].setRotationPoint(64.75F, -32F, 10F);

		bodyModel[1925].addShapeBox(0F, 0F, 0F, 64, 64, 0, 0F,-57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -57F, 0F, 0F, -57F, -57F, 0F, 0F, -57F, 0F, 0F, -57F, 0F, -57F, -57F, 0F); // Du loco part19
		bodyModel[1925].setRotationPoint(-49F, -25F, -11.26F);

		bodyModel[1926].addShapeBox(0F, 0F, 0F, 64, 64, 0, 0F,-57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -57F, 0F, 0F, -57F, -57F, 0F, 0F, -57F, 0F, 0F, -57F, 0F, -57F, -57F, 0F); // Du loco part19
		bodyModel[1926].setRotationPoint(22F, -25F, 11.26F);

		bodyModel[1927].addShapeBox(0F, 0F, 0F, 64, 64, 0, 0F,-57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -57F, 0F, 0F, -57F, -57F, 0F, 0F, -57F, 0F, 0F, -57F, 0F, -57F, -57F, 0F); // Du loco part19
		bodyModel[1927].setRotationPoint(-49F, -25F, 11.26F);

		bodyModel[1928].addShapeBox(0F, 0F, 0F, 64, 64, 0, 0F,-57F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -57F, 0F, 0F, -57F, -57F, 0F, 0F, -57F, 0F, 0F, -57F, 0F, -57F, -57F, 0F); // Du loco part19
		bodyModel[1928].setRotationPoint(22F, -25F, -11.26F);
	}
}