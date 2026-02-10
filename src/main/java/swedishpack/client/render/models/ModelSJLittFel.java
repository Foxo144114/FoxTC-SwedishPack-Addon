//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera Fel
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittFel extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittFel()//Same as Filename
	{
		bodyModel = new ModelRendererTurbo[931];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[1] = new ModelRendererTurbo(this, 31, 301, textureX, textureY); // Du loco part03
		bodyModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Du loco part05
		bodyModel[3] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Du loco part06
		bodyModel[4] = new ModelRendererTurbo(this, 1, 273, textureX, textureY); // Du loco part07
		bodyModel[5] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Du loco part08
		bodyModel[6] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Du loco part09
		bodyModel[7] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Du loco part19
		bodyModel[8] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Du loco part20
		bodyModel[9] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Du loco part22
		bodyModel[10] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Du loco part28
		bodyModel[11] = new ModelRendererTurbo(this, 52, 60, textureX, textureY); // Du loco part41
		bodyModel[12] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Du loco part82
		bodyModel[13] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part83
		bodyModel[14] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Du loco part84
		bodyModel[15] = new ModelRendererTurbo(this, 183, 7, textureX, textureY); // Du loco part85
		bodyModel[16] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Du loco part94
		bodyModel[17] = new ModelRendererTurbo(this, 208, 8, textureX, textureY); // Du loco part95
		bodyModel[18] = new ModelRendererTurbo(this, 392, 8, textureX, textureY); // Du loco part97
		bodyModel[19] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Du loco part100
		bodyModel[20] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Du loco part101
		bodyModel[21] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Du loco part102
		bodyModel[22] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Lamp
		bodyModel[23] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Lamp
		bodyModel[24] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Lamp
		bodyModel[25] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Lamp
		bodyModel[26] = new ModelRendererTurbo(this, 2, 100, textureX, textureY); // Box 149
		bodyModel[27] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 167
		bodyModel[28] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 168
		bodyModel[29] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 174
		bodyModel[30] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 177
		bodyModel[31] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 194
		bodyModel[32] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 195
		bodyModel[33] = new ModelRendererTurbo(this, 148, 273, textureX, textureY); // Box 135
		bodyModel[34] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 136
		bodyModel[35] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 138
		bodyModel[36] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 139
		bodyModel[37] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 141
		bodyModel[38] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 142
		bodyModel[39] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 143
		bodyModel[40] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 144
		bodyModel[41] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 145
		bodyModel[42] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 146
		bodyModel[43] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 147
		bodyModel[44] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 148
		bodyModel[45] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 149
		bodyModel[46] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 150
		bodyModel[47] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 151
		bodyModel[48] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 152
		bodyModel[49] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 153
		bodyModel[50] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 154
		bodyModel[51] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 155
		bodyModel[52] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 156
		bodyModel[53] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 157
		bodyModel[54] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 158
		bodyModel[55] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 159
		bodyModel[56] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 160
		bodyModel[57] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[58] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Du loco part37
		bodyModel[59] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Du loco part37
		bodyModel[60] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Du loco part37
		bodyModel[61] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Du loco part37
		bodyModel[62] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Du loco part37
		bodyModel[63] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Du loco part37
		bodyModel[64] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Du loco part37
		bodyModel[65] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Du loco part37
		bodyModel[66] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Du loco part37
		bodyModel[67] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Du loco part37
		bodyModel[68] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part37
		bodyModel[69] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Du loco part37
		bodyModel[70] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Du loco part37
		bodyModel[71] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 167
		bodyModel[72] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 168
		bodyModel[73] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[74] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[75] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[76] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Lamp
		bodyModel[77] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Lamp
		bodyModel[78] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Lamp
		bodyModel[79] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Lamp
		bodyModel[80] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Lamp
		bodyModel[81] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[82] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[83] = new ModelRendererTurbo(this, 1, 98, textureX, textureY); // Box 149
		bodyModel[84] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 149
		bodyModel[85] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part37
		bodyModel[86] = new ModelRendererTurbo(this, 229, 71, textureX, textureY); // Du loco part37
		bodyModel[87] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Du loco part37
		bodyModel[88] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Du loco part37
		bodyModel[89] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Du loco part23
		bodyModel[90] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Du loco part23
		bodyModel[91] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Du loco part23
		bodyModel[92] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Du loco part23
		bodyModel[93] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Du loco part23
		bodyModel[94] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Du loco part23
		bodyModel[95] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Du loco part09
		bodyModel[96] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 168
		bodyModel[97] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 167
		bodyModel[98] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 149
		bodyModel[99] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 168
		bodyModel[100] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 168
		bodyModel[101] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 167
		bodyModel[102] = new ModelRendererTurbo(this, 2, 97, textureX, textureY); // Du loco part71
		bodyModel[103] = new ModelRendererTurbo(this, 5, 99, textureX, textureY); // Du loco part71
		bodyModel[104] = new ModelRendererTurbo(this, 15, 99, textureX, textureY); // Du loco part71
		bodyModel[105] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 167
		bodyModel[106] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 167
		bodyModel[107] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 167
		bodyModel[108] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 167
		bodyModel[109] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 167
		bodyModel[110] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Du loco part19
		bodyModel[111] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 168
		bodyModel[112] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 168
		bodyModel[113] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 168
		bodyModel[114] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 174
		bodyModel[115] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Du loco part28
		bodyModel[116] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Du loco part28
		bodyModel[117] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Du loco part28
		bodyModel[118] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Du loco part28
		bodyModel[119] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Du loco part28
		bodyModel[120] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Du loco part28
		bodyModel[121] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Du loco part28
		bodyModel[122] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Du loco part28
		bodyModel[123] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Du loco part28
		bodyModel[124] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Du loco part28
		bodyModel[125] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Du loco part28
		bodyModel[126] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Du loco part28
		bodyModel[127] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Du loco part28
		bodyModel[128] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Du loco part28
		bodyModel[129] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Du loco part05
		bodyModel[130] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Du loco part06
		bodyModel[131] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 167
		bodyModel[132] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 167
		bodyModel[133] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 167
		bodyModel[134] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 168
		bodyModel[135] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 168
		bodyModel[136] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 168
		bodyModel[137] = new ModelRendererTurbo(this, 339, 63, textureX, textureY); // Du loco part06
		bodyModel[138] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Du loco part06
		bodyModel[139] = new ModelRendererTurbo(this, 342, 61, textureX, textureY); // Du loco part06
		bodyModel[140] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Du loco part06
		bodyModel[141] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Du loco part06
		bodyModel[142] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Du loco part06
		bodyModel[143] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part06
		bodyModel[144] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Du loco part06
		bodyModel[145] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Du loco part06
		bodyModel[146] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Du loco part06
		bodyModel[147] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Du loco part06
		bodyModel[148] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Du loco part06
		bodyModel[149] = new ModelRendererTurbo(this, 127, 10, textureX, textureY); // Du loco part41
		bodyModel[150] = new ModelRendererTurbo(this, 271, 154, textureX, textureY); // Du loco part28
		bodyModel[151] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Du loco part05
		bodyModel[152] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Du loco part06
		bodyModel[153] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part19
		bodyModel[154] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Du loco part22
		bodyModel[155] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Du loco part28
		bodyModel[156] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[157] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[158] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Du loco part Ligjhtpart15
		bodyModel[159] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Du loco part Ligjhtpart13
		bodyModel[160] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 167
		bodyModel[161] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 168
		bodyModel[162] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[163] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 167
		bodyModel[164] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 168
		bodyModel[165] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[166] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[167] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[168] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[169] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[170] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[171] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[172] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[173] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Lamp
		bodyModel[174] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Lamp
		bodyModel[175] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 168
		bodyModel[176] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 167
		bodyModel[177] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 149
		bodyModel[178] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 168
		bodyModel[179] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 168
		bodyModel[180] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 167
		bodyModel[181] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 167
		bodyModel[182] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Box 167
		bodyModel[183] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 167
		bodyModel[184] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 167
		bodyModel[185] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 167
		bodyModel[186] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Du loco part19
		bodyModel[187] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 168
		bodyModel[188] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 168
		bodyModel[189] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Box 168
		bodyModel[190] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Du loco part28
		bodyModel[191] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Du loco part28
		bodyModel[192] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Du loco part28
		bodyModel[193] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Du loco part28
		bodyModel[194] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Du loco part05
		bodyModel[195] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Du loco part06
		bodyModel[196] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 167
		bodyModel[197] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Box 167
		bodyModel[198] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 168
		bodyModel[199] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 168
		bodyModel[200] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Du loco part09
		bodyModel[201] = new ModelRendererTurbo(this, 9, 217, textureX, textureY); // Du loco part37
		bodyModel[202] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Du loco part37
		bodyModel[203] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Du loco part37
		bodyModel[204] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Du loco part37
		bodyModel[205] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Du loco part37
		bodyModel[206] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Du loco part37
		bodyModel[207] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Du loco part37
		bodyModel[208] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Du loco part37
		bodyModel[209] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Du loco part37
		bodyModel[210] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Du loco part37
		bodyModel[211] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Du loco part37
		bodyModel[212] = new ModelRendererTurbo(this, 25, 225, textureX, textureY); // Du loco part37
		bodyModel[213] = new ModelRendererTurbo(this, 121, 217, textureX, textureY); // Du loco part37
		bodyModel[214] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Du loco part37
		bodyModel[215] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Du loco part37
		bodyModel[216] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Du loco part37
		bodyModel[217] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Du loco part37
		bodyModel[218] = new ModelRendererTurbo(this, 17, 233, textureX, textureY); // Du loco part37
		bodyModel[219] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Du loco part37
		bodyModel[220] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Du loco part37
		bodyModel[221] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Du loco part37
		bodyModel[222] = new ModelRendererTurbo(this, 169, 55, textureX, textureY); // Du loco part37
		bodyModel[223] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part09
		bodyModel[224] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Du loco part82
		bodyModel[225] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Du loco part83
		bodyModel[226] = new ModelRendererTurbo(this, 329, 217, textureX, textureY); // Du loco part84
		bodyModel[227] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Du loco part85
		bodyModel[228] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Du loco part94
		bodyModel[229] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Du loco part95
		bodyModel[230] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Du loco part97
		bodyModel[231] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Du loco part100
		bodyModel[232] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Du loco part101
		bodyModel[233] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Du loco part102
		bodyModel[234] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Box 177
		bodyModel[235] = new ModelRendererTurbo(this, 296, 233, textureX, textureY); // Box 193
		bodyModel[236] = new ModelRendererTurbo(this, 320, 233, textureX, textureY); // Box 196
		bodyModel[237] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Du loco part37
		bodyModel[238] = new ModelRendererTurbo(this, 250, 332, textureX, textureY); // Du loco part37
		bodyModel[239] = new ModelRendererTurbo(this, 169, 241, textureX, textureY); // Du loco part37
		bodyModel[240] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Du loco part37
		bodyModel[241] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Du loco part37
		bodyModel[242] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Du loco part37
		bodyModel[243] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Du loco part37
		bodyModel[244] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Du loco part37
		bodyModel[245] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Du loco part37
		bodyModel[246] = new ModelRendererTurbo(this, 505, 233, textureX, textureY); // Du loco part37
		bodyModel[247] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Du loco part37
		bodyModel[248] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Du loco part37
		bodyModel[249] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Du loco part37
		bodyModel[250] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Du loco part37
		bodyModel[251] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Du loco part37
		bodyModel[252] = new ModelRendererTurbo(this, 49, 249, textureX, textureY); // Du loco part37
		bodyModel[253] = new ModelRendererTurbo(this, 89, 249, textureX, textureY); // Du loco part37
		bodyModel[254] = new ModelRendererTurbo(this, 121, 249, textureX, textureY); // Du loco part37
		bodyModel[255] = new ModelRendererTurbo(this, 169, 249, textureX, textureY); // Du loco part37
		bodyModel[256] = new ModelRendererTurbo(this, 201, 249, textureX, textureY); // Du loco part37
		bodyModel[257] = new ModelRendererTurbo(this, 217, 249, textureX, textureY); // Du loco part37
		bodyModel[258] = new ModelRendererTurbo(this, 297, 249, textureX, textureY); // Du loco part37
		bodyModel[259] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Du loco part37
		bodyModel[260] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Du loco part37
		bodyModel[261] = new ModelRendererTurbo(this, 73, 249, textureX, textureY); // Du loco part37
		bodyModel[262] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Du loco part37
		bodyModel[263] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Du loco part37
		bodyModel[264] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Du loco part37
		bodyModel[265] = new ModelRendererTurbo(this, 353, 249, textureX, textureY); // Du loco part37
		bodyModel[266] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Du loco part37
		bodyModel[267] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Du loco part37
		bodyModel[268] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Du loco part37
		bodyModel[269] = new ModelRendererTurbo(this, 465, 249, textureX, textureY); // Du loco part06
		bodyModel[270] = new ModelRendererTurbo(this, 481, 249, textureX, textureY); // Du loco part06
		bodyModel[271] = new ModelRendererTurbo(this, 497, 249, textureX, textureY); // Du loco part06
		bodyModel[272] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Du loco part06
		bodyModel[273] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Du loco part06
		bodyModel[274] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // Du loco part06
		bodyModel[275] = new ModelRendererTurbo(this, 137, 257, textureX, textureY); // Du loco part06
		bodyModel[276] = new ModelRendererTurbo(this, 153, 257, textureX, textureY); // Du loco part06
		bodyModel[277] = new ModelRendererTurbo(this, 169, 257, textureX, textureY); // Du loco part06
		bodyModel[278] = new ModelRendererTurbo(this, 185, 257, textureX, textureY); // Du loco part06
		bodyModel[279] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Du loco part06
		bodyModel[280] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Du loco part06
		bodyModel[281] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Du loco part06
		bodyModel[282] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Du loco part06
		bodyModel[283] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Du loco part06
		bodyModel[284] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Du loco part06
		bodyModel[285] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part06
		bodyModel[286] = new ModelRendererTurbo(this, 105, 265, textureX, textureY); // Du loco part06
		bodyModel[287] = new ModelRendererTurbo(this, 121, 265, textureX, textureY); // Du loco part06
		bodyModel[288] = new ModelRendererTurbo(this, 137, 265, textureX, textureY); // Du loco part06
		bodyModel[289] = new ModelRendererTurbo(this, 153, 265, textureX, textureY); // Du loco part06
		bodyModel[290] = new ModelRendererTurbo(this, 169, 265, textureX, textureY); // Du loco part06
		bodyModel[291] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // Du loco part06
		bodyModel[292] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Du loco part06
		bodyModel[293] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Du loco part06
		bodyModel[294] = new ModelRendererTurbo(this, 233, 265, textureX, textureY); // Du loco part06
		bodyModel[295] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Du loco part06
		bodyModel[296] = new ModelRendererTurbo(this, 265, 265, textureX, textureY); // Du loco part06
		bodyModel[297] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Du loco part06
		bodyModel[298] = new ModelRendererTurbo(this, 297, 265, textureX, textureY); // Du loco part06
		bodyModel[299] = new ModelRendererTurbo(this, 313, 265, textureX, textureY); // Du loco part06
		bodyModel[300] = new ModelRendererTurbo(this, 329, 265, textureX, textureY); // Du loco part06
		bodyModel[301] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Du loco part06
		bodyModel[302] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Du loco part06
		bodyModel[303] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Du loco part06
		bodyModel[304] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Du loco part06
		bodyModel[305] = new ModelRendererTurbo(this, 17, 257, textureX, textureY); // Du loco part28
		bodyModel[306] = new ModelRendererTurbo(this, 17, 265, textureX, textureY); // Du loco part28
		bodyModel[307] = new ModelRendererTurbo(this, 409, 265, textureX, textureY); // Du loco part28
		bodyModel[308] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Du loco part28
		bodyModel[309] = new ModelRendererTurbo(this, 385, 249, textureX, textureY); // Du loco part28
		bodyModel[310] = new ModelRendererTurbo(this, 425, 265, textureX, textureY); // Du loco part28
		bodyModel[311] = new ModelRendererTurbo(this, 441, 265, textureX, textureY); // Du loco part28
		bodyModel[312] = new ModelRendererTurbo(this, 457, 265, textureX, textureY); // Du loco part28
		bodyModel[313] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Du loco part28
		bodyModel[314] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Du loco part28
		bodyModel[315] = new ModelRendererTurbo(this, 505, 12, textureX, textureY); // Box 174
		bodyModel[316] = new ModelRendererTurbo(this, 113, 53, textureX, textureY); // Box 174
		bodyModel[317] = new ModelRendererTurbo(this, 21, 298, textureX, textureY); // Box 156
		bodyModel[318] = new ModelRendererTurbo(this, 28, 298, textureX, textureY); // Box 156
		bodyModel[319] = new ModelRendererTurbo(this, 35, 298, textureX, textureY); // Box 156
		bodyModel[320] = new ModelRendererTurbo(this, 14, 298, textureX, textureY); // Box 156
		bodyModel[321] = new ModelRendererTurbo(this, 45, 298, textureX, textureY); // Box 154
		bodyModel[322] = new ModelRendererTurbo(this, 48, 297, textureX, textureY); // Box 154
		bodyModel[323] = new ModelRendererTurbo(this, 51, 298, textureX, textureY); // Box 154
		bodyModel[324] = new ModelRendererTurbo(this, 42, 297, textureX, textureY); // Box 154
		bodyModel[325] = new ModelRendererTurbo(this, 1, 347, textureX, textureY); // Du loco part23
		bodyModel[326] = new ModelRendererTurbo(this, 178, 332, textureX, textureY); // Du loco part37
		bodyModel[327] = new ModelRendererTurbo(this, 145, 332, textureX, textureY); // Du loco part37
		bodyModel[328] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Du loco part37
		bodyModel[329] = new ModelRendererTurbo(this, 211, 332, textureX, textureY); // Du loco part37
		bodyModel[330] = new ModelRendererTurbo(this, 40, 332, textureX, textureY); // Du loco part37
		bodyModel[331] = new ModelRendererTurbo(this, 112, 332, textureX, textureY); // Du loco part37
		bodyModel[332] = new ModelRendererTurbo(this, 79, 332, textureX, textureY); // Du loco part37
		bodyModel[333] = new ModelRendererTurbo(this, 1, 332, textureX, textureY); // Du loco part37
		bodyModel[334] = new ModelRendererTurbo(this, 102, 347, textureX, textureY); // Du loco part23
		bodyModel[335] = new ModelRendererTurbo(this, 311, 317, textureX, textureY); // Du loco part05
		bodyModel[336] = new ModelRendererTurbo(this, 314, 316, textureX, textureY); // Du loco part05
		bodyModel[337] = new ModelRendererTurbo(this, 318, 316, textureX, textureY); // Du loco part05
		bodyModel[338] = new ModelRendererTurbo(this, 318, 316, textureX, textureY); // Du loco part05
		bodyModel[339] = new ModelRendererTurbo(this, 317, 319, textureX, textureY); // Du loco part05
		bodyModel[340] = new ModelRendererTurbo(this, 314, 317, textureX, textureY); // Du loco part05
		bodyModel[341] = new ModelRendererTurbo(this, 318, 316, textureX, textureY); // Du loco part05
		bodyModel[342] = new ModelRendererTurbo(this, 319, 317, textureX, textureY); // Du loco part05
		bodyModel[343] = new ModelRendererTurbo(this, 308, 317, textureX, textureY); // Du loco part05
		bodyModel[344] = new ModelRendererTurbo(this, 309, 316, textureX, textureY); // Du loco part05
		bodyModel[345] = new ModelRendererTurbo(this, 318, 316, textureX, textureY); // Du loco part05
		bodyModel[346] = new ModelRendererTurbo(this, 318, 316, textureX, textureY); // Du loco part05
		bodyModel[347] = new ModelRendererTurbo(this, 310, 315, textureX, textureY); // Du loco part05
		bodyModel[348] = new ModelRendererTurbo(this, 310, 316, textureX, textureY); // Du loco part05
		bodyModel[349] = new ModelRendererTurbo(this, 316, 313, textureX, textureY); // Du loco part05
		bodyModel[350] = new ModelRendererTurbo(this, 318, 316, textureX, textureY); // Du loco part05
		bodyModel[351] = new ModelRendererTurbo(this, 313, 316, textureX, textureY); // Du loco part05
		bodyModel[352] = new ModelRendererTurbo(this, 314, 315, textureX, textureY); // Du loco part05
		bodyModel[353] = new ModelRendererTurbo(this, 320, 315, textureX, textureY); // Du loco part05
		bodyModel[354] = new ModelRendererTurbo(this, 315, 315, textureX, textureY); // Du loco part05
		bodyModel[355] = new ModelRendererTurbo(this, 316, 317, textureX, textureY); // Du loco part05
		bodyModel[356] = new ModelRendererTurbo(this, 316, 316, textureX, textureY); // Du loco part05
		bodyModel[357] = new ModelRendererTurbo(this, 318, 314, textureX, textureY); // Du loco part05
		bodyModel[358] = new ModelRendererTurbo(this, 316, 315, textureX, textureY); // Du loco part05
		bodyModel[359] = new ModelRendererTurbo(this, 314, 316, textureX, textureY); // Du loco part05
		bodyModel[360] = new ModelRendererTurbo(this, 310, 317, textureX, textureY); // Du loco part05
		bodyModel[361] = new ModelRendererTurbo(this, 320, 315, textureX, textureY); // Du loco part05
		bodyModel[362] = new ModelRendererTurbo(this, 316, 312, textureX, textureY); // Du loco part05
		bodyModel[363] = new ModelRendererTurbo(this, 312, 320, textureX, textureY); // Du loco part05
		bodyModel[364] = new ModelRendererTurbo(this, 318, 315, textureX, textureY); // Du loco part05
		bodyModel[365] = new ModelRendererTurbo(this, 316, 315, textureX, textureY); // Du loco part05
		bodyModel[366] = new ModelRendererTurbo(this, 318, 313, textureX, textureY); // Du loco part05
		bodyModel[367] = new ModelRendererTurbo(this, 311, 315, textureX, textureY); // Du loco part05
		bodyModel[368] = new ModelRendererTurbo(this, 310, 315, textureX, textureY); // Du loco part05
		bodyModel[369] = new ModelRendererTurbo(this, 317, 314, textureX, textureY); // Du loco part05
		bodyModel[370] = new ModelRendererTurbo(this, 318, 316, textureX, textureY); // Du loco part05
		bodyModel[371] = new ModelRendererTurbo(this, 311, 315, textureX, textureY); // Du loco part05
		bodyModel[372] = new ModelRendererTurbo(this, 309, 314, textureX, textureY); // Du loco part05
		bodyModel[373] = new ModelRendererTurbo(this, 318, 314, textureX, textureY); // Du loco part05
		bodyModel[374] = new ModelRendererTurbo(this, 318, 314, textureX, textureY); // Du loco part05
		bodyModel[375] = new ModelRendererTurbo(this, 313, 317, textureX, textureY); // Du loco part05
		bodyModel[376] = new ModelRendererTurbo(this, 317, 316, textureX, textureY); // Du loco part05
		bodyModel[377] = new ModelRendererTurbo(this, 316, 314, textureX, textureY); // Du loco part05
		bodyModel[378] = new ModelRendererTurbo(this, 319, 314, textureX, textureY); // Du loco part05
		bodyModel[379] = new ModelRendererTurbo(this, 318, 317, textureX, textureY); // Du loco part05
		bodyModel[380] = new ModelRendererTurbo(this, 314, 319, textureX, textureY); // Du loco part05
		bodyModel[381] = new ModelRendererTurbo(this, 320, 314, textureX, textureY); // Du loco part05
		bodyModel[382] = new ModelRendererTurbo(this, 318, 313, textureX, textureY); // Du loco part05
		bodyModel[383] = new ModelRendererTurbo(this, 317, 316, textureX, textureY); // Du loco part05
		bodyModel[384] = new ModelRendererTurbo(this, 301, 340, textureX, textureY); // Du loco part05
		bodyModel[385] = new ModelRendererTurbo(this, 314, 315, textureX, textureY); // Du loco part05
		bodyModel[386] = new ModelRendererTurbo(this, 300, 340, textureX, textureY); // Du loco part05
		bodyModel[387] = new ModelRendererTurbo(this, 312, 314, textureX, textureY); // Du loco part05
		bodyModel[388] = new ModelRendererTurbo(this, 300, 342, textureX, textureY); // Du loco part05
		bodyModel[389] = new ModelRendererTurbo(this, 318, 313, textureX, textureY); // Du loco part05
		bodyModel[390] = new ModelRendererTurbo(this, 301, 341, textureX, textureY); // Du loco part05
		bodyModel[391] = new ModelRendererTurbo(this, 313, 313, textureX, textureY); // Du loco part05
		bodyModel[392] = new ModelRendererTurbo(this, 299, 341, textureX, textureY); // Du loco part05
		bodyModel[393] = new ModelRendererTurbo(this, 311, 313, textureX, textureY); // Du loco part05
		bodyModel[394] = new ModelRendererTurbo(this, 298, 341, textureX, textureY); // Du loco part05
		bodyModel[395] = new ModelRendererTurbo(this, 302, 342, textureX, textureY); // Du loco part05
		bodyModel[396] = new ModelRendererTurbo(this, 299, 340, textureX, textureY); // Du loco part05
		bodyModel[397] = new ModelRendererTurbo(this, 301, 340, textureX, textureY); // Du loco part05
		bodyModel[398] = new ModelRendererTurbo(this, 300, 338, textureX, textureY); // Du loco part05
		bodyModel[399] = new ModelRendererTurbo(this, 316, 312, textureX, textureY); // Du loco part05
		bodyModel[400] = new ModelRendererTurbo(this, 300, 340, textureX, textureY); // Du loco part05
		bodyModel[401] = new ModelRendererTurbo(this, 311, 313, textureX, textureY); // Du loco part05
		bodyModel[402] = new ModelRendererTurbo(this, 300, 343, textureX, textureY); // Du loco part05
		bodyModel[403] = new ModelRendererTurbo(this, 311, 314, textureX, textureY); // Du loco part05
		bodyModel[404] = new ModelRendererTurbo(this, 299, 341, textureX, textureY); // Du loco part05
		bodyModel[405] = new ModelRendererTurbo(this, 316, 312, textureX, textureY); // Du loco part05
		bodyModel[406] = new ModelRendererTurbo(this, 301, 338, textureX, textureY); // Du loco part05
		bodyModel[407] = new ModelRendererTurbo(this, 309, 314, textureX, textureY); // Du loco part05
		bodyModel[408] = new ModelRendererTurbo(this, 300, 343, textureX, textureY); // Du loco part05
		bodyModel[409] = new ModelRendererTurbo(this, 308, 314, textureX, textureY); // Du loco part05
		bodyModel[410] = new ModelRendererTurbo(this, 299, 341, textureX, textureY); // Du loco part05
		bodyModel[411] = new ModelRendererTurbo(this, 298, 344, textureX, textureY); // Du loco part05
		bodyModel[412] = new ModelRendererTurbo(this, 298, 342, textureX, textureY); // Du loco part05
		bodyModel[413] = new ModelRendererTurbo(this, 301, 342, textureX, textureY); // Du loco part05
		bodyModel[414] = new ModelRendererTurbo(this, 299, 339, textureX, textureY); // Du loco part05
		bodyModel[415] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[416] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[417] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[418] = new ModelRendererTurbo(this, 385, 325, textureX, textureY); // Du loco part01
		bodyModel[419] = new ModelRendererTurbo(this, 385, 325, textureX, textureY); // Du loco part01
		bodyModel[420] = new ModelRendererTurbo(this, 385, 325, textureX, textureY); // Du loco part01
		bodyModel[421] = new ModelRendererTurbo(this, 385, 325, textureX, textureY); // Du loco part01
		bodyModel[422] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[423] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[424] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[425] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[426] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[427] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[428] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[429] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[430] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[431] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[432] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[433] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[434] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[435] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[436] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[437] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[438] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[439] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[440] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[441] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[442] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[443] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[444] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[445] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[446] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[447] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[448] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[449] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[450] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[451] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[452] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[453] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[454] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[455] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[456] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[457] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[458] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[459] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[460] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[461] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[462] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[463] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[464] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[465] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[466] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[467] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[468] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[469] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[470] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[471] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[472] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[473] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[474] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[475] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[476] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[477] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[478] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[479] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[480] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[481] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[482] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[483] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[484] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[485] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[486] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[487] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[488] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[489] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[490] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Du loco part23
		bodyModel[491] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Du loco part23
		bodyModel[492] = new ModelRendererTurbo(this, 277, 317, textureX, textureY); // Du loco part05
		bodyModel[493] = new ModelRendererTurbo(this, 269, 319, textureX, textureY); // Du loco part05
		bodyModel[494] = new ModelRendererTurbo(this, 270, 319, textureX, textureY); // Du loco part05
		bodyModel[495] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[496] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[497] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[498] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[499] = new ModelRendererTurbo(this, 8, 307, textureX, textureY); // Du loco part05

		bodyModel[0].addShapeBox(0F, 0F, 0F, 80, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(9F, -9F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 96, 1, 20, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(1F, -12F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[2].setRotationPoint(0F, -11F, 11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[3].setRotationPoint(0F, -11F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 72, 20, 1, 0F); // Du loco part07
		bodyModel[4].setRotationPoint(13F, -30F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 100, 3, 4, 0F); // Du loco part08
		bodyModel[5].setRotationPoint(-1F, -33F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, -22F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, -22F, -22F, 0F); // Du loco part09
		bodyModel[6].setRotationPoint(-20F, -9F, 6.05F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 21, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[7].setRotationPoint(-2F, -30F, -2F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Du loco part20
		bodyModel[8].setRotationPoint(84F, -30F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[9].setRotationPoint(1F, -30F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[10].setRotationPoint(1F, -30F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, 0F, 0F); // Du loco part41
		bodyModel[11].setRotationPoint(-2F, -10F, -8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[12].setRotationPoint(1F, -19F, -10F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[13].setRotationPoint(6F, -13F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[14].setRotationPoint(6F, -13F, -6F);
		bodyModel[14].rotateAngleY = -1.57079633F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[15].setRotationPoint(6F, -13F, -3F);
		bodyModel[15].rotateAngleY = -1.57079633F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[16].setRotationPoint(6F, -16F, -6F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[17].setRotationPoint(6F, -16F, -3F);
		bodyModel[17].rotateAngleY = -1.57079633F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[18].setRotationPoint(6F, -16F, -6F);
		bodyModel[18].rotateAngleY = -1.57079633F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[19].setRotationPoint(9F, -20F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[20].setRotationPoint(9F, -20F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[21].setRotationPoint(9F, -20F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[22].setRotationPoint(-3F, -17F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[23].setRotationPoint(-3F, -15F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[24].setRotationPoint(-3F, -15F, 4F);

		bodyModel[25].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[25].setRotationPoint(-3F, -17F, 4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 96, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[26].setRotationPoint(1F, -31F, 9F);

		bodyModel[27].addShapeBox(0F, 0F, 1F, 3, 23, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[27].setRotationPoint(-2F, -32F, -7F);

		bodyModel[28].addShapeBox(0F, 0F, 1F, 3, 23, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[28].setRotationPoint(-2F, -32F, 1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[29].setRotationPoint(1F, -10F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[30].setRotationPoint(9F, -16F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[31].setRotationPoint(8F, -15F, -4F);
		bodyModel[31].rotateAngleY = -1.57079633F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[32].setRotationPoint(7F, -15F, -4F);
		bodyModel[32].rotateAngleY = -1.57079633F;

		bodyModel[33].addBox(0F, 0F, 0F, 72, 20, 1, 0F); // Box 135
		bodyModel[33].setRotationPoint(13F, -30F, 10F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 136
		bodyModel[34].setRotationPoint(13F, -30F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[35].setRotationPoint(16F, -16F, -2F);

		bodyModel[36].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[36].setRotationPoint(15F, -22F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[37].setRotationPoint(15F, -24F, -3F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 142
		bodyModel[38].setRotationPoint(16F, -25F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 143
		bodyModel[39].setRotationPoint(15F, -26F, -3F);

		bodyModel[40].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 144
		bodyModel[40].setRotationPoint(15F, -30F, -3F);

		bodyModel[41].addBox(0F, 0F, 0F, 12, 15, 12, 0F); // Box 145
		bodyModel[41].setRotationPoint(24F, -27F, -5F);

		bodyModel[42].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 146
		bodyModel[42].setRotationPoint(23F, -28F, -6F);

		bodyModel[43].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[43].setRotationPoint(18F, -19F, -4F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 148
		bodyModel[44].setRotationPoint(22F, -26F, -4F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[45].setRotationPoint(23F, -26F, -4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[46].setRotationPoint(42F, -16F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[47].setRotationPoint(52F, -16F, -2F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 152
		bodyModel[48].setRotationPoint(53F, -30F, -1F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 153
		bodyModel[49].setRotationPoint(43F, -30F, -1F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 154
		bodyModel[50].setRotationPoint(46F, -27F, -1F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 155
		bodyModel[51].setRotationPoint(50F, -27F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 156
		bodyModel[52].setRotationPoint(50F, -18F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F); // Box 157
		bodyModel[53].setRotationPoint(46F, -18F, -1F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 158
		bodyModel[54].setRotationPoint(48F, -26F, -1F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 159
		bodyModel[55].setRotationPoint(52F, -26F, -1F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 160
		bodyModel[56].setRotationPoint(45F, -26F, -1F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Du loco part Ligjhtpart8
		bodyModel[57].setRotationPoint(-2F, -33F, -2F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[58].setRotationPoint(5F, -33F, -6F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[59].setRotationPoint(5F, -33F, 5F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[60].setRotationPoint(23F, -33F, -6F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[61].setRotationPoint(23F, -33F, 5F);

		bodyModel[62].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[62].setRotationPoint(5F, -34F, -6F);

		bodyModel[63].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[63].setRotationPoint(5F, -34F, 5F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[64].setRotationPoint(13F, -37F, -4F);

		bodyModel[65].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[65].setRotationPoint(13F, -37F, 3F);

		bodyModel[66].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[66].setRotationPoint(14F, -38F, -6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[67].setRotationPoint(14F, -38F, 6F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[68].setRotationPoint(14F, -38F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[69].setRotationPoint(2F, -35F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[70].setRotationPoint(2F, -36F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 1F, 2, 22, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[71].setRotationPoint(-1F, -31F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 1F, 2, 22, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[72].setRotationPoint(-1F, -31F, 5F);

		bodyModel[73].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part Ligjhtpart8
		bodyModel[73].setRotationPoint(-2F, -32F, 2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part Ligjhtpart8
		bodyModel[74].setRotationPoint(-2F, -32F, 3F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part Ligjhtpart8
		bodyModel[75].setRotationPoint(-2F, -34F, -2F);

		bodyModel[76].addBox(0F, 0F, 1F, 3, 1, 3, 0F); // Lamp
		bodyModel[76].setRotationPoint(-3F, -16F, -9F);

		bodyModel[77].addBox(0F, 0F, 1F, 3, 1, 3, 0F); // Lamp
		bodyModel[77].setRotationPoint(-3F, -16F, 4F);

		bodyModel[78].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[78].setRotationPoint(-3F, -34F, -3F);

		bodyModel[79].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[79].setRotationPoint(-3F, -31F, -3F);

		bodyModel[80].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Lamp
		bodyModel[80].setRotationPoint(-3F, -33F, -3F);

		bodyModel[81].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[81].setRotationPoint(-3F, -31F, 1F);

		bodyModel[82].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[82].setRotationPoint(-3F, -32F, 1F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 98, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[83].setRotationPoint(0F, -32F, 6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 100, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[84].setRotationPoint(-1F, -33F, 2F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Du loco part37
		bodyModel[85].setRotationPoint(39F, -35F, 6F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 18, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[86].setRotationPoint(40F, -35F, 7F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Du loco part37
		bodyModel[87].setRotationPoint(27F, -35F, 5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Du loco part37
		bodyModel[88].setRotationPoint(24F, -35F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[89].setRotationPoint(31F, -11F, 6.05F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[90].setRotationPoint(-6F, -11F, 6.05F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[91].setRotationPoint(-23F, -11F, 6.05F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[92].setRotationPoint(31F, -11F, -6.05F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[93].setRotationPoint(-6F, -11F, -6.05F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[94].setRotationPoint(-23F, -11F, -6.05F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, -22F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, -22F, -22F, 0F); // Du loco part09
		bodyModel[95].setRotationPoint(-20F, -9F, -6.05F);

		bodyModel[96].addShapeBox(0F, 0F, 1F, 1, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[96].setRotationPoint(0F, -30F, 8F);

		bodyModel[97].addShapeBox(0F, 0F, 1F, 1, 21, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[97].setRotationPoint(0F, -30F, -12F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 149
		bodyModel[98].setRotationPoint(-1F, -32F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[99].setRotationPoint(-2F, -33F, 1F);

		bodyModel[100].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[100].setRotationPoint(0F, -31F, 8F);

		bodyModel[101].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[101].setRotationPoint(-2F, -33F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 100, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[102].setRotationPoint(-1F, -33F, -6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 98, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[103].setRotationPoint(0F, -32F, -9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 96, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[104].setRotationPoint(1F, -31F, -11F);

		bodyModel[105].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[105].setRotationPoint(-1F, -32F, -10F);

		bodyModel[106].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[106].setRotationPoint(0F, -31F, -12F);

		bodyModel[107].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[107].setRotationPoint(-1F, -11F, -12F);

		bodyModel[108].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[108].setRotationPoint(-2F, -11F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[109].setRotationPoint(-3F, -11F, -7F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[110].setRotationPoint(-3F, -11F, -2F);

		bodyModel[111].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[111].setRotationPoint(-3F, -11F, 1F);

		bodyModel[112].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[112].setRotationPoint(-2F, -11F, 5F);

		bodyModel[113].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[113].setRotationPoint(-1F, -11F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[114].setRotationPoint(1F, -10F, -11F);

		bodyModel[115].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[115].setRotationPoint(9F, -11F, -9F);

		bodyModel[116].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[116].setRotationPoint(12F, -11F, -9F);

		bodyModel[117].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[117].setRotationPoint(9F, -11F, 8F);

		bodyModel[118].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[118].setRotationPoint(12F, -11F, 8F);

		bodyModel[119].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[119].setRotationPoint(9F, -5F, -11F);

		bodyModel[120].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[120].setRotationPoint(9F, -7F, -11F);

		bodyModel[121].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[121].setRotationPoint(9F, -9F, -11F);

		bodyModel[122].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[122].setRotationPoint(9F, -5F, 9F);

		bodyModel[123].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[123].setRotationPoint(9F, -7F, 9F);

		bodyModel[124].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[124].setRotationPoint(9F, -9F, 9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[125].setRotationPoint(8F, -25F, 11F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[126].setRotationPoint(13F, -25F, 11F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[127].setRotationPoint(8F, -25F, -12F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[128].setRotationPoint(13F, -25F, -12F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[129].setRotationPoint(0F, -20F, 11F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[130].setRotationPoint(0F, -20F, -12F);

		bodyModel[131].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[131].setRotationPoint(-1F, -20F, -12F);

		bodyModel[132].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[132].setRotationPoint(-2F, -20F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[133].setRotationPoint(-3F, -20F, -7F);

		bodyModel[134].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[134].setRotationPoint(-3F, -20F, 1F);

		bodyModel[135].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[135].setRotationPoint(-2F, -20F, 5F);

		bodyModel[136].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[136].setRotationPoint(-1F, -20F, 8F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part06
		bodyModel[137].setRotationPoint(18F, -9F, -8F);

		bodyModel[138].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Du loco part06
		bodyModel[138].setRotationPoint(21F, -7F, -8F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[139].setRotationPoint(25.5F, -9.5F, -8F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[140].setRotationPoint(27F, -9F, 9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[141].setRotationPoint(27F, -10F, 9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[142].setRotationPoint(29F, -9F, 9F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[143].setRotationPoint(29F, -10F, 9F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[144].setRotationPoint(26F, -9F, 9F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[145].setRotationPoint(26F, -10F, 9F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[146].setRotationPoint(27F, -10F, 10F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[147].setRotationPoint(29F, -10F, 10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[148].setRotationPoint(26F, -10F, 10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[149].setRotationPoint(-2F, -5F, -5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[150].setRotationPoint(-3.01F, -20F, -2F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[151].setRotationPoint(90F, -11F, 11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[152].setRotationPoint(90F, -11F, -12F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 21, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[153].setRotationPoint(97F, -30F, -2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 12, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[154].setRotationPoint(85F, -30F, 10F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 12, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[155].setRotationPoint(85F, -30F, -11F);

		bodyModel[156].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[156].setRotationPoint(98F, -17F, -9F);

		bodyModel[157].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[157].setRotationPoint(98F, -15F, -9F);

		bodyModel[158].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart15
		bodyModel[158].setRotationPoint(98F, -15F, 4F);

		bodyModel[159].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart13
		bodyModel[159].setRotationPoint(98F, -17F, 4F);

		bodyModel[160].addShapeBox(0F, 0F, 1F, 3, 23, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[160].setRotationPoint(97F, -32F, -7F);

		bodyModel[161].addShapeBox(0F, 0F, 1F, 3, 23, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[161].setRotationPoint(97F, -32F, 1F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Du loco part Ligjhtpart8
		bodyModel[162].setRotationPoint(99F, -33F, -2F);

		bodyModel[163].addShapeBox(0F, 0F, 1F, 2, 22, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[163].setRotationPoint(97F, -31F, -10F);

		bodyModel[164].addShapeBox(0F, 0F, 1F, 2, 22, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[164].setRotationPoint(97F, -31F, 5F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part Ligjhtpart8
		bodyModel[165].setRotationPoint(99F, -32F, -3F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart8
		bodyModel[166].setRotationPoint(99F, -32F, -4F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part Ligjhtpart8
		bodyModel[167].setRotationPoint(96F, -34F, -2F);

		bodyModel[168].addBox(0F, 0F, 1F, 3, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[168].setRotationPoint(98F, -16F, -9F);

		bodyModel[169].addBox(0F, 0F, 1F, 3, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[169].setRotationPoint(98F, -16F, 4F);

		bodyModel[170].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[170].setRotationPoint(100F, -34F, -3F);

		bodyModel[171].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[171].setRotationPoint(100F, -31F, -3F);

		bodyModel[172].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Du loco part Ligjhtpart18
		bodyModel[172].setRotationPoint(100F, -33F, -3F);

		bodyModel[173].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[173].setRotationPoint(100F, -31F, -5F);

		bodyModel[174].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[174].setRotationPoint(100F, -32F, -5F);

		bodyModel[175].addShapeBox(0F, 0F, 1F, 1, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[175].setRotationPoint(97F, -30F, 8F);

		bodyModel[176].addShapeBox(0F, 0F, 1F, 1, 21, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[176].setRotationPoint(97F, -30F, -12F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[177].setRotationPoint(98F, -32F, 6F);

		bodyModel[178].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[178].setRotationPoint(99F, -33F, 1F);

		bodyModel[179].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[179].setRotationPoint(97F, -31F, 8F);

		bodyModel[180].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[180].setRotationPoint(99F, -33F, -7F);

		bodyModel[181].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[181].setRotationPoint(98F, -32F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[182].setRotationPoint(97F, -31F, -12F);

		bodyModel[183].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[183].setRotationPoint(98F, -11F, -12F);

		bodyModel[184].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[184].setRotationPoint(99F, -11F, -10F);

		bodyModel[185].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[185].setRotationPoint(100F, -11F, -7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[186].setRotationPoint(100F, -11F, -2F);

		bodyModel[187].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[187].setRotationPoint(100F, -11F, 1F);

		bodyModel[188].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[188].setRotationPoint(99F, -11F, 5F);

		bodyModel[189].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[189].setRotationPoint(98F, -11F, 8F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[190].setRotationPoint(84F, -25F, 11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[191].setRotationPoint(89F, -25F, 11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[192].setRotationPoint(84F, -25F, -12F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[193].setRotationPoint(89F, -25F, -12F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[194].setRotationPoint(90F, -20F, 11F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[195].setRotationPoint(90F, -20F, -12F);

		bodyModel[196].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[196].setRotationPoint(98F, -20F, -12F);

		bodyModel[197].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[197].setRotationPoint(99F, -20F, -10F);

		bodyModel[198].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[198].setRotationPoint(99F, -20F, 5F);

		bodyModel[199].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[199].setRotationPoint(98F, -20F, 8F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, -22F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, -22F, -22F, 0F); // Du loco part09
		bodyModel[200].setRotationPoint(66F, -9F, -6.05F);

		bodyModel[201].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[201].setRotationPoint(74F, -33F, -6F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[202].setRotationPoint(74F, -33F, 5F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[203].setRotationPoint(92F, -33F, -6F);

		bodyModel[204].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[204].setRotationPoint(92F, -33F, 5F);

		bodyModel[205].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[205].setRotationPoint(74F, -34F, -6F);

		bodyModel[206].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[206].setRotationPoint(74F, -34F, 5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[207].setRotationPoint(87F, -40F, 4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[208].setRotationPoint(74F, -40F, 4F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[209].setRotationPoint(84F, -46F, 3F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[210].setRotationPoint(74F, -46F, 3F);

		bodyModel[211].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[211].setRotationPoint(82F, -47F, -4F);

		bodyModel[212].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[212].setRotationPoint(82F, -47F, 3F);

		bodyModel[213].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[213].setRotationPoint(83F, -48F, -6F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[214].setRotationPoint(83F, -48F, 6F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[215].setRotationPoint(83F, -48F, -8F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[216].setRotationPoint(87F, -40F, -5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[217].setRotationPoint(74F, -40F, -5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[218].setRotationPoint(84F, -46F, -4F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[219].setRotationPoint(74F, -46F, -4F);

		bodyModel[220].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Du loco part37
		bodyModel[220].setRotationPoint(70F, -35F, -7F);

		bodyModel[221].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[221].setRotationPoint(72F, -34F, 5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[222].setRotationPoint(71F, -35F, -6F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-22F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -22F, 0F, 0F, -22F, -22F, 0F, 0F, -22F, 0F, 0F, -22F, 0F, -22F, -22F, 0F); // Du loco part09
		bodyModel[223].setRotationPoint(66F, -9F, 6.05F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[224].setRotationPoint(92F, -19F, -10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[225].setRotationPoint(88F, -13F, -6F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[226].setRotationPoint(88F, -13F, -6F);
		bodyModel[226].rotateAngleY = -1.57079633F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[227].setRotationPoint(88F, -13F, -3F);
		bodyModel[227].rotateAngleY = -1.57079633F;

		bodyModel[228].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[228].setRotationPoint(89F, -16F, -6F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[229].setRotationPoint(89F, -16F, -3F);
		bodyModel[229].rotateAngleY = -1.57079633F;

		bodyModel[230].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[230].setRotationPoint(89F, -16F, -6F);
		bodyModel[230].rotateAngleY = -1.57079633F;

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[231].setRotationPoint(88F, -20F, -6F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[232].setRotationPoint(88F, -20F, -7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[233].setRotationPoint(88F, -20F, -4F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[234].setRotationPoint(88F, -16F, -7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[235].setRotationPoint(90F, -15F, -4F);
		bodyModel[235].rotateAngleY = -1.57079633F;

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[236].setRotationPoint(89F, -15F, -4F);
		bodyModel[236].rotateAngleY = -1.57079633F;

		bodyModel[237].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[237].setRotationPoint(18F, -35F, 4F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, 0F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -7F); // Du loco part37
		bodyModel[238].setRotationPoint(16F, -37F, -4F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[239].setRotationPoint(2F, -35F, 4F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[240].setRotationPoint(2F, -36F, 3F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[241].setRotationPoint(18F, -35F, -5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[242].setRotationPoint(15F, -36F, -4F);

		bodyModel[243].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[243].setRotationPoint(82F, -37F, -4F);

		bodyModel[244].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[244].setRotationPoint(82F, -37F, 3F);

		bodyModel[245].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[245].setRotationPoint(83F, -38F, -6F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[246].setRotationPoint(83F, -38F, 6F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[247].setRotationPoint(83F, -38F, -8F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[248].setRotationPoint(71F, -35F, -5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[249].setRotationPoint(71F, -36F, -4F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[250].setRotationPoint(87F, -35F, 4F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[251].setRotationPoint(84F, -36F, 3F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[252].setRotationPoint(71F, -35F, 4F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[253].setRotationPoint(71F, -36F, 3F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[254].setRotationPoint(87F, -35F, -5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[255].setRotationPoint(84F, -36F, -4F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[256].setRotationPoint(18F, -40F, 4F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[257].setRotationPoint(5F, -40F, 4F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[258].setRotationPoint(15F, -46F, 3F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[259].setRotationPoint(5F, -46F, 3F);

		bodyModel[260].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[260].setRotationPoint(13F, -47F, -4F);

		bodyModel[261].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[261].setRotationPoint(13F, -47F, 3F);

		bodyModel[262].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[262].setRotationPoint(14F, -48F, -6F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[263].setRotationPoint(14F, -48F, 6F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[264].setRotationPoint(14F, -48F, -8F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[265].setRotationPoint(18F, -40F, -5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[266].setRotationPoint(5F, -40F, -5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[267].setRotationPoint(15F, -46F, -4F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[268].setRotationPoint(5F, -46F, -4F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[269].setRotationPoint(3F, -10F, 8F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[270].setRotationPoint(7F, -8F, 8F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[271].setRotationPoint(2F, -8F, 8F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[272].setRotationPoint(3F, -8F, 8F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[273].setRotationPoint(7F, -10F, 8F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[274].setRotationPoint(2F, -10F, 8F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[275].setRotationPoint(2F, -9F, 8F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[276].setRotationPoint(7F, -9F, 8F);

		bodyModel[277].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[277].setRotationPoint(3F, -9F, 8F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[278].setRotationPoint(3F, -10F, -11F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[279].setRotationPoint(7F, -8F, -11F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[280].setRotationPoint(2F, -8F, -11F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[281].setRotationPoint(3F, -8F, -11F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[282].setRotationPoint(7F, -10F, -11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[283].setRotationPoint(2F, -10F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[284].setRotationPoint(2F, -9F, -11F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[285].setRotationPoint(7F, -9F, -11F);

		bodyModel[286].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[286].setRotationPoint(3F, -9F, -11F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[287].setRotationPoint(91F, -10F, 8F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[288].setRotationPoint(95F, -8F, 8F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[289].setRotationPoint(90F, -8F, 8F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[290].setRotationPoint(91F, -8F, 8F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[291].setRotationPoint(95F, -10F, 8F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[292].setRotationPoint(90F, -10F, 8F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[293].setRotationPoint(90F, -9F, 8F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[294].setRotationPoint(95F, -9F, 8F);

		bodyModel[295].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[295].setRotationPoint(91F, -9F, 8F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[296].setRotationPoint(91F, -10F, -11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[297].setRotationPoint(95F, -8F, -11F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[298].setRotationPoint(90F, -8F, -11F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[299].setRotationPoint(91F, -8F, -11F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[300].setRotationPoint(95F, -10F, -11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[301].setRotationPoint(90F, -10F, -11F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[302].setRotationPoint(90F, -9F, -11F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[303].setRotationPoint(95F, -9F, -11F);

		bodyModel[304].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[304].setRotationPoint(91F, -9F, -11F);

		bodyModel[305].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[305].setRotationPoint(85F, -11F, -9F);

		bodyModel[306].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[306].setRotationPoint(88F, -11F, -9F);

		bodyModel[307].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[307].setRotationPoint(85F, -11F, 8F);

		bodyModel[308].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[308].setRotationPoint(88F, -11F, 8F);

		bodyModel[309].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[309].setRotationPoint(85F, -5F, -11F);

		bodyModel[310].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[310].setRotationPoint(85F, -7F, -11F);

		bodyModel[311].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[311].setRotationPoint(85F, -9F, -11F);

		bodyModel[312].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[312].setRotationPoint(85F, -5F, 9F);

		bodyModel[313].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[313].setRotationPoint(85F, -7F, 9F);

		bodyModel[314].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[314].setRotationPoint(85F, -9F, 9F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[315].setRotationPoint(95F, -10F, 10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[316].setRotationPoint(95F, -10F, -11F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 156
		bodyModel[317].setRotationPoint(97F, -30F, -11F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[318].setRotationPoint(97F, -30F, 10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 156
		bodyModel[319].setRotationPoint(-1F, -30F, -11F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[320].setRotationPoint(-1F, -30F, 10F);

		bodyModel[321].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[321].setRotationPoint(-1F, -32F, -10.75F);

		bodyModel[322].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[322].setRotationPoint(-0.5F, -32F, -11.25F);

		bodyModel[323].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[323].setRotationPoint(-1F, -32F, 10.75F);

		bodyModel[324].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[324].setRotationPoint(-0.5F, -32F, 10.25F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[325].setRotationPoint(4F, -21F, 11.05F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F); // Du loco part37
		bodyModel[326].setRotationPoint(16F, -46F, -4F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F); // Du loco part37
		bodyModel[327].setRotationPoint(16F, -46F, -4F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[328].setRotationPoint(15F, -36F, 3F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, -7F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F); // Du loco part37
		bodyModel[329].setRotationPoint(16F, -37F, -4F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[330].setRotationPoint(71F, -37F, -4F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[331].setRotationPoint(74F, -46F, -4F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[332].setRotationPoint(74F, -46F, -4F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[333].setRotationPoint(71F, -37F, -4F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[334].setRotationPoint(4F, -21F, -11.05F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[335].setRotationPoint(3F, -22F, 10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[336].setRotationPoint(3F, -28F, 10F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[337].setRotationPoint(3F, -28F, 10F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[338].setRotationPoint(6F, -28F, 10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[339].setRotationPoint(10F, -22F, 10F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[340].setRotationPoint(10F, -28F, 10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[341].setRotationPoint(10F, -28F, 10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[342].setRotationPoint(11F, -28F, 10F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[343].setRotationPoint(18F, -22F, 10F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[344].setRotationPoint(18F, -28F, 10F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[345].setRotationPoint(18F, -28F, 10F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[346].setRotationPoint(25F, -28F, 10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[347].setRotationPoint(72F, -22F, 10F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[348].setRotationPoint(72F, -28F, 10F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[349].setRotationPoint(72F, -28F, 10F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[350].setRotationPoint(79F, -28F, 10F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[351].setRotationPoint(91F, -22F, 10F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[352].setRotationPoint(91F, -28F, 10F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[353].setRotationPoint(91F, -28F, 10F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[354].setRotationPoint(94F, -28F, 10F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[355].setRotationPoint(86F, -22F, 10F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[356].setRotationPoint(86F, -28F, 10F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[357].setRotationPoint(86F, -28F, 10F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[358].setRotationPoint(87F, -28F, 10F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[359].setRotationPoint(3F, -22F, -11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[360].setRotationPoint(3F, -28F, -11F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[361].setRotationPoint(3F, -28F, -11F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[362].setRotationPoint(6F, -28F, -11F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[363].setRotationPoint(10F, -22F, -11F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[364].setRotationPoint(10F, -28F, -11F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[365].setRotationPoint(10F, -28F, -11F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[366].setRotationPoint(11F, -28F, -11F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[367].setRotationPoint(18F, -22F, -11F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[368].setRotationPoint(18F, -28F, -11F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[369].setRotationPoint(18F, -28F, -11F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[370].setRotationPoint(25F, -28F, -11F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[371].setRotationPoint(72F, -22F, -11F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[372].setRotationPoint(72F, -28F, -11F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[373].setRotationPoint(72F, -28F, -11F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[374].setRotationPoint(79F, -28F, -11F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[375].setRotationPoint(91F, -22F, -11F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[376].setRotationPoint(91F, -28F, -11F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[377].setRotationPoint(91F, -28F, -11F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[378].setRotationPoint(94F, -28F, -11F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[379].setRotationPoint(86F, -22F, -11F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[380].setRotationPoint(86F, -28F, -11F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[381].setRotationPoint(86F, -28F, -11F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[382].setRotationPoint(87F, -28F, -11F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[383].setRotationPoint(97F, -29F, -9F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[384].setRotationPoint(97F, -29F, -4F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[385].setRotationPoint(97F, -29F, -9F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[386].setRotationPoint(97F, -29F, -6F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[387].setRotationPoint(97F, -23F, -9F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[388].setRotationPoint(97F, -23F, -6F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[389].setRotationPoint(97F, -29F, 8F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[390].setRotationPoint(97F, -29F, 3F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[391].setRotationPoint(97F, -29F, 6F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[392].setRotationPoint(97F, -29F, 3F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[393].setRotationPoint(97F, -23F, 6F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[394].setRotationPoint(97F, -23F, 3F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[395].setRotationPoint(97F, -23F, -2F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[396].setRotationPoint(97F, -29F, -2F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[397].setRotationPoint(97F, -29F, 1F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[398].setRotationPoint(97F, -29F, -2F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[399].setRotationPoint(0F, -29F, -9F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,-0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Du loco part05
		bodyModel[400].setRotationPoint(-2F, -29F, -4F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[401].setRotationPoint(-1F, -29F, -9F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part05
		bodyModel[402].setRotationPoint(-2F, -29F, -6F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[403].setRotationPoint(-1F, -23F, -9F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part05
		bodyModel[404].setRotationPoint(-2F, -23F, -6F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[405].setRotationPoint(0F, -29F, 8F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Du loco part05
		bodyModel[406].setRotationPoint(-2F, -29F, 3F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[407].setRotationPoint(-1F, -29F, 6F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[408].setRotationPoint(-2F, -29F, 3F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[409].setRotationPoint(-1F, -23F, 6F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[410].setRotationPoint(-2F, -23F, 3F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[411].setRotationPoint(-2F, -23F, -2F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[412].setRotationPoint(-2F, -29F, -2F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[413].setRotationPoint(-2F, -29F, 1F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[414].setRotationPoint(-2F, -29F, -2F);

		bodyModel[415].addBox(0F, 0F, 0F, 98, 2, 12, 0F); // Du loco part01
		bodyModel[415].setRotationPoint(0F, -11F, -6F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 3, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[416].setRotationPoint(0F, -9F, -6F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 3, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part01
		bodyModel[417].setRotationPoint(95F, -9F, -6F);

		bodyModel[418].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[418].setRotationPoint(91.5F, -5.5F, -6F);

		bodyModel[419].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Du loco part01
		bodyModel[419].setRotationPoint(86.5F, -6.5F, -1F);

		bodyModel[420].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[420].setRotationPoint(5.5F, -5.5F, -6F);

		bodyModel[421].addBox(0F, 0F, 0F, 6, 1, 2, 0F); // Du loco part01
		bodyModel[421].setRotationPoint(5.5F, -6.5F, -1F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[422].setRotationPoint(-3F, -9.25F, 4.43F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[423].setRotationPoint(-2.75F, -9F, 4.9F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[424].setRotationPoint(-5.5F, -8.75F, 5.15F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[425].setRotationPoint(-3F, -9.25F, -6.63F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[426].setRotationPoint(-5.5F, -8.75F, -5.88F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[427].setRotationPoint(-3F, -8.75F, 0F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[428].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[429].setRotationPoint(-2.5F, -8.5F, -0.25F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[430].setRotationPoint(-4.5F, -7F, -0.25F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[431].setRotationPoint(-3.5F, -8.75F, -0.25F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[432].setRotationPoint(-4.5F, -8.5F, 0F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[433].setRotationPoint(-4.5F, -8.5F, -0.75F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[434].setRotationPoint(-3F, -8.75F, 0.25F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[435].setRotationPoint(-3F, -8.5F, -0.25F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[436].setRotationPoint(-3F, -9F, -0.5F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[437].setRotationPoint(-3F, -6F, -0.5F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[438].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[439].setRotationPoint(-4.5F, -6F, -0.5F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[440].setRotationPoint(-4.5F, -5.25F, -0.5F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[441].setRotationPoint(-6.5F, -8.87F, 4.03F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[442].setRotationPoint(-6.5F, -9.87F, 4.03F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[443].setRotationPoint(-6.5F, -9.37F, 4.03F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[444].setRotationPoint(-6.5F, -7.87F, 4.03F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[445].setRotationPoint(-6.5F, -8.37F, 4.03F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[446].setRotationPoint(-6.5F, -8.87F, -7.03F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[447].setRotationPoint(-6.5F, -9.87F, -7.03F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[448].setRotationPoint(-6.5F, -9.37F, -7.03F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[449].setRotationPoint(-6.5F, -7.87F, -7.03F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[450].setRotationPoint(-6.5F, -8.37F, -7.03F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[451].setRotationPoint(-2.75F, -9.5F, 4.9F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[452].setRotationPoint(-2.75F, -8.25F, 4.9F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[453].setRotationPoint(-2.75F, -9F, -6.13F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[454].setRotationPoint(-2.75F, -9.5F, -6.13F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[455].setRotationPoint(-2.75F, -8.25F, -6.13F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[456].setRotationPoint(100F, -9.25F, 4.43F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[457].setRotationPoint(99.75F, -9F, 4.9F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[458].setRotationPoint(100.5F, -8.75F, 5.15F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[459].setRotationPoint(100F, -9.25F, -6.63F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[460].setRotationPoint(100.5F, -8.75F, -5.88F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[461].setRotationPoint(100F, -8.75F, 0F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[462].setRotationPoint(100F, -8.75F, -1F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[463].setRotationPoint(99.5F, -8.5F, -0.25F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[464].setRotationPoint(100.5F, -7F, -0.25F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[465].setRotationPoint(100.5F, -8.75F, -0.25F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[466].setRotationPoint(99.5F, -8.5F, 0F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[467].setRotationPoint(99.5F, -8.5F, -0.75F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[468].setRotationPoint(100F, -8.75F, 0.25F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[469].setRotationPoint(100F, -8.5F, -0.25F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[470].setRotationPoint(100F, -9F, -0.5F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[471].setRotationPoint(100F, -6F, -0.5F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[472].setRotationPoint(100F, -8.75F, -1F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[473].setRotationPoint(100.5F, -6F, -0.5F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[474].setRotationPoint(101.5F, -5.25F, -0.5F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[475].setRotationPoint(103.5F, -8.87F, 4.03F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[476].setRotationPoint(103.5F, -9.87F, 4.03F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[477].setRotationPoint(103.5F, -9.37F, 4.03F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[478].setRotationPoint(103.5F, -7.87F, 4.03F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[479].setRotationPoint(103.5F, -8.37F, 4.03F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[480].setRotationPoint(103.5F, -8.87F, -7.03F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[481].setRotationPoint(103.5F, -9.87F, -7.03F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[482].setRotationPoint(103.5F, -9.37F, -7.03F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[483].setRotationPoint(103.5F, -7.87F, -7.03F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[484].setRotationPoint(103.5F, -8.37F, -7.03F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[485].setRotationPoint(99.75F, -9.5F, 4.9F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[486].setRotationPoint(99.75F, -8.25F, 4.9F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[487].setRotationPoint(99.75F, -9F, -6.13F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[488].setRotationPoint(99.75F, -9.5F, -6.13F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[489].setRotationPoint(99.75F, -8.25F, -6.13F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[490].setRotationPoint(14F, -11F, 6.05F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[491].setRotationPoint(14F, -11F, -6.05F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[492].setRotationPoint(97F, -29F, -3F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[493].setRotationPoint(97F, -29F, -6F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[494].setRotationPoint(97F, -23F, -6F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[495].setRotationPoint(26F, -28F, -11F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[496].setRotationPoint(35F, -28F, -11F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[497].setRotationPoint(27F, -21F, -11F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[498].setRotationPoint(27F, -29F, -11F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[499].setRotationPoint(31F, -28F, -11F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[501] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[502] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[503] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[504] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[505] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[506] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[507] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[508] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[509] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[510] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[511] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[512] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[513] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[514] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[515] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[516] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[517] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[518] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[519] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[520] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[521] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[522] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[523] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[524] = new ModelRendererTurbo(this, 8, 307, textureX, textureY); // Du loco part05
		bodyModel[525] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[526] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[527] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[528] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[529] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[530] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[531] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[532] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[533] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[534] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[535] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[536] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[537] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[538] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[539] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[540] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[541] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[542] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[543] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[544] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[545] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[546] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[547] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[548] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[549] = new ModelRendererTurbo(this, 8, 307, textureX, textureY); // Du loco part05
		bodyModel[550] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[551] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[552] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[553] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[554] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[555] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[556] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[557] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[558] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[559] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[560] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[561] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[562] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[563] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[564] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[565] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[566] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[567] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[568] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[569] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[570] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[571] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[572] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[573] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[574] = new ModelRendererTurbo(this, 8, 307, textureX, textureY); // Du loco part05
		bodyModel[575] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[576] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[577] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[578] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[579] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[580] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[581] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[582] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[583] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[584] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[585] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[586] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[587] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[588] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[589] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[590] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[591] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[592] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[593] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[594] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[595] = new ModelRendererTurbo(this, 335, 324, textureX, textureY); // Du loco part05
		bodyModel[596] = new ModelRendererTurbo(this, 340, 326, textureX, textureY); // Du loco part05
		bodyModel[597] = new ModelRendererTurbo(this, 340, 323, textureX, textureY); // Du loco part05
		bodyModel[598] = new ModelRendererTurbo(this, 342, 323, textureX, textureY); // Du loco part05
		bodyModel[599] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[600] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[601] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[602] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[603] = new ModelRendererTurbo(this, 8, 307, textureX, textureY); // Du loco part05
		bodyModel[604] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[605] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[606] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[607] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[608] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[609] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[610] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[611] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[612] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[613] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[614] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[615] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[616] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[617] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[618] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[619] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[620] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[621] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[622] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[623] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[624] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[625] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[626] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[627] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[628] = new ModelRendererTurbo(this, 8, 307, textureX, textureY); // Du loco part05
		bodyModel[629] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[630] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[631] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[632] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[633] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[634] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[635] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[636] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[637] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[638] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[639] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[640] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[641] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[642] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[643] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[644] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[645] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[646] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[647] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[648] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[649] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[650] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[651] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[652] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[653] = new ModelRendererTurbo(this, 8, 307, textureX, textureY); // Du loco part05
		bodyModel[654] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[655] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[656] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[657] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[658] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[659] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[660] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[661] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[662] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[663] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[664] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[665] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[666] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[667] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[668] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[669] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[670] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[671] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[672] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[673] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[674] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[675] = new ModelRendererTurbo(this, 3, 304, textureX, textureY); // Du loco part05
		bodyModel[676] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[677] = new ModelRendererTurbo(this, 8, 304, textureX, textureY); // Du loco part05
		bodyModel[678] = new ModelRendererTurbo(this, 8, 307, textureX, textureY); // Du loco part05
		bodyModel[679] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[680] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[681] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[682] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[683] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[684] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[685] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[686] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[687] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[688] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[689] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[690] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[691] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[692] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[693] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[694] = new ModelRendererTurbo(this, 27, 304, textureX, textureY); // Du loco part05
		bodyModel[695] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[696] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[697] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[698] = new ModelRendererTurbo(this, 38, 304, textureX, textureY); // Du loco part05
		bodyModel[699] = new ModelRendererTurbo(this, 336, 328, textureX, textureY); // Du loco part05
		bodyModel[700] = new ModelRendererTurbo(this, 335, 327, textureX, textureY); // Du loco part05
		bodyModel[701] = new ModelRendererTurbo(this, 337, 322, textureX, textureY); // Du loco part05
		bodyModel[702] = new ModelRendererTurbo(this, 339, 321, textureX, textureY); // Du loco part05
		bodyModel[703] = new ModelRendererTurbo(this, 52, 60, textureX, textureY); // Du loco part41
		bodyModel[704] = new ModelRendererTurbo(this, 274, 317, textureX, textureY); // Du loco part05
		bodyModel[705] = new ModelRendererTurbo(this, 273, 320, textureX, textureY); // Du loco part05
		bodyModel[706] = new ModelRendererTurbo(this, 273, 322, textureX, textureY); // Du loco part05
		bodyModel[707] = new ModelRendererTurbo(this, 274, 320, textureX, textureY); // Du loco part05
		bodyModel[708] = new ModelRendererTurbo(this, 274, 320, textureX, textureY); // Du loco part05
		bodyModel[709] = new ModelRendererTurbo(this, 273, 320, textureX, textureY); // Du loco part05
		bodyModel[710] = new ModelRendererTurbo(this, 278, 319, textureX, textureY); // Du loco part05
		bodyModel[711] = new ModelRendererTurbo(this, 273, 319, textureX, textureY); // Du loco part05
		bodyModel[712] = new ModelRendererTurbo(this, 273, 319, textureX, textureY); // Du loco part05
		bodyModel[713] = new ModelRendererTurbo(this, 341, 66, textureX, textureY); // Du loco part06
		bodyModel[714] = new ModelRendererTurbo(this, 346, 56, textureX, textureY); // Du loco part06
		bodyModel[715] = new ModelRendererTurbo(this, 339, 53, textureX, textureY); // Du loco part06
		bodyModel[716] = new ModelRendererTurbo(this, 348, 61, textureX, textureY); // Du loco part06
		bodyModel[717] = new ModelRendererTurbo(this, 344, 54, textureX, textureY); // Du loco part06
		bodyModel[718] = new ModelRendererTurbo(this, 343, 59, textureX, textureY); // Du loco part06
		bodyModel[719] = new ModelRendererTurbo(this, 345, 61, textureX, textureY); // Du loco part06
		bodyModel[720] = new ModelRendererTurbo(this, 341, 56, textureX, textureY); // Du loco part06
		bodyModel[721] = new ModelRendererTurbo(this, 338, 69, textureX, textureY); // Du loco part06
		bodyModel[722] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Du loco part01
		bodyModel[723] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part01
		bodyModel[724] = new ModelRendererTurbo(this, 335, 61, textureX, textureY); // Du loco part06
		bodyModel[725] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Du loco part06
		bodyModel[726] = new ModelRendererTurbo(this, 345, 60, textureX, textureY); // Du loco part06
		bodyModel[727] = new ModelRendererTurbo(this, 339, 66, textureX, textureY); // Du loco part06
		bodyModel[728] = new ModelRendererTurbo(this, 341, 59, textureX, textureY); // Du loco part06
		bodyModel[729] = new ModelRendererTurbo(this, 346, 59, textureX, textureY); // Du loco part06
		bodyModel[730] = new ModelRendererTurbo(this, 349, 61, textureX, textureY); // Du loco part06
		bodyModel[731] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Du loco part01
		bodyModel[732] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part01
		bodyModel[733] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Du loco part06
		bodyModel[734] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Du loco part06
		bodyModel[735] = new ModelRendererTurbo(this, 351, 64, textureX, textureY); // Du loco part06
		bodyModel[736] = new ModelRendererTurbo(this, 342, 63, textureX, textureY); // Du loco part06
		bodyModel[737] = new ModelRendererTurbo(this, 345, 61, textureX, textureY); // Du loco part06
		bodyModel[738] = new ModelRendererTurbo(this, 343, 58, textureX, textureY); // Du loco part06
		bodyModel[739] = new ModelRendererTurbo(this, 352, 62, textureX, textureY); // Du loco part06
		bodyModel[740] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Du loco part01
		bodyModel[741] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part01
		bodyModel[742] = new ModelRendererTurbo(this, 338, 62, textureX, textureY); // Du loco part06
		bodyModel[743] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Du loco part06
		bodyModel[744] = new ModelRendererTurbo(this, 347, 61, textureX, textureY); // Du loco part06
		bodyModel[745] = new ModelRendererTurbo(this, 339, 66, textureX, textureY); // Du loco part06
		bodyModel[746] = new ModelRendererTurbo(this, 348, 55, textureX, textureY); // Du loco part06
		bodyModel[747] = new ModelRendererTurbo(this, 343, 58, textureX, textureY); // Du loco part06
		bodyModel[748] = new ModelRendererTurbo(this, 348, 61, textureX, textureY); // Du loco part06
		bodyModel[749] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Du loco part01
		bodyModel[750] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part01
		bodyModel[751] = new ModelRendererTurbo(this, 347, 59, textureX, textureY); // Du loco part06
		bodyModel[752] = new ModelRendererTurbo(this, 342, 62, textureX, textureY); // Du loco part06
		bodyModel[753] = new ModelRendererTurbo(this, 340, 54, textureX, textureY); // Du loco part06
		bodyModel[754] = new ModelRendererTurbo(this, 341, 56, textureX, textureY); // Du loco part06
		bodyModel[755] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Du loco part06
		bodyModel[756] = new ModelRendererTurbo(this, 340, 60, textureX, textureY); // Du loco part06
		bodyModel[757] = new ModelRendererTurbo(this, 341, 56, textureX, textureY); // Du loco part06
		bodyModel[758] = new ModelRendererTurbo(this, 337, 59, textureX, textureY); // Du loco part06
		bodyModel[759] = new ModelRendererTurbo(this, 339, 67, textureX, textureY); // Du loco part06
		bodyModel[760] = new ModelRendererTurbo(this, 340, 65, textureX, textureY); // Du loco part06
		bodyModel[761] = new ModelRendererTurbo(this, 339, 64, textureX, textureY); // Du loco part06
		bodyModel[762] = new ModelRendererTurbo(this, 338, 63, textureX, textureY); // Du loco part06
		bodyModel[763] = new ModelRendererTurbo(this, 392, 292, textureX, textureY); // Du loco part06
		bodyModel[764] = new ModelRendererTurbo(this, 395, 288, textureX, textureY); // Du loco part06
		bodyModel[765] = new ModelRendererTurbo(this, 393, 293, textureX, textureY); // Du loco part06
		bodyModel[766] = new ModelRendererTurbo(this, 337, 58, textureX, textureY); // Du loco part06
		bodyModel[767] = new ModelRendererTurbo(this, 344, 60, textureX, textureY); // Du loco part06
		bodyModel[768] = new ModelRendererTurbo(this, 332, 61, textureX, textureY); // Du loco part06
		bodyModel[769] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Du loco part06
		bodyModel[770] = new ModelRendererTurbo(this, 342, 57, textureX, textureY); // Du loco part06
		bodyModel[771] = new ModelRendererTurbo(this, 338, 60, textureX, textureY); // Du loco part06
		bodyModel[772] = new ModelRendererTurbo(this, 343, 57, textureX, textureY); // Du loco part06
		bodyModel[773] = new ModelRendererTurbo(this, 343, 57, textureX, textureY); // Du loco part06
		bodyModel[774] = new ModelRendererTurbo(this, 336, 60, textureX, textureY); // Du loco part06
		bodyModel[775] = new ModelRendererTurbo(this, 338, 57, textureX, textureY); // Du loco part06
		bodyModel[776] = new ModelRendererTurbo(this, 342, 58, textureX, textureY); // Du loco part06
		bodyModel[777] = new ModelRendererTurbo(this, 339, 57, textureX, textureY); // Du loco part06
		bodyModel[778] = new ModelRendererTurbo(this, 344, 55, textureX, textureY); // Du loco part06
		bodyModel[779] = new ModelRendererTurbo(this, 340, 67, textureX, textureY); // Du loco part06
		bodyModel[780] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Du loco part01
		bodyModel[781] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part01
		bodyModel[782] = new ModelRendererTurbo(this, 341, 62, textureX, textureY); // Du loco part06
		bodyModel[783] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Du loco part06
		bodyModel[784] = new ModelRendererTurbo(this, 343, 59, textureX, textureY); // Du loco part06
		bodyModel[785] = new ModelRendererTurbo(this, 337, 58, textureX, textureY); // Du loco part06
		bodyModel[786] = new ModelRendererTurbo(this, 342, 60, textureX, textureY); // Du loco part06
		bodyModel[787] = new ModelRendererTurbo(this, 342, 55, textureX, textureY); // Du loco part06
		bodyModel[788] = new ModelRendererTurbo(this, 349, 65, textureX, textureY); // Du loco part06
		bodyModel[789] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Du loco part01
		bodyModel[790] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part01
		bodyModel[791] = new ModelRendererTurbo(this, 327, 70, textureX, textureY); // Du loco part06
		bodyModel[792] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Du loco part06
		bodyModel[793] = new ModelRendererTurbo(this, 349, 61, textureX, textureY); // Du loco part06
		bodyModel[794] = new ModelRendererTurbo(this, 326, 70, textureX, textureY); // Du loco part06
		bodyModel[795] = new ModelRendererTurbo(this, 345, 55, textureX, textureY); // Du loco part06
		bodyModel[796] = new ModelRendererTurbo(this, 345, 62, textureX, textureY); // Du loco part06
		bodyModel[797] = new ModelRendererTurbo(this, 346, 63, textureX, textureY); // Du loco part06
		bodyModel[798] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Du loco part01
		bodyModel[799] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part01
		bodyModel[800] = new ModelRendererTurbo(this, 325, 68, textureX, textureY); // Du loco part06
		bodyModel[801] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Du loco part06
		bodyModel[802] = new ModelRendererTurbo(this, 342, 61, textureX, textureY); // Du loco part06
		bodyModel[803] = new ModelRendererTurbo(this, 337, 58, textureX, textureY); // Du loco part06
		bodyModel[804] = new ModelRendererTurbo(this, 344, 55, textureX, textureY); // Du loco part06
		bodyModel[805] = new ModelRendererTurbo(this, 345, 59, textureX, textureY); // Du loco part06
		bodyModel[806] = new ModelRendererTurbo(this, 346, 58, textureX, textureY); // Du loco part06
		bodyModel[807] = new ModelRendererTurbo(this, 28, 9, textureX, textureY); // Du loco part01
		bodyModel[808] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Du loco part01
		bodyModel[809] = new ModelRendererTurbo(this, 344, 58, textureX, textureY); // Du loco part06
		bodyModel[810] = new ModelRendererTurbo(this, 324, 67, textureX, textureY); // Du loco part06
		bodyModel[811] = new ModelRendererTurbo(this, 342, 59, textureX, textureY); // Du loco part06
		bodyModel[812] = new ModelRendererTurbo(this, 322, 64, textureX, textureY); // Du loco part06
		bodyModel[813] = new ModelRendererTurbo(this, 345, 51, textureX, textureY); // Du loco part06
		bodyModel[814] = new ModelRendererTurbo(this, 336, 55, textureX, textureY); // Du loco part06
		bodyModel[815] = new ModelRendererTurbo(this, 326, 64, textureX, textureY); // Du loco part06
		bodyModel[816] = new ModelRendererTurbo(this, 341, 65, textureX, textureY); // Du loco part06
		bodyModel[817] = new ModelRendererTurbo(this, 324, 67, textureX, textureY); // Du loco part06
		bodyModel[818] = new ModelRendererTurbo(this, 321, 70, textureX, textureY); // Du loco part06
		bodyModel[819] = new ModelRendererTurbo(this, 334, 70, textureX, textureY); // Du loco part06
		bodyModel[820] = new ModelRendererTurbo(this, 338, 62, textureX, textureY); // Du loco part06
		bodyModel[821] = new ModelRendererTurbo(this, 386, 291, textureX, textureY); // Du loco part06
		bodyModel[822] = new ModelRendererTurbo(this, 386, 292, textureX, textureY); // Du loco part06
		bodyModel[823] = new ModelRendererTurbo(this, 394, 290, textureX, textureY); // Du loco part06
		bodyModel[824] = new ModelRendererTurbo(this, 348, 64, textureX, textureY); // Du loco part06
		bodyModel[825] = new ModelRendererTurbo(this, 328, 63, textureX, textureY); // Du loco part06
		bodyModel[826] = new ModelRendererTurbo(this, 6, 97, textureX, textureY); // Du loco part08
		bodyModel[827] = new ModelRendererTurbo(this, 8, 98, textureX, textureY); // Box 149
		bodyModel[828] = new ModelRendererTurbo(this, 6, 97, textureX, textureY); // Box 149
		bodyModel[829] = new ModelRendererTurbo(this, 5, 95, textureX, textureY); // Box 149
		bodyModel[830] = new ModelRendererTurbo(this, 5, 95, textureX, textureY); // Du loco part71
		bodyModel[831] = new ModelRendererTurbo(this, 5, 97, textureX, textureY); // Du loco part71
		bodyModel[832] = new ModelRendererTurbo(this, 6, 99, textureX, textureY); // Du loco part71
		bodyModel[833] = new ModelRendererTurbo(this, 5, 97, textureX, textureY); // Du loco part08
		bodyModel[834] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Du loco part37
		bodyModel[835] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Du loco part37
		bodyModel[836] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part37
		bodyModel[837] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Du loco part37
		bodyModel[838] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Du loco part37
		bodyModel[839] = new ModelRendererTurbo(this, 229, 72, textureX, textureY); // Du loco part37
		bodyModel[840] = new ModelRendererTurbo(this, 226, 64, textureX, textureY); // Du loco part37
		bodyModel[841] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Du loco part37
		bodyModel[842] = new ModelRendererTurbo(this, 234, 71, textureX, textureY); // Du loco part37
		bodyModel[843] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Du loco part37
		bodyModel[844] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Du loco part37
		bodyModel[845] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Du loco part37
		bodyModel[846] = new ModelRendererTurbo(this, 253, 70, textureX, textureY); // Du loco part37
		bodyModel[847] = new ModelRendererTurbo(this, 433, 74, textureX, textureY); // Du loco part37
		bodyModel[848] = new ModelRendererTurbo(this, 253, 64, textureX, textureY); // Du loco part37
		bodyModel[849] = new ModelRendererTurbo(this, 266, 61, textureX, textureY); // Du loco part37
		bodyModel[850] = new ModelRendererTurbo(this, 261, 61, textureX, textureY); // Du loco part37
		bodyModel[851] = new ModelRendererTurbo(this, 268, 61, textureX, textureY); // Du loco part37
		bodyModel[852] = new ModelRendererTurbo(this, 13, 307, textureX, textureY); // Du loco part05
		bodyModel[853] = new ModelRendererTurbo(this, 13, 307, textureX, textureY); // Du loco part05
		bodyModel[854] = new ModelRendererTurbo(this, 23, 307, textureX, textureY); // Du loco part05
		bodyModel[855] = new ModelRendererTurbo(this, 23, 307, textureX, textureY); // Du loco part05
		bodyModel[856] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[857] = new ModelRendererTurbo(this, 18, 307, textureX, textureY); // Du loco part05
		bodyModel[858] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[859] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[860] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[861] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[862] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[863] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[864] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[865] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[866] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[867] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[868] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[869] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[870] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[871] = new ModelRendererTurbo(this, 27, 310, textureX, textureY); // Du loco part05
		bodyModel[872] = new ModelRendererTurbo(this, 27, 310, textureX, textureY); // Du loco part05
		bodyModel[873] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[874] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[875] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[876] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[877] = new ModelRendererTurbo(this, 13, 307, textureX, textureY); // Du loco part05
		bodyModel[878] = new ModelRendererTurbo(this, 13, 307, textureX, textureY); // Du loco part05
		bodyModel[879] = new ModelRendererTurbo(this, 23, 307, textureX, textureY); // Du loco part05
		bodyModel[880] = new ModelRendererTurbo(this, 23, 307, textureX, textureY); // Du loco part05
		bodyModel[881] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[882] = new ModelRendererTurbo(this, 18, 307, textureX, textureY); // Du loco part05
		bodyModel[883] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[884] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[885] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[886] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[887] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[888] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[889] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[890] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[891] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[892] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[893] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[894] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[895] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[896] = new ModelRendererTurbo(this, 27, 310, textureX, textureY); // Du loco part05
		bodyModel[897] = new ModelRendererTurbo(this, 27, 310, textureX, textureY); // Du loco part05
		bodyModel[898] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[899] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[900] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[901] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part05
		bodyModel[902] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 167
		bodyModel[903] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 168
		bodyModel[904] = new ModelRendererTurbo(this, 271, 154, textureX, textureY); // Du loco part28
		bodyModel[905] = new ModelRendererTurbo(this, 455, 494, textureX, textureY); // Du loco part42
		bodyModel[906] = new ModelRendererTurbo(this, 454, 470, textureX, textureY); // Du loco part42
		bodyModel[907] = new ModelRendererTurbo(this, 454, 462, textureX, textureY); // Du loco part42
		bodyModel[908] = new ModelRendererTurbo(this, 430, 494, textureX, textureY); // Du loco part42
		bodyModel[909] = new ModelRendererTurbo(this, 454, 486, textureX, textureY); // Du loco part42
		bodyModel[910] = new ModelRendererTurbo(this, 429, 478, textureX, textureY); // Du loco part42
		bodyModel[911] = new ModelRendererTurbo(this, 430, 503, textureX, textureY); // Du loco part42
		bodyModel[912] = new ModelRendererTurbo(this, 429, 462, textureX, textureY); // Du loco part42
		bodyModel[913] = new ModelRendererTurbo(this, 454, 478, textureX, textureY); // Du loco part42
		bodyModel[914] = new ModelRendererTurbo(this, 455, 503, textureX, textureY); // Du loco part42
		bodyModel[915] = new ModelRendererTurbo(this, 429, 486, textureX, textureY); // Du loco part42
		bodyModel[916] = new ModelRendererTurbo(this, 429, 470, textureX, textureY); // Du loco part42
		bodyModel[917] = new ModelRendererTurbo(this, 127, 10, textureX, textureY); // Du loco part41
		bodyModel[918] = new ModelRendererTurbo(this, 127, 10, textureX, textureY); // Du loco part41
		bodyModel[919] = new ModelRendererTurbo(this, 127, 10, textureX, textureY); // Du loco part41
		bodyModel[920] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 138
		bodyModel[921] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 139
		bodyModel[922] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 141
		bodyModel[923] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 142
		bodyModel[924] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 143
		bodyModel[925] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 144
		bodyModel[926] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 145
		bodyModel[927] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 146
		bodyModel[928] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 147
		bodyModel[929] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 148
		bodyModel[930] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 149

		bodyModel[500].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[500].setRotationPoint(27F, -27F, -11F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[501].setRotationPoint(31F, -27F, -11F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[502].setRotationPoint(27F, -26.25F, -11F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[503].setRotationPoint(31F, -26.25F, -11F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[504].setRotationPoint(27F, -25.5F, -11F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[505].setRotationPoint(31F, -25.5F, -11F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[506].setRotationPoint(27F, -24.75F, -11F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[507].setRotationPoint(31F, -24.75F, -11F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[508].setRotationPoint(27F, -24F, -11F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[509].setRotationPoint(31F, -24F, -11F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[510].setRotationPoint(27F, -23.25F, -11F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[511].setRotationPoint(31F, -23.25F, -11F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[512].setRotationPoint(27F, -22.5F, -11F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[513].setRotationPoint(31F, -22.5F, -11F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[514].setRotationPoint(27F, -21.75F, -11F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[515].setRotationPoint(31F, -21.75F, -11F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[516].setRotationPoint(31F, -28.5F, -11F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[517].setRotationPoint(27F, -28.5F, -11F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[518].setRotationPoint(27F, -27.75F, -11F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[519].setRotationPoint(31F, -27.75F, -11F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[520].setRotationPoint(53F, -28F, 10F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[521].setRotationPoint(62F, -28F, 10F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[522].setRotationPoint(54F, -21F, 10F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[523].setRotationPoint(54F, -29F, 10F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[524].setRotationPoint(58F, -28F, 10F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[525].setRotationPoint(54F, -27F, 10F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[526].setRotationPoint(58F, -27F, 10F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[527].setRotationPoint(54F, -26.25F, 10F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[528].setRotationPoint(58F, -26.25F, 10F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[529].setRotationPoint(54F, -25.5F, 10F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[530].setRotationPoint(58F, -25.5F, 10F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[531].setRotationPoint(54F, -24.75F, 10F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[532].setRotationPoint(58F, -24.75F, 10F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[533].setRotationPoint(54F, -24F, 10F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[534].setRotationPoint(58F, -24F, 10F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[535].setRotationPoint(54F, -23.25F, 10F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[536].setRotationPoint(58F, -23.25F, 10F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[537].setRotationPoint(54F, -22.5F, 10F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[538].setRotationPoint(58F, -22.5F, 10F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[539].setRotationPoint(54F, -21.75F, 10F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[540].setRotationPoint(58F, -21.75F, 10F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[541].setRotationPoint(58F, -28.5F, 10F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[542].setRotationPoint(54F, -28.5F, 10F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[543].setRotationPoint(54F, -27.75F, 10F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[544].setRotationPoint(58F, -27.75F, 10F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[545].setRotationPoint(62F, -28F, -11F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[546].setRotationPoint(71F, -28F, -11F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[547].setRotationPoint(63F, -21F, -11F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[548].setRotationPoint(63F, -29F, -11F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[549].setRotationPoint(67F, -28F, -11F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[550].setRotationPoint(63F, -27F, -11F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[551].setRotationPoint(67F, -27F, -11F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[552].setRotationPoint(63F, -26.25F, -11F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[553].setRotationPoint(67F, -26.25F, -11F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[554].setRotationPoint(63F, -25.5F, -11F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[555].setRotationPoint(67F, -25.5F, -11F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[556].setRotationPoint(63F, -24.75F, -11F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[557].setRotationPoint(67F, -24.75F, -11F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[558].setRotationPoint(63F, -24F, -11F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[559].setRotationPoint(67F, -24F, -11F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[560].setRotationPoint(63F, -23.25F, -11F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[561].setRotationPoint(67F, -23.25F, -11F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[562].setRotationPoint(63F, -22.5F, -11F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[563].setRotationPoint(67F, -22.5F, -11F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[564].setRotationPoint(63F, -21.75F, -11F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[565].setRotationPoint(67F, -21.75F, -11F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[566].setRotationPoint(67F, -28.5F, -11F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[567].setRotationPoint(63F, -28.5F, -11F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[568].setRotationPoint(63F, -27.75F, -11F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[569].setRotationPoint(67F, -27.75F, -11F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[570].setRotationPoint(62F, -28F, 10F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[571].setRotationPoint(71F, -28F, 10F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[572].setRotationPoint(63F, -21F, 10F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[573].setRotationPoint(63F, -29F, 10F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[574].setRotationPoint(67F, -28F, 10F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[575].setRotationPoint(63F, -27F, 10F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[576].setRotationPoint(67F, -27F, 10F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[577].setRotationPoint(63F, -26.25F, 10F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[578].setRotationPoint(67F, -26.25F, 10F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[579].setRotationPoint(63F, -25.5F, 10F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[580].setRotationPoint(67F, -25.5F, 10F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[581].setRotationPoint(63F, -24.75F, 10F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[582].setRotationPoint(67F, -24.75F, 10F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[583].setRotationPoint(63F, -24F, 10F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[584].setRotationPoint(67F, -24F, 10F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[585].setRotationPoint(63F, -23.25F, 10F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[586].setRotationPoint(67F, -23.25F, 10F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[587].setRotationPoint(63F, -22.5F, 10F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[588].setRotationPoint(67F, -22.5F, 10F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[589].setRotationPoint(63F, -21.75F, 10F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[590].setRotationPoint(67F, -21.75F, 10F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[591].setRotationPoint(67F, -28.5F, 10F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[592].setRotationPoint(63F, -28.5F, 10F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[593].setRotationPoint(63F, -27.75F, 10F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[594].setRotationPoint(67F, -27.75F, 10F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[595].setRotationPoint(45F, -22F, 10F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[596].setRotationPoint(45F, -28F, 10F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[597].setRotationPoint(45F, -28F, 10F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[598].setRotationPoint(52F, -28F, 10F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[599].setRotationPoint(26F, -28F, 10F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[600].setRotationPoint(35F, -28F, 10F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[601].setRotationPoint(27F, -21F, 10F);

		bodyModel[602].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[602].setRotationPoint(27F, -29F, 10F);

		bodyModel[603].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[603].setRotationPoint(31F, -28F, 10F);

		bodyModel[604].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[604].setRotationPoint(27F, -27F, 10F);

		bodyModel[605].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[605].setRotationPoint(31F, -27F, 10F);

		bodyModel[606].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[606].setRotationPoint(27F, -26.25F, 10F);

		bodyModel[607].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[607].setRotationPoint(31F, -26.25F, 10F);

		bodyModel[608].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[608].setRotationPoint(27F, -25.5F, 10F);

		bodyModel[609].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[609].setRotationPoint(31F, -25.5F, 10F);

		bodyModel[610].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[610].setRotationPoint(27F, -24.75F, 10F);

		bodyModel[611].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[611].setRotationPoint(31F, -24.75F, 10F);

		bodyModel[612].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[612].setRotationPoint(27F, -24F, 10F);

		bodyModel[613].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[613].setRotationPoint(31F, -24F, 10F);

		bodyModel[614].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[614].setRotationPoint(27F, -23.25F, 10F);

		bodyModel[615].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[615].setRotationPoint(31F, -23.25F, 10F);

		bodyModel[616].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[616].setRotationPoint(27F, -22.5F, 10F);

		bodyModel[617].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[617].setRotationPoint(31F, -22.5F, 10F);

		bodyModel[618].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[618].setRotationPoint(27F, -21.75F, 10F);

		bodyModel[619].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[619].setRotationPoint(31F, -21.75F, 10F);

		bodyModel[620].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[620].setRotationPoint(31F, -28.5F, 10F);

		bodyModel[621].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[621].setRotationPoint(27F, -28.5F, 10F);

		bodyModel[622].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[622].setRotationPoint(27F, -27.75F, 10F);

		bodyModel[623].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[623].setRotationPoint(31F, -27.75F, 10F);

		bodyModel[624].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[624].setRotationPoint(35F, -28F, 10F);

		bodyModel[625].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[625].setRotationPoint(44F, -28F, 10F);

		bodyModel[626].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[626].setRotationPoint(36F, -21F, 10F);

		bodyModel[627].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[627].setRotationPoint(36F, -29F, 10F);

		bodyModel[628].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[628].setRotationPoint(40F, -28F, 10F);

		bodyModel[629].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[629].setRotationPoint(36F, -27F, 10F);

		bodyModel[630].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[630].setRotationPoint(40F, -27F, 10F);

		bodyModel[631].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[631].setRotationPoint(36F, -26.25F, 10F);

		bodyModel[632].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[632].setRotationPoint(40F, -26.25F, 10F);

		bodyModel[633].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[633].setRotationPoint(36F, -25.5F, 10F);

		bodyModel[634].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[634].setRotationPoint(40F, -25.5F, 10F);

		bodyModel[635].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[635].setRotationPoint(36F, -24.75F, 10F);

		bodyModel[636].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[636].setRotationPoint(40F, -24.75F, 10F);

		bodyModel[637].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[637].setRotationPoint(36F, -24F, 10F);

		bodyModel[638].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[638].setRotationPoint(40F, -24F, 10F);

		bodyModel[639].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[639].setRotationPoint(36F, -23.25F, 10F);

		bodyModel[640].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[640].setRotationPoint(40F, -23.25F, 10F);

		bodyModel[641].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[641].setRotationPoint(36F, -22.5F, 10F);

		bodyModel[642].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[642].setRotationPoint(40F, -22.5F, 10F);

		bodyModel[643].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[643].setRotationPoint(36F, -21.75F, 10F);

		bodyModel[644].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[644].setRotationPoint(40F, -21.75F, 10F);

		bodyModel[645].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[645].setRotationPoint(40F, -28.5F, 10F);

		bodyModel[646].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[646].setRotationPoint(36F, -28.5F, 10F);

		bodyModel[647].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[647].setRotationPoint(36F, -27.75F, 10F);

		bodyModel[648].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[648].setRotationPoint(40F, -27.75F, 10F);

		bodyModel[649].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[649].setRotationPoint(53F, -28F, -11F);

		bodyModel[650].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[650].setRotationPoint(62F, -28F, -11F);

		bodyModel[651].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[651].setRotationPoint(54F, -21F, -11F);

		bodyModel[652].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[652].setRotationPoint(54F, -29F, -11F);

		bodyModel[653].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[653].setRotationPoint(58F, -28F, -11F);

		bodyModel[654].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[654].setRotationPoint(54F, -27F, -11F);

		bodyModel[655].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[655].setRotationPoint(58F, -27F, -11F);

		bodyModel[656].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[656].setRotationPoint(54F, -26.25F, -11F);

		bodyModel[657].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[657].setRotationPoint(58F, -26.25F, -11F);

		bodyModel[658].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[658].setRotationPoint(54F, -25.5F, -11F);

		bodyModel[659].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[659].setRotationPoint(58F, -25.5F, -11F);

		bodyModel[660].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[660].setRotationPoint(54F, -24.75F, -11F);

		bodyModel[661].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[661].setRotationPoint(58F, -24.75F, -11F);

		bodyModel[662].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[662].setRotationPoint(54F, -24F, -11F);

		bodyModel[663].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[663].setRotationPoint(58F, -24F, -11F);

		bodyModel[664].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[664].setRotationPoint(54F, -23.25F, -11F);

		bodyModel[665].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[665].setRotationPoint(58F, -23.25F, -11F);

		bodyModel[666].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[666].setRotationPoint(54F, -22.5F, -11F);

		bodyModel[667].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[667].setRotationPoint(58F, -22.5F, -11F);

		bodyModel[668].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[668].setRotationPoint(54F, -21.75F, -11F);

		bodyModel[669].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[669].setRotationPoint(58F, -21.75F, -11F);

		bodyModel[670].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[670].setRotationPoint(58F, -28.5F, -11F);

		bodyModel[671].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[671].setRotationPoint(54F, -28.5F, -11F);

		bodyModel[672].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[672].setRotationPoint(54F, -27.75F, -11F);

		bodyModel[673].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[673].setRotationPoint(58F, -27.75F, -11F);

		bodyModel[674].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[674].setRotationPoint(35F, -28F, -11F);

		bodyModel[675].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[675].setRotationPoint(44F, -28F, -11F);

		bodyModel[676].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[676].setRotationPoint(36F, -21F, -11F);

		bodyModel[677].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[677].setRotationPoint(36F, -29F, -11F);

		bodyModel[678].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[678].setRotationPoint(40F, -28F, -11F);

		bodyModel[679].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[679].setRotationPoint(36F, -27F, -11F);

		bodyModel[680].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[680].setRotationPoint(40F, -27F, -11F);

		bodyModel[681].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[681].setRotationPoint(36F, -26.25F, -11F);

		bodyModel[682].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[682].setRotationPoint(40F, -26.25F, -11F);

		bodyModel[683].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[683].setRotationPoint(36F, -25.5F, -11F);

		bodyModel[684].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[684].setRotationPoint(40F, -25.5F, -11F);

		bodyModel[685].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[685].setRotationPoint(36F, -24.75F, -11F);

		bodyModel[686].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[686].setRotationPoint(40F, -24.75F, -11F);

		bodyModel[687].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[687].setRotationPoint(36F, -24F, -11F);

		bodyModel[688].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[688].setRotationPoint(40F, -24F, -11F);

		bodyModel[689].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[689].setRotationPoint(36F, -23.25F, -11F);

		bodyModel[690].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[690].setRotationPoint(40F, -23.25F, -11F);

		bodyModel[691].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[691].setRotationPoint(36F, -22.5F, -11F);

		bodyModel[692].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[692].setRotationPoint(40F, -22.5F, -11F);

		bodyModel[693].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[693].setRotationPoint(36F, -21.75F, -11F);

		bodyModel[694].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[694].setRotationPoint(40F, -21.75F, -11F);

		bodyModel[695].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[695].setRotationPoint(40F, -28.5F, -11F);

		bodyModel[696].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[696].setRotationPoint(36F, -28.5F, -11F);

		bodyModel[697].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[697].setRotationPoint(36F, -27.75F, -11F);

		bodyModel[698].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[698].setRotationPoint(40F, -27.75F, -11F);

		bodyModel[699].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[699].setRotationPoint(45F, -22F, -11F);

		bodyModel[700].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[700].setRotationPoint(45F, -28F, -11F);

		bodyModel[701].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[701].setRotationPoint(45F, -28F, -11F);

		bodyModel[702].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[702].setRotationPoint(52F, -28F, -11F);

		bodyModel[703].addShapeBox(0F, 0F, 0F, 2, 3, 16, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F); // Du loco part41
		bodyModel[703].setRotationPoint(98F, -10F, -8F);

		bodyModel[704].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[704].setRotationPoint(97F, -29F, 2F);

		bodyModel[705].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[705].setRotationPoint(97F, -29F, 2F);

		bodyModel[706].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[706].setRotationPoint(97F, -23F, 2F);

		bodyModel[707].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[707].setRotationPoint(-2F, -29F, -3F);

		bodyModel[708].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[708].setRotationPoint(-2F, -29F, -6F);

		bodyModel[709].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[709].setRotationPoint(-2F, -23F, -6F);

		bodyModel[710].addShapeBox(0F, 0F, 0F, 3, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[710].setRotationPoint(-2F, -29F, 2F);

		bodyModel[711].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[711].setRotationPoint(-2F, -29F, 2F);

		bodyModel[712].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[712].setRotationPoint(-2F, -23F, 2F);

		bodyModel[713].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Du loco part06
		bodyModel[713].setRotationPoint(19F, -5F, -7F);

		bodyModel[714].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[714].setRotationPoint(18.5F, -11F, -7F);

		bodyModel[715].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[715].setRotationPoint(24.5F, -11F, -7F);

		bodyModel[716].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[716].setRotationPoint(17.5F, -9.5F, -8F);

		bodyModel[717].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[717].setRotationPoint(28F, -10F, -10F);

		bodyModel[718].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[718].setRotationPoint(31F, -10F, -10F);

		bodyModel[719].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Du loco part06
		bodyModel[719].setRotationPoint(31F, -7F, -10F);

		bodyModel[720].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, -1.75F, 0F, -2.75F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[720].setRotationPoint(28F, -7F, -10F);

		bodyModel[721].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part06
		bodyModel[721].setRotationPoint(11F, -7F, -8F);

		bodyModel[722].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[722].setRotationPoint(21F, -7F, -9F);

		bodyModel[723].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[723].setRotationPoint(21F, -6F, -9F);

		bodyModel[724].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part06
		bodyModel[724].setRotationPoint(35F, -9F, -8F);

		bodyModel[725].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Du loco part06
		bodyModel[725].setRotationPoint(38F, -7F, -8F);

		bodyModel[726].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[726].setRotationPoint(42.5F, -9.5F, -8F);

		bodyModel[727].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Du loco part06
		bodyModel[727].setRotationPoint(36F, -5F, -7F);

		bodyModel[728].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[728].setRotationPoint(35.5F, -11F, -7F);

		bodyModel[729].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[729].setRotationPoint(41.5F, -11F, -7F);

		bodyModel[730].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[730].setRotationPoint(34.5F, -9.5F, -8F);

		bodyModel[731].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[731].setRotationPoint(38F, -7F, -9F);

		bodyModel[732].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[732].setRotationPoint(38F, -6F, -9F);

		bodyModel[733].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part06
		bodyModel[733].setRotationPoint(55F, -9F, -8F);

		bodyModel[734].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Du loco part06
		bodyModel[734].setRotationPoint(58F, -7F, -8F);

		bodyModel[735].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[735].setRotationPoint(62.5F, -9.5F, -8F);

		bodyModel[736].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Du loco part06
		bodyModel[736].setRotationPoint(56F, -5F, -7F);

		bodyModel[737].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[737].setRotationPoint(55.5F, -11F, -7F);

		bodyModel[738].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[738].setRotationPoint(61.5F, -11F, -7F);

		bodyModel[739].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[739].setRotationPoint(54.5F, -9.5F, -8F);

		bodyModel[740].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[740].setRotationPoint(58F, -7F, -9F);

		bodyModel[741].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[741].setRotationPoint(58F, -6F, -9F);

		bodyModel[742].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part06
		bodyModel[742].setRotationPoint(72F, -9F, -8F);

		bodyModel[743].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Du loco part06
		bodyModel[743].setRotationPoint(75F, -7F, -8F);

		bodyModel[744].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[744].setRotationPoint(79.5F, -9.5F, -8F);

		bodyModel[745].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Du loco part06
		bodyModel[745].setRotationPoint(73F, -5F, -7F);

		bodyModel[746].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[746].setRotationPoint(72.5F, -11F, -7F);

		bodyModel[747].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[747].setRotationPoint(78.5F, -11F, -7F);

		bodyModel[748].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[748].setRotationPoint(71.5F, -9.5F, -8F);

		bodyModel[749].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[749].setRotationPoint(75F, -7F, -9F);

		bodyModel[750].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[750].setRotationPoint(75F, -6F, -9F);

		bodyModel[751].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[751].setRotationPoint(46.5F, -10F, -10F);

		bodyModel[752].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[752].setRotationPoint(49.5F, -10F, -10F);

		bodyModel[753].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Du loco part06
		bodyModel[753].setRotationPoint(49.5F, -7F, -10F);

		bodyModel[754].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, -1.75F, 0F, -2.75F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[754].setRotationPoint(46.5F, -7F, -10F);

		bodyModel[755].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[755].setRotationPoint(65F, -10F, -10F);

		bodyModel[756].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[756].setRotationPoint(68F, -10F, -10F);

		bodyModel[757].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, -1.75F, 0F, 0F); // Du loco part06
		bodyModel[757].setRotationPoint(68F, -7F, -10F);

		bodyModel[758].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, -1.75F, 0F, -2.75F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[758].setRotationPoint(65F, -7F, -10F);

		bodyModel[759].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part06
		bodyModel[759].setRotationPoint(80F, -7F, -8F);

		bodyModel[760].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[760].setRotationPoint(63.5F, -7F, -8F);

		bodyModel[761].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[761].setRotationPoint(43.5F, -7F, -8F);

		bodyModel[762].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[762].setRotationPoint(26.5F, -7F, -8F);

		bodyModel[763].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[763].setRotationPoint(28F, -10F, -10F);

		bodyModel[764].addShapeBox(0F, 0F, 0F, 8, 6, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[764].setRotationPoint(45F, -10F, -10F);

		bodyModel[765].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[765].setRotationPoint(65F, -10F, -10F);

		bodyModel[766].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Du loco part06
		bodyModel[766].setRotationPoint(10.5F, -11.5F, -8F);

		bodyModel[767].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Du loco part06
		bodyModel[767].setRotationPoint(86.5F, -11.5F, -8F);

		bodyModel[768].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part06
		bodyModel[768].setRotationPoint(18F, -9F, 7F);

		bodyModel[769].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Du loco part06
		bodyModel[769].setRotationPoint(21F, -7F, 6F);

		bodyModel[770].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[770].setRotationPoint(25.5F, -9.5F, 7F);

		bodyModel[771].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Du loco part06
		bodyModel[771].setRotationPoint(19F, -5F, 6F);

		bodyModel[772].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[772].setRotationPoint(18.5F, -11F, 6F);

		bodyModel[773].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[773].setRotationPoint(24.5F, -11F, 6F);

		bodyModel[774].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[774].setRotationPoint(17.5F, -9.5F, 7F);

		bodyModel[775].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[775].setRotationPoint(28F, -10F, 7F);

		bodyModel[776].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[776].setRotationPoint(31F, -10F, 7F);

		bodyModel[777].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, -1.75F, 0F, -2.75F); // Du loco part06
		bodyModel[777].setRotationPoint(31F, -7F, 7F);

		bodyModel[778].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -2.75F, 0F, 0F, -2.75F); // Du loco part06
		bodyModel[778].setRotationPoint(28F, -7F, 7F);

		bodyModel[779].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part06
		bodyModel[779].setRotationPoint(11F, -7F, 7F);

		bodyModel[780].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[780].setRotationPoint(21F, -7F, 8F);

		bodyModel[781].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[781].setRotationPoint(21F, -6F, 8F);

		bodyModel[782].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part06
		bodyModel[782].setRotationPoint(35F, -9F, 7F);

		bodyModel[783].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Du loco part06
		bodyModel[783].setRotationPoint(38F, -7F, 6F);

		bodyModel[784].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[784].setRotationPoint(42.5F, -9.5F, 7F);

		bodyModel[785].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Du loco part06
		bodyModel[785].setRotationPoint(36F, -5F, 6F);

		bodyModel[786].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[786].setRotationPoint(35.5F, -11F, 6F);

		bodyModel[787].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[787].setRotationPoint(41.5F, -11F, 6F);

		bodyModel[788].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[788].setRotationPoint(34.5F, -9.5F, 7F);

		bodyModel[789].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[789].setRotationPoint(38F, -7F, 8F);

		bodyModel[790].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[790].setRotationPoint(38F, -6F, 8F);

		bodyModel[791].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part06
		bodyModel[791].setRotationPoint(55F, -9F, 7F);

		bodyModel[792].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Du loco part06
		bodyModel[792].setRotationPoint(58F, -7F, 6F);

		bodyModel[793].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[793].setRotationPoint(62.5F, -9.5F, 7F);

		bodyModel[794].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Du loco part06
		bodyModel[794].setRotationPoint(56F, -5F, 6F);

		bodyModel[795].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[795].setRotationPoint(55.5F, -11F, 6F);

		bodyModel[796].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[796].setRotationPoint(61.5F, -11F, 6F);

		bodyModel[797].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[797].setRotationPoint(54.5F, -9.5F, 7F);

		bodyModel[798].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[798].setRotationPoint(58F, -7F, 8F);

		bodyModel[799].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[799].setRotationPoint(58F, -6F, 8F);

		bodyModel[800].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part06
		bodyModel[800].setRotationPoint(72F, -9F, 7F);

		bodyModel[801].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Du loco part06
		bodyModel[801].setRotationPoint(75F, -7F, 6F);

		bodyModel[802].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[802].setRotationPoint(79.5F, -9.5F, 7F);

		bodyModel[803].addBox(0F, 0F, 0F, 6, 1, 1, 0F); // Du loco part06
		bodyModel[803].setRotationPoint(73F, -5F, 6F);

		bodyModel[804].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[804].setRotationPoint(72.5F, -11F, 6F);

		bodyModel[805].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part06
		bodyModel[805].setRotationPoint(78.5F, -11F, 6F);

		bodyModel[806].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part06
		bodyModel[806].setRotationPoint(71.5F, -9.5F, 7F);

		bodyModel[807].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[807].setRotationPoint(75F, -7F, 8F);

		bodyModel[808].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part01
		bodyModel[808].setRotationPoint(75F, -6F, 8F);

		bodyModel[809].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[809].setRotationPoint(46.5F, -10F, 7F);

		bodyModel[810].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[810].setRotationPoint(49.5F, -10F, 7F);

		bodyModel[811].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, -1.75F, 0F, -2.75F); // Du loco part06
		bodyModel[811].setRotationPoint(49.5F, -7F, 7F);

		bodyModel[812].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -2.75F, 0F, 0F, -2.75F); // Du loco part06
		bodyModel[812].setRotationPoint(46.5F, -7F, 7F);

		bodyModel[813].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[813].setRotationPoint(65F, -10F, 7F);

		bodyModel[814].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[814].setRotationPoint(68F, -10F, 7F);

		bodyModel[815].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, -1.75F, 0F, -2.75F); // Du loco part06
		bodyModel[815].setRotationPoint(68F, -7F, 7F);

		bodyModel[816].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -2.75F, 0F, 0F, -2.75F); // Du loco part06
		bodyModel[816].setRotationPoint(65F, -7F, 7F);

		bodyModel[817].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F); // Du loco part06
		bodyModel[817].setRotationPoint(80F, -7F, 7F);

		bodyModel[818].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[818].setRotationPoint(63.5F, -7F, 7F);

		bodyModel[819].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[819].setRotationPoint(43.5F, -7F, 7F);

		bodyModel[820].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part06
		bodyModel[820].setRotationPoint(26.5F, -7F, 7F);

		bodyModel[821].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[821].setRotationPoint(28F, -10F, 7F);

		bodyModel[822].addShapeBox(0F, 0F, 0F, 8, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[822].setRotationPoint(45F, -10F, 7F);

		bodyModel[823].addShapeBox(0F, 0F, 0F, 5, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[823].setRotationPoint(65F, -10F, 7F);

		bodyModel[824].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Du loco part06
		bodyModel[824].setRotationPoint(10.5F, -11.5F, 7F);

		bodyModel[825].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Du loco part06
		bodyModel[825].setRotationPoint(86.5F, -11.5F, 7F);

		bodyModel[826].addShapeBox(0F, 0F, 0F, 32, 5, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[826].setRotationPoint(33F, -35F, -2F);

		bodyModel[827].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 149
		bodyModel[827].setRotationPoint(38F, -32F, 9F);

		bodyModel[828].addShapeBox(0F, 0F, 0F, 26, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 149
		bodyModel[828].setRotationPoint(36F, -34F, 6F);

		bodyModel[829].addShapeBox(0F, 0F, 0F, 30, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 149
		bodyModel[829].setRotationPoint(34F, -35F, 2F);

		bodyModel[830].addShapeBox(0F, 0F, 0F, 30, 5, 4, 0F,-2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[830].setRotationPoint(34F, -35F, -6F);

		bodyModel[831].addShapeBox(0F, 0F, 0F, 26, 4, 3, 0F,-2F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[831].setRotationPoint(36F, -34F, -9F);

		bodyModel[832].addShapeBox(0F, 0F, 0F, 22, 2, 2, 0F,-1.5F, -2F, 0F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[832].setRotationPoint(38F, -32F, -11F);

		bodyModel[833].addShapeBox(0F, 0F, 0F, 32, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part08
		bodyModel[833].setRotationPoint(33F, -35F, 0F);

		bodyModel[834].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part37
		bodyModel[834].setRotationPoint(33F, -35F, -6F);

		bodyModel[835].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part37
		bodyModel[835].setRotationPoint(29F, -36F, 0F);

		bodyModel[836].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Du loco part37
		bodyModel[836].setRotationPoint(58F, -35F, 6F);

		bodyModel[837].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Du loco part37
		bodyModel[837].setRotationPoint(58F, -35F, -8F);

		bodyModel[838].addBox(0F, 0F, 0F, 1, 4, 2, 0F); // Du loco part37
		bodyModel[838].setRotationPoint(39F, -35F, -8F);

		bodyModel[839].addShapeBox(0F, 0F, 0F, 18, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[839].setRotationPoint(40F, -35F, -7F);

		bodyModel[840].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,-7F, 0F, 0F, 0F, 0F, 0F, -7F, -1F, 0F, 0F, -1F, 0F, -7F, -1F, 0F, 0F, -1F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[840].setRotationPoint(59F, -36F, -5F);

		bodyModel[841].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part37
		bodyModel[841].setRotationPoint(65F, -36F, -6F);

		bodyModel[842].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part37
		bodyModel[842].setRotationPoint(59F, -35F, -7F);

		bodyModel[843].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part37
		bodyModel[843].setRotationPoint(29F, -35F, -6F);

		bodyModel[844].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part37
		bodyModel[844].setRotationPoint(33F, -34F, -8F);

		bodyModel[845].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Du loco part37
		bodyModel[845].setRotationPoint(29F, -36F, -6F);

		bodyModel[846].addShapeBox(0F, 0F, 0F, 5, 2, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[846].setRotationPoint(34F, -35F, -7F);

		bodyModel[847].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part37
		bodyModel[847].setRotationPoint(31F, -35F, 1F);

		bodyModel[848].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 1F, 0F); // Du loco part37
		bodyModel[848].setRotationPoint(28F, -36F, 1F);

		bodyModel[849].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F); // Du loco part37
		bodyModel[849].setRotationPoint(30F, -35F, -5F);

		bodyModel[850].addShapeBox(0F, 0F, 0F, 3, 1, 6, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F); // Du loco part37
		bodyModel[850].setRotationPoint(30F, -36F, -5F);

		bodyModel[851].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F); // Du loco part37
		bodyModel[851].setRotationPoint(32F, -35F, 1F);

		bodyModel[852].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[852].setRotationPoint(44F, -28F, 10F);

		bodyModel[853].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[853].setRotationPoint(53F, -28F, 10F);

		bodyModel[854].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[854].setRotationPoint(45F, -21F, 10F);

		bodyModel[855].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[855].setRotationPoint(45F, -29F, 10F);

		bodyModel[856].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[856].setRotationPoint(45F, -27F, 10F);

		bodyModel[857].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[857].setRotationPoint(49F, -28F, 10F);

		bodyModel[858].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[858].setRotationPoint(49F, -27F, 10F);

		bodyModel[859].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[859].setRotationPoint(45F, -26.25F, 10F);

		bodyModel[860].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[860].setRotationPoint(49F, -26.25F, 10F);

		bodyModel[861].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[861].setRotationPoint(45F, -25.5F, 10F);

		bodyModel[862].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[862].setRotationPoint(49F, -25.5F, 10F);

		bodyModel[863].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[863].setRotationPoint(45F, -24.75F, 10F);

		bodyModel[864].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[864].setRotationPoint(49F, -24.75F, 10F);

		bodyModel[865].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[865].setRotationPoint(45F, -24F, 10F);

		bodyModel[866].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[866].setRotationPoint(49F, -24F, 10F);

		bodyModel[867].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[867].setRotationPoint(45F, -23.25F, 10F);

		bodyModel[868].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[868].setRotationPoint(49F, -23.25F, 10F);

		bodyModel[869].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[869].setRotationPoint(45F, -22.5F, 10F);

		bodyModel[870].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[870].setRotationPoint(49F, -22.5F, 10F);

		bodyModel[871].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[871].setRotationPoint(45F, -21.75F, 10F);

		bodyModel[872].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[872].setRotationPoint(49F, -21.75F, 10F);

		bodyModel[873].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[873].setRotationPoint(49F, -28.5F, 10F);

		bodyModel[874].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[874].setRotationPoint(45F, -28.5F, 10F);

		bodyModel[875].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[875].setRotationPoint(45F, -27.75F, 10F);

		bodyModel[876].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[876].setRotationPoint(49F, -27.75F, 10F);

		bodyModel[877].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[877].setRotationPoint(44F, -28F, -11F);

		bodyModel[878].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[878].setRotationPoint(53F, -28F, -11F);

		bodyModel[879].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[879].setRotationPoint(45F, -21F, -11F);

		bodyModel[880].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[880].setRotationPoint(45F, -29F, -11F);

		bodyModel[881].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[881].setRotationPoint(45F, -27F, -11F);

		bodyModel[882].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[882].setRotationPoint(49F, -28F, -11F);

		bodyModel[883].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[883].setRotationPoint(49F, -27F, -11F);

		bodyModel[884].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[884].setRotationPoint(45F, -26.25F, -11F);

		bodyModel[885].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[885].setRotationPoint(49F, -26.25F, -11F);

		bodyModel[886].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[886].setRotationPoint(45F, -25.5F, -11F);

		bodyModel[887].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[887].setRotationPoint(49F, -25.5F, -11F);

		bodyModel[888].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[888].setRotationPoint(45F, -24.75F, -11F);

		bodyModel[889].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[889].setRotationPoint(49F, -24.75F, -11F);

		bodyModel[890].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[890].setRotationPoint(45F, -24F, -11F);

		bodyModel[891].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[891].setRotationPoint(49F, -24F, -11F);

		bodyModel[892].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[892].setRotationPoint(45F, -23.25F, -11F);

		bodyModel[893].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[893].setRotationPoint(49F, -23.25F, -11F);

		bodyModel[894].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[894].setRotationPoint(45F, -22.5F, -11F);

		bodyModel[895].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[895].setRotationPoint(49F, -22.5F, -11F);

		bodyModel[896].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[896].setRotationPoint(45F, -21.75F, -11F);

		bodyModel[897].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[897].setRotationPoint(49F, -21.75F, -11F);

		bodyModel[898].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[898].setRotationPoint(49F, -28.5F, -11F);

		bodyModel[899].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[899].setRotationPoint(45F, -28.5F, -11F);

		bodyModel[900].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[900].setRotationPoint(45F, -27.75F, -11F);

		bodyModel[901].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[901].setRotationPoint(49F, -27.75F, -11F);

		bodyModel[902].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[902].setRotationPoint(100F, -20F, -7F);

		bodyModel[903].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[903].setRotationPoint(100F, -20F, 1F);

		bodyModel[904].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[904].setRotationPoint(99.99F, -20F, -2F);

		bodyModel[905].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part42
		bodyModel[905].setRotationPoint(-3F, -6F, 4F);

		bodyModel[906].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -1F, 0F, -5.875F, -1F, 0F, -2F, 0F, 0F, -3.875F, 0F, 0F, -1F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -5.875F, 0F, 0F); // Du loco part42
		bodyModel[906].setRotationPoint(-4F, -7F, 4F);

		bodyModel[907].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-1F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F, -2F, 0F, 0F, -3.875F, 0F, 0F); // Du loco part42
		bodyModel[907].setRotationPoint(-4F, -3F, 4F);

		bodyModel[908].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[908].setRotationPoint(-3F, -6F, -10F);

		bodyModel[909].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-3.875F, 0F, 0F, -2F, 0F, 0F, -5.875F, -1F, 0F, 0F, -1F, 0F, -5.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, -1F, 1F, 0F); // Du loco part42
		bodyModel[909].setRotationPoint(-4F, -7F, -10F);

		bodyModel[910].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-5.875F, 1F, 0F, 0F, 1F, 0F, -4.875F, 0F, 0F, -1F, 0F, 0F, -3.875F, 0F, 0F, -2F, 0F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[910].setRotationPoint(-4F, -3F, -10F);

		bodyModel[911].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[911].setRotationPoint(96F, -6F, 4F);

		bodyModel[912].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-5.875F, -1F, 0F, 0F, -1F, 0F, -3.875F, 0F, 0F, -2F, 0F, 0F, -4.875F, 1F, 0F, -1F, 1F, 0F, -5.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[912].setRotationPoint(96F, -7F, 4F);

		bodyModel[913].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-4.875F, 0F, 0F, -1F, 0F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F, -3.875F, 0F, 0F, -2F, 0F, 0F); // Du loco part42
		bodyModel[913].setRotationPoint(96F, -3F, 4F);

		bodyModel[914].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[914].setRotationPoint(96F, -6F, -10F);

		bodyModel[915].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-2F, 0F, 0F, -3.875F, 0F, 0F, 0F, -1F, 0F, -5.875F, -1F, 0F, 0F, 0F, 0F, -5.875F, 0F, 0F, -1F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[915].setRotationPoint(96F, -7F, -10F);

		bodyModel[916].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 1F, 0F, -5.875F, 1F, 0F, -1F, 0F, 0F, -4.875F, 0F, 0F, -2F, 0F, 0F, -3.875F, 0F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F); // Du loco part42
		bodyModel[916].setRotationPoint(96F, -3F, -10F);

		bodyModel[917].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F); // Du loco part41
		bodyModel[917].setRotationPoint(-2F, -5F, 4F);

		bodyModel[918].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[918].setRotationPoint(98F, -5F, -5F);

		bodyModel[919].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F); // Du loco part41
		bodyModel[919].setRotationPoint(98F, -5F, 4F);

		bodyModel[920].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[920].setRotationPoint(78F, -16F, -2F);

		bodyModel[921].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[921].setRotationPoint(77F, -22F, -3F);

		bodyModel[922].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[922].setRotationPoint(77F, -24F, -3F);

		bodyModel[923].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 142
		bodyModel[923].setRotationPoint(78F, -25F, -2F);

		bodyModel[924].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 143
		bodyModel[924].setRotationPoint(77F, -26F, -3F);

		bodyModel[925].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 144
		bodyModel[925].setRotationPoint(77F, -30F, -3F);

		bodyModel[926].addBox(0F, 0F, 0F, 12, 15, 12, 0F); // Box 145
		bodyModel[926].setRotationPoint(62F, -27F, -5F);

		bodyModel[927].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 146
		bodyModel[927].setRotationPoint(61F, -28F, -6F);

		bodyModel[928].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[928].setRotationPoint(75F, -19F, -4F);

		bodyModel[929].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 148
		bodyModel[929].setRotationPoint(75F, -26F, -4F);

		bodyModel[930].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[930].setRotationPoint(74F, -26F, -4F);
	}
}