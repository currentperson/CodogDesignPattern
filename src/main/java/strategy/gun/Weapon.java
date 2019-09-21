package strategy.gun;

/**
 * 抽象的枪
 */
public abstract class Weapon {

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
     * 杀人的动作
     */
    public void kill() {
        findEnemy();
        preAction();
        shoot();
    }
}
