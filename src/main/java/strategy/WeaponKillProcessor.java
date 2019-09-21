package strategy;

import builder.annotation.BadSmell;
import strategy.gun.Pan;
import strategy.gun.Pistol;
import strategy.gun.Rifle;
import strategy.gun.Shotgun;
import strategy.gun.SniperRifle;
import strategy.gun.SubmachineGun;
import strategy.gun.Weapon;

/**
 * 抽象出类代码判断最强武器
 */
public class WeaponKillProcessor {

    /**
     * 根据距离判断最好的武器击杀对手
     *
     * @param distance
     */
    @BadSmell
    public static void killByDistance(int distance) {
        if (distance < 0) {
            throw new RuntimeException("距离咋还能是负数呢? 我以为只要我能 -20 cm 呢?");
        }
        Weapon weapon = null;

        if (distance >= 0 && distance < 1) {
            weapon = new Pan();
        } else if (distance >= 1 && distance < 10) {
            weapon = new Pistol();
        } else if (distance > 10 && distance < 20) {
            weapon = new Shotgun();
        } else if (distance >= 20 && distance < 100) {
            weapon = new SubmachineGun();
        } else if (distance >= 100 && distance < 1000) {
            weapon = new Rifle();
        } else if (distance >= 1000) {
            weapon = new SniperRifle();
        }
        weapon.kill();
    }
}
