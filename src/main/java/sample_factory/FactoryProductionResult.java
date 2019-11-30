package sample_factory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FactoryProductionResult<T> {

    public static final FactoryProductionResult NULL = new FactoryProductionResult<>(Boolean.FALSE, null);
    private Boolean isExisted;
    private T production;
}
