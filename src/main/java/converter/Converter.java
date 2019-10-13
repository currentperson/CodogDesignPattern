package converter;

import java.util.List;
import java.util.stream.Collectors;

public interface Converter<S, T> {

    T transform(S source);

    default List<T> transformList(List<S> sources) {
        return sources.stream().map(this::transform).collect(Collectors.toList());
    }
}
