package strategy.best;

import strategy.gun.Weapon;

/**
 * 手枪类
 */
public class PistolStrategy extends WeaponStrategy {
    @Override
    protected void preAction() {
        System.out.println("快速走过去");
    }

    @Override
    protected void shoot() {
        System.out.println("掏出手枪打死他");
    }

    @Override
    protected Range<Integer> queryDistanceRange() {
        return new Range<>(1, 10);
    }
}
