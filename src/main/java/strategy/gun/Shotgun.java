package strategy.gun;

/**
 * 散弹枪
 */
public class Shotgun extends Weapon {

    @Override
    protected void preAction() {
        System.out.println("身体站直, 瞄准");
    }

    @Override
    protected void shoot() {
        System.out.println("打一枪算一枪");
    }
}
