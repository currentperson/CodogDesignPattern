package converter;

import java.time.LocalDate;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Goddess goddess = new Goddess();
        goddess.setName("翠花");
        goddess.setBirthday(LocalDate.of(2009,1,1));
        goddess.setPhoneNumber("13820802870");
        //生产上是 bean, 单例模式
        System.out.println(new Goddess2GirlFriendConverter().transform(goddess));
        System.out.println(new Goddess2GirlFriendConverter().transformList(Arrays.asList(goddess)));
    }
}
