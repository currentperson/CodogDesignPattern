package sample_factory;

import java.util.Map;

public class SampleFacoryUtil {

    public static final <E extends Enum<E>, T>
        FactoryProductionResult<T> createProdction(E type, Map<E, T> type2Production) {
            T production = type2Production.get(type);
            return production == null ? FactoryProductionResult.NULL : new FactoryProductionResult<>(Boolean.TRUE, production);
    }
}
