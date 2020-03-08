package adapter.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HourseAdapter implements Horse {

    private Deer deer;

    @Override
    public void eat() {
        deer.eat();
    }

    @Override
    public void run() {
        deer.walk();
    }

    @Override
    public void sleep() {
        deer.sleep();
    }
}
