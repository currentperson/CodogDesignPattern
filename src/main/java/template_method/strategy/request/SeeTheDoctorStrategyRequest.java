package template_method.strategy.request;

import lombok.Data;
import strategy.request.AbstractStrategyRequest;

/**
 * 看病策略的入参
 */
@Data
public class SeeTheDoctorStrategyRequest extends AbstractStrategyRequest {
    /**
     * 年龄
     */
    private Integer age;
}
