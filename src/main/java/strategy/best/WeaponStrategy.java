package strategy.best;

import strategy.Strategy;
import strategy.best.request.WeaponStrategyRequest;
import strategy.request.AbstractStrategyRequest;
import strategy.response.AbstractStrategyResponse;

/**
 * 抽象的枪
 */
public abstract class WeaponStrategy implements Strategy<WeaponStrategyRequest, AbstractStrategyResponse> {

    /**
     * 发现敌人
     */
    protected void findEnemy() {
        System.out.println("发现敌人");
    }

    /**
     * 开枪前的动作
     */
    protected abstract void preAction();

    /**
     * 开枪
     */
    protected abstract void shoot();

    /**
     * 获取距离范围
     * @return
     */
    protected abstract Range<Integer> queryDistanceRange();

    /**
     * 杀人的动作
     */
    public void kill() {
        findEnemy();
        preAction();
        shoot();
    }

    @Override
    public AbstractStrategyResponse executeStrategy(WeaponStrategyRequest request) {
        System.out.println("距离敌人 " + request.getDistance());
        kill();
        return null;
    }
}
