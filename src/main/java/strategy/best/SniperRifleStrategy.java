package strategy.best;

import strategy.gun.Weapon;

/**
 * 狙击枪
 */
public class SniperRifleStrategy extends WeaponStrategy {

    @Override
    protected void preAction() {
        System.out.println("趴在草丛里苟着");
        System.out.println("掏出狙击枪");
        System.out.println("打开 8 倍镜");
    }

    @Override
    protected void shoot() {
        System.out.println("开枪射击");
    }

    @Override
    protected Range<Integer> queryDistanceRange() {
        return new Range<>(1000, Integer.MAX_VALUE);
    }
}
