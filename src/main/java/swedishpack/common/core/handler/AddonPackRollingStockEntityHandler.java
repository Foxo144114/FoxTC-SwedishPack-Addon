package swedishpack.common.core.handler;

import swedishpack.common.SwedishPack;
import swedishpack.common.library.AddonRollingStockItems;
import swedishpack.common.rollingStock.Locomotives.Electric.Swedish_PackEntityLocoElectricSJLittRc1;
import swedishpack.common.rollingStock.Wagons.*;
import swedishpack.common.rollingStock.Locomotives.Electric.*;
import swedishpack.common.rollingStock.Locomotives.Diesel.*;
import swedishpack.common.rollingStock.Locomotives.Steam.*;
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
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue","Lime","LightGrey","Cyan","Pink","Purple","Brown","Orange"}, 12).setMHP(3540).setMaxSpeed(106).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.7),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartGBJLittBs.item,
                new TrainRecord("GBJ Litterera Bs", Swedish_PackEntityLocoElectricGBJLittBs.class, AddonRollingStockItems.minecartGBJLittBs.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow"}, 12).setMHP(1600).setMaxSpeed(101).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-2.1),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartBJLittBk.item,
                new TrainRecord("BJ Litterera Bk", Swedish_PackEntityLocoElectricBJLittBk.class, AddonRollingStockItems.minecartBJLittBk.item,
                        EnumTrainType.Electric, 0, new String[]{"Orange","Red"}, 12).setMHP(2470).setMaxSpeed(81).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-2.75),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartBJLittDs.item,
                new TrainRecord("BJ Litterera Ds", Swedish_PackEntityLocoElectricBJLittDs.class, AddonRollingStockItems.minecartBJLittDs.item,
                        EnumTrainType.Electric, 0, new String[]{"Orange","Red"}, 12).setMHP(2470).setMaxSpeed(91).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-2.75),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittD.item,
                new TrainRecord("SJ Litterera D", Swedish_PackEntityLocoElectricSJLittD.class, AddonRollingStockItems.minecartSJLittD.item,
                        EnumTrainType.Electric, 0, new String[]{"Orange","Red","Brown"}, 12).setMHP(1640).setMaxSpeed(101).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-2.75),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittDu2.item,
                new TrainRecord("SJ Litterera Du2", Swedish_PackEntityLocoElectricSJLittDu2.class, AddonRollingStockItems.minecartSJLittDu2.item,
                        EnumTrainType.Electric, 0, new String[]{"Orange","Red","Brown"}, 12).setMHP(2470).setMaxSpeed(101).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-2.75),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittDg2.item,
                new TrainRecord("SJ Litterera Dg2", Swedish_PackEntityLocoElectricSJLittDg2.class, AddonRollingStockItems.minecartSJLittDg2.item,
                        EnumTrainType.Electric, 0, new String[]{"Red"}, 12).setMHP(2502).setMaxSpeed(76).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.4),
                Instance()
        );
                Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                        AddonRollingStockItems.minecartSJLittDa.item,
                        new TrainRecord("SJ Litterera Da", Swedish_PackEntityLocoElectricSJLittDa.class, AddonRollingStockItems.minecartSJLittDa.item,
                                EnumTrainType.Electric, 0, new String[]{"Red","Orange","Pink","Purple","Blue","Green","Magenta","LightBlue"}, 12).setMHP(2470).setMaxSpeed(101).setFuelConsumption(10)
                                .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-2.75),
                        Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittDm.item,
                new TrainRecord("SJ Litterera Dm", Swedish_PackEntityLocoElectricSJLittDm.class, AddonRollingStockItems.minecartSJLittDm.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue","Lime","LightGrey","Cyan","Pink","Purple","Brown","Orange","Red","Skin16","Skin17","Skin18","Skin19"}, 12).setMHP(6400).setMaxSpeed(76).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-4.0),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittDm3.item,
                new TrainRecord("Litterera Dm3", Swedish_PackEntityFreightSJLittDm3.class, AddonRollingStockItems.minecartSJLittDm3.item,
                        EnumTrainType.Boxcar, 0,
                        new String[]{"Brown","Red","Blue"}, 12).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: Redstone"}),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittOaA.item,
                new TrainRecord("SJ Litterera OaA", Swedish_PackEntityLocoElectricSJLittOa.class, AddonRollingStockItems.minecartSJLittOaA.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue"}, 12).setMHP(1632).setMaxSpeed(61).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.4).setBrakeRate(0.6).setBogieLocoPosition(-2.95),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittObA.item,
                new TrainRecord("SJ Litterera ObA", Swedish_PackEntityLocoElectricSJLittOb.class, AddonRollingStockItems.minecartSJLittObA.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue"}, 12).setMHP(1632).setMaxSpeed(61).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.5).setBrakeRate(0.7).setBogieLocoPosition(-2.95),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittOc.item,
                new TrainRecord("SJ Litterera Oc", Swedish_PackEntityLocoElectricSJLittOc.class, AddonRollingStockItems.minecartSJLittOc.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue"}, 12).setMHP(1000).setMaxSpeed(61).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.5).setBrakeRate(0.7).setBogieLocoPosition(-3.175),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittOd.item,
                new TrainRecord("SJ Litterera Od", Swedish_PackEntityLocoElectricSJLittOd.class, AddonRollingStockItems.minecartSJLittOd.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue"}, 12).setMHP(1129).setMaxSpeed(61).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.5).setBrakeRate(0.6).setBogieLocoPosition(-3.4),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittOe.item,
                new TrainRecord("SJ Litterera Oe", Swedish_PackEntityLocoElectricSJLittOe.class, AddonRollingStockItems.minecartSJLittOe.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black"}, 12).setMHP(2883).setMaxSpeed(61).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.4).setBrakeRate(0.6).setBogieLocoPosition(-2.975),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittOf.item,
                new TrainRecord("SJ Litterera Of", Swedish_PackEntityLocoElectricSJLittOf.class, AddonRollingStockItems.minecartSJLittOf.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black","White"}, 12).setMHP(2801).setMaxSpeed(61).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.4).setBrakeRate(0.6).setBogieLocoPosition(-2.975),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittOfs.item,
                new TrainRecord("SJ Litterera Ofs", Swedish_PackEntityLocoElectricSJLittOfs.class, AddonRollingStockItems.minecartSJLittOfs.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue"}, 12).setMHP(2801).setMaxSpeed(61).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.4).setBrakeRate(0.6).setBogieLocoPosition(-3),
                Instance()
        );

        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittFel.item,
                new TrainRecord("SJ Litterera Fel", Swedish_PackEntityLocoElectricSJLittFel.class, AddonRollingStockItems.minecartSJLittFel.item,
                        EnumTrainType.Electric, 0, new String[]{"Red","Orange"}, 12).setMHP(3459).setMaxSpeed(136).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.7).setBrakeRate(0.9).setBogieLocoPosition(-3.0),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittX16.item,
                new TrainRecord("SJ Litterera X16", Swedish_PackEntityLocoElectricSJLittX16.class, AddonRollingStockItems.minecartSJLittX16.item,
                        EnumTrainType.Electric, 0, new String[]{"Yellow","Blue","Green","Black"}, 12).setMHP(800).setMaxSpeed(111).setFuelConsumption(10)
                        .setHeatingTime(170).setAccelerationRate(0.5).setBrakeRate(0.6).setBogieLocoPosition(-4.4),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittY6.item,
                new TrainRecord("SJ Litterera Y6", Swedish_PackEntityLocoDieselSJLittY6.class, AddonRollingStockItems.minecartSJLittY6.item,
                        EnumTrainType.Diesel, 0, new String[]{"Yellow","Blue"}, 8,
                        0, 0.6, 116, 800,
                        45, 180, 0.5, -4.4f, 8000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittT31.item,
                new TrainRecord("SJ Litterera T31", Swedish_PackEntityLocoDieselSJLittT31.class, AddonRollingStockItems.minecartSJLittT31.item,
                        EnumTrainType.Diesel, 0, new String[]{"Yellow","Blue","Green","Black"}, 8,
                        0, 0.6, 81, 790,
                        45, 180, 0.5, -2.275f, 1500),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittT21.item,
                new TrainRecord("SJ Litterera T21", Swedish_PackEntityLocoDieselSJLittT21.class, AddonRollingStockItems.minecartSJLittT21.item,
                        EnumTrainType.Diesel, 0, new String[]{"Yellow","Blue","Green","Black"}, 8,
                        0, 0.6, 81, 790,
                        45, 180, 0.5, -3.1f, 1500),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittT23.item,
                new TrainRecord("SJ Litterera T23", Swedish_PackEntityLocoDieselSJLittT23.class, AddonRollingStockItems.minecartSJLittT23.item,
                        EnumTrainType.Diesel, 0, new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue","Lime","LightGrey","Cyan","Pink","Purple","Brown","Orange","Red","Skin16","Skin17","Skin18","Skin19"}, 8,
                        0, 0.6, 81, 790,
                        45, 180, 0.5, -3.5f, 1500),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittB1909.item,
                new TrainRecord("SJ Litterera B1909", Swedish_PackEntityLocoSteamSJLittB1909.class, AddonRollingStockItems.minecartSJLittB1909.item,
                        EnumTrainType.Steam, 0,
                        new String[]{"Yellow","Blue","Green","Black","White","Grey"},
                        8,
                        0, 0.6, 91, 1236,
                        45, 180, 0.5, -3.7f, 2500),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittB1919.item,
                new TrainRecord("SJ Litterera B1919", Swedish_PackEntityLocoSteamSJLittB1919.class, AddonRollingStockItems.minecartSJLittB1919.item,
                        EnumTrainType.Steam, 0,
                        new String[]{"Yellow","Blue","Green","Black","White","Grey"},
                        8,
                        0, 0.7, 91, 1236,
                        45, 180, 0.5, -3.8f, 2500),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittE.item,
                new TrainRecord("SJ Litterera E", Swedish_PackEntityLocoSteamSJLittE.class, AddonRollingStockItems.minecartSJLittE.item,
                        EnumTrainType.Steam, 0,
                        new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue"},
                        8,
                        0, 0.7, 66, 1157,
                        45, 180, 0.5, -3.4f, 2000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittE2.item,
                new TrainRecord("SJ Litterera E2", Swedish_PackEntityLocoSteamSJLittE2.class, AddonRollingStockItems.minecartSJLittE2.item,
                        EnumTrainType.Steam, 0,
                        new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue"},
                        8,
                        0, 0.7, 71, 1157,
                        45, 180, 0.5, -3.8f, 2000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittF.item,
                new TrainRecord("SJ Litterera F", Swedish_PackEntityLocoSteamSJLittF.class, AddonRollingStockItems.minecartSJLittF.item,
                        EnumTrainType.Steam, 0,
                        new String[]{"Yellow","Blue","Green","Black","White","Grey","Magenta","LightBlue"},
                        8,
                        0, 0.6, 128, 1529,
                        45, 180, 0.4, -4.7f, 3500),
                Instance()
        );
       Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittLgns_081.item,
                new TrainRecord("Litterera Lgns-081", Swedish_PackEntityFreightSJLittLgns_081.class, AddonRollingStockItems.minecartSJLittLgns_081.item,
                       EnumTrainType.Flatcars, 0,
                       new String[]{"Blue","Green"}, 12).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),
                Instance()
       );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittLgs.item,
                new TrainRecord("Litterera Lgs", Swedish_PackEntityFreightSJLittLgs.class, AddonRollingStockItems.minecartSJLittLgs.item,
                        EnumTrainType.Flatcars, 0,
                        new String[]{"Blue"}, 12).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittUDFo20.item,
                new TrainRecord("Litterera UDFo20", Swedish_PackEntityFreightSJLittUDFo20.class, AddonRollingStockItems.minecartSJLittUDFo20.item,
                        EnumTrainType.Boxcar, 0,
                        new String[]{"Blue"}, 12).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittUBF6Y.item,
                new TrainRecord("Litterera UBF6Y", Swedish_PackEntityPassangerCombiSJLittUBF6Y.class, AddonRollingStockItems.minecartSJLittUBF6Y.item,
                        "passanger/combine", 0,
                        new String[]{"Blue","Green"}, 12).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittUb.item,
                new TrainRecord("Litterera Ub", Swedish_PackEntityPassangerSJLittUB.class, AddonRollingStockItems.minecartSJLittUb.item,
                        EnumTrainType.Passenger, 0,
                        new String[]{"Blue"}, 12),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittUFV.item,
                new TrainRecord("Litterera UFV", Swedish_PackEntityFreightSJLittUFV.class, AddonRollingStockItems.minecartSJLittUFV.item,
                        EnumTrainType.Boxcar, 0,
                        new String[]{"Blue"}, 12).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittATender.item,
                new TrainRecord("Litterera A Tender", Swedish_PackEntityTenderSJLittA.class, AddonRollingStockItems.minecartSJLittATender.item,
                        EnumTrainType.Tender, 0,
                        new String[]{"Blue","Red","Yellow"}, 14).setTankCapacity(15000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittCTender.item,
                new TrainRecord("Litterera C Tender", Swedish_PackEntityTenderSJLittC.class, AddonRollingStockItems.minecartSJLittCTender.item,
                        EnumTrainType.Tender, 0,
                        new String[]{"Blue","Red","Yellow"}, 14).setTankCapacity(12000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittFTender.item,
                new TrainRecord("Litterera F Tender", Swedish_PackEntityTenderSJLittF.class, AddonRollingStockItems.minecartSJLittFTender.item,
                        EnumTrainType.Tender, 0,
                        new String[]{"Blue"}, 14).setTankCapacity(14000),
                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittG.item,
                new TrainRecord("Litterera G", Swedish_PackEntityFreightSJLittG.class, AddonRollingStockItems.minecartSJLittG.item,
                        EnumTrainType.Boxcar, 0,
                        new String[]{"Blue","Red","Yellow"}, 12).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),

                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittElos.item,
                new TrainRecord("Litterera Elos", Swedish_PackEntityFreightSJLittElos.class, AddonRollingStockItems.minecartSJLittElos.item,
                        EnumTrainType.Flatcars, 0,
                        new String[]{"Blue","Red"}, 12).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),

                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittQ12.item,
                new TrainRecord("Litterera Q12", Swedish_PackEntityEntityWagonSJLittQ12.class, AddonRollingStockItems.minecartSJLittQ12.item,
                        EnumTrainType.Tankcar, 0,
                        new String[]{"Blue","Red"}, 12).setTankCapacity(14000),

                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittO.item,
                new TrainRecord("Litterera O", Swedish_PackEntityFreightSJLittO.class, AddonRollingStockItems.minecartSJLittO.item,
                        EnumTrainType.Flatcars, 0,
                        new String[]{"Blue","Red","Yellow","Green"}, 12).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),

                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittOs.item,
                new TrainRecord("Litterera Os", Swedish_PackEntityFreightSJLittOs.class, AddonRollingStockItems.minecartSJLittOs.item,
                        EnumTrainType.Flatcars, 0,
                        new String[]{"Blue","Red"}, 12).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),

                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittOs_w.item,
                new TrainRecord("Litterera Os-w", Swedish_PackEntityFreightSJLittOs_w.class, AddonRollingStockItems.minecartSJLittOs_w.item,
                        EnumTrainType.Flatcars, 0,
                        new String[]{"Blue","Red"}, 12).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),

                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittOa.item,
                new TrainRecord("Litterera Oa", Swedish_PackEntityFreightSJLittOaVagn.class, AddonRollingStockItems.minecartSJLittOa.item,
                        EnumTrainType.Flatcars, 0,
                        new String[]{"Blue"}, 12).setCargoCapacity(36).setAdditionalTooltip(new String[]{"Cargo: any"}),

                Instance()
        );
        Traincraft.traincraftRegistry.RegisterRollingStockEntity(
                AddonRollingStockItems.minecartSJLittM1.item,
                new TrainRecord("Litterera M1", Swedish_PackEntityFreightSJLittM1.class, AddonRollingStockItems.minecartSJLittM1.item,
                        EnumTrainType.Flatcars, 0,
                        new String[]{"Blue","Red","Yellow","Green"}, 12).setCargoCapacity(18).setAdditionalTooltip(new String[]{"Cargo: any"}),

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
