package mutex;

import lombok.SneakyThrows;
import org.apache.commons.lang3.StringUtils;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author : wangwenhan
 * @since : 2020/5/30
 */
public class App {

    public static void main(String[] args) {
        AirdropBox airdropBox = new AirdropBox();
        Player nbBoy = new Player();
        Player ljBoy = new Player();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        App app = new App();
        Future<?> nbSubmit = executorService.submit(() -> app.takeGoodsFromAirDrop(nbBoy, airdropBox));
        Future<?> ljSubmit = executorService.submit(() -> app.takeGoodsFromAirDrop(ljBoy, airdropBox));
        while (!nbSubmit.isDone() && !ljSubmit.isDone()) {
        }
        System.out.println("大神的装备:" + nbBoy.toString());
        System.out.println("我的装备:" + ljBoy.toString());
        executorService.shutdown();
    }

    @SneakyThrows
    public synchronized void takeGoodsFromAirDrop(Player player, AirdropBox airdropBox) {
        Thread.sleep(randomMillis());
        player.setGunName(airdropBox.getGunName());

        Thread.sleep(randomMillis());
        player.setLevel3Armor(airdropBox.getLevel3Armor());

        Thread.sleep(randomMillis());
        player.setLevel3Head(airdropBox.getLevel3Head());

        Thread.sleep(randomMillis());
        player.setLuckClothes(airdropBox.getLuckClothes());

        airdropBox.setLevel3Armor(StringUtils.EMPTY);
        airdropBox.setLevel3Head(StringUtils.EMPTY);
        airdropBox.setGunName(StringUtils.EMPTY);
        airdropBox.setLuckClothes(StringUtils.EMPTY);
    }

    private static int randomMillis() {
        return 100 + new Random().nextInt(1000);
    }
}
