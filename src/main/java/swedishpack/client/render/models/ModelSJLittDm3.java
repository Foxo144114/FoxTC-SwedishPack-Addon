//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera Dm3
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00
package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittDm3 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittDm3() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[192];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}
	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part01
		bodyModel[1] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Du loco part07
		bodyModel[2] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Du loco part08
		bodyModel[3] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Du loco part17
		bodyModel[4] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Du loco part20
		bodyModel[5] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Du loco part27
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 149
		bodyModel[7] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 135
		bodyModel[8] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 136
		bodyModel[9] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 138
		bodyModel[10] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 139
		bodyModel[11] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 141
		bodyModel[12] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 142
		bodyModel[13] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 143
		bodyModel[14] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 144
		bodyModel[15] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 145
		bodyModel[16] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 146
		bodyModel[17] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 147
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 148
		bodyModel[19] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 149
		bodyModel[20] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 150
		bodyModel[21] = new ModelRendererTurbo(this, 41, 33, textureX, textureY); // Box 151
		bodyModel[22] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 152
		bodyModel[23] = new ModelRendererTurbo(this, 137, 33, textureX, textureY); // Box 153
		bodyModel[24] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 154
		bodyModel[25] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 155
		bodyModel[26] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 156
		bodyModel[27] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 157
		bodyModel[28] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 158
		bodyModel[29] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 159
		bodyModel[30] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 160
		bodyModel[31] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 146
		bodyModel[32] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 146
		bodyModel[33] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Du loco part37
		bodyModel[34] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Du loco part37
		bodyModel[35] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Du loco part37
		bodyModel[36] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 138
		bodyModel[37] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 139
		bodyModel[38] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 141
		bodyModel[39] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 142
		bodyModel[40] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 143
		bodyModel[41] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 144
		bodyModel[42] = new ModelRendererTurbo(this, 225, 57, textureX, textureY); // Box 145
		bodyModel[43] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 146
		bodyModel[44] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 147
		bodyModel[45] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 148
		bodyModel[46] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 149
		bodyModel[47] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 149
		bodyModel[48] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 149
		bodyModel[49] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Du loco part23
		bodyModel[50] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 149
		bodyModel[51] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 149
		bodyModel[52] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Du loco part37
		bodyModel[53] = new ModelRendererTurbo(this, 89, 49, textureX, textureY); // Box 149
		bodyModel[54] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 149
		bodyModel[55] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Du loco part37
		bodyModel[56] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Du loco part37
		bodyModel[57] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Du loco part37
		bodyModel[58] = new ModelRendererTurbo(this, 505, 25, textureX, textureY); // Du loco part37
		bodyModel[59] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Du loco part37
		bodyModel[60] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Du loco part37
		bodyModel[61] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Du loco part37
		bodyModel[62] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Du loco part23
		bodyModel[63] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Du loco part23
		bodyModel[64] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Du loco part23
		bodyModel[65] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Du loco part23
		bodyModel[66] = new ModelRendererTurbo(this, 105, 129, textureX, textureY); // Du loco part23
		bodyModel[67] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Du loco part23
		bodyModel[68] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Du loco part23
		bodyModel[69] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Du loco part23
		bodyModel[70] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Du loco part23
		bodyModel[71] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Du loco part71
		bodyModel[72] = new ModelRendererTurbo(this, 361, 201, textureX, textureY); // Du loco part71
		bodyModel[73] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Du loco part71
		bodyModel[74] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Box 149
		bodyModel[75] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 149
		bodyModel[76] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Du loco part37
		bodyModel[77] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 149
		bodyModel[78] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 149
		bodyModel[79] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 149
		bodyModel[80] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 149
		bodyModel[81] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 149
		bodyModel[82] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 149
		bodyModel[83] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 149
		bodyModel[84] = new ModelRendererTurbo(this, 417, 41, textureX, textureY); // Box 149
		bodyModel[85] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Du loco part20
		bodyModel[86] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Du loco part20
		bodyModel[87] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Du loco part20
		bodyModel[88] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Du loco part20
		bodyModel[89] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Du loco part20
		bodyModel[90] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Du loco part20
		bodyModel[91] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Du loco part06
		bodyModel[92] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Du loco part06
		bodyModel[93] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Du loco part06
		bodyModel[94] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Du loco part06
		bodyModel[95] = new ModelRendererTurbo(this, 193, 65, textureX, textureY); // Du loco part06
		bodyModel[96] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Du loco part06
		bodyModel[97] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Du loco part06
		bodyModel[98] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Du loco part06
		bodyModel[99] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Du loco part06
		bodyModel[100] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Du loco part06
		bodyModel[101] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Du loco part06
		bodyModel[102] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Du loco part06
		bodyModel[103] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Du loco part06
		bodyModel[104] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Du loco part06
		bodyModel[105] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Du loco part06
		bodyModel[106] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Du loco part06
		bodyModel[107] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Du loco part06
		bodyModel[108] = new ModelRendererTurbo(this, 289, 65, textureX, textureY); // Du loco part06
		bodyModel[109] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Du loco part20
		bodyModel[110] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Du loco part20
		bodyModel[111] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Du loco part20
		bodyModel[112] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Du loco part20
		bodyModel[113] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Du loco part20
		bodyModel[114] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Du loco part20
		bodyModel[115] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Du loco part01
		bodyModel[116] = new ModelRendererTurbo(this, 313, 33, textureX, textureY); // Du loco part37
		bodyModel[117] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 135
		bodyModel[118] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 135
		bodyModel[119] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 135
		bodyModel[120] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 135
		bodyModel[121] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 135
		bodyModel[122] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 135
		bodyModel[123] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 135
		bodyModel[124] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 135
		bodyModel[125] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 135
		bodyModel[126] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 135
		bodyModel[127] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 135
		bodyModel[128] = new ModelRendererTurbo(this, 465, 81, textureX, textureY); // Box 135
		bodyModel[129] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 135
		bodyModel[130] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 135
		bodyModel[131] = new ModelRendererTurbo(this, 417, 89, textureX, textureY); // Box 135
		bodyModel[132] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 135
		bodyModel[133] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 135
		bodyModel[134] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 135
		bodyModel[135] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 135
		bodyModel[136] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 135
		bodyModel[137] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 135
		bodyModel[138] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 135
		bodyModel[139] = new ModelRendererTurbo(this, 497, 89, textureX, textureY); // Box 135
		bodyModel[140] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 135
		bodyModel[141] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 135
		bodyModel[142] = new ModelRendererTurbo(this, 425, 97, textureX, textureY); // Box 135
		bodyModel[143] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 135
		bodyModel[144] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 135
		bodyModel[145] = new ModelRendererTurbo(this, 457, 97, textureX, textureY); // Box 135
		bodyModel[146] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 135
		bodyModel[147] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 135
		bodyModel[148] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 135
		bodyModel[149] = new ModelRendererTurbo(this, 361, 209, textureX, textureY); // Box 146
		bodyModel[150] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 146
		bodyModel[151] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Du loco part08
		bodyModel[152] = new ModelRendererTurbo(this, 464, 101, textureX, textureY); // Du loco part20
		bodyModel[153] = new ModelRendererTurbo(this, 459, 101, textureX, textureY); // Du loco part20
		bodyModel[154] = new ModelRendererTurbo(this, 454, 101, textureX, textureY); // Du loco part20
		bodyModel[155] = new ModelRendererTurbo(this, 449, 101, textureX, textureY); // Du loco part20
		bodyModel[156] = new ModelRendererTurbo(this, 1, 357, textureX, textureY); // Du loco part23
		bodyModel[157] = new ModelRendererTurbo(this, 1, 263, textureX, textureY); // Du loco part23
		bodyModel[158] = new ModelRendererTurbo(this, 1, 263, textureX, textureY); // Du loco part23
		bodyModel[159] = new ModelRendererTurbo(this, 1, 315, textureX, textureY); // Du loco part23
		bodyModel[160] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[161] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[162] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[163] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[164] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[165] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[166] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[167] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[168] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[169] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[170] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[171] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[172] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[173] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[174] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[175] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[176] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[177] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[178] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[179] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[180] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[181] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[182] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[183] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[184] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[185] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[186] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[187] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[188] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[189] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[190] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20
		bodyModel[191] = new ModelRendererTurbo(this, 442, 130, textureX, textureY); // Du loco part20

		bodyModel[0].addBox(0F, 0F, 0F, 69, 8, 12, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(14F, -11F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 71, 20, 1, 0F); // Du loco part07
		bodyModel[1].setRotationPoint(13F, -30F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 71, 3, 4, 0F); // Du loco part08
		bodyModel[2].setRotationPoint(13F, -33F, -2F);

		bodyModel[3].addBox(0F, 0F, 0F, 59, 3, 0, 0F); // Du loco part17
		bodyModel[3].setRotationPoint(19F, -10F, -6.15F);

		bodyModel[4].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Du loco part20
		bodyModel[4].setRotationPoint(83F, -30F, -10F);

		bodyModel[5].addBox(0F, 0F, 0F, 59, 3, 0, 0F); // Du loco part27
		bodyModel[5].setRotationPoint(19F, -10F, 6.15F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 71, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[6].setRotationPoint(13F, -31F, 9F);

		bodyModel[7].addBox(0F, 0F, 0F, 71, 20, 1, 0F); // Box 135
		bodyModel[7].setRotationPoint(13F, -30F, 10F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 20, 20, 0F); // Box 136
		bodyModel[8].setRotationPoint(13F, -30F, -10F);

		bodyModel[9].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[9].setRotationPoint(20F, -16F, -2F);

		bodyModel[10].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[10].setRotationPoint(19F, -22F, -3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[11].setRotationPoint(19F, -24F, -3F);

		bodyModel[12].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 142
		bodyModel[12].setRotationPoint(20F, -25F, -2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 143
		bodyModel[13].setRotationPoint(19F, -26F, -3F);

		bodyModel[14].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 144
		bodyModel[14].setRotationPoint(19F, -30F, -3F);

		bodyModel[15].addBox(0F, 0F, 0F, 12, 15, 12, 0F); // Box 145
		bodyModel[15].setRotationPoint(28F, -27F, -5F);

		bodyModel[16].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 146
		bodyModel[16].setRotationPoint(27F, -28F, -6F);

		bodyModel[17].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[17].setRotationPoint(22F, -19F, -4F);

		bodyModel[18].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 148
		bodyModel[18].setRotationPoint(26F, -26F, -4F);

		bodyModel[19].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[19].setRotationPoint(27F, -26F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[20].setRotationPoint(41F, -16F, -2F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		bodyModel[21].setRotationPoint(51F, -16F, -2F);

		bodyModel[22].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 152
		bodyModel[22].setRotationPoint(52F, -30F, -1F);

		bodyModel[23].addBox(0F, 0F, 0F, 2, 14, 2, 0F); // Box 153
		bodyModel[23].setRotationPoint(42F, -30F, -1F);

		bodyModel[24].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 154
		bodyModel[24].setRotationPoint(45F, -27F, -1F);

		bodyModel[25].addBox(0F, 0F, 0F, 2, 9, 2, 0F); // Box 155
		bodyModel[25].setRotationPoint(49F, -27F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 1F); // Box 156
		bodyModel[26].setRotationPoint(49F, -18F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 1F); // Box 157
		bodyModel[27].setRotationPoint(45F, -18F, -1F);

		bodyModel[28].addBox(0F, 0F, 0F, 2, 2, 2, 0F); // Box 158
		bodyModel[28].setRotationPoint(47F, -26F, -1F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 159
		bodyModel[29].setRotationPoint(51F, -26F, -1F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 2, 2, 0F); // Box 160
		bodyModel[30].setRotationPoint(44F, -26F, -1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 59, 3, 2, 0F,-2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[31].setRotationPoint(19F, -33F, -11F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 59, 3, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[32].setRotationPoint(19F, -33F, 9F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part37
		bodyModel[33].setRotationPoint(36F, -36F, -1.06F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part37
		bodyModel[34].setRotationPoint(82F, -36F, 0F);

		bodyModel[35].addBox(0F, 0F, 0F, 77, 1, 0, 0F); // Du loco part37
		bodyModel[35].setRotationPoint(10F, -36F, -0.05F);

		bodyModel[36].addBox(0F, 0F, 0F, 4, 4, 4, 0F); // Box 138
		bodyModel[36].setRotationPoint(72F, -16F, -2F);

		bodyModel[37].addBox(0F, 0F, 0F, 6, 6, 6, 0F); // Box 139
		bodyModel[37].setRotationPoint(71F, -22F, -3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[38].setRotationPoint(71F, -24F, -3F);

		bodyModel[39].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 142
		bodyModel[39].setRotationPoint(72F, -25F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 143
		bodyModel[40].setRotationPoint(71F, -26F, -3F);

		bodyModel[41].addBox(0F, 0F, 0F, 6, 4, 6, 0F); // Box 144
		bodyModel[41].setRotationPoint(71F, -30F, -3F);

		bodyModel[42].addBox(0F, 0F, 0F, 12, 15, 12, 0F); // Box 145
		bodyModel[42].setRotationPoint(56F, -27F, -5F);

		bodyModel[43].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Box 146
		bodyModel[43].setRotationPoint(55F, -28F, -6F);

		bodyModel[44].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 147
		bodyModel[44].setRotationPoint(69F, -19F, -4F);

		bodyModel[45].addBox(0F, 0F, 0F, 1, 7, 1, 0F); // Box 148
		bodyModel[45].setRotationPoint(69F, -26F, -4F);

		bodyModel[46].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 149
		bodyModel[46].setRotationPoint(68F, -26F, -4F);

		bodyModel[47].addBox(0F, 0F, 0F, 10, 2, 4, 0F); // Box 149
		bodyModel[47].setRotationPoint(74F, -36F, 2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[48].setRotationPoint(74F, -37F, 2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[49].setRotationPoint(32F, -11F, 6.05F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 71, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[50].setRotationPoint(13F, -32F, 6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 71, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[51].setRotationPoint(13F, -33F, 2F);

		bodyModel[52].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Du loco part37
		bodyModel[52].setRotationPoint(29F, -37F, -1F);

		bodyModel[53].addBox(0F, 0F, 0F, 10, 2, 4, 0F); // Box 149
		bodyModel[53].setRotationPoint(74F, -36F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[54].setRotationPoint(74F, -37F, -6F);

		bodyModel[55].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part37
		bodyModel[55].setRotationPoint(29F, -36F, -4F);

		bodyModel[56].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Du loco part37
		bodyModel[56].setRotationPoint(29F, -36F, 3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part37
		bodyModel[57].setRotationPoint(29F, -37F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[58].setRotationPoint(29F, -37F, 1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 29, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[59].setRotationPoint(36F, -36F, -1.07F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Du loco part37
		bodyModel[60].setRotationPoint(65F, -36F, -1.07F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Du loco part37
		bodyModel[61].setRotationPoint(62F, -36F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[62].setRotationPoint(18F, -11F, 6.05F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[63].setRotationPoint(4F, -11F, 6.05F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[64].setRotationPoint(-10F, -11F, 6.05F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[65].setRotationPoint(-24F, -11F, 6.05F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[66].setRotationPoint(32F, -11F, -6.05F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[67].setRotationPoint(18F, -11F, -6.05F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[68].setRotationPoint(4F, -11F, -6.05F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[69].setRotationPoint(-10F, -11F, -6.05F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[70].setRotationPoint(-24F, -11F, -6.05F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 71, 3, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[71].setRotationPoint(13F, -33F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 71, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[72].setRotationPoint(13F, -32F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 71, 1, 2, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part71
		bodyModel[73].setRotationPoint(13F, -31F, -11F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
		bodyModel[74].setRotationPoint(74F, -34F, 2F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
		bodyModel[75].setRotationPoint(74F, -34F, -6F);

		bodyModel[76].addBox(0F, 0F, 0F, 3, 2, 3, 0F); // Du loco part37
		bodyModel[76].setRotationPoint(68F, -34F, -2.57F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
		bodyModel[77].setRotationPoint(75F, -34F, -7F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
		bodyModel[78].setRotationPoint(82F, -34F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
		bodyModel[79].setRotationPoint(75F, -34F, 1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
		bodyModel[80].setRotationPoint(82F, -34F, 1F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[81].setRotationPoint(75F, -34F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[82].setRotationPoint(82F, -34F, -3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[83].setRotationPoint(75F, -34F, 5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[84].setRotationPoint(82F, -34F, 5F);

		bodyModel[85].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Du loco part20
		bodyModel[85].setRotationPoint(84F, -30F, -5F);

		bodyModel[86].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Du loco part20
		bodyModel[86].setRotationPoint(84F, -30F, 3F);

		bodyModel[87].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Du loco part20
		bodyModel[87].setRotationPoint(84F, -32F, -3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[88].setRotationPoint(84F, -32F, -5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[89].setRotationPoint(84F, -32F, 3F);

		bodyModel[90].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Du loco part20
		bodyModel[90].setRotationPoint(84F, -12F, -3F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[91].setRotationPoint(25F, -9F, -11F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[92].setRotationPoint(25F, -11F, -10F);

		bodyModel[93].addBox(0F, 0F, 0F, 8, 1, 3, 0F); // Du loco part06
		bodyModel[93].setRotationPoint(25F, -10F, -11F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[94].setRotationPoint(33F, -9F, -11F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[95].setRotationPoint(33F, -10F, -11F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[96].setRotationPoint(33F, -11F, -10F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[97].setRotationPoint(24F, -9F, -11F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[98].setRotationPoint(24F, -10F, -11F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[99].setRotationPoint(24F, -11F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[100].setRotationPoint(27F, -9F, 9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[101].setRotationPoint(27F, -10F, 9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[102].setRotationPoint(29F, -9F, 9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[103].setRotationPoint(29F, -10F, 9F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[104].setRotationPoint(26F, -9F, 9F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[105].setRotationPoint(26F, -10F, 9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[106].setRotationPoint(27F, -10F, 10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[107].setRotationPoint(29F, -10F, 10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[108].setRotationPoint(26F, -10F, 10F);

		bodyModel[109].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Du loco part20
		bodyModel[109].setRotationPoint(12F, -30F, -5F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 19, 2, 0F); // Du loco part20
		bodyModel[110].setRotationPoint(12F, -30F, 3F);

		bodyModel[111].addBox(0F, 0F, 0F, 1, 2, 6, 0F); // Du loco part20
		bodyModel[111].setRotationPoint(12F, -32F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[112].setRotationPoint(12F, -32F, -5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[113].setRotationPoint(12F, -32F, 3F);

		bodyModel[114].addBox(0F, 0F, 0F, 1, 1, 6, 0F); // Du loco part20
		bodyModel[114].setRotationPoint(12F, -12F, -3F);

		bodyModel[115].addBox(0F, 0F, 0F, 69, 1, 20, 0F); // Du loco part01
		bodyModel[115].setRotationPoint(14F, -12F, -10F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 1, 0, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F); // Du loco part37
		bodyModel[116].setRotationPoint(31F, -36F, -1.07F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[117].setRotationPoint(16F, -7F, 9F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[118].setRotationPoint(14F, -5F, 9F);

		bodyModel[119].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 135
		bodyModel[119].setRotationPoint(11F, -4F, 9F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[120].setRotationPoint(18F, -8F, 9F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[121].setRotationPoint(20F, -8F, 9F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[122].setRotationPoint(20F, -9F, 9F);

		bodyModel[123].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 135
		bodyModel[123].setRotationPoint(22F, -11F, 9F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[124].setRotationPoint(19F, -11F, 9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[125].setRotationPoint(16F, -7F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[126].setRotationPoint(14F, -5F, -10F);

		bodyModel[127].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 135
		bodyModel[127].setRotationPoint(11F, -4F, -10F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[128].setRotationPoint(18F, -8F, -10F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[129].setRotationPoint(20F, -8F, -10F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[130].setRotationPoint(20F, -9F, -10F);

		bodyModel[131].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 135
		bodyModel[131].setRotationPoint(22F, -11F, -10F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[132].setRotationPoint(19F, -11F, -10F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 135
		bodyModel[133].setRotationPoint(79F, -7F, 9F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[134].setRotationPoint(81F, -5F, 9F);

		bodyModel[135].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 135
		bodyModel[135].setRotationPoint(83F, -4F, 9F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[136].setRotationPoint(77F, -8F, 9F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[137].setRotationPoint(74F, -8F, 9F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[138].setRotationPoint(76F, -9F, 9F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 135
		bodyModel[139].setRotationPoint(74F, -11F, 9F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[140].setRotationPoint(77F, -11F, 9F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 135
		bodyModel[141].setRotationPoint(79F, -7F, -10F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[142].setRotationPoint(81F, -5F, -10F);

		bodyModel[143].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 135
		bodyModel[143].setRotationPoint(83F, -4F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[144].setRotationPoint(77F, -8F, -10F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[145].setRotationPoint(74F, -8F, -10F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 135
		bodyModel[146].setRotationPoint(76F, -9F, -10F);

		bodyModel[147].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 135
		bodyModel[147].setRotationPoint(74F, -11F, -10F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[148].setRotationPoint(77F, -11F, -10F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 71, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[149].setRotationPoint(13F, -33F, 9F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 71, 3, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[150].setRotationPoint(13F, -33F, -11F);

		bodyModel[151].addBox(0F, 0F, 0F, 71, 3, 18, 0F); // Du loco part08
		bodyModel[151].setRotationPoint(13F, -33F, -9F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part20
		bodyModel[152].setRotationPoint(60F, -25F, 11F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part20
		bodyModel[153].setRotationPoint(65F, -25F, 11F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[154].setRotationPoint(32F, -25F, -12F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[155].setRotationPoint(37F, -25F, -12F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 240, 40, 0, 0F,-180F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -180F, 0F, 0F, -180F, -30F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -180F, -30F, 0F); // Du loco part23
		bodyModel[156].setRotationPoint(-162F, -20F, 11.05F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[157].setRotationPoint(4F, -20F, 11.1F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[158].setRotationPoint(4F, -20F, -11.1F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 240, 40, 0, 0F,-180F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -180F, 0F, 0F, -180F, -30F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -180F, -30F, 0F); // Du loco part23
		bodyModel[159].setRotationPoint(-162F, -20F, -11.05F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part20
		bodyModel[160].setRotationPoint(38F, -28F, -11F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part20
		bodyModel[161].setRotationPoint(38F, -28F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[162].setRotationPoint(38F, -23F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part20
		bodyModel[163].setRotationPoint(45F, -28F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part20
		bodyModel[164].setRotationPoint(24F, -28F, -11F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part20
		bodyModel[165].setRotationPoint(24F, -28F, -11F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[166].setRotationPoint(24F, -23F, -11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part20
		bodyModel[167].setRotationPoint(31F, -28F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part20
		bodyModel[168].setRotationPoint(52F, -28F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part20
		bodyModel[169].setRotationPoint(52F, -28F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[170].setRotationPoint(52F, -23F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part20
		bodyModel[171].setRotationPoint(59F, -28F, -11F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part20
		bodyModel[172].setRotationPoint(66F, -28F, -11F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part20
		bodyModel[173].setRotationPoint(66F, -28F, -11F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[174].setRotationPoint(66F, -23F, -11F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part20
		bodyModel[175].setRotationPoint(73F, -28F, -11F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part20
		bodyModel[176].setRotationPoint(38F, -28F, 10F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part20
		bodyModel[177].setRotationPoint(38F, -28F, 10F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[178].setRotationPoint(38F, -23F, 10F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part20
		bodyModel[179].setRotationPoint(45F, -28F, 10F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part20
		bodyModel[180].setRotationPoint(24F, -28F, 10F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part20
		bodyModel[181].setRotationPoint(24F, -28F, 10F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[182].setRotationPoint(24F, -23F, 10F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part20
		bodyModel[183].setRotationPoint(31F, -28F, 10F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part20
		bodyModel[184].setRotationPoint(52F, -28F, 10F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part20
		bodyModel[185].setRotationPoint(52F, -28F, 10F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[186].setRotationPoint(52F, -23F, 10F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part20
		bodyModel[187].setRotationPoint(59F, -28F, 10F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part20
		bodyModel[188].setRotationPoint(66F, -28F, 10F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part20
		bodyModel[189].setRotationPoint(66F, -28F, 10F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part20
		bodyModel[190].setRotationPoint(66F, -23F, 10F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part20
		bodyModel[191].setRotationPoint(73F, -28F, 10F);
	}
}