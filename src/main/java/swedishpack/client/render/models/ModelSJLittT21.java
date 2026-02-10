//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera T21
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittT21 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittT21() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[725];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 39, 308, textureX, textureY); // Du loco part01
		bodyModel[1] = new ModelRendererTurbo(this, 43, 304, textureX, textureY); // Du loco part03
		bodyModel[2] = new ModelRendererTurbo(this, 39, 329, textureX, textureY); // Du loco part17
		bodyModel[3] = new ModelRendererTurbo(this, 39, 329, textureX, textureY); // Du loco part27
		bodyModel[4] = new ModelRendererTurbo(this, 253, 37, textureX, textureY); // Du loco part82
		bodyModel[5] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part83
		bodyModel[6] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Du loco part84
		bodyModel[7] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part85
		bodyModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part94
		bodyModel[9] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Du loco part95
		bodyModel[10] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part97
		bodyModel[11] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part100
		bodyModel[12] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Du loco part101
		bodyModel[13] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Du loco part102
		bodyModel[14] = new ModelRendererTurbo(this, 465, 55, textureX, textureY); // Lamp
		bodyModel[15] = new ModelRendererTurbo(this, 465, 60, textureX, textureY); // Lamp
		bodyModel[16] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 177
		bodyModel[17] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 194
		bodyModel[18] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 195
		bodyModel[19] = new ModelRendererTurbo(this, 4, 6, textureX, textureY); // Box 138
		bodyModel[20] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Du loco part23
		bodyModel[21] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Du loco part23
		bodyModel[22] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Du loco part23
		bodyModel[23] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[24] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Du loco part23
		bodyModel[25] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Du loco part23
		bodyModel[26] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Du loco part23
		bodyModel[27] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Du loco part23
		bodyModel[28] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Du loco part28
		bodyModel[29] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part28
		bodyModel[30] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[31] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[32] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Du loco part28
		bodyModel[33] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Du loco part28
		bodyModel[34] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part28
		bodyModel[35] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[36] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[37] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[38] = new ModelRendererTurbo(this, 223, 90, textureX, textureY); // Du loco part06
		bodyModel[39] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Du loco part06
		bodyModel[40] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Du loco part06
		bodyModel[41] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Du loco part28
		bodyModel[42] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part28
		bodyModel[43] = new ModelRendererTurbo(this, 317, 213, textureX, textureY); // Du loco part82
		bodyModel[44] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Du loco part83
		bodyModel[45] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Du loco part84
		bodyModel[46] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Du loco part85
		bodyModel[47] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Du loco part94
		bodyModel[48] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Du loco part95
		bodyModel[49] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Du loco part97
		bodyModel[50] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Du loco part100
		bodyModel[51] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part101
		bodyModel[52] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Du loco part102
		bodyModel[53] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 177
		bodyModel[54] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 193
		bodyModel[55] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 196
		bodyModel[56] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[57] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[58] = new ModelRendererTurbo(this, 244, 233, textureX, textureY); // Du loco part06
		bodyModel[59] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[60] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[61] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[62] = new ModelRendererTurbo(this, 295, 233, textureX, textureY); // Du loco part06
		bodyModel[63] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[64] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[65] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Du loco part28
		bodyModel[66] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Du loco part28
		bodyModel[67] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Du loco part28
		bodyModel[68] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Du loco part28
		bodyModel[69] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Du loco part28
		bodyModel[70] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[71] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Du loco part28
		bodyModel[72] = new ModelRendererTurbo(this, 98, 241, textureX, textureY); // Du loco part28
		bodyModel[73] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 156
		bodyModel[74] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 156
		bodyModel[75] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		bodyModel[76] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 154
		bodyModel[77] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 154
		bodyModel[78] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 154
		bodyModel[79] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Du loco part23
		bodyModel[80] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Du loco part23
		bodyModel[81] = new ModelRendererTurbo(this, 115, 251, textureX, textureY); // Du loco part41
		bodyModel[82] = new ModelRendererTurbo(this, 30, 357, textureX, textureY); // Du loco part05
		bodyModel[83] = new ModelRendererTurbo(this, 36, 357, textureX, textureY); // Du loco part05
		bodyModel[84] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[85] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[86] = new ModelRendererTurbo(this, 223, 90, textureX, textureY); // Du loco part06
		bodyModel[87] = new ModelRendererTurbo(this, 12, 340, textureX, textureY); // Du loco part05
		bodyModel[88] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[89] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[90] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[91] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[92] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[93] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[94] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[95] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[96] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[97] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Du loco part23
		bodyModel[98] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Du loco part23
		bodyModel[99] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[100] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[101] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[102] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[103] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[104] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[105] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[106] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[107] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[108] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[109] = new ModelRendererTurbo(this, 115, 252, textureX, textureY); // Du loco part41
		bodyModel[110] = new ModelRendererTurbo(this, 39, 309, textureX, textureY); // Du loco part01
		bodyModel[111] = new ModelRendererTurbo(this, 156, 371, textureX, textureY); // Du loco part19
		bodyModel[112] = new ModelRendererTurbo(this, 244, 357, textureX, textureY); // Du loco part19
		bodyModel[113] = new ModelRendererTurbo(this, 214, 435, textureX, textureY); // Du loco part19
		bodyModel[114] = new ModelRendererTurbo(this, 316, 435, textureX, textureY); // Du loco part19
		bodyModel[115] = new ModelRendererTurbo(this, 265, 386, textureX, textureY); // Du loco part19
		bodyModel[116] = new ModelRendererTurbo(this, 265, 456, textureX, textureY); // Du loco part19
		bodyModel[117] = new ModelRendererTurbo(this, 210, 421, textureX, textureY); // Du loco part19
		bodyModel[118] = new ModelRendererTurbo(this, 316, 421, textureX, textureY); // Du loco part19
		bodyModel[119] = new ModelRendererTurbo(this, 287, 414, textureX, textureY); // Du loco part19
		bodyModel[120] = new ModelRendererTurbo(this, 440, 55, textureX, textureY); // Lamp
		bodyModel[121] = new ModelRendererTurbo(this, 440, 60, textureX, textureY); // Lamp
		bodyModel[122] = new ModelRendererTurbo(this, 398, 56, textureX, textureY); // Lamp
		bodyModel[123] = new ModelRendererTurbo(this, 423, 61, textureX, textureY); // Lamp
		bodyModel[124] = new ModelRendererTurbo(this, 423, 56, textureX, textureY); // Lamp
		bodyModel[125] = new ModelRendererTurbo(this, 398, 61, textureX, textureY); // Lamp
		bodyModel[126] = new ModelRendererTurbo(this, 257, 414, textureX, textureY); // Du loco part19
		bodyModel[127] = new ModelRendererTurbo(this, 287, 435, textureX, textureY); // Du loco part19
		bodyModel[128] = new ModelRendererTurbo(this, 257, 435, textureX, textureY); // Du loco part19
		bodyModel[129] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[130] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[131] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[132] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[133] = new ModelRendererTurbo(this, 288, 393, textureX, textureY); // Du loco part19
		bodyModel[134] = new ModelRendererTurbo(this, 43, 351, textureX, textureY); // Du loco part05
		bodyModel[135] = new ModelRendererTurbo(this, 45, 352, textureX, textureY); // Du loco part05
		bodyModel[136] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[137] = new ModelRendererTurbo(this, 41, 350, textureX, textureY); // Du loco part05
		bodyModel[138] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[139] = new ModelRendererTurbo(this, 44, 352, textureX, textureY); // Du loco part05
		bodyModel[140] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[141] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[142] = new ModelRendererTurbo(this, 43, 351, textureX, textureY); // Du loco part05
		bodyModel[143] = new ModelRendererTurbo(this, 44, 352, textureX, textureY); // Du loco part05
		bodyModel[144] = new ModelRendererTurbo(this, 43, 351, textureX, textureY); // Du loco part05
		bodyModel[145] = new ModelRendererTurbo(this, 41, 350, textureX, textureY); // Du loco part05
		bodyModel[146] = new ModelRendererTurbo(this, 42, 350, textureX, textureY); // Du loco part05
		bodyModel[147] = new ModelRendererTurbo(this, 44, 353, textureX, textureY); // Du loco part05
		bodyModel[148] = new ModelRendererTurbo(this, 43, 351, textureX, textureY); // Du loco part05
		bodyModel[149] = new ModelRendererTurbo(this, 42, 350, textureX, textureY); // Du loco part05
		bodyModel[150] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[151] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[152] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[153] = new ModelRendererTurbo(this, 12, 340, textureX, textureY); // Du loco part05
		bodyModel[154] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[155] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[156] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[157] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[158] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[159] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[160] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[161] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[162] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[163] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[164] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[165] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[166] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[167] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[168] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[169] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[170] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[171] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[172] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[173] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[174] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[175] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[176] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[177] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[178] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[179] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[180] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[181] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[182] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[183] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[184] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[185] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[186] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[187] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[188] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[189] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[190] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[191] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[192] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[193] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[194] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[195] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[196] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[197] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[198] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[199] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[200] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[201] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[202] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[203] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[204] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[205] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[206] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[207] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[208] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[209] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[210] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[211] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[212] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[213] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[214] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[215] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[216] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[217] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[218] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[219] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[220] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[221] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[222] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[223] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[224] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[225] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[226] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[227] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[228] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[229] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[230] = new ModelRendererTurbo(this, 214, 403, textureX, textureY); // Du loco part19
		bodyModel[231] = new ModelRendererTurbo(this, 308, 403, textureX, textureY); // Du loco part19
		bodyModel[232] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[233] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[234] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[235] = new ModelRendererTurbo(this, 12, 340, textureX, textureY); // Du loco part05
		bodyModel[236] = new ModelRendererTurbo(this, 12, 340, textureX, textureY); // Du loco part05
		bodyModel[237] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[238] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[239] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[240] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[241] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[242] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[243] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[244] = new ModelRendererTurbo(this, 13, 337, textureX, textureY); // Du loco part05
		bodyModel[245] = new ModelRendererTurbo(this, 13, 337, textureX, textureY); // Du loco part05
		bodyModel[246] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[247] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[248] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[249] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[250] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[251] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[252] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[253] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[254] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[255] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[256] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[257] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[258] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[259] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[260] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[261] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[262] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[263] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[264] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[265] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[266] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[267] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[268] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[269] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[270] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[271] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[272] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[273] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[274] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[275] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[276] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[277] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[278] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[279] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[280] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[281] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[282] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[283] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[284] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[285] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[286] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[287] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[288] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[289] = new ModelRendererTurbo(this, 11, 368, textureX, textureY); // Du loco part05
		bodyModel[290] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[291] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[292] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[293] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[294] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[295] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[296] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[297] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[298] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[299] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[300] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[301] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[302] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[303] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[304] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[305] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[306] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[307] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[308] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[309] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[310] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[311] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[312] = new ModelRendererTurbo(this, 20, 384, textureX, textureY); // Du loco part05
		bodyModel[313] = new ModelRendererTurbo(this, 20, 384, textureX, textureY); // Du loco part05
		bodyModel[314] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[315] = new ModelRendererTurbo(this, 26, 378, textureX, textureY); // Du loco part05
		bodyModel[316] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[317] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[318] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[319] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[320] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[321] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[322] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[323] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[324] = new ModelRendererTurbo(this, 162, 387, textureX, textureY); // Du loco part19
		bodyModel[325] = new ModelRendererTurbo(this, 174, 399, textureX, textureY); // Du loco part19
		bodyModel[326] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[327] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[328] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[329] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[330] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[331] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[332] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[333] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[334] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[335] = new ModelRendererTurbo(this, 201, 339, textureX, textureY); // Du loco part19
		bodyModel[336] = new ModelRendererTurbo(this, 165, 339, textureX, textureY); // Du loco part19
		bodyModel[337] = new ModelRendererTurbo(this, 270, 393, textureX, textureY); // Du loco part19
		bodyModel[338] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part28
		bodyModel[339] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[340] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part28
		bodyModel[341] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[342] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[343] = new ModelRendererTurbo(this, 90, 308, textureX, textureY); // Du loco part03
		bodyModel[344] = new ModelRendererTurbo(this, 77, 308, textureX, textureY); // Du loco part03
		bodyModel[345] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[346] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[347] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[348] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[349] = new ModelRendererTurbo(this, 301, 331, textureX, textureY); // Du loco part19
		bodyModel[350] = new ModelRendererTurbo(this, 345, 331, textureX, textureY); // Du loco part19
		bodyModel[351] = new ModelRendererTurbo(this, 313, 347, textureX, textureY); // Du loco part19
		bodyModel[352] = new ModelRendererTurbo(this, 333, 308, textureX, textureY); // Du loco part19
		bodyModel[353] = new ModelRendererTurbo(this, 388, 331, textureX, textureY); // Du loco part19
		bodyModel[354] = new ModelRendererTurbo(this, 296, 331, textureX, textureY); // Du loco part19
		bodyModel[355] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[356] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[357] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Du loco part28
		bodyModel[358] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part28
		bodyModel[359] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[360] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[361] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[362] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[363] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[364] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[365] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[366] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[367] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[368] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[369] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[370] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[371] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[372] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[373] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[374] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[375] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[376] = new ModelRendererTurbo(this, 456, 58, textureX, textureY); // Lamp
		bodyModel[377] = new ModelRendererTurbo(this, 441, 58, textureX, textureY); // Lamp
		bodyModel[378] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[379] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[380] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[381] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[382] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[383] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[384] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[385] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[386] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[387] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[388] = new ModelRendererTurbo(this, 414, 59, textureX, textureY); // Lamp
		bodyModel[389] = new ModelRendererTurbo(this, 399, 59, textureX, textureY); // Lamp
		bodyModel[390] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[391] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[392] = new ModelRendererTurbo(this, 227, 251, textureX, textureY); // Du loco part41
		bodyModel[393] = new ModelRendererTurbo(this, 227, 251, textureX, textureY); // Du loco part41
		bodyModel[394] = new ModelRendererTurbo(this, 47, 351, textureX, textureY); // Du loco part05
		bodyModel[395] = new ModelRendererTurbo(this, 46, 352, textureX, textureY); // Du loco part05
		bodyModel[396] = new ModelRendererTurbo(this, 47, 352, textureX, textureY); // Du loco part05
		bodyModel[397] = new ModelRendererTurbo(this, 46, 351, textureX, textureY); // Du loco part05
		bodyModel[398] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[399] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[400] = new ModelRendererTurbo(this, 245, 233, textureX, textureY); // Du loco part06
		bodyModel[401] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[402] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[403] = new ModelRendererTurbo(this, 294, 233, textureX, textureY); // Du loco part06
		bodyModel[404] = new ModelRendererTurbo(this, 293, 233, textureX, textureY); // Du loco part06
		bodyModel[405] = new ModelRendererTurbo(this, 294, 233, textureX, textureY); // Du loco part06
		bodyModel[406] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[407] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[408] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[409] = new ModelRendererTurbo(this, 247, 233, textureX, textureY); // Du loco part06
		bodyModel[410] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[411] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[412] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[413] = new ModelRendererTurbo(this, 294, 233, textureX, textureY); // Du loco part06
		bodyModel[414] = new ModelRendererTurbo(this, 290, 233, textureX, textureY); // Du loco part06
		bodyModel[415] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Du loco part06
		bodyModel[416] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[417] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[418] = new ModelRendererTurbo(this, 248, 233, textureX, textureY); // Du loco part06
		bodyModel[419] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[420] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[421] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[422] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[423] = new ModelRendererTurbo(this, 294, 233, textureX, textureY); // Du loco part06
		bodyModel[424] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[425] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[426] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[427] = new ModelRendererTurbo(this, 244, 233, textureX, textureY); // Du loco part06
		bodyModel[428] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[429] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[430] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[431] = new ModelRendererTurbo(this, 286, 233, textureX, textureY); // Du loco part06
		bodyModel[432] = new ModelRendererTurbo(this, 293, 233, textureX, textureY); // Du loco part06
		bodyModel[433] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[434] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[435] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[436] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[437] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[438] = new ModelRendererTurbo(this, 162, 344, textureX, textureY); // Du loco part19
		bodyModel[439] = new ModelRendererTurbo(this, 120, 411, textureX, textureY); // Du loco part19
		bodyModel[440] = new ModelRendererTurbo(this, 211, 382, textureX, textureY); // Du loco part19
		bodyModel[441] = new ModelRendererTurbo(this, 125, 382, textureX, textureY); // Du loco part19
		bodyModel[442] = new ModelRendererTurbo(this, 158, 356, textureX, textureY); // Du loco part19
		bodyModel[443] = new ModelRendererTurbo(this, 127, 367, textureX, textureY); // Du loco part19
		bodyModel[444] = new ModelRendererTurbo(this, 129, 345, textureX, textureY); // Du loco part19
		bodyModel[445] = new ModelRendererTurbo(this, 186, 371, textureX, textureY); // Du loco part19
		bodyModel[446] = new ModelRendererTurbo(this, 186, 356, textureX, textureY); // Du loco part19
		bodyModel[447] = new ModelRendererTurbo(this, 215, 367, textureX, textureY); // Du loco part19
		bodyModel[448] = new ModelRendererTurbo(this, 213, 345, textureX, textureY); // Du loco part19
		bodyModel[449] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[450] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[451] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[452] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[453] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[454] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[455] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[456] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[457] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[458] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[459] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[460] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[461] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[462] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[463] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[464] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[465] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[466] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[467] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[468] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[469] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[470] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[471] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[472] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[473] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[474] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[475] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[476] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[477] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[478] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[479] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[480] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[481] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[482] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[483] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[484] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[485] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[486] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[487] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[488] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[489] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[490] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[491] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[492] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[493] = new ModelRendererTurbo(this, 210, 339, textureX, textureY); // Du loco part19
		bodyModel[494] = new ModelRendererTurbo(this, 126, 339, textureX, textureY); // Du loco part19
		bodyModel[495] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[496] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[497] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[498] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[499] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05

		bodyModel[0].addShapeBox(0F, 0F, 0F, 66, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(5F, -7F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 60, 1, 22, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(8F, -12F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 120, 8, 0, 0F,0F, -4F, 0F, -60F, -4F, 0F, -60F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F); // Du loco part17
		bodyModel[2].setRotationPoint(8F, -15F, -6.15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 120, 8, 0, 0F,0F, -4F, 0F, -60F, -4F, 0F, -60F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F); // Du loco part27
		bodyModel[3].setRotationPoint(8F, -15F, 6.15F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[4].setRotationPoint(38F, -25F, -10F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[5].setRotationPoint(42F, -19F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[6].setRotationPoint(42F, -19F, -6F);
		bodyModel[6].rotateAngleY = -1.57079633F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[7].setRotationPoint(42F, -19F, -3F);
		bodyModel[7].rotateAngleY = -1.57079633F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[8].setRotationPoint(42F, -22F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[9].setRotationPoint(42F, -22F, -3F);
		bodyModel[9].rotateAngleY = -1.57079633F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[10].setRotationPoint(42F, -22F, -6F);
		bodyModel[10].rotateAngleY = -1.57079633F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[11].setRotationPoint(45F, -26F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[12].setRotationPoint(45F, -26F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[13].setRotationPoint(45F, -26F, -4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[14].setRotationPoint(-2F, -15F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[15].setRotationPoint(-2F, -13F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[16].setRotationPoint(45F, -22F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[17].setRotationPoint(44F, -21F, -4F);
		bodyModel[17].rotateAngleY = -1.57079633F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[18].setRotationPoint(43F, -21F, -4F);
		bodyModel[18].rotateAngleY = -1.57079633F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 19, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 138
		bodyModel[19].setRotationPoint(10F, -20F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[20].setRotationPoint(5F, -11F, 6.05F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[21].setRotationPoint(-7F, -11F, 6.05F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[22].setRotationPoint(-19F, -11F, 6.05F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[23].setRotationPoint(-31F, -11F, 6.05F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[24].setRotationPoint(5F, -11F, -6.05F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[25].setRotationPoint(-7F, -11F, -6.05F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[26].setRotationPoint(-19F, -11F, -6.05F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[27].setRotationPoint(-31F, -11F, -6.05F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[28].setRotationPoint(3F, -11F, -9F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[29].setRotationPoint(6F, -11F, -9F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[30].setRotationPoint(3F, -11F, 8F);

		bodyModel[31].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[31].setRotationPoint(6F, -11F, 8F);

		bodyModel[32].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[32].setRotationPoint(3F, -5F, -11F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[33].setRotationPoint(3F, -8F, -9F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[34].setRotationPoint(3F, -5F, 9F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[35].setRotationPoint(3F, -8F, 8F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[36].setRotationPoint(2F, -16F, 10F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[37].setRotationPoint(7F, -16F, 10F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[38].setRotationPoint(43F, -10F, -11F);

		bodyModel[39].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[39].setRotationPoint(44F, -11F, -11F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[40].setRotationPoint(49F, -11F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[41].setRotationPoint(68F, -16F, 10F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[42].setRotationPoint(73F, -16F, 10F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[43].setRotationPoint(51F, -25F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[44].setRotationPoint(48F, -19F, 4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[45].setRotationPoint(48F, -19F, 4F);
		bodyModel[45].rotateAngleY = -1.57079633F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[46].setRotationPoint(48F, -19F, 7F);
		bodyModel[46].rotateAngleY = -1.57079633F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[47].setRotationPoint(49F, -22F, 4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[48].setRotationPoint(49F, -22F, 7F);
		bodyModel[48].rotateAngleY = -1.57079633F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[49].setRotationPoint(49F, -22F, 4F);
		bodyModel[49].rotateAngleY = -1.57079633F;

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[50].setRotationPoint(48F, -26F, 4F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[51].setRotationPoint(48F, -26F, 3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[52].setRotationPoint(48F, -26F, 6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[53].setRotationPoint(48F, -22F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[54].setRotationPoint(50F, -21F, 6F);
		bodyModel[54].rotateAngleY = -1.57079633F;

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[55].setRotationPoint(49F, -21F, 6F);
		bodyModel[55].rotateAngleY = -1.57079633F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[56].setRotationPoint(9F, -11F, 8F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[57].setRotationPoint(20F, -9F, 8F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[58].setRotationPoint(8F, -9F, 8F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[59].setRotationPoint(9F, -9F, 8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[60].setRotationPoint(20F, -11F, 8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[61].setRotationPoint(8F, -11F, 8F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[62].setRotationPoint(8F, -10F, 8F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[63].setRotationPoint(20F, -10F, 8F);

		bodyModel[64].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Du loco part06
		bodyModel[64].setRotationPoint(9F, -10F, 8F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[65].setRotationPoint(69F, -11F, -9F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[66].setRotationPoint(72F, -11F, -9F);

		bodyModel[67].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[67].setRotationPoint(69F, -11F, 8F);

		bodyModel[68].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[68].setRotationPoint(72F, -11F, 8F);

		bodyModel[69].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[69].setRotationPoint(69F, -5F, -11F);

		bodyModel[70].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[70].setRotationPoint(69F, -8F, -9F);

		bodyModel[71].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[71].setRotationPoint(69F, -5F, 9F);

		bodyModel[72].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[72].setRotationPoint(69F, -8F, 8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[73].setRotationPoint(-2F, -25F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 156
		bodyModel[74].setRotationPoint(-2F, -25F, 5F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[75].setRotationPoint(-2.25F, -27F, -5.75F);

		bodyModel[76].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[76].setRotationPoint(-1.75F, -27F, -6.25F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[77].setRotationPoint(-2.25F, -27F, 5.75F);

		bodyModel[78].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[78].setRotationPoint(-1.75F, -27F, 5.25F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[79].setRotationPoint(2F, -27F, 11.05F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[80].setRotationPoint(2F, -27F, -11.05F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[81].setRotationPoint(-2F, -11F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[82].setRotationPoint(38.5F, -27F, 9.75F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[83].setRotationPoint(40.5F, -34F, 8.25F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[84].setRotationPoint(46F, -10F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[85].setRotationPoint(46F, -11F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[86].setRotationPoint(43F, -11F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[87].setRotationPoint(28F, -22F, -6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[88].setRotationPoint(28F, -21.25F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[89].setRotationPoint(28F, -20.5F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[90].setRotationPoint(28F, -19.75F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[91].setRotationPoint(28F, -19F, -6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[92].setRotationPoint(28F, -18.25F, -6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[93].setRotationPoint(28F, -17.5F, -6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[94].setRotationPoint(28F, -16.75F, -6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[95].setRotationPoint(28F, -23.5F, -6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[96].setRotationPoint(28F, -22.75F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[97].setRotationPoint(17F, -11F, -6.05F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[98].setRotationPoint(17F, -11F, 6.05F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[99].setRotationPoint(28F, -22F, 5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[100].setRotationPoint(28F, -21.25F, 5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[101].setRotationPoint(28F, -20.5F, 5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[102].setRotationPoint(28F, -19.75F, 5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[103].setRotationPoint(28F, -19F, 5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[104].setRotationPoint(28F, -18.25F, 5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[105].setRotationPoint(28F, -17.5F, 5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[106].setRotationPoint(28F, -16.75F, 5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[107].setRotationPoint(28F, -23.5F, 5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[108].setRotationPoint(28F, -22.75F, 5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Du loco part41
		bodyModel[109].setRotationPoint(-2F, -8F, -9F);

		bodyModel[110].addBox(0F, 0F, 0F, 78, 4, 12, 0F); // Du loco part01
		bodyModel[110].setRotationPoint(-1F, -11F, -6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[111].setRotationPoint(11F, -26F, -6F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 20, 6, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[112].setRotationPoint(37F, -18F, -11F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[113].setRotationPoint(37F, -25F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[114].setRotationPoint(37F, -25F, 10F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[115].setRotationPoint(37F, -25F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 7, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[116].setRotationPoint(56F, -25F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 20, 10, 3, 0F,-3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part19
		bodyModel[117].setRotationPoint(37F, -35F, -11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 20, 10, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[118].setRotationPoint(37F, -35F, 8F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 10, 10, 0F,-2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[119].setRotationPoint(37F, -35F, 0F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[120].setRotationPoint(-2F, -15F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[121].setRotationPoint(-2F, -13F, 5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[122].setRotationPoint(77F, -15F, -7F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[123].setRotationPoint(77F, -13F, -7F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[124].setRotationPoint(77F, -15F, 5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[125].setRotationPoint(77F, -13F, 5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 10, 10, 0F,-3F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[126].setRotationPoint(37F, -35F, -10F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 10, 10, 0F,-1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part19
		bodyModel[127].setRotationPoint(53F, -35F, 0F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 10, 10, 0F,0F, 0F, -2F, -3F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part19
		bodyModel[128].setRotationPoint(53F, -35F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Du loco part05
		bodyModel[129].setRotationPoint(46F, -34F, 8F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,-0.75F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -2.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F); // Du loco part05
		bodyModel[130].setRotationPoint(52.5F, -34F, 8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,-2F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -1.75F, -2F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, -2.75F, -0.25F, -1.75F, -2.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part05
		bodyModel[131].setRotationPoint(38.5F, -34F, 8F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Du loco part05
		bodyModel[132].setRotationPoint(41F, -34F, 8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,-3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[133].setRotationPoint(34F, -36F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[134].setRotationPoint(38.25F, -33F, 1F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -1F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -0.75F, -1F, -0.25F, -0.75F); // Du loco part05
		bodyModel[135].setRotationPoint(36.25F, -33F, 1F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -1F, -2.25F, -0.25F, -1F, -0.75F, -0.25F, -1.75F, -2.25F, -0.25F, -1.75F, -2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[136].setRotationPoint(37F, -33F, 7F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[137].setRotationPoint(36.75F, -29F, 1F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part05
		bodyModel[138].setRotationPoint(38.25F, -33F, -8F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -1F, -0.25F, -0.75F, -2F, -0.25F, -0.75F, -2F, -0.25F, 0F, -1F, -0.25F, 0F); // Du loco part05
		bodyModel[139].setRotationPoint(36.25F, -33F, -2F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-2.25F, -0.25F, -1F, -0.75F, -0.25F, -1F, -0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[140].setRotationPoint(37F, -33F, -9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part05
		bodyModel[141].setRotationPoint(36.75F, -29F, -9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[142].setRotationPoint(53.75F, -33F, 1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -2F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, -2F, -0.25F, -0.75F); // Du loco part05
		bodyModel[143].setRotationPoint(53.75F, -33F, 1F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -2.25F, -0.25F, -1F, -0.75F, -0.25F, -1F, -2.25F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F); // Du loco part05
		bodyModel[144].setRotationPoint(53F, -33F, 7F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[145].setRotationPoint(55.25F, -29F, 1F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Du loco part05
		bodyModel[146].setRotationPoint(53.75F, -33F, -8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -2F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, -2F, -0.25F, 0F); // Du loco part05
		bodyModel[147].setRotationPoint(53.75F, -33F, -2F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-0.75F, -0.25F, -1F, -2.25F, -0.25F, -1F, -2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -1.75F, -2.25F, -0.25F, -1.75F); // Du loco part05
		bodyModel[148].setRotationPoint(53F, -33F, -9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part05
		bodyModel[149].setRotationPoint(55.25F, -29F, -9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[150].setRotationPoint(46F, -34F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[151].setRotationPoint(41F, -34F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[152].setRotationPoint(25F, -16F, -6F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[153].setRotationPoint(25F, -22F, -6F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[154].setRotationPoint(25F, -21.25F, -6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[155].setRotationPoint(25F, -20.5F, -6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[156].setRotationPoint(25F, -19.75F, -6F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[157].setRotationPoint(25F, -19F, -6F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[158].setRotationPoint(25F, -18.25F, -6F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[159].setRotationPoint(25F, -17.5F, -6F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[160].setRotationPoint(25F, -23.5F, -6F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[161].setRotationPoint(25F, -22.75F, -6F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[162].setRotationPoint(21F, -16F, -6F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[163].setRotationPoint(21F, -24F, -6F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[164].setRotationPoint(21F, -22F, -6F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[165].setRotationPoint(21F, -21.25F, -6F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[166].setRotationPoint(21F, -20.5F, -6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[167].setRotationPoint(21F, -19.75F, -6F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[168].setRotationPoint(21F, -19F, -6F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[169].setRotationPoint(21F, -18.25F, -6F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[170].setRotationPoint(21F, -17.5F, -6F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[171].setRotationPoint(21F, -16.75F, -6F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[172].setRotationPoint(21F, -23.5F, -6F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[173].setRotationPoint(21F, -22.75F, -6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[174].setRotationPoint(18F, -16F, -6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[175].setRotationPoint(18F, -24F, -6F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[176].setRotationPoint(18F, -22F, -6F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[177].setRotationPoint(18F, -21.25F, -6F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[178].setRotationPoint(18F, -20.5F, -6F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[179].setRotationPoint(18F, -19.75F, -6F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[180].setRotationPoint(18F, -19F, -6F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[181].setRotationPoint(18F, -18.25F, -6F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[182].setRotationPoint(18F, -17.5F, -6F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[183].setRotationPoint(18F, -16.75F, -6F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[184].setRotationPoint(18F, -23.5F, -6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[185].setRotationPoint(18F, -22.75F, -6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[186].setRotationPoint(15F, -16F, -6F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[187].setRotationPoint(15F, -24F, -6F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[188].setRotationPoint(15F, -22F, -6F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[189].setRotationPoint(15F, -21.25F, -6F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[190].setRotationPoint(15F, -20.5F, -6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[191].setRotationPoint(15F, -19.75F, -6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[192].setRotationPoint(15F, -19F, -6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[193].setRotationPoint(15F, -18.25F, -6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[194].setRotationPoint(15F, -17.5F, -6F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[195].setRotationPoint(15F, -16.75F, -6F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[196].setRotationPoint(15F, -23.5F, -6F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[197].setRotationPoint(15F, -22.75F, -6F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[198].setRotationPoint(12F, -16F, -6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[199].setRotationPoint(12F, -24F, -6F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[200].setRotationPoint(12F, -22F, -6F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[201].setRotationPoint(12F, -21.25F, -6F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[202].setRotationPoint(12F, -20.5F, -6F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[203].setRotationPoint(12F, -19.75F, -6F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[204].setRotationPoint(12F, -19F, -6F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[205].setRotationPoint(12F, -18.25F, -6F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[206].setRotationPoint(12F, -17.5F, -6F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[207].setRotationPoint(12F, -16.75F, -6F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[208].setRotationPoint(12F, -23.5F, -6F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[209].setRotationPoint(12F, -22.75F, -6F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[210].setRotationPoint(62F, -22F, -6F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[211].setRotationPoint(62F, -21.25F, -6F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[212].setRotationPoint(62F, -20.5F, -6F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[213].setRotationPoint(62F, -19.75F, -6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[214].setRotationPoint(62F, -19F, -6F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[215].setRotationPoint(62F, -18.25F, -6F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[216].setRotationPoint(62F, -17.5F, -6F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[217].setRotationPoint(62F, -16.75F, -6F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[218].setRotationPoint(62F, -23.5F, -6F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[219].setRotationPoint(62F, -22.75F, -6F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[220].setRotationPoint(71F, -22F, -6F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[221].setRotationPoint(71F, -21.25F, -6F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[222].setRotationPoint(71F, -20.5F, -6F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[223].setRotationPoint(71F, -19.75F, -6F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[224].setRotationPoint(71F, -19F, -6F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[225].setRotationPoint(71F, -18.25F, -6F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[226].setRotationPoint(71F, -17.5F, -6F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[227].setRotationPoint(71F, -16.75F, -6F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[228].setRotationPoint(71F, -23.5F, -6F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[229].setRotationPoint(71F, -22.75F, -6F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 16, 1, 9, 0F,-3F, 0F, -2F, -3F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[230].setRotationPoint(39F, -36F, -9F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 16, 1, 9, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[231].setRotationPoint(39F, -36F, 0F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[232].setRotationPoint(24F, -23F, 5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[233].setRotationPoint(27F, -23F, 5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[234].setRotationPoint(25F, -16F, 5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[235].setRotationPoint(25F, -24F, 5F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[236].setRotationPoint(25F, -22F, 5F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[237].setRotationPoint(25F, -21.25F, 5F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[238].setRotationPoint(25F, -20.5F, 5F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[239].setRotationPoint(25F, -19.75F, 5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[240].setRotationPoint(25F, -19F, 5F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[241].setRotationPoint(25F, -18.25F, 5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[242].setRotationPoint(25F, -17.5F, 5F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[243].setRotationPoint(25F, -16.75F, 5F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[244].setRotationPoint(25F, -23.5F, 5F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[245].setRotationPoint(25F, -22.75F, 5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[246].setRotationPoint(21F, -22F, 5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[247].setRotationPoint(21F, -21.25F, 5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[248].setRotationPoint(21F, -20.5F, 5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[249].setRotationPoint(21F, -19.75F, 5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[250].setRotationPoint(21F, -19F, 5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[251].setRotationPoint(21F, -18.25F, 5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[252].setRotationPoint(21F, -17.5F, 5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[253].setRotationPoint(21F, -16.75F, 5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[254].setRotationPoint(21F, -23.5F, 5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[255].setRotationPoint(21F, -22.75F, 5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[256].setRotationPoint(18F, -22F, 5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[257].setRotationPoint(18F, -21.25F, 5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[258].setRotationPoint(18F, -20.5F, 5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[259].setRotationPoint(18F, -19.75F, 5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[260].setRotationPoint(18F, -19F, 5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[261].setRotationPoint(18F, -18.25F, 5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[262].setRotationPoint(18F, -17.5F, 5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[263].setRotationPoint(18F, -16.75F, 5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[264].setRotationPoint(18F, -23.5F, 5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[265].setRotationPoint(18F, -22.75F, 5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[266].setRotationPoint(15F, -22F, 5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[267].setRotationPoint(15F, -21.25F, 5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[268].setRotationPoint(15F, -20.5F, 5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[269].setRotationPoint(15F, -19.75F, 5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[270].setRotationPoint(15F, -19F, 5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[271].setRotationPoint(15F, -18.25F, 5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[272].setRotationPoint(15F, -17.5F, 5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[273].setRotationPoint(15F, -16.75F, 5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[274].setRotationPoint(15F, -23.5F, 5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[275].setRotationPoint(15F, -22.75F, 5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[276].setRotationPoint(11F, -23F, 5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[277].setRotationPoint(14F, -23F, 5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[278].setRotationPoint(12F, -16F, 5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[279].setRotationPoint(12F, -24F, 5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[280].setRotationPoint(12F, -22F, 5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[281].setRotationPoint(12F, -21.25F, 5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[282].setRotationPoint(12F, -20.5F, 5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[283].setRotationPoint(12F, -19.75F, 5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[284].setRotationPoint(12F, -19F, 5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[285].setRotationPoint(12F, -18.25F, 5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[286].setRotationPoint(12F, -17.5F, 5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[287].setRotationPoint(12F, -16.75F, 5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[288].setRotationPoint(12F, -23.5F, 5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[289].setRotationPoint(12F, -22.75F, 5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[290].setRotationPoint(62F, -16F, 5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[291].setRotationPoint(62F, -24F, 5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[292].setRotationPoint(62F, -22F, 5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[293].setRotationPoint(62F, -21.25F, 5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[294].setRotationPoint(62F, -20.5F, 5F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[295].setRotationPoint(62F, -19.75F, 5F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[296].setRotationPoint(62F, -19F, 5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[297].setRotationPoint(62F, -18.25F, 5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[298].setRotationPoint(62F, -17.5F, 5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[299].setRotationPoint(62F, -16.75F, 5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[300].setRotationPoint(62F, -23.5F, 5F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[301].setRotationPoint(62F, -22.75F, 5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[302].setRotationPoint(71F, -22F, 5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[303].setRotationPoint(71F, -21.25F, 5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[304].setRotationPoint(71F, -20.5F, 5F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[305].setRotationPoint(71F, -19.75F, 5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[306].setRotationPoint(71F, -19F, 5F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[307].setRotationPoint(71F, -18.25F, 5F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[308].setRotationPoint(71F, -17.5F, 5F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[309].setRotationPoint(71F, -16.75F, 5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[310].setRotationPoint(71F, -23.5F, 5F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[311].setRotationPoint(71F, -22.75F, 5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part05
		bodyModel[312].setRotationPoint(-2F, -23F, -5F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[313].setRotationPoint(-2F, -23F, 4F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[314].setRotationPoint(-2F, -12.25F, -5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[315].setRotationPoint(-2F, -24F, -5F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[316].setRotationPoint(-2F, -22F, -5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[317].setRotationPoint(-2F, -21.25F, -5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[318].setRotationPoint(-2F, -20.5F, -5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[319].setRotationPoint(-2F, -19.75F, -5F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[320].setRotationPoint(-2F, -19F, -5F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[321].setRotationPoint(-2F, -13F, -5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[322].setRotationPoint(-2F, -23.5F, -5F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[323].setRotationPoint(-2F, -22.75F, -5F);

		bodyModel[324].addBox(0F, 0F, 0F, 13, 1, 10, 0F); // Du loco part19
		bodyModel[324].setRotationPoint(24F, -25F, -5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[325].setRotationPoint(-2F, -24F, -5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[326].setRotationPoint(-2F, -18.25F, -5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[327].setRotationPoint(-2F, -17.5F, -5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[328].setRotationPoint(-2F, -16.75F, -5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[329].setRotationPoint(-2F, -16F, -5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[330].setRotationPoint(-2F, -15.25F, -5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[331].setRotationPoint(-2F, -14.5F, -5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[332].setRotationPoint(-2F, -13.75F, -5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[333].setRotationPoint(2F, -16F, 8F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[334].setRotationPoint(31F, -20F, 10F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[335].setRotationPoint(-2F, -25F, 5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[336].setRotationPoint(-2F, -25F, -6F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part19
		bodyModel[337].setRotationPoint(34F, -36F, 0F);

		bodyModel[338].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Du loco part28
		bodyModel[338].setRotationPoint(32F, -20F, 10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[339].setRotationPoint(31F, -20F, -11F);

		bodyModel[340].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Du loco part28
		bodyModel[340].setRotationPoint(32F, -20F, -11F);

		bodyModel[341].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[341].setRotationPoint(2F, -16F, 9F);

		bodyModel[342].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[342].setRotationPoint(8F, -16F, 10F);

		bodyModel[343].addBox(0F, 0F, 0F, 11, 1, 18, 0F); // Du loco part03
		bodyModel[343].setRotationPoint(-3F, -12F, -9F);

		bodyModel[344].addBox(0F, 0F, 0F, 11, 1, 18, 0F); // Du loco part03
		bodyModel[344].setRotationPoint(68F, -12F, -9F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[345].setRotationPoint(73F, -16F, 8F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[346].setRotationPoint(68F, -16F, 8F);

		bodyModel[347].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[347].setRotationPoint(68F, -16F, 9F);

		bodyModel[348].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[348].setRotationPoint(73F, -16F, 9F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 20, 14, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[349].setRotationPoint(57F, -26F, -6F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 20, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[350].setRotationPoint(57F, -26F, 5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 21, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[351].setRotationPoint(57F, -26F, -5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 13, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[352].setRotationPoint(77F, -25F, -5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[353].setRotationPoint(77F, -26F, 5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 14, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[354].setRotationPoint(77F, -26F, -6F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[355].setRotationPoint(2F, -16F, -11F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[356].setRotationPoint(7F, -16F, -11F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[357].setRotationPoint(68F, -16F, -11F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[358].setRotationPoint(73F, -16F, -11F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[359].setRotationPoint(7F, -16F, -9F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[360].setRotationPoint(2F, -16F, -9F);

		bodyModel[361].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[361].setRotationPoint(2F, -16F, -10F);

		bodyModel[362].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[362].setRotationPoint(7F, -16F, -10F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[363].setRotationPoint(73F, -16F, -9F);

		bodyModel[364].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[364].setRotationPoint(67F, -16F, -11F);

		bodyModel[365].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[365].setRotationPoint(73F, -16F, -10F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[366].setRotationPoint(-2.05F, -14F, 5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[367].setRotationPoint(-2.05F, -13F, 5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[368].setRotationPoint(-2.05F, -14F, -7F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[369].setRotationPoint(-2.05F, -13F, -7F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[370].setRotationPoint(-2.05F, -26F, -3F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[371].setRotationPoint(-2.05F, -25F, -3F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[372].setRotationPoint(-2.05F, -26F, -1F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[373].setRotationPoint(-2.05F, -25F, -1F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[374].setRotationPoint(-2.05F, -26F, 1F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[375].setRotationPoint(-2.05F, -25F, 1F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[376].setRotationPoint(-2F, -26F, -3F);

		bodyModel[377].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Lamp
		bodyModel[377].setRotationPoint(-2F, -25F, -3F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[378].setRotationPoint(78.05F, -14F, 5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[379].setRotationPoint(78.05F, -13F, 5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[380].setRotationPoint(78.05F, -14F, -7F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[381].setRotationPoint(78.05F, -13F, -7F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[382].setRotationPoint(78.05F, -27F, -3F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[383].setRotationPoint(78.05F, -26F, -3F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[384].setRotationPoint(78.05F, -27F, -1F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[385].setRotationPoint(78.05F, -26F, -1F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[386].setRotationPoint(78.05F, -27F, 1F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[387].setRotationPoint(78.05F, -26F, 1F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[388].setRotationPoint(77F, -27F, -3F);

		bodyModel[389].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Lamp
		bodyModel[389].setRotationPoint(77F, -26F, -3F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[390].setRotationPoint(9F, -19F, 10F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[391].setRotationPoint(66F, -19F, -11F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[392].setRotationPoint(78F, -11F, -9F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Du loco part41
		bodyModel[393].setRotationPoint(78F, -8F, -9F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[394].setRotationPoint(56F, -24F, -8F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[395].setRotationPoint(56F, -22F, -10F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part05
		bodyModel[396].setRotationPoint(56F, -24F, -10F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[397].setRotationPoint(56F, -24F, -10F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[398].setRotationPoint(23F, -11F, 8F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[399].setRotationPoint(34F, -9F, 8F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[400].setRotationPoint(22F, -9F, 8F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[401].setRotationPoint(23F, -9F, 8F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[402].setRotationPoint(34F, -11F, 8F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[403].setRotationPoint(22F, -11F, 8F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[404].setRotationPoint(22F, -10F, 8F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[405].setRotationPoint(34F, -10F, 8F);

		bodyModel[406].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Du loco part06
		bodyModel[406].setRotationPoint(23F, -10F, 8F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[407].setRotationPoint(42F, -11F, 8F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[408].setRotationPoint(49F, -9F, 8F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[409].setRotationPoint(41F, -9F, 8F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[410].setRotationPoint(42F, -9F, 8F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[411].setRotationPoint(49F, -11F, 8F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[412].setRotationPoint(41F, -11F, 8F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[413].setRotationPoint(41F, -10F, 8F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[414].setRotationPoint(49F, -10F, 8F);

		bodyModel[415].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Du loco part06
		bodyModel[415].setRotationPoint(42F, -10F, 8F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[416].setRotationPoint(9F, -11F, -11F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[417].setRotationPoint(20F, -9F, -11F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[418].setRotationPoint(8F, -9F, -11F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[419].setRotationPoint(9F, -9F, -11F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[420].setRotationPoint(20F, -11F, -11F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[421].setRotationPoint(8F, -11F, -11F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[422].setRotationPoint(8F, -10F, -11F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[423].setRotationPoint(20F, -10F, -11F);

		bodyModel[424].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Du loco part06
		bodyModel[424].setRotationPoint(9F, -10F, -11F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[425].setRotationPoint(23F, -11F, -11F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[426].setRotationPoint(34F, -9F, -11F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[427].setRotationPoint(22F, -9F, -11F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[428].setRotationPoint(23F, -9F, -11F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[429].setRotationPoint(34F, -11F, -11F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[430].setRotationPoint(22F, -11F, -11F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[431].setRotationPoint(22F, -10F, -11F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[432].setRotationPoint(34F, -10F, -11F);

		bodyModel[433].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Du loco part06
		bodyModel[433].setRotationPoint(23F, -10F, -11F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -2.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[434].setRotationPoint(41F, -34F, -12F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -2.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[435].setRotationPoint(46F, -34F, -12F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1.5F, -0.75F, -1.25F, -1.5F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -2.25F, -0.5F, -0.75F, -2.25F, -0.5F); // Du loco part05
		bodyModel[436].setRotationPoint(41F, -34F, 9F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 8, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1.5F, -0.75F, -1.25F, -1.5F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -2.25F, -0.5F, -0.75F, -2.25F, -0.5F); // Du loco part05
		bodyModel[437].setRotationPoint(46F, -34F, 9F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 13, 1, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[438].setRotationPoint(-2F, -25F, -5F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 37, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[439].setRotationPoint(0F, -26F, -1F);

		bodyModel[440].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Du loco part19
		bodyModel[440].setRotationPoint(11F, -26F, 1F);

		bodyModel[441].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Du loco part19
		bodyModel[441].setRotationPoint(11F, -26F, -5F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[442].setRotationPoint(-1F, -25F, -6F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 13, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[443].setRotationPoint(24F, -25F, -6F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[444].setRotationPoint(-1F, -26F, -7F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[445].setRotationPoint(11F, -26F, 5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 12, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[446].setRotationPoint(-1F, -25F, 5F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 13, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[447].setRotationPoint(24F, -25F, 5F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 13, 14, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[448].setRotationPoint(-1F, -26F, 6F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[449].setRotationPoint(9F, -22F, 6F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[450].setRotationPoint(9F, -21.25F, 6F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[451].setRotationPoint(9F, -20.5F, 6F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[452].setRotationPoint(9F, -19.75F, 6F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[453].setRotationPoint(9F, -19F, 6F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[454].setRotationPoint(9F, -18.25F, 6F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[455].setRotationPoint(9F, -17.5F, 6F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[456].setRotationPoint(9F, -16.75F, 6F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[457].setRotationPoint(9F, -23.5F, 6F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[458].setRotationPoint(9F, -22.75F, 6F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[459].setRotationPoint(6F, -22F, 6F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[460].setRotationPoint(6F, -21.25F, 6F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[461].setRotationPoint(6F, -20.5F, 6F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[462].setRotationPoint(6F, -19.75F, 6F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[463].setRotationPoint(6F, -19F, 6F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[464].setRotationPoint(6F, -18.25F, 6F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[465].setRotationPoint(6F, -17.5F, 6F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[466].setRotationPoint(6F, -16.75F, 6F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[467].setRotationPoint(6F, -23.5F, 6F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[468].setRotationPoint(6F, -22.75F, 6F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[469].setRotationPoint(3F, -22F, 6F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[470].setRotationPoint(3F, -21.25F, 6F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[471].setRotationPoint(3F, -20.5F, 6F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[472].setRotationPoint(3F, -19.75F, 6F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[473].setRotationPoint(3F, -19F, 6F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[474].setRotationPoint(3F, -18.25F, 6F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[475].setRotationPoint(3F, -17.5F, 6F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[476].setRotationPoint(3F, -16.75F, 6F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[477].setRotationPoint(3F, -23.5F, 6F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[478].setRotationPoint(3F, -22.75F, 6F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[479].setRotationPoint(-1F, -23F, 6F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[480].setRotationPoint(2F, -23F, 6F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[481].setRotationPoint(0F, -16F, 6F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[482].setRotationPoint(0F, -24F, 6F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[483].setRotationPoint(0F, -22F, 6F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[484].setRotationPoint(0F, -21.25F, 6F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[485].setRotationPoint(0F, -20.5F, 6F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[486].setRotationPoint(0F, -19.75F, 6F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[487].setRotationPoint(0F, -19F, 6F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[488].setRotationPoint(0F, -18.25F, 6F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[489].setRotationPoint(0F, -17.5F, 6F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[490].setRotationPoint(0F, -16.75F, 6F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[491].setRotationPoint(0F, -23.5F, 6F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[492].setRotationPoint(0F, -22.75F, 6F);

		bodyModel[493].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Du loco part19
		bodyModel[493].setRotationPoint(-1F, -26F, 2F);

		bodyModel[494].addBox(0F, 0F, 0F, 13, 1, 4, 0F); // Du loco part19
		bodyModel[494].setRotationPoint(-1F, -26F, -6F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[495].setRotationPoint(9F, -22F, -7F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[496].setRotationPoint(9F, -21.25F, -7F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[497].setRotationPoint(9F, -20.5F, -7F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[498].setRotationPoint(9F, -19.75F, -7F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[499].setRotationPoint(9F, -19F, -7F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[501] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[502] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[503] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[504] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[505] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[506] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[507] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[508] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[509] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[510] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[511] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[512] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[513] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[514] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[515] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[516] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[517] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[518] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[519] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[520] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[521] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[522] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[523] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[524] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[525] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[526] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[527] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[528] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[529] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[530] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[531] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[532] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[533] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[534] = new ModelRendererTurbo(this, 19, 368, textureX, textureY); // Du loco part05
		bodyModel[535] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[536] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 138
		bodyModel[537] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 138
		bodyModel[538] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[539] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[540] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[541] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[542] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[543] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[544] = new ModelRendererTurbo(this, 165, 395, textureX, textureY); // Du loco part19
		bodyModel[545] = new ModelRendererTurbo(this, 124, 395, textureX, textureY); // Du loco part19
		bodyModel[546] = new ModelRendererTurbo(this, 83, 356, textureX, textureY); // Du loco part41
		bodyModel[547] = new ModelRendererTurbo(this, 80, 351, textureX, textureY); // Du loco part41
		bodyModel[548] = new ModelRendererTurbo(this, 80, 354, textureX, textureY); // Du loco part41
		bodyModel[549] = new ModelRendererTurbo(this, 78, 351, textureX, textureY); // Du loco part41
		bodyModel[550] = new ModelRendererTurbo(this, 85, 350, textureX, textureY); // Du loco part41
		bodyModel[551] = new ModelRendererTurbo(this, 88, 352, textureX, textureY); // Du loco part41
		bodyModel[552] = new ModelRendererTurbo(this, 132, 309, textureX, textureY); // Du loco part28
		bodyModel[553] = new ModelRendererTurbo(this, 105, 311, textureX, textureY); // Du loco part28
		bodyModel[554] = new ModelRendererTurbo(this, 135, 309, textureX, textureY); // Du loco part28
		bodyModel[555] = new ModelRendererTurbo(this, 143, 312, textureX, textureY); // Du loco part28
		bodyModel[556] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[557] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[558] = new ModelRendererTurbo(this, 83, 356, textureX, textureY); // Du loco part41
		bodyModel[559] = new ModelRendererTurbo(this, 80, 351, textureX, textureY); // Du loco part41
		bodyModel[560] = new ModelRendererTurbo(this, 80, 354, textureX, textureY); // Du loco part41
		bodyModel[561] = new ModelRendererTurbo(this, 78, 351, textureX, textureY); // Du loco part41
		bodyModel[562] = new ModelRendererTurbo(this, 85, 350, textureX, textureY); // Du loco part41
		bodyModel[563] = new ModelRendererTurbo(this, 88, 352, textureX, textureY); // Du loco part41
		bodyModel[564] = new ModelRendererTurbo(this, 132, 309, textureX, textureY); // Du loco part28
		bodyModel[565] = new ModelRendererTurbo(this, 105, 311, textureX, textureY); // Du loco part28
		bodyModel[566] = new ModelRendererTurbo(this, 135, 309, textureX, textureY); // Du loco part28
		bodyModel[567] = new ModelRendererTurbo(this, 143, 312, textureX, textureY); // Du loco part28
		bodyModel[568] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[569] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[570] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[571] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[572] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[573] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[574] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[575] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[576] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[577] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[578] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[579] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[580] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[581] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[582] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[583] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[584] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[585] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[586] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[587] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[588] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[589] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[590] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[591] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[592] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[593] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[594] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[595] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[596] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[597] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[598] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[599] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[600] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[601] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[602] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[603] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[604] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[605] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[606] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[607] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[608] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[609] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[610] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[611] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[612] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[613] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[614] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[615] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[616] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[617] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[618] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[619] = new ModelRendererTurbo(this, 12, 340, textureX, textureY); // Du loco part05
		bodyModel[620] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[621] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[622] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[623] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[624] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[625] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[626] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[627] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[628] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[629] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[630] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[631] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[632] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[633] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[634] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[635] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[636] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[637] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[638] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[639] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[640] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[641] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[642] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[643] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[644] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[645] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[646] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[647] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[648] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[649] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[650] = new ModelRendererTurbo(this, 19, 365, textureX, textureY); // Du loco part05
		bodyModel[651] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[652] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[653] = new ModelRendererTurbo(this, 30, 357, textureX, textureY); // Du loco part05
		bodyModel[654] = new ModelRendererTurbo(this, 36, 357, textureX, textureY); // Du loco part05
		bodyModel[655] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[656] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[657] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[658] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[659] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[660] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[661] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[662] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[663] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[664] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[665] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[666] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[667] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[668] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[669] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[670] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[671] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[672] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[673] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[674] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[675] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[676] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[677] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[678] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[679] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[680] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[681] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[682] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[683] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[684] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[685] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[686] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[687] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[688] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[689] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[690] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[691] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[692] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[693] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[694] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[695] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[696] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[697] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[698] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[699] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[700] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[701] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[702] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[703] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[704] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[705] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[706] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[707] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[708] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[709] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[710] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[711] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[712] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[713] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[714] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[715] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[716] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[717] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[718] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[719] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[720] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[721] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[722] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[723] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[724] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0

		bodyModel[500].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[500].setRotationPoint(9F, -18.25F, -7F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[501].setRotationPoint(9F, -17.5F, -7F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[502].setRotationPoint(9F, -16.75F, -7F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[503].setRotationPoint(9F, -23.5F, -7F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[504].setRotationPoint(9F, -22.75F, -7F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[505].setRotationPoint(6F, -22F, -7F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[506].setRotationPoint(6F, -21.25F, -7F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[507].setRotationPoint(6F, -20.5F, -7F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[508].setRotationPoint(6F, -19.75F, -7F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[509].setRotationPoint(6F, -19F, -7F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[510].setRotationPoint(6F, -18.25F, -7F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[511].setRotationPoint(6F, -17.5F, -7F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[512].setRotationPoint(6F, -16.75F, -7F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[513].setRotationPoint(6F, -23.5F, -7F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[514].setRotationPoint(6F, -22.75F, -7F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[515].setRotationPoint(3F, -22F, -7F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[516].setRotationPoint(3F, -21.25F, -7F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[517].setRotationPoint(3F, -20.5F, -7F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[518].setRotationPoint(3F, -19.75F, -7F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[519].setRotationPoint(3F, -19F, -7F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[520].setRotationPoint(3F, -18.25F, -7F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[521].setRotationPoint(3F, -17.5F, -7F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[522].setRotationPoint(3F, -16.75F, -7F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[523].setRotationPoint(3F, -23.5F, -7F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[524].setRotationPoint(3F, -22.75F, -7F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[525].setRotationPoint(0F, -22F, -7F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[526].setRotationPoint(0F, -21.25F, -7F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[527].setRotationPoint(0F, -20.5F, -7F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[528].setRotationPoint(0F, -19.75F, -7F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[529].setRotationPoint(0F, -19F, -7F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[530].setRotationPoint(0F, -18.25F, -7F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[531].setRotationPoint(0F, -17.5F, -7F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[532].setRotationPoint(0F, -16.75F, -7F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[533].setRotationPoint(0F, -23.5F, -7F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[534].setRotationPoint(0F, -22.75F, -7F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[535].setRotationPoint(26F, -21F, -4F);

		bodyModel[536].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 138
		bodyModel[536].setRotationPoint(9.5F, -20.25F, 3F);

		bodyModel[537].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 138
		bodyModel[537].setRotationPoint(9.5F, -20.25F, -5F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[538].setRotationPoint(23.5F, -21F, -4F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[539].setRotationPoint(21F, -21F, -4F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[540].setRotationPoint(18.5F, -21F, -4F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[541].setRotationPoint(16F, -21F, -4F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[542].setRotationPoint(13.5F, -21F, -4F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[543].setRotationPoint(11F, -21F, -4F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 0, 22, 20, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -10F, 0F, 0.125F, -10F, 0F, -11.125F, 0F, 0F, -11.125F, 0F, 0F, -11.125F, -10F, 0F, -11.125F, -10F); // Du loco part19
		bodyModel[544].setRotationPoint(-2.05F, -23F, -5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 0, 22, 20, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -10F, 0F, 0.125F, -10F, 0F, -11.125F, 0F, 0F, -11.125F, 0F, 0F, -11.125F, -10F, 0F, -11.125F, -10F); // Du loco part19
		bodyModel[545].setRotationPoint(78.05F, -23F, -5F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -2.875F, -1F, -1F, -2F, -1F, -1F, -4.875F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[546].setRotationPoint(-2F, -3F, -9F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[547].setRotationPoint(-2F, -5F, -9F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 0F, -1F, 0F, 0F, -1F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[548].setRotationPoint(-2F, -6F, -9F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, -1F, -4.875F, 0F, -1F, -2F, -1F, -1F, -2.875F, -1F, -1F); // Du loco part41
		bodyModel[549].setRotationPoint(-2F, -3F, 2F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[550].setRotationPoint(-2F, -5F, 2F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, -1F, -4.875F, 0F, -1F, -1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F); // Du loco part41
		bodyModel[551].setRotationPoint(-2F, -6F, 2F);

		bodyModel[552].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[552].setRotationPoint(2F, -4F, 6F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[553].setRotationPoint(2F, -7F, 4F);

		bodyModel[554].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[554].setRotationPoint(2F, -4F, -7F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part28
		bodyModel[555].setRotationPoint(2F, -7F, -7F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part28
		bodyModel[556].setRotationPoint(1F, -4F, -7F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F); // Du loco part28
		bodyModel[557].setRotationPoint(1F, -4F, 6F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, -2F, -1F, -1F, -2.875F, -1F, -1F, 0F, 0F, -1F, -4.875F, 0F, -1F); // Du loco part41
		bodyModel[558].setRotationPoint(74F, -3F, -9F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[559].setRotationPoint(74F, -5F, -9F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 0F, -1F, -4.875F, 0F, -1F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[560].setRotationPoint(74F, -6F, -9F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, -1F, 0F, 0F, -1F, -2.875F, -1F, -1F, -2F, -1F, -1F); // Du loco part41
		bodyModel[561].setRotationPoint(74F, -3F, 2F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[562].setRotationPoint(74F, -5F, 2F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, -1F, 0F, 0F, -1F, -3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F); // Du loco part41
		bodyModel[563].setRotationPoint(74F, -6F, 2F);

		bodyModel[564].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[564].setRotationPoint(73F, -4F, 6F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[565].setRotationPoint(73F, -7F, 4F);

		bodyModel[566].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[566].setRotationPoint(73F, -4F, -7F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part28
		bodyModel[567].setRotationPoint(73F, -7F, -7F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[568].setRotationPoint(75F, -4F, -7F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[569].setRotationPoint(75F, -4F, 6F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[570].setRotationPoint(14F, -23F, 5F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[571].setRotationPoint(17F, -23F, 5F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[572].setRotationPoint(17F, -23F, 5F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[573].setRotationPoint(20F, -23F, 5F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[574].setRotationPoint(20F, -23F, 5F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[575].setRotationPoint(23F, -23F, 5F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[576].setRotationPoint(15F, -16F, 5F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[577].setRotationPoint(15F, -24F, 5F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[578].setRotationPoint(18F, -16F, 5F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[579].setRotationPoint(18F, -24F, 5F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[580].setRotationPoint(21F, -16F, 5F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[581].setRotationPoint(21F, -24F, 5F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[582].setRotationPoint(11F, -23F, -6F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[583].setRotationPoint(14F, -23F, -6F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[584].setRotationPoint(12F, -16F, -6F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[585].setRotationPoint(12F, -24F, -6F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[586].setRotationPoint(14F, -23F, -6F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[587].setRotationPoint(17F, -23F, -6F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[588].setRotationPoint(17F, -23F, -6F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[589].setRotationPoint(20F, -23F, -6F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[590].setRotationPoint(20F, -23F, -6F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[591].setRotationPoint(23F, -23F, -6F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[592].setRotationPoint(15F, -16F, -6F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[593].setRotationPoint(15F, -24F, -6F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[594].setRotationPoint(18F, -16F, -6F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[595].setRotationPoint(18F, -24F, -6F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[596].setRotationPoint(21F, -16F, -6F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[597].setRotationPoint(21F, -24F, -6F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[598].setRotationPoint(27F, -23F, 5F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[599].setRotationPoint(30F, -23F, 5F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[600].setRotationPoint(28F, -16F, 5F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[601].setRotationPoint(28F, -24F, 5F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[602].setRotationPoint(61F, -23F, 5F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[603].setRotationPoint(65F, -23F, 5F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[604].setRotationPoint(70F, -23F, 5F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[605].setRotationPoint(74F, -23F, 5F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[606].setRotationPoint(71F, -16F, 5F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[607].setRotationPoint(71F, -24F, 5F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[608].setRotationPoint(62F, -16F, -6F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[609].setRotationPoint(62F, -24F, -6F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[610].setRotationPoint(61F, -23F, -6F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[611].setRotationPoint(65F, -23F, -6F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[612].setRotationPoint(70F, -23F, -6F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[613].setRotationPoint(74F, -23F, -6F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[614].setRotationPoint(71F, -16F, -6F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[615].setRotationPoint(71F, -24F, -6F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[616].setRotationPoint(24F, -23F, -6F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[617].setRotationPoint(27F, -23F, -6F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[618].setRotationPoint(25F, -16F, -6F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[619].setRotationPoint(25F, -24F, -6F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[620].setRotationPoint(27F, -23F, -6F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[621].setRotationPoint(30F, -23F, -6F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[622].setRotationPoint(28F, -16F, -6F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[623].setRotationPoint(28F, -24F, -6F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[624].setRotationPoint(2F, -23F, 6F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[625].setRotationPoint(5F, -23F, 6F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[626].setRotationPoint(3F, -16F, 6F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[627].setRotationPoint(3F, -24F, 6F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[628].setRotationPoint(5F, -23F, 6F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[629].setRotationPoint(8F, -23F, 6F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[630].setRotationPoint(6F, -16F, 6F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[631].setRotationPoint(6F, -24F, 6F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[632].setRotationPoint(8F, -23F, 6F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[633].setRotationPoint(11F, -23F, 6F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[634].setRotationPoint(9F, -16F, 6F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[635].setRotationPoint(9F, -24F, 6F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[636].setRotationPoint(-1F, -23F, -7F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[637].setRotationPoint(0F, -16F, -7F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[638].setRotationPoint(0F, -24F, -7F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[639].setRotationPoint(2F, -23F, -7F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[640].setRotationPoint(5F, -23F, -7F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[641].setRotationPoint(3F, -16F, -7F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[642].setRotationPoint(3F, -24F, -7F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[643].setRotationPoint(5F, -23F, -7F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[644].setRotationPoint(8F, -23F, -7F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[645].setRotationPoint(6F, -16F, -7F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[646].setRotationPoint(6F, -24F, -7F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[647].setRotationPoint(8F, -23F, -7F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[648].setRotationPoint(11F, -23F, -7F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[649].setRotationPoint(9F, -16F, -7F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[650].setRotationPoint(9F, -24F, -7F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,-0.75F, -0.25F, -1.75F, -2F, -0.25F, -1.75F, -2F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -2.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[651].setRotationPoint(52.5F, -34F, -11F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 3, 8, 3, 0F,-2F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F, -2.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F); // Du loco part05
		bodyModel[652].setRotationPoint(38.5F, -34F, -11F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 17, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[653].setRotationPoint(38.5F, -27F, -10.75F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[654].setRotationPoint(40.5F, -34F, -9.25F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[655].setRotationPoint(2F, -23F, -7F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[656].setRotationPoint(25F, -16.75F, -6F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[657].setRotationPoint(-3F, -9.25F, 4.43F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[658].setRotationPoint(-2.75F, -9F, 4.9F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[659].setRotationPoint(-5.5F, -8.75F, 5.15F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[660].setRotationPoint(-3F, -9.25F, -6.63F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[661].setRotationPoint(-5.5F, -8.75F, -5.88F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[662].setRotationPoint(-3F, -8.75F, 0F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[663].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[664].setRotationPoint(-2.5F, -8.5F, -0.25F);

		bodyModel[665].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[665].setRotationPoint(-4.5F, -7F, -0.25F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[666].setRotationPoint(-3.5F, -8.75F, -0.25F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[667].setRotationPoint(-4.5F, -8.5F, 0F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[668].setRotationPoint(-4.5F, -8.5F, -0.75F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[669].setRotationPoint(-3F, -8.75F, 0.25F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[670].setRotationPoint(-3F, -8.5F, -0.25F);

		bodyModel[671].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[671].setRotationPoint(-3F, -9F, -0.5F);

		bodyModel[672].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[672].setRotationPoint(-3F, -6F, -0.5F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[673].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[674].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[674].setRotationPoint(-4.5F, -6F, -0.5F);

		bodyModel[675].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[675].setRotationPoint(-4.5F, -5.25F, -0.5F);

		bodyModel[676].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[676].setRotationPoint(-6.5F, -8.87F, 4.03F);

		bodyModel[677].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[677].setRotationPoint(-6.5F, -9.87F, 4.03F);

		bodyModel[678].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[678].setRotationPoint(-6.5F, -9.37F, 4.03F);

		bodyModel[679].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[679].setRotationPoint(-6.5F, -7.87F, 4.03F);

		bodyModel[680].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[680].setRotationPoint(-6.5F, -8.37F, 4.03F);

		bodyModel[681].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[681].setRotationPoint(-6.5F, -8.87F, -7.03F);

		bodyModel[682].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[682].setRotationPoint(-6.5F, -9.87F, -7.03F);

		bodyModel[683].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[683].setRotationPoint(-6.5F, -9.37F, -7.03F);

		bodyModel[684].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[684].setRotationPoint(-6.5F, -7.87F, -7.03F);

		bodyModel[685].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[685].setRotationPoint(-6.5F, -8.37F, -7.03F);

		bodyModel[686].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[686].setRotationPoint(-2.75F, -9.5F, 4.9F);

		bodyModel[687].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[687].setRotationPoint(-2.75F, -8.25F, 4.9F);

		bodyModel[688].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[688].setRotationPoint(-2.75F, -9F, -6.13F);

		bodyModel[689].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[689].setRotationPoint(-2.75F, -9.5F, -6.13F);

		bodyModel[690].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[690].setRotationPoint(-2.75F, -8.25F, -6.13F);

		bodyModel[691].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[691].setRotationPoint(79F, -9.25F, 4.43F);

		bodyModel[692].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[692].setRotationPoint(78.75F, -9F, 4.9F);

		bodyModel[693].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[693].setRotationPoint(79.5F, -8.75F, 5.15F);

		bodyModel[694].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[694].setRotationPoint(79F, -9.25F, -6.63F);

		bodyModel[695].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[695].setRotationPoint(79.5F, -8.75F, -5.88F);

		bodyModel[696].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[696].setRotationPoint(79F, -8.75F, 0F);

		bodyModel[697].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[697].setRotationPoint(79F, -8.75F, -1F);

		bodyModel[698].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[698].setRotationPoint(78.5F, -8.5F, -0.25F);

		bodyModel[699].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[699].setRotationPoint(79.5F, -7F, -0.25F);

		bodyModel[700].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[700].setRotationPoint(79.5F, -8.75F, -0.25F);

		bodyModel[701].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[701].setRotationPoint(78.5F, -8.5F, 0F);

		bodyModel[702].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[702].setRotationPoint(78.5F, -8.5F, -0.75F);

		bodyModel[703].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[703].setRotationPoint(79F, -8.75F, 0.25F);

		bodyModel[704].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[704].setRotationPoint(79F, -8.5F, -0.25F);

		bodyModel[705].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[705].setRotationPoint(79F, -9F, -0.5F);

		bodyModel[706].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[706].setRotationPoint(79F, -6F, -0.5F);

		bodyModel[707].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[707].setRotationPoint(79F, -8.75F, -1F);

		bodyModel[708].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[708].setRotationPoint(79.5F, -6F, -0.5F);

		bodyModel[709].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[709].setRotationPoint(80.5F, -5.25F, -0.5F);

		bodyModel[710].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[710].setRotationPoint(82.5F, -8.87F, 4.03F);

		bodyModel[711].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[711].setRotationPoint(82.5F, -9.87F, 4.03F);

		bodyModel[712].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[712].setRotationPoint(82.5F, -9.37F, 4.03F);

		bodyModel[713].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[713].setRotationPoint(82.5F, -7.87F, 4.03F);

		bodyModel[714].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[714].setRotationPoint(82.5F, -8.37F, 4.03F);

		bodyModel[715].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[715].setRotationPoint(82.5F, -8.87F, -7.03F);

		bodyModel[716].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[716].setRotationPoint(82.5F, -9.87F, -7.03F);

		bodyModel[717].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[717].setRotationPoint(82.5F, -9.37F, -7.03F);

		bodyModel[718].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[718].setRotationPoint(82.5F, -7.87F, -7.03F);

		bodyModel[719].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[719].setRotationPoint(82.5F, -8.37F, -7.03F);

		bodyModel[720].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[720].setRotationPoint(78.75F, -9.5F, 4.9F);

		bodyModel[721].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[721].setRotationPoint(78.75F, -8.25F, 4.9F);

		bodyModel[722].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[722].setRotationPoint(78.75F, -9F, -6.13F);

		bodyModel[723].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[723].setRotationPoint(78.75F, -9.5F, -6.13F);

		bodyModel[724].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[724].setRotationPoint(78.75F, -8.25F, -6.13F);
	}
}