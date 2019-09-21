package strategy.best;

import strategy.gun.Weapon;

/**
 * 平底锅
 */
public class PanStrategy extends WeaponStrategy {

    @Override
    protected void preAction() {
        System.out.println("二步快速走过去");
    }

    @Override
    protected void shoot() {
        System.out.println("掏出平底锅呼死他");
    }

    @Override
    protected Range<Integer> queryDistanceRange() {
        return new Range<>(0, 1);
    }
}
