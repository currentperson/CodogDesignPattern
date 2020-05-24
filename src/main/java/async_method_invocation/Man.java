package async_method_invocation;

import lombok.Data;
import lombok.SneakyThrows;

import java.time.LocalDate;

/**
 * @author : wangwenhan
 * @since : 2020/5/23
 */
@Data
public class Man {
    private String name;
    private LocalDate birthday;
    private String childName;

    @SneakyThrows
    public String playWithWoman(Woman woman) {
        Thread.sleep(2000);
        return this.name.equals("陈军") ? "陈军的孩子" : "";
    }
}
