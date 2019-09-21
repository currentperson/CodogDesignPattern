package strategy;

import builder.annotation.BadSmell;

/**
 * 面条式代码判断最强武器
 */
public class NoodlesKillProcessor {

    /**
     * 根据距离判断最好的武器击杀对手
     * @param distance
     */
    @BadSmell
    public static void killByDistance(int distance) {
        if(distance < 0) {
            throw new RuntimeException("距离咋还能是负数呢? 我以为只要我能 -20 cm 呢?");
        }

        if(distance >= 0 && distance < 1) {
            System.out.println("发现敌人");
            System.out.println("二步快速走过去");
            System.out.println("掏出平底锅呼死他");
            return;
        }
        if(distance >= 1 && distance < 10) {
            System.out.println("发现敌人");
            System.out.println("快速走过去");
            System.out.println("掏出手枪打死他");
            return;
        }
        if(distance >= 10 && distance < 20) {
            System.out.println("发现敌人");
            System.out.println("身体站直, 瞄准");
            System.out.println("打一枪算一枪");
            return;
        }
        if(distance >= 20 && distance < 100) {
            System.out.println("发现敌人");
            System.out.println("身体站直, 心态稳住");
            System.out.println("掏出冲锋枪打死他");
            return;
        }
        if(distance >= 100 && distance < 1000) {
            System.out.println("发现敌人");
            System.out.println("身体蹲下降低后坐力");
            System.out.println("掏出步枪");
            System.out.println("打开 3 倍镜");
            System.out.println("开枪射击");
            return;
        }
        if(distance >= 1000) {
            System.out.println("发现敌人");
            System.out.println("趴在草丛里苟着");
            System.out.println("掏出狙击枪");
            System.out.println("打开 8 倍镜");
            System.out.println("开枪射击");
            return;
        }
    }
}
