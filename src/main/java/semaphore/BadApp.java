package semaphore;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : wangwenhan
 * @since : 2020/6/6
 */
public class BadApp {

    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People("小李", Arrays.asList(new Goods("小李皮鞋"), new Goods("小李运动鞋"))));
        peopleList.add(new People("小王", Arrays.asList(new Goods("小王西瓜"), new Goods("小王椰子"))));
        peopleList.add(new People("小张", Arrays.asList(new Goods("小张肥皂"), new Goods("小张洗衣液"))));
        List<Stall> stallList = new ArrayList<>();
        stallList.add(new Stall(1,"摊位一",new ArrayList<>()));
        stallList.add(new Stall(2,"摊位二",new ArrayList<>()));
        peopleList.parallelStream().forEach(
                (people) -> {
                    for (Stall stall : stallList) {
                        if(stall.getSaleGoods().isEmpty()) {
                            stall.setName(people.getName() + "的摊位");
                            //摆放货物中
                            putGoods2Stall();
                            stall.setSaleGoods(people.getSaleGoods());
                        }
                    }
                }
        );
        System.out.println(stallList.toString());
    }

    @SneakyThrows
    public static void putGoods2Stall() {
        Thread.sleep(2000);
    }
}
