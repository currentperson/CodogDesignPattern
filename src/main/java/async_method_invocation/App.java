package async_method_invocation;

import lombok.SneakyThrows;
import org.apache.commons.lang3.time.StopWatch;

import java.time.LocalDate;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author : wangwenhan
 * @since : 2020/5/23
 */
public class App {

    public static void main(String[] args) {
        StopWatch stopwatch = StopWatch.createStarted();
        Man manAfter80 = new Man();
        manAfter80.setBirthday(LocalDate.parse("1980-01-01"));
        manAfter80.setName("史睿生");
        Man manAfter70 = new Man();
        manAfter70.setBirthday(LocalDate.parse("1970-01-01"));
        manAfter70.setName("陈军");
        Woman woman = new Woman("张雨婷", LocalDate.parse("1990-01-01"));
        //playSequence(manAfter80, manAfter70, woman);
        playParallel(manAfter80, manAfter70, woman);
        stopwatch.stop();
        System.out.println("total time: " + stopwatch.getTime(TimeUnit.SECONDS));
    }

    private static void playSequence(Man manAfter80, Man manAfter70, Woman woman) {
        String childWith70 = manAfter70.playWithWoman(woman);
        manAfter80.playWithWoman(woman);
        manAfter80.setChildName(childWith70);
        System.out.println("manAfter80: " + manAfter80);
    }

    @SneakyThrows
    private static void playParallel(Man manAfter80, Man manAfter70, Woman woman) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> manAfter70.playWithWoman(woman));
        manAfter80.playWithWoman(woman);
        manAfter80.setChildName(future.get());
        System.out.println("manAfter80: " + manAfter80);
    }
}
