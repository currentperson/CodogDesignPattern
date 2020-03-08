package tolerant_reader;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class GirlGod {

    private String name;

    private LocalDate birthday;

    private String weChatId;

    //是否正在学英语
    private Boolean makingLove;
}
