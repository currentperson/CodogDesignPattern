package composite_pattern.better;

import lombok.Data;

@Data
public class Province extends AbstractCompositePlace {

    private String name;

    public Province(String name) {
        this.name = name;
    }
}
