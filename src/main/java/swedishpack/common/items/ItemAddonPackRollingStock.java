package swedishpack.common.items;

import train.common.items.ItemAbstractRollingStock;
import train.common.library.TypeOfRollingStock;
import swedishpack.common.SwedishPack;
import swedishpack.common.library.Swedish_PackAddonInfo;


public class ItemAddonPackRollingStock  extends ItemAbstractRollingStock
{
    public ItemAddonPackRollingStock(String iconName)
    {
        super(iconName);
        setCreativeTab(SwedishPack.addonTabOne);
    }

    @Override
    public String GetContentPackName()
    {
        return "SwedishPack";
    }

    @Override
    public String GetTexturePath()
    {
        return Swedish_PackAddonInfo.modID.toLowerCase() + ":trains/" + this.iconName;
    }
}
