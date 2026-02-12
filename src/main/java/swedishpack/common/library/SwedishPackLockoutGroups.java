package swedishpack.common.library;

import train.common.utils.lockout.ILockoutGroup;


    public enum SwedishPackLockoutGroups implements ILockoutGroup {
        SP("27cd7ba7-00f0-4de8-a1f0-f1e1940265ca"),
        EJ("16fd65e0-409d-4093-8a27-25fba6018c84"),
        FTR("27cd7ba7-00f0-4de8-a1f0-f1e1940265ca")
        ;




//27cd7ba7-00f0-4de8-a1f0-f1e1940265ca Foxo
//16fd65e0-409d-4093-8a27-25fba6018c84 Electrics



        final String GroupDefaultUUIDOwner;

        SwedishPackLockoutGroups() { GroupDefaultUUIDOwner = "SYSTEM"; }

        SwedishPackLockoutGroups(String groupDefaultUUIDOwner) { GroupDefaultUUIDOwner = groupDefaultUUIDOwner; }

        @Override
        public String groupUUIDOwner() { return GroupDefaultUUIDOwner; }




    }
