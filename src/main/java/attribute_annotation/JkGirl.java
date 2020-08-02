package attribute_annotation;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : wangwenhan
 * @since : 2020/8/2
 */
@Data
@AllArgsConstructor
public class JkGirl {
    private String name;
    private String cloth;
    //安全裤,,,
    @Leakage
    private String anquanku;
}
