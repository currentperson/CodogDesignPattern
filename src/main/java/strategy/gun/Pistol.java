package strategy.gun;

/**
 * 手枪类
 */
public class Pistol extends Weapon {
    @Override
    protected void preAction() {
        System.out.println("快速走过去");
    }

    @Override
    protected void shoot() {
        System.out.println("掏出手枪打死他");
    }
}
