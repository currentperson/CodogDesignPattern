package strategy.gun;

/**
 * 冲锋枪
 */
public class SubmachineGun extends Weapon {

    @Override
    protected void preAction() {
        System.out.println("身体站直, 心态稳住");
    }

    @Override
    protected void shoot() {
        System.out.println("掏出冲锋枪打死他");
    }
}
