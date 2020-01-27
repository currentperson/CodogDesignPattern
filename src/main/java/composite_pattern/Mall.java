package composite_pattern;

import lombok.Data;

@Data
public class Mall {

    private String name;

    public Mall(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println("给" + name + "商场区域消毒");
    }

}
