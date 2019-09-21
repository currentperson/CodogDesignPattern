package strategy.gun;

/**
 * 平底锅
 */
public class Pan extends Weapon {

    @Override
    protected void preAction() {
        System.out.println("二步快速走过去");
    }

    @Override
    protected void shoot() {
        System.out.println("掏出平底锅呼死他");
    }
}
