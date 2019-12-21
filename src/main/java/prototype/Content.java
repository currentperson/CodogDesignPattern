package prototype;

import lombok.Data;
import lombok.SneakyThrows;

@Data
public class Content {
    private String text;
    private String picture;

    @SneakyThrows
    public Content(String text, String picture) {
        this.text = text;
        this.picture = picture;
        //很耗时的操作
        Thread.sleep(1000);
    }
}
