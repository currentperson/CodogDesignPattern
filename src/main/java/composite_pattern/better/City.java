package composite_pattern.better;

import lombok.Data;

@Data
public class City extends AbstractCompositePlace {
    private String name;

    public City(String name) {
        this.name = name;
    }
}
