package strategy.best;

import strategy.gun.Weapon;

/**
 * 散弹枪
 */
public class ShotgunStrategy extends WeaponStrategy {

    @Override
    protected void preAction() {
        System.out.println("身体站直, 瞄准");
    }

    @Override
    protected void shoot() {
        System.out.println("打一枪算一枪");
    }

    @Override
    protected Range<Integer> queryDistanceRange() {
        return new Range<>(10, 20);
    }
}
