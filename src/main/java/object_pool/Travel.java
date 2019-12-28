package object_pool;

import object_pool.better.BicycleObjectPool;

public class Travel {
    public static void fromA2BByBicycle() {
        System.out.println("from A to B by" + new Bicycle("yellow", 1, true));
    }

    public static final BicycleObjectPool BICYCLE_OBJECT_POOL = new BicycleObjectPool();
    public static void fromA2BByBicycleFromPool() {
        Bicycle bicycle = BICYCLE_OBJECT_POOL.checkOut();
        System.out.println("" + bicycle);
        BICYCLE_OBJECT_POOL.checkIn(bicycle);
    }
}
