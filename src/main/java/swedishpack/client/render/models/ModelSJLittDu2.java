//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera Du2
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittDu2 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittDu2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[518];

		initbodyModel_1();
		initbodyModel_2();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[1] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Du loco part03
		bodyModel[2] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Du loco part05
		bodyModel[3] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Du loco part06
		bodyModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Du loco part07
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Du loco part08
		bodyModel[6] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[7] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Du loco part17
		bodyModel[8] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part19
		bodyModel[9] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Du loco part20
		bodyModel[10] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Du loco part22
		bodyModel[11] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Du loco part27
		bodyModel[12] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Du loco part28
		bodyModel[13] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Du loco part41
		bodyModel[14] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Du loco part82
		bodyModel[15] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part83
		bodyModel[16] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Du loco part84
		bodyModel[17] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part85
		bodyModel[18] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part94
		bodyModel[19] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Du loco part95
		bodyModel[20] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part97
		bodyModel[21] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part100
		bodyModel[22] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Du loco part101
		bodyModel[23] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Du loco part102
		bodyModel[24] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Lamp
		bodyModel[25] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Lamp
		bodyModel[26] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Lamp
		bodyModel[27] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Lamp
		bodyModel[28] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 149
		bodyModel[29] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 174
		bodyModel[30] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 177
		bodyModel[31] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 194
		bodyModel[32] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 195
		bodyModel[33] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 135
		bodyModel[34] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 136
		bodyModel[35] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 138
		bodyModel[36] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 139
		bodyModel[37] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 141
		bodyModel[38] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 142
		bodyModel[39] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 143
		bodyModel[40] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 144
		bodyModel[41] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 145
		bodyModel[42] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 146
		bodyModel[43] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 147
		bodyModel[44] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 148
		bodyModel[45] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 149
		bodyModel[46] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 150
		bodyModel[47] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 151
		bodyModel[48] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 152
		bodyModel[49] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 153
		bodyModel[50] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 154
		bodyModel[51] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 155
		bodyModel[52] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 156
		bodyModel[53] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 157
		bodyModel[54] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 158
		bodyModel[55] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 159
		bodyModel[56] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 160
		bodyModel[57] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Du loco part37
		bodyModel[58] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Du loco part37
		bodyModel[59] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Du loco part37
		bodyModel[60] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Du loco part37
		bodyModel[61] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Du loco part37
		bodyModel[62] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part37
		bodyModel[63] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Du loco part37
		bodyModel[64] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Du loco part37
		bodyModel[65] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Du loco part37
		bodyModel[66] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Du loco part37
		bodyModel[67] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Du loco part37
		bodyModel[68] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Lamp
		bodyModel[69] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Du loco part37
		bodyModel[70] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Du loco part37
		bodyModel[71] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[72] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Lamp
		bodyModel[73] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Lamp
		bodyModel[74] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Lamp
		bodyModel[75] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Lamp
		bodyModel[76] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Lamp
		bodyModel[77] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[78] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[79] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 149
		bodyModel[80] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 149
		bodyModel[81] = new ModelRendererTurbo(this, 113, 73, textureX, textureY); // Du loco part37
		bodyModel[82] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Du loco part37
		bodyModel[83] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Du loco part23
		bodyModel[84] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Du loco part23
		bodyModel[85] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Du loco part23
		bodyModel[86] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[87] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Du loco part23
		bodyModel[88] = new ModelRendererTurbo(this, 313, 137, textureX, textureY); // Du loco part23
		bodyModel[89] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Du loco part23
		bodyModel[90] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Du loco part23
		bodyModel[91] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Du loco part09
		bodyModel[92] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Du loco part71
		bodyModel[93] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Du loco part71
		bodyModel[94] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Du loco part71
		bodyModel[95] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 174
		bodyModel[96] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Du loco part28
		bodyModel[97] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part28
		bodyModel[98] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[99] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[100] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Du loco part28
		bodyModel[101] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Du loco part28
		bodyModel[102] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Du loco part28
		bodyModel[103] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part28
		bodyModel[104] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Du loco part28
		bodyModel[105] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Du loco part28
		bodyModel[106] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[107] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[108] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Du loco part28
		bodyModel[109] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Du loco part28
		bodyModel[110] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part05
		bodyModel[111] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Du loco part06
		bodyModel[112] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 167
		bodyModel[113] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 168
		bodyModel[114] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[115] = new ModelRendererTurbo(this, 206, 89, textureX, textureY); // Du loco part06
		bodyModel[116] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Du loco part06
		bodyModel[117] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Du loco part06
		bodyModel[118] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Du loco part06
		bodyModel[119] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Du loco part06
		bodyModel[120] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Du loco part06
		bodyModel[121] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Du loco part06
		bodyModel[122] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[123] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[124] = new ModelRendererTurbo(this, 225, 97, textureX, textureY); // Du loco part41
		bodyModel[125] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Du loco part28
		bodyModel[126] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Du loco part28
		bodyModel[127] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Du loco part05
		bodyModel[128] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Du loco part06
		bodyModel[129] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Du loco part19
		bodyModel[130] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Du loco part22
		bodyModel[131] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Du loco part28
		bodyModel[132] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[133] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[134] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Du loco part Ligjhtpart15
		bodyModel[135] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Du loco part Ligjhtpart13
		bodyModel[136] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[137] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[138] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[139] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[140] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[141] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[142] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Lamp
		bodyModel[143] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Lamp
		bodyModel[144] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 168
		bodyModel[145] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 167
		bodyModel[146] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Du loco part28
		bodyModel[147] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part28
		bodyModel[148] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Du loco part28
		bodyModel[149] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Du loco part28
		bodyModel[150] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Du loco part05
		bodyModel[151] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Du loco part06
		bodyModel[152] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 167
		bodyModel[153] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 168
		bodyModel[154] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[155] = new ModelRendererTurbo(this, 481, 145, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[156] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Du loco part28
		bodyModel[157] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Du loco part28
		bodyModel[158] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Du loco part09
		bodyModel[159] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Du loco part41
		bodyModel[160] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Du loco part41
		bodyModel[161] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Du loco part37
		bodyModel[162] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Du loco part37
		bodyModel[163] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Du loco part37
		bodyModel[164] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Du loco part37
		bodyModel[165] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Du loco part37
		bodyModel[166] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Du loco part37
		bodyModel[167] = new ModelRendererTurbo(this, 161, 209, textureX, textureY); // Du loco part37
		bodyModel[168] = new ModelRendererTurbo(this, 177, 209, textureX, textureY); // Du loco part37
		bodyModel[169] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Du loco part37
		bodyModel[170] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Du loco part37
		bodyModel[171] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Du loco part37
		bodyModel[172] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Du loco part37
		bodyModel[173] = new ModelRendererTurbo(this, 97, 209, textureX, textureY); // Du loco part37
		bodyModel[174] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Du loco part37
		bodyModel[175] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Du loco part37
		bodyModel[176] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Du loco part37
		bodyModel[177] = new ModelRendererTurbo(this, 265, 209, textureX, textureY); // Du loco part37
		bodyModel[178] = new ModelRendererTurbo(this, 281, 209, textureX, textureY); // Du loco part37
		bodyModel[179] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Du loco part37
		bodyModel[180] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Du loco part09
		bodyModel[181] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Du loco part82
		bodyModel[182] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Du loco part83
		bodyModel[183] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Du loco part84
		bodyModel[184] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Du loco part85
		bodyModel[185] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Du loco part94
		bodyModel[186] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Du loco part95
		bodyModel[187] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Du loco part97
		bodyModel[188] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Du loco part100
		bodyModel[189] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part101
		bodyModel[190] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Du loco part102
		bodyModel[191] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 177
		bodyModel[192] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 193
		bodyModel[193] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 196
		bodyModel[194] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Du loco part37
		bodyModel[195] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Du loco part37
		bodyModel[196] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Du loco part37
		bodyModel[197] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Du loco part37
		bodyModel[198] = new ModelRendererTurbo(this, 65, 225, textureX, textureY); // Du loco part37
		bodyModel[199] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Du loco part37
		bodyModel[200] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Du loco part37
		bodyModel[201] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Du loco part37
		bodyModel[202] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Du loco part37
		bodyModel[203] = new ModelRendererTurbo(this, 345, 217, textureX, textureY); // Du loco part37
		bodyModel[204] = new ModelRendererTurbo(this, 121, 225, textureX, textureY); // Du loco part37
		bodyModel[205] = new ModelRendererTurbo(this, 169, 225, textureX, textureY); // Du loco part37
		bodyModel[206] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Du loco part37
		bodyModel[207] = new ModelRendererTurbo(this, 249, 225, textureX, textureY); // Du loco part37
		bodyModel[208] = new ModelRendererTurbo(this, 273, 225, textureX, textureY); // Du loco part37
		bodyModel[209] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Du loco part37
		bodyModel[210] = new ModelRendererTurbo(this, 345, 225, textureX, textureY); // Du loco part37
		bodyModel[211] = new ModelRendererTurbo(this, 377, 225, textureX, textureY); // Du loco part37
		bodyModel[212] = new ModelRendererTurbo(this, 401, 225, textureX, textureY); // Du loco part37
		bodyModel[213] = new ModelRendererTurbo(this, 433, 225, textureX, textureY); // Du loco part37
		bodyModel[214] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Du loco part37
		bodyModel[215] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Du loco part37
		bodyModel[216] = new ModelRendererTurbo(this, 489, 225, textureX, textureY); // Du loco part37
		bodyModel[217] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Du loco part37
		bodyModel[218] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Du loco part37
		bodyModel[219] = new ModelRendererTurbo(this, 105, 225, textureX, textureY); // Du loco part37
		bodyModel[220] = new ModelRendererTurbo(this, 81, 233, textureX, textureY); // Du loco part37
		bodyModel[221] = new ModelRendererTurbo(this, 89, 233, textureX, textureY); // Du loco part37
		bodyModel[222] = new ModelRendererTurbo(this, 137, 233, textureX, textureY); // Du loco part37
		bodyModel[223] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Du loco part37
		bodyModel[224] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Du loco part37
		bodyModel[225] = new ModelRendererTurbo(this, 193, 233, textureX, textureY); // Du loco part37
		bodyModel[226] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Du loco part06
		bodyModel[227] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[228] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[229] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Du loco part06
		bodyModel[230] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[231] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[232] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Du loco part06
		bodyModel[233] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Du loco part06
		bodyModel[234] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Du loco part06
		bodyModel[235] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Du loco part06
		bodyModel[236] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Du loco part28
		bodyModel[237] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Du loco part28
		bodyModel[238] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Du loco part28
		bodyModel[239] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Du loco part28
		bodyModel[240] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Du loco part28
		bodyModel[241] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Du loco part28
		bodyModel[242] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Du loco part28
		bodyModel[243] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Du loco part28
		bodyModel[244] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Du loco part28
		bodyModel[245] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Du loco part28
		bodyModel[246] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Du loco part19
		bodyModel[247] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 174
		bodyModel[248] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 174
		bodyModel[249] = new ModelRendererTurbo(this, 273, 233, textureX, textureY); // Du loco part19
		bodyModel[250] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 156
		bodyModel[251] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 156
		bodyModel[252] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 156
		bodyModel[253] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 156
		bodyModel[254] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		bodyModel[255] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 154
		bodyModel[256] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 154
		bodyModel[257] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 154
		bodyModel[258] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Du loco part23
		bodyModel[259] = new ModelRendererTurbo(this, 209, 241, textureX, textureY); // Du loco part37
		bodyModel[260] = new ModelRendererTurbo(this, 393, 241, textureX, textureY); // Du loco part37
		bodyModel[261] = new ModelRendererTurbo(this, 425, 241, textureX, textureY); // Du loco part37
		bodyModel[262] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Du loco part37
		bodyModel[263] = new ModelRendererTurbo(this, 57, 249, textureX, textureY); // Du loco part37
		bodyModel[264] = new ModelRendererTurbo(this, 97, 249, textureX, textureY); // Du loco part37
		bodyModel[265] = new ModelRendererTurbo(this, 137, 249, textureX, textureY); // Du loco part37
		bodyModel[266] = new ModelRendererTurbo(this, 177, 249, textureX, textureY); // Du loco part37
		bodyModel[267] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Du loco part23
		bodyModel[268] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Du loco part28
		bodyModel[269] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Du loco part28
		bodyModel[270] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Du loco part41
		bodyModel[271] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Du loco part41
		bodyModel[272] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Du loco part06
		bodyModel[273] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Du loco part06
		bodyModel[274] = new ModelRendererTurbo(this, 89, 249, textureX, textureY); // Du loco part06
		bodyModel[275] = new ModelRendererTurbo(this, 169, 249, textureX, textureY); // Du loco part06
		bodyModel[276] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Du loco part06
		bodyModel[277] = new ModelRendererTurbo(this, 273, 249, textureX, textureY); // Du loco part06
		bodyModel[278] = new ModelRendererTurbo(this, 433, 249, textureX, textureY); // Du loco part06
		bodyModel[279] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Du loco part06
		bodyModel[280] = new ModelRendererTurbo(this, 25, 257, textureX, textureY); // Du loco part06
		bodyModel[281] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Du loco part06
		bodyModel[282] = new ModelRendererTurbo(this, 217, 257, textureX, textureY); // Du loco part06
		bodyModel[283] = new ModelRendererTurbo(this, 49, 265, textureX, textureY); // Du loco part01
		bodyModel[284] = new ModelRendererTurbo(this, 73, 273, textureX, textureY); // Du loco part01
		bodyModel[285] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Du loco part01
		bodyModel[286] = new ModelRendererTurbo(this, 257, 265, textureX, textureY); // Du loco part01
		bodyModel[287] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Du loco part01
		bodyModel[288] = new ModelRendererTurbo(this, 121, 273, textureX, textureY); // Du loco part01
		bodyModel[289] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Du loco part01
		bodyModel[290] = new ModelRendererTurbo(this, 257, 257, textureX, textureY); // Du loco part01
		bodyModel[291] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Du loco part01
		bodyModel[292] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Du loco part01
		bodyModel[293] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Du loco part20
		bodyModel[294] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Du loco part20
		bodyModel[295] = new ModelRendererTurbo(this, 8, 73, textureX, textureY); // Du loco part41
		bodyModel[296] = new ModelRendererTurbo(this, 176, 200, textureX, textureY); // Du loco part41
		bodyModel[297] = new ModelRendererTurbo(this, 385, 201, textureX, textureY); // Du loco part41
		bodyModel[298] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Du loco part41
		bodyModel[299] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Du loco part19
		bodyModel[300] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Du loco part19
		bodyModel[301] = new ModelRendererTurbo(this, 233, 257, textureX, textureY); // Du loco part37
		bodyModel[302] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part37
		bodyModel[303] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Du loco part37
		bodyModel[304] = new ModelRendererTurbo(this, 41, 265, textureX, textureY); // Du loco part37
		bodyModel[305] = new ModelRendererTurbo(this, 73, 265, textureX, textureY); // Du loco part37
		bodyModel[306] = new ModelRendererTurbo(this, 89, 265, textureX, textureY); // Du loco part37
		bodyModel[307] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Du loco part37
		bodyModel[308] = new ModelRendererTurbo(this, 177, 265, textureX, textureY); // Du loco part37
		bodyModel[309] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Du loco part37
		bodyModel[310] = new ModelRendererTurbo(this, 169, 33, textureX, textureY); // Du loco part37
		bodyModel[311] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Du loco part37
		bodyModel[312] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Du loco part05
		bodyModel[313] = new ModelRendererTurbo(this, 20, 297, textureX, textureY); // Du loco part05
		bodyModel[314] = new ModelRendererTurbo(this, 1, 300, textureX, textureY); // Du loco part05
		bodyModel[315] = new ModelRendererTurbo(this, 6, 300, textureX, textureY); // Du loco part05
		bodyModel[316] = new ModelRendererTurbo(this, 1, 308, textureX, textureY); // Du loco part05
		bodyModel[317] = new ModelRendererTurbo(this, 20, 308, textureX, textureY); // Du loco part05
		bodyModel[318] = new ModelRendererTurbo(this, 1, 311, textureX, textureY); // Du loco part05
		bodyModel[319] = new ModelRendererTurbo(this, 6, 311, textureX, textureY); // Du loco part05
		bodyModel[320] = new ModelRendererTurbo(this, 1, 319, textureX, textureY); // Du loco part05
		bodyModel[321] = new ModelRendererTurbo(this, 20, 319, textureX, textureY); // Du loco part05
		bodyModel[322] = new ModelRendererTurbo(this, 1, 322, textureX, textureY); // Du loco part05
		bodyModel[323] = new ModelRendererTurbo(this, 6, 322, textureX, textureY); // Du loco part05
		bodyModel[324] = new ModelRendererTurbo(this, 1, 330, textureX, textureY); // Du loco part05
		bodyModel[325] = new ModelRendererTurbo(this, 20, 330, textureX, textureY); // Du loco part05
		bodyModel[326] = new ModelRendererTurbo(this, 1, 333, textureX, textureY); // Du loco part05
		bodyModel[327] = new ModelRendererTurbo(this, 6, 333, textureX, textureY); // Du loco part05
		bodyModel[328] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[329] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[330] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[331] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[332] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[333] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[334] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[335] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[336] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[337] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[338] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[339] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[340] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[341] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[342] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[343] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[344] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[345] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[346] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[347] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[348] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[349] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[350] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[351] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[352] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[353] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[354] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[355] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[356] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[357] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[358] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[359] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[360] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[361] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[362] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[363] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[364] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[365] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[366] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[367] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[368] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[369] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[370] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[371] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[372] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[373] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[374] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[375] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[376] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[377] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[378] = new ModelRendererTurbo(this, 206, 92, textureX, textureY); // Du loco part06
		bodyModel[379] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[380] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[381] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[382] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[383] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[384] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[385] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[386] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[387] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[388] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[389] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[390] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[391] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[392] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[393] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[394] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[395] = new ModelRendererTurbo(this, 14, 377, textureX, textureY); // Du loco part05
		bodyModel[396] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[397] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[398] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[399] = new ModelRendererTurbo(this, 14, 377, textureX, textureY); // Du loco part05
		bodyModel[400] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[401] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[402] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[403] = new ModelRendererTurbo(this, 8, 394, textureX, textureY); // Du loco part05
		bodyModel[404] = new ModelRendererTurbo(this, 1, 394, textureX, textureY); // Du loco part05
		bodyModel[405] = new ModelRendererTurbo(this, 6, 401, textureX, textureY); // Du loco part05
		bodyModel[406] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Du loco part05
		bodyModel[407] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[408] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[409] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[410] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[411] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[412] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[413] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[414] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[415] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[416] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[417] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[418] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[419] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[420] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[421] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[422] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[423] = new ModelRendererTurbo(this, 14, 377, textureX, textureY); // Du loco part05
		bodyModel[424] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[425] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[426] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[427] = new ModelRendererTurbo(this, 14, 377, textureX, textureY); // Du loco part05
		bodyModel[428] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[429] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[430] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[431] = new ModelRendererTurbo(this, 8, 394, textureX, textureY); // Du loco part05
		bodyModel[432] = new ModelRendererTurbo(this, 1, 394, textureX, textureY); // Du loco part05
		bodyModel[433] = new ModelRendererTurbo(this, 6, 401, textureX, textureY); // Du loco part05
		bodyModel[434] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Du loco part05
		bodyModel[435] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[436] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[437] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[438] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[439] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[440] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[441] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[442] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[443] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[444] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[445] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[446] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[447] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[448] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[449] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[450] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[451] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[452] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[453] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[454] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[455] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[456] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[457] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[458] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[459] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[460] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[461] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[462] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[463] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[464] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[465] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[466] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[467] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[468] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[469] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[470] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[471] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[472] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[473] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[474] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[475] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[476] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[477] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[478] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[479] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[480] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[481] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[482] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[483] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[484] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[485] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[486] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[487] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[488] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[489] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[490] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[491] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[492] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[493] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[494] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[495] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[496] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[497] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[498] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[499] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 62, 8, 12, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(11F, -11F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 84, 1, 20, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(0F, -12F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[2].setRotationPoint(0F, -11F, 11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[3].setRotationPoint(0F, -11F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 54, 20, 1, 0F); // Du loco part07
		bodyModel[4].setRotationPoint(15F, -30F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 85, 3, 4, 0F); // Du loco part08
		bodyModel[5].setRotationPoint(-0.5F, -33F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[6].setRotationPoint(-21F, -8F, 6.05F);

		bodyModel[7].addBox(0F, 0F, 0F, 46, 3, 0, 0F); // Du loco part17
		bodyModel[7].setRotationPoint(19F, -10F, -6.15F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[8].setRotationPoint(-1F, -30F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Du loco part20
		bodyModel[9].setRotationPoint(68F, -30F, -10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[10].setRotationPoint(0F, -30F, 10F);

		bodyModel[11].addBox(0F, 0F, 0F, 46, 3, 0, 0F); // Du loco part27
		bodyModel[11].setRotationPoint(19F, -10F, 6.15F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 15, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[12].setRotationPoint(0F, -30F, -11F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[13].setRotationPoint(-2F, -9F, -8F);

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

		bodyModel[24].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[24].setRotationPoint(-2F, -17F, -9F);

		bodyModel[25].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[25].setRotationPoint(-2F, -15F, -9F);

		bodyModel[26].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[26].setRotationPoint(-2F, -15F, 4F);

		bodyModel[27].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[27].setRotationPoint(-2F, -17F, 4F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 85, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 149
		bodyModel[28].setRotationPoint(-0.5F, -31F, 9F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 174
		bodyModel[29].setRotationPoint(-1F, -11F, 10F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[30].setRotationPoint(9F, -16F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[31].setRotationPoint(8F, -15F, -4F);
		bodyModel[31].rotateAngleY = -1.57079633F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[32].setRotationPoint(7F, -15F, -4F);
		bodyModel[32].rotateAngleY = -1.57079633F;

		bodyModel[33].addBox(0F, 0F, 0F, 54, 20, 1, 0F); // Box 135
		bodyModel[33].setRotationPoint(15F, -30F, 10F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 136
		bodyModel[34].setRotationPoint(15F, -30F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[35].setRotationPoint(20F, -16F, -2F);

		bodyModel[36].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[36].setRotationPoint(19F, -22F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[37].setRotationPoint(19F, -24F, -3F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 142
		bodyModel[38].setRotationPoint(20F, -25F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 143
		bodyModel[39].setRotationPoint(19F, -26F, -3F);

		bodyModel[40].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 144
		bodyModel[40].setRotationPoint(19F, -30F, -3F);

		bodyModel[41].addBox(0F, 0F, 0F, 12, 15, 12, 0F); // Box 145
		bodyModel[41].setRotationPoint(28F, -27F, -5F);

		bodyModel[42].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 146
		bodyModel[42].setRotationPoint(27F, -28F, -6F);

		bodyModel[43].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[43].setRotationPoint(22F, -19F, -4F);

		bodyModel[44].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 148
		bodyModel[44].setRotationPoint(26F, -26F, -4F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[45].setRotationPoint(27F, -26F, -4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[46].setRotationPoint(41F, -16F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[47].setRotationPoint(51F, -16F, -2F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 152
		bodyModel[48].setRotationPoint(52F, -30F, -1F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 153
		bodyModel[49].setRotationPoint(42F, -30F, -1F);

		bodyModel[50].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 154
		bodyModel[50].setRotationPoint(45F, -27F, -1F);

		bodyModel[51].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 155
		bodyModel[51].setRotationPoint(49F, -27F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 156
		bodyModel[52].setRotationPoint(49F, -18F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F); // Box 157
		bodyModel[53].setRotationPoint(45F, -18F, -1F);

		bodyModel[54].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 158
		bodyModel[54].setRotationPoint(47F, -26F, -1F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 159
		bodyModel[55].setRotationPoint(51F, -26F, -1F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 160
		bodyModel[56].setRotationPoint(44F, -26F, -1F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[57].setRotationPoint(5F, -33F, -6F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[58].setRotationPoint(5F, -33F, 5F);

		bodyModel[59].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[59].setRotationPoint(23F, -33F, -6F);

		bodyModel[60].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[60].setRotationPoint(23F, -33F, 5F);

		bodyModel[61].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[61].setRotationPoint(5F, -34F, -6F);

		bodyModel[62].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[62].setRotationPoint(5F, -34F, 5F);

		bodyModel[63].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[63].setRotationPoint(13F, -37F, -4F);

		bodyModel[64].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[64].setRotationPoint(13F, -37F, 3F);

		bodyModel[65].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[65].setRotationPoint(14F, -38F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[66].setRotationPoint(14F, -38F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[67].setRotationPoint(14F, -38F, -8F);

		bodyModel[68].addBox(0F, 0F, 0F, 20, 1, 0, 0F); // Lamp
		bodyModel[68].setRotationPoint(32F, -34F, -7.05F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[69].setRotationPoint(2F, -35F, -5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[70].setRotationPoint(2F, -36F, -4F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part Ligjhtpart8
		bodyModel[71].setRotationPoint(-0.5F, -34F, -2F);

		bodyModel[72].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[72].setRotationPoint(-2F, -16F, -9F);

		bodyModel[73].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[73].setRotationPoint(-2F, -16F, 4F);

		bodyModel[74].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[74].setRotationPoint(-1.5F, -34F, -3F);

		bodyModel[75].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[75].setRotationPoint(-1.5F, -31F, -3F);

		bodyModel[76].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Lamp
		bodyModel[76].setRotationPoint(-1.5F, -33F, -3F);

		bodyModel[77].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[77].setRotationPoint(-1.5F, -31F, 1F);

		bodyModel[78].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[78].setRotationPoint(-1.5F, -32F, 1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 85, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[79].setRotationPoint(-0.5F, -32F, 6F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 85, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[80].setRotationPoint(-0.5F, -33F, 2F);

		bodyModel[81].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Du loco part37
		bodyModel[81].setRotationPoint(52F, -35F, -1F);

		bodyModel[82].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[82].setRotationPoint(13F, -34F, -9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[83].setRotationPoint(18F, -11F, 6.05F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[84].setRotationPoint(4F, -11F, 6.05F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[85].setRotationPoint(-10F, -11F, 6.05F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[86].setRotationPoint(-24F, -11F, 6.05F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[87].setRotationPoint(18F, -11F, -6.05F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[88].setRotationPoint(4F, -11F, -6.05F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[89].setRotationPoint(-10F, -11F, -6.05F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[90].setRotationPoint(-24F, -11F, -6.05F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[91].setRotationPoint(-21F, -8F, -6.05F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 85, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[92].setRotationPoint(-0.5F, -33F, -6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 85, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[93].setRotationPoint(-0.5F, -32F, -9F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 85, 1, 2, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[94].setRotationPoint(-0.5F, -31F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[95].setRotationPoint(-1F, -11F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[96].setRotationPoint(10F, -11F, -9F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[97].setRotationPoint(13F, -11F, -9F);

		bodyModel[98].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[98].setRotationPoint(10F, -11F, 8F);

		bodyModel[99].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[99].setRotationPoint(13F, -11F, 8F);

		bodyModel[100].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[100].setRotationPoint(10F, -5F, -11F);

		bodyModel[101].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[101].setRotationPoint(10F, -7F, -11F);

		bodyModel[102].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[102].setRotationPoint(10F, -9F, -11F);

		bodyModel[103].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[103].setRotationPoint(10F, -5F, 9F);

		bodyModel[104].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[104].setRotationPoint(10F, -7F, 9F);

		bodyModel[105].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[105].setRotationPoint(10F, -9F, 9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[106].setRotationPoint(9F, -25F, 11F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[107].setRotationPoint(14F, -25F, 11F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[108].setRotationPoint(9F, -25F, -12F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[109].setRotationPoint(14F, -25F, -12F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Du loco part05
		bodyModel[110].setRotationPoint(-1F, -20F, 11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[111].setRotationPoint(-1F, -20F, -12F);

		bodyModel[112].addShapeBox(0F, 0F, 1F, 1, 1, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[112].setRotationPoint(-2F, -20F, -12F);

		bodyModel[113].addShapeBox(0F, 0F, 1F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 168
		bodyModel[113].setRotationPoint(-2F, -20F, 1F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[114].setRotationPoint(61F, -9F, -11F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part06
		bodyModel[115].setRotationPoint(26F, -9F, 9F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[116].setRotationPoint(27F, -10F, 9F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[117].setRotationPoint(27F, -10F, 10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[118].setRotationPoint(29F, -10F, 10F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[119].setRotationPoint(26F, -10F, 10F);

		bodyModel[120].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[120].setRotationPoint(61F, -10F, -11F);

		bodyModel[121].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[121].setRotationPoint(64F, -10F, -11F);

		bodyModel[122].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[122].setRotationPoint(-2F, -15F, -2F);

		bodyModel[123].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[123].setRotationPoint(-2F, -16F, -2F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Du loco part41
		bodyModel[124].setRotationPoint(-2F, -5F, -4F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[125].setRotationPoint(-2.01F, -26F, 2F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[126].setRotationPoint(-2.01F, -26F, -3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[127].setRotationPoint(75F, -11F, 11F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[128].setRotationPoint(75F, -11F, -12F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[129].setRotationPoint(84F, -30F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 15, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[130].setRotationPoint(69F, -30F, 10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 15, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[131].setRotationPoint(69F, -30F, -11F);

		bodyModel[132].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[132].setRotationPoint(85F, -17F, -9F);

		bodyModel[133].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[133].setRotationPoint(85F, -15F, -9F);

		bodyModel[134].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart15
		bodyModel[134].setRotationPoint(85F, -15F, 4F);

		bodyModel[135].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart13
		bodyModel[135].setRotationPoint(85F, -17F, 4F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part Ligjhtpart8
		bodyModel[136].setRotationPoint(80.5F, -34F, -2F);

		bodyModel[137].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[137].setRotationPoint(85F, -16F, -9F);

		bodyModel[138].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[138].setRotationPoint(85F, -16F, 4F);

		bodyModel[139].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[139].setRotationPoint(84.5F, -34F, -3F);

		bodyModel[140].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[140].setRotationPoint(84.5F, -31F, -3F);

		bodyModel[141].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Du loco part Ligjhtpart18
		bodyModel[141].setRotationPoint(84.5F, -33F, -3F);

		bodyModel[142].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[142].setRotationPoint(84.5F, -31F, -5F);

		bodyModel[143].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[143].setRotationPoint(84.5F, -32F, -5F);

		bodyModel[144].addShapeBox(0F, 0F, 1F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[144].setRotationPoint(84F, -30F, 9F);

		bodyModel[145].addShapeBox(0F, 0F, 1F, 1, 19, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[145].setRotationPoint(84F, -30F, -12F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[146].setRotationPoint(69F, -25F, 11F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[147].setRotationPoint(74F, -25F, 11F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[148].setRotationPoint(69F, -25F, -12F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[149].setRotationPoint(74F, -25F, -12F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[150].setRotationPoint(75F, -20F, 11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[151].setRotationPoint(75F, -20F, -12F);

		bodyModel[152].addShapeBox(0F, 0F, 1F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[152].setRotationPoint(85F, -20F, -12F);

		bodyModel[153].addShapeBox(0F, 0F, 1F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 168
		bodyModel[153].setRotationPoint(85F, -20F, 1F);

		bodyModel[154].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[154].setRotationPoint(85F, -15F, -2F);

		bodyModel[155].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[155].setRotationPoint(85F, -16F, -2F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[156].setRotationPoint(85.01F, -26F, 2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[157].setRotationPoint(85.01F, -26F, -3F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[158].setRotationPoint(52F, -8F, -6.05F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[159].setRotationPoint(85F, -9F, -8F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 2, 8, 0F); // Du loco part41
		bodyModel[160].setRotationPoint(84F, -5F, -4F);

		bodyModel[161].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[161].setRotationPoint(60F, -33F, -6F);

		bodyModel[162].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[162].setRotationPoint(60F, -33F, 5F);

		bodyModel[163].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[163].setRotationPoint(78F, -33F, -6F);

		bodyModel[164].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[164].setRotationPoint(78F, -33F, 5F);

		bodyModel[165].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[165].setRotationPoint(60F, -34F, -6F);

		bodyModel[166].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[166].setRotationPoint(60F, -34F, 5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[167].setRotationPoint(73F, -40F, 4F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[168].setRotationPoint(60F, -40F, 4F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[169].setRotationPoint(70F, -46F, 3F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[170].setRotationPoint(60F, -46F, 3F);

		bodyModel[171].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[171].setRotationPoint(68F, -47F, -4F);

		bodyModel[172].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[172].setRotationPoint(68F, -47F, 3F);

		bodyModel[173].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[173].setRotationPoint(69F, -48F, -6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[174].setRotationPoint(69F, -48F, 6F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[175].setRotationPoint(69F, -48F, -8F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[176].setRotationPoint(73F, -40F, -5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[177].setRotationPoint(60F, -40F, -5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[178].setRotationPoint(70F, -46F, -4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[179].setRotationPoint(60F, -46F, -4F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, -23F, -23F, 0F); // Du loco part09
		bodyModel[180].setRotationPoint(52F, -8F, 6.05F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[181].setRotationPoint(78F, -19F, -10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[182].setRotationPoint(74F, -13F, -6F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[183].setRotationPoint(74F, -13F, -6F);
		bodyModel[183].rotateAngleY = -1.57079633F;

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[184].setRotationPoint(74F, -13F, -3F);
		bodyModel[184].rotateAngleY = -1.57079633F;

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[185].setRotationPoint(75F, -16F, -6F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[186].setRotationPoint(75F, -16F, -3F);
		bodyModel[186].rotateAngleY = -1.57079633F;

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[187].setRotationPoint(75F, -16F, -6F);
		bodyModel[187].rotateAngleY = -1.57079633F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[188].setRotationPoint(74F, -20F, -6F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[189].setRotationPoint(74F, -20F, -7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[190].setRotationPoint(74F, -20F, -4F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[191].setRotationPoint(74F, -16F, -7F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[192].setRotationPoint(76F, -15F, -4F);
		bodyModel[192].rotateAngleY = -1.57079633F;

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[193].setRotationPoint(75F, -15F, -4F);
		bodyModel[193].rotateAngleY = -1.57079633F;

		bodyModel[194].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[194].setRotationPoint(18F, -35F, 4F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, 0F, 0F, -2F, -7F, 0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -1F, -7F); // Du loco part37
		bodyModel[195].setRotationPoint(16F, -37F, -4F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[196].setRotationPoint(2F, -35F, 4F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[197].setRotationPoint(2F, -36F, 3F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[198].setRotationPoint(18F, -35F, -5F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[199].setRotationPoint(15F, -36F, -4F);

		bodyModel[200].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[200].setRotationPoint(68F, -37F, -4F);

		bodyModel[201].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[201].setRotationPoint(68F, -37F, 3F);

		bodyModel[202].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[202].setRotationPoint(69F, -38F, -6F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[203].setRotationPoint(69F, -38F, 6F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[204].setRotationPoint(69F, -38F, -8F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[205].setRotationPoint(57F, -35F, -5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[206].setRotationPoint(57F, -36F, -4F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[207].setRotationPoint(73F, -35F, 4F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[208].setRotationPoint(70F, -36F, 3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[209].setRotationPoint(57F, -35F, 4F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[210].setRotationPoint(57F, -36F, 3F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[211].setRotationPoint(73F, -35F, -5F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[212].setRotationPoint(70F, -36F, -4F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[213].setRotationPoint(18F, -40F, 4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[214].setRotationPoint(5F, -40F, 4F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[215].setRotationPoint(15F, -46F, 3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[216].setRotationPoint(5F, -46F, 3F);

		bodyModel[217].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[217].setRotationPoint(13F, -47F, -4F);

		bodyModel[218].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Du loco part37
		bodyModel[218].setRotationPoint(13F, -47F, 3F);

		bodyModel[219].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part37
		bodyModel[219].setRotationPoint(14F, -48F, -6F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[220].setRotationPoint(14F, -48F, 6F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[221].setRotationPoint(14F, -48F, -8F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[222].setRotationPoint(18F, -40F, -5F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 6, 7, 1, 0F,0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Du loco part37
		bodyModel[223].setRotationPoint(5F, -40F, -5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,-1F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F); // Du loco part37
		bodyModel[224].setRotationPoint(15F, -46F, -4F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 9, 7, 1, 0F,0F, -6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[225].setRotationPoint(5F, -46F, -4F);

		bodyModel[226].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Du loco part06
		bodyModel[226].setRotationPoint(11F, -11F, 6F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[227].setRotationPoint(25F, -10F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[228].setRotationPoint(29F, -8F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[229].setRotationPoint(24F, -8F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[230].setRotationPoint(25F, -8F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[231].setRotationPoint(29F, -10F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[232].setRotationPoint(24F, -10F, -11F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[233].setRotationPoint(24F, -9F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[234].setRotationPoint(29F, -9F, -11F);

		bodyModel[235].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[235].setRotationPoint(25F, -9F, -11F);

		bodyModel[236].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[236].setRotationPoint(70F, -11F, -9F);

		bodyModel[237].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[237].setRotationPoint(73F, -11F, -9F);

		bodyModel[238].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[238].setRotationPoint(70F, -11F, 8F);

		bodyModel[239].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[239].setRotationPoint(73F, -11F, 8F);

		bodyModel[240].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[240].setRotationPoint(70F, -5F, -11F);

		bodyModel[241].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[241].setRotationPoint(70F, -7F, -11F);

		bodyModel[242].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[242].setRotationPoint(70F, -9F, -11F);

		bodyModel[243].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[243].setRotationPoint(70F, -5F, 9F);

		bodyModel[244].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[244].setRotationPoint(70F, -7F, 9F);

		bodyModel[245].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[245].setRotationPoint(70F, -9F, 9F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 0, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[246].setRotationPoint(86.05F, -15F, -3F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[247].setRotationPoint(83F, -11F, 10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[248].setRotationPoint(83F, -11F, -11F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 0, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[249].setRotationPoint(-2.05F, -15F, -3F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 156
		bodyModel[250].setRotationPoint(84F, -30F, -11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[251].setRotationPoint(84F, -30F, 10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 156
		bodyModel[252].setRotationPoint(-2F, -30F, -11F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[253].setRotationPoint(-2F, -30F, 10F);

		bodyModel[254].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[254].setRotationPoint(-2F, -32F, -10.75F);

		bodyModel[255].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[255].setRotationPoint(-1.5F, -32F, -11.25F);

		bodyModel[256].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[256].setRotationPoint(-2F, -32F, 10.75F);

		bodyModel[257].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[257].setRotationPoint(-1.5F, -32F, 10.25F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[258].setRotationPoint(-3F, -21F, 11.05F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F); // Du loco part37
		bodyModel[259].setRotationPoint(16F, -46F, -4F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F); // Du loco part37
		bodyModel[260].setRotationPoint(16F, -46F, -4F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 12, 2, 1, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Du loco part37
		bodyModel[261].setRotationPoint(15F, -36F, 3F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -1F, -7F, 0F, -2F, 0F, 0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -1F, 0F); // Du loco part37
		bodyModel[262].setRotationPoint(16F, -37F, -4F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, -2F, 0F, 0F, 0F, -7F, 0F, -1F, 0F, 0F, -1F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[263].setRotationPoint(57F, -37F, -4F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, -7F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, 0F, -7F, 0F, -6F, 0F, 0F, -6F, -7F, 0F, 0F, 0F); // Du loco part37
		bodyModel[264].setRotationPoint(60F, -46F, -4F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,0F, -6F, 0F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, 0F, 0F, 0F, -6F, -7F, 0F, -6F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[265].setRotationPoint(60F, -46F, -4F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 11, 2, 8, 0F,0F, -2F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, -2F, -7F, 0F, 0F, 0F, 0F, -1F, -7F, 0F, -1F, 0F, 0F, 0F, -7F); // Du loco part37
		bodyModel[266].setRotationPoint(57F, -37F, -4F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[267].setRotationPoint(-3F, -21F, -11.05F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[268].setRotationPoint(-1F, -30F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[269].setRotationPoint(-1F, -30F, 10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part41
		bodyModel[270].setRotationPoint(-2F, -11F, -10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part41
		bodyModel[271].setRotationPoint(85F, -11F, -10F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part06
		bodyModel[272].setRotationPoint(11F, -8F, 6F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F); // Du loco part06
		bodyModel[273].setRotationPoint(13F, -7F, 6F);

		bodyModel[274].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Du loco part06
		bodyModel[274].setRotationPoint(11F, -11F, -8F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part06
		bodyModel[275].setRotationPoint(11F, -8F, -8F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part06
		bodyModel[276].setRotationPoint(13F, -7F, -8F);

		bodyModel[277].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Du loco part06
		bodyModel[277].setRotationPoint(68F, -11F, 6F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[278].setRotationPoint(68F, -8F, 6F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F); // Du loco part06
		bodyModel[279].setRotationPoint(68F, -7F, 6F);

		bodyModel[280].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Du loco part06
		bodyModel[280].setRotationPoint(68F, -11F, -8F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[281].setRotationPoint(68F, -8F, -8F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[282].setRotationPoint(68F, -7F, -8F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[283].setRotationPoint(1F, -9F, -6F);

		bodyModel[284].addBox(0F, 0F, 0F, 10, 2, 12, 0F); // Du loco part01
		bodyModel[284].setRotationPoint(1F, -11F, -6F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Du loco part01
		bodyModel[285].setRotationPoint(7F, -9F, -6F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part01
		bodyModel[286].setRotationPoint(81F, -9F, -6F);

		bodyModel[287].addBox(0F, 0F, 0F, 10, 2, 12, 0F); // Du loco part01
		bodyModel[287].setRotationPoint(73F, -11F, -6F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[288].setRotationPoint(73F, -9F, -6F);

		bodyModel[289].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[289].setRotationPoint(78F, -5F, -6F);

		bodyModel[290].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Du loco part01
		bodyModel[290].setRotationPoint(74F, -6F, -1F);

		bodyModel[291].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Du loco part01
		bodyModel[291].setRotationPoint(5F, -6F, -1F);

		bodyModel[292].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[292].setRotationPoint(5F, -5F, -6F);

		bodyModel[293].addBox(0F, 0F, 0F, 4, 18, 8, 0F); // Du loco part20
		bodyModel[293].setRotationPoint(69F, -30F, -4F);

		bodyModel[294].addBox(0F, 0F, 0F, 4, 18, 8, 0F); // Du loco part20
		bodyModel[294].setRotationPoint(11F, -30F, -4F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F); // Du loco part41
		bodyModel[295].setRotationPoint(-2F, -5F, 4F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 2.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 1F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[296].setRotationPoint(-2F, -5F, -5F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F); // Du loco part41
		bodyModel[297].setRotationPoint(84F, -5F, 4F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Du loco part41
		bodyModel[298].setRotationPoint(84F, -5F, -5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[299].setRotationPoint(-2.05F, -13F, 1F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 0, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[300].setRotationPoint(86.05F, -13F, -5F);

		bodyModel[301].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[301].setRotationPoint(16F, -34F, -9F);

		bodyModel[302].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[302].setRotationPoint(30F, -34F, -8F);

		bodyModel[303].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[303].setRotationPoint(41F, -34F, -8F);

		bodyModel[304].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[304].setRotationPoint(52F, -34F, -8F);

		bodyModel[305].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[305].setRotationPoint(52F, -34F, 6F);

		bodyModel[306].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[306].setRotationPoint(66F, -34F, 7F);

		bodyModel[307].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[307].setRotationPoint(69F, -34F, 7F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part37
		bodyModel[308].setRotationPoint(54F, -34F, 7F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part37
		bodyModel[309].setRotationPoint(15F, -34F, -8F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part37
		bodyModel[310].setRotationPoint(52F, -35F, 1F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F); // Du loco part37
		bodyModel[311].setRotationPoint(52F, -35F, -6F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[312].setRotationPoint(22F, -22F, 10F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[313].setRotationPoint(22F, -28F, 10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[314].setRotationPoint(22F, -28F, 10F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[315].setRotationPoint(29F, -28F, 10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[316].setRotationPoint(38F, -22F, 10F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[317].setRotationPoint(38F, -28F, 10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[318].setRotationPoint(38F, -28F, 10F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[319].setRotationPoint(45F, -28F, 10F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[320].setRotationPoint(22F, -22F, -11F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[321].setRotationPoint(22F, -28F, -11F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[322].setRotationPoint(22F, -28F, -11F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[323].setRotationPoint(29F, -28F, -11F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[324].setRotationPoint(38F, -22F, -11F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[325].setRotationPoint(38F, -28F, -11F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[326].setRotationPoint(38F, -28F, -11F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[327].setRotationPoint(45F, -28F, -11F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[328].setRotationPoint(53F, -28F, 10F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[329].setRotationPoint(62F, -28F, 10F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[330].setRotationPoint(54F, -21F, 10F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[331].setRotationPoint(54F, -29F, 10F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[332].setRotationPoint(54F, -27F, 10F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[333].setRotationPoint(58F, -27F, 10F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[334].setRotationPoint(58F, -27F, 10F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[335].setRotationPoint(54F, -26.25F, 10F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[336].setRotationPoint(58F, -26.25F, 10F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[337].setRotationPoint(54F, -25.5F, 10F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[338].setRotationPoint(58F, -25.5F, 10F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[339].setRotationPoint(54F, -24.75F, 10F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[340].setRotationPoint(58F, -24.75F, 10F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[341].setRotationPoint(54F, -24F, 10F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[342].setRotationPoint(58F, -24F, 10F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[343].setRotationPoint(54F, -23.25F, 10F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[344].setRotationPoint(58F, -23.25F, 10F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[345].setRotationPoint(54F, -22.5F, 10F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[346].setRotationPoint(58F, -22.5F, 10F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[347].setRotationPoint(53F, -28F, -11F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[348].setRotationPoint(62F, -28F, -11F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[349].setRotationPoint(54F, -21F, -11F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[350].setRotationPoint(54F, -29F, -11F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[351].setRotationPoint(58F, -28F, -11F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[352].setRotationPoint(54F, -27F, -11F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[353].setRotationPoint(58F, -27F, -11F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[354].setRotationPoint(54F, -26.25F, -11F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[355].setRotationPoint(58F, -26.25F, -11F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[356].setRotationPoint(54F, -25.5F, -11F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[357].setRotationPoint(58F, -25.5F, -11F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[358].setRotationPoint(54F, -24.75F, -11F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[359].setRotationPoint(58F, -24.75F, -11F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[360].setRotationPoint(54F, -24F, -11F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[361].setRotationPoint(58F, -24F, -11F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[362].setRotationPoint(54F, -23.25F, -11F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[363].setRotationPoint(58F, -23.25F, -11F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[364].setRotationPoint(54F, -22.5F, -11F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[365].setRotationPoint(58F, -22.5F, -11F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[366].setRotationPoint(54F, -21.75F, 10F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[367].setRotationPoint(58F, -21.75F, 10F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[368].setRotationPoint(58F, -28.5F, 10F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[369].setRotationPoint(54F, -28.5F, 10F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[370].setRotationPoint(54F, -21.75F, -11F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[371].setRotationPoint(58F, -21.75F, -11F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[372].setRotationPoint(58F, -28.5F, -11F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[373].setRotationPoint(54F, -28.5F, -11F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[374].setRotationPoint(54F, -27.75F, -11F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[375].setRotationPoint(58F, -27.75F, -11F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[376].setRotationPoint(54F, -27.75F, 10F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[377].setRotationPoint(58F, -27.75F, 10F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F); // Du loco part06
		bodyModel[378].setRotationPoint(26F, -9F, 10F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[379].setRotationPoint(3F, -22F, 10F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[380].setRotationPoint(3F, -28F, 10F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[381].setRotationPoint(3F, -28F, 10F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[382].setRotationPoint(7F, -28F, 10F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[383].setRotationPoint(11F, -22F, 10F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[384].setRotationPoint(11F, -28F, 10F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[385].setRotationPoint(11F, -28F, 10F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[386].setRotationPoint(12F, -28F, 10F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[387].setRotationPoint(3F, -22F, -11F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[388].setRotationPoint(3F, -28F, -11F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[389].setRotationPoint(3F, -28F, -11F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[390].setRotationPoint(7F, -28F, -11F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[391].setRotationPoint(11F, -22F, -11F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[392].setRotationPoint(11F, -28F, -11F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[393].setRotationPoint(11F, -28F, -11F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[394].setRotationPoint(12F, -28F, -11F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[395].setRotationPoint(-1F, -22F, 4F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[396].setRotationPoint(-1F, -29F, 4F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[397].setRotationPoint(-1F, -29F, 4F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[398].setRotationPoint(-1F, -29F, 8F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[399].setRotationPoint(-1F, -22F, -9F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[400].setRotationPoint(-1F, -29F, -9F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[401].setRotationPoint(-1F, -29F, -9F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[402].setRotationPoint(-1F, -29F, -5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[403].setRotationPoint(-1F, -22F, -1F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[404].setRotationPoint(-1F, -28F, -1F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[405].setRotationPoint(-1F, -28F, -1F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[406].setRotationPoint(-1F, -28F, 0F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[407].setRotationPoint(76F, -22F, 10F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[408].setRotationPoint(76F, -28F, 10F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[409].setRotationPoint(76F, -28F, 10F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[410].setRotationPoint(80F, -28F, 10F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[411].setRotationPoint(71F, -22F, 10F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[412].setRotationPoint(71F, -28F, 10F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[413].setRotationPoint(71F, -28F, 10F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[414].setRotationPoint(72F, -28F, 10F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[415].setRotationPoint(76F, -22F, -11F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[416].setRotationPoint(76F, -28F, -11F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[417].setRotationPoint(76F, -28F, -11F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[418].setRotationPoint(80F, -28F, -11F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[419].setRotationPoint(71F, -22F, -11F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[420].setRotationPoint(71F, -28F, -11F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[421].setRotationPoint(71F, -28F, -11F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[422].setRotationPoint(72F, -28F, -11F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[423].setRotationPoint(84F, -22F, 4F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[424].setRotationPoint(84F, -29F, 4F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[425].setRotationPoint(84F, -29F, 4F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[426].setRotationPoint(84F, -29F, 8F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[427].setRotationPoint(84F, -22F, -9F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[428].setRotationPoint(84F, -29F, -9F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[429].setRotationPoint(84F, -29F, -9F);

		bodyModel[430].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[430].setRotationPoint(84F, -29F, -5F);

		bodyModel[431].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[431].setRotationPoint(84F, -22F, -1F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[432].setRotationPoint(84F, -28F, -1F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[433].setRotationPoint(84F, -28F, -1F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[434].setRotationPoint(84F, -28F, 0F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[435].setRotationPoint(61F, -9F, -10F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[436].setRotationPoint(61F, -10F, -10F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[437].setRotationPoint(61F, -10F, -11F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[438].setRotationPoint(-3F, -9.25F, 4.43F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[439].setRotationPoint(-2.75F, -9F, 4.9F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[440].setRotationPoint(-5.5F, -8.75F, 5.15F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[441].setRotationPoint(-3F, -9.25F, -6.63F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[442].setRotationPoint(-5.5F, -8.75F, -5.88F);

		bodyModel[443].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[443].setRotationPoint(-3F, -8.75F, 0F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[444].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[445].setRotationPoint(-2.5F, -8.5F, -0.25F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[446].setRotationPoint(-4.5F, -7F, -0.25F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[447].setRotationPoint(-3.5F, -8.75F, -0.25F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[448].setRotationPoint(-4.5F, -8.5F, 0F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[449].setRotationPoint(-4.5F, -8.5F, -0.75F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[450].setRotationPoint(-3F, -8.75F, 0.25F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[451].setRotationPoint(-3F, -8.5F, -0.25F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[452].setRotationPoint(-3F, -9F, -0.5F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[453].setRotationPoint(-3F, -6F, -0.5F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[454].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[455].setRotationPoint(-4.5F, -6F, -0.5F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[456].setRotationPoint(-4.5F, -5.25F, -0.5F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[457].setRotationPoint(-6.5F, -8.87F, 4.03F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[458].setRotationPoint(-6.5F, -9.87F, 4.03F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[459].setRotationPoint(-6.5F, -9.37F, 4.03F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[460].setRotationPoint(-6.5F, -7.87F, 4.03F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[461].setRotationPoint(-6.5F, -8.37F, 4.03F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[462].setRotationPoint(-6.5F, -8.87F, -7.03F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[463].setRotationPoint(-6.5F, -9.87F, -7.03F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[464].setRotationPoint(-6.5F, -9.37F, -7.03F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[465].setRotationPoint(-6.5F, -7.87F, -7.03F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[466].setRotationPoint(-6.5F, -8.37F, -7.03F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[467].setRotationPoint(-2.75F, -9.5F, 4.9F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[468].setRotationPoint(-2.75F, -8.25F, 4.9F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[469].setRotationPoint(-2.75F, -9F, -6.13F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[470].setRotationPoint(-2.75F, -9.5F, -6.13F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[471].setRotationPoint(-2.75F, -8.25F, -6.13F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[472].setRotationPoint(86F, -9.25F, 4.43F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[473].setRotationPoint(85.75F, -9F, 4.9F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[474].setRotationPoint(86.5F, -8.75F, 5.15F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[475].setRotationPoint(86F, -9.25F, -6.63F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[476].setRotationPoint(86.5F, -8.75F, -5.88F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[477].setRotationPoint(86F, -8.75F, 0F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[478].setRotationPoint(86F, -8.75F, -1F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[479].setRotationPoint(85.5F, -8.5F, -0.25F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[480].setRotationPoint(86.5F, -7F, -0.25F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[481].setRotationPoint(86.5F, -8.75F, -0.25F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[482].setRotationPoint(85.5F, -8.5F, 0F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[483].setRotationPoint(85.5F, -8.5F, -0.75F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[484].setRotationPoint(86F, -8.75F, 0.25F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[485].setRotationPoint(86F, -8.5F, -0.25F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[486].setRotationPoint(86F, -9F, -0.5F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[487].setRotationPoint(86F, -6F, -0.5F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[488].setRotationPoint(86F, -8.75F, -1F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[489].setRotationPoint(86.5F, -6F, -0.5F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[490].setRotationPoint(87.5F, -5.25F, -0.5F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[491].setRotationPoint(89.5F, -8.87F, 4.03F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[492].setRotationPoint(89.5F, -9.87F, 4.03F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[493].setRotationPoint(89.5F, -9.37F, 4.03F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[494].setRotationPoint(89.5F, -7.87F, 4.03F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[495].setRotationPoint(89.5F, -8.37F, 4.03F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[496].setRotationPoint(89.5F, -8.87F, -7.03F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[497].setRotationPoint(89.5F, -9.87F, -7.03F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[498].setRotationPoint(89.5F, -9.37F, -7.03F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[499].setRotationPoint(89.5F, -7.87F, -7.03F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[501] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[502] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[503] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[504] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[505] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[506] = new ModelRendererTurbo(this, 455, 494, textureX, textureY); // Du loco part42
		bodyModel[507] = new ModelRendererTurbo(this, 454, 470, textureX, textureY); // Du loco part42
		bodyModel[508] = new ModelRendererTurbo(this, 454, 462, textureX, textureY); // Du loco part42
		bodyModel[509] = new ModelRendererTurbo(this, 430, 494, textureX, textureY); // Du loco part42
		bodyModel[510] = new ModelRendererTurbo(this, 454, 486, textureX, textureY); // Du loco part42
		bodyModel[511] = new ModelRendererTurbo(this, 429, 478, textureX, textureY); // Du loco part42
		bodyModel[512] = new ModelRendererTurbo(this, 430, 503, textureX, textureY); // Du loco part42
		bodyModel[513] = new ModelRendererTurbo(this, 429, 462, textureX, textureY); // Du loco part42
		bodyModel[514] = new ModelRendererTurbo(this, 454, 478, textureX, textureY); // Du loco part42
		bodyModel[515] = new ModelRendererTurbo(this, 455, 503, textureX, textureY); // Du loco part42
		bodyModel[516] = new ModelRendererTurbo(this, 429, 486, textureX, textureY); // Du loco part42
		bodyModel[517] = new ModelRendererTurbo(this, 429, 470, textureX, textureY); // Du loco part42

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[500].setRotationPoint(89.5F, -8.37F, -7.03F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[501].setRotationPoint(85.75F, -9.5F, 4.9F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[502].setRotationPoint(85.75F, -8.25F, 4.9F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[503].setRotationPoint(85.75F, -9F, -6.13F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[504].setRotationPoint(85.75F, -9.5F, -6.13F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[505].setRotationPoint(85.75F, -8.25F, -6.13F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part42
		bodyModel[506].setRotationPoint(-3F, -6F, 4F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -1F, 0F, -5.875F, -1F, 0F, -2F, 0F, 0F, -3.875F, 0F, 0F, -1F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -5.875F, 0F, 0F); // Du loco part42
		bodyModel[507].setRotationPoint(-4F, -7F, 4F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-1F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F, -2F, 0F, 0F, -3.875F, 0F, 0F); // Du loco part42
		bodyModel[508].setRotationPoint(-4F, -3F, 4F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[509].setRotationPoint(-3F, -6F, -10F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-3.875F, 0F, 0F, -2F, 0F, 0F, -5.875F, -1F, 0F, 0F, -1F, 0F, -5.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, -1F, 1F, 0F); // Du loco part42
		bodyModel[510].setRotationPoint(-4F, -7F, -10F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-5.875F, 1F, 0F, 0F, 1F, 0F, -4.875F, 0F, 0F, -1F, 0F, 0F, -3.875F, 0F, 0F, -2F, 0F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[511].setRotationPoint(-4F, -3F, -10F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[512].setRotationPoint(82F, -6F, 4F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-5.875F, -1F, 0F, 0F, -1F, 0F, -3.875F, 0F, 0F, -2F, 0F, 0F, -4.875F, 1F, 0F, -1F, 1F, 0F, -5.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[513].setRotationPoint(82F, -7F, 4F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-4.875F, 0F, 0F, -1F, 0F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F, -3.875F, 0F, 0F, -2F, 0F, 0F); // Du loco part42
		bodyModel[514].setRotationPoint(82F, -3F, 4F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[515].setRotationPoint(82F, -6F, -10F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-2F, 0F, 0F, -3.875F, 0F, 0F, 0F, -1F, 0F, -5.875F, -1F, 0F, 0F, 0F, 0F, -5.875F, 0F, 0F, -1F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[516].setRotationPoint(82F, -7F, -10F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 1F, 0F, -5.875F, 1F, 0F, -1F, 0F, 0F, -4.875F, 0F, 0F, -2F, 0F, 0F, -3.875F, 0F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F); // Du loco part42
		bodyModel[517].setRotationPoint(82F, -3F, -10F);
	}
}