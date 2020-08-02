package attribute_annotation;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : wangwenhan
 * @since : 2020/8/2
 */
@Data
@AllArgsConstructor
public class Enterprise {
    private String name;
    @Leakage
    private String codeHubName;
}
