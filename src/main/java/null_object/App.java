package null_object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Man> mansWithGrilFriend = Arrays.asList(new Others(), new Me());

        for (Man man : mansWithGrilFriend) {
            AbstractGirlFriend girlFriend = man.queryGirlFriend();
            if(girlFriend == null) {
                continue;
            }
            System.out.println(girlFriend.queryName());
        }
    }
}
