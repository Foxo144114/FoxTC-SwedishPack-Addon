//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera UBF6Y
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittUBF6Y extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittUBF6Y() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[401];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part03
		bodyModel[1] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Du loco part07
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Du loco part08
		bodyModel[3] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Du loco part09
		bodyModel[4] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part19
		bodyModel[5] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Du loco part20
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part56
		bodyModel[7] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Du loco part82
		bodyModel[8] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part83
		bodyModel[9] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Du loco part84
		bodyModel[10] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Du loco part85
		bodyModel[11] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Du loco part94
		bodyModel[12] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Du loco part95
		bodyModel[13] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Du loco part97
		bodyModel[14] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Du loco part100
		bodyModel[15] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part101
		bodyModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part102
		bodyModel[17] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // part
		bodyModel[18] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // part
		bodyModel[19] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 149
		bodyModel[20] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 168
		bodyModel[21] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 177
		bodyModel[22] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 194
		bodyModel[23] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 195
		bodyModel[24] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 135
		bodyModel[25] = new ModelRendererTurbo(this, 273, 25, textureX, textureY); // Box 136
		bodyModel[26] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Du loco part47
		bodyModel[27] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Du loco part47
		bodyModel[28] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Du loco part42
		bodyModel[29] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 146
		bodyModel[30] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 146
		bodyModel[31] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 168
		bodyModel[32] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[33] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 149
		bodyModel[34] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 149
		bodyModel[35] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Du loco part09
		bodyModel[36] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 168
		bodyModel[37] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 167
		bodyModel[38] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Du loco part71
		bodyModel[39] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Du loco part71
		bodyModel[40] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Du loco part71
		bodyModel[41] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 167
		bodyModel[42] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 167
		bodyModel[43] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Du loco part28
		bodyModel[44] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Du loco part28
		bodyModel[45] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Du loco part28
		bodyModel[46] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Du loco part28
		bodyModel[47] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Du loco part28
		bodyModel[48] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Du loco part28
		bodyModel[49] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Du loco part28
		bodyModel[50] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Du loco part28
		bodyModel[51] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Du loco part09
		bodyModel[52] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Du loco part09
		bodyModel[53] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Du loco part82
		bodyModel[54] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Du loco part83
		bodyModel[55] = new ModelRendererTurbo(this, 233, 33, textureX, textureY); // Du loco part84
		bodyModel[56] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Du loco part85
		bodyModel[57] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Du loco part94
		bodyModel[58] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Du loco part95
		bodyModel[59] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Du loco part97
		bodyModel[60] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Du loco part100
		bodyModel[61] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Du loco part101
		bodyModel[62] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Du loco part102
		bodyModel[63] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 177
		bodyModel[64] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 193
		bodyModel[65] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 196
		bodyModel[66] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Du loco part06
		bodyModel[67] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Du loco part06
		bodyModel[68] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Du loco part06
		bodyModel[69] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Du loco part06
		bodyModel[70] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Du loco part06
		bodyModel[71] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Du loco part06
		bodyModel[72] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Du loco part06
		bodyModel[73] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Du loco part06
		bodyModel[74] = new ModelRendererTurbo(this, 265, 105, textureX, textureY); // Du loco part06
		bodyModel[75] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Du loco part42
		bodyModel[76] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Du loco part42
		bodyModel[77] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Du loco part42
		bodyModel[78] = new ModelRendererTurbo(this, 88, 105, textureX, textureY); // Du loco part19
		bodyModel[79] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Du loco part05
		bodyModel[80] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Du loco part05
		bodyModel[81] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Du loco part05
		bodyModel[82] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Du loco part05
		bodyModel[83] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Du loco part05
		bodyModel[84] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Du loco part05
		bodyModel[85] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Du loco part05
		bodyModel[86] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Du loco part05
		bodyModel[87] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Du loco part05
		bodyModel[88] = new ModelRendererTurbo(this, 409, 81, textureX, textureY); // Du loco part05
		bodyModel[89] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Du loco part05
		bodyModel[90] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Du loco part05
		bodyModel[91] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Du loco part05
		bodyModel[92] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Du loco part05
		bodyModel[93] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Du loco part05
		bodyModel[94] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Du loco part05
		bodyModel[95] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Du loco part42
		bodyModel[96] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Du loco part42
		bodyModel[97] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Du loco part01
		bodyModel[98] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Du loco part01
		bodyModel[99] = new ModelRendererTurbo(this, 321, 121, textureX, textureY); // Du loco part09
		bodyModel[100] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Du loco part09
		bodyModel[101] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Du loco part01
		bodyModel[102] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Du loco part09
		bodyModel[103] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Du loco part09
		bodyModel[104] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Du loco part01
		bodyModel[105] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 168
		bodyModel[106] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 168
		bodyModel[107] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 168
		bodyModel[108] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Du loco part19
		bodyModel[109] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 168
		bodyModel[110] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 168
		bodyModel[111] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 168
		bodyModel[112] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 168
		bodyModel[113] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 168
		bodyModel[114] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 168
		bodyModel[115] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Du loco part03
		bodyModel[116] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Du loco part03
		bodyModel[117] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Du loco part03
		bodyModel[118] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Du loco part03
		bodyModel[119] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Du loco part03
		bodyModel[120] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Du loco part03
		bodyModel[121] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // part
		bodyModel[122] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Lamp
		bodyModel[123] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Lamp
		bodyModel[124] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Lamp
		bodyModel[125] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // part
		bodyModel[126] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // part
		bodyModel[127] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[128] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // part
		bodyModel[129] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Lamp
		bodyModel[130] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Lamp
		bodyModel[131] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Lamp
		bodyModel[132] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 167
		bodyModel[133] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 167
		bodyModel[134] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 167
		bodyModel[135] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 167
		bodyModel[136] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 167
		bodyModel[137] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 167
		bodyModel[138] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // part
		bodyModel[139] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // part
		bodyModel[140] = new ModelRendererTurbo(this, 305, 121, textureX, textureY); // part
		bodyModel[141] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Lamp
		bodyModel[142] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Lamp
		bodyModel[143] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Lamp
		bodyModel[144] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 167
		bodyModel[145] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 167
		bodyModel[146] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 167
		bodyModel[147] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 167
		bodyModel[148] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 167
		bodyModel[149] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 167
		bodyModel[150] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 167
		bodyModel[151] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 167
		bodyModel[152] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 167
		bodyModel[153] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 167
		bodyModel[154] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 167
		bodyModel[155] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Du loco part05
		bodyModel[156] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Du loco part05
		bodyModel[157] = new ModelRendererTurbo(this, 313, 129, textureX, textureY); // Du loco part05
		bodyModel[158] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Du loco part05
		bodyModel[159] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Du loco part05
		bodyModel[160] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Du loco part05
		bodyModel[161] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Du loco part05
		bodyModel[162] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Du loco part05
		bodyModel[163] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Du loco part05
		bodyModel[164] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Du loco part05
		bodyModel[165] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Du loco part05
		bodyModel[166] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Du loco part05
		bodyModel[167] = new ModelRendererTurbo(this, 161, 177, textureX, textureY); // Du loco part05
		bodyModel[168] = new ModelRendererTurbo(this, 185, 177, textureX, textureY); // Du loco part05
		bodyModel[169] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Du loco part05
		bodyModel[170] = new ModelRendererTurbo(this, 209, 177, textureX, textureY); // Du loco part05
		bodyModel[171] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Du loco part05
		bodyModel[172] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Du loco part05
		bodyModel[173] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Du loco part05
		bodyModel[174] = new ModelRendererTurbo(this, 273, 177, textureX, textureY); // Du loco part05
		bodyModel[175] = new ModelRendererTurbo(this, 281, 177, textureX, textureY); // Du loco part05
		bodyModel[176] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Du loco part05
		bodyModel[177] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Du loco part05
		bodyModel[178] = new ModelRendererTurbo(this, 337, 177, textureX, textureY); // Du loco part05
		bodyModel[179] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Du loco part05
		bodyModel[180] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Du loco part05
		bodyModel[181] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Du loco part05
		bodyModel[182] = new ModelRendererTurbo(this, 401, 177, textureX, textureY); // Du loco part05
		bodyModel[183] = new ModelRendererTurbo(this, 449, 121, textureX, textureY); // Du loco part05
		bodyModel[184] = new ModelRendererTurbo(this, 193, 129, textureX, textureY); // Du loco part05
		bodyModel[185] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Du loco part05
		bodyModel[186] = new ModelRendererTurbo(this, 217, 129, textureX, textureY); // Du loco part05
		bodyModel[187] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Du loco part05
		bodyModel[188] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Du loco part05
		bodyModel[189] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Du loco part05
		bodyModel[190] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Du loco part05
		bodyModel[191] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Du loco part05
		bodyModel[192] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Du loco part05
		bodyModel[193] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Du loco part05
		bodyModel[194] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Du loco part05
		bodyModel[195] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Du loco part05
		bodyModel[196] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Du loco part05
		bodyModel[197] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Du loco part05
		bodyModel[198] = new ModelRendererTurbo(this, 241, 185, textureX, textureY); // Du loco part05
		bodyModel[199] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Du loco part05
		bodyModel[200] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Du loco part05
		bodyModel[201] = new ModelRendererTurbo(this, 281, 185, textureX, textureY); // Du loco part05
		bodyModel[202] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Du loco part05
		bodyModel[203] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Du loco part05
		bodyModel[204] = new ModelRendererTurbo(this, 353, 185, textureX, textureY); // Du loco part05
		bodyModel[205] = new ModelRendererTurbo(this, 257, 121, textureX, textureY); // Du loco part05
		bodyModel[206] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Du loco part05
		bodyModel[207] = new ModelRendererTurbo(this, 377, 185, textureX, textureY); // Du loco part05
		bodyModel[208] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Du loco part05
		bodyModel[209] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Du loco part05
		bodyModel[210] = new ModelRendererTurbo(this, 433, 185, textureX, textureY); // Du loco part05
		bodyModel[211] = new ModelRendererTurbo(this, 393, 185, textureX, textureY); // Du loco part05
		bodyModel[212] = new ModelRendererTurbo(this, 457, 185, textureX, textureY); // Du loco part05
		bodyModel[213] = new ModelRendererTurbo(this, 433, 121, textureX, textureY); // Du loco part05
		bodyModel[214] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Du loco part05
		bodyModel[215] = new ModelRendererTurbo(this, 465, 185, textureX, textureY); // Du loco part05
		bodyModel[216] = new ModelRendererTurbo(this, 473, 185, textureX, textureY); // Du loco part05
		bodyModel[217] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Du loco part05
		bodyModel[218] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Du loco part05
		bodyModel[219] = new ModelRendererTurbo(this, 481, 185, textureX, textureY); // Du loco part05
		bodyModel[220] = new ModelRendererTurbo(this, 489, 185, textureX, textureY); // Du loco part05
		bodyModel[221] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Du loco part05
		bodyModel[222] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Du loco part05
		bodyModel[223] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Du loco part05
		bodyModel[224] = new ModelRendererTurbo(this, 505, 185, textureX, textureY); // Du loco part05
		bodyModel[225] = new ModelRendererTurbo(this, 49, 193, textureX, textureY); // Du loco part05
		bodyModel[226] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Du loco part05
		bodyModel[227] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Du loco part05
		bodyModel[228] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Du loco part05
		bodyModel[229] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Du loco part05
		bodyModel[230] = new ModelRendererTurbo(this, 137, 193, textureX, textureY); // Du loco part05
		bodyModel[231] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Du loco part05
		bodyModel[232] = new ModelRendererTurbo(this, 169, 193, textureX, textureY); // Du loco part05
		bodyModel[233] = new ModelRendererTurbo(this, 177, 193, textureX, textureY); // Du loco part05
		bodyModel[234] = new ModelRendererTurbo(this, 201, 193, textureX, textureY); // Du loco part05
		bodyModel[235] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Du loco part05
		bodyModel[236] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Du loco part05
		bodyModel[237] = new ModelRendererTurbo(this, 241, 193, textureX, textureY); // Du loco part05
		bodyModel[238] = new ModelRendererTurbo(this, 265, 193, textureX, textureY); // Du loco part05
		bodyModel[239] = new ModelRendererTurbo(this, 289, 193, textureX, textureY); // Du loco part05
		bodyModel[240] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Du loco part05
		bodyModel[241] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Du loco part05
		bodyModel[242] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Du loco part05
		bodyModel[243] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Du loco part05
		bodyModel[244] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Du loco part05
		bodyModel[245] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Du loco part05
		bodyModel[246] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Du loco part05
		bodyModel[247] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Du loco part05
		bodyModel[248] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Du loco part05
		bodyModel[249] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Du loco part05
		bodyModel[250] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Du loco part05
		bodyModel[251] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Du loco part05
		bodyModel[252] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Du loco part05
		bodyModel[253] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Du loco part05
		bodyModel[254] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Du loco part05
		bodyModel[255] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Du loco part05
		bodyModel[256] = new ModelRendererTurbo(this, 433, 193, textureX, textureY); // Du loco part05
		bodyModel[257] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Du loco part05
		bodyModel[258] = new ModelRendererTurbo(this, 25, 201, textureX, textureY); // Du loco part05
		bodyModel[259] = new ModelRendererTurbo(this, 33, 201, textureX, textureY); // Du loco part05
		bodyModel[260] = new ModelRendererTurbo(this, 49, 201, textureX, textureY); // Du loco part05
		bodyModel[261] = new ModelRendererTurbo(this, 65, 201, textureX, textureY); // Du loco part05
		bodyModel[262] = new ModelRendererTurbo(this, 73, 201, textureX, textureY); // Du loco part05
		bodyModel[263] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Du loco part05
		bodyModel[264] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Du loco part05
		bodyModel[265] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Du loco part05
		bodyModel[266] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Du loco part05
		bodyModel[267] = new ModelRendererTurbo(this, 177, 201, textureX, textureY); // Du loco part05
		bodyModel[268] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Du loco part05
		bodyModel[269] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Du loco part05
		bodyModel[270] = new ModelRendererTurbo(this, 241, 201, textureX, textureY); // Du loco part05
		bodyModel[271] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // part
		bodyModel[272] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // part
		bodyModel[273] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[274] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // part
		bodyModel[275] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Lamp
		bodyModel[276] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Lamp
		bodyModel[277] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Lamp
		bodyModel[278] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // part
		bodyModel[279] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // part
		bodyModel[280] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[281] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // part
		bodyModel[282] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Lamp
		bodyModel[283] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Lamp
		bodyModel[284] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Lamp
		bodyModel[285] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // part
		bodyModel[286] = new ModelRendererTurbo(this, 457, 201, textureX, textureY); // part
		bodyModel[287] = new ModelRendererTurbo(this, 473, 201, textureX, textureY); // part
		bodyModel[288] = new ModelRendererTurbo(this, 233, 185, textureX, textureY); // Lamp
		bodyModel[289] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Lamp
		bodyModel[290] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Lamp
		bodyModel[291] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part42
		bodyModel[292] = new ModelRendererTurbo(this, 33, 209, textureX, textureY); // Du loco part42
		bodyModel[293] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Du loco part42
		bodyModel[294] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Du loco part42
		bodyModel[295] = new ModelRendererTurbo(this, 129, 209, textureX, textureY); // Du loco part42
		bodyModel[296] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Du loco part42
		bodyModel[297] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Du loco part42
		bodyModel[298] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Du loco part42
		bodyModel[299] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Du loco part42
		bodyModel[300] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Du loco part56
		bodyModel[301] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Du loco part56
		bodyModel[302] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Du loco part56
		bodyModel[303] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Du loco part47
		bodyModel[304] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Du loco part47
		bodyModel[305] = new ModelRendererTurbo(this, 329, 209, textureX, textureY); // Du loco part42
		bodyModel[306] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Du loco part42
		bodyModel[307] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Du loco part42
		bodyModel[308] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Du loco part42
		bodyModel[309] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Du loco part56
		bodyModel[310] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Du loco part47
		bodyModel[311] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Du loco part56
		bodyModel[312] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Du loco part47
		bodyModel[313] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Du loco part47
		bodyModel[314] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Du loco part42
		bodyModel[315] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Du loco part42
		bodyModel[316] = new ModelRendererTurbo(this, 121, 217, textureX, textureY); // Du loco part42
		bodyModel[317] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Du loco part56
		bodyModel[318] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Du loco part56
		bodyModel[319] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Du loco part56
		bodyModel[320] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Du loco part47
		bodyModel[321] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Du loco part42
		bodyModel[322] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Du loco part42
		bodyModel[323] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Du loco part42
		bodyModel[324] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Du loco part42
		bodyModel[325] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Du loco part56
		bodyModel[326] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Du loco part47
		bodyModel[327] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Du loco part47
		bodyModel[328] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Du loco part01
		bodyModel[329] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Du loco part01
		bodyModel[330] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Du loco part01
		bodyModel[331] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Du loco part01
		bodyModel[332] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Du loco part01
		bodyModel[333] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Du loco part01
		bodyModel[334] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Du loco part01
		bodyModel[335] = new ModelRendererTurbo(this, 209, 233, textureX, textureY); // Du loco part01
		bodyModel[336] = new ModelRendererTurbo(this, 1, 218, textureX, textureY); // Du loco part05
		bodyModel[337] = new ModelRendererTurbo(this, 1, 218, textureX, textureY); // Du loco part05
		bodyModel[338] = new ModelRendererTurbo(this, 6, 218, textureX, textureY); // Du loco part05
		bodyModel[339] = new ModelRendererTurbo(this, 6, 218, textureX, textureY); // Du loco part05
		bodyModel[340] = new ModelRendererTurbo(this, 1, 189, textureX, textureY); // Du loco part19
		bodyModel[341] = new ModelRendererTurbo(this, 122, 189, textureX, textureY); // Du loco part19
		bodyModel[342] = new ModelRendererTurbo(this, 234, 230, textureX, textureY); // Du loco part05
		bodyModel[343] = new ModelRendererTurbo(this, 249, 230, textureX, textureY); // Du loco part05
		bodyModel[344] = new ModelRendererTurbo(this, 269, 230, textureX, textureY); // Du loco part05
		bodyModel[345] = new ModelRendererTurbo(this, 264, 230, textureX, textureY); // Du loco part05
		bodyModel[346] = new ModelRendererTurbo(this, 249, 238, textureX, textureY); // Du loco part05
		bodyModel[347] = new ModelRendererTurbo(this, 264, 238, textureX, textureY); // Du loco part05
		bodyModel[348] = new ModelRendererTurbo(this, 284, 238, textureX, textureY); // Du loco part05
		bodyModel[349] = new ModelRendererTurbo(this, 279, 238, textureX, textureY); // Du loco part05
		bodyModel[350] = new ModelRendererTurbo(this, 356, 239, textureX, textureY); // Box 136
		bodyModel[351] = new ModelRendererTurbo(this, 358, 241, textureX, textureY); // Box 136
		bodyModel[352] = new ModelRendererTurbo(this, 364, 247, textureX, textureY); // Box 136
		bodyModel[353] = new ModelRendererTurbo(this, 356, 261, textureX, textureY); // Box 136
		bodyModel[354] = new ModelRendererTurbo(this, 358, 263, textureX, textureY); // Box 136
		bodyModel[355] = new ModelRendererTurbo(this, 364, 269, textureX, textureY); // Box 136
		bodyModel[356] = new ModelRendererTurbo(this, 244, 248, textureX, textureY); // Du loco part05
		bodyModel[357] = new ModelRendererTurbo(this, 259, 248, textureX, textureY); // Du loco part05
		bodyModel[358] = new ModelRendererTurbo(this, 279, 248, textureX, textureY); // Du loco part05
		bodyModel[359] = new ModelRendererTurbo(this, 274, 248, textureX, textureY); // Du loco part05
		bodyModel[360] = new ModelRendererTurbo(this, 244, 256, textureX, textureY); // Du loco part05
		bodyModel[361] = new ModelRendererTurbo(this, 259, 256, textureX, textureY); // Du loco part05
		bodyModel[362] = new ModelRendererTurbo(this, 279, 256, textureX, textureY); // Du loco part05
		bodyModel[363] = new ModelRendererTurbo(this, 274, 256, textureX, textureY); // Du loco part05
		bodyModel[364] = new ModelRendererTurbo(this, 88, 105, textureX, textureY); // Du loco part19
		bodyModel[365] = new ModelRendererTurbo(this, 418, 1, textureX, textureY); // Du loco part28
		bodyModel[366] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Du loco part28
		bodyModel[367] = new ModelRendererTurbo(this, 418, 5, textureX, textureY); // Du loco part28
		bodyModel[368] = new ModelRendererTurbo(this, 425, 5, textureX, textureY); // Du loco part28
		bodyModel[369] = new ModelRendererTurbo(this, 294, 238, textureX, textureY); // Du loco part28
		bodyModel[370] = new ModelRendererTurbo(this, 289, 238, textureX, textureY); // Du loco part05
		bodyModel[371] = new ModelRendererTurbo(this, 288, 235, textureX, textureY); // Du loco part05
		bodyModel[372] = new ModelRendererTurbo(this, 288, 232, textureX, textureY); // Du loco part05
		bodyModel[373] = new ModelRendererTurbo(this, 294, 254, textureX, textureY); // Du loco part28
		bodyModel[374] = new ModelRendererTurbo(this, 289, 254, textureX, textureY); // Du loco part05
		bodyModel[375] = new ModelRendererTurbo(this, 288, 251, textureX, textureY); // Du loco part05
		bodyModel[376] = new ModelRendererTurbo(this, 288, 248, textureX, textureY); // Du loco part05
		bodyModel[377] = new ModelRendererTurbo(this, 282, 247, textureX, textureY); // Du loco part20
		bodyModel[378] = new ModelRendererTurbo(this, 282, 284, textureX, textureY); // Box 136
		bodyModel[379] = new ModelRendererTurbo(this, 284, 286, textureX, textureY); // Box 136
		bodyModel[380] = new ModelRendererTurbo(this, 290, 292, textureX, textureY); // Box 136
		bodyModel[381] = new ModelRendererTurbo(this, 305, 240, textureX, textureY); // Du loco part05
		bodyModel[382] = new ModelRendererTurbo(this, 310, 241, textureX, textureY); // Du loco part05
		bodyModel[383] = new ModelRendererTurbo(this, 310, 244, textureX, textureY); // Du loco part05
		bodyModel[384] = new ModelRendererTurbo(this, 305, 240, textureX, textureY); // Du loco part05
		bodyModel[385] = new ModelRendererTurbo(this, 310, 241, textureX, textureY); // Du loco part05
		bodyModel[386] = new ModelRendererTurbo(this, 310, 244, textureX, textureY); // Du loco part05
		bodyModel[387] = new ModelRendererTurbo(this, 305, 240, textureX, textureY); // Du loco part05
		bodyModel[388] = new ModelRendererTurbo(this, 310, 241, textureX, textureY); // Du loco part05
		bodyModel[389] = new ModelRendererTurbo(this, 310, 244, textureX, textureY); // Du loco part05
		bodyModel[390] = new ModelRendererTurbo(this, 305, 240, textureX, textureY); // Du loco part05
		bodyModel[391] = new ModelRendererTurbo(this, 310, 241, textureX, textureY); // Du loco part05
		bodyModel[392] = new ModelRendererTurbo(this, 310, 244, textureX, textureY); // Du loco part05
		bodyModel[393] = new ModelRendererTurbo(this, 244, 264, textureX, textureY); // Du loco part05
		bodyModel[394] = new ModelRendererTurbo(this, 259, 264, textureX, textureY); // Du loco part05
		bodyModel[395] = new ModelRendererTurbo(this, 274, 265, textureX, textureY); // Du loco part05
		bodyModel[396] = new ModelRendererTurbo(this, 274, 265, textureX, textureY); // Du loco part05
		bodyModel[397] = new ModelRendererTurbo(this, 244, 272, textureX, textureY); // Du loco part05
		bodyModel[398] = new ModelRendererTurbo(this, 259, 272, textureX, textureY); // Du loco part05
		bodyModel[399] = new ModelRendererTurbo(this, 274, 273, textureX, textureY); // Du loco part05
		bodyModel[400] = new ModelRendererTurbo(this, 274, 273, textureX, textureY); // Du loco part05

		bodyModel[0].addBox(0F, 0F, 0F, 95, 1, 20, 0F); // Du loco part03
		bodyModel[0].setRotationPoint(10F, -8F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 95, 18, 1, 0F); // Du loco part07
		bodyModel[1].setRotationPoint(10F, -24F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 109, 1, 4, 0F); // Du loco part08
		bodyModel[2].setRotationPoint(3F, -28F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[3].setRotationPoint(-14F, -7F, 6.05F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[4].setRotationPoint(-5F, -24F, -3F);

		bodyModel[5].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Du loco part20
		bodyModel[5].setRotationPoint(94F, -24F, -10F);

		bodyModel[6].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Du loco part56
		bodyModel[6].setRotationPoint(-9F, -5F, -3F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,0F, 0F, -1F, -3F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[7].setRotationPoint(3F, -15F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[8].setRotationPoint(8F, -9F, -7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[9].setRotationPoint(8F, -9F, -7F);
		bodyModel[9].rotateAngleY = -1.57079633F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[10].setRotationPoint(8F, -9F, -4F);
		bodyModel[10].rotateAngleY = -1.57079633F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[11].setRotationPoint(8F, -12F, -7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[12].setRotationPoint(8F, -12F, -4F);
		bodyModel[12].rotateAngleY = -1.57079633F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[13].setRotationPoint(8F, -12F, -7F);
		bodyModel[13].rotateAngleY = -1.57079633F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[14].setRotationPoint(11F, -16F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[15].setRotationPoint(11F, -16F, -8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[16].setRotationPoint(11F, -16F, -5F);

		bodyModel[17].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, -0.25F, 0F, -4.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -4F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F); // part
		bodyModel[17].setRotationPoint(-3F, -10F, 5F);

		bodyModel[18].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, 0F, -0.75F, -4F, 0F, -0.75F, -1.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -4.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // part
		bodyModel[18].setRotationPoint(-3F, -11F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 95, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
		bodyModel[19].setRotationPoint(10F, -26F, 9F);

		bodyModel[20].addShapeBox(0F, 0F, 1F, 3, 18, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 168
		bodyModel[20].setRotationPoint(-5F, -24F, 2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[21].setRotationPoint(11F, -12F, -8F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[22].setRotationPoint(10F, -11F, -5F);
		bodyModel[22].rotateAngleY = -1.57079633F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[23].setRotationPoint(9F, -11F, -5F);
		bodyModel[23].rotateAngleY = -1.57079633F;

		bodyModel[24].addBox(0F, 0F, 0F, 95, 18, 1, 0F); // Box 135
		bodyModel[24].setRotationPoint(10F, -24F, 10F);

		bodyModel[25].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Box 136
		bodyModel[25].setRotationPoint(21F, -24F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[26].setRotationPoint(-9F, -4F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[27].setRotationPoint(-9F, -6F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, -1F, 0F, -7.875F, -1F, 0F, 0F, 0F, 0F, -7.875F, 0F, 0F, 0F, 1F, 0F, -7.875F, 1F, 0F, 0F, -1F, 0F, -7.875F, -1F, 0F); // Du loco part42
		bodyModel[28].setRotationPoint(-3F, -6F, 3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 146
		bodyModel[29].setRotationPoint(53.5F, -26F, -11F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 8, 2, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[30].setRotationPoint(53.5F, -26F, 9F);

		bodyModel[31].addShapeBox(0F, 0F, 1F, 5, 18, 3, 0F,-1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 168
		bodyModel[31].setRotationPoint(-2F, -24F, 6F);

		bodyModel[32].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part Ligjhtpart18
		bodyModel[32].setRotationPoint(-4F, -10.75F, 5.25F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 95, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[33].setRotationPoint(10F, -27F, 6F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 109, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[34].setRotationPoint(3F, -28F, 2F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[35].setRotationPoint(-14F, -7F, -6.05F);

		bodyModel[36].addShapeBox(0F, 0F, 1F, 7, 18, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 168
		bodyModel[36].setRotationPoint(3F, -24F, 9F);

		bodyModel[37].addShapeBox(0F, 0F, 1F, 3, 2, 14, 0F,-2F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 167
		bodyModel[37].setRotationPoint(-5F, -26F, -8F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 109, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part71
		bodyModel[38].setRotationPoint(3F, -28F, -6F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 95, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part71
		bodyModel[39].setRotationPoint(10F, -27F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 95, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part71
		bodyModel[40].setRotationPoint(10F, -26F, -11F);

		bodyModel[41].addShapeBox(0F, 0F, 1F, 5, 2, 5, 0F,0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 2F); // Box 167
		bodyModel[41].setRotationPoint(-2F, -26F, -11F);

		bodyModel[42].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F); // Box 167
		bodyModel[42].setRotationPoint(3F, -26F, -12F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[43].setRotationPoint(12F, -18F, 11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[44].setRotationPoint(20F, -18F, 11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[45].setRotationPoint(12F, -18F, -12F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[46].setRotationPoint(20F, -18F, -12F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[47].setRotationPoint(94F, -18F, 11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[48].setRotationPoint(102F, -18F, 11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[49].setRotationPoint(94F, -18F, -12F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[50].setRotationPoint(102F, -18F, -12F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[51].setRotationPoint(57F, -7F, -6.05F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[52].setRotationPoint(57F, -7F, 6.05F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 7, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part82
		bodyModel[53].setRotationPoint(107F, -15F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[54].setRotationPoint(103F, -9F, 5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[55].setRotationPoint(103F, -9F, 5F);
		bodyModel[55].rotateAngleY = -1.57079633F;

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[56].setRotationPoint(103F, -9F, 8F);
		bodyModel[56].rotateAngleY = -1.57079633F;

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[57].setRotationPoint(104F, -12F, 5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[58].setRotationPoint(104F, -12F, 8F);
		bodyModel[58].rotateAngleY = -1.57079633F;

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[59].setRotationPoint(104F, -12F, 5F);
		bodyModel[59].rotateAngleY = -1.57079633F;

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[60].setRotationPoint(103F, -16F, 5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[61].setRotationPoint(103F, -16F, 4F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[62].setRotationPoint(103F, -16F, 7F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[63].setRotationPoint(103F, -12F, 4F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[64].setRotationPoint(105F, -11F, 7F);
		bodyModel[64].rotateAngleY = -1.57079633F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[65].setRotationPoint(104F, -11F, 7F);
		bodyModel[65].rotateAngleY = -1.57079633F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[66].setRotationPoint(73F, -7F, 4F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[67].setRotationPoint(77F, -5F, 4F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[68].setRotationPoint(72F, -5F, 4F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[69].setRotationPoint(73F, -5F, 4F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[70].setRotationPoint(77F, -7F, 4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[71].setRotationPoint(72F, -7F, 4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[72].setRotationPoint(72F, -6F, 4F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[73].setRotationPoint(77F, -6F, 4F);

		bodyModel[74].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[74].setRotationPoint(73F, -6F, 4F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, -1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F, -1F, 0F, 0F, -3.875F, 0F, 0F); // Du loco part42
		bodyModel[75].setRotationPoint(-5F, -7F, 3F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,0F, -2F, 0F, -5.875F, -2F, 0F, -4.875F, -0.5F, -4F, -1F, -0.5F, -4F, -1F, 1F, 0F, -4.875F, 1F, 0F, -1F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part42
		bodyModel[76].setRotationPoint(-6F, -9F, 3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,-2F, -1F, 0F, -4.875F, -1F, 0F, -1F, 0F, 0F, -5.875F, 0F, 0F, 0F, 1F, 0F, -6.875F, 1F, 0F, -3.875F, 0F, -1F, -3F, 0F, -1F); // Du loco part42
		bodyModel[77].setRotationPoint(-7F, -4F, 3F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[78].setRotationPoint(120F, -15F, -3F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[79].setRotationPoint(14F, -16F, 10F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[80].setRotationPoint(14F, -22F, 10F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[81].setRotationPoint(14F, -22F, 10F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[82].setRotationPoint(15F, -22F, 10F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[83].setRotationPoint(23F, -16F, 10F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[84].setRotationPoint(23F, -22F, 10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[85].setRotationPoint(23F, -22F, 10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[86].setRotationPoint(31F, -22F, 10F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[87].setRotationPoint(96F, -16F, 10F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[88].setRotationPoint(96F, -22F, 10F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[89].setRotationPoint(96F, -22F, 10F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[90].setRotationPoint(97F, -22F, 10F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[91].setRotationPoint(-5F, -17F, -2.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[92].setRotationPoint(-5F, -22F, -2.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[93].setRotationPoint(-5F, -22F, 1.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[94].setRotationPoint(-5F, -22F, -2.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,-2F, 0F, -1F, -6.875F, 0F, -1F, -2F, 0F, 0F, -6.875F, 0F, 0F, -1F, 1F, 0F, -7.875F, 1F, 0F, 0F, 0F, 0F, -8.875F, 0F, 0F); // Du loco part42
		bodyModel[95].setRotationPoint(-4F, -7F, 3F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,-1F, 0F, 0F, -7.875F, 0F, 0F, 0F, 2F, 0F, -8.875F, 2F, 0F, -2F, 1F, -1F, -6.875F, 1F, -1F, -5F, 0F, -2F, -3.875F, 0F, -2F); // Du loco part42
		bodyModel[96].setRotationPoint(-4F, -3F, 3F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[97].setRotationPoint(83.5F, -4.5F, -6F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[98].setRotationPoint(12.5F, -4.5F, -6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[99].setRotationPoint(3F, -7F, 6.05F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[100].setRotationPoint(3F, -7F, -6.05F);

		bodyModel[101].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[101].setRotationPoint(29.5F, -4.5F, -6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[102].setRotationPoint(74F, -7F, -6.05F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[103].setRotationPoint(74F, -7F, 6.05F);

		bodyModel[104].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[104].setRotationPoint(100.5F, -4.5F, -6F);

		bodyModel[105].addShapeBox(0F, 0F, 1F, 3, 18, 4, 0F,-3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[105].setRotationPoint(-5F, -24F, -8F);

		bodyModel[106].addShapeBox(0F, 0F, 1F, 5, 18, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F); // Box 168
		bodyModel[106].setRotationPoint(-2F, -24F, -11F);

		bodyModel[107].addShapeBox(0F, 0F, 1F, 7, 18, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 168
		bodyModel[107].setRotationPoint(3F, -24F, -12F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[108].setRotationPoint(119F, -24F, -3F);

		bodyModel[109].addShapeBox(0F, 0F, 1F, 3, 18, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[109].setRotationPoint(117F, -24F, 2F);

		bodyModel[110].addShapeBox(0F, 0F, 1F, 5, 18, 3, 0F,0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 168
		bodyModel[110].setRotationPoint(112F, -24F, 6F);

		bodyModel[111].addShapeBox(0F, 0F, 1F, 7, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 168
		bodyModel[111].setRotationPoint(105F, -24F, 9F);

		bodyModel[112].addShapeBox(0F, 0F, 1F, 3, 18, 4, 0F,1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 168
		bodyModel[112].setRotationPoint(117F, -24F, -8F);

		bodyModel[113].addShapeBox(0F, 0F, 1F, 5, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -2F); // Box 168
		bodyModel[113].setRotationPoint(112F, -24F, -11F);

		bodyModel[114].addShapeBox(0F, 0F, 1F, 7, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 168
		bodyModel[114].setRotationPoint(105F, -24F, -12F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part03
		bodyModel[115].setRotationPoint(3F, -8F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part03
		bodyModel[116].setRotationPoint(-1F, -8F, -9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Du loco part03
		bodyModel[117].setRotationPoint(-4F, -8F, -7F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part03
		bodyModel[118].setRotationPoint(105F, -8F, -10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part03
		bodyModel[119].setRotationPoint(112F, -8F, -9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Du loco part03
		bodyModel[120].setRotationPoint(116F, -8F, -7F);

		bodyModel[121].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // part
		bodyModel[121].setRotationPoint(-3F, -10.75F, 5F);

		bodyModel[122].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Lamp
		bodyModel[122].setRotationPoint(-4F, -10F, 6F);

		bodyModel[123].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Lamp
		bodyModel[123].setRotationPoint(-4F, -11F, 6F);

		bodyModel[124].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[124].setRotationPoint(-4F, -10.75F, 6F);

		bodyModel[125].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -4.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -1.75F, 0F, -0.75F, -4F, 0F, -0.75F, 0F, 0F, -0.75F); // part
		bodyModel[125].setRotationPoint(-3F, -10F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, 0F, -0.75F, -1F, 0F, -0.75F, -4F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -4.5F, -0.25F, 0F, 0F, -0.25F, 0F); // part
		bodyModel[126].setRotationPoint(-3F, -11F, -10F);

		bodyModel[127].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part Ligjhtpart18
		bodyModel[127].setRotationPoint(-4F, -10.75F, -7.75F);

		bodyModel[128].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F); // part
		bodyModel[128].setRotationPoint(-3F, -10.75F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Lamp
		bodyModel[129].setRotationPoint(-4F, -10F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Lamp
		bodyModel[130].setRotationPoint(-4F, -11F, -10F);

		bodyModel[131].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[131].setRotationPoint(-4F, -10.75F, -10F);

		bodyModel[132].addShapeBox(0F, 0F, 1F, 5, 2, 5, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 167
		bodyModel[132].setRotationPoint(-2F, -26F, 4F);

		bodyModel[133].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 167
		bodyModel[133].setRotationPoint(3F, -26F, 7F);

		bodyModel[134].addShapeBox(0F, 0F, 1F, 1, 1, 10, 0F,-1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 167
		bodyModel[134].setRotationPoint(-3F, -27F, -6F);

		bodyModel[135].addShapeBox(0F, 0F, 1F, 5, 1, 12, 0F,-5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 167
		bodyModel[135].setRotationPoint(-2F, -28F, -7F);

		bodyModel[136].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 167
		bodyModel[136].setRotationPoint(3F, -27F, 5F);

		bodyModel[137].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 167
		bodyModel[137].setRotationPoint(3F, -27F, -10F);

		bodyModel[138].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // part
		bodyModel[138].setRotationPoint(-5F, -25.5F, -2F);

		bodyModel[139].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // part
		bodyModel[139].setRotationPoint(-5F, -26.5F, -2F);

		bodyModel[140].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // part
		bodyModel[140].setRotationPoint(-5F, -26.25F, -2F);

		bodyModel[141].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Lamp
		bodyModel[141].setRotationPoint(-6F, -25.5F, -2F);

		bodyModel[142].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Lamp
		bodyModel[142].setRotationPoint(-6F, -26.5F, -2F);

		bodyModel[143].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[143].setRotationPoint(-6F, -26.25F, -2F);

		bodyModel[144].addShapeBox(0F, 0F, 1F, 3, 2, 14, 0F,0F, 0F, -2F, -2F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 167
		bodyModel[144].setRotationPoint(117F, -26F, -8F);

		bodyModel[145].addShapeBox(0F, 0F, 1F, 5, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -2F, 2F, 0F, -2F, -1F); // Box 167
		bodyModel[145].setRotationPoint(112F, -26F, -11F);

		bodyModel[146].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 167
		bodyModel[146].setRotationPoint(105F, -26F, -12F);

		bodyModel[147].addShapeBox(0F, 0F, 1F, 5, 2, 5, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 2F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 167
		bodyModel[147].setRotationPoint(112F, -26F, 4F);

		bodyModel[148].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 167
		bodyModel[148].setRotationPoint(105F, -26F, 7F);

		bodyModel[149].addShapeBox(0F, 0F, 1F, 1, 1, 10, 0F,0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 167
		bodyModel[149].setRotationPoint(117F, -27F, -6F);

		bodyModel[150].addShapeBox(0F, 0F, 1F, 5, 1, 12, 0F,0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 167
		bodyModel[150].setRotationPoint(112F, -28F, -7F);

		bodyModel[151].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 167
		bodyModel[151].setRotationPoint(105F, -27F, 5F);

		bodyModel[152].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 167
		bodyModel[152].setRotationPoint(105F, -27F, -10F);

		bodyModel[153].addShapeBox(0F, 0F, 1F, 5, 1, 16, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 167
		bodyModel[153].setRotationPoint(112F, -27F, -9F);

		bodyModel[154].addShapeBox(0F, 0F, 1F, 5, 1, 16, 0F,0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 167
		bodyModel[154].setRotationPoint(-2F, -27F, -9F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[155].setRotationPoint(17F, -16F, 10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[156].setRotationPoint(17F, -22F, 10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[157].setRotationPoint(17F, -22F, 10F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[158].setRotationPoint(18F, -22F, 10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[159].setRotationPoint(35F, -16F, 10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[160].setRotationPoint(35F, -22F, 10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[161].setRotationPoint(35F, -22F, 10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[162].setRotationPoint(43F, -22F, 10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[163].setRotationPoint(47F, -16F, 10F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[164].setRotationPoint(47F, -22F, 10F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[165].setRotationPoint(47F, -22F, 10F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[166].setRotationPoint(55F, -22F, 10F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[167].setRotationPoint(59F, -16F, 10F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[168].setRotationPoint(59F, -22F, 10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[169].setRotationPoint(59F, -22F, 10F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[170].setRotationPoint(67F, -22F, 10F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[171].setRotationPoint(71F, -16F, 10F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[172].setRotationPoint(71F, -22F, 10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[173].setRotationPoint(71F, -22F, 10F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[174].setRotationPoint(79F, -22F, 10F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[175].setRotationPoint(83F, -16F, 10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[176].setRotationPoint(83F, -22F, 10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[177].setRotationPoint(83F, -22F, 10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[178].setRotationPoint(91F, -22F, 10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[179].setRotationPoint(99F, -16F, 10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[180].setRotationPoint(99F, -22F, 10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[181].setRotationPoint(99F, -22F, 10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[182].setRotationPoint(100F, -22F, 10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F); // Du loco part05
		bodyModel[183].setRotationPoint(5F, -22F, 10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[184].setRotationPoint(5F, -22F, 9.25F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[185].setRotationPoint(9F, -22F, 10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Du loco part05
		bodyModel[186].setRotationPoint(5F, -17F, 10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, -0.75F, 0F, 0F, -0.75F, -2F, 0F, -0.75F, 0F, 0F, -0.75F, -3F); // Du loco part05
		bodyModel[187].setRotationPoint(-2F, -22F, 7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[188].setRotationPoint(2F, -22F, 9F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Du loco part05
		bodyModel[189].setRotationPoint(-2F, -22F, 7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,-1F, -0.75F, 0F, 0F, -0.75F, -2F, 0F, -0.75F, 0F, 0F, -0.75F, -3F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F); // Du loco part05
		bodyModel[190].setRotationPoint(-2F, -17F, 7F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.1F, 0F, -0.25F, -2.8F, 0F, -0.25F, 0F, 0F, 0F, -3F, 0F, 0F, -0.1F, -0.75F, -0.25F, -2.8F, -0.75F, -0.25F, 0F, -0.75F, 0F, -3F, -0.75F, 0F); // Du loco part05
		bodyModel[191].setRotationPoint(-5F, -22F, 3F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.15F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.15F, -0.25F, -0.75F); // Du loco part05
		bodyModel[192].setRotationPoint(-4.85F, -22F, 3.25F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.1F, -0.75F, -0.25F, -2.8F, -0.75F, -0.25F, 0F, -0.75F, 0F, -3F, -0.75F, 0F, -0.1F, 0F, -0.25F, -2.8F, 0F, -0.25F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part05
		bodyModel[193].setRotationPoint(-5F, -17F, 3F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.75F); // Du loco part05
		bodyModel[194].setRotationPoint(5F, -22F, -11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[195].setRotationPoint(5F, -22F, -10.25F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[196].setRotationPoint(9F, -22F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F); // Du loco part05
		bodyModel[197].setRotationPoint(5F, -17F, -11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, -0.75F, -3F, 0F, -0.75F, 0F, 0F, -0.75F, -2F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[198].setRotationPoint(-2F, -22F, -10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[199].setRotationPoint(2F, -22F, -10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[200].setRotationPoint(-2F, -22F, -7.75F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.75F, -3F, 0F, -0.75F, 0F, 0F, -0.75F, -2F, -1F, -0.75F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F); // Du loco part05
		bodyModel[201].setRotationPoint(-2F, -17F, -10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-3F, 0F, 0F, 0F, 0F, 0F, -2.8F, 0F, -0.25F, -0.1F, 0F, -0.25F, -3F, -0.75F, 0F, 0F, -0.75F, 0F, -2.8F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F); // Du loco part05
		bodyModel[202].setRotationPoint(-5F, -22F, -7F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.15F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.1F, -0.25F, 0F, 0F, -0.25F, 0F, -0.15F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.1F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[203].setRotationPoint(-4.85F, -22F, -4.25F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-3F, -0.75F, 0F, 0F, -0.75F, 0F, -2.8F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F, -2.8F, 0F, -0.25F, -0.1F, 0F, -0.25F); // Du loco part05
		bodyModel[204].setRotationPoint(-5F, -17F, -7F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[205].setRotationPoint(14F, -16F, -11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[206].setRotationPoint(14F, -22F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[207].setRotationPoint(14F, -22F, -11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[208].setRotationPoint(15F, -22F, -11F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[209].setRotationPoint(23F, -16F, -11F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[210].setRotationPoint(23F, -22F, -11F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[211].setRotationPoint(23F, -22F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[212].setRotationPoint(31F, -22F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[213].setRotationPoint(96F, -16F, -11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[214].setRotationPoint(96F, -22F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[215].setRotationPoint(96F, -22F, -11F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[216].setRotationPoint(97F, -22F, -11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[217].setRotationPoint(17F, -16F, -11F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[218].setRotationPoint(17F, -22F, -11F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[219].setRotationPoint(17F, -22F, -11F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[220].setRotationPoint(18F, -22F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[221].setRotationPoint(35F, -16F, -11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[222].setRotationPoint(35F, -22F, -11F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[223].setRotationPoint(35F, -22F, -11F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[224].setRotationPoint(43F, -22F, -11F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[225].setRotationPoint(47F, -16F, -11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[226].setRotationPoint(47F, -22F, -11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[227].setRotationPoint(47F, -22F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[228].setRotationPoint(55F, -22F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[229].setRotationPoint(59F, -16F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[230].setRotationPoint(59F, -22F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[231].setRotationPoint(59F, -22F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[232].setRotationPoint(67F, -22F, -11F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[233].setRotationPoint(71F, -16F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[234].setRotationPoint(71F, -22F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[235].setRotationPoint(71F, -22F, -11F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[236].setRotationPoint(79F, -22F, -11F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[237].setRotationPoint(83F, -16F, -11F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[238].setRotationPoint(83F, -22F, -11F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[239].setRotationPoint(83F, -22F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[240].setRotationPoint(91F, -22F, -11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[241].setRotationPoint(99F, -16F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[242].setRotationPoint(99F, -22F, -11F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[243].setRotationPoint(99F, -22F, -11F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[244].setRotationPoint(100F, -22F, -11F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[245].setRotationPoint(119F, -17F, -2.5F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[246].setRotationPoint(119F, -22F, -2.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[247].setRotationPoint(119F, -22F, 1.5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[248].setRotationPoint(119F, -22F, -2.5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[249].setRotationPoint(105F, -22F, 10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[250].setRotationPoint(109F, -22F, 9.25F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[251].setRotationPoint(105F, -22F, 10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Du loco part05
		bodyModel[252].setRotationPoint(105F, -17F, 10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -0.75F, -2F, -1F, -0.75F, 0F, 0F, -0.75F, -3F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[253].setRotationPoint(112F, -22F, 7F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[254].setRotationPoint(112F, -22F, 9F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[255].setRotationPoint(116F, -22F, 7F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.75F, -2F, -1F, -0.75F, 0F, 0F, -0.75F, -3F, 0F, -0.75F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Du loco part05
		bodyModel[256].setRotationPoint(112F, -17F, 7F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-2.8F, 0F, -0.25F, -0.1F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F, -2.8F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -3F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[257].setRotationPoint(116F, -22F, 3F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.1F, -0.25F, 0F, 0F, -0.25F, 0F, -0.15F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.1F, -0.25F, 0F, 0F, -0.25F, 0F, -0.15F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F); // Du loco part05
		bodyModel[258].setRotationPoint(118.85F, -22F, 3.25F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-2.8F, -0.75F, -0.25F, -0.1F, -0.75F, -0.25F, -3F, -0.75F, 0F, 0F, -0.75F, 0F, -2.8F, 0F, -0.25F, -0.1F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[259].setRotationPoint(116F, -17F, 3F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[260].setRotationPoint(105F, -22F, -11F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[261].setRotationPoint(105F, -22F, -11F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[262].setRotationPoint(109F, -22F, -10.25F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, -0.75F, 0F, -0.75F, 0.75F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F); // Du loco part05
		bodyModel[263].setRotationPoint(105F, -17F, -11F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, -0.75F, 0F, 0F, -0.75F, -3F, -1F, -0.75F, 0F, 0F, -0.75F, -2F); // Du loco part05
		bodyModel[264].setRotationPoint(112F, -22F, -10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[265].setRotationPoint(112F, -22F, -10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[266].setRotationPoint(116F, -22F, -7.75F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, -3F, -1F, -0.75F, 0F, 0F, -0.75F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -2F); // Du loco part05
		bodyModel[267].setRotationPoint(112F, -17F, -10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, -3F, 0F, 0F, -0.1F, 0F, -0.25F, -2.8F, 0F, -0.25F, 0F, -0.75F, 0F, -3F, -0.75F, 0F, -0.1F, -0.75F, -0.25F, -2.8F, -0.75F, -0.25F); // Du loco part05
		bodyModel[268].setRotationPoint(116F, -22F, -7F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.25F, -0.25F, -0.75F, -0.15F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.25F, -0.25F, -0.75F, -0.15F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0.1F, -0.25F, 0F); // Du loco part05
		bodyModel[269].setRotationPoint(118.85F, -22F, -4.25F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.75F, 0F, -3F, -0.75F, 0F, -0.1F, -0.75F, -0.25F, -2.8F, -0.75F, -0.25F, 0F, 0F, 0F, -3F, 0F, 0F, -0.1F, 0F, -0.25F, -2.8F, 0F, -0.25F); // Du loco part05
		bodyModel[270].setRotationPoint(116F, -17F, -7F);

		bodyModel[271].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-4.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -4F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F); // part
		bodyModel[271].setRotationPoint(113F, -10F, 5F);

		bodyModel[272].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-4F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -4.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // part
		bodyModel[272].setRotationPoint(113F, -11F, 5F);

		bodyModel[273].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part Ligjhtpart18
		bodyModel[273].setRotationPoint(118F, -10.75F, 5.25F);

		bodyModel[274].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // part
		bodyModel[274].setRotationPoint(113F, -10.75F, 5F);

		bodyModel[275].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Lamp
		bodyModel[275].setRotationPoint(118F, -10F, 6F);

		bodyModel[276].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Lamp
		bodyModel[276].setRotationPoint(118F, -11F, 6F);

		bodyModel[277].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[277].setRotationPoint(118F, -10.75F, 6F);

		bodyModel[278].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -4.5F, -0.25F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -4F, 0F, -0.75F); // part
		bodyModel[278].setRotationPoint(113F, -10F, -10F);

		bodyModel[279].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-1.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -4.25F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -4.5F, -0.25F, 0F); // part
		bodyModel[279].setRotationPoint(113F, -11F, -10F);

		bodyModel[280].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part Ligjhtpart18
		bodyModel[280].setRotationPoint(118F, -10.75F, -7.75F);

		bodyModel[281].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F); // part
		bodyModel[281].setRotationPoint(113F, -10.75F, -10F);

		bodyModel[282].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Lamp
		bodyModel[282].setRotationPoint(118F, -10F, -10F);

		bodyModel[283].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Lamp
		bodyModel[283].setRotationPoint(118F, -11F, -10F);

		bodyModel[284].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[284].setRotationPoint(118F, -10.75F, -10F);

		bodyModel[285].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // part
		bodyModel[285].setRotationPoint(118F, -25.5F, -2F);

		bodyModel[286].addShapeBox(0F, 0F, 1F, 3, 1, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // part
		bodyModel[286].setRotationPoint(117F, -26.5F, -2F);

		bodyModel[287].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // part
		bodyModel[287].setRotationPoint(118F, -26.25F, -2F);

		bodyModel[288].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Lamp
		bodyModel[288].setRotationPoint(120F, -25.5F, -2F);

		bodyModel[289].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Lamp
		bodyModel[289].setRotationPoint(120F, -26.5F, -2F);

		bodyModel[290].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[290].setRotationPoint(120F, -26.25F, -2F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, -1F, 0F, 0F, -1F, 0F, -7.875F, -1F, 0F, 0F, -1F, 0F, -7.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[291].setRotationPoint(-3F, -6F, -9F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,-6.875F, 0F, 0F, -2F, 0F, 0F, -6.875F, 0F, -1F, -2F, 0F, -1F, -8.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 1F, 0F, -1F, 1F, 0F); // Du loco part42
		bodyModel[292].setRotationPoint(-4F, -7F, -9F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,-8.875F, 2F, 0F, 0F, 2F, 0F, -7.875F, 0F, 0F, -1F, 0F, 0F, -3.875F, 0F, -2F, -5F, 0F, -2F, -6.875F, 1F, -1F, -2F, 1F, -1F); // Du loco part42
		bodyModel[293].setRotationPoint(-4F, -3F, -9F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,-7.875F, -1F, 0F, 0F, -1F, 0F, -7.875F, 0F, 0F, 0F, 0F, 0F, -7.875F, 1F, 0F, 0F, 1F, 0F, -7.875F, -1F, 0F, 0F, -1F, 0F); // Du loco part42
		bodyModel[294].setRotationPoint(110F, -6F, 3F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,-6.875F, 0F, -1F, -2F, 0F, -1F, -6.875F, 0F, 0F, -2F, 0F, 0F, -7.875F, 1F, 0F, -1F, 1F, 0F, -8.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[295].setRotationPoint(110F, -7F, 3F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,-7.875F, 0F, 0F, -1F, 0F, 0F, -8.875F, 2F, 0F, 0F, 2F, 0F, -6.875F, 1F, -1F, -2F, 1F, -1F, -3.875F, 0F, -2F, -5F, 0F, -2F); // Du loco part42
		bodyModel[296].setRotationPoint(110F, -3F, 3F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, -7.875F, 0F, 0F, 0F, -1F, 0F, -7.875F, -1F, 0F, 0F, -1F, 0F, -7.875F, -1F, 0F, 0F, 1F, 0F, -7.875F, 1F, 0F); // Du loco part42
		bodyModel[297].setRotationPoint(110F, -6F, -9F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,-2F, 0F, 0F, -6.875F, 0F, 0F, -2F, 0F, -1F, -6.875F, 0F, -1F, 0F, 0F, 0F, -8.875F, 0F, 0F, -1F, 1F, 0F, -7.875F, 1F, 0F); // Du loco part42
		bodyModel[298].setRotationPoint(110F, -7F, -9F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 9, 1, 6, 0F,0F, 2F, 0F, -8.875F, 2F, 0F, -1F, 0F, 0F, -7.875F, 0F, 0F, -5F, 0F, -2F, -3.875F, 0F, -2F, -2F, 1F, -1F, -6.875F, 1F, -1F); // Du loco part42
		bodyModel[299].setRotationPoint(110F, -3F, -9F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part56
		bodyModel[300].setRotationPoint(-7F, -5F, -2F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Du loco part56
		bodyModel[301].setRotationPoint(-4F, -7F, -2F);

		bodyModel[302].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Du loco part56
		bodyModel[302].setRotationPoint(-10F, -6F, -2F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[303].setRotationPoint(-10F, -6F, -3F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[304].setRotationPoint(-9F, -7F, -3F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-2F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1.875F, 0F, 0F, -1.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[305].setRotationPoint(-7F, -3F, -3F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,-3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[306].setRotationPoint(-5F, -7F, -11F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,-1F, -0.5F, -4F, -4.875F, -0.5F, -4F, -5.875F, -2F, 0F, 0F, -2F, 0F, -4.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 1F, 0F, -1F, 1F, 0F); // Du loco part42
		bodyModel[307].setRotationPoint(-6F, -9F, -11F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,-5.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, -1F, 0F, -2F, -1F, 0F, -3F, 0F, -1F, -3.875F, 0F, -1F, -6.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[308].setRotationPoint(-7F, -4F, -11F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part56
		bodyModel[309].setRotationPoint(-11F, -6F, -2F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part47
		bodyModel[310].setRotationPoint(-11F, -6F, -3F);

		bodyModel[311].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Du loco part56
		bodyModel[311].setRotationPoint(122F, -5F, -3F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[312].setRotationPoint(122F, -4F, -3F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[313].setRotationPoint(122F, -6F, -3F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F, -3.875F, 0F, 0F, -1F, 0F, 0F); // Du loco part42
		bodyModel[314].setRotationPoint(115F, -7F, 3F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,-5.875F, -2F, 0F, 0F, -2F, 0F, -1F, -0.5F, -4F, -4.875F, -0.5F, -4F, -4.875F, 1F, 0F, -1F, 1F, 0F, -4.875F, 0F, 0F, -1F, 0F, 0F); // Du loco part42
		bodyModel[315].setRotationPoint(115F, -9F, 3F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,-4.875F, -1F, 0F, -2F, -1F, 0F, -5.875F, 0F, 0F, -1F, 0F, 0F, -6.875F, 1F, 0F, 0F, 1F, 0F, -3F, 0F, -1F, -3.875F, 0F, -1F); // Du loco part42
		bodyModel[316].setRotationPoint(115F, -4F, 3F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part56
		bodyModel[317].setRotationPoint(117F, -5F, -2F);

		bodyModel[318].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Du loco part56
		bodyModel[318].setRotationPoint(117F, -7F, -2F);

		bodyModel[319].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Du loco part56
		bodyModel[319].setRotationPoint(124F, -6F, 0F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[320].setRotationPoint(122F, -7F, -3F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0.125F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.125F, 0F, 0F, -1.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.875F, 0F, 0F); // Du loco part42
		bodyModel[321].setRotationPoint(120F, -3F, -3F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,-1F, 0F, 0F, -3.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, -1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[322].setRotationPoint(115F, -7F, -11F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 6, 2, 8, 0F,-4.875F, -0.5F, -4F, -1F, -0.5F, -4F, 0F, -2F, 0F, -5.875F, -2F, 0F, -1F, 0F, 0F, -4.875F, 0F, 0F, -1F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[323].setRotationPoint(115F, -9F, -11F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,-1F, 0F, 0F, -5.875F, 0F, 0F, -2F, -1F, 0F, -4.875F, -1F, 0F, -3.875F, 0F, -1F, -3F, 0F, -1F, 0F, 1F, 0F, -6.875F, 1F, 0F); // Du loco part42
		bodyModel[324].setRotationPoint(115F, -4F, -11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part56
		bodyModel[325].setRotationPoint(125F, -6F, 0F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F); // Du loco part47
		bodyModel[326].setRotationPoint(125F, -6F, 2F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part47
		bodyModel[327].setRotationPoint(124F, -6F, 2F);

		bodyModel[328].addBox(0F, 0F, 0F, 19, 1, 12, 0F); // Du loco part01
		bodyModel[328].setRotationPoint(12F, -4F, -6F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 19, 2, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[329].setRotationPoint(12F, -6F, -6F);

		bodyModel[330].addBox(0F, 0F, 0F, 7, 1, 12, 0F); // Du loco part01
		bodyModel[330].setRotationPoint(18F, -7F, -6F);

		bodyModel[331].addBox(0F, 0F, 0F, 19, 1, 12, 0F); // Du loco part01
		bodyModel[331].setRotationPoint(83F, -4F, -6F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 19, 2, 12, 0F,-6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[332].setRotationPoint(83F, -6F, -6F);

		bodyModel[333].addBox(0F, 0F, 0F, 7, 1, 12, 0F); // Du loco part01
		bodyModel[333].setRotationPoint(89F, -7F, -6F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 19, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F); // Du loco part01
		bodyModel[334].setRotationPoint(50F, -7F, -6F);

		bodyModel[335].addBox(0F, 0F, 0F, 5, 3, 12, 0F); // Du loco part01
		bodyModel[335].setRotationPoint(41F, -7F, -6F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F); // Du loco part05
		bodyModel[336].setRotationPoint(-5F, -22F, 2.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[337].setRotationPoint(-5F, -22F, -3.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[338].setRotationPoint(119F, -22F, 2.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[339].setRotationPoint(119F, -22F, -3.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 0, 30, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -54F, 0F, 0F, -54F, 0F, -27F, 0F, 0F, -27F, 0F, 0F, -27F, -54F, 0F, -27F, -54F); // Du loco part19
		bodyModel[340].setRotationPoint(-5.55F, -13F, -3F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 0, 30, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -54F, 0F, 0F, -54F, 0F, -27F, 0F, 0F, -27F, 0F, 0F, -27F, -54F, 0F, -27F, -54F); // Du loco part19
		bodyModel[341].setRotationPoint(120.55F, -13F, -3F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[342].setRotationPoint(21F, -18F, 3F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[343].setRotationPoint(21F, -22F, 3F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[344].setRotationPoint(21F, -22F, 8F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[345].setRotationPoint(21F, -22F, 3F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[346].setRotationPoint(21F, -18F, -9F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[347].setRotationPoint(21F, -22F, -9F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[348].setRotationPoint(21F, -22F, -4F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[349].setRotationPoint(21F, -22F, -9F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[350].setRotationPoint(21F, -25F, -10F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[351].setRotationPoint(21F, -26F, -9F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[352].setRotationPoint(21F, -27F, -6F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[353].setRotationPoint(93F, -25F, -10F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[354].setRotationPoint(93F, -26F, -9F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[355].setRotationPoint(93F, -27F, -6F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[356].setRotationPoint(93F, -18F, 3F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[357].setRotationPoint(93F, -22F, 3F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[358].setRotationPoint(93F, -22F, 8F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[359].setRotationPoint(93F, -22F, 3F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[360].setRotationPoint(93F, -18F, -9F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[361].setRotationPoint(93F, -22F, -9F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[362].setRotationPoint(93F, -22F, -4F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[363].setRotationPoint(93F, -22F, -9F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part19
		bodyModel[364].setRotationPoint(-6F, -15F, -3F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[365].setRotationPoint(11F, -21F, -12F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[366].setRotationPoint(102F, -21F, -12F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[367].setRotationPoint(11F, -21F, 11F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[368].setRotationPoint(102F, -21F, 11F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[369].setRotationPoint(81F, -18F, -12F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[370].setRotationPoint(75F, -22F, -11F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[371].setRotationPoint(71F, -16F, -11F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[372].setRotationPoint(71F, -22F, -11F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[373].setRotationPoint(81F, -18F, 11F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[374].setRotationPoint(75F, -22F, 10F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[375].setRotationPoint(71F, -16F, 10F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[376].setRotationPoint(71F, -22F, 10F);

		bodyModel[377].addBox(0F, 0F, 0F, 1, 16, 20, 0F); // Du loco part20
		bodyModel[377].setRotationPoint(78F, -24F, -10F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[378].setRotationPoint(78F, -25F, -10F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[379].setRotationPoint(78F, -26F, -9F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[380].setRotationPoint(78F, -27F, -6F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[381].setRotationPoint(51F, -22F, -11F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[382].setRotationPoint(51F, -16F, -11F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[383].setRotationPoint(51F, -22F, -11F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[384].setRotationPoint(51F, -22F, 10F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[385].setRotationPoint(51F, -16F, 10F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[386].setRotationPoint(51F, -22F, 10F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[387].setRotationPoint(19F, -22F, -11F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[388].setRotationPoint(17F, -16F, -11F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[389].setRotationPoint(17F, -22F, -11F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[390].setRotationPoint(19F, -22F, 10F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[391].setRotationPoint(17F, -16F, 10F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[392].setRotationPoint(17F, -22F, 10F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[393].setRotationPoint(78F, -18F, 3F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[394].setRotationPoint(78F, -22F, 3F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[395].setRotationPoint(78F, -22F, 8F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[396].setRotationPoint(78F, -22F, 3F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[397].setRotationPoint(78F, -18F, -9F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[398].setRotationPoint(78F, -22F, -9F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[399].setRotationPoint(78F, -22F, -4F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[400].setRotationPoint(78F, -22F, -9F);
	}
}