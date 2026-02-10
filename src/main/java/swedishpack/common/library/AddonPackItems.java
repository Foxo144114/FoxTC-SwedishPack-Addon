package swedishpack.common.library;

import cpw.mods.fml.common.registry.GameRegistry;
import swedishpack.common.items.ItemAddonPackRollingStock;

public class AddonPackItems
{
    /**
     * Setup all items
     */
    public AddonPackItems()
    {
        loadRollingStockItems();
        registerItems();
    }

    private void loadRollingStockItems()
    {
        for (AddonRollingStockItems item : AddonRollingStockItems.values())
        {
            item.item = new ItemAddonPackRollingStock(item.iconName);
        }
    }

    private void registerItems() {
        for (AddonRollingStockItems item : AddonRollingStockItems.values()) {
            if (item.item != null) {
                item.item.setUnlocalizedName(Swedish_PackAddonInfo.modID + ":" + item.ItemName);
                GameRegistry.registerItem(item.item, item.ItemName);
            }
        }
    }
}
