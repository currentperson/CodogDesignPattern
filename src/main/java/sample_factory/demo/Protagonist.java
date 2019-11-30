package sample_factory.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Protagonist {

    public static final Protagonist NULL = new Protagonist("无名氏","啥也不会");

    private String name;

    private String skill;
}
