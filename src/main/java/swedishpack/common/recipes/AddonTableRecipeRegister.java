package swedishpack.common.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import swedishpack.common.library.AddonPackItems;
import swedishpack.common.library.AddonRollingStockItems;
import swedishpack.common.library.SwedishBlockIDs;
import train.common.Traincraft;
import train.common.api.crafting.ITierCraftingManager;
import train.common.core.handlers.AbstractRecipeHandler;
import train.common.core.managers.TierRecipeManager;
import train.common.library.ItemIDs;

public class AddonTableRecipeRegister extends AbstractRecipeHandler
{
    public AddonTableRecipeRegister()
    {
        GameRegistry.addRecipe(new ItemStack(SwedishBlockIDs.SvensktVaxelKlotGreySide1.block,1), "Y  ","RG ","BIW", Character.valueOf('Y'), YELLOW_DYE, Character.valueOf('R'), RED_DYE, Character.valueOf('G'), LIGHT_GRAY_DYE, Character.valueOf('B'), Blocks.iron_block, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
        GameRegistry.addShapedRecipe(new ItemStack(SwedishBlockIDs.SvensktVaxelKlotGreySide2.block, 1), "  ", " I", 'I', new ItemStack(SwedishBlockIDs.SvensktVaxelKlotGreySide1.block, 1));
        GameRegistry.addShapedRecipe(new ItemStack(SwedishBlockIDs.SvensktVaxelKlotGreySide1.block, 1), "  ", " I", 'I', new ItemStack(SwedishBlockIDs.SvensktVaxelKlotGreySide2.block, 1));


        GameRegistry.addRecipe(new ItemStack(SwedishBlockIDs.SvensktVaxelKlotGreenSide1.block,1), "Y  ","RG ","BIW", Character.valueOf('Y'), YELLOW_DYE, Character.valueOf('R'), RED_DYE, Character.valueOf('G'), GREEN_DYE, Character.valueOf('B'), Blocks.iron_block, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
        GameRegistry.addShapedRecipe(new ItemStack(SwedishBlockIDs.SvensktVaxelKlotGreenSide2.block, 1), "  ", " I", 'I', new ItemStack(SwedishBlockIDs.SvensktVaxelKlotGreenSide1.block, 1));
        GameRegistry.addShapedRecipe(new ItemStack(SwedishBlockIDs.SvensktVaxelKlotGreenSide1.block, 1), "  ", " I", 'I', new ItemStack(SwedishBlockIDs.SvensktVaxelKlotGreenSide2.block, 1));


        GameRegistry.addRecipe(new ItemStack(SwedishBlockIDs.SvensktVaxelKlotBlackSide1.block,1), "Y  ","RG ","BIW", Character.valueOf('Y'), YELLOW_DYE, Character.valueOf('R'), RED_DYE, Character.valueOf('G'), BLACK_DYE , Character.valueOf('B'), Blocks.iron_block, Character.valueOf('I'), Items.iron_ingot, Character.valueOf('W'), Blocks.planks);
        GameRegistry.addShapedRecipe(new ItemStack(SwedishBlockIDs.SvensktVaxelKlotBlackSide2.block, 1), "  ", " I", 'I', new ItemStack(SwedishBlockIDs.SvensktVaxelKlotBlackSide1.block, 1));
        GameRegistry.addShapedRecipe(new ItemStack(SwedishBlockIDs.SvensktVaxelKlotBlackSide1.block, 1), "  ", " I", 'I', new ItemStack(SwedishBlockIDs.SvensktVaxelKlotBlackSide2.block, 1));

        betterAddRecipe(3,new ItemStack(ItemIDs.steel.item, 2), new ItemStack(ItemIDs.controls.item,2), new ItemStack(ItemIDs.steelcab.item, 2), new ItemStack(ItemIDs.pantograph.item, 2), new ItemStack(ItemIDs.electronicCircuit.item, 1), new ItemStack(ItemIDs.transformer.item, 1), new ItemStack(ItemIDs.electmotor.item, 4), new ItemStack(ItemIDs.fourWheelHeavyweightTruck.item, 2), new ItemStack(ItemIDs.steelframe.item, 2), new ItemStack(ItemIDs.steel.item, 4), new ItemStack(AddonRollingStockItems.minecartSJLittRc1.item), 1);



    }

    public static void betterAddRecipe(int tier, ItemStack top1, ItemStack top2,
                                       ItemStack top3, ItemStack top4, ItemStack mid1, ItemStack mid2, ItemStack mid3,
                                       ItemStack bottom1, ItemStack bottom2, ItemStack bottom3, ItemStack output, int outputSize) {
        ITierCraftingManager cm = TierRecipeManager.getInstance();
        cm.addRecipe(tier, top1, bottom1, bottom2, bottom3, top2, top3, mid2, mid3, mid1, top4, output, outputSize);
    }



}
