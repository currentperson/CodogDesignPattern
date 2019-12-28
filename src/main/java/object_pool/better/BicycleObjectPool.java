package object_pool.better;

import object_pool.Bicycle;

public class BicycleObjectPool extends ObjectPool<Bicycle> {

    @Override
    protected Bicycle create() {
        return new Bicycle("yellow", 1, true);
    }
}
