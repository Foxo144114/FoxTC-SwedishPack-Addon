//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera Of
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittOf extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittOf() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[441];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Du loco part03
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Du loco part05
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Du loco part06
		bodyModel[4] = new ModelRendererTurbo(this, 39, 330, textureX, textureY); // Du loco part07
		bodyModel[5] = new ModelRendererTurbo(this, 1, 170, textureX, textureY); // Du loco part08
		bodyModel[6] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[7] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part19
		bodyModel[8] = new ModelRendererTurbo(this, 182, 286, textureX, textureY); // Du loco part20
		bodyModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Du loco part27
		bodyModel[10] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Du loco part41
		bodyModel[11] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Du loco part82
		bodyModel[12] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part83
		bodyModel[13] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Du loco part84
		bodyModel[14] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part85
		bodyModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part94
		bodyModel[16] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Du loco part95
		bodyModel[17] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part97
		bodyModel[18] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part100
		bodyModel[19] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Du loco part101
		bodyModel[20] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Du loco part102
		bodyModel[21] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Lamp
		bodyModel[22] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Lamp
		bodyModel[23] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Lamp
		bodyModel[24] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Lamp
		bodyModel[25] = new ModelRendererTurbo(this, 6, 155, textureX, textureY); // Box 149
		bodyModel[26] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 177
		bodyModel[27] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 194
		bodyModel[28] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 195
		bodyModel[29] = new ModelRendererTurbo(this, 39, 308, textureX, textureY); // Box 135
		bodyModel[30] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 136
		bodyModel[31] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 138
		bodyModel[32] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 139
		bodyModel[33] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 141
		bodyModel[34] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 142
		bodyModel[35] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 143
		bodyModel[36] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 144
		bodyModel[37] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 145
		bodyModel[38] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 146
		bodyModel[39] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 147
		bodyModel[40] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 148
		bodyModel[41] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 149
		bodyModel[42] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 150
		bodyModel[43] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 151
		bodyModel[44] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 152
		bodyModel[45] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 153
		bodyModel[46] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 154
		bodyModel[47] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 155
		bodyModel[48] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 156
		bodyModel[49] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 157
		bodyModel[50] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 158
		bodyModel[51] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 159
		bodyModel[52] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 160
		bodyModel[53] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Du loco part37
		bodyModel[54] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Du loco part37
		bodyModel[55] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Du loco part37
		bodyModel[56] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Du loco part37
		bodyModel[57] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Du loco part37
		bodyModel[58] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part37
		bodyModel[59] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Du loco part37
		bodyModel[60] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Du loco part37
		bodyModel[61] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Du loco part37
		bodyModel[62] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Du loco part37
		bodyModel[63] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Du loco part37
		bodyModel[64] = new ModelRendererTurbo(this, 103, 62, textureX, textureY); // Lamp
		bodyModel[65] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Du loco part37
		bodyModel[66] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Du loco part37
		bodyModel[67] = new ModelRendererTurbo(this, 150, 65, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[68] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Lamp
		bodyModel[69] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Lamp
		bodyModel[70] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Lamp
		bodyModel[71] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Lamp
		bodyModel[72] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Lamp
		bodyModel[73] = new ModelRendererTurbo(this, 10, 150, textureX, textureY); // Box 149
		bodyModel[74] = new ModelRendererTurbo(this, 6, 151, textureX, textureY); // Box 149
		bodyModel[75] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Du loco part37
		bodyModel[76] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Du loco part23
		bodyModel[77] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Du loco part23
		bodyModel[78] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Du loco part23
		bodyModel[79] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[80] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Du loco part09
		bodyModel[81] = new ModelRendererTurbo(this, 7, 148, textureX, textureY); // Du loco part71
		bodyModel[82] = new ModelRendererTurbo(this, 8, 149, textureX, textureY); // Du loco part71
		bodyModel[83] = new ModelRendererTurbo(this, 12, 151, textureX, textureY); // Du loco part71
		bodyModel[84] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Du loco part28
		bodyModel[85] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part28
		bodyModel[86] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[87] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[88] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Du loco part28
		bodyModel[89] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Du loco part28
		bodyModel[90] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Du loco part28
		bodyModel[91] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part28
		bodyModel[92] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Du loco part28
		bodyModel[93] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Du loco part28
		bodyModel[94] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[95] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[96] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Du loco part28
		bodyModel[97] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Du loco part28
		bodyModel[98] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part05
		bodyModel[99] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Du loco part06
		bodyModel[100] = new ModelRendererTurbo(this, 160, 330, textureX, textureY); // Box 167
		bodyModel[101] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[102] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Du loco part06
		bodyModel[103] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Du loco part06
		bodyModel[104] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Du loco part41
		bodyModel[105] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Du loco part37
		bodyModel[106] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Du loco part37
		bodyModel[107] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Du loco part37
		bodyModel[108] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Du loco part37
		bodyModel[109] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Du loco part37
		bodyModel[110] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Du loco part37
		bodyModel[111] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Du loco part37
		bodyModel[112] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Du loco part37
		bodyModel[113] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Du loco part37
		bodyModel[114] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Du loco part37
		bodyModel[115] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Du loco part37
		bodyModel[116] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Du loco part37
		bodyModel[117] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Du loco part37
		bodyModel[118] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Du loco part37
		bodyModel[119] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Du loco part37
		bodyModel[120] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Du loco part37
		bodyModel[121] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Du loco part37
		bodyModel[122] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Du loco part37
		bodyModel[123] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Du loco part37
		bodyModel[124] = new ModelRendererTurbo(this, 216, 71, textureX, textureY); // Du loco part06
		bodyModel[125] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Du loco part06
		bodyModel[126] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 156
		bodyModel[127] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 156
		bodyModel[128] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		bodyModel[129] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 154
		bodyModel[130] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 154
		bodyModel[131] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 154
		bodyModel[132] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Du loco part23
		bodyModel[133] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Du loco part37
		bodyModel[134] = new ModelRendererTurbo(this, 393, 241, textureX, textureY); // Du loco part37
		bodyModel[135] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Du loco part37
		bodyModel[136] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Du loco part37
		bodyModel[137] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Du loco part23
		bodyModel[138] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Du loco part28
		bodyModel[139] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Du loco part28
		bodyModel[140] = new ModelRendererTurbo(this, 111, 247, textureX, textureY); // Du loco part41
		bodyModel[141] = new ModelRendererTurbo(this, 49, 265, textureX, textureY); // Du loco part01
		bodyModel[142] = new ModelRendererTurbo(this, 73, 273, textureX, textureY); // Du loco part01
		bodyModel[143] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Du loco part01
		bodyModel[144] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Du loco part01
		bodyModel[145] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Du loco part01
		bodyModel[146] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Du loco part20
		bodyModel[147] = new ModelRendererTurbo(this, 233, 257, textureX, textureY); // Du loco part37
		bodyModel[148] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part37
		bodyModel[149] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Du loco part37
		bodyModel[150] = new ModelRendererTurbo(this, 41, 265, textureX, textureY); // Du loco part37
		bodyModel[151] = new ModelRendererTurbo(this, 15, 273, textureX, textureY); // Du loco part37
		bodyModel[152] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[153] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[154] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[155] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[156] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[157] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[158] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[159] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[160] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[161] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[162] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[163] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[164] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[165] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[166] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[167] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[168] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[169] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[170] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[171] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[172] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[173] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[174] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[175] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[176] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[177] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[178] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[179] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[180] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[181] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[182] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[183] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[184] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[185] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[186] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[187] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[188] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[189] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[190] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[191] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[192] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[193] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[194] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[195] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[196] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[197] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[198] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[199] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[200] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[201] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[202] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[203] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[204] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[205] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[206] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[207] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[208] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[209] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[210] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[211] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[212] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[213] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[214] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[215] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[216] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[217] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[218] = new ModelRendererTurbo(this, 14, 377, textureX, textureY); // Du loco part05
		bodyModel[219] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[220] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[221] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[222] = new ModelRendererTurbo(this, 14, 377, textureX, textureY); // Du loco part05
		bodyModel[223] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[224] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[225] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[226] = new ModelRendererTurbo(this, 0, 376, textureX, textureY); // Du loco part05
		bodyModel[227] = new ModelRendererTurbo(this, 0, 376, textureX, textureY); // Du loco part05
		bodyModel[228] = new ModelRendererTurbo(this, 6, 401, textureX, textureY); // Du loco part05
		bodyModel[229] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Du loco part05
		bodyModel[230] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[231] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[232] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[233] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[234] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[235] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[236] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[237] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[238] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[239] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[240] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[241] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[242] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[243] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[244] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[245] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[246] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[247] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[248] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[249] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[250] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[251] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[252] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[253] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[254] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[255] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[256] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[257] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[258] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[259] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[260] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[261] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[262] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[263] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[264] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[265] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[266] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[267] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[268] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[269] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[270] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[271] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[272] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[273] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[274] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[275] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[276] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[277] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[278] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[279] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[280] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[281] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[282] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[283] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[284] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[285] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[286] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[287] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[288] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[289] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[290] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[291] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[292] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[293] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[294] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[295] = new ModelRendererTurbo(this, 95, 292, textureX, textureY); // Box 149
		bodyModel[296] = new ModelRendererTurbo(this, 80, 294, textureX, textureY); // Box 149
		bodyModel[297] = new ModelRendererTurbo(this, 95, 292, textureX, textureY); // Box 149
		bodyModel[298] = new ModelRendererTurbo(this, 80, 294, textureX, textureY); // Box 149
		bodyModel[299] = new ModelRendererTurbo(this, 67, 296, textureX, textureY); // Box 149
		bodyModel[300] = new ModelRendererTurbo(this, 67, 296, textureX, textureY); // Box 149
		bodyModel[301] = new ModelRendererTurbo(this, 112, 296, textureX, textureY); // Du loco part37
		bodyModel[302] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[303] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[304] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[305] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[306] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[307] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[308] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[309] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[310] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[311] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[312] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[313] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[314] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Du loco part06
		bodyModel[315] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Du loco part06
		bodyModel[316] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Du loco part06
		bodyModel[317] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[318] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[319] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[320] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[321] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[322] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[323] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[324] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[325] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[326] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[327] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[328] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[329] = new ModelRendererTurbo(this, 6, 150, textureX, textureY); // Du loco part08
		bodyModel[330] = new ModelRendererTurbo(this, 2, 145, textureX, textureY); // Box 149
		bodyModel[331] = new ModelRendererTurbo(this, 20, 148, textureX, textureY); // Box 149
		bodyModel[332] = new ModelRendererTurbo(this, 3, 148, textureX, textureY); // Box 149
		bodyModel[333] = new ModelRendererTurbo(this, 6, 148, textureX, textureY); // Du loco part71
		bodyModel[334] = new ModelRendererTurbo(this, 3, 149, textureX, textureY); // Du loco part71
		bodyModel[335] = new ModelRendererTurbo(this, 11, 150, textureX, textureY); // Du loco part71
		bodyModel[336] = new ModelRendererTurbo(this, 6, 148, textureX, textureY); // Du loco part08
		bodyModel[337] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Du loco part37
		bodyModel[338] = new ModelRendererTurbo(this, 103, 62, textureX, textureY); // Lamp
		bodyModel[339] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Du loco part23
		bodyModel[340] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Du loco part23
		bodyModel[341] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Du loco part23
		bodyModel[342] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[343] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Du loco part27
		bodyModel[344] = new ModelRendererTurbo(this, 218, 67, textureX, textureY); // Du loco part06
		bodyModel[345] = new ModelRendererTurbo(this, 103, 62, textureX, textureY); // Lamp
		bodyModel[346] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part37
		bodyModel[347] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Du loco part37
		bodyModel[348] = new ModelRendererTurbo(this, 41, 265, textureX, textureY); // Du loco part37
		bodyModel[349] = new ModelRendererTurbo(this, 15, 273, textureX, textureY); // Du loco part37
		bodyModel[350] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Du loco part37
		bodyModel[351] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Du loco part37
		bodyModel[352] = new ModelRendererTurbo(this, 233, 257, textureX, textureY); // Du loco part37
		bodyModel[353] = new ModelRendererTurbo(this, 113, 62, textureX, textureY); // Lamp
		bodyModel[354] = new ModelRendererTurbo(this, 11, 384, textureX, textureY); // Du loco part05
		bodyModel[355] = new ModelRendererTurbo(this, 11, 384, textureX, textureY); // Du loco part05
		bodyModel[356] = new ModelRendererTurbo(this, 20, 384, textureX, textureY); // Du loco part05
		bodyModel[357] = new ModelRendererTurbo(this, 20, 384, textureX, textureY); // Du loco part05
		bodyModel[358] = new ModelRendererTurbo(this, 42, 361, textureX, textureY); // Du loco part41
		bodyModel[359] = new ModelRendererTurbo(this, 42, 361, textureX, textureY); // Du loco part41
		bodyModel[360] = new ModelRendererTurbo(this, 42, 361, textureX, textureY); // Du loco part41
		bodyModel[361] = new ModelRendererTurbo(this, 42, 361, textureX, textureY); // Du loco part41
		bodyModel[362] = new ModelRendererTurbo(this, 42, 361, textureX, textureY); // Du loco part41
		bodyModel[363] = new ModelRendererTurbo(this, 42, 361, textureX, textureY); // Du loco part41
		bodyModel[364] = new ModelRendererTurbo(this, 369, 140, textureX, textureY); // Du loco part28
		bodyModel[365] = new ModelRendererTurbo(this, 371, 140, textureX, textureY); // Du loco part28
		bodyModel[366] = new ModelRendererTurbo(this, 396, 140, textureX, textureY); // Du loco part28
		bodyModel[367] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Du loco part37
		bodyModel[368] = new ModelRendererTurbo(this, 113, 66, textureX, textureY); // Lamp
		bodyModel[369] = new ModelRendererTurbo(this, 1, 250, textureX, textureY); // Du loco part37
		bodyModel[370] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Du loco part37
		bodyModel[371] = new ModelRendererTurbo(this, 113, 66, textureX, textureY); // Lamp
		bodyModel[372] = new ModelRendererTurbo(this, 1, 250, textureX, textureY); // Du loco part37
		bodyModel[373] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[374] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[375] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[376] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[377] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[378] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[379] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[380] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[381] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[382] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[383] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[384] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[385] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[386] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[387] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[388] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[389] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[390] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[391] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[392] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[393] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[394] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[395] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[396] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[397] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[398] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[399] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[400] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[401] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[402] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[403] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[404] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[405] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[406] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[407] = new ModelRendererTurbo(this, 444, 506, textureX, textureY); // Box 0
		bodyModel[408] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[409] = new ModelRendererTurbo(this, 444, 503, textureX, textureY); // Box 0
		bodyModel[410] = new ModelRendererTurbo(this, 453, 506, textureX, textureY); // Box 0
		bodyModel[411] = new ModelRendererTurbo(this, 453, 503, textureX, textureY); // Box 0
		bodyModel[412] = new ModelRendererTurbo(this, 463, 475, textureX, textureY); // Box 0
		bodyModel[413] = new ModelRendererTurbo(this, 468, 475, textureX, textureY); // Box 0
		bodyModel[414] = new ModelRendererTurbo(this, 468, 484, textureX, textureY); // Box 0
		bodyModel[415] = new ModelRendererTurbo(this, 463, 493, textureX, textureY); // Box 0
		bodyModel[416] = new ModelRendererTurbo(this, 463, 481, textureX, textureY); // Box 0
		bodyModel[417] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[418] = new ModelRendererTurbo(this, 463, 497, textureX, textureY); // Box 0
		bodyModel[419] = new ModelRendererTurbo(this, 463, 487, textureX, textureY); // Box 0
		bodyModel[420] = new ModelRendererTurbo(this, 468, 481, textureX, textureY); // Box 0
		bodyModel[421] = new ModelRendererTurbo(this, 463, 484, textureX, textureY); // Box 0
		bodyModel[422] = new ModelRendererTurbo(this, 468, 478, textureX, textureY); // Box 0
		bodyModel[423] = new ModelRendererTurbo(this, 468, 487, textureX, textureY); // Box 0
		bodyModel[424] = new ModelRendererTurbo(this, 470, 493, textureX, textureY); // Box 0
		bodyModel[425] = new ModelRendererTurbo(this, 463, 478, textureX, textureY); // Box 0
		bodyModel[426] = new ModelRendererTurbo(this, 444, 488, textureX, textureY); // Box 0
		bodyModel[427] = new ModelRendererTurbo(this, 444, 478, textureX, textureY); // Box 0
		bodyModel[428] = new ModelRendererTurbo(this, 444, 483, textureX, textureY); // Box 0
		bodyModel[429] = new ModelRendererTurbo(this, 444, 498, textureX, textureY); // Box 0
		bodyModel[430] = new ModelRendererTurbo(this, 444, 493, textureX, textureY); // Box 0
		bodyModel[431] = new ModelRendererTurbo(this, 453, 488, textureX, textureY); // Box 0
		bodyModel[432] = new ModelRendererTurbo(this, 453, 478, textureX, textureY); // Box 0
		bodyModel[433] = new ModelRendererTurbo(this, 453, 483, textureX, textureY); // Box 0
		bodyModel[434] = new ModelRendererTurbo(this, 453, 498, textureX, textureY); // Box 0
		bodyModel[435] = new ModelRendererTurbo(this, 453, 493, textureX, textureY); // Box 0
		bodyModel[436] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[437] = new ModelRendererTurbo(this, 446, 475, textureX, textureY); // Box 0
		bodyModel[438] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[439] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[440] = new ModelRendererTurbo(this, 455, 475, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 54, 8, 12, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(16F, -11F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 70, 1, 20, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(0F, -12F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[2].setRotationPoint(-2F, -11F, 11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[3].setRotationPoint(-2F, -11F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 70, 20, 1, 0F); // Du loco part07
		bodyModel[4].setRotationPoint(0F, -30F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 40, 3, 4, 0F); // Du loco part08
		bodyModel[5].setRotationPoint(-1F, -33F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[6].setRotationPoint(-16F, -8F, 6.05F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[7].setRotationPoint(-1F, -30F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 21, 22, 0F); // Du loco part20
		bodyModel[8].setRotationPoint(70F, -30F, -11F);

		bodyModel[9].addBox(0F, 0F, 0F, 40, 3, 0, 0F); // Du loco part27
		bodyModel[9].setRotationPoint(25.5F, -10F, 6.15F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[10].setRotationPoint(-2F, -9F, -8F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[11].setRotationPoint(0F, -19F, -10F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[12].setRotationPoint(6F, -13F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[13].setRotationPoint(6F, -13F, -6F);
		bodyModel[13].rotateAngleY = -1.57079633F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[14].setRotationPoint(6F, -13F, -3F);
		bodyModel[14].rotateAngleY = -1.57079633F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[15].setRotationPoint(6F, -16F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[16].setRotationPoint(6F, -16F, -3F);
		bodyModel[16].rotateAngleY = -1.57079633F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[17].setRotationPoint(6F, -16F, -6F);
		bodyModel[17].rotateAngleY = -1.57079633F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[18].setRotationPoint(9F, -20F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[19].setRotationPoint(9F, -20F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[20].setRotationPoint(9F, -20F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[21].setRotationPoint(-2F, -17F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[22].setRotationPoint(-2F, -15F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[23].setRotationPoint(-2F, -15F, 4F);

		bodyModel[24].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[24].setRotationPoint(-2F, -17F, 4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[25].setRotationPoint(3F, -31F, 9F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[26].setRotationPoint(9F, -16F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[27].setRotationPoint(8F, -15F, -4F);
		bodyModel[27].rotateAngleY = -1.57079633F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[28].setRotationPoint(7F, -15F, -4F);
		bodyModel[28].rotateAngleY = -1.57079633F;

		bodyModel[29].addBox(0F, 0F, 0F, 70, 20, 1, 0F); // Box 135
		bodyModel[29].setRotationPoint(0F, -30F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 136
		bodyModel[30].setRotationPoint(19F, -30F, -10F);

		bodyModel[31].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[31].setRotationPoint(32F, -16F, -2F);

		bodyModel[32].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[32].setRotationPoint(31F, -22F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[33].setRotationPoint(31F, -24F, -3F);

		bodyModel[34].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 142
		bodyModel[34].setRotationPoint(32F, -25F, -2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 143
		bodyModel[35].setRotationPoint(31F, -26F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 144
		bodyModel[36].setRotationPoint(31F, -30F, -3F);

		bodyModel[37].addBox(0F, 0F, 0F, 12, 15, 12, 0F); // Box 145
		bodyModel[37].setRotationPoint(40F, -27F, -5F);

		bodyModel[38].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 146
		bodyModel[38].setRotationPoint(39F, -28F, -6F);

		bodyModel[39].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[39].setRotationPoint(34F, -19F, -4F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 148
		bodyModel[40].setRotationPoint(38F, -26F, -4F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[41].setRotationPoint(39F, -26F, -4F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[42].setRotationPoint(53F, -16F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[43].setRotationPoint(63F, -16F, -2F);

		bodyModel[44].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 152
		bodyModel[44].setRotationPoint(64F, -30F, -1F);

		bodyModel[45].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 153
		bodyModel[45].setRotationPoint(54F, -30F, -1F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 154
		bodyModel[46].setRotationPoint(57F, -27F, -1F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 155
		bodyModel[47].setRotationPoint(61F, -27F, -1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 156
		bodyModel[48].setRotationPoint(61F, -18F, -1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F); // Box 157
		bodyModel[49].setRotationPoint(57F, -18F, -1F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 158
		bodyModel[50].setRotationPoint(59F, -26F, -1F);

		bodyModel[51].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 159
		bodyModel[51].setRotationPoint(63F, -26F, -1F);

		bodyModel[52].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 160
		bodyModel[52].setRotationPoint(56F, -26F, -1F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[53].setRotationPoint(7F, -33F, -6F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[54].setRotationPoint(7F, -33F, 5F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[55].setRotationPoint(25F, -33F, -6F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[56].setRotationPoint(25F, -33F, 5F);

		bodyModel[57].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[57].setRotationPoint(7F, -34F, -6F);

		bodyModel[58].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[58].setRotationPoint(7F, -34F, 5F);

		bodyModel[59].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[59].setRotationPoint(15F, -37F, -4F);

		bodyModel[60].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[60].setRotationPoint(15F, -37F, 3F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[61].setRotationPoint(16F, -38F, -6F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[62].setRotationPoint(16F, -38F, 6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[63].setRotationPoint(16F, -38F, -8F);

		bodyModel[64].addBox(0F, 0F, 0F, 31, 1, 0, 0F); // Lamp
		bodyModel[64].setRotationPoint(42F, -36F, -5.05F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[65].setRotationPoint(4F, -35F, -5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[66].setRotationPoint(4F, -36F, -4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part Ligjhtpart8
		bodyModel[67].setRotationPoint(-1F, -34F, -2F);

		bodyModel[68].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[68].setRotationPoint(-2F, -16F, -9F);

		bodyModel[69].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[69].setRotationPoint(-2F, -16F, 4F);

		bodyModel[70].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[70].setRotationPoint(-2F, -34F, -3F);

		bodyModel[71].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[71].setRotationPoint(-2F, -31F, -3F);

		bodyModel[72].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Lamp
		bodyModel[72].setRotationPoint(-2F, -33F, -3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 36, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[73].setRotationPoint(3F, -32F, 6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 36, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[74].setRotationPoint(3F, -33F, 2F);

		bodyModel[75].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[75].setRotationPoint(14F, -34F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part23
		bodyModel[76].setRotationPoint(19F, -12F, 6.05F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part23
		bodyModel[77].setRotationPoint(7F, -12F, 6.05F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part23
		bodyModel[78].setRotationPoint(-5F, -12F, 6.05F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part23
		bodyModel[79].setRotationPoint(-17F, -12F, 6.05F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[80].setRotationPoint(-16F, -8F, -6.05F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 36, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[81].setRotationPoint(3F, -33F, -6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 36, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[82].setRotationPoint(3F, -32F, -9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[83].setRotationPoint(3F, -31F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[84].setRotationPoint(10F, -11F, -9F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[85].setRotationPoint(13F, -11F, -9F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[86].setRotationPoint(9F, -11F, 8F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[87].setRotationPoint(12F, -11F, 8F);

		bodyModel[88].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[88].setRotationPoint(10F, -5F, -11F);

		bodyModel[89].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[89].setRotationPoint(10F, -7F, -11F);

		bodyModel[90].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[90].setRotationPoint(10F, -9F, -11F);

		bodyModel[91].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[91].setRotationPoint(9F, -5F, 9F);

		bodyModel[92].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[92].setRotationPoint(9F, -7F, 9F);

		bodyModel[93].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[93].setRotationPoint(9F, -9F, 9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[94].setRotationPoint(8F, -25F, 11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[95].setRotationPoint(13F, -25F, 11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[96].setRotationPoint(8F, -25F, -12F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[97].setRotationPoint(13F, -25F, -12F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Du loco part05
		bodyModel[98].setRotationPoint(-1F, -20F, 11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[99].setRotationPoint(-1F, -20F, -12F);

		bodyModel[100].addShapeBox(0F, 0F, 1F, 1, 1, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 167
		bodyModel[100].setRotationPoint(-2F, -20F, -12F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[101].setRotationPoint(30F, -9F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[102].setRotationPoint(30F, -10F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[103].setRotationPoint(33F, -10F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[104].setRotationPoint(70F, -9F, -8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[105].setRotationPoint(20F, -35F, 4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, 0F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -7F); // Du loco part37
		bodyModel[106].setRotationPoint(18F, -37F, -4F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[107].setRotationPoint(4F, -35F, 4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[108].setRotationPoint(4F, -36F, 3F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[109].setRotationPoint(20F, -35F, -5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[110].setRotationPoint(17F, -36F, -4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[111].setRotationPoint(20F, -40F, 4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[112].setRotationPoint(7F, -40F, 4F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[113].setRotationPoint(17F, -46F, 3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[114].setRotationPoint(7F, -46F, 3F);

		bodyModel[115].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[115].setRotationPoint(15F, -47F, -4F);

		bodyModel[116].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[116].setRotationPoint(15F, -47F, 3F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[117].setRotationPoint(16F, -48F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[118].setRotationPoint(16F, -48F, 6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[119].setRotationPoint(16F, -48F, -8F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[120].setRotationPoint(20F, -40F, -5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[121].setRotationPoint(7F, -40F, -5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[122].setRotationPoint(17F, -46F, -4F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[123].setRotationPoint(7F, -46F, -4F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Du loco part06
		bodyModel[124].setRotationPoint(68F, -11F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[125].setRotationPoint(14F, -10F, 7F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 156
		bodyModel[126].setRotationPoint(-1F, -30F, -11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[127].setRotationPoint(-1F, -30F, 10F);

		bodyModel[128].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[128].setRotationPoint(-1.25F, -32F, -10.75F);

		bodyModel[129].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[129].setRotationPoint(-0.75F, -32F, -11.25F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[130].setRotationPoint(-1.25F, -32F, 10.75F);

		bodyModel[131].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[131].setRotationPoint(-0.75F, -32F, 10.25F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[132].setRotationPoint(0F, -21F, 11.05F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F); // Du loco part37
		bodyModel[133].setRotationPoint(18F, -46F, -4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F); // Du loco part37
		bodyModel[134].setRotationPoint(18F, -46F, -4F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[135].setRotationPoint(17F, -36F, 3F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, -7F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F); // Du loco part37
		bodyModel[136].setRotationPoint(18F, -37F, -4F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[137].setRotationPoint(0F, -21F, -11.05F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[138].setRotationPoint(-1F, -30F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[139].setRotationPoint(-1F, -30F, 10F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 2, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[140].setRotationPoint(-2F, -11F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[141].setRotationPoint(6F, -9F, -6F);

		bodyModel[142].addBox(0F, 0F, 0F, 10, 2, 12, 0F); // Du loco part01
		bodyModel[142].setRotationPoint(6F, -11F, -6F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Du loco part01
		bodyModel[143].setRotationPoint(12F, -9F, -6F);

		bodyModel[144].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Du loco part01
		bodyModel[144].setRotationPoint(10F, -6F, -1F);

		bodyModel[145].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[145].setRotationPoint(10F, -5F, -6F);

		bodyModel[146].addBox(0F, 0F, 0F, 4, 18, 8, 0F); // Du loco part20
		bodyModel[146].setRotationPoint(15F, -30F, -4F);

		bodyModel[147].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[147].setRotationPoint(17F, -34F, -9F);

		bodyModel[148].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[148].setRotationPoint(28F, -34F, -9F);

		bodyModel[149].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[149].setRotationPoint(54F, -36F, -6F);

		bodyModel[150].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[150].setRotationPoint(68F, -36F, -6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -3F); // Du loco part37
		bodyModel[151].setRotationPoint(30F, -36F, -8F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[152].setRotationPoint(61F, -28F, 10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[153].setRotationPoint(70F, -28F, 10F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[154].setRotationPoint(62F, -21F, 10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[155].setRotationPoint(62F, -29F, 10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[156].setRotationPoint(62F, -27F, 10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[157].setRotationPoint(66F, -28F, 10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[158].setRotationPoint(66F, -27F, 10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[159].setRotationPoint(62F, -26.25F, 10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[160].setRotationPoint(66F, -26.25F, 10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[161].setRotationPoint(62F, -25.5F, 10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[162].setRotationPoint(66F, -25.5F, 10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[163].setRotationPoint(62F, -24.75F, 10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[164].setRotationPoint(66F, -24.75F, 10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[165].setRotationPoint(62F, -24F, 10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[166].setRotationPoint(66F, -24F, 10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[167].setRotationPoint(62F, -23.25F, 10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[168].setRotationPoint(66F, -23.25F, 10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[169].setRotationPoint(62F, -22.5F, 10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[170].setRotationPoint(66F, -22.5F, 10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[171].setRotationPoint(61F, -28F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[172].setRotationPoint(70F, -28F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[173].setRotationPoint(62F, -21F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[174].setRotationPoint(62F, -29F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[175].setRotationPoint(66F, -28F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[176].setRotationPoint(62F, -27F, -11F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[177].setRotationPoint(66F, -27F, -11F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[178].setRotationPoint(62F, -26.25F, -11F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[179].setRotationPoint(66F, -26.25F, -11F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[180].setRotationPoint(62F, -25.5F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[181].setRotationPoint(66F, -25.5F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[182].setRotationPoint(62F, -24.75F, -11F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[183].setRotationPoint(66F, -24.75F, -11F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[184].setRotationPoint(62F, -24F, -11F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[185].setRotationPoint(66F, -24F, -11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[186].setRotationPoint(62F, -23.25F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[187].setRotationPoint(66F, -23.25F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[188].setRotationPoint(62F, -22.5F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[189].setRotationPoint(66F, -22.5F, -11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[190].setRotationPoint(62F, -21.75F, 10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[191].setRotationPoint(66F, -21.75F, 10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[192].setRotationPoint(66F, -28.5F, 10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[193].setRotationPoint(62F, -28.5F, 10F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[194].setRotationPoint(62F, -21.75F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[195].setRotationPoint(66F, -21.75F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[196].setRotationPoint(66F, -28.5F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[197].setRotationPoint(62F, -28.5F, -11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[198].setRotationPoint(62F, -27.75F, -11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[199].setRotationPoint(66F, -27.75F, -11F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[200].setRotationPoint(62F, -27.75F, 10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[201].setRotationPoint(66F, -27.75F, 10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[202].setRotationPoint(3F, -22F, 10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[203].setRotationPoint(3F, -28F, 10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[204].setRotationPoint(3F, -28F, 10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[205].setRotationPoint(7F, -28F, 10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[206].setRotationPoint(9F, -22F, 10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[207].setRotationPoint(9F, -28F, 10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[208].setRotationPoint(9F, -28F, 10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[209].setRotationPoint(12F, -28F, 10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[210].setRotationPoint(3F, -22F, -11F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[211].setRotationPoint(3F, -28F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[212].setRotationPoint(3F, -28F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[213].setRotationPoint(7F, -28F, -11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[214].setRotationPoint(9F, -22F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[215].setRotationPoint(9F, -28F, -11F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[216].setRotationPoint(9F, -28F, -11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[217].setRotationPoint(12F, -28F, -11F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[218].setRotationPoint(-1F, -22F, 4F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[219].setRotationPoint(-1F, -29F, 4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[220].setRotationPoint(-1F, -29F, 4F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[221].setRotationPoint(-1F, -29F, 8F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[222].setRotationPoint(-1F, -22F, -9F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[223].setRotationPoint(-1F, -29F, -9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[224].setRotationPoint(-1F, -29F, -9F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[225].setRotationPoint(-1F, -29F, -5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[226].setRotationPoint(-1F, -22F, -3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[227].setRotationPoint(-1F, -29F, -3F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[228].setRotationPoint(-1F, -29F, -3F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[229].setRotationPoint(-1F, -29F, 2F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[230].setRotationPoint(30F, -9F, -10F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[231].setRotationPoint(30F, -10F, -10F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[232].setRotationPoint(30F, -10F, -11F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[233].setRotationPoint(40F, -28F, 10F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[234].setRotationPoint(49F, -28F, 10F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[235].setRotationPoint(41F, -21F, 10F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[236].setRotationPoint(41F, -29F, 10F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[237].setRotationPoint(41F, -27F, 10F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[238].setRotationPoint(45F, -28F, 10F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[239].setRotationPoint(45F, -27F, 10F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[240].setRotationPoint(41F, -26.25F, 10F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[241].setRotationPoint(45F, -26.25F, 10F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[242].setRotationPoint(41F, -25.5F, 10F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[243].setRotationPoint(45F, -25.5F, 10F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[244].setRotationPoint(41F, -24.75F, 10F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[245].setRotationPoint(45F, -24.75F, 10F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[246].setRotationPoint(41F, -24F, 10F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[247].setRotationPoint(45F, -24F, 10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[248].setRotationPoint(41F, -23.25F, 10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[249].setRotationPoint(45F, -23.25F, 10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[250].setRotationPoint(41F, -22.5F, 10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[251].setRotationPoint(45F, -22.5F, 10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[252].setRotationPoint(40F, -28F, -11F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[253].setRotationPoint(49F, -28F, -11F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[254].setRotationPoint(41F, -21F, -11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[255].setRotationPoint(41F, -29F, -11F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[256].setRotationPoint(45F, -28F, -11F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[257].setRotationPoint(41F, -27F, -11F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[258].setRotationPoint(45F, -27F, -11F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[259].setRotationPoint(41F, -26.25F, -11F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[260].setRotationPoint(45F, -26.25F, -11F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[261].setRotationPoint(41F, -25.5F, -11F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[262].setRotationPoint(45F, -25.5F, -11F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[263].setRotationPoint(41F, -24.75F, -11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[264].setRotationPoint(45F, -24.75F, -11F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[265].setRotationPoint(41F, -24F, -11F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[266].setRotationPoint(45F, -24F, -11F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[267].setRotationPoint(41F, -23.25F, -11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[268].setRotationPoint(45F, -23.25F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[269].setRotationPoint(41F, -22.5F, -11F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[270].setRotationPoint(45F, -22.5F, -11F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[271].setRotationPoint(41F, -21.75F, 10F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[272].setRotationPoint(45F, -21.75F, 10F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[273].setRotationPoint(45F, -28.5F, 10F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[274].setRotationPoint(41F, -28.5F, 10F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[275].setRotationPoint(41F, -21.75F, -11F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[276].setRotationPoint(45F, -21.75F, -11F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[277].setRotationPoint(45F, -28.5F, -11F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[278].setRotationPoint(41F, -28.5F, -11F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[279].setRotationPoint(41F, -27.75F, -11F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[280].setRotationPoint(45F, -27.75F, -11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[281].setRotationPoint(41F, -27.75F, 10F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[282].setRotationPoint(45F, -27.75F, 10F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[283].setRotationPoint(56F, -22F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[284].setRotationPoint(56F, -28F, -11F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[285].setRotationPoint(56F, -28F, -11F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[286].setRotationPoint(60F, -28F, -11F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[287].setRotationPoint(14F, -22F, 10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[288].setRotationPoint(14F, -28F, 10F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[289].setRotationPoint(14F, -28F, 10F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[290].setRotationPoint(18F, -28F, 10F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[291].setRotationPoint(14F, -22F, -11F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[292].setRotationPoint(14F, -28F, -11F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[293].setRotationPoint(14F, -28F, -11F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[294].setRotationPoint(18F, -28F, -11F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[295].setRotationPoint(-1F, -33F, 2F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[296].setRotationPoint(-1F, -32F, 6F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[297].setRotationPoint(-1F, -33F, -6F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[298].setRotationPoint(-1F, -32F, -9F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[299].setRotationPoint(-1F, -31F, -11F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -1F, -2F, -4F, -1F, 0F, 0F, 0F, -2F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 149
		bodyModel[300].setRotationPoint(-1F, -31F, 9F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[301].setRotationPoint(-0.5F, -33F, 6F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[302].setRotationPoint(35F, -22F, 10F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[303].setRotationPoint(35F, -28F, 10F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[304].setRotationPoint(35F, -28F, 10F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[305].setRotationPoint(39F, -28F, 10F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[306].setRotationPoint(50F, -22F, 10F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[307].setRotationPoint(50F, -28F, 10F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[308].setRotationPoint(50F, -28F, 10F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[309].setRotationPoint(54F, -28F, 10F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[310].setRotationPoint(56F, -22F, 10F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[311].setRotationPoint(56F, -28F, 10F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[312].setRotationPoint(56F, -28F, 10F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[313].setRotationPoint(60F, -28F, 10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[314].setRotationPoint(14F, -8F, 7F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[315].setRotationPoint(14F, -10F, 9F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, -0.625F, 0F, -0.625F, -0.625F); // Du loco part06
		bodyModel[316].setRotationPoint(14F, -8F, 9F);

		bodyModel[317].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part28
		bodyModel[317].setRotationPoint(15F, -10F, 10F);

		bodyModel[318].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part28
		bodyModel[318].setRotationPoint(21F, -10F, 10F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part28
		bodyModel[319].setRotationPoint(15F, -11F, 7F);

		bodyModel[320].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part28
		bodyModel[320].setRotationPoint(21F, -11F, 7F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[321].setRotationPoint(50F, -22F, -11F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[322].setRotationPoint(50F, -28F, -11F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[323].setRotationPoint(50F, -28F, -11F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[324].setRotationPoint(54F, -28F, -11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[325].setRotationPoint(35F, -22F, -11F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[326].setRotationPoint(35F, -28F, -11F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[327].setRotationPoint(35F, -28F, -11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[328].setRotationPoint(39F, -28F, -11F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 39, 5, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[329].setRotationPoint(32F, -35F, -2F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 34, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Box 149
		bodyModel[330].setRotationPoint(37F, -32F, 9F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 36, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 149
		bodyModel[331].setRotationPoint(35F, -34F, 6F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 38, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 149
		bodyModel[332].setRotationPoint(33F, -35F, 2F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 38, 5, 4, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[333].setRotationPoint(33F, -35F, -6F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 36, 4, 3, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[334].setRotationPoint(35F, -34F, -9F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 34, 2, 2, 0F,-1.5F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[335].setRotationPoint(37F, -32F, -11F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 39, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part08
		bodyModel[336].setRotationPoint(32F, -35F, 0F);

		bodyModel[337].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[337].setRotationPoint(40F, -36F, -6F);

		bodyModel[338].addBox(0F, 0F, 0F, 12, 1, 0, 0F); // Lamp
		bodyModel[338].setRotationPoint(16F, -34F, -8F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part23
		bodyModel[339].setRotationPoint(19F, -12F, -6.05F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part23
		bodyModel[340].setRotationPoint(7F, -12F, -6.05F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part23
		bodyModel[341].setRotationPoint(-5F, -12F, -6.05F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-39F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -39F, 0F, 0F, -39F, -39F, 0F, 0F, -39F, 0F, 0F, -39F, 0F, -39F, -39F, 0F); // Du loco part23
		bodyModel[342].setRotationPoint(-17F, -12F, -6.05F);

		bodyModel[343].addBox(0F, 0F, 0F, 40, 3, 0, 0F); // Du loco part27
		bodyModel[343].setRotationPoint(25.5F, -10F, -6.15F);

		bodyModel[344].addBox(0F, 0F, 0F, 2, 6, 2, 0F); // Du loco part06
		bodyModel[344].setRotationPoint(68F, -11F, -9F);

		bodyModel[345].addBox(0F, 0F, 0F, 31, 1, 0, 0F); // Lamp
		bodyModel[345].setRotationPoint(42F, -36F, 4.95F);

		bodyModel[346].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[346].setRotationPoint(28F, -34F, 7F);

		bodyModel[347].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[347].setRotationPoint(54F, -36F, 4F);

		bodyModel[348].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[348].setRotationPoint(68F, -36F, 4F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F); // Du loco part37
		bodyModel[349].setRotationPoint(30F, -36F, 5F);

		bodyModel[350].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[350].setRotationPoint(40F, -36F, 4F);

		bodyModel[351].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[351].setRotationPoint(14F, -34F, 7F);

		bodyModel[352].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[352].setRotationPoint(17F, -34F, 7F);

		bodyModel[353].addBox(0F, 0F, 0F, 12, 1, 0, 0F); // Lamp
		bodyModel[353].setRotationPoint(16F, -34F, 8F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[354].setRotationPoint(70F, -22F, -2F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[355].setRotationPoint(70F, -27F, -2F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[356].setRotationPoint(70F, -27F, -2F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[357].setRotationPoint(70F, -27F, 1F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F,-7F, 0F, 0F, -2.875F, 0F, 0F, -9.875F, -2F, 0F, 0F, -2F, 0F, -9.875F, -2F, 0F, 0F, -2F, 0F, -8.875F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[358].setRotationPoint(-2F, -9F, -11F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 11, 4, 11, 0F,-10.875F, 0F, 0F, 0F, 0F, 0F, -8.875F, -2F, 0F, -2F, -2F, 0F, -5F, 0F, 0F, -5.875F, 0F, 0F, -10.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[359].setRotationPoint(-3F, -5F, -11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 9, 4, 11, 0F,-8.875F, 0F, 0F, 0F, 0F, 0F, -8.875F, -2F, 0F, 0F, -2F, 0F, -8.875F, -2F, 0F, 0F, -2F, 0F, -8.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[360].setRotationPoint(-1F, -7F, -11F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 10, 4, 11, 0F,0F, -2F, 0F, -9.875F, -2F, 0F, -2.875F, 0F, 0F, -7F, 0F, 0F, -1F, 0F, 0F, -8.875F, 0F, 0F, 0F, -2F, 0F, -9.875F, -2F, 0F); // Du loco part41
		bodyModel[361].setRotationPoint(-2F, -9F, 0F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 11, 4, 11, 0F,-2F, -2F, 0F, -8.875F, -2F, 0F, 0F, 0F, 0F, -10.875F, 0F, 0F, 0F, 0F, 0F, -10.875F, 0F, 0F, -5.875F, 0F, 0F, -5F, 0F, 0F); // Du loco part41
		bodyModel[362].setRotationPoint(-3F, -5F, 0F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 9, 4, 11, 0F,0F, -2F, 0F, -8.875F, -2F, 0F, 0F, 0F, 0F, -8.875F, 0F, 0F, 0F, 0F, 0F, -8.875F, 0F, 0F, 0F, -2F, 0F, -8.875F, -2F, 0F); // Du loco part41
		bodyModel[363].setRotationPoint(-1F, -7F, 0F);

		bodyModel[364].addBox(0F, 0F, 0F, 5, 23, 8, 0F); // Du loco part28
		bodyModel[364].setRotationPoint(-6F, -34F, -4F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F); // Du loco part28
		bodyModel[365].setRotationPoint(-1F, -34F, -4F);

		bodyModel[366].addBox(0F, 0F, 0F, 2, 20, 8, 0F); // Du loco part28
		bodyModel[366].setRotationPoint(71F, -30F, -4F);

		bodyModel[367].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[367].setRotationPoint(3F, -34F, 7F);

		bodyModel[368].addBox(0F, 0F, 0F, 9, 1, 0, 0F); // Lamp
		bodyModel[368].setRotationPoint(5F, -34F, 8F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -3F); // Du loco part37
		bodyModel[369].setRotationPoint(-6F, -36F, 5F);

		bodyModel[370].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[370].setRotationPoint(3F, -34F, -9F);

		bodyModel[371].addBox(0F, 0F, 0F, 9, 1, 0, 0F); // Lamp
		bodyModel[371].setRotationPoint(5F, -34F, -8F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F); // Du loco part37
		bodyModel[372].setRotationPoint(-6F, -36F, -8F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[373].setRotationPoint(-3F, -9.25F, 4.43F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[374].setRotationPoint(-2.75F, -9F, 4.9F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[375].setRotationPoint(-5.5F, -8.75F, 5.15F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[376].setRotationPoint(-3F, -9.25F, -6.63F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[377].setRotationPoint(-5.5F, -8.75F, -5.88F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[378].setRotationPoint(-3F, -8.75F, 0F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[379].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[380].setRotationPoint(-2.5F, -8.5F, -0.25F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[381].setRotationPoint(-4.5F, -7F, -0.25F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[382].setRotationPoint(-3.5F, -8.75F, -0.25F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[383].setRotationPoint(-4.5F, -8.5F, 0F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[384].setRotationPoint(-4.5F, -8.5F, -0.75F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[385].setRotationPoint(-3F, -8.75F, 0.25F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[386].setRotationPoint(-3F, -8.5F, -0.25F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[387].setRotationPoint(-3F, -9F, -0.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[388].setRotationPoint(-3F, -6F, -0.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[389].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[390].setRotationPoint(-4.5F, -6F, -0.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[391].setRotationPoint(-4.5F, -5.25F, -0.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[392].setRotationPoint(-6.5F, -8.87F, 4.03F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[393].setRotationPoint(-6.5F, -9.87F, 4.03F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[394].setRotationPoint(-6.5F, -9.37F, 4.03F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[395].setRotationPoint(-6.5F, -7.87F, 4.03F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[396].setRotationPoint(-6.5F, -8.37F, 4.03F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[397].setRotationPoint(-6.5F, -8.87F, -7.03F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[398].setRotationPoint(-6.5F, -9.87F, -7.03F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[399].setRotationPoint(-6.5F, -9.37F, -7.03F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[400].setRotationPoint(-6.5F, -7.87F, -7.03F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[401].setRotationPoint(-6.5F, -8.37F, -7.03F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[402].setRotationPoint(-2.75F, -9.5F, 4.9F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[403].setRotationPoint(-2.75F, -8.25F, 4.9F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[404].setRotationPoint(-2.75F, -9F, -6.13F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[405].setRotationPoint(-2.75F, -9.5F, -6.13F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[406].setRotationPoint(-2.75F, -8.25F, -6.13F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[407].setRotationPoint(71F, -9.25F, 4.43F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[408].setRotationPoint(70.75F, -9F, 4.9F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[409].setRotationPoint(71.5F, -8.75F, 5.15F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[410].setRotationPoint(71F, -9.25F, -6.63F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[411].setRotationPoint(71.5F, -8.75F, -5.88F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[412].setRotationPoint(71F, -8.75F, 0F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[413].setRotationPoint(71F, -8.75F, -1F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[414].setRotationPoint(70.5F, -8.5F, -0.25F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[415].setRotationPoint(71.5F, -7F, -0.25F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[416].setRotationPoint(71.5F, -8.75F, -0.25F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[417].setRotationPoint(70.5F, -8.5F, 0F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[418].setRotationPoint(70.5F, -8.5F, -0.75F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[419].setRotationPoint(71F, -8.75F, 0.25F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[420].setRotationPoint(71F, -8.5F, -0.25F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[421].setRotationPoint(71F, -9F, -0.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[422].setRotationPoint(71F, -6F, -0.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[423].setRotationPoint(71F, -8.75F, -1F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[424].setRotationPoint(71.5F, -6F, -0.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[425].setRotationPoint(72.5F, -5.25F, -0.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[426].setRotationPoint(74.5F, -8.87F, 4.03F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[427].setRotationPoint(74.5F, -9.87F, 4.03F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[428].setRotationPoint(74.5F, -9.37F, 4.03F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[429].setRotationPoint(74.5F, -7.87F, 4.03F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[430].setRotationPoint(74.5F, -8.37F, 4.03F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[431].setRotationPoint(74.5F, -8.87F, -7.03F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[432].setRotationPoint(74.5F, -9.87F, -7.03F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[433].setRotationPoint(74.5F, -9.37F, -7.03F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[434].setRotationPoint(74.5F, -7.87F, -7.03F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[435].setRotationPoint(74.5F, -8.37F, -7.03F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[436].setRotationPoint(70.75F, -9.5F, 4.9F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[437].setRotationPoint(70.75F, -8.25F, 4.9F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[438].setRotationPoint(70.75F, -9F, -6.13F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[439].setRotationPoint(70.75F, -9.5F, -6.13F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[440].setRotationPoint(70.75F, -8.25F, -6.13F);
	}
}