package observer;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PersonObserver implements Observer<COVID19MessageObervable, PersonObserver,String> {

    private String name;

    @Override
    public void update(COVID19MessageObervable subject, String argument) {
        System.out.println("你好" + name + ", 赶紧囤 " + argument + " 吧");
    }
}
