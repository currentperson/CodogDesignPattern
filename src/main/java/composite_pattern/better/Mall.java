package composite_pattern.better;

import lombok.Data;

@Data
public class Mall extends AbstractLeafPlace {
    private String name;

    public Mall(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("给" + name + "商场区域消毒");
    }
}
