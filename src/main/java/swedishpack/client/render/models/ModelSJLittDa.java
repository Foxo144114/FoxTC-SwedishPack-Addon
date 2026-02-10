//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera Da
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittDa extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittDa()//Same as Filename
	{
		bodyModel = new ModelRendererTurbo[602];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[1] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Du loco part03
		bodyModel[2] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Du loco part05
		bodyModel[3] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Du loco part06
		bodyModel[4] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Du loco part07
		bodyModel[5] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Du loco part08
		bodyModel[6] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Du loco part09
		bodyModel[7] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Du loco part17
		bodyModel[8] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Du loco part19
		bodyModel[9] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Du loco part20
		bodyModel[10] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Du loco part22
		bodyModel[11] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Du loco part27
		bodyModel[12] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Du loco part28
		bodyModel[13] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Du loco part41
		bodyModel[14] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Du loco part82
		bodyModel[15] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part83
		bodyModel[16] = new ModelRendererTurbo(this, 0, 7, textureX, textureY); // Du loco part84
		bodyModel[17] = new ModelRendererTurbo(this, 183, 7, textureX, textureY); // Du loco part85
		bodyModel[18] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Du loco part94
		bodyModel[19] = new ModelRendererTurbo(this, 208, 8, textureX, textureY); // Du loco part95
		bodyModel[20] = new ModelRendererTurbo(this, 392, 8, textureX, textureY); // Du loco part97
		bodyModel[21] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Du loco part100
		bodyModel[22] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Du loco part101
		bodyModel[23] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Du loco part102
		bodyModel[24] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Lamp
		bodyModel[25] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Lamp
		bodyModel[26] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Lamp
		bodyModel[27] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Lamp
		bodyModel[28] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 149
		bodyModel[29] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 167
		bodyModel[30] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 168
		bodyModel[31] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 174
		bodyModel[32] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 177
		bodyModel[33] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 194
		bodyModel[34] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 195
		bodyModel[35] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 135
		bodyModel[36] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 136
		bodyModel[37] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 138
		bodyModel[38] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 139
		bodyModel[39] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 141
		bodyModel[40] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 142
		bodyModel[41] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 143
		bodyModel[42] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 144
		bodyModel[43] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 145
		bodyModel[44] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 146
		bodyModel[45] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 147
		bodyModel[46] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 148
		bodyModel[47] = new ModelRendererTurbo(this, 153, 41, textureX, textureY); // Box 149
		bodyModel[48] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 150
		bodyModel[49] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 151
		bodyModel[50] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 152
		bodyModel[51] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 153
		bodyModel[52] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 154
		bodyModel[53] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 155
		bodyModel[54] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 156
		bodyModel[55] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 157
		bodyModel[56] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 158
		bodyModel[57] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 159
		bodyModel[58] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 160
		bodyModel[59] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[60] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Du loco part37
		bodyModel[61] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Du loco part37
		bodyModel[62] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Du loco part37
		bodyModel[63] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Du loco part37
		bodyModel[64] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Du loco part37
		bodyModel[65] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Du loco part37
		bodyModel[66] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part42
		bodyModel[67] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Du loco part37
		bodyModel[68] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Du loco part37
		bodyModel[69] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Du loco part37
		bodyModel[70] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Du loco part37
		bodyModel[71] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Du loco part37
		bodyModel[72] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 146
		bodyModel[73] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 146
		bodyModel[74] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Lamp
		bodyModel[75] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Du loco part37
		bodyModel[76] = new ModelRendererTurbo(this, 97, 73, textureX, textureY); // Du loco part37
		bodyModel[77] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 167
		bodyModel[78] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 168
		bodyModel[79] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[80] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[81] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[82] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[83] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[84] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Lamp
		bodyModel[85] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Lamp
		bodyModel[86] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Lamp
		bodyModel[87] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Lamp
		bodyModel[88] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Lamp
		bodyModel[89] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[90] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[91] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[92] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[93] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 149
		bodyModel[94] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 149
		bodyModel[95] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Du loco part37
		bodyModel[96] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part37
		bodyModel[97] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part37
		bodyModel[98] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Du loco part37
		bodyModel[99] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Du loco part37
		bodyModel[100] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Du loco part37
		bodyModel[101] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Du loco part37
		bodyModel[102] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Du loco part37
		bodyModel[103] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Du loco part37
		bodyModel[104] = new ModelRendererTurbo(this, 393, 81, textureX, textureY); // Du loco part23
		bodyModel[105] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Du loco part23
		bodyModel[106] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Du loco part23
		bodyModel[107] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Du loco part23
		bodyModel[108] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Du loco part23
		bodyModel[109] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Du loco part23
		bodyModel[110] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Du loco part23
		bodyModel[111] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Du loco part23
		bodyModel[112] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Du loco part09
		bodyModel[113] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 168
		bodyModel[114] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 167
		bodyModel[115] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 149
		bodyModel[116] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 168
		bodyModel[117] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 168
		bodyModel[118] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 167
		bodyModel[119] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Du loco part71
		bodyModel[120] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Du loco part71
		bodyModel[121] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Du loco part71
		bodyModel[122] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 167
		bodyModel[123] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 167
		bodyModel[124] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 167
		bodyModel[125] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 167
		bodyModel[126] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 167
		bodyModel[127] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Du loco part19
		bodyModel[128] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 168
		bodyModel[129] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 168
		bodyModel[130] = new ModelRendererTurbo(this, 297, 81, textureX, textureY); // Box 168
		bodyModel[131] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 174
		bodyModel[132] = new ModelRendererTurbo(this, 369, 81, textureX, textureY); // Du loco part28
		bodyModel[133] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Du loco part28
		bodyModel[134] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Du loco part28
		bodyModel[135] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Du loco part28
		bodyModel[136] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Du loco part28
		bodyModel[137] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Du loco part28
		bodyModel[138] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Du loco part28
		bodyModel[139] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Du loco part28
		bodyModel[140] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Du loco part28
		bodyModel[141] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Du loco part28
		bodyModel[142] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Du loco part28
		bodyModel[143] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Du loco part28
		bodyModel[144] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Du loco part28
		bodyModel[145] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Du loco part28
		bodyModel[146] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Du loco part05
		bodyModel[147] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Du loco part06
		bodyModel[148] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 167
		bodyModel[149] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 167
		bodyModel[150] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 167
		bodyModel[151] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 168
		bodyModel[152] = new ModelRendererTurbo(this, 337, 97, textureX, textureY); // Box 168
		bodyModel[153] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 168
		bodyModel[154] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Du loco part06
		bodyModel[155] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Du loco part06
		bodyModel[156] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Du loco part06
		bodyModel[157] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Du loco part06
		bodyModel[158] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Du loco part06
		bodyModel[159] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Du loco part06
		bodyModel[160] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Du loco part06
		bodyModel[161] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Du loco part06
		bodyModel[162] = new ModelRendererTurbo(this, 385, 97, textureX, textureY); // Du loco part06
		bodyModel[163] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Du loco part06
		bodyModel[164] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Du loco part06
		bodyModel[165] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Du loco part06
		bodyModel[166] = new ModelRendererTurbo(this, 233, 145, textureX, textureY); // Du loco part06
		bodyModel[167] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Du loco part06
		bodyModel[168] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Du loco part06
		bodyModel[169] = new ModelRendererTurbo(this, 257, 145, textureX, textureY); // Du loco part06
		bodyModel[170] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Du loco part06
		bodyModel[171] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Du loco part06
		bodyModel[172] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part06
		bodyModel[173] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Du loco part06
		bodyModel[174] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Du loco part06
		bodyModel[175] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Du loco part06
		bodyModel[176] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Du loco part06
		bodyModel[177] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Du loco part06
		bodyModel[178] = new ModelRendererTurbo(this, 497, 145, textureX, textureY); // Du loco part06
		bodyModel[179] = new ModelRendererTurbo(this, 177, 129, textureX, textureY); // Du loco part06
		bodyModel[180] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Du loco part06
		bodyModel[181] = new ModelRendererTurbo(this, 209, 153, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[182] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[183] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[184] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[185] = new ModelRendererTurbo(this, 313, 162, textureX, textureY); // Du loco part41
		bodyModel[186] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Du loco part28
		bodyModel[187] = new ModelRendererTurbo(this, 281, 153, textureX, textureY); // Du loco part28
		bodyModel[188] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Du loco part05
		bodyModel[189] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Du loco part06
		bodyModel[190] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part19
		bodyModel[191] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Du loco part22
		bodyModel[192] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Du loco part28
		bodyModel[193] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[194] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[195] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Du loco part Ligjhtpart15
		bodyModel[196] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Du loco part Ligjhtpart13
		bodyModel[197] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 167
		bodyModel[198] = new ModelRendererTurbo(this, 137, 201, textureX, textureY); // Box 168
		bodyModel[199] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[200] = new ModelRendererTurbo(this, 153, 201, textureX, textureY); // Box 167
		bodyModel[201] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 168
		bodyModel[202] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[203] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[204] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[205] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[206] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[207] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[208] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[209] = new ModelRendererTurbo(this, 265, 145, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[210] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[211] = new ModelRendererTurbo(this, 233, 153, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[212] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Lamp
		bodyModel[213] = new ModelRendererTurbo(this, 329, 185, textureX, textureY); // Lamp
		bodyModel[214] = new ModelRendererTurbo(this, 385, 185, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[215] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[216] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 168
		bodyModel[217] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 167
		bodyModel[218] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 149
		bodyModel[219] = new ModelRendererTurbo(this, 249, 153, textureX, textureY); // Box 168
		bodyModel[220] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 168
		bodyModel[221] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 167
		bodyModel[222] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 167
		bodyModel[223] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Box 167
		bodyModel[224] = new ModelRendererTurbo(this, 25, 217, textureX, textureY); // Box 167
		bodyModel[225] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 167
		bodyModel[226] = new ModelRendererTurbo(this, 49, 217, textureX, textureY); // Box 167
		bodyModel[227] = new ModelRendererTurbo(this, 65, 217, textureX, textureY); // Du loco part19
		bodyModel[228] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 168
		bodyModel[229] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 168
		bodyModel[230] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Box 168
		bodyModel[231] = new ModelRendererTurbo(this, 97, 217, textureX, textureY); // Du loco part28
		bodyModel[232] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Du loco part28
		bodyModel[233] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Du loco part28
		bodyModel[234] = new ModelRendererTurbo(this, 225, 217, textureX, textureY); // Du loco part28
		bodyModel[235] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Du loco part05
		bodyModel[236] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Du loco part06
		bodyModel[237] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 167
		bodyModel[238] = new ModelRendererTurbo(this, 249, 217, textureX, textureY); // Box 167
		bodyModel[239] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 167
		bodyModel[240] = new ModelRendererTurbo(this, 289, 217, textureX, textureY); // Box 168
		bodyModel[241] = new ModelRendererTurbo(this, 305, 217, textureX, textureY); // Box 168
		bodyModel[242] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 168
		bodyModel[243] = new ModelRendererTurbo(this, 281, 217, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[244] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[245] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[246] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[247] = new ModelRendererTurbo(this, 369, 217, textureX, textureY); // Du loco part28
		bodyModel[248] = new ModelRendererTurbo(this, 377, 217, textureX, textureY); // Du loco part28
		bodyModel[249] = new ModelRendererTurbo(this, 385, 217, textureX, textureY); // Du loco part09
		bodyModel[250] = new ModelRendererTurbo(this, 449, 217, textureX, textureY); // Du loco part41
		bodyModel[251] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Du loco part41
		bodyModel[252] = new ModelRendererTurbo(this, 9, 217, textureX, textureY); // Du loco part37
		bodyModel[253] = new ModelRendererTurbo(this, 41, 217, textureX, textureY); // Du loco part37
		bodyModel[254] = new ModelRendererTurbo(this, 201, 217, textureX, textureY); // Du loco part37
		bodyModel[255] = new ModelRendererTurbo(this, 313, 217, textureX, textureY); // Du loco part37
		bodyModel[256] = new ModelRendererTurbo(this, 233, 225, textureX, textureY); // Du loco part37
		bodyModel[257] = new ModelRendererTurbo(this, 281, 225, textureX, textureY); // Du loco part37
		bodyModel[258] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Du loco part37
		bodyModel[259] = new ModelRendererTurbo(this, 329, 225, textureX, textureY); // Du loco part37
		bodyModel[260] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Du loco part37
		bodyModel[261] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Du loco part37
		bodyModel[262] = new ModelRendererTurbo(this, 9, 225, textureX, textureY); // Du loco part37
		bodyModel[263] = new ModelRendererTurbo(this, 25, 225, textureX, textureY); // Du loco part37
		bodyModel[264] = new ModelRendererTurbo(this, 121, 217, textureX, textureY); // Du loco part37
		bodyModel[265] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Du loco part37
		bodyModel[266] = new ModelRendererTurbo(this, 161, 225, textureX, textureY); // Du loco part37
		bodyModel[267] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Du loco part37
		bodyModel[268] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Du loco part37
		bodyModel[269] = new ModelRendererTurbo(this, 17, 233, textureX, textureY); // Du loco part37
		bodyModel[270] = new ModelRendererTurbo(this, 129, 233, textureX, textureY); // Du loco part37
		bodyModel[271] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Du loco part37
		bodyModel[272] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Du loco part37
		bodyModel[273] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Du loco part37
		bodyModel[274] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part09
		bodyModel[275] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Du loco part82
		bodyModel[276] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Du loco part83
		bodyModel[277] = new ModelRendererTurbo(this, 329, 217, textureX, textureY); // Du loco part84
		bodyModel[278] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Du loco part85
		bodyModel[279] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Du loco part94
		bodyModel[280] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Du loco part95
		bodyModel[281] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Du loco part97
		bodyModel[282] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Du loco part100
		bodyModel[283] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Du loco part101
		bodyModel[284] = new ModelRendererTurbo(this, 473, 225, textureX, textureY); // Du loco part102
		bodyModel[285] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Box 177
		bodyModel[286] = new ModelRendererTurbo(this, 296, 233, textureX, textureY); // Box 193
		bodyModel[287] = new ModelRendererTurbo(this, 320, 233, textureX, textureY); // Box 196
		bodyModel[288] = new ModelRendererTurbo(this, 49, 241, textureX, textureY); // Du loco part37
		bodyModel[289] = new ModelRendererTurbo(this, 250, 332, textureX, textureY); // Du loco part37
		bodyModel[290] = new ModelRendererTurbo(this, 169, 241, textureX, textureY); // Du loco part37
		bodyModel[291] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Du loco part37
		bodyModel[292] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Du loco part37
		bodyModel[293] = new ModelRendererTurbo(this, 321, 241, textureX, textureY); // Du loco part37
		bodyModel[294] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Du loco part37
		bodyModel[295] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Du loco part37
		bodyModel[296] = new ModelRendererTurbo(this, 105, 241, textureX, textureY); // Du loco part37
		bodyModel[297] = new ModelRendererTurbo(this, 505, 233, textureX, textureY); // Du loco part37
		bodyModel[298] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Du loco part37
		bodyModel[299] = new ModelRendererTurbo(this, 353, 241, textureX, textureY); // Du loco part37
		bodyModel[300] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Du loco part37
		bodyModel[301] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Du loco part37
		bodyModel[302] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Du loco part37
		bodyModel[303] = new ModelRendererTurbo(this, 49, 249, textureX, textureY); // Du loco part37
		bodyModel[304] = new ModelRendererTurbo(this, 89, 249, textureX, textureY); // Du loco part37
		bodyModel[305] = new ModelRendererTurbo(this, 121, 249, textureX, textureY); // Du loco part37
		bodyModel[306] = new ModelRendererTurbo(this, 169, 249, textureX, textureY); // Du loco part37
		bodyModel[307] = new ModelRendererTurbo(this, 201, 249, textureX, textureY); // Du loco part37
		bodyModel[308] = new ModelRendererTurbo(this, 217, 249, textureX, textureY); // Du loco part37
		bodyModel[309] = new ModelRendererTurbo(this, 297, 249, textureX, textureY); // Du loco part37
		bodyModel[310] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Du loco part37
		bodyModel[311] = new ModelRendererTurbo(this, 33, 249, textureX, textureY); // Du loco part37
		bodyModel[312] = new ModelRendererTurbo(this, 73, 249, textureX, textureY); // Du loco part37
		bodyModel[313] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Du loco part37
		bodyModel[314] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Du loco part37
		bodyModel[315] = new ModelRendererTurbo(this, 345, 249, textureX, textureY); // Du loco part37
		bodyModel[316] = new ModelRendererTurbo(this, 353, 249, textureX, textureY); // Du loco part37
		bodyModel[317] = new ModelRendererTurbo(this, 401, 249, textureX, textureY); // Du loco part37
		bodyModel[318] = new ModelRendererTurbo(this, 417, 249, textureX, textureY); // Du loco part37
		bodyModel[319] = new ModelRendererTurbo(this, 441, 249, textureX, textureY); // Du loco part37
		bodyModel[320] = new ModelRendererTurbo(this, 465, 249, textureX, textureY); // Du loco part06
		bodyModel[321] = new ModelRendererTurbo(this, 481, 249, textureX, textureY); // Du loco part06
		bodyModel[322] = new ModelRendererTurbo(this, 497, 249, textureX, textureY); // Du loco part06
		bodyModel[323] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Du loco part06
		bodyModel[324] = new ModelRendererTurbo(this, 105, 257, textureX, textureY); // Du loco part06
		bodyModel[325] = new ModelRendererTurbo(this, 121, 257, textureX, textureY); // Du loco part06
		bodyModel[326] = new ModelRendererTurbo(this, 137, 257, textureX, textureY); // Du loco part06
		bodyModel[327] = new ModelRendererTurbo(this, 153, 257, textureX, textureY); // Du loco part06
		bodyModel[328] = new ModelRendererTurbo(this, 169, 257, textureX, textureY); // Du loco part06
		bodyModel[329] = new ModelRendererTurbo(this, 185, 257, textureX, textureY); // Du loco part06
		bodyModel[330] = new ModelRendererTurbo(this, 345, 257, textureX, textureY); // Du loco part06
		bodyModel[331] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Du loco part06
		bodyModel[332] = new ModelRendererTurbo(this, 385, 257, textureX, textureY); // Du loco part06
		bodyModel[333] = new ModelRendererTurbo(this, 465, 257, textureX, textureY); // Du loco part06
		bodyModel[334] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Du loco part06
		bodyModel[335] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Du loco part06
		bodyModel[336] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part06
		bodyModel[337] = new ModelRendererTurbo(this, 105, 265, textureX, textureY); // Du loco part06
		bodyModel[338] = new ModelRendererTurbo(this, 121, 265, textureX, textureY); // Du loco part06
		bodyModel[339] = new ModelRendererTurbo(this, 137, 265, textureX, textureY); // Du loco part06
		bodyModel[340] = new ModelRendererTurbo(this, 153, 265, textureX, textureY); // Du loco part06
		bodyModel[341] = new ModelRendererTurbo(this, 169, 265, textureX, textureY); // Du loco part06
		bodyModel[342] = new ModelRendererTurbo(this, 185, 265, textureX, textureY); // Du loco part06
		bodyModel[343] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Du loco part06
		bodyModel[344] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Du loco part06
		bodyModel[345] = new ModelRendererTurbo(this, 233, 265, textureX, textureY); // Du loco part06
		bodyModel[346] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Du loco part06
		bodyModel[347] = new ModelRendererTurbo(this, 265, 265, textureX, textureY); // Du loco part06
		bodyModel[348] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Du loco part06
		bodyModel[349] = new ModelRendererTurbo(this, 297, 265, textureX, textureY); // Du loco part06
		bodyModel[350] = new ModelRendererTurbo(this, 313, 265, textureX, textureY); // Du loco part06
		bodyModel[351] = new ModelRendererTurbo(this, 329, 265, textureX, textureY); // Du loco part06
		bodyModel[352] = new ModelRendererTurbo(this, 345, 265, textureX, textureY); // Du loco part06
		bodyModel[353] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Du loco part06
		bodyModel[354] = new ModelRendererTurbo(this, 377, 265, textureX, textureY); // Du loco part06
		bodyModel[355] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Du loco part06
		bodyModel[356] = new ModelRendererTurbo(this, 17, 257, textureX, textureY); // Du loco part28
		bodyModel[357] = new ModelRendererTurbo(this, 17, 265, textureX, textureY); // Du loco part28
		bodyModel[358] = new ModelRendererTurbo(this, 409, 265, textureX, textureY); // Du loco part28
		bodyModel[359] = new ModelRendererTurbo(this, 417, 265, textureX, textureY); // Du loco part28
		bodyModel[360] = new ModelRendererTurbo(this, 385, 249, textureX, textureY); // Du loco part28
		bodyModel[361] = new ModelRendererTurbo(this, 425, 265, textureX, textureY); // Du loco part28
		bodyModel[362] = new ModelRendererTurbo(this, 441, 265, textureX, textureY); // Du loco part28
		bodyModel[363] = new ModelRendererTurbo(this, 457, 265, textureX, textureY); // Du loco part28
		bodyModel[364] = new ModelRendererTurbo(this, 473, 265, textureX, textureY); // Du loco part28
		bodyModel[365] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Du loco part28
		bodyModel[366] = new ModelRendererTurbo(this, 177, 273, textureX, textureY); // Du loco part42
		bodyModel[367] = new ModelRendererTurbo(this, 217, 273, textureX, textureY); // Du loco part42
		bodyModel[368] = new ModelRendererTurbo(this, 257, 273, textureX, textureY); // Du loco part42
		bodyModel[369] = new ModelRendererTurbo(this, 1, 288, textureX, textureY); // Du loco part19
		bodyModel[370] = new ModelRendererTurbo(this, 505, 12, textureX, textureY); // Box 174
		bodyModel[371] = new ModelRendererTurbo(this, 113, 53, textureX, textureY); // Box 174
		bodyModel[372] = new ModelRendererTurbo(this, 1, 288, textureX, textureY); // Du loco part19
		bodyModel[373] = new ModelRendererTurbo(this, 21, 298, textureX, textureY); // Box 156
		bodyModel[374] = new ModelRendererTurbo(this, 28, 298, textureX, textureY); // Box 156
		bodyModel[375] = new ModelRendererTurbo(this, 35, 298, textureX, textureY); // Box 156
		bodyModel[376] = new ModelRendererTurbo(this, 14, 298, textureX, textureY); // Box 156
		bodyModel[377] = new ModelRendererTurbo(this, 45, 298, textureX, textureY); // Box 154
		bodyModel[378] = new ModelRendererTurbo(this, 48, 297, textureX, textureY); // Box 154
		bodyModel[379] = new ModelRendererTurbo(this, 51, 298, textureX, textureY); // Box 154
		bodyModel[380] = new ModelRendererTurbo(this, 42, 297, textureX, textureY); // Box 154
		bodyModel[381] = new ModelRendererTurbo(this, 1, 347, textureX, textureY); // Du loco part23
		bodyModel[382] = new ModelRendererTurbo(this, 178, 332, textureX, textureY); // Du loco part37
		bodyModel[383] = new ModelRendererTurbo(this, 145, 332, textureX, textureY); // Du loco part37
		bodyModel[384] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Du loco part37
		bodyModel[385] = new ModelRendererTurbo(this, 211, 332, textureX, textureY); // Du loco part37
		bodyModel[386] = new ModelRendererTurbo(this, 40, 332, textureX, textureY); // Du loco part37
		bodyModel[387] = new ModelRendererTurbo(this, 112, 332, textureX, textureY); // Du loco part37
		bodyModel[388] = new ModelRendererTurbo(this, 79, 332, textureX, textureY); // Du loco part37
		bodyModel[389] = new ModelRendererTurbo(this, 1, 332, textureX, textureY); // Du loco part37
		bodyModel[390] = new ModelRendererTurbo(this, 102, 347, textureX, textureY); // Du loco part23
		bodyModel[391] = new ModelRendererTurbo(this, 7, 277, textureX, textureY); // Du loco part41
		bodyModel[392] = new ModelRendererTurbo(this, 7, 277, textureX, textureY); // Du loco part41
		bodyModel[393] = new ModelRendererTurbo(this, 1, 398, textureX, textureY); // Du loco part23
		bodyModel[394] = new ModelRendererTurbo(this, 202, 398, textureX, textureY); // Du loco part23
		bodyModel[395] = new ModelRendererTurbo(this, 203, 394, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[396] = new ModelRendererTurbo(this, 203, 394, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[397] = new ModelRendererTurbo(this, 203, 394, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[398] = new ModelRendererTurbo(this, 203, 394, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[399] = new ModelRendererTurbo(this, 203, 394, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[400] = new ModelRendererTurbo(this, 203, 394, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[401] = new ModelRendererTurbo(this, 203, 394, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[402] = new ModelRendererTurbo(this, 203, 394, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[403] = new ModelRendererTurbo(this, 203, 394, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[404] = new ModelRendererTurbo(this, 203, 394, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[405] = new ModelRendererTurbo(this, 203, 394, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[406] = new ModelRendererTurbo(this, 203, 394, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[407] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Du loco part05
		bodyModel[408] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[409] = new ModelRendererTurbo(this, 298, 317, textureX, textureY); // Du loco part05
		bodyModel[410] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[411] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[412] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[413] = new ModelRendererTurbo(this, 297, 319, textureX, textureY); // Du loco part05
		bodyModel[414] = new ModelRendererTurbo(this, 297, 317, textureX, textureY); // Du loco part05
		bodyModel[415] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Du loco part05
		bodyModel[416] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[417] = new ModelRendererTurbo(this, 298, 317, textureX, textureY); // Du loco part05
		bodyModel[418] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[419] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Du loco part05
		bodyModel[420] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[421] = new ModelRendererTurbo(this, 298, 317, textureX, textureY); // Du loco part05
		bodyModel[422] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[423] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Du loco part05
		bodyModel[424] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[425] = new ModelRendererTurbo(this, 298, 317, textureX, textureY); // Du loco part05
		bodyModel[426] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[427] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Du loco part05
		bodyModel[428] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[429] = new ModelRendererTurbo(this, 298, 317, textureX, textureY); // Du loco part05
		bodyModel[430] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[431] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[432] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[433] = new ModelRendererTurbo(this, 297, 319, textureX, textureY); // Du loco part05
		bodyModel[434] = new ModelRendererTurbo(this, 297, 317, textureX, textureY); // Du loco part05
		bodyModel[435] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Du loco part05
		bodyModel[436] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[437] = new ModelRendererTurbo(this, 298, 317, textureX, textureY); // Du loco part05
		bodyModel[438] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[439] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[440] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[441] = new ModelRendererTurbo(this, 297, 319, textureX, textureY); // Du loco part05
		bodyModel[442] = new ModelRendererTurbo(this, 297, 317, textureX, textureY); // Du loco part05
		bodyModel[443] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Du loco part05
		bodyModel[444] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[445] = new ModelRendererTurbo(this, 298, 317, textureX, textureY); // Du loco part05
		bodyModel[446] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[447] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Du loco part05
		bodyModel[448] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[449] = new ModelRendererTurbo(this, 298, 317, textureX, textureY); // Du loco part05
		bodyModel[450] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[451] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Du loco part05
		bodyModel[452] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[453] = new ModelRendererTurbo(this, 298, 317, textureX, textureY); // Du loco part05
		bodyModel[454] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[455] = new ModelRendererTurbo(this, 297, 321, textureX, textureY); // Du loco part05
		bodyModel[456] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[457] = new ModelRendererTurbo(this, 298, 317, textureX, textureY); // Du loco part05
		bodyModel[458] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[459] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[460] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[461] = new ModelRendererTurbo(this, 297, 319, textureX, textureY); // Du loco part05
		bodyModel[462] = new ModelRendererTurbo(this, 297, 317, textureX, textureY); // Du loco part05
		bodyModel[463] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[464] = new ModelRendererTurbo(this, 297, 319, textureX, textureY); // Du loco part05
		bodyModel[465] = new ModelRendererTurbo(this, 297, 317, textureX, textureY); // Du loco part05
		bodyModel[466] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[467] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[468] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[469] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[470] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[471] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[472] = new ModelRendererTurbo(this, 297, 319, textureX, textureY); // Du loco part05
		bodyModel[473] = new ModelRendererTurbo(this, 297, 317, textureX, textureY); // Du loco part05
		bodyModel[474] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[475] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[476] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[477] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[478] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[479] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05
		bodyModel[480] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[481] = new ModelRendererTurbo(this, 297, 319, textureX, textureY); // Du loco part05
		bodyModel[482] = new ModelRendererTurbo(this, 297, 317, textureX, textureY); // Du loco part05
		bodyModel[483] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[484] = new ModelRendererTurbo(this, 297, 319, textureX, textureY); // Du loco part05
		bodyModel[485] = new ModelRendererTurbo(this, 297, 317, textureX, textureY); // Du loco part05
		bodyModel[486] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[487] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[488] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[489] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[490] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[491] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[492] = new ModelRendererTurbo(this, 297, 319, textureX, textureY); // Du loco part05
		bodyModel[493] = new ModelRendererTurbo(this, 297, 317, textureX, textureY); // Du loco part05
		bodyModel[494] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[495] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[496] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[497] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[498] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[499] = new ModelRendererTurbo(this, 296, 322, textureX, textureY); // Du loco part05

		bodyModel[0].addShapeBox(0F, 0F, 0F, 70, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(7F, -8F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 82, 1, 20, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(1F, -12F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[2].setRotationPoint(0F, -11F, 11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[3].setRotationPoint(0F, -11F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 58, 20, 1, 0F); // Du loco part07
		bodyModel[4].setRotationPoint(13F, -30F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 86, 3, 4, 0F); // Du loco part08
		bodyModel[5].setRotationPoint(-1F, -33F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[6].setRotationPoint(-21F, -7F, 6.05F);

		bodyModel[7].addBox(0F, 0F, 0F, 46, 3, 0, 0F); // Du loco part17
		bodyModel[7].setRotationPoint(19F, -10F, -6.15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 2, 21, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[8].setRotationPoint(-2F, -30F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Du loco part20
		bodyModel[9].setRotationPoint(70F, -30F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[10].setRotationPoint(1F, -30F, 10F);

		bodyModel[11].addBox(0F, 0F, 0F, 46, 3, 0, 0F); // Du loco part27
		bodyModel[11].setRotationPoint(19F, -10F, 6.15F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[12].setRotationPoint(1F, -30F, -11F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Du loco part41
		bodyModel[13].setRotationPoint(-2F, -10F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[14].setRotationPoint(1F, -19F, -10F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[15].setRotationPoint(6F, -13F, -6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[16].setRotationPoint(6F, -13F, -6F);
		bodyModel[16].rotateAngleY = -1.57079633F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[17].setRotationPoint(6F, -13F, -3F);
		bodyModel[17].rotateAngleY = -1.57079633F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[18].setRotationPoint(6F, -16F, -6F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part95
		bodyModel[19].setRotationPoint(6F, -16F, -3F);
		bodyModel[19].rotateAngleY = -1.57079633F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part97
		bodyModel[20].setRotationPoint(6F, -16F, -6F);
		bodyModel[20].rotateAngleY = -1.57079633F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[21].setRotationPoint(9F, -20F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[22].setRotationPoint(9F, -20F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[23].setRotationPoint(9F, -20F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[24].setRotationPoint(-3F, -17F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[25].setRotationPoint(-3F, -15F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[26].setRotationPoint(-3F, -15F, 4F);

		bodyModel[27].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[27].setRotationPoint(-3F, -17F, 4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 82, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[28].setRotationPoint(1F, -31F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 1F, 2, 23, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[29].setRotationPoint(-2F, -32F, -7F);

		bodyModel[30].addShapeBox(0F, 0F, 1F, 2, 23, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[30].setRotationPoint(-2F, -32F, 1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[31].setRotationPoint(1F, -10F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[32].setRotationPoint(9F, -16F, -7F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[33].setRotationPoint(8F, -15F, -4F);
		bodyModel[33].rotateAngleY = -1.57079633F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[34].setRotationPoint(7F, -15F, -4F);
		bodyModel[34].rotateAngleY = -1.57079633F;

		bodyModel[35].addBox(0F, 0F, 0F, 58, 20, 1, 0F); // Box 135
		bodyModel[35].setRotationPoint(13F, -30F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 136
		bodyModel[36].setRotationPoint(13F, -30F, -10F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[37].setRotationPoint(20F, -16F, -2F);

		bodyModel[38].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[38].setRotationPoint(19F, -22F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[39].setRotationPoint(19F, -24F, -3F);

		bodyModel[40].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 142
		bodyModel[40].setRotationPoint(20F, -25F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 143
		bodyModel[41].setRotationPoint(19F, -26F, -3F);

		bodyModel[42].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 144
		bodyModel[42].setRotationPoint(19F, -30F, -3F);

		bodyModel[43].addBox(0F, 0F, 0F, 12, 15, 12, 0F); // Box 145
		bodyModel[43].setRotationPoint(28F, -27F, -5F);

		bodyModel[44].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 146
		bodyModel[44].setRotationPoint(27F, -28F, -6F);

		bodyModel[45].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[45].setRotationPoint(22F, -19F, -4F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 148
		bodyModel[46].setRotationPoint(26F, -26F, -4F);

		bodyModel[47].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[47].setRotationPoint(27F, -26F, -4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[48].setRotationPoint(41F, -16F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[49].setRotationPoint(51F, -16F, -2F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 152
		bodyModel[50].setRotationPoint(52F, -30F, -1F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 153
		bodyModel[51].setRotationPoint(42F, -30F, -1F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 154
		bodyModel[52].setRotationPoint(45F, -27F, -1F);

		bodyModel[53].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 155
		bodyModel[53].setRotationPoint(49F, -27F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 156
		bodyModel[54].setRotationPoint(49F, -18F, -1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F); // Box 157
		bodyModel[55].setRotationPoint(45F, -18F, -1F);

		bodyModel[56].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 158
		bodyModel[56].setRotationPoint(47F, -26F, -1F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 159
		bodyModel[57].setRotationPoint(51F, -26F, -1F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 160
		bodyModel[58].setRotationPoint(44F, -26F, -1F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Du loco part Ligjhtpart8
		bodyModel[59].setRotationPoint(-2F, -33F, -2F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[60].setRotationPoint(5F, -33F, -6F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[61].setRotationPoint(5F, -33F, 5F);

		bodyModel[62].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[62].setRotationPoint(23F, -33F, -6F);

		bodyModel[63].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[63].setRotationPoint(23F, -33F, 5F);

		bodyModel[64].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[64].setRotationPoint(5F, -34F, -6F);

		bodyModel[65].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[65].setRotationPoint(5F, -34F, 5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part42
		bodyModel[66].setRotationPoint(-3F, -6F, 4F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[67].setRotationPoint(13F, -37F, -4F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[68].setRotationPoint(13F, -37F, 3F);

		bodyModel[69].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[69].setRotationPoint(14F, -38F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[70].setRotationPoint(14F, -38F, 6F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[71].setRotationPoint(14F, -38F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 58, 4, 2, 0F,-2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[72].setRotationPoint(13F, -34F, -11F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 58, 4, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[73].setRotationPoint(13F, -34F, 9F);

		bodyModel[74].addBox(0F, 0F, 0F, 16, 1, 0, 0F); // Lamp
		bodyModel[74].setRotationPoint(43F, -36F, -0.05F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[75].setRotationPoint(2F, -35F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[76].setRotationPoint(2F, -36F, -4F);

		bodyModel[77].addShapeBox(0F, 0F, 1F, 1, 22, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[77].setRotationPoint(-1F, -31F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 1F, 1, 22, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[78].setRotationPoint(-1F, -31F, 5F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part Ligjhtpart8
		bodyModel[79].setRotationPoint(-2F, -32F, 2F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part Ligjhtpart8
		bodyModel[80].setRotationPoint(-2F, -32F, -3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part Ligjhtpart8
		bodyModel[81].setRotationPoint(-2F, -32F, 3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart8
		bodyModel[82].setRotationPoint(-2F, -32F, -4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part Ligjhtpart8
		bodyModel[83].setRotationPoint(-2F, -34F, -2F);

		bodyModel[84].addBox(0F, 0F, 1F, 3, 1, 3, 0F); // Lamp
		bodyModel[84].setRotationPoint(-3F, -16F, -9F);

		bodyModel[85].addBox(0F, 0F, 1F, 3, 1, 3, 0F); // Lamp
		bodyModel[85].setRotationPoint(-3F, -16F, 4F);

		bodyModel[86].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[86].setRotationPoint(-3F, -34F, -3F);

		bodyModel[87].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[87].setRotationPoint(-3F, -31F, -3F);

		bodyModel[88].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Lamp
		bodyModel[88].setRotationPoint(-3F, -33F, -3F);

		bodyModel[89].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[89].setRotationPoint(-3F, -31F, -5F);

		bodyModel[90].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[90].setRotationPoint(-3F, -32F, -5F);

		bodyModel[91].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[91].setRotationPoint(-3F, -31F, 1F);

		bodyModel[92].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[92].setRotationPoint(-3F, -32F, 1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 84, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[93].setRotationPoint(0F, -32F, 6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 86, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[94].setRotationPoint(-1F, -33F, 2F);

		bodyModel[95].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Du loco part37
		bodyModel[95].setRotationPoint(41F, -37F, -1F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Du loco part37
		bodyModel[96].setRotationPoint(24F, -36F, -1F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part37
		bodyModel[97].setRotationPoint(41F, -36F, -4F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part37
		bodyModel[98].setRotationPoint(41F, -36F, 3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[99].setRotationPoint(41F, -37F, -3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[100].setRotationPoint(41F, -37F, 1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 16, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[101].setRotationPoint(25F, -36F, 0F);

		bodyModel[102].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Du loco part37
		bodyModel[102].setRotationPoint(19F, -35F, -1F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Du loco part37
		bodyModel[103].setRotationPoint(21F, -36F, 0F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[104].setRotationPoint(18F, -11F, 6.05F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[105].setRotationPoint(4F, -11F, 6.05F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[106].setRotationPoint(-10F, -11F, 6.05F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[107].setRotationPoint(-24F, -11F, 6.05F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[108].setRotationPoint(18F, -11F, -6.05F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[109].setRotationPoint(4F, -11F, -6.05F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[110].setRotationPoint(-10F, -11F, -6.05F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[111].setRotationPoint(-24F, -11F, -6.05F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[112].setRotationPoint(-21F, -7F, -6.05F);

		bodyModel[113].addShapeBox(0F, 0F, 1F, 1, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[113].setRotationPoint(0F, -30F, 8F);

		bodyModel[114].addShapeBox(0F, 0F, 1F, 1, 21, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[114].setRotationPoint(0F, -30F, -12F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 149
		bodyModel[115].setRotationPoint(-1F, -32F, 6F);

		bodyModel[116].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[116].setRotationPoint(-2F, -33F, 1F);

		bodyModel[117].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[117].setRotationPoint(0F, -31F, 8F);

		bodyModel[118].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[118].setRotationPoint(-2F, -33F, -7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 86, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[119].setRotationPoint(-1F, -33F, -6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 84, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[120].setRotationPoint(0F, -32F, -9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 82, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[121].setRotationPoint(1F, -31F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[122].setRotationPoint(-1F, -32F, -10F);

		bodyModel[123].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[123].setRotationPoint(0F, -31F, -12F);

		bodyModel[124].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[124].setRotationPoint(-1F, -11F, -12F);

		bodyModel[125].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[125].setRotationPoint(-2F, -11F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[126].setRotationPoint(-3F, -11F, -7F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[127].setRotationPoint(-3F, -11F, -2F);

		bodyModel[128].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[128].setRotationPoint(-3F, -11F, 1F);

		bodyModel[129].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[129].setRotationPoint(-2F, -11F, 5F);

		bodyModel[130].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[130].setRotationPoint(-1F, -11F, 8F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[131].setRotationPoint(1F, -10F, -11F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[132].setRotationPoint(9F, -11F, -9F);

		bodyModel[133].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[133].setRotationPoint(12F, -11F, -9F);

		bodyModel[134].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[134].setRotationPoint(9F, -11F, 8F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[135].setRotationPoint(12F, -11F, 8F);

		bodyModel[136].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[136].setRotationPoint(9F, -5F, -11F);

		bodyModel[137].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[137].setRotationPoint(9F, -7F, -11F);

		bodyModel[138].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[138].setRotationPoint(9F, -9F, -11F);

		bodyModel[139].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[139].setRotationPoint(9F, -5F, 9F);

		bodyModel[140].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[140].setRotationPoint(9F, -7F, 9F);

		bodyModel[141].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[141].setRotationPoint(9F, -9F, 9F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[142].setRotationPoint(8F, -25F, 11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[143].setRotationPoint(13F, -25F, 11F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[144].setRotationPoint(8F, -25F, -12F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[145].setRotationPoint(13F, -25F, -12F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[146].setRotationPoint(0F, -20F, 11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[147].setRotationPoint(0F, -20F, -12F);

		bodyModel[148].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[148].setRotationPoint(-1F, -20F, -12F);

		bodyModel[149].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[149].setRotationPoint(-2F, -20F, -10F);

		bodyModel[150].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[150].setRotationPoint(-3F, -20F, -7F);

		bodyModel[151].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[151].setRotationPoint(-3F, -20F, 1F);

		bodyModel[152].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[152].setRotationPoint(-2F, -20F, 5F);

		bodyModel[153].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 168
		bodyModel[153].setRotationPoint(-1F, -20F, 8F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[154].setRotationPoint(25F, -9F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[155].setRotationPoint(25F, -11F, -10F);

		bodyModel[156].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Du loco part06
		bodyModel[156].setRotationPoint(25F, -10F, -11F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[157].setRotationPoint(33F, -9F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[158].setRotationPoint(33F, -10F, -11F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[159].setRotationPoint(33F, -11F, -10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[160].setRotationPoint(24F, -9F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[161].setRotationPoint(24F, -10F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[162].setRotationPoint(24F, -11F, -10F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[163].setRotationPoint(61F, -9F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[164].setRotationPoint(62F, -10F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[165].setRotationPoint(65F, -9F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[166].setRotationPoint(65F, -10F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[167].setRotationPoint(60F, -9F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[168].setRotationPoint(60F, -10F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[169].setRotationPoint(27F, -9F, 9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[170].setRotationPoint(27F, -10F, 9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[171].setRotationPoint(29F, -9F, 9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[172].setRotationPoint(29F, -10F, 9F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[173].setRotationPoint(26F, -9F, 9F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[174].setRotationPoint(26F, -10F, 9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[175].setRotationPoint(27F, -10F, 10F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[176].setRotationPoint(29F, -10F, 10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[177].setRotationPoint(26F, -10F, 10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[178].setRotationPoint(61F, -10F, -10F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[179].setRotationPoint(61F, -10F, -11F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[180].setRotationPoint(64F, -10F, -11F);

		bodyModel[181].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[181].setRotationPoint(-3F, -17F, 2F);

		bodyModel[182].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[182].setRotationPoint(-3F, -18F, 2F);

		bodyModel[183].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[183].setRotationPoint(-3F, -17F, -6F);

		bodyModel[184].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[184].setRotationPoint(-3F, -18F, -6F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 1F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 1F); // Du loco part41
		bodyModel[185].setRotationPoint(-2F, -5F, -4F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[186].setRotationPoint(-3.01F, -26F, 2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,0F, -1F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[187].setRotationPoint(-3.01F, -26F, -3F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[188].setRotationPoint(76F, -11F, 11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[189].setRotationPoint(76F, -11F, -12F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 2, 21, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[190].setRotationPoint(84F, -30F, -2F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 12, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[191].setRotationPoint(71F, -30F, 10F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 12, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[192].setRotationPoint(71F, -30F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[193].setRotationPoint(84F, -17F, -9F);

		bodyModel[194].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[194].setRotationPoint(84F, -15F, -9F);

		bodyModel[195].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart15
		bodyModel[195].setRotationPoint(84F, -15F, 4F);

		bodyModel[196].addShapeBox(0F, 0F, 1F, 3, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart13
		bodyModel[196].setRotationPoint(84F, -17F, 4F);

		bodyModel[197].addShapeBox(0F, 0F, 1F, 2, 23, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[197].setRotationPoint(84F, -32F, -7F);

		bodyModel[198].addShapeBox(0F, 0F, 1F, 2, 23, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[198].setRotationPoint(84F, -32F, 1F);

		bodyModel[199].addBox(0F, 0F, 0F, 1, 3, 4, 0F); // Du loco part Ligjhtpart8
		bodyModel[199].setRotationPoint(85F, -33F, -2F);

		bodyModel[200].addShapeBox(0F, 0F, 1F, 1, 22, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[200].setRotationPoint(84F, -31F, -10F);

		bodyModel[201].addShapeBox(0F, 0F, 1F, 1, 22, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[201].setRotationPoint(84F, -31F, 5F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part Ligjhtpart8
		bodyModel[202].setRotationPoint(85F, -32F, 2F);

		bodyModel[203].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Du loco part Ligjhtpart8
		bodyModel[203].setRotationPoint(85F, -32F, -3F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part Ligjhtpart8
		bodyModel[204].setRotationPoint(85F, -32F, 3F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart8
		bodyModel[205].setRotationPoint(85F, -32F, -4F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part Ligjhtpart8
		bodyModel[206].setRotationPoint(82F, -34F, -2F);

		bodyModel[207].addBox(0F, 0F, 1F, 3, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[207].setRotationPoint(84F, -16F, -9F);

		bodyModel[208].addBox(0F, 0F, 1F, 3, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[208].setRotationPoint(84F, -16F, 4F);

		bodyModel[209].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[209].setRotationPoint(86F, -34F, -3F);

		bodyModel[210].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[210].setRotationPoint(86F, -31F, -3F);

		bodyModel[211].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Du loco part Ligjhtpart18
		bodyModel[211].setRotationPoint(86F, -33F, -3F);

		bodyModel[212].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[212].setRotationPoint(86F, -31F, -5F);

		bodyModel[213].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[213].setRotationPoint(86F, -32F, -5F);

		bodyModel[214].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[214].setRotationPoint(86F, -31F, 1F);

		bodyModel[215].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[215].setRotationPoint(86F, -32F, 1F);

		bodyModel[216].addShapeBox(0F, 0F, 1F, 1, 21, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[216].setRotationPoint(83F, -30F, 8F);

		bodyModel[217].addShapeBox(0F, 0F, 1F, 1, 21, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[217].setRotationPoint(83F, -30F, -12F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[218].setRotationPoint(84F, -32F, 6F);

		bodyModel[219].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[219].setRotationPoint(85F, -33F, 1F);

		bodyModel[220].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[220].setRotationPoint(83F, -31F, 8F);

		bodyModel[221].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[221].setRotationPoint(85F, -33F, -7F);

		bodyModel[222].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[222].setRotationPoint(84F, -32F, -10F);

		bodyModel[223].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[223].setRotationPoint(83F, -31F, -12F);

		bodyModel[224].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[224].setRotationPoint(84F, -11F, -12F);

		bodyModel[225].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[225].setRotationPoint(85F, -11F, -10F);

		bodyModel[226].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[226].setRotationPoint(86F, -11F, -7F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[227].setRotationPoint(86F, -11F, -2F);

		bodyModel[228].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[228].setRotationPoint(86F, -11F, 1F);

		bodyModel[229].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[229].setRotationPoint(85F, -11F, 5F);

		bodyModel[230].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[230].setRotationPoint(84F, -11F, 8F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[231].setRotationPoint(70F, -25F, 11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[232].setRotationPoint(75F, -25F, 11F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[233].setRotationPoint(70F, -25F, -12F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[234].setRotationPoint(75F, -25F, -12F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[235].setRotationPoint(76F, -20F, 11F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[236].setRotationPoint(76F, -20F, -12F);

		bodyModel[237].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[237].setRotationPoint(84F, -20F, -12F);

		bodyModel[238].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[238].setRotationPoint(85F, -20F, -10F);

		bodyModel[239].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[239].setRotationPoint(86F, -20F, -7F);

		bodyModel[240].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[240].setRotationPoint(86F, -20F, 1F);

		bodyModel[241].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[241].setRotationPoint(85F, -20F, 5F);

		bodyModel[242].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[242].setRotationPoint(84F, -20F, 8F);

		bodyModel[243].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[243].setRotationPoint(85F, -17F, 2F);

		bodyModel[244].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[244].setRotationPoint(85F, -18F, 2F);

		bodyModel[245].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[245].setRotationPoint(85F, -17F, -6F);

		bodyModel[246].addShapeBox(0F, 0F, 1F, 2, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[246].setRotationPoint(85F, -18F, -6F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part28
		bodyModel[247].setRotationPoint(85.01F, -26F, 2F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 6, 1, 0F,-0.75F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[248].setRotationPoint(85.01F, -26F, -3F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[249].setRotationPoint(51F, -7F, -6.05F);

		bodyModel[250].addBox(0F, 0F, 0F, 1, 3, 14, 0F); // Du loco part41
		bodyModel[250].setRotationPoint(85F, -10F, -7F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 3.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 3.5F); // Du loco part41
		bodyModel[251].setRotationPoint(84F, -5F, -4F);

		bodyModel[252].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[252].setRotationPoint(60F, -33F, -6F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[253].setRotationPoint(60F, -33F, 5F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[254].setRotationPoint(78F, -33F, -6F);

		bodyModel[255].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[255].setRotationPoint(78F, -33F, 5F);

		bodyModel[256].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[256].setRotationPoint(60F, -34F, -6F);

		bodyModel[257].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[257].setRotationPoint(60F, -34F, 5F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[258].setRotationPoint(73F, -40F, 4F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[259].setRotationPoint(60F, -40F, 4F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[260].setRotationPoint(70F, -46F, 3F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[261].setRotationPoint(60F, -46F, 3F);

		bodyModel[262].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[262].setRotationPoint(68F, -47F, -4F);

		bodyModel[263].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[263].setRotationPoint(68F, -47F, 3F);

		bodyModel[264].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[264].setRotationPoint(69F, -48F, -6F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[265].setRotationPoint(69F, -48F, 6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[266].setRotationPoint(69F, -48F, -8F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[267].setRotationPoint(73F, -40F, -5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[268].setRotationPoint(60F, -40F, -5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[269].setRotationPoint(70F, -46F, -4F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[270].setRotationPoint(60F, -46F, -4F);

		bodyModel[271].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Du loco part37
		bodyModel[271].setRotationPoint(59F, -36F, -1F);

		bodyModel[272].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Du loco part37
		bodyModel[272].setRotationPoint(63F, -35F, -1F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[273].setRotationPoint(60F, -36F, 0F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[274].setRotationPoint(51F, -7F, 6.05F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[275].setRotationPoint(78F, -19F, -10F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[276].setRotationPoint(74F, -13F, -6F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[277].setRotationPoint(74F, -13F, -6F);
		bodyModel[277].rotateAngleY = -1.57079633F;

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[278].setRotationPoint(74F, -13F, -3F);
		bodyModel[278].rotateAngleY = -1.57079633F;

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[279].setRotationPoint(75F, -16F, -6F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[280].setRotationPoint(75F, -16F, -3F);
		bodyModel[280].rotateAngleY = -1.57079633F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[281].setRotationPoint(75F, -16F, -6F);
		bodyModel[281].rotateAngleY = -1.57079633F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[282].setRotationPoint(74F, -20F, -6F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[283].setRotationPoint(74F, -20F, -7F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[284].setRotationPoint(74F, -20F, -4F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[285].setRotationPoint(74F, -16F, -7F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[286].setRotationPoint(76F, -15F, -4F);
		bodyModel[286].rotateAngleY = -1.57079633F;

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[287].setRotationPoint(75F, -15F, -4F);
		bodyModel[287].rotateAngleY = -1.57079633F;

		bodyModel[288].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[288].setRotationPoint(18F, -35F, 4F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, 0F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -7F); // Du loco part37
		bodyModel[289].setRotationPoint(16F, -37F, -4F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[290].setRotationPoint(2F, -35F, 4F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[291].setRotationPoint(2F, -36F, 3F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[292].setRotationPoint(18F, -35F, -5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[293].setRotationPoint(15F, -36F, -4F);

		bodyModel[294].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[294].setRotationPoint(68F, -37F, -4F);

		bodyModel[295].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[295].setRotationPoint(68F, -37F, 3F);

		bodyModel[296].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[296].setRotationPoint(69F, -38F, -6F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[297].setRotationPoint(69F, -38F, 6F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[298].setRotationPoint(69F, -38F, -8F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[299].setRotationPoint(57F, -35F, -5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[300].setRotationPoint(57F, -36F, -4F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[301].setRotationPoint(73F, -35F, 4F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[302].setRotationPoint(70F, -36F, 3F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[303].setRotationPoint(57F, -35F, 4F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[304].setRotationPoint(57F, -36F, 3F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[305].setRotationPoint(73F, -35F, -5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[306].setRotationPoint(70F, -36F, -4F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[307].setRotationPoint(18F, -40F, 4F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[308].setRotationPoint(5F, -40F, 4F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[309].setRotationPoint(15F, -46F, 3F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[310].setRotationPoint(5F, -46F, 3F);

		bodyModel[311].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[311].setRotationPoint(13F, -47F, -4F);

		bodyModel[312].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[312].setRotationPoint(13F, -47F, 3F);

		bodyModel[313].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[313].setRotationPoint(14F, -48F, -6F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[314].setRotationPoint(14F, -48F, 6F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[315].setRotationPoint(14F, -48F, -8F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[316].setRotationPoint(18F, -40F, -5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[317].setRotationPoint(5F, -40F, -5F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[318].setRotationPoint(15F, -46F, -4F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[319].setRotationPoint(5F, -46F, -4F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[320].setRotationPoint(3F, -10F, 8F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[321].setRotationPoint(7F, -8F, 8F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[322].setRotationPoint(2F, -8F, 8F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[323].setRotationPoint(3F, -8F, 8F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[324].setRotationPoint(7F, -10F, 8F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[325].setRotationPoint(2F, -10F, 8F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[326].setRotationPoint(2F, -9F, 8F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[327].setRotationPoint(7F, -9F, 8F);

		bodyModel[328].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[328].setRotationPoint(3F, -9F, 8F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[329].setRotationPoint(3F, -10F, -11F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[330].setRotationPoint(7F, -8F, -11F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[331].setRotationPoint(2F, -8F, -11F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[332].setRotationPoint(3F, -8F, -11F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[333].setRotationPoint(7F, -10F, -11F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[334].setRotationPoint(2F, -10F, -11F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[335].setRotationPoint(2F, -9F, -11F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[336].setRotationPoint(7F, -9F, -11F);

		bodyModel[337].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[337].setRotationPoint(3F, -9F, -11F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[338].setRotationPoint(77F, -10F, 8F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[339].setRotationPoint(81F, -8F, 8F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[340].setRotationPoint(76F, -8F, 8F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[341].setRotationPoint(77F, -8F, 8F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[342].setRotationPoint(81F, -10F, 8F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[343].setRotationPoint(76F, -10F, 8F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[344].setRotationPoint(76F, -9F, 8F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[345].setRotationPoint(81F, -9F, 8F);

		bodyModel[346].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[346].setRotationPoint(77F, -9F, 8F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[347].setRotationPoint(77F, -10F, -11F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[348].setRotationPoint(81F, -8F, -11F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[349].setRotationPoint(76F, -8F, -11F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[350].setRotationPoint(77F, -8F, -11F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[351].setRotationPoint(81F, -10F, -11F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[352].setRotationPoint(76F, -10F, -11F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[353].setRotationPoint(76F, -9F, -11F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[354].setRotationPoint(81F, -9F, -11F);

		bodyModel[355].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[355].setRotationPoint(77F, -9F, -11F);

		bodyModel[356].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[356].setRotationPoint(71F, -11F, -9F);

		bodyModel[357].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[357].setRotationPoint(74F, -11F, -9F);

		bodyModel[358].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[358].setRotationPoint(71F, -11F, 8F);

		bodyModel[359].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[359].setRotationPoint(74F, -11F, 8F);

		bodyModel[360].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[360].setRotationPoint(71F, -5F, -11F);

		bodyModel[361].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[361].setRotationPoint(71F, -7F, -11F);

		bodyModel[362].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[362].setRotationPoint(71F, -9F, -11F);

		bodyModel[363].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[363].setRotationPoint(71F, -5F, 9F);

		bodyModel[364].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[364].setRotationPoint(71F, -7F, 9F);

		bodyModel[365].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[365].setRotationPoint(71F, -9F, 9F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part42
		bodyModel[366].setRotationPoint(-4F, -6F, 0F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,1F, -1F, 0F, -6.875F, -1F, 0F, -1.875F, 0F, 0F, -4F, 0F, 0F, -0.875F, 1F, 0F, -5F, 1F, 0F, 0F, 0F, 0F, -5.875F, 0F, 0F); // Du loco part42
		bodyModel[367].setRotationPoint(-5F, -7F, 0F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,-1.875F, -1F, 0F, -5F, -1F, 0F, 0F, 0F, 0F, -6.875F, 0F, 0F, 0F, 1F, 0F, -6.875F, 1F, 0F, -3.875F, 0F, 0F, -3F, 0F, 0F); // Du loco part42
		bodyModel[368].setRotationPoint(-6F, -4F, 0F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[369].setRotationPoint(86.05F, -17F, -3F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[370].setRotationPoint(81F, -10F, 10F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[371].setRotationPoint(81F, -10F, -11F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 0, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[372].setRotationPoint(-2.05F, -17F, -3F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 156
		bodyModel[373].setRotationPoint(83F, -30F, -11F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[374].setRotationPoint(83F, -30F, 10F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 156
		bodyModel[375].setRotationPoint(-1F, -30F, -11F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[376].setRotationPoint(-1F, -30F, 10F);

		bodyModel[377].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[377].setRotationPoint(-1F, -32F, -10.75F);

		bodyModel[378].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[378].setRotationPoint(-0.5F, -32F, -11.25F);

		bodyModel[379].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[379].setRotationPoint(-1F, -32F, 10.75F);

		bodyModel[380].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[380].setRotationPoint(-0.5F, -32F, 10.25F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[381].setRotationPoint(-3F, -21F, 11.05F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F); // Du loco part37
		bodyModel[382].setRotationPoint(16F, -46F, -4F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F); // Du loco part37
		bodyModel[383].setRotationPoint(16F, -46F, -4F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[384].setRotationPoint(15F, -36F, 3F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, -7F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F); // Du loco part37
		bodyModel[385].setRotationPoint(16F, -37F, -4F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[386].setRotationPoint(57F, -37F, -4F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[387].setRotationPoint(60F, -46F, -4F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[388].setRotationPoint(60F, -46F, -4F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[389].setRotationPoint(57F, -37F, -4F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[390].setRotationPoint(-3F, -21F, -11.05F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0.3F, 0F, 0F, 4.65F, 0F, 0F, 4.65F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 4.65F, 0F, 0F, 4.65F, 0F, 0F, 0.3F); // Du loco part41
		bodyModel[391].setRotationPoint(-2F, -5F, -4F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 4.65F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 4.65F, 0F, 0F, 4.65F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 4.65F); // Du loco part41
		bodyModel[392].setRotationPoint(84F, -5F, -4F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 100, 50, 0, 0F,-80F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, 0F, 0F, -80F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -80F, -40F, 0F); // Du loco part23
		bodyModel[393].setRotationPoint(-48F, -20F, 11.25F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 100, 50, 0, 0F,-80F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -80F, 0F, 0F, -80F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -80F, -40F, 0F); // Du loco part23
		bodyModel[394].setRotationPoint(-48F, -20F, -11.25F);

		bodyModel[395].addShapeBox(-1F, 0F, 1F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart18
		bodyModel[395].setRotationPoint(-2.1F, -32.5F, -1F);

		bodyModel[396].addShapeBox(-1F, 0F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[396].setRotationPoint(-2.1F, -31.5F, -1F);

		bodyModel[397].addShapeBox(-1F, 0F, 1F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart18
		bodyModel[397].setRotationPoint(-2.1F, -33.75F, -2F);

		bodyModel[398].addShapeBox(-1F, 0F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[398].setRotationPoint(-2.1F, -32.75F, -2F);

		bodyModel[399].addShapeBox(-1F, 0F, 1F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart18
		bodyModel[399].setRotationPoint(-2.1F, -32.5F, -3F);

		bodyModel[400].addShapeBox(-1F, 0F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[400].setRotationPoint(-2.1F, -31.5F, -3F);

		bodyModel[401].addShapeBox(-1F, 0F, 1F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart18
		bodyModel[401].setRotationPoint(88.1F, -32.5F, -1F);

		bodyModel[402].addShapeBox(-1F, 0F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[402].setRotationPoint(88.1F, -31.5F, -1F);

		bodyModel[403].addShapeBox(-1F, 0F, 1F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart18
		bodyModel[403].setRotationPoint(88.1F, -33.75F, -2F);

		bodyModel[404].addShapeBox(-1F, 0F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[404].setRotationPoint(88.1F, -32.75F, -2F);

		bodyModel[405].addShapeBox(-1F, 0F, 1F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart18
		bodyModel[405].setRotationPoint(88.1F, -32.5F, -3F);

		bodyModel[406].addShapeBox(-1F, 0F, 1F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[406].setRotationPoint(88.1F, -31.5F, -3F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[407].setRotationPoint(3F, -22F, 10F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[408].setRotationPoint(3F, -28F, 10F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[409].setRotationPoint(3F, -28F, 10F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[410].setRotationPoint(6F, -28F, 10F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[411].setRotationPoint(10F, -22F, 10F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[412].setRotationPoint(10F, -28F, 10F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[413].setRotationPoint(10F, -28F, 10F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[414].setRotationPoint(11F, -28F, 10F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[415].setRotationPoint(22F, -23F, 10F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[416].setRotationPoint(22F, -28F, 10F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[417].setRotationPoint(22F, -28F, 10F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[418].setRotationPoint(29F, -28F, 10F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[419].setRotationPoint(38F, -23F, 10F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[420].setRotationPoint(38F, -28F, 10F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[421].setRotationPoint(38F, -28F, 10F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[422].setRotationPoint(45F, -28F, 10F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[423].setRotationPoint(54F, -23F, 10F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[424].setRotationPoint(54F, -28F, 10F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[425].setRotationPoint(54F, -28F, 10F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[426].setRotationPoint(61F, -28F, 10F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[427].setRotationPoint(77F, -22F, 10F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[428].setRotationPoint(77F, -28F, 10F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[429].setRotationPoint(77F, -28F, 10F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[430].setRotationPoint(80F, -28F, 10F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[431].setRotationPoint(72F, -22F, 10F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[432].setRotationPoint(72F, -28F, 10F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[433].setRotationPoint(72F, -28F, 10F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[434].setRotationPoint(73F, -28F, 10F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[435].setRotationPoint(3F, -22F, -11F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[436].setRotationPoint(3F, -28F, -11F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[437].setRotationPoint(3F, -28F, -11F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[438].setRotationPoint(6F, -28F, -11F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[439].setRotationPoint(10F, -22F, -11F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[440].setRotationPoint(10F, -28F, -11F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[441].setRotationPoint(10F, -28F, -11F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[442].setRotationPoint(11F, -28F, -11F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[443].setRotationPoint(22F, -23F, -11F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[444].setRotationPoint(22F, -28F, -11F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[445].setRotationPoint(22F, -28F, -11F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[446].setRotationPoint(29F, -28F, -11F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[447].setRotationPoint(38F, -23F, -11F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[448].setRotationPoint(38F, -28F, -11F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[449].setRotationPoint(38F, -28F, -11F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[450].setRotationPoint(45F, -28F, -11F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[451].setRotationPoint(54F, -23F, -11F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[452].setRotationPoint(54F, -28F, -11F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[453].setRotationPoint(54F, -28F, -11F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[454].setRotationPoint(61F, -28F, -11F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[455].setRotationPoint(77F, -22F, -11F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[456].setRotationPoint(77F, -28F, -11F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[457].setRotationPoint(77F, -28F, -11F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[458].setRotationPoint(80F, -28F, -11F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[459].setRotationPoint(72F, -22F, -11F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[460].setRotationPoint(72F, -28F, -11F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[461].setRotationPoint(72F, -28F, -11F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[462].setRotationPoint(73F, -28F, -11F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[463].setRotationPoint(83F, -29F, -10F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[464].setRotationPoint(83F, -29F, -10F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[465].setRotationPoint(84F, -29F, -4F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[466].setRotationPoint(84F, -29F, -9F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[467].setRotationPoint(84F, -29F, -6F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[468].setRotationPoint(83F, -23F, -10F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[469].setRotationPoint(84F, -23F, -9F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[470].setRotationPoint(84F, -23F, -6F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[471].setRotationPoint(83F, -29F, 9F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[472].setRotationPoint(83F, -29F, 9F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[473].setRotationPoint(84F, -29F, 3F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[474].setRotationPoint(84F, -29F, 6F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[475].setRotationPoint(84F, -29F, 3F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[476].setRotationPoint(83F, -23F, 9F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[477].setRotationPoint(84F, -23F, 6F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[478].setRotationPoint(84F, -23F, 3F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[479].setRotationPoint(85F, -23F, -1F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[480].setRotationPoint(85F, -29F, -1F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[481].setRotationPoint(85F, -29F, 0F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[482].setRotationPoint(85F, -29F, -1F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[483].setRotationPoint(0F, -29F, -10F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F); // Du loco part05
		bodyModel[484].setRotationPoint(0F, -29F, -10F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Du loco part05
		bodyModel[485].setRotationPoint(-2F, -29F, -4F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[486].setRotationPoint(-1F, -29F, -9F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F); // Du loco part05
		bodyModel[487].setRotationPoint(-2F, -29F, -6F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[488].setRotationPoint(0F, -23F, -10F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[489].setRotationPoint(-1F, -23F, -9F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part05
		bodyModel[490].setRotationPoint(-2F, -23F, -6F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F); // Du loco part05
		bodyModel[491].setRotationPoint(0F, -29F, 9F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Du loco part05
		bodyModel[492].setRotationPoint(0F, -29F, 9F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F); // Du loco part05
		bodyModel[493].setRotationPoint(-2F, -29F, 3F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[494].setRotationPoint(-1F, -29F, 6F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F); // Du loco part05
		bodyModel[495].setRotationPoint(-2F, -29F, 3F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part05
		bodyModel[496].setRotationPoint(0F, -23F, 9F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[497].setRotationPoint(-1F, -23F, 6F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,-0.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[498].setRotationPoint(-2F, -23F, 3F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[499].setRotationPoint(-2F, -23F, -1F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 296, 319, textureX, textureY); // Du loco part05
		bodyModel[501] = new ModelRendererTurbo(this, 297, 319, textureX, textureY); // Du loco part05
		bodyModel[502] = new ModelRendererTurbo(this, 297, 317, textureX, textureY); // Du loco part05
		bodyModel[503] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part42
		bodyModel[504] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part42
		bodyModel[505] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part42
		bodyModel[506] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part42
		bodyModel[507] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part42
		bodyModel[508] = new ModelRendererTurbo(this, 177, 273, textureX, textureY); // Du loco part42
		bodyModel[509] = new ModelRendererTurbo(this, 217, 273, textureX, textureY); // Du loco part42
		bodyModel[510] = new ModelRendererTurbo(this, 257, 273, textureX, textureY); // Du loco part42
		bodyModel[511] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part42
		bodyModel[512] = new ModelRendererTurbo(this, 177, 273, textureX, textureY); // Du loco part42
		bodyModel[513] = new ModelRendererTurbo(this, 217, 273, textureX, textureY); // Du loco part42
		bodyModel[514] = new ModelRendererTurbo(this, 257, 273, textureX, textureY); // Du loco part42
		bodyModel[515] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part42
		bodyModel[516] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part42
		bodyModel[517] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part42
		bodyModel[518] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part42
		bodyModel[519] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part42
		bodyModel[520] = new ModelRendererTurbo(this, 177, 273, textureX, textureY); // Du loco part42
		bodyModel[521] = new ModelRendererTurbo(this, 217, 273, textureX, textureY); // Du loco part42
		bodyModel[522] = new ModelRendererTurbo(this, 257, 273, textureX, textureY); // Du loco part42
		bodyModel[523] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[524] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[525] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[526] = new ModelRendererTurbo(this, 385, 325, textureX, textureY); // Du loco part01
		bodyModel[527] = new ModelRendererTurbo(this, 385, 325, textureX, textureY); // Du loco part01
		bodyModel[528] = new ModelRendererTurbo(this, 385, 325, textureX, textureY); // Du loco part01
		bodyModel[529] = new ModelRendererTurbo(this, 385, 325, textureX, textureY); // Du loco part01
		bodyModel[530] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[531] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[532] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[533] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[534] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[535] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[536] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[537] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[538] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[539] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[540] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[541] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[542] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[543] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[544] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[545] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[546] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[547] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[548] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[549] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[550] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[551] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[552] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[553] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[554] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[555] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[556] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[557] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[558] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[559] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[560] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[561] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[562] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[563] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[564] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[565] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[566] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[567] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[568] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[569] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[570] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[571] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[572] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[573] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[574] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[575] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[576] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[577] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[578] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[579] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[580] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[581] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[582] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[583] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[584] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[585] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[586] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[587] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[588] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[589] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[590] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[591] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[592] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[593] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[594] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[595] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[596] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[597] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[598] = new ModelRendererTurbo(this, 503, 501, textureX, textureY); // Box 0
		bodyModel[599] = new ModelRendererTurbo(this, 498, 501, textureX, textureY); // Box 0
		bodyModel[600] = new ModelRendererTurbo(this, 503, 501, textureX, textureY); // Box 0
		bodyModel[601] = new ModelRendererTurbo(this, 498, 501, textureX, textureY); // Box 0

		bodyModel[500].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[500].setRotationPoint(-2F, -29F, -1F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[501].setRotationPoint(-2F, -29F, 0F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 2, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[502].setRotationPoint(-2F, -29F, -1F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -1F, 0F, -5.875F, -1F, 0F, -2F, 0F, 0F, -3.875F, 0F, 0F, -1F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -5.875F, 0F, 0F); // Du loco part42
		bodyModel[503].setRotationPoint(-4F, -7F, 4F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-1F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F, -2F, 0F, 0F, -3.875F, 0F, 0F); // Du loco part42
		bodyModel[504].setRotationPoint(-4F, -3F, 4F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[505].setRotationPoint(-3F, -6F, -10F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-3.875F, 0F, 0F, -2F, 0F, 0F, -5.875F, -1F, 0F, 0F, -1F, 0F, -5.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, -1F, 1F, 0F); // Du loco part42
		bodyModel[506].setRotationPoint(-4F, -7F, -10F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-5.875F, 1F, 0F, 0F, 1F, 0F, -4.875F, 0F, 0F, -1F, 0F, 0F, -3.875F, 0F, 0F, -2F, 0F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[507].setRotationPoint(-4F, -3F, -10F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[508].setRotationPoint(-4F, -6F, -11F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,-4F, 0F, 0F, -1.875F, 0F, 0F, -6.875F, -1F, 0F, 1F, -1F, 0F, -5.875F, 0F, 0F, 0F, 0F, 0F, -5F, 1F, 0F, -0.875F, 1F, 0F); // Du loco part42
		bodyModel[509].setRotationPoint(-5F, -7F, -11F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,-6.875F, 0F, 0F, 0F, 0F, 0F, -5F, -1F, 0F, -1.875F, -1F, 0F, -3F, 0F, 0F, -3.875F, 0F, 0F, -6.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[510].setRotationPoint(-6F, -4F, -11F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[511].setRotationPoint(82F, -6F, 4F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[512].setRotationPoint(83F, -6F, 0F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,-6.875F, -1F, 0F, 1F, -1F, 0F, -4F, 0F, 0F, -1.875F, 0F, 0F, -5F, 1F, 0F, -0.875F, 1F, 0F, -5.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[513].setRotationPoint(83F, -7F, 0F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,-5F, -1F, 0F, -1.875F, -1F, 0F, -6.875F, 0F, 0F, 0F, 0F, 0F, -6.875F, 1F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, -3.875F, 0F, 0F); // Du loco part42
		bodyModel[514].setRotationPoint(83F, -4F, 0F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-5.875F, -1F, 0F, 0F, -1F, 0F, -3.875F, 0F, 0F, -2F, 0F, 0F, -4.875F, 1F, 0F, -1F, 1F, 0F, -5.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[515].setRotationPoint(82F, -7F, 4F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-4.875F, 0F, 0F, -1F, 0F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F, -3.875F, 0F, 0F, -2F, 0F, 0F); // Du loco part42
		bodyModel[516].setRotationPoint(82F, -3F, 4F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[517].setRotationPoint(82F, -6F, -10F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-2F, 0F, 0F, -3.875F, 0F, 0F, 0F, -1F, 0F, -5.875F, -1F, 0F, 0F, 0F, 0F, -5.875F, 0F, 0F, -1F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[518].setRotationPoint(82F, -7F, -10F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 1F, 0F, -5.875F, 1F, 0F, -1F, 0F, 0F, -4.875F, 0F, 0F, -2F, 0F, 0F, -3.875F, 0F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F); // Du loco part42
		bodyModel[519].setRotationPoint(82F, -3F, -10F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 5, 2, 11, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[520].setRotationPoint(83F, -6F, -11F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 6, 1, 11, 0F,-1.875F, 0F, 0F, -4F, 0F, 0F, 1F, -1F, 0F, -6.875F, -1F, 0F, 0F, 0F, 0F, -5.875F, 0F, 0F, -0.875F, 1F, 0F, -5F, 1F, 0F); // Du loco part42
		bodyModel[521].setRotationPoint(83F, -7F, -11F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 7, 2, 11, 0F,0F, 0F, 0F, -6.875F, 0F, 0F, -1.875F, -1F, 0F, -5F, -1F, 0F, -3.875F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, -6.875F, 1F, 0F); // Du loco part42
		bodyModel[522].setRotationPoint(83F, -4F, -11F);

		bodyModel[523].addBox(0F, 0F, 0F, 84, 3, 12, 0F); // Du loco part01
		bodyModel[523].setRotationPoint(0F, -11F, -6F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 4, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[524].setRotationPoint(0F, -8F, -6F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 4, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part01
		bodyModel[525].setRotationPoint(80F, -8F, -6F);

		bodyModel[526].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[526].setRotationPoint(77.5F, -4.5F, -6F);

		bodyModel[527].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Du loco part01
		bodyModel[527].setRotationPoint(74.5F, -5.5F, -1F);

		bodyModel[528].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[528].setRotationPoint(5.5F, -4.5F, -6F);

		bodyModel[529].addBox(0F, 0F, 0F, 4, 1, 2, 0F); // Du loco part01
		bodyModel[529].setRotationPoint(5.5F, -5.5F, -1F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[530].setRotationPoint(-3F, -9.25F, 4.43F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[531].setRotationPoint(-2.75F, -9F, 4.9F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[532].setRotationPoint(-5.5F, -8.75F, 5.15F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[533].setRotationPoint(-3F, -9.25F, -6.63F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[534].setRotationPoint(-5.5F, -8.75F, -5.88F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[535].setRotationPoint(-3F, -8.75F, 0F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[536].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[537].setRotationPoint(-2.5F, -8.5F, -0.25F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[538].setRotationPoint(-4.5F, -7F, -0.25F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[539].setRotationPoint(-3.5F, -8.75F, -0.25F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[540].setRotationPoint(-4.5F, -8.5F, 0F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[541].setRotationPoint(-4.5F, -8.5F, -0.75F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[542].setRotationPoint(-3F, -8.75F, 0.25F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[543].setRotationPoint(-3F, -8.5F, -0.25F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[544].setRotationPoint(-3F, -9F, -0.5F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[545].setRotationPoint(-3F, -6F, -0.5F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[546].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[547].setRotationPoint(-4.5F, -6F, -0.5F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[548].setRotationPoint(-4.5F, -5.25F, -0.5F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[549].setRotationPoint(-6.5F, -8.87F, 4.03F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[550].setRotationPoint(-6.5F, -9.87F, 4.03F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[551].setRotationPoint(-6.5F, -9.37F, 4.03F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[552].setRotationPoint(-6.5F, -7.87F, 4.03F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[553].setRotationPoint(-6.5F, -8.37F, 4.03F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[554].setRotationPoint(-6.5F, -8.87F, -7.03F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[555].setRotationPoint(-6.5F, -9.87F, -7.03F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[556].setRotationPoint(-6.5F, -9.37F, -7.03F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[557].setRotationPoint(-6.5F, -7.87F, -7.03F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[558].setRotationPoint(-6.5F, -8.37F, -7.03F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[559].setRotationPoint(-2.75F, -9.5F, 4.9F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[560].setRotationPoint(-2.75F, -8.25F, 4.9F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[561].setRotationPoint(-2.75F, -9F, -6.13F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[562].setRotationPoint(-2.75F, -9.5F, -6.13F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[563].setRotationPoint(-2.75F, -8.25F, -6.13F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[564].setRotationPoint(86F, -9.25F, 4.43F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[565].setRotationPoint(85.75F, -9F, 4.9F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[566].setRotationPoint(86.5F, -8.75F, 5.15F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[567].setRotationPoint(86F, -9.25F, -6.63F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[568].setRotationPoint(86.5F, -8.75F, -5.88F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[569].setRotationPoint(86F, -8.75F, 0F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[570].setRotationPoint(86F, -8.75F, -1F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[571].setRotationPoint(85.5F, -8.5F, -0.25F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[572].setRotationPoint(86.5F, -7F, -0.25F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[573].setRotationPoint(86.5F, -8.75F, -0.25F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[574].setRotationPoint(85.5F, -8.5F, 0F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[575].setRotationPoint(85.5F, -8.5F, -0.75F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[576].setRotationPoint(86F, -8.75F, 0.25F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[577].setRotationPoint(86F, -8.5F, -0.25F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[578].setRotationPoint(86F, -9F, -0.5F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[579].setRotationPoint(86F, -6F, -0.5F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[580].setRotationPoint(86F, -8.75F, -1F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[581].setRotationPoint(86.5F, -6F, -0.5F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[582].setRotationPoint(87.5F, -5.25F, -0.5F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[583].setRotationPoint(89.5F, -8.87F, 4.03F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[584].setRotationPoint(89.5F, -9.87F, 4.03F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[585].setRotationPoint(89.5F, -9.37F, 4.03F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[586].setRotationPoint(89.5F, -7.87F, 4.03F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[587].setRotationPoint(89.5F, -8.37F, 4.03F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[588].setRotationPoint(89.5F, -8.87F, -7.03F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[589].setRotationPoint(89.5F, -9.87F, -7.03F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[590].setRotationPoint(89.5F, -9.37F, -7.03F);

		bodyModel[591].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[591].setRotationPoint(89.5F, -7.87F, -7.03F);

		bodyModel[592].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[592].setRotationPoint(89.5F, -8.37F, -7.03F);

		bodyModel[593].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[593].setRotationPoint(85.75F, -9.5F, 4.9F);

		bodyModel[594].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[594].setRotationPoint(85.75F, -8.25F, 4.9F);

		bodyModel[595].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[595].setRotationPoint(85.75F, -9F, -6.13F);

		bodyModel[596].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[596].setRotationPoint(85.75F, -9.5F, -6.13F);

		bodyModel[597].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[597].setRotationPoint(85.75F, -8.25F, -6.13F);

		bodyModel[598].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[598].setRotationPoint(85.75F, -7F, -0.5F);

		bodyModel[599].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[599].setRotationPoint(85.75F, -7.5F, -0.5F);

		bodyModel[600].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[600].setRotationPoint(-3.75F, -7F, -0.5F);

		bodyModel[601].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[601].setRotationPoint(-2.75F, -7.5F, -0.5F);
	}
}