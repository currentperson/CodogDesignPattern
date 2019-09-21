package strategy.gun;

/**
 * 狙击枪
 */
public class SniperRifle extends Weapon {

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
}
