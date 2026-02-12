package swedishpack.common.core.handler;

import swedishpack.common.SwedishPack;
import swedishpack.common.library.AddonRollingStockItems;
import swedishpack.common.rollingStock.*;
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
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue","Lime","LightGrey","Cyan","Pink","Purple","Brown","Orange","Red","Skin16","Skin17",}, 12).setMHP(4800).setMaxSpeed(136).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.7),
                Instance()
        );
      Traincraft.traincraftRegistry.RegisterRollingStockEntity(
              AddonRollingStockItems.minecartSJLittRc2.item,
              new TrainRecord("SJ Litterera Rc2", Swedish_PackEntityLocoElectricSJLittRc2.class, AddonRollingStockItems.minecartSJLittRc2.item,
                      EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue","Lime","LightGrey","Cyan","Pink"}, 12).setMHP(4800).setMaxSpeed(136).setFuelConsumption(10)
                      .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.7),
              Instance()
      );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartOBBLittRc2.item,
                new TrainRecord("SJ Litterera Rc2obb", Swedish_PackEntityLocoElectricSJLittRc2obb.class, AddonRollingStockItems.minecartOBBLittRc2.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue","Lime","LightGrey","Cyan","Pink","Purple","Brown","Orange","Red","Skin16","Skin17",}, 12).setMHP(4800).setMaxSpeed(136).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.7),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartOBBLitt1043.item,
                new TrainRecord("ÖBB Litterera 1043", Swedish_PackEntityLocoElectricOBBLitt1043.class, AddonRollingStockItems.minecartOBBLitt1043.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue","Lime","LightGrey","Cyan","Pink"}, 12).setMHP(4800).setMaxSpeed(136).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.7),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittRc3.item,
                new TrainRecord("SJ Litterera Rc3", Swedish_PackEntityLocoElectricSJLittRc3.class, AddonRollingStockItems.minecartSJLittRc3.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue","Lime","LightGrey","Cyan","Pink","Purple","Brown","Orange","Red","Skin16","Skin17","Skin18","Skin19","Skin20","Skin21","Skin22","Skin23",}, 12).setMHP(4800).setMaxSpeed(161).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.7),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittRc4.item,
                new TrainRecord("SJ Litterera Rc4", Swedish_PackEntityLocoElectricSJLittRc4.class, AddonRollingStockItems.minecartSJLittRc4.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue","Lime","LightGrey","Cyan","Pink"}, 12).setMHP(4800).setMaxSpeed(136).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.7),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittRc5.item,
                new TrainRecord("SJ Litterera Rc5", Swedish_PackEntityLocoElectricSJLittRc5.class, AddonRollingStockItems.minecartSJLittRc5.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue","Lime","LightGrey","Cyan","Pink","Purple","Brown","Orange"}, 12).setMHP(4800).setMaxSpeed(136).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.7),
                Instance()
        );



        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittRc6.item,
                new TrainRecord("SJ Litterera Rc6", Swedish_PackEntityLocoElectricSJLittRc6.class, AddonRollingStockItems.minecartSJLittRc6.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue","Lime","LightGrey","Cyan","Pink"}, 12).setMHP(4800).setMaxSpeed(161).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.7),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittRc7.item,
                new TrainRecord("SJ Litterera Rc7", Swedish_PackEntityLocoElectricSJLittRc7.class, AddonRollingStockItems.minecartSJLittRc7.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green"}, 12).setMHP(4800).setMaxSpeed(181).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.7),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartTGOJLittBt.item,
                new TrainRecord("TGOJ Litterera Bt", Swedish_PackEntityLocoElectricTGOJLittBt.class, AddonRollingStockItems.minecartTGOJLittBt.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue","Lime","LightGrey","Cyan","Pink","Purple","Brown","Orange"}, 12).setMHP(4800).setMaxSpeed(136).setFuelConsumption(10)
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
