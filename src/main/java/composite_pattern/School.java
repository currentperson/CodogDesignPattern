package composite_pattern;

import lombok.Data;

@Data
public class School {

    private String name;

    public School(String name) {
        this.name = name;
    }

    public void killVirus() {
        System.out.println("给" + name + "学校区域消毒");
    }
}
