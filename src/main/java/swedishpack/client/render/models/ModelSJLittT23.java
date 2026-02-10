//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera T23
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittT23 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittT23()  //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[504];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 39, 308, textureX, textureY); // Du loco part01
		bodyModel[1] = new ModelRendererTurbo(this, 43, 303, textureX, textureY); // Du loco part03
		bodyModel[2] = new ModelRendererTurbo(this, 39, 329, textureX, textureY); // Du loco part27
		bodyModel[3] = new ModelRendererTurbo(this, 253, 37, textureX, textureY); // Du loco part82
		bodyModel[4] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part83
		bodyModel[5] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Du loco part84
		bodyModel[6] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part85
		bodyModel[7] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part94
		bodyModel[8] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Du loco part95
		bodyModel[9] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part97
		bodyModel[10] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part100
		bodyModel[11] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Du loco part101
		bodyModel[12] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Du loco part102
		bodyModel[13] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 177
		bodyModel[14] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 194
		bodyModel[15] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 195
		bodyModel[16] = new ModelRendererTurbo(this, 4, 6, textureX, textureY); // Box 138
		bodyModel[17] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Du loco part28
		bodyModel[18] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part28
		bodyModel[19] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[20] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[21] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Du loco part28
		bodyModel[22] = new ModelRendererTurbo(this, 146, 74, textureX, textureY); // Du loco part28
		bodyModel[23] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part28
		bodyModel[24] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[25] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[26] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[27] = new ModelRendererTurbo(this, 470, 78, textureX, textureY); // Du loco part28
		bodyModel[28] = new ModelRendererTurbo(this, 469, 78, textureX, textureY); // Du loco part28
		bodyModel[29] = new ModelRendererTurbo(this, 317, 213, textureX, textureY); // Du loco part82
		bodyModel[30] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Du loco part83
		bodyModel[31] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Du loco part84
		bodyModel[32] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Du loco part85
		bodyModel[33] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Du loco part94
		bodyModel[34] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Du loco part95
		bodyModel[35] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Du loco part97
		bodyModel[36] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Du loco part100
		bodyModel[37] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part101
		bodyModel[38] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Du loco part102
		bodyModel[39] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 177
		bodyModel[40] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 193
		bodyModel[41] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 196
		bodyModel[42] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Du loco part28
		bodyModel[43] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Du loco part28
		bodyModel[44] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Du loco part28
		bodyModel[45] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Du loco part28
		bodyModel[46] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Du loco part28
		bodyModel[47] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[48] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Du loco part28
		bodyModel[49] = new ModelRendererTurbo(this, 98, 241, textureX, textureY); // Du loco part28
		bodyModel[50] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 154
		bodyModel[51] = new ModelRendererTurbo(this, 115, 251, textureX, textureY); // Du loco part41
		bodyModel[52] = new ModelRendererTurbo(this, 29, 357, textureX, textureY); // Du loco part05
		bodyModel[53] = new ModelRendererTurbo(this, 36, 357, textureX, textureY); // Du loco part05
		bodyModel[54] = new ModelRendererTurbo(this, 115, 252, textureX, textureY); // Du loco part41
		bodyModel[55] = new ModelRendererTurbo(this, 39, 309, textureX, textureY); // Du loco part01
		bodyModel[56] = new ModelRendererTurbo(this, 91, 385, textureX, textureY); // Du loco part19
		bodyModel[57] = new ModelRendererTurbo(this, 245, 357, textureX, textureY); // Du loco part19
		bodyModel[58] = new ModelRendererTurbo(this, 316, 436, textureX, textureY); // Du loco part19
		bodyModel[59] = new ModelRendererTurbo(this, 316, 436, textureX, textureY); // Du loco part19
		bodyModel[60] = new ModelRendererTurbo(this, 293, 456, textureX, textureY); // Du loco part19
		bodyModel[61] = new ModelRendererTurbo(this, 242, 456, textureX, textureY); // Du loco part19
		bodyModel[62] = new ModelRendererTurbo(this, 208, 421, textureX, textureY); // Du loco part19
		bodyModel[63] = new ModelRendererTurbo(this, 316, 421, textureX, textureY); // Du loco part19
		bodyModel[64] = new ModelRendererTurbo(this, 287, 414, textureX, textureY); // Du loco part19
		bodyModel[65] = new ModelRendererTurbo(this, 257, 414, textureX, textureY); // Du loco part19
		bodyModel[66] = new ModelRendererTurbo(this, 287, 435, textureX, textureY); // Du loco part19
		bodyModel[67] = new ModelRendererTurbo(this, 257, 435, textureX, textureY); // Du loco part19
		bodyModel[68] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[69] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[70] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[71] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[72] = new ModelRendererTurbo(this, 43, 351, textureX, textureY); // Du loco part05
		bodyModel[73] = new ModelRendererTurbo(this, 45, 352, textureX, textureY); // Du loco part05
		bodyModel[74] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[75] = new ModelRendererTurbo(this, 41, 350, textureX, textureY); // Du loco part05
		bodyModel[76] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[77] = new ModelRendererTurbo(this, 44, 352, textureX, textureY); // Du loco part05
		bodyModel[78] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[79] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[80] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[81] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[82] = new ModelRendererTurbo(this, 214, 403, textureX, textureY); // Du loco part19
		bodyModel[83] = new ModelRendererTurbo(this, 308, 403, textureX, textureY); // Du loco part19
		bodyModel[84] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[85] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[86] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[87] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[88] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[89] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[90] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[91] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[92] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[93] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[94] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[95] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[96] = new ModelRendererTurbo(this, 6, 345, textureX, textureY); // Du loco part05
		bodyModel[97] = new ModelRendererTurbo(this, 6, 345, textureX, textureY); // Du loco part05
		bodyModel[98] = new ModelRendererTurbo(this, 26, 378, textureX, textureY); // Du loco part05
		bodyModel[99] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[100] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[101] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[102] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[103] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[104] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[105] = new ModelRendererTurbo(this, 26, 378, textureX, textureY); // Du loco part05
		bodyModel[106] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[107] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[108] = new ModelRendererTurbo(this, 191, 439, textureX, textureY); // Du loco part19
		bodyModel[109] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[110] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[111] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[112] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[113] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[114] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[115] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[116] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[117] = new ModelRendererTurbo(this, 201, 339, textureX, textureY); // Du loco part19
		bodyModel[118] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[119] = new ModelRendererTurbo(this, 477, 63, textureX, textureY); // Du loco part28
		bodyModel[120] = new ModelRendererTurbo(this, 90, 308, textureX, textureY); // Du loco part03
		bodyModel[121] = new ModelRendererTurbo(this, 77, 308, textureX, textureY); // Du loco part03
		bodyModel[122] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[123] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[124] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[125] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[126] = new ModelRendererTurbo(this, 327, 299, textureX, textureY); // Du loco part19
		bodyModel[127] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[128] = new ModelRendererTurbo(this, 325, 56, textureX, textureY); // Du loco part28
		bodyModel[129] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[130] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[131] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[132] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[133] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[134] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[135] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[136] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[137] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[138] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[139] = new ModelRendererTurbo(this, 451, 27, textureX, textureY); // Lamp
		bodyModel[140] = new ModelRendererTurbo(this, 132, 40, textureX, textureY); // Lamp
		bodyModel[141] = new ModelRendererTurbo(this, 451, 25, textureX, textureY); // Lamp
		bodyModel[142] = new ModelRendererTurbo(this, 132, 36, textureX, textureY); // Lamp
		bodyModel[143] = new ModelRendererTurbo(this, 456, 58, textureX, textureY); // Lamp
		bodyModel[144] = new ModelRendererTurbo(this, 441, 58, textureX, textureY); // Lamp
		bodyModel[145] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[146] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[147] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[148] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[149] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[150] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[151] = new ModelRendererTurbo(this, 451, 27, textureX, textureY); // Lamp
		bodyModel[152] = new ModelRendererTurbo(this, 132, 40, textureX, textureY); // Lamp
		bodyModel[153] = new ModelRendererTurbo(this, 451, 30, textureX, textureY); // Lamp
		bodyModel[154] = new ModelRendererTurbo(this, 133, 32, textureX, textureY); // Lamp
		bodyModel[155] = new ModelRendererTurbo(this, 414, 59, textureX, textureY); // Lamp
		bodyModel[156] = new ModelRendererTurbo(this, 399, 59, textureX, textureY); // Lamp
		bodyModel[157] = new ModelRendererTurbo(this, 227, 251, textureX, textureY); // Du loco part41
		bodyModel[158] = new ModelRendererTurbo(this, 227, 251, textureX, textureY); // Du loco part41
		bodyModel[159] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[160] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[161] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[162] = new ModelRendererTurbo(this, 42, 337, textureX, textureY); // Du loco part05
		bodyModel[163] = new ModelRendererTurbo(this, 69, 445, textureX, textureY); // Du loco part19
		bodyModel[164] = new ModelRendererTurbo(this, 148, 350, textureX, textureY); // Du loco part19
		bodyModel[165] = new ModelRendererTurbo(this, 156, 367, textureX, textureY); // Du loco part19
		bodyModel[166] = new ModelRendererTurbo(this, 148, 350, textureX, textureY); // Du loco part19
		bodyModel[167] = new ModelRendererTurbo(this, 127, 367, textureX, textureY); // Du loco part19
		bodyModel[168] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[169] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 138
		bodyModel[170] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 138
		bodyModel[171] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[172] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[173] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[174] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[175] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[176] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[177] = new ModelRendererTurbo(this, 124, 395, textureX, textureY); // Du loco part19
		bodyModel[178] = new ModelRendererTurbo(this, 83, 356, textureX, textureY); // Du loco part41
		bodyModel[179] = new ModelRendererTurbo(this, 80, 351, textureX, textureY); // Du loco part41
		bodyModel[180] = new ModelRendererTurbo(this, 80, 354, textureX, textureY); // Du loco part41
		bodyModel[181] = new ModelRendererTurbo(this, 78, 351, textureX, textureY); // Du loco part41
		bodyModel[182] = new ModelRendererTurbo(this, 85, 350, textureX, textureY); // Du loco part41
		bodyModel[183] = new ModelRendererTurbo(this, 88, 352, textureX, textureY); // Du loco part41
		bodyModel[184] = new ModelRendererTurbo(this, 132, 309, textureX, textureY); // Du loco part28
		bodyModel[185] = new ModelRendererTurbo(this, 105, 311, textureX, textureY); // Du loco part28
		bodyModel[186] = new ModelRendererTurbo(this, 135, 309, textureX, textureY); // Du loco part28
		bodyModel[187] = new ModelRendererTurbo(this, 143, 312, textureX, textureY); // Du loco part28
		bodyModel[188] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[189] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[190] = new ModelRendererTurbo(this, 83, 356, textureX, textureY); // Du loco part41
		bodyModel[191] = new ModelRendererTurbo(this, 80, 351, textureX, textureY); // Du loco part41
		bodyModel[192] = new ModelRendererTurbo(this, 80, 354, textureX, textureY); // Du loco part41
		bodyModel[193] = new ModelRendererTurbo(this, 78, 351, textureX, textureY); // Du loco part41
		bodyModel[194] = new ModelRendererTurbo(this, 85, 350, textureX, textureY); // Du loco part41
		bodyModel[195] = new ModelRendererTurbo(this, 88, 352, textureX, textureY); // Du loco part41
		bodyModel[196] = new ModelRendererTurbo(this, 132, 309, textureX, textureY); // Du loco part28
		bodyModel[197] = new ModelRendererTurbo(this, 105, 311, textureX, textureY); // Du loco part28
		bodyModel[198] = new ModelRendererTurbo(this, 135, 309, textureX, textureY); // Du loco part28
		bodyModel[199] = new ModelRendererTurbo(this, 143, 312, textureX, textureY); // Du loco part28
		bodyModel[200] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[201] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[202] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[203] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[204] = new ModelRendererTurbo(this, 42, 354, textureX, textureY); // Du loco part05
		bodyModel[205] = new ModelRendererTurbo(this, 40, 355, textureX, textureY); // Du loco part05
		bodyModel[206] = new ModelRendererTurbo(this, 45, 351, textureX, textureY); // Du loco part05
		bodyModel[207] = new ModelRendererTurbo(this, 44, 352, textureX, textureY); // Du loco part05
		bodyModel[208] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[209] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[210] = new ModelRendererTurbo(this, 29, 357, textureX, textureY); // Du loco part05
		bodyModel[211] = new ModelRendererTurbo(this, 34, 357, textureX, textureY); // Du loco part05
		bodyModel[212] = new ModelRendererTurbo(this, 43, 304, textureX, textureY); // Du loco part03
		bodyModel[213] = new ModelRendererTurbo(this, 70, 443, textureX, textureY); // Du loco part19
		bodyModel[214] = new ModelRendererTurbo(this, 120, 411, textureX, textureY); // Du loco part19
		bodyModel[215] = new ModelRendererTurbo(this, 442, 59, textureX, textureY); // Lamp
		bodyModel[216] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[217] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[218] = new ModelRendererTurbo(this, 69, 444, textureX, textureY); // Du loco part19
		bodyModel[219] = new ModelRendererTurbo(this, 70, 447, textureX, textureY); // Du loco part19
		bodyModel[220] = new ModelRendererTurbo(this, 106, 385, textureX, textureY); // Du loco part19
		bodyModel[221] = new ModelRendererTurbo(this, 442, 59, textureX, textureY); // Lamp
		bodyModel[222] = new ModelRendererTurbo(this, 214, 434, textureX, textureY); // Du loco part19
		bodyModel[223] = new ModelRendererTurbo(this, 223, 434, textureX, textureY); // Du loco part19
		bodyModel[224] = new ModelRendererTurbo(this, 268, 393, textureX, textureY); // Du loco part19
		bodyModel[225] = new ModelRendererTurbo(this, 121, 385, textureX, textureY); // Du loco part19
		bodyModel[226] = new ModelRendererTurbo(this, 136, 385, textureX, textureY); // Du loco part19
		bodyModel[227] = new ModelRendererTurbo(this, 151, 385, textureX, textureY); // Du loco part19
		bodyModel[228] = new ModelRendererTurbo(this, 166, 385, textureX, textureY); // Du loco part19
		bodyModel[229] = new ModelRendererTurbo(this, 181, 385, textureX, textureY); // Du loco part19
		bodyModel[230] = new ModelRendererTurbo(this, 196, 385, textureX, textureY); // Du loco part19
		bodyModel[231] = new ModelRendererTurbo(this, 43, 351, textureX, textureY); // Du loco part05
		bodyModel[232] = new ModelRendererTurbo(this, 45, 352, textureX, textureY); // Du loco part05
		bodyModel[233] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[234] = new ModelRendererTurbo(this, 41, 350, textureX, textureY); // Du loco part05
		bodyModel[235] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[236] = new ModelRendererTurbo(this, 44, 352, textureX, textureY); // Du loco part05
		bodyModel[237] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[238] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[239] = new ModelRendererTurbo(this, 201, 339, textureX, textureY); // Du loco part19
		bodyModel[240] = new ModelRendererTurbo(this, 376, 331, textureX, textureY); // Du loco part19
		bodyModel[241] = new ModelRendererTurbo(this, 84, 444, textureX, textureY); // Du loco part19
		bodyModel[242] = new ModelRendererTurbo(this, 313, 331, textureX, textureY); // Du loco part19
		bodyModel[243] = new ModelRendererTurbo(this, 88, 444, textureX, textureY); // Du loco part19
		bodyModel[244] = new ModelRendererTurbo(this, 89, 445, textureX, textureY); // Du loco part19
		bodyModel[245] = new ModelRendererTurbo(this, 87, 444, textureX, textureY); // Du loco part19
		bodyModel[246] = new ModelRendererTurbo(this, 90, 446, textureX, textureY); // Du loco part19
		bodyModel[247] = new ModelRendererTurbo(this, 308, 331, textureX, textureY); // Du loco part19
		bodyModel[248] = new ModelRendererTurbo(this, 112, 442, textureX, textureY); // Du loco part19
		bodyModel[249] = new ModelRendererTurbo(this, 42, 302, textureX, textureY); // Du loco part03
		bodyModel[250] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[251] = new ModelRendererTurbo(this, 39, 329, textureX, textureY); // Du loco part27
		bodyModel[252] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Du loco part23
		bodyModel[253] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[254] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[255] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[256] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[257] = new ModelRendererTurbo(this, 345, 331, textureX, textureY); // Du loco part19
		bodyModel[258] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[259] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[260] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[261] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[262] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[263] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[264] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[265] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[266] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[267] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[268] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[269] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[270] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[271] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[272] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[273] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[274] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[275] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[276] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[277] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[278] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[279] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[280] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[281] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[282] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[283] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[284] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[285] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[286] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[287] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[288] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[289] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[290] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[291] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[292] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[293] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[294] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[295] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[296] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[297] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[298] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[299] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[300] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[301] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[302] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[303] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[304] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[305] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[306] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[307] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[308] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[309] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[310] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[311] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[312] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[313] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[314] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[315] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[316] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[317] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[318] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[319] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[320] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[321] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[322] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[323] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[324] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[325] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[326] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[327] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[328] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[329] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[330] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[331] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[332] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[333] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[334] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[335] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[336] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[337] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[338] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[339] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[340] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[341] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[342] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[343] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[344] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[345] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[346] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[347] = new ModelRendererTurbo(this, 1, 347, textureX, textureY); // Du loco part05
		bodyModel[348] = new ModelRendererTurbo(this, 1, 347, textureX, textureY); // Du loco part05
		bodyModel[349] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[350] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[351] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[352] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[353] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[354] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[355] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[356] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[357] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[358] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[359] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[360] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[361] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[362] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[363] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[364] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[365] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[366] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[367] = new ModelRendererTurbo(this, 50, 353, textureX, textureY); // Du loco part05
		bodyModel[368] = new ModelRendererTurbo(this, 81, 445, textureX, textureY); // Du loco part19
		bodyModel[369] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[370] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[371] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part28
		bodyModel[372] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[373] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Du loco part28
		bodyModel[374] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Du loco part28
		bodyModel[375] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Du loco part28
		bodyModel[376] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[377] = new ModelRendererTurbo(this, 43, 302, textureX, textureY); // Du loco part03
		bodyModel[378] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[379] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[380] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[381] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[382] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[383] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[384] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[385] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[386] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[387] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[388] = new ModelRendererTurbo(this, 478, 61, textureX, textureY); // Du loco part28
		bodyModel[389] = new ModelRendererTurbo(this, 478, 61, textureX, textureY); // Du loco part28
		bodyModel[390] = new ModelRendererTurbo(this, 469, 80, textureX, textureY); // Du loco part28
		bodyModel[391] = new ModelRendererTurbo(this, 469, 81, textureX, textureY); // Du loco part28
		bodyModel[392] = new ModelRendererTurbo(this, 470, 80, textureX, textureY); // Du loco part28
		bodyModel[393] = new ModelRendererTurbo(this, 469, 81, textureX, textureY); // Du loco part28
		bodyModel[394] = new ModelRendererTurbo(this, 144, 450, textureX, textureY); // Du loco part19
		bodyModel[395] = new ModelRendererTurbo(this, 147, 451, textureX, textureY); // Du loco part19
		bodyModel[396] = new ModelRendererTurbo(this, 98, 444, textureX, textureY); // Du loco part19
		bodyModel[397] = new ModelRendererTurbo(this, 442, 59, textureX, textureY); // Lamp
		bodyModel[398] = new ModelRendererTurbo(this, 442, 59, textureX, textureY); // Lamp
		bodyModel[399] = new ModelRendererTurbo(this, 165, 395, textureX, textureY); // Du loco part19
		bodyModel[400] = new ModelRendererTurbo(this, 340, 381, textureX, textureY); // Du loco part19
		bodyModel[401] = new ModelRendererTurbo(this, 340, 362, textureX, textureY); // Du loco part19
		bodyModel[402] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Du loco part23
		bodyModel[403] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[404] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[405] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[406] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[407] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[408] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[409] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[410] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[411] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[412] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[413] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[414] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part28
		bodyModel[415] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[416] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[417] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[418] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[419] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[420] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[421] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[422] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[423] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[424] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[425] = new ModelRendererTurbo(this, 478, 61, textureX, textureY); // Du loco part28
		bodyModel[426] = new ModelRendererTurbo(this, 478, 61, textureX, textureY); // Du loco part28
		bodyModel[427] = new ModelRendererTurbo(this, 81, 445, textureX, textureY); // Du loco part19
		bodyModel[428] = new ModelRendererTurbo(this, 470, 78, textureX, textureY); // Du loco part28
		bodyModel[429] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[430] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[431] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[432] = new ModelRendererTurbo(this, 477, 63, textureX, textureY); // Du loco part28
		bodyModel[433] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[434] = new ModelRendererTurbo(this, 81, 445, textureX, textureY); // Du loco part19
		bodyModel[435] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 154
		bodyModel[436] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[437] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[438] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[439] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[440] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[441] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[442] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[443] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[444] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[445] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[446] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[447] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[448] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[449] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[450] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[451] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[452] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[453] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[454] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[455] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[456] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[457] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[458] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[459] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[460] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[461] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[462] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[463] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[464] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[465] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[466] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[467] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[468] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[469] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[470] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[471] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[472] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[473] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[474] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[475] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[476] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[477] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[478] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[479] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[480] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[481] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[482] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[483] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[484] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[485] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[486] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[487] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[488] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[489] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[490] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[491] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[492] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[493] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[494] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[495] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[496] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[497] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[498] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[499] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 69, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(0F, -7F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 25, 1, 24, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(36F, -12F, -12F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 120, 8, 0, 0F,0F, -4F, 0F, -60F, -4F, 0F, -60F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F); // Du loco part27
		bodyModel[2].setRotationPoint(6F, -15F, 6.15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[3].setRotationPoint(38F, -25F, -10F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[4].setRotationPoint(42F, -19F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[5].setRotationPoint(42F, -19F, -6F);
		bodyModel[5].rotateAngleY = -1.57079633F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[6].setRotationPoint(42F, -19F, -3F);
		bodyModel[6].rotateAngleY = -1.57079633F;

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[7].setRotationPoint(42F, -22F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[8].setRotationPoint(42F, -22F, -3F);
		bodyModel[8].rotateAngleY = -1.57079633F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[9].setRotationPoint(42F, -22F, -6F);
		bodyModel[9].rotateAngleY = -1.57079633F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[10].setRotationPoint(45F, -26F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[11].setRotationPoint(45F, -26F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[12].setRotationPoint(45F, -26F, -4F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[13].setRotationPoint(45F, -22F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[14].setRotationPoint(44F, -21F, -4F);
		bodyModel[14].rotateAngleY = -1.57079633F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[15].setRotationPoint(43F, -21F, -4F);
		bodyModel[15].rotateAngleY = -1.57079633F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 19, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 138
		bodyModel[16].setRotationPoint(10F, -20F, -4F);

		bodyModel[17].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[17].setRotationPoint(0F, -11F, -9F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[18].setRotationPoint(3F, -11F, -9F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[19].setRotationPoint(0F, -11F, 8F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[20].setRotationPoint(3F, -11F, 8F);

		bodyModel[21].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[21].setRotationPoint(0F, -5F, -11F);

		bodyModel[22].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[22].setRotationPoint(0F, -8F, -9F);

		bodyModel[23].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[23].setRotationPoint(0F, -5F, 9F);

		bodyModel[24].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[24].setRotationPoint(0F, -8F, 8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[25].setRotationPoint(-1F, -16F, 11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[26].setRotationPoint(4F, -16F, 11F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[27].setRotationPoint(63F, -16F, 11F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[28].setRotationPoint(68F, -16F, 11F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 1, 16, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[29].setRotationPoint(52F, -25F, -6F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[30].setRotationPoint(49F, -19F, 4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[31].setRotationPoint(49F, -19F, 4F);
		bodyModel[31].rotateAngleY = -1.57079633F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[32].setRotationPoint(49F, -19F, 7F);
		bodyModel[32].rotateAngleY = -1.57079633F;

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[33].setRotationPoint(50F, -22F, 4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[34].setRotationPoint(50F, -22F, 7F);
		bodyModel[34].rotateAngleY = -1.57079633F;

		bodyModel[35].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[35].setRotationPoint(50F, -22F, 4F);
		bodyModel[35].rotateAngleY = -1.57079633F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[36].setRotationPoint(49F, -26F, 4F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[37].setRotationPoint(49F, -26F, 3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[38].setRotationPoint(49F, -26F, 6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[39].setRotationPoint(49F, -22F, 3F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[40].setRotationPoint(51F, -21F, 6F);
		bodyModel[40].rotateAngleY = -1.57079633F;

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[41].setRotationPoint(50F, -21F, 6F);
		bodyModel[41].rotateAngleY = -1.57079633F;

		bodyModel[42].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[42].setRotationPoint(64F, -11F, -9F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[43].setRotationPoint(67F, -11F, -9F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[44].setRotationPoint(64F, -11F, 8F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[45].setRotationPoint(67F, -11F, 8F);

		bodyModel[46].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[46].setRotationPoint(64F, -5F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[47].setRotationPoint(64F, -8F, -9F);

		bodyModel[48].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[48].setRotationPoint(64F, -5F, 9F);

		bodyModel[49].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[49].setRotationPoint(64F, -8F, 8F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 154
		bodyModel[50].setRotationPoint(-6.05F, -23F, 8.05F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[51].setRotationPoint(-6F, -11F, -9F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[52].setRotationPoint(38.5F, -28F, 10.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[53].setRotationPoint(40.5F, -34F, 9.25F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Du loco part41
		bodyModel[54].setRotationPoint(-6F, -8F, -9F);

		bodyModel[55].addBox(0F, 0F, 0F, 79, 4, 12, 0F); // Du loco part01
		bodyModel[55].setRotationPoint(-5F, -11F, -6F);

		bodyModel[56].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[56].setRotationPoint(12F, -27F, -9F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 23, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[57].setRotationPoint(37F, -18F, -12F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 23, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[58].setRotationPoint(37F, -26F, -12F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 23, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[59].setRotationPoint(37F, -26F, 11F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[60].setRotationPoint(37F, -26F, -11F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 3, 8, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[61].setRotationPoint(57F, -26F, -11F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 21, 9, 3, 0F,-3F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part19
		bodyModel[62].setRotationPoint(37F, -35F, -12F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 21, 9, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[63].setRotationPoint(37F, -35F, 9F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 9, 10, 0F,-2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[64].setRotationPoint(37F, -35F, 1F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 9, 10, 0F,-3F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[65].setRotationPoint(37F, -35F, -11F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 9, 10, 0F,-1F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part19
		bodyModel[66].setRotationPoint(54F, -35F, 1F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 9, 10, 0F,0F, 0F, -2F, -3F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part19
		bodyModel[67].setRotationPoint(54F, -35F, -11F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Du loco part05
		bodyModel[68].setRotationPoint(49F, -34F, 9F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-0.75F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, -2F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -2.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F); // Du loco part05
		bodyModel[69].setRotationPoint(53.5F, -34F, 9F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-2F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -1.75F, -2F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, -2.75F, -0.25F, -1.75F, -2.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Du loco part05
		bodyModel[70].setRotationPoint(38.5F, -34F, 9F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F); // Du loco part05
		bodyModel[71].setRotationPoint(44F, -34F, 9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[72].setRotationPoint(38.25F, -34F, 2F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-2.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -1F, -0.25F, 0F, -2F, -0.25F, 0F, -2F, -0.25F, -0.75F, -1F, -0.25F, -0.75F); // Du loco part05
		bodyModel[73].setRotationPoint(36.25F, -34F, 2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -1F, -2.25F, -0.25F, -1F, -0.75F, -0.25F, -1.75F, -2.25F, -0.25F, -1.75F, -2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[74].setRotationPoint(37F, -34F, 8F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[75].setRotationPoint(36.75F, -30F, 2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F); // Du loco part05
		bodyModel[76].setRotationPoint(38.25F, -34F, -9F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-2.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.5F, -2.25F, -0.25F, -0.5F, -1F, -0.25F, -0.75F, -2F, -0.25F, -0.75F, -2F, -0.25F, 0F, -1F, -0.25F, 0F); // Du loco part05
		bodyModel[77].setRotationPoint(36.25F, -34F, -3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-2.25F, -0.25F, -1F, -0.75F, -0.25F, -1F, -0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[78].setRotationPoint(37F, -34F, -10F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part05
		bodyModel[79].setRotationPoint(36.75F, -30F, -10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[80].setRotationPoint(49F, -34F, -12F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[81].setRotationPoint(44F, -34F, -12F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,-3F, 0F, -2F, -3F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[82].setRotationPoint(39F, -36F, -10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 17, 1, 9, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[83].setRotationPoint(39F, -36F, 1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[84].setRotationPoint(-3F, -13F, 8F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[85].setRotationPoint(-3F, -27F, 8F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[86].setRotationPoint(-3F, -25F, 8F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[87].setRotationPoint(-3F, -24.25F, 8F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[88].setRotationPoint(-3F, -23.5F, 8F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[89].setRotationPoint(-3F, -22.75F, 8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[90].setRotationPoint(-3F, -22F, 8F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[91].setRotationPoint(-3F, -21.25F, 8F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[92].setRotationPoint(-3F, -20.5F, 8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[93].setRotationPoint(-3F, -19.75F, 8F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[94].setRotationPoint(-3F, -26.5F, 8F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[95].setRotationPoint(-3F, -25.75F, 8F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part05
		bodyModel[96].setRotationPoint(-7F, -25F, 5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[97].setRotationPoint(-7F, -25F, -6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[98].setRotationPoint(-7F, -12.25F, -5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[99].setRotationPoint(-7F, -25F, -5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[100].setRotationPoint(-7F, -22F, -5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[101].setRotationPoint(-7F, -21.25F, -5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[102].setRotationPoint(-7F, -20.5F, -5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[103].setRotationPoint(-7F, -19.75F, -5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[104].setRotationPoint(-7F, -19F, -5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[105].setRotationPoint(-7F, -13F, -5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[106].setRotationPoint(-7F, -25F, -5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[107].setRotationPoint(-7F, -22.75F, -5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[108].setRotationPoint(-7F, -27F, -5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[109].setRotationPoint(-7F, -18.25F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[110].setRotationPoint(-7F, -17.5F, -5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[111].setRotationPoint(-7F, -16.75F, -5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[112].setRotationPoint(-7F, -16F, -5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[113].setRotationPoint(-7F, -15.25F, -5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[114].setRotationPoint(-7F, -14.5F, -5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[115].setRotationPoint(-7F, -13.75F, -5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[116].setRotationPoint(-1F, -16F, 9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[117].setRotationPoint(-6F, -27F, 8F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[118].setRotationPoint(-1F, -16F, 10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[119].setRotationPoint(4F, -16F, 10F);

		bodyModel[120].addBox(0F, 0F, 0F, 11, 1, 18, 0F); // Du loco part03
		bodyModel[120].setRotationPoint(-6F, -12F, -9F);

		bodyModel[121].addBox(0F, 0F, 0F, 11, 1, 18, 0F); // Du loco part03
		bodyModel[121].setRotationPoint(64F, -12F, -9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[122].setRotationPoint(68F, -16F, 9F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[123].setRotationPoint(61F, -16F, 10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[124].setRotationPoint(62F, -16F, 10F);

		bodyModel[125].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[125].setRotationPoint(68F, -16F, 10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 15, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[126].setRotationPoint(74F, -27F, -8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[127].setRotationPoint(-1F, -16F, -12F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[128].setRotationPoint(68F, -16F, -12F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[129].setRotationPoint(-1F, -16F, -10F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[130].setRotationPoint(-1F, -16F, -11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[131].setRotationPoint(68F, -16F, -10F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[132].setRotationPoint(68F, -16F, -11F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[133].setRotationPoint(-6.05F, -14F, 5.25F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[134].setRotationPoint(-6.05F, -13F, 5.25F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[135].setRotationPoint(-6.05F, -14F, -7.25F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[136].setRotationPoint(-6.05F, -13F, -7.25F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[137].setRotationPoint(-6.3F, -29F, -3F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[138].setRotationPoint(-6.3F, -28F, -3F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[139].setRotationPoint(-6.3F, -29F, -1F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[140].setRotationPoint(-6.3F, -28F, -1F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[141].setRotationPoint(-6.3F, -29F, 1F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[142].setRotationPoint(-6.3F, -28F, 1F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[143].setRotationPoint(-6.25F, -29F, -3F);

		bodyModel[144].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Lamp
		bodyModel[144].setRotationPoint(-6.25F, -28F, -3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[145].setRotationPoint(75.05F, -14F, 5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[146].setRotationPoint(75.05F, -13F, 5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[147].setRotationPoint(75.05F, -14F, -7F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[148].setRotationPoint(75.05F, -13F, -7F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[149].setRotationPoint(75.3F, -29F, -3F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[150].setRotationPoint(75.3F, -28F, -3F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[151].setRotationPoint(75.3F, -29F, -1F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[152].setRotationPoint(75.3F, -28F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[153].setRotationPoint(75.3F, -29F, 1F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[154].setRotationPoint(75.3F, -28F, 1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[155].setRotationPoint(74.25F, -29F, -3F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Lamp
		bodyModel[156].setRotationPoint(74.25F, -28F, -3F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[157].setRotationPoint(74F, -11F, -9F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 2, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Du loco part41
		bodyModel[158].setRotationPoint(74F, -8F, -9F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -2.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[159].setRotationPoint(44F, -34F, -13F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -1.25F, -1.5F, 0F, -1.25F, -1.5F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -2.25F, -0.5F, 0F, -2.25F, -0.5F, 0F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[160].setRotationPoint(49F, -34F, -13F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1.5F, -0.75F, -1.25F, -1.5F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -2.25F, -0.5F, -0.75F, -2.25F, -0.5F); // Du loco part05
		bodyModel[161].setRotationPoint(44F, -34F, 10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 7, 3, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -1.5F, -0.75F, -1.25F, -1.5F, -0.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -2.25F, -0.5F, -0.75F, -2.25F, -0.5F); // Du loco part05
		bodyModel[162].setRotationPoint(49F, -34F, 10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 43, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[163].setRotationPoint(-6F, -29F, -2F);

		bodyModel[164].addBox(0F, 0F, 0F, 17, 15, 1, 0F); // Du loco part19
		bodyModel[164].setRotationPoint(-5F, -27F, -9F);

		bodyModel[165].addBox(0F, 0F, 0F, 13, 15, 1, 0F); // Du loco part19
		bodyModel[165].setRotationPoint(24F, -27F, -9F);

		bodyModel[166].addBox(0F, 0F, 0F, 17, 15, 1, 0F); // Du loco part19
		bodyModel[166].setRotationPoint(-5F, -27F, 8F);

		bodyModel[167].addBox(0F, 0F, 0F, 13, 15, 1, 0F); // Du loco part19
		bodyModel[167].setRotationPoint(24F, -27F, 8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[168].setRotationPoint(26F, -21F, -4F);

		bodyModel[169].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 138
		bodyModel[169].setRotationPoint(9.5F, -20.25F, 3F);

		bodyModel[170].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 138
		bodyModel[170].setRotationPoint(9.5F, -20.25F, -5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[171].setRotationPoint(23.5F, -21F, -4F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[172].setRotationPoint(21F, -21F, -4F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[173].setRotationPoint(18.5F, -21F, -4F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[174].setRotationPoint(16F, -21F, -4F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[175].setRotationPoint(13.5F, -21F, -4F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[176].setRotationPoint(11F, -21F, -4F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 22, 20, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -6F, 0F, 0.125F, -6F, 0F, -9.125F, 0F, 0F, -9.125F, 0F, 0F, -9.125F, -6F, 0F, -9.125F, -6F); // Du loco part19
		bodyModel[177].setRotationPoint(75.05F, -26F, -7F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -2.875F, -1F, -1F, -2F, -1F, -1F, -4.875F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[178].setRotationPoint(-6F, -3F, -9F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[179].setRotationPoint(-6F, -5F, -9F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 0F, -1F, 0F, 0F, -1F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[180].setRotationPoint(-6F, -6F, -9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, -1F, -4.875F, 0F, -1F, -2F, -1F, -1F, -2.875F, -1F, -1F); // Du loco part41
		bodyModel[181].setRotationPoint(-6F, -3F, 2F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[182].setRotationPoint(-6F, -5F, 2F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, -1F, -4.875F, 0F, -1F, -1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F); // Du loco part41
		bodyModel[183].setRotationPoint(-6F, -6F, 2F);

		bodyModel[184].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[184].setRotationPoint(-2F, -4F, 6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[185].setRotationPoint(-2F, -7F, 4F);

		bodyModel[186].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[186].setRotationPoint(-2F, -4F, -7F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part28
		bodyModel[187].setRotationPoint(-2F, -7F, -7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part28
		bodyModel[188].setRotationPoint(-3F, -4F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F); // Du loco part28
		bodyModel[189].setRotationPoint(-3F, -4F, 6F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, -2F, -1F, -1F, -2.875F, -1F, -1F, 0F, 0F, -1F, -4.875F, 0F, -1F); // Du loco part41
		bodyModel[190].setRotationPoint(70F, -3F, -9F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[191].setRotationPoint(70F, -5F, -9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 0F, -1F, -4.875F, 0F, -1F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[192].setRotationPoint(70F, -6F, -9F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, -1F, 0F, 0F, -1F, -2.875F, -1F, -1F, -2F, -1F, -1F); // Du loco part41
		bodyModel[193].setRotationPoint(70F, -3F, 2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[194].setRotationPoint(70F, -5F, 2F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, -1F, 0F, 0F, -1F, -3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F); // Du loco part41
		bodyModel[195].setRotationPoint(70F, -6F, 2F);

		bodyModel[196].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[196].setRotationPoint(69F, -4F, 6F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[197].setRotationPoint(69F, -7F, 4F);

		bodyModel[198].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[198].setRotationPoint(69F, -4F, -7F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part28
		bodyModel[199].setRotationPoint(69F, -7F, -7F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[200].setRotationPoint(71F, -4F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[201].setRotationPoint(71F, -4F, 6F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[202].setRotationPoint(-4F, -26F, 8F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[203].setRotationPoint(1F, -26F, 8F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[204].setRotationPoint(64F, -20F, -9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[205].setRotationPoint(64F, -25F, -9F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[206].setRotationPoint(63F, -24F, -9F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[207].setRotationPoint(70F, -24F, -9F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-0.75F, -0.25F, -1.75F, -2F, -0.25F, -1.75F, -2F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1.75F, -2.75F, -0.25F, -1.75F); // Du loco part05
		bodyModel[208].setRotationPoint(53.5F, -34F, -12F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-2F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, -0.25F, -2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -2.75F, -0.25F, -0.25F, -2.75F, -0.25F, -1.75F, 0F, -0.25F, -1.75F); // Du loco part05
		bodyModel[209].setRotationPoint(38.5F, -34F, -12F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 18, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[210].setRotationPoint(38.5F, -28F, -11.75F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[211].setRotationPoint(40.5F, -34F, -10.25F);

		bodyModel[212].addBox(0F, 0F, 0F, 30, 1, 22, 0F); // Du loco part03
		bodyModel[212].setRotationPoint(5F, -12F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 43, 1, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Du loco part19
		bodyModel[213].setRotationPoint(-6F, -29F, 2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 43, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part19
		bodyModel[214].setRotationPoint(-6F, -28F, 7F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[215].setRotationPoint(-6F, -28F, 2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[216].setRotationPoint(-7F, -24.25F, -5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[217].setRotationPoint(-7F, -23.5F, -5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 43, 1, 5, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[218].setRotationPoint(-6F, -29F, -7F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 43, 1, 2, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[219].setRotationPoint(-6F, -28F, -9F);

		bodyModel[220].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[220].setRotationPoint(18F, -27F, -9F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[221].setRotationPoint(-6F, -28F, -7F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[222].setRotationPoint(-6F, -27F, 5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 15, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[223].setRotationPoint(-6F, -27F, -8F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 7, 4, 0F,-2.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[224].setRotationPoint(36F, -36F, -2F);

		bodyModel[225].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[225].setRotationPoint(12F, -27F, 8F);

		bodyModel[226].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[226].setRotationPoint(18F, -27F, 8F);

		bodyModel[227].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[227].setRotationPoint(6F, -27F, 9F);

		bodyModel[228].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[228].setRotationPoint(24F, -27F, 9F);

		bodyModel[229].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[229].setRotationPoint(6F, -27F, -10F);

		bodyModel[230].addBox(0F, 0F, 0F, 6, 15, 1, 0F); // Du loco part19
		bodyModel[230].setRotationPoint(24F, -27F, -10F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,-0.75F, 0F, -0.5F, -0.25F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[231].setRotationPoint(54.5F, -34F, 2F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.75F, -0.25F, -0.5F, -2.25F, -0.25F, -0.5F, -2.25F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -2F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, -2F, -0.25F, -0.75F); // Du loco part05
		bodyModel[232].setRotationPoint(54.5F, -34F, 2F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-0.75F, -0.25F, -0.75F, -2.25F, -0.25F, -0.75F, -2.25F, -0.25F, -1F, -0.75F, -0.25F, -1F, -2.25F, -0.25F, -1.75F, -0.75F, -0.25F, -1.75F, -0.75F, -0.25F, 0F, -2.25F, -0.25F, 0F); // Du loco part05
		bodyModel[233].setRotationPoint(53.75F, -34F, 8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,-0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[234].setRotationPoint(56F, -30F, 2F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, -0.75F, -0.5F, -0.75F, -0.75F, -0.5F); // Du loco part05
		bodyModel[235].setRotationPoint(54.5F, -34F, -9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 5, 1, 0F,-0.75F, -0.25F, -0.25F, -2.25F, -0.25F, -0.25F, -2.25F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, -2F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, -2F, -0.25F, 0F); // Du loco part05
		bodyModel[236].setRotationPoint(54.5F, -34F, -3F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,-0.75F, -0.25F, -1F, -2.25F, -0.25F, -1F, -2.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -2.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -1.75F, -2.25F, -0.25F, -1.75F); // Du loco part05
		bodyModel[237].setRotationPoint(53.75F, -34F, -10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part05
		bodyModel[238].setRotationPoint(56F, -30F, -10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[239].setRotationPoint(-6F, -27F, -9F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[240].setRotationPoint(74F, -27F, 8F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 18, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[241].setRotationPoint(57F, -29F, -2F);

		bodyModel[242].addBox(0F, 0F, 0F, 14, 15, 1, 0F); // Du loco part19
		bodyModel[242].setRotationPoint(60F, -27F, -9F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Du loco part19
		bodyModel[243].setRotationPoint(57F, -29F, 2F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part19
		bodyModel[244].setRotationPoint(57F, -28F, 7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 18, 1, 5, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[245].setRotationPoint(57F, -29F, -7F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 18, 1, 2, 0F,0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[246].setRotationPoint(57F, -28F, -9F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[247].setRotationPoint(74F, -27F, -9F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 1, 24, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[248].setRotationPoint(58F, -27F, -12F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 1, 24, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part03
		bodyModel[249].setRotationPoint(35F, -12F, -12F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[250].setRotationPoint(6F, -16F, 10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 120, 8, 0, 0F,0F, -4F, 0F, -60F, -4F, 0F, -60F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, 0F, 0F, 0F, 0F); // Du loco part27
		bodyModel[251].setRotationPoint(6F, -15F, -6.15F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[252].setRotationPoint(-9.5F, -10F, -6.05F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[253].setRotationPoint(-35.5F, -10F, -6.05F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[254].setRotationPoint(-22.5F, -10F, -6.05F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[255].setRotationPoint(3.5F, -10F, -6.05F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[256].setRotationPoint(16.5F, -10F, -6.05F);

		bodyModel[257].addBox(0F, 0F, 0F, 14, 15, 1, 0F); // Du loco part19
		bodyModel[257].setRotationPoint(60F, -27F, 8F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[258].setRotationPoint(31F, -22F, 8F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[259].setRotationPoint(31F, -27F, 8F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[260].setRotationPoint(31F, -26F, 8F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[261].setRotationPoint(31F, -25.25F, 8F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[262].setRotationPoint(31F, -24.5F, 8F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[263].setRotationPoint(31F, -23.75F, 8F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[264].setRotationPoint(30F, -26F, 8F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[265].setRotationPoint(35F, -26F, 8F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[266].setRotationPoint(31F, -26.5F, 8F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[267].setRotationPoint(31F, -23F, 8F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[268].setRotationPoint(-3F, -19F, 8F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[269].setRotationPoint(-3F, -18.25F, 8F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[270].setRotationPoint(-3F, -17.5F, 8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[271].setRotationPoint(-3F, -16.75F, 8F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[272].setRotationPoint(-3F, -16F, 8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[273].setRotationPoint(-3F, -15.25F, 8F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[274].setRotationPoint(-3F, -14.5F, 8F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[275].setRotationPoint(-3F, -13.75F, 8F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[276].setRotationPoint(2F, -13F, 8F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[277].setRotationPoint(2F, -27F, 8F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[278].setRotationPoint(2F, -25F, 8F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[279].setRotationPoint(2F, -24.25F, 8F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[280].setRotationPoint(2F, -23.5F, 8F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[281].setRotationPoint(2F, -22.75F, 8F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[282].setRotationPoint(2F, -22F, 8F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[283].setRotationPoint(2F, -21.25F, 8F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[284].setRotationPoint(2F, -20.5F, 8F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[285].setRotationPoint(2F, -19.75F, 8F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[286].setRotationPoint(2F, -26.5F, 8F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[287].setRotationPoint(2F, -25.75F, 8F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[288].setRotationPoint(1F, -26F, 8F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[289].setRotationPoint(6F, -26F, 8F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[290].setRotationPoint(2F, -19F, 8F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[291].setRotationPoint(2F, -18.25F, 8F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[292].setRotationPoint(2F, -17.5F, 8F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[293].setRotationPoint(2F, -16.75F, 8F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[294].setRotationPoint(2F, -16F, 8F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[295].setRotationPoint(2F, -15.25F, 8F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[296].setRotationPoint(2F, -14.5F, 8F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[297].setRotationPoint(2F, -13.75F, 8F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[298].setRotationPoint(-3F, -13F, -9F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[299].setRotationPoint(-3F, -27F, -9F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[300].setRotationPoint(-3F, -25F, -9F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[301].setRotationPoint(-3F, -24.25F, -9F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[302].setRotationPoint(-3F, -23.5F, -9F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[303].setRotationPoint(-3F, -22.75F, -9F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[304].setRotationPoint(-3F, -22F, -9F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[305].setRotationPoint(-3F, -21.25F, -9F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[306].setRotationPoint(-3F, -20.5F, -9F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[307].setRotationPoint(-3F, -19.75F, -9F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[308].setRotationPoint(-3F, -26.5F, -9F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[309].setRotationPoint(-3F, -25.75F, -9F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[310].setRotationPoint(-4F, -26F, -9F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[311].setRotationPoint(1F, -26F, -9F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[312].setRotationPoint(-3F, -19F, -9F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[313].setRotationPoint(-3F, -18.25F, -9F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[314].setRotationPoint(-3F, -17.5F, -9F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[315].setRotationPoint(-3F, -16.75F, -9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[316].setRotationPoint(-3F, -16F, -9F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[317].setRotationPoint(-3F, -15.25F, -9F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[318].setRotationPoint(-3F, -14.5F, -9F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[319].setRotationPoint(-3F, -13.75F, -9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[320].setRotationPoint(2F, -13F, -9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[321].setRotationPoint(2F, -27F, -9F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[322].setRotationPoint(2F, -25F, -9F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[323].setRotationPoint(2F, -24.25F, -9F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[324].setRotationPoint(2F, -23.5F, -9F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[325].setRotationPoint(2F, -22.75F, -9F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[326].setRotationPoint(2F, -22F, -9F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[327].setRotationPoint(2F, -21.25F, -9F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[328].setRotationPoint(2F, -20.5F, -9F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[329].setRotationPoint(2F, -19.75F, -9F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[330].setRotationPoint(2F, -26.5F, -9F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[331].setRotationPoint(2F, -25.75F, -9F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[332].setRotationPoint(1F, -26F, -9F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[333].setRotationPoint(6F, -26F, -9F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[334].setRotationPoint(2F, -19F, -9F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[335].setRotationPoint(2F, -18.25F, -9F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[336].setRotationPoint(2F, -17.5F, -9F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[337].setRotationPoint(2F, -16.75F, -9F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[338].setRotationPoint(2F, -16F, -9F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[339].setRotationPoint(2F, -15.25F, -9F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[340].setRotationPoint(2F, -14.5F, -9F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[341].setRotationPoint(2F, -13.75F, -9F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[342].setRotationPoint(31F, -13F, -9F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[343].setRotationPoint(31F, -22F, -9F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[344].setRotationPoint(31F, -20.5F, -9F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[345].setRotationPoint(31F, -19.75F, -9F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[346].setRotationPoint(31F, -21.25F, -9F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[347].setRotationPoint(30F, -21F, -9F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[348].setRotationPoint(35F, -21F, -9F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[349].setRotationPoint(31F, -19F, -9F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[350].setRotationPoint(31F, -18.25F, -9F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[351].setRotationPoint(31F, -17.5F, -9F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[352].setRotationPoint(31F, -16.75F, -9F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[353].setRotationPoint(31F, -16F, -9F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[354].setRotationPoint(31F, -15.25F, -9F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[355].setRotationPoint(31F, -14.5F, -9F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[356].setRotationPoint(31F, -13.75F, -9F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[357].setRotationPoint(31F, -22F, -9F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[358].setRotationPoint(31F, -27F, -9F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[359].setRotationPoint(31F, -26F, -9F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[360].setRotationPoint(31F, -25.25F, -9F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[361].setRotationPoint(31F, -24.5F, -9F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[362].setRotationPoint(31F, -23.75F, -9F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[363].setRotationPoint(30F, -26F, -9F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[364].setRotationPoint(35F, -26F, -9F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[365].setRotationPoint(31F, -26.5F, -9F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[366].setRotationPoint(31F, -23F, -9F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[367].setRotationPoint(67F, -24F, -9F);

		bodyModel[368].addBox(0F, 0F, 0F, 27, 1, 4, 0F); // Du loco part19
		bodyModel[368].setRotationPoint(6F, -30F, -2F);

		bodyModel[369].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[369].setRotationPoint(40F, -11F, 10F);

		bodyModel[370].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[370].setRotationPoint(43F, -11F, 10F);

		bodyModel[371].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[371].setRotationPoint(40F, -5F, 10F);

		bodyModel[372].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[372].setRotationPoint(40F, -8F, 10F);

		bodyModel[373].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[373].setRotationPoint(51F, -11F, -11F);

		bodyModel[374].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[374].setRotationPoint(54F, -11F, -11F);

		bodyModel[375].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[375].setRotationPoint(51F, -5F, -12F);

		bodyModel[376].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[376].setRotationPoint(51F, -8F, -12F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 3, 1, 24, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Du loco part03
		bodyModel[377].setRotationPoint(61F, -12F, -12F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[378].setRotationPoint(73F, -29F, 9F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[379].setRotationPoint(70.05F, -29F, 9F);

		bodyModel[380].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[380].setRotationPoint(70F, -13F, 9F);

		bodyModel[381].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[381].setRotationPoint(70F, -15F, 9F);

		bodyModel[382].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[382].setRotationPoint(70F, -17F, 9F);

		bodyModel[383].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[383].setRotationPoint(70F, -19F, 9F);

		bodyModel[384].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[384].setRotationPoint(70F, -21F, 9F);

		bodyModel[385].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[385].setRotationPoint(70F, -23F, 9F);

		bodyModel[386].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[386].setRotationPoint(70F, -25F, 9F);

		bodyModel[387].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[387].setRotationPoint(70F, -27F, 9F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[388].setRotationPoint(73F, -30F, 5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[389].setRotationPoint(70.05F, -30F, 5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[390].setRotationPoint(55F, -22F, -13F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[391].setRotationPoint(50F, -22F, -13F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[392].setRotationPoint(44F, -22F, 12F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[393].setRotationPoint(39F, -22F, 12F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 4, 9, 2, 0F,-1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part19
		bodyModel[394].setRotationPoint(54F, -35F, -1F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 4, 9, 2, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[395].setRotationPoint(37F, -35F, -1F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[396].setRotationPoint(39F, -36F, -1F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[397].setRotationPoint(74F, -28F, 2F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[398].setRotationPoint(74F, -28F, -7F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 0, 22, 20, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -6F, 0F, 0.125F, -6F, 0F, -9.125F, 0F, 0F, -9.125F, 0F, 0F, -9.125F, -6F, 0F, -9.125F, -6F); // Du loco part19
		bodyModel[399].setRotationPoint(-7.05F, -26F, -7F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 36, 18, 0, 0F,0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -24F, -12F, 0F, -24F, -12F, 0F, 0F, -12F, 0F); // Du loco part19
		bodyModel[400].setRotationPoint(45F, -23F, 12.05F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 36, 18, 0, 0F,0F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, -24F, -12F, 0F, -24F, -12F, 0F, 0F, -12F, 0F); // Du loco part19
		bodyModel[401].setRotationPoint(38F, -23F, -12.05F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[402].setRotationPoint(-9.5F, -10F, 6.05F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[403].setRotationPoint(-35.5F, -10F, 6.05F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[404].setRotationPoint(-22.5F, -10F, 6.05F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[405].setRotationPoint(3.5F, -10F, 6.05F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-41F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -41F, 0F, 0F, -41F, -41F, 0F, 0F, -41F, 0F, 0F, -41F, 0F, -41F, -41F, 0F); // Du loco part23
		bodyModel[406].setRotationPoint(16.5F, -10F, 6.05F);

		bodyModel[407].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[407].setRotationPoint(43F, -11F, 5.05F);

		bodyModel[408].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[408].setRotationPoint(28F, -11F, 5.05F);

		bodyModel[409].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[409].setRotationPoint(56F, -11F, 5.05F);

		bodyModel[410].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[410].setRotationPoint(15F, -11F, 5.05F);

		bodyModel[411].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[411].setRotationPoint(43F, -11F, -6.05F);

		bodyModel[412].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[412].setRotationPoint(28F, -11F, -6.05F);

		bodyModel[413].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[413].setRotationPoint(56F, -11F, -6.05F);

		bodyModel[414].addBox(0F, 0F, 0F, 1, 8, 1, 0F); // Du loco part28
		bodyModel[414].setRotationPoint(15F, -11F, -6.05F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[415].setRotationPoint(-1F, -29F, -10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 0, 16, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[416].setRotationPoint(-3.95F, -29F, -10F);

		bodyModel[417].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[417].setRotationPoint(-4F, -13F, -10F);

		bodyModel[418].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[418].setRotationPoint(-4F, -15F, -10F);

		bodyModel[419].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[419].setRotationPoint(-4F, -17F, -10F);

		bodyModel[420].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[420].setRotationPoint(-4F, -19F, -10F);

		bodyModel[421].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[421].setRotationPoint(-4F, -21F, -10F);

		bodyModel[422].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[422].setRotationPoint(-4F, -23F, -10F);

		bodyModel[423].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[423].setRotationPoint(-4F, -25F, -10F);

		bodyModel[424].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Du loco part28
		bodyModel[424].setRotationPoint(-4F, -27F, -10F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[425].setRotationPoint(-1F, -30F, -10F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 0, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[426].setRotationPoint(-3.95F, -30F, -10F);

		bodyModel[427].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Du loco part19
		bodyModel[427].setRotationPoint(-5F, -29F, -8F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[428].setRotationPoint(63F, -16F, -12F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[429].setRotationPoint(61F, -16F, -11F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[430].setRotationPoint(62F, -16F, -11F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[431].setRotationPoint(4F, -16F, -12F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[432].setRotationPoint(4F, -16F, -11F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[433].setRotationPoint(6F, -16F, -11F);

		bodyModel[434].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Du loco part19
		bodyModel[434].setRotationPoint(69F, -29F, 5F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[435].setRotationPoint(-6.05F, -23F, -9.05F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[436].setRotationPoint(-7F, -9.25F, 4.43F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[437].setRotationPoint(-6.75F, -9F, 4.9F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[438].setRotationPoint(-9.5F, -8.75F, 5.15F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[439].setRotationPoint(-7F, -9.25F, -6.63F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[440].setRotationPoint(-9.5F, -8.75F, -5.88F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[441].setRotationPoint(-7F, -8.75F, 0F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[442].setRotationPoint(-7F, -8.75F, -1F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[443].setRotationPoint(-6.5F, -8.5F, -0.25F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[444].setRotationPoint(-8.5F, -7F, -0.25F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[445].setRotationPoint(-7.5F, -8.75F, -0.25F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[446].setRotationPoint(-8.5F, -8.5F, 0F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[447].setRotationPoint(-8.5F, -8.5F, -0.75F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[448].setRotationPoint(-7F, -8.75F, 0.25F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[449].setRotationPoint(-7F, -8.5F, -0.25F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[450].setRotationPoint(-7F, -9F, -0.5F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[451].setRotationPoint(-7F, -6F, -0.5F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[452].setRotationPoint(-7F, -8.75F, -1F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[453].setRotationPoint(-8.5F, -6F, -0.5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[454].setRotationPoint(-8.5F, -5.25F, -0.5F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[455].setRotationPoint(-10.5F, -8.87F, 4.03F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[456].setRotationPoint(-10.5F, -9.87F, 4.03F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[457].setRotationPoint(-10.5F, -9.37F, 4.03F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[458].setRotationPoint(-10.5F, -7.87F, 4.03F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[459].setRotationPoint(-10.5F, -8.37F, 4.03F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[460].setRotationPoint(-10.5F, -8.87F, -7.03F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[461].setRotationPoint(-10.5F, -9.87F, -7.03F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[462].setRotationPoint(-10.5F, -9.37F, -7.03F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[463].setRotationPoint(-10.5F, -7.87F, -7.03F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[464].setRotationPoint(-10.5F, -8.37F, -7.03F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[465].setRotationPoint(-6.75F, -9.5F, 4.9F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[466].setRotationPoint(-6.75F, -8.25F, 4.9F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[467].setRotationPoint(-6.75F, -9F, -6.13F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[468].setRotationPoint(-6.75F, -9.5F, -6.13F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[469].setRotationPoint(-6.75F, -8.25F, -6.13F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[470].setRotationPoint(75F, -9.25F, 4.43F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[471].setRotationPoint(74.75F, -9F, 4.9F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[472].setRotationPoint(75.5F, -8.75F, 5.15F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[473].setRotationPoint(75F, -9.25F, -6.63F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[474].setRotationPoint(75.5F, -8.75F, -5.88F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[475].setRotationPoint(75F, -8.75F, 0F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[476].setRotationPoint(75F, -8.75F, -1F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[477].setRotationPoint(74.5F, -8.5F, -0.25F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[478].setRotationPoint(75.5F, -7F, -0.25F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[479].setRotationPoint(75.5F, -8.75F, -0.25F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[480].setRotationPoint(74.5F, -8.5F, 0F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[481].setRotationPoint(74.5F, -8.5F, -0.75F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[482].setRotationPoint(75F, -8.75F, 0.25F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[483].setRotationPoint(75F, -8.5F, -0.25F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[484].setRotationPoint(75F, -9F, -0.5F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[485].setRotationPoint(75F, -6F, -0.5F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[486].setRotationPoint(75F, -8.75F, -1F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[487].setRotationPoint(75.5F, -6F, -0.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[488].setRotationPoint(76.5F, -5.25F, -0.5F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[489].setRotationPoint(78.5F, -8.87F, 4.03F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[490].setRotationPoint(78.5F, -9.87F, 4.03F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[491].setRotationPoint(78.5F, -9.37F, 4.03F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[492].setRotationPoint(78.5F, -7.87F, 4.03F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[493].setRotationPoint(78.5F, -8.37F, 4.03F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[494].setRotationPoint(78.5F, -8.87F, -7.03F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[495].setRotationPoint(78.5F, -9.87F, -7.03F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[496].setRotationPoint(78.5F, -9.37F, -7.03F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[497].setRotationPoint(78.5F, -7.87F, -7.03F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[498].setRotationPoint(78.5F, -8.37F, -7.03F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[499].setRotationPoint(74.75F, -9.5F, 4.9F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[501] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[502] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[503] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[500].setRotationPoint(74.75F, -8.25F, 4.9F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[501].setRotationPoint(74.75F, -9F, -6.13F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[502].setRotationPoint(74.75F, -9.5F, -6.13F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[503].setRotationPoint(74.75F, -8.25F, -6.13F);
	}
}