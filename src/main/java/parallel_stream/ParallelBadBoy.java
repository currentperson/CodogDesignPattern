package parallel_stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

@Data
@AllArgsConstructor
public class ParallelBadBoy {
    private static final ForkJoinPool COLUMN_POOL = new ForkJoinPool(30);

    private String name;

    public void playWithGirls(List<Girl> girls) {
        COLUMN_POOL.submit(() -> girls.parallelStream().forEach(girl -> girl.playWithBody(this)));
    }
}
