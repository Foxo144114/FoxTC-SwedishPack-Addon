//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: GBJ Litterera Bs
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.common.api.AbstractTrains;

public class ModelGBJLittBs extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGBJLittBs() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[591];

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
		bodyModel[7] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part19
		bodyModel[8] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Du loco part20
		bodyModel[9] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Du loco part22
		bodyModel[10] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Du loco part28
		bodyModel[11] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Du loco part41
		bodyModel[12] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Du loco part82
		bodyModel[13] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Du loco part83
		bodyModel[14] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Du loco part84
		bodyModel[15] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part85
		bodyModel[16] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Du loco part94
		bodyModel[17] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Du loco part95
		bodyModel[18] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Du loco part97
		bodyModel[19] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Du loco part100
		bodyModel[20] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Du loco part101
		bodyModel[21] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Du loco part102
		bodyModel[22] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Lamp
		bodyModel[23] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Lamp
		bodyModel[24] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Lamp
		bodyModel[25] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Lamp
		bodyModel[26] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 149
		bodyModel[27] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 174
		bodyModel[28] = new ModelRendererTurbo(this, 281, 33, textureX, textureY); // Box 177
		bodyModel[29] = new ModelRendererTurbo(this, 353, 9, textureX, textureY); // Box 194
		bodyModel[30] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 195
		bodyModel[31] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 135
		bodyModel[32] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 136
		bodyModel[33] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 138
		bodyModel[34] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 139
		bodyModel[35] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 141
		bodyModel[36] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 142
		bodyModel[37] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 143
		bodyModel[38] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 144
		bodyModel[39] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 145
		bodyModel[40] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 146
		bodyModel[41] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 147
		bodyModel[42] = new ModelRendererTurbo(this, 457, 25, textureX, textureY); // Box 148
		bodyModel[43] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 149
		bodyModel[44] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 150
		bodyModel[45] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 151
		bodyModel[46] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 152
		bodyModel[47] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 153
		bodyModel[48] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 154
		bodyModel[49] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 155
		bodyModel[50] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 156
		bodyModel[51] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 157
		bodyModel[52] = new ModelRendererTurbo(this, 137, 41, textureX, textureY); // Box 158
		bodyModel[53] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 159
		bodyModel[54] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 160
		bodyModel[55] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Du loco part37
		bodyModel[56] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Du loco part37
		bodyModel[57] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Du loco part37
		bodyModel[58] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Du loco part37
		bodyModel[59] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Du loco part37
		bodyModel[60] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Du loco part37
		bodyModel[61] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[62] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Lamp
		bodyModel[63] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Lamp
		bodyModel[64] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Lamp
		bodyModel[65] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Lamp
		bodyModel[66] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Lamp
		bodyModel[67] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[68] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[69] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 149
		bodyModel[70] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 149
		bodyModel[71] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Du loco part37
		bodyModel[72] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Du loco part71
		bodyModel[73] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Du loco part71
		bodyModel[74] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Du loco part71
		bodyModel[75] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 174
		bodyModel[76] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Du loco part28
		bodyModel[77] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part28
		bodyModel[78] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[79] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[80] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Du loco part28
		bodyModel[81] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Du loco part28
		bodyModel[82] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Du loco part28
		bodyModel[83] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part28
		bodyModel[84] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Du loco part28
		bodyModel[85] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Du loco part28
		bodyModel[86] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[87] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[88] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Du loco part28
		bodyModel[89] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Du loco part28
		bodyModel[90] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part05
		bodyModel[91] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Du loco part06
		bodyModel[92] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 167
		bodyModel[93] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 168
		bodyModel[94] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[95] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Du loco part06
		bodyModel[96] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Du loco part06
		bodyModel[97] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Du loco part28
		bodyModel[98] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Du loco part28
		bodyModel[99] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Du loco part05
		bodyModel[100] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Du loco part06
		bodyModel[101] = new ModelRendererTurbo(this, 465, 153, textureX, textureY); // Du loco part19
		bodyModel[102] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Du loco part22
		bodyModel[103] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Du loco part28
		bodyModel[104] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[105] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[106] = new ModelRendererTurbo(this, 209, 105, textureX, textureY); // Du loco part Ligjhtpart15
		bodyModel[107] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Du loco part Ligjhtpart13
		bodyModel[108] = new ModelRendererTurbo(this, 457, 129, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[109] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[110] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[111] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Du loco part Ligjhtpart16
		bodyModel[112] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[113] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[114] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Lamp
		bodyModel[115] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Lamp
		bodyModel[116] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 168
		bodyModel[117] = new ModelRendererTurbo(this, 505, 129, textureX, textureY); // Box 167
		bodyModel[118] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Du loco part28
		bodyModel[119] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part28
		bodyModel[120] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Du loco part28
		bodyModel[121] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Du loco part28
		bodyModel[122] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Du loco part05
		bodyModel[123] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Du loco part06
		bodyModel[124] = new ModelRendererTurbo(this, 417, 177, textureX, textureY); // Box 167
		bodyModel[125] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 168
		bodyModel[126] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Du loco part28
		bodyModel[127] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Du loco part28
		bodyModel[128] = new ModelRendererTurbo(this, 353, 201, textureX, textureY); // Du loco part41
		bodyModel[129] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Du loco part37
		bodyModel[130] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Du loco part37
		bodyModel[131] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Du loco part37
		bodyModel[132] = new ModelRendererTurbo(this, 9, 65, textureX, textureY); // Du loco part37
		bodyModel[133] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Du loco part37
		bodyModel[134] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Du loco part37
		bodyModel[135] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Du loco part82
		bodyModel[136] = new ModelRendererTurbo(this, 345, 209, textureX, textureY); // Du loco part83
		bodyModel[137] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Du loco part84
		bodyModel[138] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Du loco part85
		bodyModel[139] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Du loco part94
		bodyModel[140] = new ModelRendererTurbo(this, 481, 209, textureX, textureY); // Du loco part95
		bodyModel[141] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Du loco part97
		bodyModel[142] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Du loco part100
		bodyModel[143] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Du loco part101
		bodyModel[144] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Du loco part102
		bodyModel[145] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 177
		bodyModel[146] = new ModelRendererTurbo(this, 385, 209, textureX, textureY); // Box 193
		bodyModel[147] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Box 196
		bodyModel[148] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[149] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[150] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Du loco part06
		bodyModel[151] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[152] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[153] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Du loco part06
		bodyModel[154] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Du loco part06
		bodyModel[155] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Du loco part06
		bodyModel[156] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Du loco part06
		bodyModel[157] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Du loco part28
		bodyModel[158] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Du loco part28
		bodyModel[159] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Du loco part28
		bodyModel[160] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Du loco part28
		bodyModel[161] = new ModelRendererTurbo(this, 121, 233, textureX, textureY); // Du loco part28
		bodyModel[162] = new ModelRendererTurbo(this, 401, 233, textureX, textureY); // Du loco part28
		bodyModel[163] = new ModelRendererTurbo(this, 417, 233, textureX, textureY); // Du loco part28
		bodyModel[164] = new ModelRendererTurbo(this, 65, 241, textureX, textureY); // Du loco part28
		bodyModel[165] = new ModelRendererTurbo(this, 81, 241, textureX, textureY); // Du loco part28
		bodyModel[166] = new ModelRendererTurbo(this, 97, 241, textureX, textureY); // Du loco part28
		bodyModel[167] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Du loco part19
		bodyModel[168] = new ModelRendererTurbo(this, 105, 233, textureX, textureY); // Box 174
		bodyModel[169] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 174
		bodyModel[170] = new ModelRendererTurbo(this, 273, 233, textureX, textureY); // Du loco part19
		bodyModel[171] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 156
		bodyModel[172] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 156
		bodyModel[173] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 156
		bodyModel[174] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 156
		bodyModel[175] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		bodyModel[176] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 154
		bodyModel[177] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 154
		bodyModel[178] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 154
		bodyModel[179] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Du loco part23
		bodyModel[180] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Du loco part23
		bodyModel[181] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Du loco part28
		bodyModel[182] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Du loco part28
		bodyModel[183] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Du loco part41
		bodyModel[184] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Du loco part41
		bodyModel[185] = new ModelRendererTurbo(this, 161, 281, textureX, textureY); // Du loco part20
		bodyModel[186] = new ModelRendererTurbo(this, 233, 281, textureX, textureY); // Du loco part20
		bodyModel[187] = new ModelRendererTurbo(this, 176, 200, textureX, textureY); // Du loco part41
		bodyModel[188] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part37
		bodyModel[189] = new ModelRendererTurbo(this, 161, 265, textureX, textureY); // Du loco part37
		bodyModel[190] = new ModelRendererTurbo(this, 78, 295, textureX, textureY); // Du loco part37
		bodyModel[191] = new ModelRendererTurbo(this, 78, 291, textureX, textureY); // Du loco part37
		bodyModel[192] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Du loco part05
		bodyModel[193] = new ModelRendererTurbo(this, 20, 297, textureX, textureY); // Du loco part05
		bodyModel[194] = new ModelRendererTurbo(this, 1, 300, textureX, textureY); // Du loco part05
		bodyModel[195] = new ModelRendererTurbo(this, 6, 300, textureX, textureY); // Du loco part05
		bodyModel[196] = new ModelRendererTurbo(this, 1, 308, textureX, textureY); // Du loco part05
		bodyModel[197] = new ModelRendererTurbo(this, 20, 308, textureX, textureY); // Du loco part05
		bodyModel[198] = new ModelRendererTurbo(this, 1, 311, textureX, textureY); // Du loco part05
		bodyModel[199] = new ModelRendererTurbo(this, 6, 311, textureX, textureY); // Du loco part05
		bodyModel[200] = new ModelRendererTurbo(this, 1, 319, textureX, textureY); // Du loco part05
		bodyModel[201] = new ModelRendererTurbo(this, 20, 319, textureX, textureY); // Du loco part05
		bodyModel[202] = new ModelRendererTurbo(this, 1, 322, textureX, textureY); // Du loco part05
		bodyModel[203] = new ModelRendererTurbo(this, 6, 322, textureX, textureY); // Du loco part05
		bodyModel[204] = new ModelRendererTurbo(this, 1, 330, textureX, textureY); // Du loco part05
		bodyModel[205] = new ModelRendererTurbo(this, 20, 330, textureX, textureY); // Du loco part05
		bodyModel[206] = new ModelRendererTurbo(this, 1, 333, textureX, textureY); // Du loco part05
		bodyModel[207] = new ModelRendererTurbo(this, 6, 333, textureX, textureY); // Du loco part05
		bodyModel[208] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[209] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[210] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[211] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[212] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[213] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[214] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[215] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[216] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[217] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[218] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[219] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[220] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[221] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[222] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[223] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[224] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[225] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[226] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[227] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[228] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[229] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[230] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[231] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[232] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[233] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[234] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[235] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[236] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[237] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[238] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[239] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[240] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[241] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[242] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[243] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[244] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[245] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[246] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[247] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[248] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[249] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[250] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[251] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[252] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[253] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[254] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[255] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[256] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[257] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[258] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[259] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[260] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[261] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[262] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[263] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[264] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[265] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[266] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[267] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[268] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[269] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[270] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[271] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[272] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[273] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[274] = new ModelRendererTurbo(this, 14, 377, textureX, textureY); // Du loco part05
		bodyModel[275] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[276] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[277] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[278] = new ModelRendererTurbo(this, 14, 377, textureX, textureY); // Du loco part05
		bodyModel[279] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[280] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[281] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[282] = new ModelRendererTurbo(this, 8, 394, textureX, textureY); // Du loco part05
		bodyModel[283] = new ModelRendererTurbo(this, 1, 394, textureX, textureY); // Du loco part05
		bodyModel[284] = new ModelRendererTurbo(this, 6, 401, textureX, textureY); // Du loco part05
		bodyModel[285] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Du loco part05
		bodyModel[286] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[287] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[288] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[289] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[290] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[291] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[292] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[293] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[294] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[295] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[296] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[297] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[298] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[299] = new ModelRendererTurbo(this, 8, 374, textureX, textureY); // Du loco part05
		bodyModel[300] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[301] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[302] = new ModelRendererTurbo(this, 14, 377, textureX, textureY); // Du loco part05
		bodyModel[303] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[304] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[305] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[306] = new ModelRendererTurbo(this, 14, 377, textureX, textureY); // Du loco part05
		bodyModel[307] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[308] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[309] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[310] = new ModelRendererTurbo(this, 8, 394, textureX, textureY); // Du loco part05
		bodyModel[311] = new ModelRendererTurbo(this, 1, 394, textureX, textureY); // Du loco part05
		bodyModel[312] = new ModelRendererTurbo(this, 6, 401, textureX, textureY); // Du loco part05
		bodyModel[313] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Du loco part05
		bodyModel[314] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[315] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[316] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[317] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[318] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[319] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[320] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[321] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part37
		bodyModel[322] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part37
		bodyModel[323] = new ModelRendererTurbo(this, 71, 290, textureX, textureY); // Du loco part37
		bodyModel[324] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[325] = new ModelRendererTurbo(this, 52, 309, textureX, textureY); // Du loco part28
		bodyModel[326] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[327] = new ModelRendererTurbo(this, 52, 309, textureX, textureY); // Du loco part28
		bodyModel[328] = new ModelRendererTurbo(this, 49, 313, textureX, textureY); // Du loco part28
		bodyModel[329] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[330] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[331] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[332] = new ModelRendererTurbo(this, 40, 317, textureX, textureY); // Du loco part28
		bodyModel[333] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[334] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[335] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[336] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[337] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[338] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[339] = new ModelRendererTurbo(this, 3, 2, textureX, textureY); // Du loco part01
		bodyModel[340] = new ModelRendererTurbo(this, 19, 3, textureX, textureY); // Du loco part01
		bodyModel[341] = new ModelRendererTurbo(this, 18, 3, textureX, textureY); // Du loco part01
		bodyModel[342] = new ModelRendererTurbo(this, 3, 2, textureX, textureY); // Du loco part01
		bodyModel[343] = new ModelRendererTurbo(this, 18, 3, textureX, textureY); // Du loco part01
		bodyModel[344] = new ModelRendererTurbo(this, 18, 3, textureX, textureY); // Du loco part01
		bodyModel[345] = new ModelRendererTurbo(this, 40, 317, textureX, textureY); // Du loco part28
		bodyModel[346] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[347] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[348] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[349] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[350] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[351] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[352] = new ModelRendererTurbo(this, 40, 317, textureX, textureY); // Du loco part28
		bodyModel[353] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[354] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[355] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[356] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[357] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[358] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[359] = new ModelRendererTurbo(this, 40, 317, textureX, textureY); // Du loco part28
		bodyModel[360] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[361] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[362] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[363] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[364] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[365] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[366] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[367] = new ModelRendererTurbo(this, 52, 309, textureX, textureY); // Du loco part28
		bodyModel[368] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[369] = new ModelRendererTurbo(this, 52, 309, textureX, textureY); // Du loco part28
		bodyModel[370] = new ModelRendererTurbo(this, 49, 313, textureX, textureY); // Du loco part28
		bodyModel[371] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[372] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[373] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[374] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Du loco part01
		bodyModel[375] = new ModelRendererTurbo(this, 1, 2, textureX, textureY); // Du loco part01
		bodyModel[376] = new ModelRendererTurbo(this, 4, 2, textureX, textureY); // Du loco part01
		bodyModel[377] = new ModelRendererTurbo(this, 18, 3, textureX, textureY); // Du loco part01
		bodyModel[378] = new ModelRendererTurbo(this, 18, 3, textureX, textureY); // Du loco part01
		bodyModel[379] = new ModelRendererTurbo(this, 3, 2, textureX, textureY); // Du loco part01
		bodyModel[380] = new ModelRendererTurbo(this, 18, 3, textureX, textureY); // Du loco part01
		bodyModel[381] = new ModelRendererTurbo(this, 18, 3, textureX, textureY); // Du loco part01
		bodyModel[382] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[383] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[384] = new ModelRendererTurbo(this, 40, 317, textureX, textureY); // Du loco part28
		bodyModel[385] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[386] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[387] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[388] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[389] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[390] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[391] = new ModelRendererTurbo(this, 40, 317, textureX, textureY); // Du loco part28
		bodyModel[392] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[393] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[394] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[395] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[396] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[397] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[398] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[399] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Du loco part09
		bodyModel[400] = new ModelRendererTurbo(this, 40, 317, textureX, textureY); // Du loco part28
		bodyModel[401] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[402] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[403] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[404] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[405] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[406] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[407] = new ModelRendererTurbo(this, 40, 317, textureX, textureY); // Du loco part28
		bodyModel[408] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[409] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[410] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[411] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[412] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[413] = new ModelRendererTurbo(this, 47, 307, textureX, textureY); // Du loco part28
		bodyModel[414] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[415] = new ModelRendererTurbo(this, 52, 309, textureX, textureY); // Du loco part28
		bodyModel[416] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[417] = new ModelRendererTurbo(this, 52, 309, textureX, textureY); // Du loco part28
		bodyModel[418] = new ModelRendererTurbo(this, 49, 313, textureX, textureY); // Du loco part28
		bodyModel[419] = new ModelRendererTurbo(this, 40, 315, textureX, textureY); // Du loco part28
		bodyModel[420] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[421] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[422] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[423] = new ModelRendererTurbo(this, 52, 309, textureX, textureY); // Du loco part28
		bodyModel[424] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[425] = new ModelRendererTurbo(this, 52, 309, textureX, textureY); // Du loco part28
		bodyModel[426] = new ModelRendererTurbo(this, 49, 313, textureX, textureY); // Du loco part28
		bodyModel[427] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[428] = new ModelRendererTurbo(this, 40, 308, textureX, textureY); // Du loco part28
		bodyModel[429] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[430] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Du loco part06
		bodyModel[431] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Du loco part06
		bodyModel[432] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[433] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[434] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[435] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[436] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[437] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Du loco part06
		bodyModel[438] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[439] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[440] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Du loco part06
		bodyModel[441] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Du loco part06
		bodyModel[442] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Du loco part06
		bodyModel[443] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Du loco part06
		bodyModel[444] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Du loco part41
		bodyModel[445] = new ModelRendererTurbo(this, 176, 200, textureX, textureY); // Du loco part41
		bodyModel[446] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Du loco part41
		bodyModel[447] = new ModelRendererTurbo(this, 176, 200, textureX, textureY); // Du loco part41
		bodyModel[448] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Du loco part41
		bodyModel[449] = new ModelRendererTurbo(this, 176, 200, textureX, textureY); // Du loco part41
		bodyModel[450] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Du loco part41
		bodyModel[451] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[452] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[453] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[454] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[455] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[456] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[457] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[458] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[459] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[460] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[461] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[462] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[463] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[464] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[465] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[466] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[467] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[468] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[469] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[470] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[471] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[472] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[473] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[474] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[475] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[476] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[477] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[478] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[479] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[480] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[481] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[482] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[483] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[484] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[485] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[486] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[487] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[488] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[489] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[490] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[491] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[492] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[493] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[494] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[495] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[496] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[497] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[498] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[499] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05

		bodyModel[0].addShapeBox(0F, 0F, 0F, 29, 6, 13, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(4F, -9F, -6.5F);

		bodyModel[1].addBox(0F, 0F, 0F, 72, 1, 20, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(0F, -12F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[2].setRotationPoint(0F, -11F, 11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[3].setRotationPoint(0F, -11F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 42, 20, 1, 0F); // Du loco part07
		bodyModel[4].setRotationPoint(15F, -30F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 74, 3, 4, 0F); // Du loco part08
		bodyModel[5].setRotationPoint(-1F, -33F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[6].setRotationPoint(-16F, -10F, 6.05F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[7].setRotationPoint(-1F, -30F, -10F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Du loco part20
		bodyModel[8].setRotationPoint(56F, -30F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[9].setRotationPoint(0F, -30F, 10F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[10].setRotationPoint(0F, -30F, -11F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[11].setRotationPoint(-2F, -9F, -8F);

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

		bodyModel[22].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[22].setRotationPoint(-2F, -17F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[23].setRotationPoint(-2F, -15F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[24].setRotationPoint(-2F, -15F, 4F);

		bodyModel[25].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[25].setRotationPoint(-2F, -17F, 4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 149
		bodyModel[26].setRotationPoint(-1F, -31F, 9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F); // Box 174
		bodyModel[27].setRotationPoint(-1F, -11F, 10F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[28].setRotationPoint(9F, -16F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[29].setRotationPoint(8F, -15F, -4F);
		bodyModel[29].rotateAngleY = -1.57079633F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[30].setRotationPoint(7F, -15F, -4F);
		bodyModel[30].rotateAngleY = -1.57079633F;

		bodyModel[31].addBox(0F, 0F, 0F, 42, 20, 1, 0F); // Box 135
		bodyModel[31].setRotationPoint(15F, -30F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 136
		bodyModel[32].setRotationPoint(15F, -30F, -10F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[33].setRotationPoint(20F, -16F, -2F);

		bodyModel[34].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[34].setRotationPoint(19F, -22F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[35].setRotationPoint(19F, -24F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 142
		bodyModel[36].setRotationPoint(20F, -25F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 143
		bodyModel[37].setRotationPoint(19F, -26F, -3F);

		bodyModel[38].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 144
		bodyModel[38].setRotationPoint(19F, -30F, -3F);

		bodyModel[39].addBox(0F, 0F, 0F, 12, 15, 12, 0F); // Box 145
		bodyModel[39].setRotationPoint(28F, -27F, -5F);

		bodyModel[40].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 146
		bodyModel[40].setRotationPoint(27F, -28F, -6F);

		bodyModel[41].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[41].setRotationPoint(22F, -19F, -4F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 148
		bodyModel[42].setRotationPoint(26F, -26F, -4F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[43].setRotationPoint(27F, -26F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[44].setRotationPoint(41F, -16F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[45].setRotationPoint(51F, -16F, -2F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 152
		bodyModel[46].setRotationPoint(52F, -30F, -1F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 153
		bodyModel[47].setRotationPoint(42F, -30F, -1F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 154
		bodyModel[48].setRotationPoint(45F, -27F, -1F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 155
		bodyModel[49].setRotationPoint(49F, -27F, -1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 156
		bodyModel[50].setRotationPoint(49F, -18F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F); // Box 157
		bodyModel[51].setRotationPoint(45F, -18F, -1F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 158
		bodyModel[52].setRotationPoint(47F, -26F, -1F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 159
		bodyModel[53].setRotationPoint(51F, -26F, -1F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 160
		bodyModel[54].setRotationPoint(44F, -26F, -1F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[55].setRotationPoint(5F, -33F, -6F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[56].setRotationPoint(5F, -33F, 5F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[57].setRotationPoint(23F, -33F, -6F);

		bodyModel[58].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[58].setRotationPoint(23F, -33F, 5F);

		bodyModel[59].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[59].setRotationPoint(5F, -34F, -6F);

		bodyModel[60].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[60].setRotationPoint(5F, -34F, 5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part Ligjhtpart8
		bodyModel[61].setRotationPoint(-1F, -34F, -2F);

		bodyModel[62].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[62].setRotationPoint(-2F, -16F, -9F);

		bodyModel[63].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[63].setRotationPoint(-2F, -16F, 4F);

		bodyModel[64].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[64].setRotationPoint(-2F, -34F, -3F);

		bodyModel[65].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[65].setRotationPoint(-2F, -31F, -3F);

		bodyModel[66].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Lamp
		bodyModel[66].setRotationPoint(-2F, -33F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[67].setRotationPoint(-2F, -31F, 1F);

		bodyModel[68].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[68].setRotationPoint(-2F, -32F, 1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 74, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[69].setRotationPoint(-1F, -32F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 74, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[70].setRotationPoint(-1F, -33F, 2F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[71].setRotationPoint(19F, -34F, -4F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 74, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[72].setRotationPoint(-1F, -33F, -6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 74, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[73].setRotationPoint(-1F, -32F, -9F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 74, 1, 2, 0F,-1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[74].setRotationPoint(-1F, -31F, -11F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[75].setRotationPoint(-1F, -11F, -11F);

		bodyModel[76].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[76].setRotationPoint(10F, -11F, -9F);

		bodyModel[77].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[77].setRotationPoint(13F, -11F, -9F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[78].setRotationPoint(10F, -11F, 8F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[79].setRotationPoint(13F, -11F, 8F);

		bodyModel[80].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[80].setRotationPoint(10F, -5F, -11F);

		bodyModel[81].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[81].setRotationPoint(10F, -7F, -11F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[82].setRotationPoint(10F, -9F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[83].setRotationPoint(10F, -5F, 9F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[84].setRotationPoint(10F, -7F, 9F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[85].setRotationPoint(10F, -9F, 9F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[86].setRotationPoint(9F, -25F, 11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[87].setRotationPoint(14F, -25F, 11F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[88].setRotationPoint(9F, -25F, -12F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[89].setRotationPoint(14F, -25F, -12F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Du loco part05
		bodyModel[90].setRotationPoint(-1F, -20F, 11F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[91].setRotationPoint(-1F, -20F, -12F);

		bodyModel[92].addShapeBox(0F, 0F, 1F, 1, 1, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[92].setRotationPoint(-2F, -20F, -12F);

		bodyModel[93].addShapeBox(0F, 0F, 1F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 168
		bodyModel[93].setRotationPoint(-2F, -20F, 1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[94].setRotationPoint(16F, -9F, -11F);

		bodyModel[95].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[95].setRotationPoint(16F, -10F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[96].setRotationPoint(19F, -10F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[97].setRotationPoint(-2.01F, -26F, 2F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[98].setRotationPoint(-2.01F, -26F, -3F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[99].setRotationPoint(63F, -11F, 11F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[100].setRotationPoint(63F, -11F, -12F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[101].setRotationPoint(72F, -30F, -10F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 15, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[102].setRotationPoint(57F, -30F, 10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 15, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[103].setRotationPoint(57F, -30F, -11F);

		bodyModel[104].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[104].setRotationPoint(73F, -17F, -9F);

		bodyModel[105].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[105].setRotationPoint(73F, -15F, -9F);

		bodyModel[106].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart15
		bodyModel[106].setRotationPoint(73F, -15F, 4F);

		bodyModel[107].addShapeBox(0F, 0F, 1F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart13
		bodyModel[107].setRotationPoint(73F, -17F, 4F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part Ligjhtpart8
		bodyModel[108].setRotationPoint(69F, -34F, -2F);

		bodyModel[109].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[109].setRotationPoint(73F, -16F, -9F);

		bodyModel[110].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Du loco part Ligjhtpart18
		bodyModel[110].setRotationPoint(73F, -16F, 4F);

		bodyModel[111].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part Ligjhtpart16
		bodyModel[111].setRotationPoint(73F, -34F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part Ligjhtpart18
		bodyModel[112].setRotationPoint(73F, -31F, -3F);

		bodyModel[113].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Du loco part Ligjhtpart18
		bodyModel[113].setRotationPoint(73F, -33F, -3F);

		bodyModel[114].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[114].setRotationPoint(73F, -31F, -5F);

		bodyModel[115].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[115].setRotationPoint(73F, -32F, -5F);

		bodyModel[116].addShapeBox(0F, 0F, 1F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[116].setRotationPoint(72F, -30F, 9F);

		bodyModel[117].addShapeBox(0F, 0F, 1F, 1, 19, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 167
		bodyModel[117].setRotationPoint(72F, -30F, -12F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[118].setRotationPoint(57F, -25F, 11F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[119].setRotationPoint(62F, -25F, 11F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[120].setRotationPoint(57F, -25F, -12F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[121].setRotationPoint(62F, -25F, -12F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[122].setRotationPoint(63F, -20F, 11F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,-1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[123].setRotationPoint(63F, -20F, -12F);

		bodyModel[124].addShapeBox(0F, 0F, 1F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 167
		bodyModel[124].setRotationPoint(73F, -20F, -12F);

		bodyModel[125].addShapeBox(0F, 0F, 1F, 1, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 168
		bodyModel[125].setRotationPoint(73F, -20F, 1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[126].setRotationPoint(73.01F, -26F, 2F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[127].setRotationPoint(73.01F, -26F, -3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[128].setRotationPoint(73F, -9F, -8F);

		bodyModel[129].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[129].setRotationPoint(48F, -33F, -6F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[130].setRotationPoint(48F, -33F, 5F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[131].setRotationPoint(66F, -33F, -6F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part37
		bodyModel[132].setRotationPoint(66F, -33F, 5F);

		bodyModel[133].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[133].setRotationPoint(48F, -34F, -6F);

		bodyModel[134].addBox(0F, 0F, 0F, 19, 1, 1, 0F); // Du loco part37
		bodyModel[134].setRotationPoint(48F, -34F, 5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 1, 20, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part82
		bodyModel[135].setRotationPoint(66F, -19F, -10F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part83
		bodyModel[136].setRotationPoint(62F, -13F, -6F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part84
		bodyModel[137].setRotationPoint(62F, -13F, -6F);
		bodyModel[137].rotateAngleY = -1.57079633F;

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part85
		bodyModel[138].setRotationPoint(62F, -13F, -3F);
		bodyModel[138].rotateAngleY = -1.57079633F;

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part94
		bodyModel[139].setRotationPoint(63F, -16F, -6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part95
		bodyModel[140].setRotationPoint(63F, -16F, -3F);
		bodyModel[140].rotateAngleY = -1.57079633F;

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part97
		bodyModel[141].setRotationPoint(63F, -16F, -6F);
		bodyModel[141].rotateAngleY = -1.57079633F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part100
		bodyModel[142].setRotationPoint(62F, -20F, -6F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part101
		bodyModel[143].setRotationPoint(62F, -20F, -7F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part102
		bodyModel[144].setRotationPoint(62F, -20F, -4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 177
		bodyModel[145].setRotationPoint(62F, -16F, -7F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		bodyModel[146].setRotationPoint(64F, -15F, -4F);
		bodyModel[146].rotateAngleY = -1.57079633F;

		bodyModel[147].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[147].setRotationPoint(63F, -15F, -4F);
		bodyModel[147].rotateAngleY = -1.57079633F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[148].setRotationPoint(47F, -10F, -11F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[149].setRotationPoint(51F, -8F, -11F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[150].setRotationPoint(46F, -8F, -11F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[151].setRotationPoint(47F, -8F, -11F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[152].setRotationPoint(51F, -10F, -11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[153].setRotationPoint(46F, -10F, -11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[154].setRotationPoint(46F, -9F, -11F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[155].setRotationPoint(51F, -9F, -11F);

		bodyModel[156].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[156].setRotationPoint(47F, -9F, -11F);

		bodyModel[157].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[157].setRotationPoint(58F, -11F, -9F);

		bodyModel[158].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[158].setRotationPoint(61F, -11F, -9F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[159].setRotationPoint(58F, -11F, 8F);

		bodyModel[160].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[160].setRotationPoint(61F, -11F, 8F);

		bodyModel[161].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[161].setRotationPoint(58F, -5F, -11F);

		bodyModel[162].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[162].setRotationPoint(58F, -7F, -11F);

		bodyModel[163].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[163].setRotationPoint(58F, -9F, -11F);

		bodyModel[164].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[164].setRotationPoint(58F, -5F, 9F);

		bodyModel[165].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[165].setRotationPoint(58F, -7F, 9F);

		bodyModel[166].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[166].setRotationPoint(58F, -9F, 9F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 0, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[167].setRotationPoint(74.05F, -15F, -3F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[168].setRotationPoint(71F, -11F, 10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 174
		bodyModel[169].setRotationPoint(71F, -11F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[170].setRotationPoint(-2.05F, -15F, -3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 156
		bodyModel[171].setRotationPoint(72F, -30F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[172].setRotationPoint(72F, -30F, 10F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 156
		bodyModel[173].setRotationPoint(-2F, -30F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[174].setRotationPoint(-2F, -30F, 10F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[175].setRotationPoint(-2F, -32F, -10.75F);

		bodyModel[176].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[176].setRotationPoint(-1.5F, -32F, -11.25F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[177].setRotationPoint(-2F, -32F, 10.75F);

		bodyModel[178].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[178].setRotationPoint(-1.5F, -32F, 10.25F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[179].setRotationPoint(-9F, -21F, 11.05F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[180].setRotationPoint(-9F, -21F, -11.05F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[181].setRotationPoint(-1F, -30F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[182].setRotationPoint(-1F, -30F, 10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part41
		bodyModel[183].setRotationPoint(-2F, -11F, -10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part41
		bodyModel[184].setRotationPoint(73F, -11F, -10F);

		bodyModel[185].addBox(0F, 0F, 0F, 4, 18, 8, 0F); // Du loco part20
		bodyModel[185].setRotationPoint(57F, -30F, -4F);

		bodyModel[186].addBox(0F, 0F, 0F, 4, 18, 8, 0F); // Du loco part20
		bodyModel[186].setRotationPoint(11F, -30F, -4F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0.25F, 0F, 0F, 2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 2.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[187].setRotationPoint(-1F, -5F, -6F);

		bodyModel[188].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[188].setRotationPoint(28F, -35F, -3F);

		bodyModel[189].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[189].setRotationPoint(50F, -34F, 3F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 17, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F); // Du loco part37
		bodyModel[190].setRotationPoint(33F, -35F, 3F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -1F); // Du loco part37
		bodyModel[191].setRotationPoint(21F, -35F, -3F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[192].setRotationPoint(16F, -22F, 10F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[193].setRotationPoint(16F, -28F, 10F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[194].setRotationPoint(16F, -28F, 10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[195].setRotationPoint(23F, -28F, 10F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[196].setRotationPoint(32F, -22F, 10F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[197].setRotationPoint(32F, -28F, 10F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[198].setRotationPoint(32F, -28F, 10F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[199].setRotationPoint(39F, -28F, 10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[200].setRotationPoint(16F, -22F, -11F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[201].setRotationPoint(16F, -28F, -11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[202].setRotationPoint(16F, -28F, -11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[203].setRotationPoint(23F, -28F, -11F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[204].setRotationPoint(32F, -22F, -11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[205].setRotationPoint(32F, -28F, -11F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[206].setRotationPoint(32F, -28F, -11F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[207].setRotationPoint(39F, -28F, -11F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[208].setRotationPoint(47F, -28F, 10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[209].setRotationPoint(56F, -28F, 10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[210].setRotationPoint(48F, -21F, 10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[211].setRotationPoint(48F, -29F, 10F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[212].setRotationPoint(48F, -27F, 10F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[213].setRotationPoint(52F, -28F, 10F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[214].setRotationPoint(52F, -27F, 10F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[215].setRotationPoint(48F, -26.25F, 10F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[216].setRotationPoint(52F, -26.25F, 10F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[217].setRotationPoint(48F, -25.5F, 10F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[218].setRotationPoint(52F, -25.5F, 10F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[219].setRotationPoint(48F, -24.75F, 10F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[220].setRotationPoint(52F, -24.75F, 10F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[221].setRotationPoint(48F, -24F, 10F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[222].setRotationPoint(52F, -24F, 10F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[223].setRotationPoint(48F, -23.25F, 10F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[224].setRotationPoint(52F, -23.25F, 10F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[225].setRotationPoint(48F, -22.5F, 10F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[226].setRotationPoint(52F, -22.5F, 10F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[227].setRotationPoint(47F, -28F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[228].setRotationPoint(56F, -28F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[229].setRotationPoint(48F, -21F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[230].setRotationPoint(48F, -29F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[231].setRotationPoint(52F, -28F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[232].setRotationPoint(48F, -27F, -11F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[233].setRotationPoint(52F, -27F, -11F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[234].setRotationPoint(48F, -26.25F, -11F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[235].setRotationPoint(52F, -26.25F, -11F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[236].setRotationPoint(48F, -25.5F, -11F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[237].setRotationPoint(52F, -25.5F, -11F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[238].setRotationPoint(48F, -24.75F, -11F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[239].setRotationPoint(52F, -24.75F, -11F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[240].setRotationPoint(48F, -24F, -11F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[241].setRotationPoint(52F, -24F, -11F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[242].setRotationPoint(48F, -23.25F, -11F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[243].setRotationPoint(52F, -23.25F, -11F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[244].setRotationPoint(48F, -22.5F, -11F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[245].setRotationPoint(52F, -22.5F, -11F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[246].setRotationPoint(48F, -21.75F, 10F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[247].setRotationPoint(52F, -21.75F, 10F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[248].setRotationPoint(52F, -28.5F, 10F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[249].setRotationPoint(48F, -28.5F, 10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[250].setRotationPoint(48F, -21.75F, -11F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[251].setRotationPoint(52F, -21.75F, -11F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[252].setRotationPoint(52F, -28.5F, -11F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[253].setRotationPoint(48F, -28.5F, -11F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[254].setRotationPoint(48F, -27.75F, -11F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[255].setRotationPoint(52F, -27.75F, -11F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[256].setRotationPoint(48F, -27.75F, 10F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[257].setRotationPoint(52F, -27.75F, 10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[258].setRotationPoint(3F, -22F, 10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[259].setRotationPoint(3F, -28F, 10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[260].setRotationPoint(3F, -28F, 10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[261].setRotationPoint(7F, -28F, 10F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[262].setRotationPoint(11F, -22F, 10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[263].setRotationPoint(11F, -28F, 10F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[264].setRotationPoint(11F, -28F, 10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[265].setRotationPoint(12F, -28F, 10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[266].setRotationPoint(3F, -22F, -11F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[267].setRotationPoint(3F, -28F, -11F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[268].setRotationPoint(3F, -28F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[269].setRotationPoint(7F, -28F, -11F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[270].setRotationPoint(11F, -22F, -11F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[271].setRotationPoint(11F, -28F, -11F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[272].setRotationPoint(11F, -28F, -11F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[273].setRotationPoint(12F, -28F, -11F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[274].setRotationPoint(-1F, -22F, 4F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[275].setRotationPoint(-1F, -29F, 4F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[276].setRotationPoint(-1F, -29F, 4F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[277].setRotationPoint(-1F, -29F, 8F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[278].setRotationPoint(-1F, -22F, -9F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[279].setRotationPoint(-1F, -29F, -9F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[280].setRotationPoint(-1F, -29F, -9F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[281].setRotationPoint(-1F, -29F, -5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[282].setRotationPoint(-1F, -22F, -1F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[283].setRotationPoint(-1F, -28F, -1F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[284].setRotationPoint(-1F, -28F, -1F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[285].setRotationPoint(-1F, -28F, 0F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[286].setRotationPoint(64F, -22F, 10F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[287].setRotationPoint(64F, -28F, 10F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[288].setRotationPoint(64F, -28F, 10F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[289].setRotationPoint(68F, -28F, 10F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[290].setRotationPoint(59F, -22F, 10F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[291].setRotationPoint(59F, -28F, 10F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[292].setRotationPoint(59F, -28F, 10F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[293].setRotationPoint(60F, -28F, 10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[294].setRotationPoint(64F, -22F, -11F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[295].setRotationPoint(64F, -28F, -11F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[296].setRotationPoint(64F, -28F, -11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[297].setRotationPoint(68F, -28F, -11F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[298].setRotationPoint(59F, -22F, -11F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[299].setRotationPoint(59F, -28F, -11F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[300].setRotationPoint(59F, -28F, -11F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[301].setRotationPoint(60F, -28F, -11F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[302].setRotationPoint(72F, -22F, 4F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[303].setRotationPoint(72F, -29F, 4F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[304].setRotationPoint(72F, -29F, 4F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[305].setRotationPoint(72F, -29F, 8F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[306].setRotationPoint(72F, -22F, -9F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[307].setRotationPoint(72F, -29F, -9F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[308].setRotationPoint(72F, -29F, -9F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[309].setRotationPoint(72F, -29F, -5F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[310].setRotationPoint(72F, -22F, -1F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[311].setRotationPoint(72F, -28F, -1F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[312].setRotationPoint(72F, -28F, -1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[313].setRotationPoint(72F, -28F, 0F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[314].setRotationPoint(16F, -9F, -10F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[315].setRotationPoint(16F, -10F, -10F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[316].setRotationPoint(16F, -10F, -11F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[317].setRotationPoint(4F, -10F, 6.05F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[318].setRotationPoint(33F, -9F, -6.5F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[319].setRotationPoint(-16F, -10F, -6.05F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[320].setRotationPoint(4F, -10F, -6.05F);

		bodyModel[321].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[321].setRotationPoint(31F, -35F, -3F);

		bodyModel[322].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[322].setRotationPoint(31F, -35F, 2F);

		bodyModel[323].addBox(0F, 0F, 0F, 0, 1, 3, 0F); // Du loco part37
		bodyModel[323].setRotationPoint(32F, -35F, -1F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Du loco part28
		bodyModel[324].setRotationPoint(20.5F, -5F, 6.5F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[325].setRotationPoint(17.5F, -6F, 6.5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F); // Du loco part28
		bodyModel[326].setRotationPoint(17.5F, -5F, 6.5F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[327].setRotationPoint(17.5F, -7.5F, 6.5F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part28
		bodyModel[328].setRotationPoint(18F, -8.5F, 6.5F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[329].setRotationPoint(18.5F, -9F, 6.5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part28
		bodyModel[330].setRotationPoint(18.5F, -7.25F, 6.5F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part28
		bodyModel[331].setRotationPoint(19.5F, -7.25F, 6.5F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F); // Du loco part28
		bodyModel[332].setRotationPoint(5.5F, -8F, 6.5F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[333].setRotationPoint(8.5F, -6.5F, 6.5F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[334].setRotationPoint(8.5F, -5.5F, 6.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[335].setRotationPoint(7.5F, -6.5F, 6.5F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[336].setRotationPoint(10.5F, -6.5F, 6.5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[337].setRotationPoint(5F, -8F, 6.5F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[338].setRotationPoint(13F, -8F, 6.5F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[339].setRotationPoint(34F, -6F, -5.5F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[340].setRotationPoint(34F, -6F, -7.5F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[341].setRotationPoint(34F, -6F, 5.5F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[342].setRotationPoint(3F, -6F, -5.5F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[343].setRotationPoint(3F, -6F, -7.5F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[344].setRotationPoint(3F, -6F, 5.5F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F); // Du loco part28
		bodyModel[345].setRotationPoint(25F, -8F, 6.5F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[346].setRotationPoint(28.5F, -6.5F, 6.5F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[347].setRotationPoint(28.5F, -5.5F, 6.5F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[348].setRotationPoint(27.5F, -6.5F, 6.5F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[349].setRotationPoint(30.5F, -6.5F, 6.5F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[350].setRotationPoint(24.5F, -8F, 6.5F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[351].setRotationPoint(33.5F, -8F, 6.5F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F); // Du loco part28
		bodyModel[352].setRotationPoint(5.5F, -8F, -7.5F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[353].setRotationPoint(8.5F, -6.5F, -7.5F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[354].setRotationPoint(8.5F, -5.5F, -7.5F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[355].setRotationPoint(7.5F, -6.5F, -7.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[356].setRotationPoint(10.5F, -6.5F, -7.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[357].setRotationPoint(5F, -8F, -7.5F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[358].setRotationPoint(13F, -8F, -7.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F); // Du loco part28
		bodyModel[359].setRotationPoint(25F, -8F, -7.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[360].setRotationPoint(28.5F, -6.5F, -7.5F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[361].setRotationPoint(28.5F, -5.5F, -7.5F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[362].setRotationPoint(27.5F, -6.5F, -7.5F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[363].setRotationPoint(30.5F, -6.5F, -7.5F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[364].setRotationPoint(24.5F, -8F, -7.5F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[365].setRotationPoint(33.5F, -8F, -7.5F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[366].setRotationPoint(20.5F, -5F, -8.5F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[367].setRotationPoint(17.5F, -6F, -8.5F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[368].setRotationPoint(17.5F, -5F, -8.5F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[369].setRotationPoint(17.5F, -7.5F, -8.5F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[370].setRotationPoint(18F, -8.5F, -8.5F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[371].setRotationPoint(18.5F, -9F, -7.5F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part28
		bodyModel[372].setRotationPoint(18.5F, -7.25F, -8.5F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part28
		bodyModel[373].setRotationPoint(19.5F, -7.25F, -8.5F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 29, 6, 13, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[374].setRotationPoint(39F, -9F, -6.5F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 2, 6, 13, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[375].setRotationPoint(37F, -9F, -6.5F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part01
		bodyModel[376].setRotationPoint(36F, -6F, -5.5F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part01
		bodyModel[377].setRotationPoint(36F, -6F, -7.5F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.25F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Du loco part01
		bodyModel[378].setRotationPoint(36F, -6F, 5.5F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 2, 3, 11, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[379].setRotationPoint(67F, -6F, -5.5F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[380].setRotationPoint(67F, -6F, -7.5F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[381].setRotationPoint(67F, -6F, 5.5F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[382].setRotationPoint(17F, -10F, 6.05F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[383].setRotationPoint(17F, -10F, -6.05F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F); // Du loco part28
		bodyModel[384].setRotationPoint(38F, -8F, 6.5F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[385].setRotationPoint(41.5F, -6.5F, 6.5F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[386].setRotationPoint(41.5F, -5.5F, 6.5F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[387].setRotationPoint(40.5F, -6.5F, 6.5F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[388].setRotationPoint(43.5F, -6.5F, 6.5F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[389].setRotationPoint(37.5F, -8F, 6.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[390].setRotationPoint(46.5F, -8F, 6.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 9, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F); // Du loco part28
		bodyModel[391].setRotationPoint(38F, -8F, -7.5F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[392].setRotationPoint(41.5F, -6.5F, -7.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[393].setRotationPoint(41.5F, -5.5F, -7.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[394].setRotationPoint(40.5F, -6.5F, -7.5F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[395].setRotationPoint(43.5F, -6.5F, -7.5F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[396].setRotationPoint(37.5F, -8F, -7.5F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[397].setRotationPoint(46.5F, -8F, -7.5F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[398].setRotationPoint(37F, -10F, 6.05F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-21F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, 0F, -21F, -21F, 0F, 0F, -21F, 0F, 0F, -21F, 0F, -21F, -21F, 0F); // Du loco part09
		bodyModel[399].setRotationPoint(37F, -10F, -6.05F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F); // Du loco part28
		bodyModel[400].setRotationPoint(58.5F, -8F, 6.5F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[401].setRotationPoint(61.5F, -6.5F, 6.5F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[402].setRotationPoint(61.5F, -5.5F, 6.5F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[403].setRotationPoint(60.5F, -6.5F, 6.5F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[404].setRotationPoint(63.5F, -6.5F, 6.5F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[405].setRotationPoint(58F, -8F, 6.5F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[406].setRotationPoint(66F, -8F, 6.5F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, -0.5F, 0F); // Du loco part28
		bodyModel[407].setRotationPoint(58.5F, -8F, -7.5F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[408].setRotationPoint(61.5F, -6.5F, -7.5F);

		bodyModel[409].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[409].setRotationPoint(61.5F, -5.5F, -7.5F);

		bodyModel[410].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[410].setRotationPoint(60.5F, -6.5F, -7.5F);

		bodyModel[411].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[411].setRotationPoint(63.5F, -6.5F, -7.5F);

		bodyModel[412].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[412].setRotationPoint(58F, -8F, -7.5F);

		bodyModel[413].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[413].setRotationPoint(66F, -8F, -7.5F);

		bodyModel[414].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F); // Du loco part28
		bodyModel[414].setRotationPoint(53.5F, -5F, 6.5F);

		bodyModel[415].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[415].setRotationPoint(50.5F, -6F, 6.5F);

		bodyModel[416].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F); // Du loco part28
		bodyModel[416].setRotationPoint(50.5F, -5F, 6.5F);

		bodyModel[417].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[417].setRotationPoint(50.5F, -7.5F, 6.5F);

		bodyModel[418].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part28
		bodyModel[418].setRotationPoint(51F, -8.5F, 6.5F);

		bodyModel[419].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part28
		bodyModel[419].setRotationPoint(51.5F, -9F, 6.5F);

		bodyModel[420].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part28
		bodyModel[420].setRotationPoint(51.5F, -7.25F, 6.5F);

		bodyModel[421].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part28
		bodyModel[421].setRotationPoint(52.5F, -7.25F, 6.5F);

		bodyModel[422].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[422].setRotationPoint(53.5F, -5F, -8.5F);

		bodyModel[423].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[423].setRotationPoint(50.5F, -6F, -8.5F);

		bodyModel[424].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[424].setRotationPoint(50.5F, -5F, -8.5F);

		bodyModel[425].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part28
		bodyModel[425].setRotationPoint(50.5F, -7.5F, -8.5F);

		bodyModel[426].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,-0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[426].setRotationPoint(51F, -8.5F, -8.5F);

		bodyModel[427].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part28
		bodyModel[427].setRotationPoint(51.5F, -7.25F, -8.5F);

		bodyModel[428].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part28
		bodyModel[428].setRotationPoint(52.5F, -7.25F, -8.5F);

		bodyModel[429].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[429].setRotationPoint(16F, -9F, 10F);

		bodyModel[430].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[430].setRotationPoint(16F, -10F, 10F);

		bodyModel[431].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[431].setRotationPoint(19F, -10F, 10F);

		bodyModel[432].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[432].setRotationPoint(16F, -9F, 9F);

		bodyModel[433].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[433].setRotationPoint(16F, -10F, 9F);

		bodyModel[434].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[434].setRotationPoint(16F, -10F, 10F);

		bodyModel[435].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[435].setRotationPoint(47F, -10F, 8F);

		bodyModel[436].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[436].setRotationPoint(51F, -8F, 8F);

		bodyModel[437].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[437].setRotationPoint(46F, -8F, 8F);

		bodyModel[438].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[438].setRotationPoint(47F, -8F, 8F);

		bodyModel[439].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[439].setRotationPoint(51F, -10F, 8F);

		bodyModel[440].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[440].setRotationPoint(46F, -10F, 8F);

		bodyModel[441].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[441].setRotationPoint(46F, -9F, 8F);

		bodyModel[442].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[442].setRotationPoint(51F, -9F, 8F);

		bodyModel[443].addBox(0F, 0F, 0F, 4, 1, 3, 0F); // Du loco part06
		bodyModel[443].setRotationPoint(47F, -9F, 8F);

		bodyModel[444].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[444].setRotationPoint(-1F, -11F, -5F);

		bodyModel[445].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, 0.25F); // Du loco part41
		bodyModel[445].setRotationPoint(-1F, -5F, 5F);

		bodyModel[446].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[446].setRotationPoint(-1F, -11F, 4F);

		bodyModel[447].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 2.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[447].setRotationPoint(71F, -5F, -6F);

		bodyModel[448].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[448].setRotationPoint(70F, -11F, -5F);

		bodyModel[449].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 2.75F); // Du loco part41
		bodyModel[449].setRotationPoint(71F, -5F, 5F);

		bodyModel[450].addShapeBox(0F, 0F, 0F, 3, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part41
		bodyModel[450].setRotationPoint(70F, -11F, 4F);

		bodyModel[451].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[451].setRotationPoint(47F, -20F, -11F);

		bodyModel[452].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[452].setRotationPoint(56F, -20F, -11F);

		bodyModel[453].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[453].setRotationPoint(48F, -17F, -11F);

		bodyModel[454].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[454].setRotationPoint(48F, -21F, -11F);

		bodyModel[455].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[455].setRotationPoint(52F, -20F, -11F);

		bodyModel[456].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[456].setRotationPoint(48F, -20F, -11F);

		bodyModel[457].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[457].setRotationPoint(52F, -20F, -11F);

		bodyModel[458].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[458].setRotationPoint(48F, -19.25F, -11F);

		bodyModel[459].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[459].setRotationPoint(52F, -19.25F, -11F);

		bodyModel[460].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[460].setRotationPoint(48F, -18.5F, -11F);

		bodyModel[461].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[461].setRotationPoint(52F, -18.5F, -11F);

		bodyModel[462].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[462].setRotationPoint(52F, -17.75F, -11F);

		bodyModel[463].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[463].setRotationPoint(52F, -20.5F, -11F);

		bodyModel[464].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[464].setRotationPoint(48F, -20.5F, -11F);

		bodyModel[465].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[465].setRotationPoint(48F, -17.75F, -11F);

		bodyModel[466].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[466].setRotationPoint(15F, -20F, -11F);

		bodyModel[467].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[467].setRotationPoint(24F, -20F, -11F);

		bodyModel[468].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[468].setRotationPoint(16F, -17F, -11F);

		bodyModel[469].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[469].setRotationPoint(16F, -21F, -11F);

		bodyModel[470].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[470].setRotationPoint(20F, -20F, -11F);

		bodyModel[471].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[471].setRotationPoint(16F, -20F, -11F);

		bodyModel[472].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[472].setRotationPoint(20F, -20F, -11F);

		bodyModel[473].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[473].setRotationPoint(16F, -19.25F, -11F);

		bodyModel[474].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[474].setRotationPoint(20F, -19.25F, -11F);

		bodyModel[475].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[475].setRotationPoint(16F, -18.5F, -11F);

		bodyModel[476].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[476].setRotationPoint(20F, -18.5F, -11F);

		bodyModel[477].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Du loco part05
		bodyModel[477].setRotationPoint(20F, -17.75F, -11F);

		bodyModel[478].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F); // Du loco part05
		bodyModel[478].setRotationPoint(20F, -20.5F, -11F);

		bodyModel[479].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[479].setRotationPoint(16F, -20.5F, -11F);

		bodyModel[480].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[480].setRotationPoint(16F, -17.75F, -11F);

		bodyModel[481].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[481].setRotationPoint(47F, -20F, 10F);

		bodyModel[482].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[482].setRotationPoint(56F, -20F, 10F);

		bodyModel[483].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[483].setRotationPoint(48F, -17F, 10F);

		bodyModel[484].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[484].setRotationPoint(48F, -21F, 10F);

		bodyModel[485].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[485].setRotationPoint(52F, -20F, 10F);

		bodyModel[486].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[486].setRotationPoint(48F, -20F, 10F);

		bodyModel[487].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[487].setRotationPoint(52F, -20F, 10F);

		bodyModel[488].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[488].setRotationPoint(48F, -19.25F, 10F);

		bodyModel[489].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[489].setRotationPoint(52F, -19.25F, 10F);

		bodyModel[490].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[490].setRotationPoint(48F, -18.5F, 10F);

		bodyModel[491].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[491].setRotationPoint(52F, -18.5F, 10F);

		bodyModel[492].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[492].setRotationPoint(52F, -17.75F, 10F);

		bodyModel[493].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[493].setRotationPoint(52F, -20.5F, 10F);

		bodyModel[494].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[494].setRotationPoint(48F, -20.5F, 10F);

		bodyModel[495].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[495].setRotationPoint(48F, -17.75F, 10F);

		bodyModel[496].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[496].setRotationPoint(15F, -20F, 10F);

		bodyModel[497].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[497].setRotationPoint(24F, -20F, 10F);

		bodyModel[498].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[498].setRotationPoint(16F, -17F, 10F);

		bodyModel[499].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[499].setRotationPoint(16F, -21F, 10F);
	}

	private void initbodyModel_2()
	{
		bodyModel[500] = new ModelRendererTurbo(this, 1, 352, textureX, textureY); // Du loco part05
		bodyModel[501] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[502] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[503] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[504] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[505] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[506] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[507] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[508] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[509] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[510] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[511] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[512] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[513] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[514] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[515] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[516] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[517] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[518] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[519] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[520] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[521] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[522] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[523] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[524] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[525] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[526] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[527] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[528] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[529] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[530] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[531] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[532] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[533] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[534] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[535] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[536] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[537] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[538] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[539] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[540] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[541] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[542] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[543] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[544] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[545] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[546] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[547] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[548] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[549] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[550] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[551] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[552] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[553] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[554] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[555] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[556] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[557] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[558] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[559] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[560] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[561] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[562] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[563] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[564] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[565] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[566] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[567] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[568] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[569] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[570] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[571] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[572] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[573] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[574] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[575] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[576] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[577] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[578] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[579] = new ModelRendererTurbo(this, 455, 494, textureX, textureY); // Du loco part42
		bodyModel[580] = new ModelRendererTurbo(this, 454, 470, textureX, textureY); // Du loco part42
		bodyModel[581] = new ModelRendererTurbo(this, 454, 462, textureX, textureY); // Du loco part42
		bodyModel[582] = new ModelRendererTurbo(this, 430, 494, textureX, textureY); // Du loco part42
		bodyModel[583] = new ModelRendererTurbo(this, 454, 486, textureX, textureY); // Du loco part42
		bodyModel[584] = new ModelRendererTurbo(this, 429, 478, textureX, textureY); // Du loco part42
		bodyModel[585] = new ModelRendererTurbo(this, 430, 503, textureX, textureY); // Du loco part42
		bodyModel[586] = new ModelRendererTurbo(this, 429, 462, textureX, textureY); // Du loco part42
		bodyModel[587] = new ModelRendererTurbo(this, 454, 478, textureX, textureY); // Du loco part42
		bodyModel[588] = new ModelRendererTurbo(this, 455, 503, textureX, textureY); // Du loco part42
		bodyModel[589] = new ModelRendererTurbo(this, 429, 486, textureX, textureY); // Du loco part42
		bodyModel[590] = new ModelRendererTurbo(this, 429, 470, textureX, textureY); // Du loco part42

		bodyModel[500].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part05
		bodyModel[500].setRotationPoint(20F, -20F, 10F);

		bodyModel[501].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[501].setRotationPoint(16F, -20F, 10F);

		bodyModel[502].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[502].setRotationPoint(20F, -20F, 10F);

		bodyModel[503].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[503].setRotationPoint(16F, -19.25F, 10F);

		bodyModel[504].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[504].setRotationPoint(20F, -19.25F, 10F);

		bodyModel[505].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[505].setRotationPoint(16F, -18.5F, 10F);

		bodyModel[506].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[506].setRotationPoint(20F, -18.5F, 10F);

		bodyModel[507].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[507].setRotationPoint(20F, -17.75F, 10F);

		bodyModel[508].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.125F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -0.125F, -0.75F, 0F, -0.125F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.125F, 0F, 0F); // Du loco part05
		bodyModel[508].setRotationPoint(20F, -20.5F, 10F);

		bodyModel[509].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[509].setRotationPoint(16F, -20.5F, 10F);

		bodyModel[510].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[510].setRotationPoint(16F, -17.75F, 10F);

		bodyModel[511].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[511].setRotationPoint(-3F, -9.25F, 4.43F);

		bodyModel[512].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[512].setRotationPoint(-2.75F, -9F, 4.9F);

		bodyModel[513].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[513].setRotationPoint(-5.5F, -8.75F, 5.15F);

		bodyModel[514].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[514].setRotationPoint(-3F, -9.25F, -6.63F);

		bodyModel[515].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[515].setRotationPoint(-5.5F, -8.75F, -5.88F);

		bodyModel[516].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[516].setRotationPoint(-3F, -8.75F, 0F);

		bodyModel[517].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[517].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[518].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[518].setRotationPoint(-2.5F, -8.5F, -0.25F);

		bodyModel[519].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[519].setRotationPoint(-4.5F, -7F, -0.25F);

		bodyModel[520].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[520].setRotationPoint(-3.5F, -8.75F, -0.25F);

		bodyModel[521].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[521].setRotationPoint(-4.5F, -8.5F, 0F);

		bodyModel[522].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[522].setRotationPoint(-4.5F, -8.5F, -0.75F);

		bodyModel[523].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[523].setRotationPoint(-3F, -8.75F, 0.25F);

		bodyModel[524].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[524].setRotationPoint(-3F, -8.5F, -0.25F);

		bodyModel[525].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[525].setRotationPoint(-3F, -9F, -0.5F);

		bodyModel[526].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[526].setRotationPoint(-3F, -6F, -0.5F);

		bodyModel[527].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[527].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[528].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[528].setRotationPoint(-4.5F, -6F, -0.5F);

		bodyModel[529].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[529].setRotationPoint(-4.5F, -5.25F, -0.5F);

		bodyModel[530].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[530].setRotationPoint(-6.5F, -8.87F, 4.03F);

		bodyModel[531].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[531].setRotationPoint(-6.5F, -9.87F, 4.03F);

		bodyModel[532].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[532].setRotationPoint(-6.5F, -9.37F, 4.03F);

		bodyModel[533].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[533].setRotationPoint(-6.5F, -7.87F, 4.03F);

		bodyModel[534].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[534].setRotationPoint(-6.5F, -8.37F, 4.03F);

		bodyModel[535].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[535].setRotationPoint(-6.5F, -8.87F, -7.03F);

		bodyModel[536].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[536].setRotationPoint(-6.5F, -9.87F, -7.03F);

		bodyModel[537].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[537].setRotationPoint(-6.5F, -9.37F, -7.03F);

		bodyModel[538].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[538].setRotationPoint(-6.5F, -7.87F, -7.03F);

		bodyModel[539].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[539].setRotationPoint(-6.5F, -8.37F, -7.03F);

		bodyModel[540].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[540].setRotationPoint(-2.75F, -9.5F, 4.9F);

		bodyModel[541].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[541].setRotationPoint(-2.75F, -8.25F, 4.9F);

		bodyModel[542].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[542].setRotationPoint(-2.75F, -9F, -6.13F);

		bodyModel[543].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[543].setRotationPoint(-2.75F, -9.5F, -6.13F);

		bodyModel[544].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[544].setRotationPoint(-2.75F, -8.25F, -6.13F);

		bodyModel[545].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[545].setRotationPoint(74F, -9.25F, 4.43F);

		bodyModel[546].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[546].setRotationPoint(73.75F, -9F, 4.9F);

		bodyModel[547].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[547].setRotationPoint(74.5F, -8.75F, 5.15F);

		bodyModel[548].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[548].setRotationPoint(74F, -9.25F, -6.63F);

		bodyModel[549].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[549].setRotationPoint(74.5F, -8.75F, -5.88F);

		bodyModel[550].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[550].setRotationPoint(74F, -8.75F, 0F);

		bodyModel[551].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[551].setRotationPoint(74F, -8.75F, -1F);

		bodyModel[552].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[552].setRotationPoint(73.5F, -8.5F, -0.25F);

		bodyModel[553].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[553].setRotationPoint(74.5F, -7F, -0.25F);

		bodyModel[554].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[554].setRotationPoint(74.5F, -8.75F, -0.25F);

		bodyModel[555].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[555].setRotationPoint(73.5F, -8.5F, 0F);

		bodyModel[556].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[556].setRotationPoint(73.5F, -8.5F, -0.75F);

		bodyModel[557].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[557].setRotationPoint(74F, -8.75F, 0.25F);

		bodyModel[558].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[558].setRotationPoint(74F, -8.5F, -0.25F);

		bodyModel[559].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[559].setRotationPoint(74F, -9F, -0.5F);

		bodyModel[560].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[560].setRotationPoint(74F, -6F, -0.5F);

		bodyModel[561].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[561].setRotationPoint(74F, -8.75F, -1F);

		bodyModel[562].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[562].setRotationPoint(74.5F, -6F, -0.5F);

		bodyModel[563].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[563].setRotationPoint(75.5F, -5.25F, -0.5F);

		bodyModel[564].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[564].setRotationPoint(77.5F, -8.87F, 4.03F);

		bodyModel[565].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[565].setRotationPoint(77.5F, -9.87F, 4.03F);

		bodyModel[566].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[566].setRotationPoint(77.5F, -9.37F, 4.03F);

		bodyModel[567].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[567].setRotationPoint(77.5F, -7.87F, 4.03F);

		bodyModel[568].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[568].setRotationPoint(77.5F, -8.37F, 4.03F);

		bodyModel[569].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[569].setRotationPoint(77.5F, -8.87F, -7.03F);

		bodyModel[570].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[570].setRotationPoint(77.5F, -9.87F, -7.03F);

		bodyModel[571].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[571].setRotationPoint(77.5F, -9.37F, -7.03F);

		bodyModel[572].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[572].setRotationPoint(77.5F, -7.87F, -7.03F);

		bodyModel[573].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[573].setRotationPoint(77.5F, -8.37F, -7.03F);

		bodyModel[574].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[574].setRotationPoint(73.75F, -9.5F, 4.9F);

		bodyModel[575].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[575].setRotationPoint(73.75F, -8.25F, 4.9F);

		bodyModel[576].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[576].setRotationPoint(73.75F, -9F, -6.13F);

		bodyModel[577].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[577].setRotationPoint(73.75F, -9.5F, -6.13F);

		bodyModel[578].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[578].setRotationPoint(73.75F, -8.25F, -6.13F);

		bodyModel[579].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part42
		bodyModel[579].setRotationPoint(-3F, -6F, 4F);

		bodyModel[580].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -1F, 0F, -5.875F, -1F, 0F, -2F, 0F, 0F, -3.875F, 0F, 0F, -1F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -5.875F, 0F, 0F); // Du loco part42
		bodyModel[580].setRotationPoint(-4F, -7F, 4F);

		bodyModel[581].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-1F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F, -2F, 0F, 0F, -3.875F, 0F, 0F); // Du loco part42
		bodyModel[581].setRotationPoint(-4F, -3F, 4F);

		bodyModel[582].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[582].setRotationPoint(-3F, -6F, -10F);

		bodyModel[583].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-3.875F, 0F, 0F, -2F, 0F, 0F, -5.875F, -1F, 0F, 0F, -1F, 0F, -5.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, -1F, 1F, 0F); // Du loco part42
		bodyModel[583].setRotationPoint(-4F, -7F, -10F);

		bodyModel[584].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-5.875F, 1F, 0F, 0F, 1F, 0F, -4.875F, 0F, 0F, -1F, 0F, 0F, -3.875F, 0F, 0F, -2F, 0F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[584].setRotationPoint(-4F, -3F, -10F);

		bodyModel[585].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[585].setRotationPoint(70F, -6F, 4F);

		bodyModel[586].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-5.875F, -1F, 0F, 0F, -1F, 0F, -3.875F, 0F, 0F, -2F, 0F, 0F, -4.875F, 1F, 0F, -1F, 1F, 0F, -5.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part42
		bodyModel[586].setRotationPoint(70F, -7F, 4F);

		bodyModel[587].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-4.875F, 0F, 0F, -1F, 0F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F, 0F, 1F, 0F, -3.875F, 0F, 0F, -2F, 0F, 0F); // Du loco part42
		bodyModel[587].setRotationPoint(70F, -3F, 4F);

		bodyModel[588].addShapeBox(0F, 0F, 0F, 5, 2, 6, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[588].setRotationPoint(70F, -6F, -10F);

		bodyModel[589].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,-2F, 0F, 0F, -3.875F, 0F, 0F, 0F, -1F, 0F, -5.875F, -1F, 0F, 0F, 0F, 0F, -5.875F, 0F, 0F, -1F, 1F, 0F, -4.875F, 1F, 0F); // Du loco part42
		bodyModel[589].setRotationPoint(70F, -7F, -10F);

		bodyModel[590].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 1F, 0F, -5.875F, 1F, 0F, -1F, 0F, 0F, -4.875F, 0F, 0F, -2F, 0F, 0F, -3.875F, 0F, 0F, 0F, 1F, 0F, -5.875F, 1F, 0F); // Du loco part42
		bodyModel[590].setRotationPoint(70F, -3F, -10F);
	}
	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale)
	{
		super.render(entity, f0, f1, f2, f3, f4, scale);
		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f0, f1, f2, f3, f4, scale);
	}
}