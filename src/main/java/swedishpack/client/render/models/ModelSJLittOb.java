//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera Ob
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.common.api.AbstractTrains;

public class ModelSJLittOb extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittOb() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[307];

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
		bodyModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Du loco part07
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Du loco part08
		bodyModel[6] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Du loco part19
		bodyModel[7] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Du loco part20
		bodyModel[8] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Du loco part22
		bodyModel[9] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Du loco part27
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
		bodyModel[61] = new ModelRendererTurbo(this, 38, 312, textureX, textureY); // Du loco part42
		bodyModel[62] = new ModelRendererTurbo(this, 107, 62, textureX, textureY); // Lamp
		bodyModel[63] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Du loco part Ligjhtpart8
		bodyModel[64] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Lamp
		bodyModel[65] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Lamp
		bodyModel[66] = new ModelRendererTurbo(this, 377, 65, textureX, textureY); // Lamp
		bodyModel[67] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Lamp
		bodyModel[68] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Lamp
		bodyModel[69] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 149
		bodyModel[70] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 149
		bodyModel[71] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Du loco part37
		bodyModel[72] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Du loco part23
		bodyModel[73] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[74] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Du loco part71
		bodyModel[75] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Du loco part71
		bodyModel[76] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Du loco part71
		bodyModel[77] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 174
		bodyModel[78] = new ModelRendererTurbo(this, 505, 49, textureX, textureY); // Du loco part28
		bodyModel[79] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Du loco part28
		bodyModel[80] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[81] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[82] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Du loco part28
		bodyModel[83] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Du loco part28
		bodyModel[84] = new ModelRendererTurbo(this, 145, 73, textureX, textureY); // Du loco part28
		bodyModel[85] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Du loco part28
		bodyModel[86] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Du loco part28
		bodyModel[87] = new ModelRendererTurbo(this, 433, 73, textureX, textureY); // Du loco part28
		bodyModel[88] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[89] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[90] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Du loco part28
		bodyModel[91] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Du loco part28
		bodyModel[92] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part05
		bodyModel[93] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Du loco part06
		bodyModel[94] = new ModelRendererTurbo(this, 55, 304, textureX, textureY); // Box 167
		bodyModel[95] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[96] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Du loco part06
		bodyModel[97] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Du loco part06
		bodyModel[98] = new ModelRendererTurbo(this, 217, 233, textureX, textureY); // Du loco part06
		bodyModel[99] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[100] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[101] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Du loco part06
		bodyModel[102] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[103] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[104] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Du loco part06
		bodyModel[105] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Du loco part06
		bodyModel[106] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Du loco part06
		bodyModel[107] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Du loco part06
		bodyModel[108] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Du loco part23
		bodyModel[109] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Du loco part23
		bodyModel[110] = new ModelRendererTurbo(this, 249, 241, textureX, textureY); // Du loco part28
		bodyModel[111] = new ModelRendererTurbo(this, 497, 241, textureX, textureY); // Du loco part28
		bodyModel[112] = new ModelRendererTurbo(this, 113, 249, textureX, textureY); // Du loco part41
		bodyModel[113] = new ModelRendererTurbo(this, 121, 241, textureX, textureY); // Du loco part06
		bodyModel[114] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Du loco part06
		bodyModel[115] = new ModelRendererTurbo(this, 89, 249, textureX, textureY); // Du loco part06
		bodyModel[116] = new ModelRendererTurbo(this, 169, 249, textureX, textureY); // Du loco part06
		bodyModel[117] = new ModelRendererTurbo(this, 257, 249, textureX, textureY); // Du loco part06
		bodyModel[118] = new ModelRendererTurbo(this, 49, 265, textureX, textureY); // Du loco part01
		bodyModel[119] = new ModelRendererTurbo(this, 73, 273, textureX, textureY); // Du loco part01
		bodyModel[120] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Du loco part01
		bodyModel[121] = new ModelRendererTurbo(this, 273, 257, textureX, textureY); // Du loco part01
		bodyModel[122] = new ModelRendererTurbo(this, 65, 233, textureX, textureY); // Du loco part01
		bodyModel[123] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part37
		bodyModel[124] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Du loco part37
		bodyModel[125] = new ModelRendererTurbo(this, 41, 265, textureX, textureY); // Du loco part37
		bodyModel[126] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Du loco part37
		bodyModel[127] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[128] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[129] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[130] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[131] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[132] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[133] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[134] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[135] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[136] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[137] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[138] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[139] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[140] = new ModelRendererTurbo(this, 1, 374, textureX, textureY); // Du loco part05
		bodyModel[141] = new ModelRendererTurbo(this, 11, 365, textureX, textureY); // Du loco part05
		bodyModel[142] = new ModelRendererTurbo(this, 16, 365, textureX, textureY); // Du loco part05
		bodyModel[143] = new ModelRendererTurbo(this, 14, 377, textureX, textureY); // Du loco part05
		bodyModel[144] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[145] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[146] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[147] = new ModelRendererTurbo(this, 14, 377, textureX, textureY); // Du loco part05
		bodyModel[148] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Du loco part05
		bodyModel[149] = new ModelRendererTurbo(this, 6, 384, textureX, textureY); // Du loco part05
		bodyModel[150] = new ModelRendererTurbo(this, 1, 384, textureX, textureY); // Du loco part05
		bodyModel[151] = new ModelRendererTurbo(this, 1, 394, textureX, textureY); // Du loco part05
		bodyModel[152] = new ModelRendererTurbo(this, 1, 394, textureX, textureY); // Du loco part05
		bodyModel[153] = new ModelRendererTurbo(this, 6, 401, textureX, textureY); // Du loco part05
		bodyModel[154] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Du loco part05
		bodyModel[155] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[156] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[157] = new ModelRendererTurbo(this, 226, 90, textureX, textureY); // Du loco part06
		bodyModel[158] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[159] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[160] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[161] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[162] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[163] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[164] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[165] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[166] = new ModelRendererTurbo(this, 95, 292, textureX, textureY); // Box 149
		bodyModel[167] = new ModelRendererTurbo(this, 80, 294, textureX, textureY); // Box 149
		bodyModel[168] = new ModelRendererTurbo(this, 95, 292, textureX, textureY); // Box 149
		bodyModel[169] = new ModelRendererTurbo(this, 80, 294, textureX, textureY); // Box 149
		bodyModel[170] = new ModelRendererTurbo(this, 67, 296, textureX, textureY); // Box 149
		bodyModel[171] = new ModelRendererTurbo(this, 67, 296, textureX, textureY); // Box 149
		bodyModel[172] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Du loco part09
		bodyModel[173] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Du loco part09
		bodyModel[174] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[175] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[176] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[177] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[178] = new ModelRendererTurbo(this, 265, 233, textureX, textureY); // Du loco part06
		bodyModel[179] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[180] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[181] = new ModelRendererTurbo(this, 313, 233, textureX, textureY); // Du loco part06
		bodyModel[182] = new ModelRendererTurbo(this, 329, 233, textureX, textureY); // Du loco part06
		bodyModel[183] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Du loco part06
		bodyModel[184] = new ModelRendererTurbo(this, 361, 233, textureX, textureY); // Du loco part06
		bodyModel[185] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Du loco part27
		bodyModel[186] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Du loco part23
		bodyModel[187] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[188] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[189] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Du loco part23
		bodyModel[190] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Du loco part08
		bodyModel[191] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 149
		bodyModel[192] = new ModelRendererTurbo(this, 2, 82, textureX, textureY); // Box 149
		bodyModel[193] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 149
		bodyModel[194] = new ModelRendererTurbo(this, 99, 25, textureX, textureY); // Du loco part08
		bodyModel[195] = new ModelRendererTurbo(this, 99, 25, textureX, textureY); // Du loco part08
		bodyModel[196] = new ModelRendererTurbo(this, 85, 83, textureX, textureY); // Box 149
		bodyModel[197] = new ModelRendererTurbo(this, 2, 82, textureX, textureY); // Box 149
		bodyModel[198] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 149
		bodyModel[199] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[200] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[201] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[202] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[203] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[204] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[205] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[206] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[207] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[208] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[209] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[210] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[211] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[212] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[213] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[214] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[215] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[216] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[217] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[218] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[219] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[220] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[221] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[222] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[223] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[224] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[225] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[226] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[227] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[228] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[229] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[230] = new ModelRendererTurbo(this, 1, 362, textureX, textureY); // Du loco part05
		bodyModel[231] = new ModelRendererTurbo(this, 14, 362, textureX, textureY); // Du loco part05
		bodyModel[232] = new ModelRendererTurbo(this, 1, 365, textureX, textureY); // Du loco part05
		bodyModel[233] = new ModelRendererTurbo(this, 6, 365, textureX, textureY); // Du loco part05
		bodyModel[234] = new ModelRendererTurbo(this, 107, 62, textureX, textureY); // Lamp
		bodyModel[235] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Du loco part37
		bodyModel[236] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Du loco part37
		bodyModel[237] = new ModelRendererTurbo(this, 25, 265, textureX, textureY); // Du loco part37
		bodyModel[238] = new ModelRendererTurbo(this, 41, 265, textureX, textureY); // Du loco part37
		bodyModel[239] = new ModelRendererTurbo(this, 25, 273, textureX, textureY); // Du loco part37
		bodyModel[240] = new ModelRendererTurbo(this, 40, 310, textureX, textureY); // Du loco part42
		bodyModel[241] = new ModelRendererTurbo(this, 38, 309, textureX, textureY); // Du loco part42
		bodyModel[242] = new ModelRendererTurbo(this, 38, 309, textureX, textureY); // Du loco part42
		bodyModel[243] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part42
		bodyModel[244] = new ModelRendererTurbo(this, 38, 310, textureX, textureY); // Du loco part42
		bodyModel[245] = new ModelRendererTurbo(this, 16, 103, textureX, textureY); // Du loco part27
		bodyModel[246] = new ModelRendererTurbo(this, 16, 103, textureX, textureY); // Du loco part27
		bodyModel[247] = new ModelRendererTurbo(this, 45, 316, textureX, textureY); // Du loco part37
		bodyModel[248] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[249] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[250] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[251] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[252] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[253] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[254] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[255] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[256] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[257] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[258] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[259] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[260] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[261] = new ModelRendererTurbo(this, 6, 344, textureX, textureY); // Du loco part05
		bodyModel[262] = new ModelRendererTurbo(this, 20, 341, textureX, textureY); // Du loco part05
		bodyModel[263] = new ModelRendererTurbo(this, 1, 341, textureX, textureY); // Du loco part05
		bodyModel[264] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[265] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[266] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[267] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[268] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[269] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[270] = new ModelRendererTurbo(this, 11, 347, textureX, textureY); // Du loco part05
		bodyModel[271] = new ModelRendererTurbo(this, 11, 344, textureX, textureY); // Du loco part05
		bodyModel[272] = new ModelRendererTurbo(this, 11, 350, textureX, textureY); // Du loco part05
		bodyModel[273] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[274] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[275] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[276] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[277] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[278] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[279] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[280] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[281] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[282] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[283] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[284] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[285] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[286] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[287] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[288] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[289] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[290] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[291] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[292] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[293] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[294] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[295] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[296] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[297] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[298] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[299] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[300] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[301] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[302] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[303] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[304] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[305] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[306] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 50, 8, 12, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(16F, -11F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 66, 1, 20, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(0F, -12F, -10F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[2].setRotationPoint(0F, -11F, 11F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[3].setRotationPoint(0F, -11F, -12F);

		bodyModel[4].addBox(0F, 0F, 0F, 51, 20, 1, 0F); // Du loco part07
		bodyModel[4].setRotationPoint(15F, -30F, -11F);

		bodyModel[5].addBox(0F, 0F, 0F, 37, 3, 4, 0F); // Du loco part08
		bodyModel[5].setRotationPoint(-1F, -33F, -2F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 20, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[6].setRotationPoint(-1F, -30F, -10F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Du loco part20
		bodyModel[7].setRotationPoint(65F, -30F, -10F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part22
		bodyModel[8].setRotationPoint(0F, -30F, 10F);

		bodyModel[9].addBox(0F, 0F, 0F, 38, 3, 0, 0F); // Du loco part27
		bodyModel[9].setRotationPoint(20F, -9F, 6.15F);

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

		bodyModel[26].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[26].setRotationPoint(3F, -31F, 9F);

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

		bodyModel[31].addBox(0F, 0F, 0F, 51, 20, 1, 0F); // Box 135
		bodyModel[31].setRotationPoint(15F, -30F, 10F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 18, 20, 0F); // Box 136
		bodyModel[32].setRotationPoint(19F, -30F, -10F);

		bodyModel[33].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[33].setRotationPoint(25F, -16F, -2F);

		bodyModel[34].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[34].setRotationPoint(24F, -22F, -3F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[35].setRotationPoint(24F, -24F, -3F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 142
		bodyModel[36].setRotationPoint(25F, -25F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 143
		bodyModel[37].setRotationPoint(24F, -26F, -3F);

		bodyModel[38].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 144
		bodyModel[38].setRotationPoint(24F, -30F, -3F);

		bodyModel[39].addBox(0F, 0F, 0F, 12, 15, 12, 0F); // Box 145
		bodyModel[39].setRotationPoint(33F, -27F, -5F);

		bodyModel[40].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 146
		bodyModel[40].setRotationPoint(32F, -28F, -6F);

		bodyModel[41].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[41].setRotationPoint(27F, -19F, -4F);

		bodyModel[42].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 148
		bodyModel[42].setRotationPoint(31F, -26F, -4F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[43].setRotationPoint(32F, -26F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[44].setRotationPoint(46F, -16F, -2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[45].setRotationPoint(56F, -16F, -2F);

		bodyModel[46].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 152
		bodyModel[46].setRotationPoint(57F, -30F, -1F);

		bodyModel[47].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 153
		bodyModel[47].setRotationPoint(47F, -30F, -1F);

		bodyModel[48].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 154
		bodyModel[48].setRotationPoint(50F, -27F, -1F);

		bodyModel[49].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 155
		bodyModel[49].setRotationPoint(54F, -27F, -1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 156
		bodyModel[50].setRotationPoint(54F, -18F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F); // Box 157
		bodyModel[51].setRotationPoint(50F, -18F, -1F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 158
		bodyModel[52].setRotationPoint(52F, -26F, -1F);

		bodyModel[53].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 159
		bodyModel[53].setRotationPoint(56F, -26F, -1F);

		bodyModel[54].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 160
		bodyModel[54].setRotationPoint(49F, -26F, -1F);

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

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[61].setRotationPoint(1F, -7F, -12F);

		bodyModel[62].addBox(0F, 0F, 0F, 33, 1, 0, 0F); // Lamp
		bodyModel[62].setRotationPoint(35F, -37F, -5.05F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part Ligjhtpart8
		bodyModel[63].setRotationPoint(-1F, -34F, -2F);

		bodyModel[64].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[64].setRotationPoint(-2F, -16F, -9F);

		bodyModel[65].addBox(0F, 0F, 1F, 1, 1, 3, 0F); // Lamp
		bodyModel[65].setRotationPoint(-2F, -16F, 4F);

		bodyModel[66].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[66].setRotationPoint(-2F, -34F, -3F);

		bodyModel[67].addShapeBox(0F, 0F, 1F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[67].setRotationPoint(-2F, -31F, -3F);

		bodyModel[68].addBox(0F, 0F, 1F, 1, 2, 4, 0F); // Lamp
		bodyModel[68].setRotationPoint(-2F, -33F, -3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 33, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[69].setRotationPoint(3F, -32F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 33, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[70].setRotationPoint(3F, -33F, 2F);

		bodyModel[71].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[71].setRotationPoint(26F, -34F, -9F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, -42F, -42F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, -42F, -42F, 0F); // Du loco part23
		bodyModel[72].setRotationPoint(-14F, -9F, 6.05F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, -42F, -42F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, -42F, -42F, 0F); // Du loco part23
		bodyModel[73].setRotationPoint(-24F, -9F, 6.05F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 33, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[74].setRotationPoint(3F, -33F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 33, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[75].setRotationPoint(3F, -32F, -9F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 33, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[76].setRotationPoint(3F, -31F, -11F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[77].setRotationPoint(-1F, -11F, -11F);

		bodyModel[78].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[78].setRotationPoint(10F, -11F, -9F);

		bodyModel[79].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[79].setRotationPoint(13F, -11F, -9F);

		bodyModel[80].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[80].setRotationPoint(10F, -11F, 8F);

		bodyModel[81].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[81].setRotationPoint(13F, -11F, 8F);

		bodyModel[82].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[82].setRotationPoint(10F, -5F, -11F);

		bodyModel[83].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[83].setRotationPoint(10F, -7F, -11F);

		bodyModel[84].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[84].setRotationPoint(10F, -9F, -11F);

		bodyModel[85].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[85].setRotationPoint(10F, -5F, 9F);

		bodyModel[86].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[86].setRotationPoint(10F, -7F, 9F);

		bodyModel[87].addBox(0F, 0F, 0F, 4, 0, 2, 0F); // Du loco part28
		bodyModel[87].setRotationPoint(10F, -9F, 9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[88].setRotationPoint(7F, -25F, 11F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[89].setRotationPoint(12F, -25F, 11F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[90].setRotationPoint(7F, -25F, -12F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[91].setRotationPoint(12F, -25F, -12F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Du loco part05
		bodyModel[92].setRotationPoint(-1F, -20F, 11F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,-2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[93].setRotationPoint(-1F, -20F, -12F);

		bodyModel[94].addShapeBox(0F, 0F, 1F, 1, 1, 22, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 167
		bodyModel[94].setRotationPoint(-2F, -20F, -12F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[95].setRotationPoint(61F, -9F, -11F);

		bodyModel[96].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[96].setRotationPoint(61F, -10F, -11F);

		bodyModel[97].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part06
		bodyModel[97].setRotationPoint(64F, -10F, -11F);

		bodyModel[98].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Du loco part06
		bodyModel[98].setRotationPoint(11F, -11F, 6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[99].setRotationPoint(17F, -10F, 8F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[100].setRotationPoint(25F, -8F, 8F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[101].setRotationPoint(16F, -8F, 8F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[102].setRotationPoint(17F, -8F, 8F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[103].setRotationPoint(25F, -10F, 8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[104].setRotationPoint(16F, -10F, 8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[105].setRotationPoint(16F, -9F, 8F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[106].setRotationPoint(25F, -9F, 8F);

		bodyModel[107].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Du loco part06
		bodyModel[107].setRotationPoint(17F, -9F, 8F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[108].setRotationPoint(-25F, -21F, 11.05F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[109].setRotationPoint(-25F, -21F, -11.05F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[110].setRotationPoint(-1F, -30F, -11F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 19, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part28
		bodyModel[111].setRotationPoint(-1F, -30F, 10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[112].setRotationPoint(-2F, -11F, -10F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part06
		bodyModel[113].setRotationPoint(11F, -8F, 6F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F); // Du loco part06
		bodyModel[114].setRotationPoint(13F, -7F, 6F);

		bodyModel[115].addBox(0F, 0F, 0F, 5, 3, 2, 0F); // Du loco part06
		bodyModel[115].setRotationPoint(11F, -11F, -8F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part06
		bodyModel[116].setRotationPoint(11F, -8F, -8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F); // Du loco part06
		bodyModel[117].setRotationPoint(13F, -7F, -8F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[118].setRotationPoint(6F, -9F, -6F);

		bodyModel[119].addBox(0F, 0F, 0F, 10, 2, 12, 0F); // Du loco part01
		bodyModel[119].setRotationPoint(6F, -11F, -6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Du loco part01
		bodyModel[120].setRotationPoint(12F, -9F, -6F);

		bodyModel[121].addBox(0F, 0F, 0F, 5, 1, 2, 0F); // Du loco part01
		bodyModel[121].setRotationPoint(10F, -6F, -1F);

		bodyModel[122].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[122].setRotationPoint(10F, -4F, -6F);

		bodyModel[123].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[123].setRotationPoint(33F, -37F, -6F);

		bodyModel[124].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[124].setRotationPoint(47F, -37F, -6F);

		bodyModel[125].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[125].setRotationPoint(63F, -37F, -6F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, -3F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, 0F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, 0F, -3F); // Du loco part37
		bodyModel[126].setRotationPoint(28F, -37F, -8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[127].setRotationPoint(1F, -22F, 10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[128].setRotationPoint(1F, -28F, 10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[129].setRotationPoint(1F, -28F, 10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[130].setRotationPoint(6F, -28F, 10F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[131].setRotationPoint(8F, -22F, 10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[132].setRotationPoint(8F, -28F, 10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[133].setRotationPoint(8F, -28F, 10F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[134].setRotationPoint(11F, -28F, 10F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[135].setRotationPoint(1F, -22F, -11F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[136].setRotationPoint(1F, -28F, -11F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[137].setRotationPoint(1F, -28F, -11F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[138].setRotationPoint(6F, -28F, -11F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[139].setRotationPoint(8F, -22F, -11F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[140].setRotationPoint(8F, -28F, -11F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[141].setRotationPoint(8F, -28F, -11F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[142].setRotationPoint(11F, -28F, -11F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[143].setRotationPoint(-1F, -22F, 4F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[144].setRotationPoint(-2F, -29F, 4F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[145].setRotationPoint(-1F, -29F, 4F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[146].setRotationPoint(-1F, -29F, 8F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[147].setRotationPoint(-1F, -22F, -9F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[148].setRotationPoint(-2F, -29F, -9F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[149].setRotationPoint(-1F, -29F, -9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[150].setRotationPoint(-1F, -29F, -5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[151].setRotationPoint(-1F, -22F, -2F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[152].setRotationPoint(-1F, -28F, -2F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[153].setRotationPoint(-1F, -28F, -2F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[154].setRotationPoint(-1F, -28F, 1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[155].setRotationPoint(61F, -9F, -10F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[156].setRotationPoint(61F, -10F, -10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Du loco part06
		bodyModel[157].setRotationPoint(61F, -10F, -11F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[158].setRotationPoint(13F, -22F, 10F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[159].setRotationPoint(13F, -28F, 10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[160].setRotationPoint(13F, -28F, 10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[161].setRotationPoint(18F, -28F, 10F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[162].setRotationPoint(13F, -22F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[163].setRotationPoint(13F, -28F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[164].setRotationPoint(13F, -28F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[165].setRotationPoint(18F, -28F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[166].setRotationPoint(-1F, -33F, 2F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[167].setRotationPoint(-1F, -32F, 6F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[168].setRotationPoint(-1F, -33F, -6F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, -2F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[169].setRotationPoint(-1F, -32F, -9F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[170].setRotationPoint(-1F, -31F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,-1F, -1F, -2F, -4F, -1F, 0F, 0F, 0F, -2F, -4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 149
		bodyModel[171].setRotationPoint(-1F, -31F, 9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[172].setRotationPoint(-16.5F, -6.5F, 6.05F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[173].setRotationPoint(-16.5F, -6.5F, -6.05F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, -42F, -42F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, -42F, -42F, 0F); // Du loco part23
		bodyModel[174].setRotationPoint(-4F, -9F, 6.05F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, -42F, -42F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, -42F, -42F, 0F); // Du loco part23
		bodyModel[175].setRotationPoint(10F, -9F, 6.05F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[176].setRotationPoint(40F, -10F, 8F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[177].setRotationPoint(48F, -8F, 8F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[178].setRotationPoint(39F, -8F, 8F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[179].setRotationPoint(40F, -8F, 8F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[180].setRotationPoint(48F, -10F, 8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[181].setRotationPoint(39F, -10F, 8F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[182].setRotationPoint(39F, -9F, 8F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[183].setRotationPoint(48F, -9F, 8F);

		bodyModel[184].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Du loco part06
		bodyModel[184].setRotationPoint(40F, -9F, 8F);

		bodyModel[185].addBox(0F, 0F, 0F, 38, 3, 0, 0F); // Du loco part27
		bodyModel[185].setRotationPoint(20F, -9F, -6.15F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, -42F, -42F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, -42F, -42F, 0F); // Du loco part23
		bodyModel[186].setRotationPoint(-14F, -9F, -6.05F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, -42F, -42F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, -42F, -42F, 0F); // Du loco part23
		bodyModel[187].setRotationPoint(-24F, -9F, -6.05F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, -42F, -42F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, -42F, -42F, 0F); // Du loco part23
		bodyModel[188].setRotationPoint(-4F, -9F, -6.05F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-42F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -42F, 0F, 0F, -42F, -42F, 0F, 0F, -42F, 0F, 0F, -42F, 0F, -42F, -42F, 0F); // Du loco part23
		bodyModel[189].setRotationPoint(10F, -9F, -6.05F);

		bodyModel[190].addBox(0F, 0F, 0F, 33, 5, 4, 0F); // Du loco part08
		bodyModel[190].setRotationPoint(33F, -35F, -2F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 33, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 149
		bodyModel[191].setRotationPoint(33F, -32F, 9F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 35, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 149
		bodyModel[192].setRotationPoint(31F, -34F, 6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 37, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 149
		bodyModel[193].setRotationPoint(29F, -35F, 2F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part08
		bodyModel[194].setRotationPoint(28F, -35F, 0F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part08
		bodyModel[195].setRotationPoint(28F, -35F, -2F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 33, 2, 2, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[196].setRotationPoint(33F, -32F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 35, 4, 3, 0F,-2F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[197].setRotationPoint(31F, -34F, -9F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 37, 5, 4, 0F,-2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[198].setRotationPoint(29F, -35F, -6F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[199].setRotationPoint(28F, -22F, 10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[200].setRotationPoint(28F, -28F, 10F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[201].setRotationPoint(28F, -28F, 10F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[202].setRotationPoint(33F, -28F, 10F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[203].setRotationPoint(53F, -22F, 10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[204].setRotationPoint(53F, -28F, 10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[205].setRotationPoint(53F, -28F, 10F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[206].setRotationPoint(58F, -28F, 10F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[207].setRotationPoint(46F, -22F, 10F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[208].setRotationPoint(46F, -28F, 10F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[209].setRotationPoint(46F, -28F, 10F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[210].setRotationPoint(51F, -28F, 10F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[211].setRotationPoint(34F, -18F, -11F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[212].setRotationPoint(28F, -12F, -11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[213].setRotationPoint(28F, -19F, -11F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[214].setRotationPoint(27.75F, -18F, -11F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[215].setRotationPoint(28F, -16.75F, -11F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[216].setRotationPoint(28F, -16F, -11F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[217].setRotationPoint(28F, -15.25F, -11F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[218].setRotationPoint(28F, -14.5F, -11F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[219].setRotationPoint(28F, -13.75F, -11F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[220].setRotationPoint(28F, -18.25F, -11F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[221].setRotationPoint(28F, -17.5F, -11F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[222].setRotationPoint(28F, -22F, -11F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[223].setRotationPoint(28F, -28F, -11F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[224].setRotationPoint(28F, -28F, -11F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[225].setRotationPoint(33F, -28F, -11F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[226].setRotationPoint(53F, -22F, -11F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[227].setRotationPoint(53F, -28F, -11F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[228].setRotationPoint(53F, -28F, -11F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[229].setRotationPoint(58F, -28F, -11F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[230].setRotationPoint(46F, -22F, -11F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[231].setRotationPoint(46F, -28F, -11F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[232].setRotationPoint(46F, -28F, -11F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[233].setRotationPoint(51F, -28F, -11F);

		bodyModel[234].addBox(0F, 0F, 0F, 33, 1, 0, 0F); // Lamp
		bodyModel[234].setRotationPoint(35F, -37F, 4.95F);

		bodyModel[235].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[235].setRotationPoint(26F, -34F, 7F);

		bodyModel[236].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[236].setRotationPoint(33F, -37F, 4F);

		bodyModel[237].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[237].setRotationPoint(47F, -37F, 4F);

		bodyModel[238].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Du loco part37
		bodyModel[238].setRotationPoint(63F, -37F, 4F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, -3F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, 0F, -3F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, 0F, 0F); // Du loco part37
		bodyModel[239].setRotationPoint(28F, -37F, 5F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 5, 1, 12, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 1F, 0F, -4.875F, 1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part42
		bodyModel[240].setRotationPoint(1F, -7F, 0F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F,-6.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, -2F, -1F, 0F, -4.875F, 0F, 0F, -2F, 0F, 0F, -6.875F, 1F, 0F, 0F, 1F, 0F); // Du loco part42
		bodyModel[241].setRotationPoint(-1F, -6F, -12F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F,-2F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -6.875F, 0F, 0F, 0F, 1F, 0F, -6.875F, 1F, 0F, -2F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part42
		bodyModel[242].setRotationPoint(-1F, -6F, 0F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 7, 3, 12, 0F,-4.875F, 0F, 0F, -2F, 0F, 0F, -6.875F, 0F, 0F, 0F, 0F, 0F, -6.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, -2F, 0F, 0F); // Du loco part42
		bodyModel[243].setRotationPoint(-1F, -10F, -12F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 7, 3, 12, 0F,0F, 0F, 0F, -6.875F, 0F, 0F, -2F, 0F, 0F, -4.875F, 0F, 0F, -2F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -6.875F, 0F, 0F); // Du loco part42
		bodyModel[244].setRotationPoint(-1F, -10F, 0F);

		bodyModel[245].addBox(0F, 0F, 0F, 12, 10, 0, 0F); // Du loco part27
		bodyModel[245].setRotationPoint(30F, -16F, 6.25F);

		bodyModel[246].addBox(0F, 0F, 0F, 12, 10, 0, 0F); // Du loco part27
		bodyModel[246].setRotationPoint(30F, -16F, -6.25F);

		bodyModel[247].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part37
		bodyModel[247].setRotationPoint(0F, -33F, 3F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[248].setRotationPoint(28F, -13F, -11F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[249].setRotationPoint(34F, -18F, 10F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[250].setRotationPoint(28F, -12F, 10F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[251].setRotationPoint(28F, -19F, 10F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[252].setRotationPoint(27.75F, -18F, 10F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[253].setRotationPoint(28F, -16.75F, 10F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[254].setRotationPoint(28F, -16F, 10F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[255].setRotationPoint(28F, -15.25F, 10F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[256].setRotationPoint(28F, -14.5F, 10F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[257].setRotationPoint(28F, -13.75F, 10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[258].setRotationPoint(28F, -18.25F, 10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[259].setRotationPoint(28F, -17.5F, 10F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[260].setRotationPoint(28F, -13F, 10F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[261].setRotationPoint(65F, -18F, 10F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[262].setRotationPoint(59F, -12F, 10F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[263].setRotationPoint(59F, -19F, 10F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[264].setRotationPoint(58.75F, -18F, 10F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[265].setRotationPoint(59F, -16.75F, 10F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[266].setRotationPoint(59F, -16F, 10F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[267].setRotationPoint(59F, -15.25F, 10F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[268].setRotationPoint(59F, -14.5F, 10F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[269].setRotationPoint(59F, -13.75F, 10F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[270].setRotationPoint(59F, -18.25F, 10F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[271].setRotationPoint(59F, -17.5F, 10F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[272].setRotationPoint(59F, -13F, 10F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[273].setRotationPoint(-3F, -9.25F, 4.43F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[274].setRotationPoint(-2.75F, -9F, 4.9F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[275].setRotationPoint(-5.5F, -8.75F, 5.15F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[276].setRotationPoint(-3F, -9.25F, -6.63F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[277].setRotationPoint(-5.5F, -8.75F, -5.88F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[278].setRotationPoint(-3F, -8.75F, 0F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[279].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[280].setRotationPoint(-2.5F, -8.5F, -0.25F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[281].setRotationPoint(-4.5F, -7F, -0.25F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[282].setRotationPoint(-3.5F, -8.75F, -0.25F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[283].setRotationPoint(-4.5F, -8.5F, 0F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[284].setRotationPoint(-4.5F, -8.5F, -0.75F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[285].setRotationPoint(-3F, -8.75F, 0.25F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[286].setRotationPoint(-3F, -8.5F, -0.25F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[287].setRotationPoint(-3F, -9F, -0.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[288].setRotationPoint(-3F, -6F, -0.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[289].setRotationPoint(-3F, -8.75F, -1F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[290].setRotationPoint(-4.5F, -6F, -0.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[291].setRotationPoint(-4.5F, -5.25F, -0.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[292].setRotationPoint(-6.5F, -8.87F, 4.03F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[293].setRotationPoint(-6.5F, -9.87F, 4.03F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[294].setRotationPoint(-6.5F, -9.37F, 4.03F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[295].setRotationPoint(-6.5F, -7.87F, 4.03F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[296].setRotationPoint(-6.5F, -8.37F, 4.03F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[297].setRotationPoint(-6.5F, -8.87F, -7.03F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[298].setRotationPoint(-6.5F, -9.87F, -7.03F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[299].setRotationPoint(-6.5F, -9.37F, -7.03F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[300].setRotationPoint(-6.5F, -7.87F, -7.03F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[301].setRotationPoint(-6.5F, -8.37F, -7.03F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[302].setRotationPoint(-2.75F, -9.5F, 4.9F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[303].setRotationPoint(-2.75F, -8.25F, 4.9F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[304].setRotationPoint(-2.75F, -9F, -6.13F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[305].setRotationPoint(-2.75F, -9.5F, -6.13F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[306].setRotationPoint(-2.75F, -8.25F, -6.13F);
	}
	@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale)
	{
		super.render(entity, f0, f1, f2, f3, f4, scale);
		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f0, f1, f2, f3, f4, scale);
	}
}