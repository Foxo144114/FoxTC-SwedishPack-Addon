//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SJ Litterera UFV
// Model Creator: Foxo
// Created on: 02.09.2021 - 12:49:00
// Last changed on: 02.09.2021 - 12:49:00

package swedishpack.client.render.models; //Path where the model is located

import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class ModelSJLittUFV extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelSJLittUFV() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[132];

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
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Du loco part56
		bodyModel[6] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // part
		bodyModel[7] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // part
		bodyModel[8] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 149
		bodyModel[9] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 168
		bodyModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 135
		bodyModel[11] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Du loco part47
		bodyModel[12] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Du loco part47
		bodyModel[13] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 168
		bodyModel[14] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[15] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 149
		bodyModel[16] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 149
		bodyModel[17] = new ModelRendererTurbo(this, 417, 57, textureX, textureY); // Du loco part09
		bodyModel[18] = new ModelRendererTurbo(this, 209, 41, textureX, textureY); // Box 168
		bodyModel[19] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 167
		bodyModel[20] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Du loco part71
		bodyModel[21] = new ModelRendererTurbo(this, 241, 89, textureX, textureY); // Du loco part71
		bodyModel[22] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Du loco part71
		bodyModel[23] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 167
		bodyModel[24] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 167
		bodyModel[25] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Du loco part28
		bodyModel[26] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Du loco part28
		bodyModel[27] = new ModelRendererTurbo(this, 88, 105, textureX, textureY); // Du loco part19
		bodyModel[28] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Du loco part05
		bodyModel[29] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Du loco part05
		bodyModel[30] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Du loco part05
		bodyModel[31] = new ModelRendererTurbo(this, 297, 105, textureX, textureY); // Du loco part05
		bodyModel[32] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Du loco part01
		bodyModel[33] = new ModelRendererTurbo(this, 129, 129, textureX, textureY); // Du loco part09
		bodyModel[34] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Du loco part09
		bodyModel[35] = new ModelRendererTurbo(this, 385, 121, textureX, textureY); // Du loco part01
		bodyModel[36] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 168
		bodyModel[37] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 168
		bodyModel[38] = new ModelRendererTurbo(this, 489, 121, textureX, textureY); // Box 168
		bodyModel[39] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Du loco part19
		bodyModel[40] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 168
		bodyModel[41] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 168
		bodyModel[42] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 168
		bodyModel[43] = new ModelRendererTurbo(this, 449, 129, textureX, textureY); // Box 168
		bodyModel[44] = new ModelRendererTurbo(this, 193, 137, textureX, textureY); // Box 168
		bodyModel[45] = new ModelRendererTurbo(this, 385, 137, textureX, textureY); // Box 168
		bodyModel[46] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Du loco part03
		bodyModel[47] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Du loco part03
		bodyModel[48] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Du loco part03
		bodyModel[49] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Du loco part03
		bodyModel[50] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Du loco part03
		bodyModel[51] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Du loco part03
		bodyModel[52] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // part
		bodyModel[53] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Lamp
		bodyModel[54] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Lamp
		bodyModel[55] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Lamp
		bodyModel[56] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // part
		bodyModel[57] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // part
		bodyModel[58] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[59] = new ModelRendererTurbo(this, 353, 153, textureX, textureY); // part
		bodyModel[60] = new ModelRendererTurbo(this, 337, 105, textureX, textureY); // Lamp
		bodyModel[61] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Lamp
		bodyModel[62] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Lamp
		bodyModel[63] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 167
		bodyModel[64] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 167
		bodyModel[65] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 167
		bodyModel[66] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 167
		bodyModel[67] = new ModelRendererTurbo(this, 441, 153, textureX, textureY); // Box 167
		bodyModel[68] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 167
		bodyModel[69] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 167
		bodyModel[70] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 167
		bodyModel[71] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 167
		bodyModel[72] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 167
		bodyModel[73] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 167
		bodyModel[74] = new ModelRendererTurbo(this, 257, 161, textureX, textureY); // Box 167
		bodyModel[75] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 167
		bodyModel[76] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 167
		bodyModel[77] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 167
		bodyModel[78] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 167
		bodyModel[79] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 167
		bodyModel[80] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Du loco part05
		bodyModel[81] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Du loco part05
		bodyModel[82] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Du loco part05
		bodyModel[83] = new ModelRendererTurbo(this, 329, 193, textureX, textureY); // Du loco part05
		bodyModel[84] = new ModelRendererTurbo(this, 265, 201, textureX, textureY); // part
		bodyModel[85] = new ModelRendererTurbo(this, 321, 201, textureX, textureY); // part
		bodyModel[86] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[87] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // part
		bodyModel[88] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Lamp
		bodyModel[89] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Lamp
		bodyModel[90] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Lamp
		bodyModel[91] = new ModelRendererTurbo(this, 369, 201, textureX, textureY); // part
		bodyModel[92] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // part
		bodyModel[93] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Du loco part Ligjhtpart18
		bodyModel[94] = new ModelRendererTurbo(this, 417, 201, textureX, textureY); // part
		bodyModel[95] = new ModelRendererTurbo(this, 73, 169, textureX, textureY); // Lamp
		bodyModel[96] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Lamp
		bodyModel[97] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Lamp
		bodyModel[98] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Du loco part56
		bodyModel[99] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Du loco part56
		bodyModel[100] = new ModelRendererTurbo(this, 25, 209, textureX, textureY); // Du loco part56
		bodyModel[101] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Du loco part47
		bodyModel[102] = new ModelRendererTurbo(this, 305, 209, textureX, textureY); // Du loco part47
		bodyModel[103] = new ModelRendererTurbo(this, 121, 209, textureX, textureY); // Du loco part56
		bodyModel[104] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Du loco part47
		bodyModel[105] = new ModelRendererTurbo(this, 441, 209, textureX, textureY); // Du loco part56
		bodyModel[106] = new ModelRendererTurbo(this, 465, 209, textureX, textureY); // Du loco part47
		bodyModel[107] = new ModelRendererTurbo(this, 489, 209, textureX, textureY); // Du loco part47
		bodyModel[108] = new ModelRendererTurbo(this, 81, 217, textureX, textureY); // Du loco part56
		bodyModel[109] = new ModelRendererTurbo(this, 377, 209, textureX, textureY); // Du loco part56
		bodyModel[110] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Du loco part56
		bodyModel[111] = new ModelRendererTurbo(this, 145, 217, textureX, textureY); // Du loco part47
		bodyModel[112] = new ModelRendererTurbo(this, 321, 209, textureX, textureY); // Du loco part56
		bodyModel[113] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Du loco part47
		bodyModel[114] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Du loco part47
		bodyModel[115] = new ModelRendererTurbo(this, 441, 217, textureX, textureY); // Du loco part01
		bodyModel[116] = new ModelRendererTurbo(this, 305, 225, textureX, textureY); // Du loco part01
		bodyModel[117] = new ModelRendererTurbo(this, 81, 225, textureX, textureY); // Du loco part01
		bodyModel[118] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Du loco part01
		bodyModel[119] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Du loco part01
		bodyModel[120] = new ModelRendererTurbo(this, 177, 225, textureX, textureY); // Du loco part01
		bodyModel[121] = new ModelRendererTurbo(this, 1, 218, textureX, textureY); // Du loco part05
		bodyModel[122] = new ModelRendererTurbo(this, 1, 218, textureX, textureY); // Du loco part05
		bodyModel[123] = new ModelRendererTurbo(this, 6, 218, textureX, textureY); // Du loco part05
		bodyModel[124] = new ModelRendererTurbo(this, 6, 218, textureX, textureY); // Du loco part05
		bodyModel[125] = new ModelRendererTurbo(this, 1, 189, textureX, textureY); // Du loco part19
		bodyModel[126] = new ModelRendererTurbo(this, 122, 189, textureX, textureY); // Du loco part19
		bodyModel[127] = new ModelRendererTurbo(this, 88, 105, textureX, textureY); // Du loco part19
		bodyModel[128] = new ModelRendererTurbo(this, 418, 1, textureX, textureY); // Du loco part28
		bodyModel[129] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Du loco part28
		bodyModel[130] = new ModelRendererTurbo(this, 418, 5, textureX, textureY); // Du loco part28
		bodyModel[131] = new ModelRendererTurbo(this, 425, 5, textureX, textureY); // Du loco part28

		bodyModel[0].addBox(0F, 0F, 0F, 30, 1, 20, 0F); // Du loco part03
		bodyModel[0].setRotationPoint(10F, -8F, -10F);

		bodyModel[1].addBox(0F, 0F, 0F, 30, 18, 1, 0F); // Du loco part07
		bodyModel[1].setRotationPoint(10F, -24F, -11F);

		bodyModel[2].addBox(0F, 0F, 0F, 44, 1, 4, 0F); // Du loco part08
		bodyModel[2].setRotationPoint(3F, -28F, -2F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[3].setRotationPoint(-20F, -7F, 6.05F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[4].setRotationPoint(-5F, -24F, -3F);

		bodyModel[5].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Du loco part56
		bodyModel[5].setRotationPoint(-9F, -5F, -3F);

		bodyModel[6].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, -0.25F, 0F, -4.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -4F, 0F, -0.75F, -1F, 0F, -0.75F, 0F, 0F, -0.75F); // part
		bodyModel[6].setRotationPoint(-3F, -10F, 5F);

		bodyModel[7].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, 0F, -0.75F, -4F, 0F, -0.75F, -1.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -4.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // part
		bodyModel[7].setRotationPoint(-3F, -11F, 5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 149
		bodyModel[8].setRotationPoint(10F, -26F, 9F);

		bodyModel[9].addShapeBox(0F, 0F, 1F, 3, 18, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F); // Box 168
		bodyModel[9].setRotationPoint(-5F, -24F, 2F);

		bodyModel[10].addBox(0F, 0F, 0F, 30, 18, 1, 0F); // Box 135
		bodyModel[10].setRotationPoint(10F, -24F, 10F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[11].setRotationPoint(-9F, -4F, -3F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[12].setRotationPoint(-9F, -6F, -3F);

		bodyModel[13].addShapeBox(0F, 0F, 1F, 5, 18, 3, 0F,-1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 168
		bodyModel[13].setRotationPoint(-2F, -24F, 6F);

		bodyModel[14].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part Ligjhtpart18
		bodyModel[14].setRotationPoint(-4F, -10.75F, 5.25F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 30, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[15].setRotationPoint(10F, -27F, 6F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 44, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[16].setRotationPoint(3F, -28F, 2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[17].setRotationPoint(-20F, -7F, -6.05F);

		bodyModel[18].addShapeBox(0F, 0F, 1F, 7, 18, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 168
		bodyModel[18].setRotationPoint(3F, -24F, 9F);

		bodyModel[19].addShapeBox(0F, 0F, 1F, 3, 2, 14, 0F,-2F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, -2F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 167
		bodyModel[19].setRotationPoint(-5F, -26F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 44, 2, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part71
		bodyModel[20].setRotationPoint(3F, -28F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 30, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part71
		bodyModel[21].setRotationPoint(10F, -27F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 30, 2, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part71
		bodyModel[22].setRotationPoint(10F, -26F, -11F);

		bodyModel[23].addShapeBox(0F, 0F, 1F, 5, 2, 5, 0F,0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1F, 0F, -2F, -1F, 0F, -2F, 2F); // Box 167
		bodyModel[23].setRotationPoint(-2F, -26F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, -2F, -1F, 0F, -2F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F); // Box 167
		bodyModel[24].setRotationPoint(3F, -26F, -12F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part28
		bodyModel[25].setRotationPoint(35F, -18F, 11F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[26].setRotationPoint(13F, -18F, -12F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[27].setRotationPoint(55F, -15F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[28].setRotationPoint(-5F, -17F, -2.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[29].setRotationPoint(-5F, -22F, -2.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[30].setRotationPoint(-5F, -22F, 1.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[31].setRotationPoint(-5F, -22F, -2.5F);

		bodyModel[32].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[32].setRotationPoint(6.5F, -4.5F, -6F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[33].setRotationPoint(16F, -7F, -6.05F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 30, 30, 0, 0F,-24F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 0F, 0F, -24F, -24F, 0F, 0F, -24F, 0F, 0F, -24F, 0F, -24F, -24F, 0F); // Du loco part09
		bodyModel[34].setRotationPoint(16F, -7F, 6.05F);

		bodyModel[35].addBox(0F, 0F, 0F, 1, 1, 12, 0F); // Du loco part01
		bodyModel[35].setRotationPoint(42.5F, -4.5F, -6F);

		bodyModel[36].addShapeBox(0F, 0F, 1F, 3, 18, 4, 0F,-3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[36].setRotationPoint(-5F, -24F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 1F, 5, 18, 3, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F); // Box 168
		bodyModel[37].setRotationPoint(-2F, -24F, -11F);

		bodyModel[38].addShapeBox(0F, 0F, 1F, 7, 18, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 168
		bodyModel[38].setRotationPoint(3F, -24F, -12F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 18, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part19
		bodyModel[39].setRotationPoint(54F, -24F, -3F);

		bodyModel[40].addShapeBox(0F, 0F, 1F, 3, 18, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F); // Box 168
		bodyModel[40].setRotationPoint(52F, -24F, 2F);

		bodyModel[41].addShapeBox(0F, 0F, 1F, 5, 18, 3, 0F,0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 168
		bodyModel[41].setRotationPoint(47F, -24F, 6F);

		bodyModel[42].addShapeBox(0F, 0F, 1F, 7, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 168
		bodyModel[42].setRotationPoint(40F, -24F, 9F);

		bodyModel[43].addShapeBox(0F, 0F, 1F, 3, 18, 4, 0F,1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 168
		bodyModel[43].setRotationPoint(52F, -24F, -8F);

		bodyModel[44].addShapeBox(0F, 0F, 1F, 5, 18, 3, 0F,0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -2F); // Box 168
		bodyModel[44].setRotationPoint(47F, -24F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 1F, 7, 18, 1, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 168
		bodyModel[45].setRotationPoint(40F, -24F, -12F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Du loco part03
		bodyModel[46].setRotationPoint(3F, -8F, -10F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Du loco part03
		bodyModel[47].setRotationPoint(-1F, -8F, -9F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Du loco part03
		bodyModel[48].setRotationPoint(-4F, -8F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 7, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Du loco part03
		bodyModel[49].setRotationPoint(40F, -8F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Du loco part03
		bodyModel[50].setRotationPoint(47F, -8F, -9F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Du loco part03
		bodyModel[51].setRotationPoint(51F, -8F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // part
		bodyModel[52].setRotationPoint(-3F, -10.75F, 5F);

		bodyModel[53].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Lamp
		bodyModel[53].setRotationPoint(-4F, -10F, 6F);

		bodyModel[54].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Lamp
		bodyModel[54].setRotationPoint(-4F, -11F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[55].setRotationPoint(-4F, -10.75F, 6F);

		bodyModel[56].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -4.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -1.75F, 0F, -0.75F, -4F, 0F, -0.75F, 0F, 0F, -0.75F); // part
		bodyModel[56].setRotationPoint(-3F, -10F, -10F);

		bodyModel[57].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, 0F, -0.75F, -1F, 0F, -0.75F, -4F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -4.5F, -0.25F, 0F, 0F, -0.25F, 0F); // part
		bodyModel[57].setRotationPoint(-3F, -11F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Du loco part Ligjhtpart18
		bodyModel[58].setRotationPoint(-4F, -10.75F, -7.75F);

		bodyModel[59].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F); // part
		bodyModel[59].setRotationPoint(-3F, -10.75F, -10F);

		bodyModel[60].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F); // Lamp
		bodyModel[60].setRotationPoint(-4F, -10F, -10F);

		bodyModel[61].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Lamp
		bodyModel[61].setRotationPoint(-4F, -11F, -10F);

		bodyModel[62].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Lamp
		bodyModel[62].setRotationPoint(-4F, -10.75F, -10F);

		bodyModel[63].addShapeBox(0F, 0F, 1F, 5, 2, 5, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 167
		bodyModel[63].setRotationPoint(-2F, -26F, 4F);

		bodyModel[64].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 167
		bodyModel[64].setRotationPoint(3F, -26F, 7F);

		bodyModel[65].addShapeBox(0F, 0F, 1F, 1, 1, 10, 0F,-1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 167
		bodyModel[65].setRotationPoint(-3F, -27F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 1F, 5, 1, 12, 0F,-5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 167
		bodyModel[66].setRotationPoint(-2F, -28F, -7F);

		bodyModel[67].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 167
		bodyModel[67].setRotationPoint(3F, -27F, 5F);

		bodyModel[68].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 167
		bodyModel[68].setRotationPoint(3F, -27F, -10F);

		bodyModel[69].addShapeBox(0F, 0F, 1F, 3, 2, 14, 0F,0F, 0F, -2F, -2F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 167
		bodyModel[69].setRotationPoint(52F, -26F, -8F);

		bodyModel[70].addShapeBox(0F, 0F, 1F, 5, 2, 5, 0F,0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -4F, 0F, -2F, 2F, 0F, -2F, -1F); // Box 167
		bodyModel[70].setRotationPoint(47F, -26F, -11F);

		bodyModel[71].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, -2F, 0F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 167
		bodyModel[71].setRotationPoint(40F, -26F, -12F);

		bodyModel[72].addShapeBox(0F, 0F, 1F, 5, 2, 5, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, -2F, -1F, 0F, -2F, 2F, 0F, 0F, -4F, 0F, 0F, -1F); // Box 167
		bodyModel[72].setRotationPoint(47F, -26F, 4F);

		bodyModel[73].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 167
		bodyModel[73].setRotationPoint(40F, -26F, 7F);

		bodyModel[74].addShapeBox(0F, 0F, 1F, 1, 1, 10, 0F,0F, 0F, -2F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 167
		bodyModel[74].setRotationPoint(52F, -27F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 1F, 5, 1, 12, 0F,0F, 0F, -4F, -5F, 0F, -4F, -5F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 167
		bodyModel[75].setRotationPoint(47F, -28F, -7F);

		bodyModel[76].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 167
		bodyModel[76].setRotationPoint(40F, -27F, 5F);

		bodyModel[77].addShapeBox(0F, 0F, 1F, 7, 2, 3, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 167
		bodyModel[77].setRotationPoint(40F, -27F, -10F);

		bodyModel[78].addShapeBox(0F, 0F, 1F, 5, 1, 16, 0F,0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 167
		bodyModel[78].setRotationPoint(47F, -27F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 1F, 5, 1, 16, 0F,0F, 0F, -5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 167
		bodyModel[79].setRotationPoint(-2F, -27F, -9F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[80].setRotationPoint(54F, -17F, -2.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Du loco part05
		bodyModel[81].setRotationPoint(54F, -22F, -2.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Du loco part05
		bodyModel[82].setRotationPoint(54F, -22F, 1.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F); // Du loco part05
		bodyModel[83].setRotationPoint(54F, -22F, -2.5F);

		bodyModel[84].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-4.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -4F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1.5F, 0F, -0.75F); // part
		bodyModel[84].setRotationPoint(48F, -10F, 5F);

		bodyModel[85].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-4F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1F, 0F, -0.75F, -4.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // part
		bodyModel[85].setRotationPoint(48F, -11F, 5F);

		bodyModel[86].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part Ligjhtpart18
		bodyModel[86].setRotationPoint(53F, -10.75F, 5.25F);

		bodyModel[87].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-4.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // part
		bodyModel[87].setRotationPoint(48F, -10.75F, 5F);

		bodyModel[88].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Lamp
		bodyModel[88].setRotationPoint(53F, -10F, 6F);

		bodyModel[89].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Lamp
		bodyModel[89].setRotationPoint(53F, -11F, 6F);

		bodyModel[90].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[90].setRotationPoint(53F, -10.75F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -4.5F, -0.25F, 0F, -1F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -4F, 0F, -0.75F); // part
		bodyModel[91].setRotationPoint(48F, -10F, -10F);

		bodyModel[92].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-1.25F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -4.25F, 0F, -0.75F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -4.5F, -0.25F, 0F); // part
		bodyModel[92].setRotationPoint(48F, -11F, -10F);

		bodyModel[93].addShapeBox(0F, 0F, 1F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Du loco part Ligjhtpart18
		bodyModel[93].setRotationPoint(53F, -10.75F, -7.75F);

		bodyModel[94].addShapeBox(0F, 0F, 1F, 5, 1, 3, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -4.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F); // part
		bodyModel[94].setRotationPoint(48F, -10.75F, -10F);

		bodyModel[95].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F); // Lamp
		bodyModel[95].setRotationPoint(53F, -10F, -10F);

		bodyModel[96].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, 0F, -0.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Lamp
		bodyModel[96].setRotationPoint(53F, -11F, -10F);

		bodyModel[97].addShapeBox(0F, 0F, 1F, 1, 1, 2, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Lamp
		bodyModel[97].setRotationPoint(53F, -10.75F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Du loco part56
		bodyModel[98].setRotationPoint(-7F, -5F, -2F);

		bodyModel[99].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Du loco part56
		bodyModel[99].setRotationPoint(-4F, -7F, -2F);

		bodyModel[100].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Du loco part56
		bodyModel[100].setRotationPoint(-10F, -6F, -2F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[101].setRotationPoint(-10F, -6F, -3F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[102].setRotationPoint(-9F, -7F, -3F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part56
		bodyModel[103].setRotationPoint(-11F, -6F, -2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Du loco part47
		bodyModel[104].setRotationPoint(-11F, -6F, -3F);

		bodyModel[105].addBox(0F, 0F, 0F, 2, 1, 6, 0F); // Du loco part56
		bodyModel[105].setRotationPoint(57F, -5F, -3F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[106].setRotationPoint(57F, -4F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part47
		bodyModel[107].setRotationPoint(57F, -6F, -3F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 5, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Du loco part56
		bodyModel[108].setRotationPoint(52F, -5F, -2F);

		bodyModel[109].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Du loco part56
		bodyModel[109].setRotationPoint(52F, -7F, -2F);

		bodyModel[110].addBox(0F, 0F, 0F, 1, 3, 2, 0F); // Du loco part56
		bodyModel[110].setRotationPoint(59F, -6F, 0F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Du loco part47
		bodyModel[111].setRotationPoint(57F, -7F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Du loco part56
		bodyModel[112].setRotationPoint(60F, -6F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F); // Du loco part47
		bodyModel[113].setRotationPoint(60F, -6F, 2F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Du loco part47
		bodyModel[114].setRotationPoint(59F, -6F, 2F);

		bodyModel[115].addBox(0F, 0F, 0F, 8, 1, 12, 0F); // Du loco part01
		bodyModel[115].setRotationPoint(6F, -4F, -6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,-6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[116].setRotationPoint(6F, -6F, -6F);

		bodyModel[117].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Du loco part01
		bodyModel[117].setRotationPoint(12F, -7F, -6F);

		bodyModel[118].addBox(0F, 0F, 0F, 8, 1, 12, 0F); // Du loco part01
		bodyModel[118].setRotationPoint(36F, -4F, -6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 8, 2, 12, 0F,0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part01
		bodyModel[119].setRotationPoint(36F, -6F, -6F);

		bodyModel[120].addBox(0F, 0F, 0F, 2, 1, 12, 0F); // Du loco part01
		bodyModel[120].setRotationPoint(36F, -7F, -6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F); // Du loco part05
		bodyModel[121].setRotationPoint(-5F, -22F, 2.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[122].setRotationPoint(-5F, -22F, -3.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.125F, 0F, -0.25F, 0F, 0F, -0.25F); // Du loco part05
		bodyModel[123].setRotationPoint(54F, -22F, 2.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.125F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part05
		bodyModel[124].setRotationPoint(54F, -22F, -3.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 0, 30, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -54F, 0F, 0F, -54F, 0F, -27F, 0F, 0F, -27F, 0F, 0F, -27F, -54F, 0F, -27F, -54F); // Du loco part19
		bodyModel[125].setRotationPoint(-5.55F, -13F, -3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 0, 30, 60, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -54F, 0F, 0F, -54F, 0F, -27F, 0F, 0F, -27F, 0F, 0F, -27F, -54F, 0F, -27F, -54F); // Du loco part19
		bodyModel[126].setRotationPoint(55.55F, -13F, -3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 6, 6, 0F,-0.5F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -0.5F, 0F, -0.125F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part19
		bodyModel[127].setRotationPoint(-6F, -15F, -3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[128].setRotationPoint(12F, -21F, -12F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Du loco part28
		bodyModel[129].setRotationPoint(34F, -21F, -12F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[130].setRotationPoint(12F, -21F, 11F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Du loco part28
		bodyModel[131].setRotationPoint(35F, -21F, 11F);
	}
}