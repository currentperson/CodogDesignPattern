package converter;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class Goddess2GirlFriendUtil {

    public static GirlFriend convertGoddess2GirlFriend(Goddess goddess) {
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
        return girlFriend;
    }

    public static List<GirlFriend> convertGoddess2GirlFriend(List<Goddess> goddess) {
        return goddess.stream().map(Goddess2GirlFriendUtil::convertGoddess2GirlFriend).collect(Collectors.toList());
    }
}
