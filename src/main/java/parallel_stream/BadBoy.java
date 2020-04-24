package parallel_stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class BadBoy {

    private String name;

    public void playWithGirls(List<Girl> girls) {
        for (Girl girl : girls) {
            girl.playWithBody(this);
        }
    }
}
