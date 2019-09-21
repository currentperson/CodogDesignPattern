package strategy.best.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import strategy.request.AbstractStrategyRequest;

/**
 * weapon 的入参
 */
@Data
@AllArgsConstructor
public class WeaponStrategyRequest extends AbstractStrategyRequest {

    /**
     * 距离
     */
    private Integer distance;
}
