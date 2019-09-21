package strategy.best;

import strategy.gun.Weapon;

/**
 * 步枪
 */
public class RifleStrategy extends WeaponStrategy {

    @Override
    protected void preAction() {
        System.out.println("身体蹲下降低后坐力");
        System.out.println("掏出步枪");
        System.out.println("打开 3 倍镜");
    }

    @Override
    protected void shoot() {
        System.out.println("开枪射击");
    }

    @Override
    protected Range<Integer> queryDistanceRange() {
        return new Range<>(100, 1000);
    }
}
