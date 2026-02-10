package swedishpack.common.core.handler;

import swedishpack.common.SwedishPack;
import swedishpack.common.library.AddonRollingStockItems;
import swedishpack.common.rollingStock.Swedish_PackEntityLocoElectricSJLittRc1;
import train.common.Traincraft;
import train.common.library.EnumTrainType;
import train.common.library.register.TrainRecord;

public class AddonPackRollingStockEntityHandler
{
    private Object Instance()
    {
        return SwedishPack.instance;
    }

    public AddonPackRollingStockEntityHandler()
    {


        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittRc1.item,
                new TrainRecord("SJ Litterera Rc1", Swedish_PackEntityLocoElectricSJLittRc1.class, AddonRollingStockItems.minecartSJLittRc1.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Red","Black","White","Grey"}, 12).setMHP(4800).setMaxSpeed(136).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.7),
                Instance()
        );
        /* Sample





        Traincraft.traincraftRegistry
                .RegisterRollingStockEntity
                        (ItemIDs.minecartPassengerBlue.item,
                                new TrainRecord("Passenger Blue", EntityPassengerBlue.class, ItemIDs.minecartPassengerBlue.item, EnumTrainType.Passenger, 1,
                                        new String[]{"Blue", "Red", "Green", "White", "Black", "Cyan", "Orange", "Grey", "LightGrey", "LightBlue"},
                                        18),
                                Instance() // don't touch this line
                        );
         */

        // Put Calls to RegisterRollingStockEntity below this.
    }
}
