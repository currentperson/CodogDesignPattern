package tolerant_reader;

import prototype.GsonUtil;

import java.time.LocalDate;

public class Me {

    public static MyGirlGod tolerantReading(String girlStr) {
        return GsonUtil.convert(girlStr, MyGirlGod.class);
    }

    public static void main(String[] args) {
        System.out.println(Me.tolerantReading(GsonUtil.toJson(new GirlGod("兰兰", LocalDate.now(), "13820802870", true))));
    }
}
