//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2026 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera T31
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import net.minecraft.entity.Entity;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import train.common.api.AbstractTrains;

public class ModelSJLittT31 extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittT31() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[409];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 39, 308, textureX, textureY); // Du loco part01
		bodyModel[1] = new ModelRendererTurbo(this, 43, 304, textureX, textureY); // Du loco part03
		bodyModel[2] = new ModelRendererTurbo(this, 63, 329, textureX, textureY); // Du loco part17
		bodyModel[3] = new ModelRendererTurbo(this, 63, 329, textureX, textureY); // Du loco part27
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
		bodyModel[28] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[29] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[30] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[31] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[32] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Du loco part28
		bodyModel[33] = new ModelRendererTurbo(this, 97, 233, textureX, textureY); // Du loco part28
		bodyModel[34] = new ModelRendererTurbo(this, 377, 233, textureX, textureY); // Du loco part28
		bodyModel[35] = new ModelRendererTurbo(this, 385, 233, textureX, textureY); // Du loco part28
		bodyModel[36] = new ModelRendererTurbo(this, 393, 233, textureX, textureY); // Du loco part28
		bodyModel[37] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[38] = new ModelRendererTurbo(this, 98, 241, textureX, textureY); // Du loco part28
		bodyModel[39] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 156
		bodyModel[40] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 156
		bodyModel[41] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 154
		bodyModel[42] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 154
		bodyModel[43] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 154
		bodyModel[44] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 154
		bodyModel[45] = new ModelRendererTurbo(this, 289, 241, textureX, textureY); // Du loco part23
		bodyModel[46] = new ModelRendererTurbo(this, 393, 257, textureX, textureY); // Du loco part23
		bodyModel[47] = new ModelRendererTurbo(this, 111, 247, textureX, textureY); // Du loco part41
		bodyModel[48] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[49] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[50] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[51] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[52] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[53] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[54] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[55] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[56] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[57] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[58] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[59] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[60] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[61] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[62] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[63] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[64] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[65] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[66] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[67] = new ModelRendererTurbo(this, 12, 337, textureX, textureY); // Du loco part05
		bodyModel[68] = new ModelRendererTurbo(this, 111, 247, textureX, textureY); // Du loco part41
		bodyModel[69] = new ModelRendererTurbo(this, 39, 309, textureX, textureY); // Du loco part01
		bodyModel[70] = new ModelRendererTurbo(this, 249, 357, textureX, textureY); // Du loco part19
		bodyModel[71] = new ModelRendererTurbo(this, 214, 435, textureX, textureY); // Du loco part19
		bodyModel[72] = new ModelRendererTurbo(this, 214, 435, textureX, textureY); // Du loco part19
		bodyModel[73] = new ModelRendererTurbo(this, 271, 392, textureX, textureY); // Du loco part19
		bodyModel[74] = new ModelRendererTurbo(this, 271, 392, textureX, textureY); // Du loco part19
		bodyModel[75] = new ModelRendererTurbo(this, 210, 421, textureX, textureY); // Du loco part19
		bodyModel[76] = new ModelRendererTurbo(this, 440, 55, textureX, textureY); // Lamp
		bodyModel[77] = new ModelRendererTurbo(this, 440, 60, textureX, textureY); // Lamp
		bodyModel[78] = new ModelRendererTurbo(this, 398, 56, textureX, textureY); // Lamp
		bodyModel[79] = new ModelRendererTurbo(this, 423, 61, textureX, textureY); // Lamp
		bodyModel[80] = new ModelRendererTurbo(this, 423, 56, textureX, textureY); // Lamp
		bodyModel[81] = new ModelRendererTurbo(this, 398, 61, textureX, textureY); // Lamp
		bodyModel[82] = new ModelRendererTurbo(this, 328, 421, textureX, textureY); // Du loco part19
		bodyModel[83] = new ModelRendererTurbo(this, 288, 393, textureX, textureY); // Du loco part19
		bodyModel[84] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[85] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[86] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[87] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[88] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[89] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[90] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[91] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[92] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[93] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[94] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[95] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[96] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[97] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[98] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[99] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[100] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[101] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[102] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[103] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[104] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[105] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[106] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[107] = new ModelRendererTurbo(this, 351, 383, textureX, textureY); // Du loco part19
		bodyModel[108] = new ModelRendererTurbo(this, 352, 381, textureX, textureY); // Du loco part19
		bodyModel[109] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[110] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[111] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[112] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[113] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[114] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[115] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[116] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[117] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[118] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[119] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[120] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[121] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[122] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[123] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[124] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[125] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[126] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[127] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[128] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[129] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[130] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[131] = new ModelRendererTurbo(this, 20, 384, textureX, textureY); // Du loco part05
		bodyModel[132] = new ModelRendererTurbo(this, 20, 384, textureX, textureY); // Du loco part05
		bodyModel[133] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[134] = new ModelRendererTurbo(this, 26, 379, textureX, textureY); // Du loco part05
		bodyModel[135] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[136] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[137] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[138] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[139] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[140] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[141] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[142] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[143] = new ModelRendererTurbo(this, 162, 387, textureX, textureY); // Du loco part19
		bodyModel[144] = new ModelRendererTurbo(this, 174, 399, textureX, textureY); // Du loco part19
		bodyModel[145] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[146] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[147] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[148] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[149] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[150] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[151] = new ModelRendererTurbo(this, 26, 366, textureX, textureY); // Du loco part05
		bodyModel[152] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[153] = new ModelRendererTurbo(this, 201, 339, textureX, textureY); // Du loco part19
		bodyModel[154] = new ModelRendererTurbo(this, 165, 339, textureX, textureY); // Du loco part19
		bodyModel[155] = new ModelRendererTurbo(this, 270, 393, textureX, textureY); // Du loco part19
		bodyModel[156] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part28
		bodyModel[157] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[158] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Du loco part28
		bodyModel[159] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[160] = new ModelRendererTurbo(this, 491, 73, textureX, textureY); // Du loco part28
		bodyModel[161] = new ModelRendererTurbo(this, 304, 332, textureX, textureY); // Du loco part19
		bodyModel[162] = new ModelRendererTurbo(this, 348, 332, textureX, textureY); // Du loco part19
		bodyModel[163] = new ModelRendererTurbo(this, 313, 347, textureX, textureY); // Du loco part19
		bodyModel[164] = new ModelRendererTurbo(this, 333, 308, textureX, textureY); // Du loco part19
		bodyModel[165] = new ModelRendererTurbo(this, 388, 331, textureX, textureY); // Du loco part19
		bodyModel[166] = new ModelRendererTurbo(this, 296, 331, textureX, textureY); // Du loco part19
		bodyModel[167] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part28
		bodyModel[168] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[169] = new ModelRendererTurbo(this, 451, 25, textureX, textureY, "front_light4"); // Lamp
		bodyModel[170] = new ModelRendererTurbo(this, 132, 36, textureX, textureY, "front_light3"); // Lamp
		bodyModel[171] = new ModelRendererTurbo(this, 451, 25, textureX, textureY, "front_light2"); // Lamp
		bodyModel[172] = new ModelRendererTurbo(this, 132, 36, textureX, textureY, "front_light1"); // Lamp
		bodyModel[173] = new ModelRendererTurbo(this, 451, 25, textureX, textureY, "redback2"); // Lamp
		bodyModel[174] = new ModelRendererTurbo(this, 132, 36, textureX, textureY, "redback1"); // Lamp
		bodyModel[175] = new ModelRendererTurbo(this, 460, 62, textureX, textureY); // Lamp
		bodyModel[176] = new ModelRendererTurbo(this, 445, 62, textureX, textureY); // Lamp
		bodyModel[177] = new ModelRendererTurbo(this, 451, 30, textureX, textureY, "reverse_light3"); // Lamp
		bodyModel[178] = new ModelRendererTurbo(this, 133, 32, textureX, textureY, "reverse_light4"); // Lamp
		bodyModel[179] = new ModelRendererTurbo(this, 451, 30, textureX, textureY, "reverse_light1"); // Lamp
		bodyModel[180] = new ModelRendererTurbo(this, 133, 32, textureX, textureY, "reverse_light2"); // Lamp
		bodyModel[181] = new ModelRendererTurbo(this, 451, 30, textureX, textureY, "redforward2"); // Lamp
		bodyModel[182] = new ModelRendererTurbo(this, 133, 32, textureX, textureY, "redforward1"); // Lamp
		bodyModel[183] = new ModelRendererTurbo(this, 418, 63, textureX, textureY); // Lamp
		bodyModel[184] = new ModelRendererTurbo(this, 403, 63, textureX, textureY); // Lamp
		bodyModel[185] = new ModelRendererTurbo(this, 223, 247, textureX, textureY); // Du loco part41
		bodyModel[186] = new ModelRendererTurbo(this, 223, 247, textureX, textureY); // Du loco part41
		bodyModel[187] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[188] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[189] = new ModelRendererTurbo(this, 247, 233, textureX, textureY); // Du loco part06
		bodyModel[190] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[191] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[192] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[193] = new ModelRendererTurbo(this, 294, 233, textureX, textureY); // Du loco part06
		bodyModel[194] = new ModelRendererTurbo(this, 290, 233, textureX, textureY); // Du loco part06
		bodyModel[195] = new ModelRendererTurbo(this, 289, 233, textureX, textureY); // Du loco part06
		bodyModel[196] = new ModelRendererTurbo(this, 233, 233, textureX, textureY); // Du loco part06
		bodyModel[197] = new ModelRendererTurbo(this, 249, 233, textureX, textureY); // Du loco part06
		bodyModel[198] = new ModelRendererTurbo(this, 248, 233, textureX, textureY); // Du loco part06
		bodyModel[199] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[200] = new ModelRendererTurbo(this, 297, 233, textureX, textureY); // Du loco part06
		bodyModel[201] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[202] = new ModelRendererTurbo(this, 292, 233, textureX, textureY); // Du loco part06
		bodyModel[203] = new ModelRendererTurbo(this, 294, 233, textureX, textureY); // Du loco part06
		bodyModel[204] = new ModelRendererTurbo(this, 281, 233, textureX, textureY); // Du loco part06
		bodyModel[205] = new ModelRendererTurbo(this, 164, 344, textureX, textureY); // Du loco part19
		bodyModel[206] = new ModelRendererTurbo(this, 120, 411, textureX, textureY); // Du loco part19
		bodyModel[207] = new ModelRendererTurbo(this, 160, 356, textureX, textureY); // Du loco part19
		bodyModel[208] = new ModelRendererTurbo(this, 135, 367, textureX, textureY); // Du loco part19
		bodyModel[209] = new ModelRendererTurbo(this, 188, 356, textureX, textureY); // Du loco part19
		bodyModel[210] = new ModelRendererTurbo(this, 135, 367, textureX, textureY); // Du loco part19
		bodyModel[211] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[212] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 138
		bodyModel[213] = new ModelRendererTurbo(this, 12, 1, textureX, textureY); // Box 138
		bodyModel[214] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[215] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[216] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[217] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[218] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[219] = new ModelRendererTurbo(this, 51, 4, textureX, textureY); // Box 138
		bodyModel[220] = new ModelRendererTurbo(this, 165, 395, textureX, textureY); // Du loco part19
		bodyModel[221] = new ModelRendererTurbo(this, 124, 395, textureX, textureY); // Du loco part19
		bodyModel[222] = new ModelRendererTurbo(this, 83, 356, textureX, textureY); // Du loco part41
		bodyModel[223] = new ModelRendererTurbo(this, 80, 351, textureX, textureY); // Du loco part41
		bodyModel[224] = new ModelRendererTurbo(this, 80, 354, textureX, textureY); // Du loco part41
		bodyModel[225] = new ModelRendererTurbo(this, 78, 351, textureX, textureY); // Du loco part41
		bodyModel[226] = new ModelRendererTurbo(this, 85, 350, textureX, textureY); // Du loco part41
		bodyModel[227] = new ModelRendererTurbo(this, 88, 352, textureX, textureY); // Du loco part41
		bodyModel[228] = new ModelRendererTurbo(this, 132, 309, textureX, textureY); // Du loco part28
		bodyModel[229] = new ModelRendererTurbo(this, 105, 311, textureX, textureY); // Du loco part28
		bodyModel[230] = new ModelRendererTurbo(this, 135, 309, textureX, textureY); // Du loco part28
		bodyModel[231] = new ModelRendererTurbo(this, 143, 312, textureX, textureY); // Du loco part28
		bodyModel[232] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[233] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[234] = new ModelRendererTurbo(this, 83, 356, textureX, textureY); // Du loco part41
		bodyModel[235] = new ModelRendererTurbo(this, 80, 351, textureX, textureY); // Du loco part41
		bodyModel[236] = new ModelRendererTurbo(this, 80, 354, textureX, textureY); // Du loco part41
		bodyModel[237] = new ModelRendererTurbo(this, 78, 351, textureX, textureY); // Du loco part41
		bodyModel[238] = new ModelRendererTurbo(this, 85, 350, textureX, textureY); // Du loco part41
		bodyModel[239] = new ModelRendererTurbo(this, 88, 352, textureX, textureY); // Du loco part41
		bodyModel[240] = new ModelRendererTurbo(this, 132, 309, textureX, textureY); // Du loco part28
		bodyModel[241] = new ModelRendererTurbo(this, 105, 311, textureX, textureY); // Du loco part28
		bodyModel[242] = new ModelRendererTurbo(this, 135, 309, textureX, textureY); // Du loco part28
		bodyModel[243] = new ModelRendererTurbo(this, 143, 312, textureX, textureY); // Du loco part28
		bodyModel[244] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[245] = new ModelRendererTurbo(this, 62, 365, textureX, textureY); // Du loco part28
		bodyModel[246] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[247] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[248] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[249] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[250] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[251] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[252] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[253] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[254] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[255] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[256] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[257] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[258] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[259] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[260] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[261] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[262] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[263] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[264] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[265] = new ModelRendererTurbo(this, 1, 344, textureX, textureY); // Du loco part05
		bodyModel[266] = new ModelRendererTurbo(this, 11, 337, textureX, textureY); // Du loco part05
		bodyModel[267] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[268] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[269] = new ModelRendererTurbo(this, 30, 357, textureX, textureY); // Du loco part05
		bodyModel[270] = new ModelRendererTurbo(this, 36, 357, textureX, textureY); // Du loco part05
		bodyModel[271] = new ModelRendererTurbo(this, 218, 361, textureX, textureY); // Du loco part19
		bodyModel[272] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[273] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[274] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[275] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[276] = new ModelRendererTurbo(this, 218, 361, textureX, textureY); // Du loco part19
		bodyModel[277] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[278] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[279] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[280] = new ModelRendererTurbo(this, 11, 340, textureX, textureY); // Du loco part05
		bodyModel[281] = new ModelRendererTurbo(this, 250, 423, textureX, textureY); // Du loco part19
		bodyModel[282] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[283] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[284] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[285] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[286] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[287] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[288] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[289] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[290] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[291] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[292] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[293] = new ModelRendererTurbo(this, 235, 454, textureX, textureY); // Du loco part19
		bodyModel[294] = new ModelRendererTurbo(this, 316, 421, textureX, textureY); // Du loco part19
		bodyModel[295] = new ModelRendererTurbo(this, 235, 454, textureX, textureY); // Du loco part19
		bodyModel[296] = new ModelRendererTurbo(this, 328, 421, textureX, textureY); // Du loco part19
		bodyModel[297] = new ModelRendererTurbo(this, 235, 454, textureX, textureY); // Du loco part19
		bodyModel[298] = new ModelRendererTurbo(this, 316, 421, textureX, textureY); // Du loco part19
		bodyModel[299] = new ModelRendererTurbo(this, 235, 454, textureX, textureY); // Du loco part19
		bodyModel[300] = new ModelRendererTurbo(this, 283, 423, textureX, textureY); // Du loco part19
		bodyModel[301] = new ModelRendererTurbo(this, 351, 379, textureX, textureY); // Du loco part19
		bodyModel[302] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[303] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[304] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[305] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[306] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Du loco part28
		bodyModel[307] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Du loco part28
		bodyModel[308] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[309] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[310] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Du loco part28
		bodyModel[311] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[312] = new ModelRendererTurbo(this, 434, 74, textureX, textureY); // Du loco part28
		bodyModel[313] = new ModelRendererTurbo(this, 98, 241, textureX, textureY); // Du loco part28
		bodyModel[314] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Du loco part28
		bodyModel[315] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Du loco part28
		bodyModel[316] = new ModelRendererTurbo(this, 418, 234, textureX, textureY); // Du loco part28
		bodyModel[317] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Du loco part28
		bodyModel[318] = new ModelRendererTurbo(this, 210, 421, textureX, textureY); // Du loco part19
		bodyModel[319] = new ModelRendererTurbo(this, 45, 349, textureX, textureY); // Du loco part05
		bodyModel[320] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[321] = new ModelRendererTurbo(this, 30, 357, textureX, textureY); // Du loco part05
		bodyModel[322] = new ModelRendererTurbo(this, 36, 357, textureX, textureY); // Du loco part05
		bodyModel[323] = new ModelRendererTurbo(this, 43, 349, textureX, textureY); // Du loco part05
		bodyModel[324] = new ModelRendererTurbo(this, 347, 380, textureX, textureY); // Du loco part19
		bodyModel[325] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[326] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[327] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[328] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[329] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[330] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[331] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[332] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[333] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[334] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[335] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[336] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[337] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[338] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[339] = new ModelRendererTurbo(this, 42, 351, textureX, textureY); // Du loco part05
		bodyModel[340] = new ModelRendererTurbo(this, 43, 352, textureX, textureY); // Du loco part05
		bodyModel[341] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[342] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[343] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[344] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[345] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[346] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[347] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[348] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[349] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[350] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[351] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[352] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[353] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[354] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[355] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[356] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[357] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[358] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[359] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[360] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[361] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[362] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[363] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[364] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[365] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[366] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[367] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[368] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[369] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[370] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[371] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[372] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[373] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[374] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[375] = new ModelRendererTurbo(this, 479, 506, textureX, textureY); // Box 0
		bodyModel[376] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[377] = new ModelRendererTurbo(this, 479, 503, textureX, textureY); // Box 0
		bodyModel[378] = new ModelRendererTurbo(this, 488, 506, textureX, textureY); // Box 0
		bodyModel[379] = new ModelRendererTurbo(this, 488, 503, textureX, textureY); // Box 0
		bodyModel[380] = new ModelRendererTurbo(this, 498, 475, textureX, textureY); // Box 0
		bodyModel[381] = new ModelRendererTurbo(this, 503, 475, textureX, textureY); // Box 0
		bodyModel[382] = new ModelRendererTurbo(this, 503, 484, textureX, textureY); // Box 0
		bodyModel[383] = new ModelRendererTurbo(this, 498, 493, textureX, textureY); // Box 0
		bodyModel[384] = new ModelRendererTurbo(this, 498, 481, textureX, textureY); // Box 0
		bodyModel[385] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[386] = new ModelRendererTurbo(this, 498, 497, textureX, textureY); // Box 0
		bodyModel[387] = new ModelRendererTurbo(this, 498, 487, textureX, textureY); // Box 0
		bodyModel[388] = new ModelRendererTurbo(this, 503, 481, textureX, textureY); // Box 0
		bodyModel[389] = new ModelRendererTurbo(this, 498, 484, textureX, textureY); // Box 0
		bodyModel[390] = new ModelRendererTurbo(this, 503, 478, textureX, textureY); // Box 0
		bodyModel[391] = new ModelRendererTurbo(this, 503, 487, textureX, textureY); // Box 0
		bodyModel[392] = new ModelRendererTurbo(this, 505, 493, textureX, textureY); // Box 0
		bodyModel[393] = new ModelRendererTurbo(this, 498, 478, textureX, textureY); // Box 0
		bodyModel[394] = new ModelRendererTurbo(this, 479, 488, textureX, textureY); // Box 0
		bodyModel[395] = new ModelRendererTurbo(this, 479, 478, textureX, textureY); // Box 0
		bodyModel[396] = new ModelRendererTurbo(this, 479, 483, textureX, textureY); // Box 0
		bodyModel[397] = new ModelRendererTurbo(this, 479, 498, textureX, textureY); // Box 0
		bodyModel[398] = new ModelRendererTurbo(this, 479, 493, textureX, textureY); // Box 0
		bodyModel[399] = new ModelRendererTurbo(this, 488, 488, textureX, textureY); // Box 0
		bodyModel[400] = new ModelRendererTurbo(this, 488, 478, textureX, textureY); // Box 0
		bodyModel[401] = new ModelRendererTurbo(this, 488, 483, textureX, textureY); // Box 0
		bodyModel[402] = new ModelRendererTurbo(this, 488, 498, textureX, textureY); // Box 0
		bodyModel[403] = new ModelRendererTurbo(this, 488, 493, textureX, textureY); // Box 0
		bodyModel[404] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[405] = new ModelRendererTurbo(this, 481, 475, textureX, textureY); // Box 0
		bodyModel[406] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[407] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0
		bodyModel[408] = new ModelRendererTurbo(this, 490, 475, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 52, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Du loco part01
		bodyModel[0].setRotationPoint(13F, -7F, -6F);

		bodyModel[1].addBox(0F, 0F, 0F, 68, 1, 22, 0F); // Du loco part03
		bodyModel[1].setRotationPoint(4F, -12F, -11F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 96, 8, 0, 0F,0F, -4F, 0F, -48F, -4F, 0F, -48F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -48F, 0F, 0F, -48F, 0F, 0F, 0F, 0F, 0F); // Du loco part17
		bodyModel[2].setRotationPoint(15F, -15F, -6.15F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 96, 8, 0, 0F,0F, -4F, 0F, -48F, -4F, 0F, -48F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -48F, 0F, 0F, -48F, 0F, 0F, 0F, 0F, 0F); // Du loco part27
		bodyModel[3].setRotationPoint(15F, -15F, 6.15F);

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
		bodyModel[14].setRotationPoint(5F, -15F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[15].setRotationPoint(5F, -13F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[16].setRotationPoint(45F, -22F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 194
		bodyModel[17].setRotationPoint(44F, -21F, -4F);
		bodyModel[17].rotateAngleY = -1.57079633F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[18].setRotationPoint(43F, -21F, -4F);
		bodyModel[18].rotateAngleY = -1.57079633F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 19, 8, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 138
		bodyModel[19].setRotationPoint(14F, -20F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[20].setRotationPoint(12F, -11F, 6.05F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[21].setRotationPoint(-1F, -11F, 6.05F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[22].setRotationPoint(-12F, -11F, 6.05F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[23].setRotationPoint(-24F, -11F, 6.05F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[24].setRotationPoint(12F, -11F, -6.05F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[25].setRotationPoint(-1F, -11F, -6.05F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[26].setRotationPoint(-12F, -11F, -6.05F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[27].setRotationPoint(-24F, -11F, -6.05F);

		bodyModel[28].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[28].setRotationPoint(5F, -11F, 10F);

		bodyModel[29].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[29].setRotationPoint(8F, -11F, 10F);

		bodyModel[30].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[30].setRotationPoint(5F, -8F, 10F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[31].setRotationPoint(4F, -16F, 10F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[32].setRotationPoint(54F, -23F, 10F);

		bodyModel[33].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[33].setRotationPoint(67F, -11F, -11F);

		bodyModel[34].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[34].setRotationPoint(70F, -11F, -11F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[35].setRotationPoint(55F, -11F, 10F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[36].setRotationPoint(58F, -11F, 10F);

		bodyModel[37].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[37].setRotationPoint(67F, -8F, -11F);

		bodyModel[38].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[38].setRotationPoint(55F, -8F, 10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[39].setRotationPoint(5F, -25F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 156
		bodyModel[40].setRotationPoint(5F, -25F, 5F);

		bodyModel[41].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[41].setRotationPoint(4.75F, -27F, -5.75F);

		bodyModel[42].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[42].setRotationPoint(5.25F, -27F, -6.25F);

		bodyModel[43].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 154
		bodyModel[43].setRotationPoint(4.75F, -27F, 5.75F);

		bodyModel[44].addBox(0F, 0F, 0F, 0, 2, 1, 0F); // Box 154
		bodyModel[44].setRotationPoint(5.25F, -27F, 5.25F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[45].setRotationPoint(0F, -23F, 11.05F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 50, 50, 0, 0F,-40F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -40F, 0F, 0F, -40F, -40F, 0F, 0F, -40F, 0F, 0F, -40F, 0F, -40F, -40F, 0F); // Du loco part23
		bodyModel[46].setRotationPoint(0F, -23F, -11.05F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[47].setRotationPoint(4F, -11F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[48].setRotationPoint(7F, -19F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[49].setRotationPoint(7F, -18.25F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[50].setRotationPoint(7F, -17.5F, -6F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[51].setRotationPoint(7F, -16.75F, -6F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[52].setRotationPoint(7F, -16F, -6F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[53].setRotationPoint(7F, -15.25F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[54].setRotationPoint(7F, -14.5F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[55].setRotationPoint(7F, -13.75F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[56].setRotationPoint(7F, -23.5F, -6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[57].setRotationPoint(7F, -22.75F, -6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[58].setRotationPoint(7F, -19F, 5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[59].setRotationPoint(7F, -18.25F, 5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[60].setRotationPoint(7F, -17.5F, 5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[61].setRotationPoint(7F, -16.75F, 5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[62].setRotationPoint(7F, -16F, 5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[63].setRotationPoint(7F, -15.25F, 5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[64].setRotationPoint(7F, -14.5F, 5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[65].setRotationPoint(7F, -13.75F, 5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[66].setRotationPoint(7F, -23.5F, 5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[67].setRotationPoint(7F, -22.75F, 5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[68].setRotationPoint(4F, -7F, -11F);

		bodyModel[69].addBox(0F, 0F, 0F, 66, 4, 12, 0F); // Du loco part01
		bodyModel[69].setRotationPoint(5F, -11F, -6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 14, 6, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[70].setRotationPoint(38F, -18F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[71].setRotationPoint(38F, -26F, -11F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 14, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[72].setRotationPoint(38F, -26F, 10F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[73].setRotationPoint(37F, -26F, -7F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 14, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[74].setRotationPoint(52F, -26F, -7F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part19
		bodyModel[75].setRotationPoint(38F, -32F, -11F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[76].setRotationPoint(5F, -15F, 5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[77].setRotationPoint(5F, -13F, 5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[78].setRotationPoint(70F, -15F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[79].setRotationPoint(70F, -13F, -7F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[80].setRotationPoint(70F, -15F, 5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[81].setRotationPoint(70F, -13F, 5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,-2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[82].setRotationPoint(37F, -32F, -11F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,-3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[83].setRotationPoint(34F, -36F, -1F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -1.75F, 0F, -0.25F, -1.75F); // Du loco part05
		bodyModel[84].setRotationPoint(38F, -31F, -10F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[85].setRotationPoint(37F, -27F, -10F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, -0.75F, -0.25F, -1F); // Du loco part05
		bodyModel[86].setRotationPoint(44F, -31F, -11F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[87].setRotationPoint(57F, -22F, -6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[88].setRotationPoint(57F, -21.25F, -6F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[89].setRotationPoint(57F, -20.5F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[90].setRotationPoint(57F, -19.75F, -6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[91].setRotationPoint(57F, -19F, -6F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[92].setRotationPoint(57F, -18.25F, -6F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[93].setRotationPoint(57F, -17.5F, -6F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[94].setRotationPoint(57F, -16.75F, -6F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[95].setRotationPoint(57F, -23.5F, -6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[96].setRotationPoint(57F, -22.75F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[97].setRotationPoint(63F, -22F, -6F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[98].setRotationPoint(63F, -21.25F, -6F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[99].setRotationPoint(63F, -20.5F, -6F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[100].setRotationPoint(63F, -19.75F, -6F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[101].setRotationPoint(63F, -19F, -6F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[102].setRotationPoint(63F, -18.25F, -6F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[103].setRotationPoint(63F, -17.5F, -6F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[104].setRotationPoint(63F, -16.75F, -6F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[105].setRotationPoint(63F, -23.5F, -6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[106].setRotationPoint(63F, -22.75F, -6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,-3F, 0F, -2F, -3F, 0F, -2F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[107].setRotationPoint(38F, -33F, -10F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[108].setRotationPoint(38F, -33F, 7F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[109].setRotationPoint(57F, -16F, 5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[110].setRotationPoint(57F, -24F, 5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[111].setRotationPoint(57F, -22F, 5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[112].setRotationPoint(57F, -21.25F, 5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[113].setRotationPoint(57F, -20.5F, 5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[114].setRotationPoint(57F, -19.75F, 5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[115].setRotationPoint(57F, -19F, 5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[116].setRotationPoint(57F, -18.25F, 5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[117].setRotationPoint(57F, -17.5F, 5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[118].setRotationPoint(57F, -16.75F, 5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[119].setRotationPoint(57F, -23.5F, 5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[120].setRotationPoint(57F, -22.75F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[121].setRotationPoint(63F, -22F, 5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[122].setRotationPoint(63F, -21.25F, 5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[123].setRotationPoint(63F, -20.5F, 5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[124].setRotationPoint(63F, -19.75F, 5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[125].setRotationPoint(63F, -19F, 5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[126].setRotationPoint(63F, -18.25F, 5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[127].setRotationPoint(63F, -17.5F, 5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[128].setRotationPoint(63F, -16.75F, 5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[129].setRotationPoint(63F, -23.5F, 5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[130].setRotationPoint(63F, -22.75F, 5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Du loco part05
		bodyModel[131].setRotationPoint(5F, -23F, -5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[132].setRotationPoint(5F, -23F, 4F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[133].setRotationPoint(5F, -12.25F, -5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[134].setRotationPoint(5F, -24F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[135].setRotationPoint(5F, -22F, -5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[136].setRotationPoint(5F, -21.25F, -5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[137].setRotationPoint(5F, -20.5F, -5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[138].setRotationPoint(5F, -19.75F, -5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[139].setRotationPoint(5F, -19F, -5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[140].setRotationPoint(5F, -13F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[141].setRotationPoint(5F, -23.5F, -5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[142].setRotationPoint(5F, -22.75F, -5F);

		bodyModel[143].addBox(0F, 0F, 0F, 5, 1, 10, 0F); // Du loco part19
		bodyModel[143].setRotationPoint(32F, -25F, -5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[144].setRotationPoint(5F, -24F, -5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[145].setRotationPoint(5F, -18.25F, -5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[146].setRotationPoint(5F, -17.5F, -5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[147].setRotationPoint(5F, -16.75F, -5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[148].setRotationPoint(5F, -16F, -5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[149].setRotationPoint(5F, -15.25F, -5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[150].setRotationPoint(5F, -14.5F, -5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[151].setRotationPoint(5F, -13.75F, -5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[152].setRotationPoint(31F, -20F, 10F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[153].setRotationPoint(5F, -25F, 5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,-1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[154].setRotationPoint(5F, -25F, -6F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 6, 10, 1, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part19
		bodyModel[155].setRotationPoint(34F, -36F, 0F);

		bodyModel[156].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Du loco part28
		bodyModel[156].setRotationPoint(32F, -20F, 10F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[157].setRotationPoint(31F, -20F, -11F);

		bodyModel[158].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Du loco part28
		bodyModel[158].setRotationPoint(32F, -20F, -11F);

		bodyModel[159].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[159].setRotationPoint(4F, -16F, 9F);

		bodyModel[160].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Du loco part28
		bodyModel[160].setRotationPoint(52F, -23F, 10F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 17, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[161].setRotationPoint(53F, -25F, -6F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 17, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[162].setRotationPoint(53F, -25F, 5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 18, 1, 10, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[163].setRotationPoint(53F, -25F, -5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 12, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[164].setRotationPoint(70F, -24F, -5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[165].setRotationPoint(70F, -25F, 5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 13, 1, 0F,0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[166].setRotationPoint(70F, -25F, -6F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[167].setRotationPoint(71F, -16F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[168].setRotationPoint(71F, -16F, -10F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[169].setRotationPoint(4.95F, -14F, 5F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[170].setRotationPoint(4.95F, -13F, 5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[171].setRotationPoint(4.95F, -14F, -7F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[172].setRotationPoint(4.95F, -13F, -7F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[173].setRotationPoint(4.95F, -26F, -1F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[174].setRotationPoint(4.95F, -25F, -1F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[175].setRotationPoint(5F, -26F, -1F);

		bodyModel[176].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Lamp
		bodyModel[176].setRotationPoint(5F, -25F, -1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[177].setRotationPoint(71.05F, -14F, 5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[178].setRotationPoint(71.05F, -13F, 5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[179].setRotationPoint(71.05F, -14F, -7F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[180].setRotationPoint(71.05F, -13F, -7F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[181].setRotationPoint(71.05F, -26F, -1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 0, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Lamp
		bodyModel[182].setRotationPoint(71.05F, -25F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[183].setRotationPoint(70F, -26F, -1F);

		bodyModel[184].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Lamp
		bodyModel[184].setRotationPoint(70F, -25F, -1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 1, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[185].setRotationPoint(71F, -11F, -11F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[186].setRotationPoint(71F, -7F, -11F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[187].setRotationPoint(54F, -11F, -11F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[188].setRotationPoint(61F, -9F, -11F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[189].setRotationPoint(53F, -9F, -11F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[190].setRotationPoint(54F, -9F, -11F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[191].setRotationPoint(61F, -11F, -11F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[192].setRotationPoint(53F, -11F, -11F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[193].setRotationPoint(53F, -10F, -11F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[194].setRotationPoint(61F, -10F, -11F);

		bodyModel[195].addBox(0F, 0F, 0F, 7, 1, 3, 0F); // Du loco part06
		bodyModel[195].setRotationPoint(54F, -10F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part06
		bodyModel[196].setRotationPoint(9F, -11F, -11F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[197].setRotationPoint(20F, -9F, -11F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Du loco part06
		bodyModel[198].setRotationPoint(8F, -9F, -11F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part06
		bodyModel[199].setRotationPoint(9F, -9F, -11F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[200].setRotationPoint(20F, -11F, -11F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[201].setRotationPoint(8F, -11F, -11F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part06
		bodyModel[202].setRotationPoint(8F, -10F, -11F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part06
		bodyModel[203].setRotationPoint(20F, -10F, -11F);

		bodyModel[204].addBox(0F, 0F, 0F, 11, 1, 3, 0F); // Du loco part06
		bodyModel[204].setRotationPoint(9F, -10F, -11F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 11, 1, 10, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[205].setRotationPoint(5F, -25F, -5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 31, 1, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[206].setRotationPoint(6F, -26F, -1F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[207].setRotationPoint(6F, -25F, -6F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[208].setRotationPoint(32F, -25F, -6F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 10, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[209].setRotationPoint(6F, -25F, 5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[210].setRotationPoint(32F, -25F, 5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[211].setRotationPoint(30F, -21F, -4F);

		bodyModel[212].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 138
		bodyModel[212].setRotationPoint(13.5F, -20.25F, 3F);

		bodyModel[213].addBox(0F, 0F, 0F, 20, 2, 2, 0F); // Box 138
		bodyModel[213].setRotationPoint(13.5F, -20.25F, -5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[214].setRotationPoint(27.5F, -21F, -4F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[215].setRotationPoint(25F, -21F, -4F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[216].setRotationPoint(22.5F, -21F, -4F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[217].setRotationPoint(20F, -21F, -4F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[218].setRotationPoint(17.5F, -21F, -4F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 2, 1, 8, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[219].setRotationPoint(15F, -21F, -4F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 0, 22, 20, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -10F, 0F, 0.125F, -10F, 0F, -11.125F, 0F, 0F, -11.125F, 0F, 0F, -11.125F, -10F, 0F, -11.125F, -10F); // Du loco part19
		bodyModel[220].setRotationPoint(4.95F, -23F, -5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 0, 22, 20, 0F,0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, -10F, 0F, 0.125F, -10F, 0F, -11.125F, 0F, 0F, -11.125F, 0F, 0F, -11.125F, -10F, 0F, -11.125F, -10F); // Du loco part19
		bodyModel[221].setRotationPoint(71.05F, -23F, -5F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -2.875F, -1F, -1F, -2F, -1F, -1F, -4.875F, 0F, -1F, 0F, 0F, -1F); // Du loco part41
		bodyModel[222].setRotationPoint(2F, -3F, -9F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[223].setRotationPoint(2F, -5F, -9F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 0F, -1F, 0F, 0F, -1F, -4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[224].setRotationPoint(2F, -6F, -9F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, -1F, -4.875F, 0F, -1F, -2F, -1F, -1F, -2.875F, -1F, -1F); // Du loco part41
		bodyModel[225].setRotationPoint(2F, -3F, 2F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[226].setRotationPoint(2F, -5F, 2F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, -1F, -4.875F, 0F, -1F, -1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F); // Du loco part41
		bodyModel[227].setRotationPoint(2F, -6F, 2F);

		bodyModel[228].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[228].setRotationPoint(6F, -4F, 6F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[229].setRotationPoint(6F, -7F, 4F);

		bodyModel[230].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[230].setRotationPoint(6F, -4F, -7F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part28
		bodyModel[231].setRotationPoint(6F, -7F, -7F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F); // Du loco part28
		bodyModel[232].setRotationPoint(5F, -4F, -7F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F); // Du loco part28
		bodyModel[233].setRotationPoint(5F, -4F, 6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, -2F, -1F, -1F, -2.875F, -1F, -1F, 0F, 0F, -1F, -4.875F, 0F, -1F); // Du loco part41
		bodyModel[234].setRotationPoint(69F, -3F, -9F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0F, 0F, -4.875F, 0F, 0F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[235].setRotationPoint(69F, -5F, -9F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-1F, 0F, 0F, -3.875F, 0F, 0F, 0F, 0F, -1F, -4.875F, 0F, -1F, 0F, -1F, 0F, -4.875F, -1F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F); // Du loco part41
		bodyModel[236].setRotationPoint(69F, -6F, -9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, -1F, 0F, 0F, -1F, -2.875F, -1F, -1F, -2F, -1F, -1F); // Du loco part41
		bodyModel[237].setRotationPoint(69F, -3F, 2F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, -1F, 0F, 0F, -1F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F); // Du loco part41
		bodyModel[238].setRotationPoint(69F, -5F, 2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,-4.875F, 0F, -1F, 0F, 0F, -1F, -3.875F, 0F, 0F, -1F, 0F, 0F, -4.875F, 0F, 0F, 0F, 0F, 0F, -4.875F, -1F, 0F, 0F, -1F, 0F); // Du loco part41
		bodyModel[239].setRotationPoint(69F, -6F, 2F);

		bodyModel[240].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[240].setRotationPoint(68F, -4F, 6F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[241].setRotationPoint(68F, -7F, 4F);

		bodyModel[242].addBox(0F, 0F, 0F, 2, 2, 1, 0F); // Du loco part28
		bodyModel[242].setRotationPoint(68F, -4F, -7F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F); // Du loco part28
		bodyModel[243].setRotationPoint(68F, -7F, -7F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.625F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[244].setRotationPoint(70F, -4F, -7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -0.625F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[245].setRotationPoint(70F, -4F, 6F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[246].setRotationPoint(6F, -23F, 5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[247].setRotationPoint(11F, -23F, 5F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[248].setRotationPoint(7F, -13F, 5F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[249].setRotationPoint(7F, -24F, 5F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[250].setRotationPoint(56F, -23F, 5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[251].setRotationPoint(60F, -23F, 5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F); // Du loco part05
		bodyModel[252].setRotationPoint(62F, -23F, 5F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[253].setRotationPoint(66F, -23F, 5F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F); // Du loco part05
		bodyModel[254].setRotationPoint(63F, -16F, 5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Du loco part05
		bodyModel[255].setRotationPoint(63F, -24F, 5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[256].setRotationPoint(57F, -16F, -6F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[257].setRotationPoint(57F, -24F, -6F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[258].setRotationPoint(56F, -23F, -6F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[259].setRotationPoint(60F, -23F, -6F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[260].setRotationPoint(62F, -23F, -6F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[261].setRotationPoint(66F, -23F, -6F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[262].setRotationPoint(63F, -16F, -6F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[263].setRotationPoint(63F, -24F, -6F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, -0.75F, 0F, 0F); // Du loco part05
		bodyModel[264].setRotationPoint(6F, -23F, -6F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[265].setRotationPoint(11F, -23F, -6F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[266].setRotationPoint(7F, -13F, -6F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0.1F, 0F, -0.75F, 0.1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[267].setRotationPoint(7F, -24F, -6F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-1F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F, -1.75F, -0.25F, -1F, 0F, -0.25F, -1F); // Du loco part05
		bodyModel[268].setRotationPoint(39.5F, -31F, -11F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[269].setRotationPoint(39.5F, -27F, -11F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[270].setRotationPoint(40.5F, -31F, -10.25F);

		bodyModel[271].addBox(0F, 0F, 0F, 16, 3, 1, 0F); // Du loco part19
		bodyModel[271].setRotationPoint(16F, -15F, 5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[272].setRotationPoint(7F, -21.25F, 5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[273].setRotationPoint(7F, -20.5F, 5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[274].setRotationPoint(7F, -19.75F, 5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[275].setRotationPoint(7F, -22F, 5F);

		bodyModel[276].addBox(0F, 0F, 0F, 16, 3, 1, 0F); // Du loco part19
		bodyModel[276].setRotationPoint(16F, -15F, -6F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[277].setRotationPoint(7F, -22F, -6F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[278].setRotationPoint(7F, -21.25F, -6F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[279].setRotationPoint(7F, -20.5F, -6F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Du loco part05
		bodyModel[280].setRotationPoint(7F, -19.75F, -6F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[281].setRotationPoint(37F, -32F, -7F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.75F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -1.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, -1.75F, -0.25F, -1F); // Du loco part05
		bodyModel[282].setRotationPoint(48.5F, -31F, -11F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.75F, 0.25F, -0.5F, -0.75F, 0.25F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[283].setRotationPoint(37.75F, -31F, -9F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[284].setRotationPoint(37F, -31F, -8F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[285].setRotationPoint(37F, -31F, -6F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[286].setRotationPoint(38F, -31F, -6F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[287].setRotationPoint(37F, -27F, -6F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[288].setRotationPoint(37F, -31F, -2F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[289].setRotationPoint(37F, -31F, 1F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[290].setRotationPoint(38F, -31F, 1F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[291].setRotationPoint(37F, -27F, 1F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[292].setRotationPoint(37F, -31F, 5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[293].setRotationPoint(37F, -26F, -11F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[294].setRotationPoint(37F, -32F, 7F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[295].setRotationPoint(37F, -26F, 7F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, -1F, -2F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[296].setRotationPoint(51F, -32F, -11F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[297].setRotationPoint(52F, -26F, -11F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[298].setRotationPoint(51F, -32F, 7F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[299].setRotationPoint(52F, -26F, 7F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 2, 6, 14, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part19
		bodyModel[300].setRotationPoint(51F, -32F, -7F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F,-2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[301].setRotationPoint(38F, -34F, -7F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.5F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -1.75F, -1F, -0.25F, -1.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[302].setRotationPoint(38F, -31F, 8F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Du loco part05
		bodyModel[303].setRotationPoint(37F, -27F, 7F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Du loco part05
		bodyModel[304].setRotationPoint(37.75F, -31F, 7F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[305].setRotationPoint(37F, -31F, 7F);

		bodyModel[306].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[306].setRotationPoint(28F, -11F, -11F);

		bodyModel[307].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // Du loco part28
		bodyModel[307].setRotationPoint(31F, -11F, -11F);

		bodyModel[308].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[308].setRotationPoint(28F, -8F, -11F);

		bodyModel[309].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[309].setRotationPoint(28F, -5F, -11F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[310].setRotationPoint(9F, -16F, 10F);

		bodyModel[311].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[311].setRotationPoint(9F, -16F, 9F);

		bodyModel[312].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[312].setRotationPoint(5F, -5F, 10F);

		bodyModel[313].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[313].setRotationPoint(55F, -5F, 10F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[314].setRotationPoint(66F, -16F, -11F);

		bodyModel[315].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Du loco part28
		bodyModel[315].setRotationPoint(66F, -16F, -10F);

		bodyModel[316].addBox(0F, 0F, 0F, 4, 0, 1, 0F); // Du loco part28
		bodyModel[316].setRotationPoint(67F, -5F, -11F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[317].setRotationPoint(59F, -20F, 10F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 14, 6, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[318].setRotationPoint(38F, -32F, 9F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,-0.75F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Du loco part05
		bodyModel[319].setRotationPoint(44F, -31F, 9F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-1F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, 0F, -0.25F, -1F, -1.75F, -0.25F, -1F, -1.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[320].setRotationPoint(39.5F, -31F, 9F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[321].setRotationPoint(39.5F, -27F, 10F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 9, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[322].setRotationPoint(40.5F, -31F, 9.25F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.75F, -0.25F, -0.25F, -1F, -0.25F, -0.25F, -1F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -1.75F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, -1.75F, -0.25F, 0F); // Du loco part05
		bodyModel[323].setRotationPoint(48.5F, -31F, 9F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 14, 2, 7, 0F,-2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[324].setRotationPoint(38F, -34F, 0F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0.25F, -0.25F, -0.75F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, -1F, 0.25F, -0.25F, -1F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.75F, -1F, -0.25F, -1.75F); // Du loco part05
		bodyModel[325].setRotationPoint(51F, -31F, -10F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[326].setRotationPoint(52F, -27F, -10F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, 0.25F, -0.75F, 0F, 0.25F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F); // Du loco part05
		bodyModel[327].setRotationPoint(50.25F, -31F, -9F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.25F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Du loco part05
		bodyModel[328].setRotationPoint(51F, -31F, -8F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F); // Du loco part05
		bodyModel[329].setRotationPoint(51F, -31F, -6F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[330].setRotationPoint(51F, -31F, -6F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[331].setRotationPoint(52F, -27F, -6F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Du loco part05
		bodyModel[332].setRotationPoint(51F, -31F, -2F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F); // Du loco part05
		bodyModel[333].setRotationPoint(51F, -31F, 1F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[334].setRotationPoint(51F, -31F, 1F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[335].setRotationPoint(52F, -27F, 1F);

		bodyModel[336].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Du loco part05
		bodyModel[336].setRotationPoint(51F, -31F, 5F);

		bodyModel[337].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, -1F, -0.25F, -1.75F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0F, -1F, -0.25F, 0F); // Du loco part05
		bodyModel[337].setRotationPoint(51F, -31F, 8F);

		bodyModel[338].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[338].setRotationPoint(52F, -27F, 7F);

		bodyModel[339].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0.25F, -0.75F, -0.75F, 0.25F); // Du loco part05
		bodyModel[339].setRotationPoint(50.25F, -31F, 7F);

		bodyModel[340].addShapeBox(0F, 0F, 0F, 2, 5, 1, 0F,-0.25F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -1F, -0.25F, -0.75F); // Du loco part05
		bodyModel[340].setRotationPoint(51F, -31F, 7F);

		bodyModel[341].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[341].setRotationPoint(3F, -9.25F, 4.43F);

		bodyModel[342].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[342].setRotationPoint(3.25F, -9F, 4.9F);

		bodyModel[343].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[343].setRotationPoint(0.5F, -8.75F, 5.15F);

		bodyModel[344].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -0.875F, 0F, -0.75F, -0.875F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, -0.875F, -0.25F, -0.75F); // Box 0
		bodyModel[344].setRotationPoint(3F, -9.25F, -6.63F);

		bodyModel[345].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[345].setRotationPoint(0.5F, -8.75F, -5.88F);

		bodyModel[346].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F); // Box 0
		bodyModel[346].setRotationPoint(3F, -8.75F, 0F);

		bodyModel[347].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F); // Box 0
		bodyModel[347].setRotationPoint(3F, -8.75F, -1F);

		bodyModel[348].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[348].setRotationPoint(3.5F, -8.5F, -0.25F);

		bodyModel[349].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F); // Box 0
		bodyModel[349].setRotationPoint(1.5F, -7F, -0.25F);

		bodyModel[350].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F, 0F, -0.375F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, -0.375F, -0.5F); // Box 0
		bodyModel[350].setRotationPoint(2.5F, -8.75F, -0.25F);

		bodyModel[351].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[351].setRotationPoint(1.5F, -8.5F, 0F);

		bodyModel[352].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-2F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.5F, -2F, 0F, -0.5F, 0F, 0F, -0.25F, -2.75F, 0F, -0.25F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 0
		bodyModel[352].setRotationPoint(1.5F, -8.5F, -0.75F);

		bodyModel[353].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[353].setRotationPoint(3F, -8.75F, 0.25F);

		bodyModel[354].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[354].setRotationPoint(3F, -8.5F, -0.25F);

		bodyModel[355].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[355].setRotationPoint(3F, -9F, -0.5F);

		bodyModel[356].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F); // Box 0
		bodyModel[356].setRotationPoint(3F, -6F, -0.5F);

		bodyModel[357].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.125F, 0F, -0.25F, -0.625F, 0F, -0.25F, -0.625F, 0F, -0.5F, -0.125F, 0F, -0.5F, -0.125F, -0.75F, -0.25F, -0.625F, -0.75F, -0.25F, -0.625F, -0.75F, -0.5F, -0.125F, -0.75F, -0.5F); // Box 0
		bodyModel[357].setRotationPoint(3F, -8.75F, -1F);

		bodyModel[358].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F); // Box 0
		bodyModel[358].setRotationPoint(1.5F, -6F, -0.5F);

		bodyModel[359].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F); // Box 0
		bodyModel[359].setRotationPoint(1.5F, -5.25F, -0.5F);

		bodyModel[360].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[360].setRotationPoint(-0.5F, -8.87F, 4.03F);

		bodyModel[361].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[361].setRotationPoint(-0.5F, -9.87F, 4.03F);

		bodyModel[362].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[362].setRotationPoint(-0.5F, -9.37F, 4.03F);

		bodyModel[363].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[363].setRotationPoint(-0.5F, -7.87F, 4.03F);

		bodyModel[364].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[364].setRotationPoint(-0.5F, -8.37F, 4.03F);

		bodyModel[365].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 0
		bodyModel[365].setRotationPoint(-0.5F, -8.87F, -7.03F);

		bodyModel[366].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F); // Box 0
		bodyModel[366].setRotationPoint(-0.5F, -9.87F, -7.03F);

		bodyModel[367].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 0
		bodyModel[367].setRotationPoint(-0.5F, -9.37F, -7.03F);

		bodyModel[368].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, -1F); // Box 0
		bodyModel[368].setRotationPoint(-0.5F, -7.87F, -7.03F);

		bodyModel[369].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F); // Box 0
		bodyModel[369].setRotationPoint(-0.5F, -8.37F, -7.03F);

		bodyModel[370].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[370].setRotationPoint(3.25F, -9.5F, 4.9F);

		bodyModel[371].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[371].setRotationPoint(3.25F, -8.25F, 4.9F);

		bodyModel[372].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.375F, -0.25F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, 1.75F, -0.375F, 0F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[372].setRotationPoint(3.25F, -9F, -6.13F);

		bodyModel[373].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F, 1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F); // Box 0
		bodyModel[373].setRotationPoint(3.25F, -9.5F, -6.13F);

		bodyModel[374].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,1.75F, -0.125F, -0.25F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, 1.75F, -0.125F, 0F, 1.75F, -0.75F, -0.375F, -0.375F, -0.5F, -0.25F, -0.375F, -0.5F, 0F, 1.75F, -0.75F, -0.125F); // Box 0
		bodyModel[374].setRotationPoint(3.25F, -8.25F, -6.13F);

		bodyModel[375].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[375].setRotationPoint(72F, -9.25F, 4.43F);

		bodyModel[376].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[376].setRotationPoint(71.75F, -9F, 4.9F);

		bodyModel[377].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[377].setRotationPoint(72.5F, -8.75F, 5.15F);

		bodyModel[378].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.875F, -0.25F, 0F, -0.875F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Box 0
		bodyModel[378].setRotationPoint(72F, -9.25F, -6.63F);

		bodyModel[379].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.125F, -0.125F, 0F, -0.125F, -0.125F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F); // Box 0
		bodyModel[379].setRotationPoint(72.5F, -8.75F, -5.88F);

		bodyModel[380].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F, 0F, 0F, 0F, -0.875F, 0F, 0F, -0.875F, -0.375F, 0F, 0F, -0.375F, 0F); // Box 0
		bodyModel[380].setRotationPoint(72F, -8.75F, 0F);

		bodyModel[381].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, 0F, -0.875F, -0.375F, 0F, -0.875F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[381].setRotationPoint(72F, -8.75F, -1F);

		bodyModel[382].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 0
		bodyModel[382].setRotationPoint(71.5F, -8.5F, -0.25F);

		bodyModel[383].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 0
		bodyModel[383].setRotationPoint(72.5F, -7F, -0.25F);

		bodyModel[384].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.375F, 0F, 0F, -0.375F, -0.5F, -0.5F, 0F, -0.5F); // Box 0
		bodyModel[384].setRotationPoint(72.5F, -8.75F, -0.25F);

		bodyModel[385].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[385].setRotationPoint(71.5F, -8.5F, 0F);

		bodyModel[386].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,-0.75F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, -0.5F, -0.75F, 0F, -0.5F, -2.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Box 0
		bodyModel[386].setRotationPoint(71.5F, -8.5F, -0.75F);

		bodyModel[387].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[387].setRotationPoint(72F, -8.75F, 0.25F);

		bodyModel[388].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F); // Box 0
		bodyModel[388].setRotationPoint(72F, -8.5F, -0.25F);

		bodyModel[389].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[389].setRotationPoint(72F, -9F, -0.5F);

		bodyModel[390].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, -0.625F, -0.375F, 0F); // Box 0
		bodyModel[390].setRotationPoint(72F, -6F, -0.5F);

		bodyModel[391].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.625F, 0F, -0.25F, -0.125F, 0F, -0.25F, -0.125F, 0F, -0.5F, -0.625F, 0F, -0.5F, -0.625F, -0.75F, -0.25F, -0.125F, -0.75F, -0.25F, -0.125F, -0.75F, -0.5F, -0.625F, -0.75F, -0.5F); // Box 0
		bodyModel[391].setRotationPoint(72F, -8.75F, -1F);

		bodyModel[392].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.375F, -1F, 0F, -0.375F, -1F, 0F, -0.375F, -0.75F, 0F, -0.375F, -1.625F, 0F, -0.375F, -0.125F, 0F, -0.375F, -0.125F, 0F, -0.375F, -1.625F, 0F, -0.375F); // Box 0
		bodyModel[392].setRotationPoint(72.5F, -6F, -0.5F);

		bodyModel[393].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.625F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.125F, -0.25F, 0F, -0.625F, -0.25F, 0F, -0.625F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.625F, -0.5F, 0F); // Box 0
		bodyModel[393].setRotationPoint(73.5F, -5.25F, -0.5F);

		bodyModel[394].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[394].setRotationPoint(75.5F, -8.87F, 4.03F);

		bodyModel[395].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[395].setRotationPoint(75.5F, -9.87F, 4.03F);

		bodyModel[396].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[396].setRotationPoint(75.5F, -9.37F, 4.03F);

		bodyModel[397].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[397].setRotationPoint(75.5F, -7.87F, 4.03F);

		bodyModel[398].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[398].setRotationPoint(75.5F, -8.37F, 4.03F);

		bodyModel[399].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[399].setRotationPoint(75.5F, -8.87F, -7.03F);

		bodyModel[400].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F); // Box 0
		bodyModel[400].setRotationPoint(75.5F, -9.87F, -7.03F);

		bodyModel[401].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 0
		bodyModel[401].setRotationPoint(75.5F, -9.37F, -7.03F);

		bodyModel[402].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, -0.5F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0F, -1F); // Box 0
		bodyModel[402].setRotationPoint(75.5F, -7.87F, -7.03F);

		bodyModel[403].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, -0.5F, 0.125F, -0.375F, 0F, 0.125F, -0.375F); // Box 0
		bodyModel[403].setRotationPoint(75.5F, -8.37F, -7.03F);

		bodyModel[404].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[404].setRotationPoint(71.75F, -9.5F, 4.9F);

		bodyModel[405].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[405].setRotationPoint(71.75F, -8.25F, 4.9F);

		bodyModel[406].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.375F, 0F, 1.75F, -0.375F, -0.25F, 1.75F, -0.375F, 0F, -0.375F, -0.375F, 0.25F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[406].setRotationPoint(71.75F, -9F, -6.13F);

		bodyModel[407].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F, -0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F); // Box 0
		bodyModel[407].setRotationPoint(71.75F, -9.5F, -6.13F);

		bodyModel[408].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.375F, -0.125F, 0F, 1.75F, -0.125F, -0.25F, 1.75F, -0.125F, 0F, -0.375F, -0.125F, 0.25F, -0.375F, -0.5F, -0.25F, 1.75F, -0.75F, -0.375F, 1.75F, -0.75F, -0.125F, -0.375F, -0.5F, 0F); // Box 0
		bodyModel[408].setRotationPoint(71.75F, -8.25F, -6.13F);
	}
@Override
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float scale)
	{
		super.render(entity, f0, f1, f2, f3, f4, scale);
		((AbstractTrains) entity).getCargoManager().renderCargo((AbstractTrains) entity, f0, f1, f2, f3, f4, scale);
	}
}