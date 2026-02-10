package swedishpack.common.library;

import net.minecraft.item.Item;
import train.common.library.TypeOfRollingStock;

import static train.common.library.TypeOfRollingStock.*;

/**
 * Enum class for the Rolling stock item
 * DO NOT ADD OTHER ITEMS BESIDES ROLLING STOCK ITEMS HERE
 */
public enum AddonRollingStockItems
{
   // minecartSJLittD( "D-Icon", 10),
  //  minecartSJLittDu2( "Du2-Icon", 15),
  //  minecartSJLittDg2( "Dg2-icon", 17),
  //  minecartBJLittDs( "BJDs-icon", 14),
  //  minecartBJLittBk( "BJBk-icon", 14),
  //  minecartSJLittOaA( "Oa_A-icon", 14),
  //  minecartSJLittOaB( "Oa_B-icon", 14),
  //  minecartSJLittObB( "Ob_B-icon", 14),
  //  minecartSJLittObA( "Ob_A-icon", 14),
  //  minecartSJLittOc( "Oc-icon", 14),
  //  minecartSJLittOd( "Od-icon", 14),
  //  minecartSJLittOeB( "OeB-icon", 14),
  //  minecartSJLittOeA( "OeA-icon", 14),
  //  minecartSJLittOfB( "OfB-icon", 14),
  //  minecartSJLittOfA( "OfA-icon", 14),
  //  minecartSJLittOfAs( "OfA-icon", 14),
  //  minecartSJLittT21( "T21-icon", 14),
  //  minecartFTRLittPVV8( "PVV8-icon", 1),
  //  minecartSJLittT23( "T23-icon", 14),
  //  minecartSJLittT31( "T21-icon", 14),
  //  minecartFTRLittET41A( "ET41A-icon", 9),
  //  minecartFTRLittET41B( "ET41B-icon", 9),
  //  minecartGBJLittBs( "GBJBs-icon", 13),
  //  minecartSJLittDa( "Da-Icon", 20),
  //  minecartSJLittDmA( "DmA-Icon", 30),
  //  minecartSJLittDm3( "Dm3-Icon", 35),
  //  minecartSJLittDmB( "DmB-Icon", 30),
  //  minecartSJLittM1( "M1-Icon", 5),
  //  minecartSJLittM21902( "M21902-Icon", 7),
  //  minecartSJLittM21908( "M21908-Icon", 8),
  //  minecartSJLittM21908Extended( "M21908Extended-Icon", 9),
  //  minecartSJLittMAS( "MAS-Icon", 13),
  //  minecartSJLittO( "O-Icon", 5),
  //  minecartSJLittOs( "Os-Icon", 4),
  //  minecartSJLittOs_w( "Os_w-Icon", 6),
  //  minecartSJLittLgs( "Lgs-Icon", 9),
  //  minecartSJLittG( "G-Icon", 5),
  //  minecartSJLittB1919( "B1919-Icon", 5),
  //  minecartSJLittATender( "Atender-Icon", 5),
  //  minecartSJLittB1909( "B1909-Icon", 5),
  //  minecartSJLittCTender( "Ctender-Icon", 5),
  //  minecartSJLittX16( "X16-icon", 5),
  //  minecartSJLittY6( "Y6-icon", 5),
  //  minecartSJLittUb( "Ub-icon", 5),
  //  minecartSJLittUBF6Y( "UBF6Y-icon", 5),
  //  minecartSJLittUDFo20( "UDFo20-icon", 5),
  //  minecartSJLittUFV( "UFV-icon", 5),
  //  minecartSJLittElos( "Elos-_Icon", 5),
  //  minecartSJLittOaVagn( "Oa-Icon", 5),
  //  minecartSJLittQ12( "Q12-Icon", 5),
  //  minecartSJLittFel( "Fel-icon", 5),
    minecartSJLittRc1( "Rc1-Icon", 20),
   // minecartSJLittRc2( "Rc2-Icon", 20),
   // minecartSJLittRc3( "Rc3-Icon", 20),
   // minecartSJLittRc4( "Rc4-Icon", 20),
   // minecartSJLittRc5( "Rc5-Icon", 20),
   // minecartSJLittRc6( "Rc6-Icon", 20),
   // minecartSJLittRc7( "Rc7-Icon", 20),
   // minecartOBBLittRc2( "Rc2OBB-Icon", 20),
   // minecartOBBLitt1043( "OBB1043-Icon", 20),
   // minecartSJLittE( "E-Icon", 5),
   // minecartSJLittE2( "E2-Icon", 5),
   // minecartSJLittF( "F-Icon", 5),
   // minecartSJLittFTender( "Ftender-Icon", 5),
   // minecartTGOJLittBt( "Bt-Icon", 5),
    //minecraftTemplate("template-icon", STEAM, 100),
    //minecraftTemplateUntradeable("template-icon", STEAM)
    ;


    /**
     * @param iconName

     * @param amountForEmerald amount for Emerald
     */
    AddonRollingStockItems(String iconName, int amountForEmerald)
    {
        this.iconName = iconName;

        this.amountForEmerald = (byte) amountForEmerald;
        ItemName = this.name();
    }

    AddonRollingStockItems(String itemName, String iconName, int amountForEmerald)
    {
        this.iconName = iconName;

        this.amountForEmerald = (byte) amountForEmerald;
        ItemName = itemName;
    }

    /** USED FOR ROLLINGSTOCK THAT IS NOT ALLOWED TO BE TRADED FOR
     * @param iconName

     */

    AddonRollingStockItems(String iconName)
    {
        this.iconName = iconName;

        this.amountForEmerald = -1;
        ItemName = this.name();
    }

    AddonRollingStockItems(String itemName, String iconName)
    {
        this.iconName = iconName;

        this.amountForEmerald = -1;
        ItemName = itemName;
    }

    public Item item;
    public final String iconName;


    public final String ItemName;

    /**
     * amount for emerald. For ItemRollingStock, it is the price for one train
     */
    public byte amountForEmerald;
}
