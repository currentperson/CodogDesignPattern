package sample_factory;

import lombok.Data;

@Data
public class SampleFactoryParam<E extends Enum<E>> {
    private Enum<E> type;
}
