package template_method.strategy.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import strategy.response.AbstractStrategyResponse;
import template_method.strategy.enums.MedicineType;

import java.math.BigDecimal;

/**
 * 返回药品类型
 */
@Getter
@AllArgsConstructor
public class SeeTheDoctorStrategyResponse extends AbstractStrategyResponse {
    /**
     * 药品类型
     */
    private MedicineType medicineType;
}
