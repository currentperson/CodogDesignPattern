package converter;

import java.time.LocalDate;

public class Goddess2GirlFriendConverter implements Converter<Goddess, GirlFriend> {

    @Override
    public GirlFriend transform(Goddess goddess) {
        if(goddess == null) {
            throw new RuntimeException("女神不能为空");
        }
        if("兰兰".equals(goddess.getName())) {
            throw new RuntimeException("兰兰不是女神");
        }
        GirlFriend girlFriend = new GirlFriend();
        girlFriend.setName(goddess.getName());
        //根据生日计算年龄
        girlFriend.setAge(LocalDate.now().getYear() - goddess.getBirthday().getYear());
        girlFriend.setPhoneNumber(goddess.getPhoneNumber());
        //此处可以设置 girlFriend 的邮箱了
        return girlFriend;
    }
}
