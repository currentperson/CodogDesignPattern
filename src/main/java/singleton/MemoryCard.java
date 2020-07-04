package singleton;

import lombok.ToString;

//内存卡
/*@Data
public class MemoryCard {

    private Integer size = 1024;

    private String content = "资深程序员吓倒丈母娘.MP4";
}*/
@ToString
public enum MemoryCard {

    INSTANCE(1024,"资深程序员吓倒丈母娘.MP4");

    private Integer size;

    private String content;

    MemoryCard(Integer size, String content) {
        this.size = size;
        this.content = content;
    }

    public void setNull() {
        this.content = "";
    }
}
