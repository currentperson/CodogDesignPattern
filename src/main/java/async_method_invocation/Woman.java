package async_method_invocation;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

/**
 * @author : wangwenhan
 * @since : 2020/5/23
 */
@Data
@AllArgsConstructor
public class Woman {
    private String name;
    private LocalDate birthday;
}
