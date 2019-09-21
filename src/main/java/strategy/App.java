package strategy;

import strategy.best.StrategyContext;

public class App {

    public static void main(String[] args) {
        int distance = 89;
        //NoodlesKillProcessor.killByDistance(distance);
        StrategyContext.execute(89);
    }
}
