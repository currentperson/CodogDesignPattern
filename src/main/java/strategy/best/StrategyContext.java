package strategy.best;

import strategy.best.request.WeaponStrategyRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * 策略上下文, 用来路由策略
 */
public class StrategyContext {

    public static final List<WeaponStrategy> WEAPON_STRATEGYS = new ArrayList<>();

    static {
        WEAPON_STRATEGYS.add(new PanStrategy());
        WEAPON_STRATEGYS.add(new PistolStrategy());
        WEAPON_STRATEGYS.add(new RifleStrategy());
        WEAPON_STRATEGYS.add(new ShotgunStrategy());
        WEAPON_STRATEGYS.add(new SniperRifleStrategy());
        WEAPON_STRATEGYS.add(new SubmachineGunStrategy());
    }

    public static void execute(Integer distance) {
        WEAPON_STRATEGYS.stream().filter((weaponStrategy -> {
            Range<Integer> integerRange = weaponStrategy.queryDistanceRange();
            return integerRange.inRange(distance);
        })).findAny().get().executeStrategy(new WeaponStrategyRequest(distance));
    }
}
