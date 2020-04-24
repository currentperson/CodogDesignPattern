package parallel_stream;

import com.sun.tools.javac.util.List;
import org.apache.commons.lang3.time.StopWatch;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        parallelStreamPlay();
    }

    private static void streamPlay() {
        StopWatch stopwatch = StopWatch.createStarted();
        BadBoy lzx = new BadBoy("空虚公子");
        lzx.playWithGirls(List.of(new Girl("周*青"), new Girl("花花董花花"), new Girl("张大*")));
        stopwatch.stop();
        System.out.println("total time: " + stopwatch.getTime(TimeUnit.SECONDS));
    }

    private static void parallelStreamPlay() {
        StopWatch stopwatch = StopWatch.createStarted();
        ParallelBadBoy lzx = new ParallelBadBoy("八爪鱼");
        lzx.playWithGirls(List.of(new Girl("周*青"), new Girl("花花董花花"), new Girl("张大*")));
        stopwatch.stop();
        System.out.println("total time: " + stopwatch.getTime(TimeUnit.SECONDS));
    }
}
