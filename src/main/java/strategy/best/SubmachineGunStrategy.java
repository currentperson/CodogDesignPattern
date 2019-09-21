package strategy.best;

import strategy.gun.Weapon;

/**
 * 冲锋枪
 */
public class SubmachineGunStrategy extends WeaponStrategy {

    @Override
    protected void preAction() {
        System.out.println("身体站直, 心态稳住");
    }

    @Override
    protected void shoot() {
        System.out.println("掏出冲锋枪打死他");
    }

    @Override
    protected Range<Integer> queryDistanceRange() {
        return new Range<>(20, 100);
    }
}
