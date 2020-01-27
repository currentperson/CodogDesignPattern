package composite_pattern.better;

import lombok.Data;

@Data
public class School extends AbstractLeafPlace {
    private String name;

    public School(String name) {
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("给" + name + "学校区域消毒");
    }
}
