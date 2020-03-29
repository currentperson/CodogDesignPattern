package dependency_injection;

import lombok.Data;

@Data
public class People {

    private String name;

    private Mother mother;

    public void callMother() {
        System.out.println(this.name + "的妈妈能" + mother.findThing());
    }
}
