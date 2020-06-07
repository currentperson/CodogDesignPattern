package semaphore;

import lombok.SneakyThrows;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

/**
 * @author : wangwenhan
 * @since : 2020/6/6
 */
public class App {

    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People("小李", Arrays.asList(new Goods("小李皮鞋"), new Goods("小李运动鞋"))));
        peopleList.add(new People("小王", Arrays.asList(new Goods("小王西瓜"), new Goods("小王椰子"))));
        peopleList.add(new People("小张", Arrays.asList(new Goods("小张肥皂"), new Goods("小张洗衣液"))));

        Semaphore semaphore = new Semaphore(2);

        peopleList.parallelStream().forEach(
                (people) -> {
                    try {
                        semaphore.acquire();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println(people.getName() + "开始摆摊");
                    Stall stall = new Stall();
                    stall.setName(people.getName() + "的摊位");
                    //摆放货物中
                    putGoods2Stall();
                    stall.setSaleGoods(people.getSaleGoods());
                    System.out.println(LocalDateTime.now() + "" + stall.toString());
                    semaphore.release();
                }
        );
    }

    @SneakyThrows
    public static void putGoods2Stall() {
        Thread.sleep(2000);
    }
}
