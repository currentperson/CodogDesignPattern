package builder;
import builder.domain.GirlFriendBuilder;
import builder.enums.CupEnum;
import java.time.LocalDateTime;
import builder.enums.ConstellationEnum;

import builder.domain.GirlFriend;

public class App {

    /**
     * 使用无参构造函数和 Setter 完成对象拼装
     */
    public static void buildGirlFriendWithSetter() {
        GirlFriend girlFriend = new GirlFriend();
        girlFriend.setBirthDay(LocalDateTime.now());
        girlFriend.setName("");
        girlFriend.setConstellation(null);
        girlFriend.setHometown("");
        girlFriend.setHeight(0);
        girlFriend.setWeight(0);
        girlFriend.setCup(null);
    }

    public static void main(String[] args) {
        GirlFriend cuiHuaGirlFriend = GirlFriendBuilder.aGirlFriend().withName("翠花").withHeight(168).withWeight(50).build();
        GirlFriend girlFriend = GirlFriend.builder().birthDay(LocalDateTime.now()).build();
    }
}
