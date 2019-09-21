package strategy.gun;

/**
 * 步枪
 */
public class Rifle extends Weapon {

    @Override
    protected void preAction() {
        System.out.println("身体蹲下降低后坐力");
        System.out.println("掏出步枪");
        System.out.println("打开 3 倍镜");
    }

    @Override
    protected void shoot() {
        System.out.println("开枪射击");
    }
}
