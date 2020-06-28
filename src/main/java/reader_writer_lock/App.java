package reader_writer_lock;

import static java.lang.Thread.sleep;

import lombok.SneakyThrows;

import java.time.LocalDateTime;
import java.util.stream.IntStream;

/**
 * @author : wangwenhan
 * @since : 2020/6/19
 */
public class App {

    @SneakyThrows
    public static void main(String[] args) {
        Thread runnable = new Thread() {
            @Override
            public void run() {
                IntStream.range(0,100).forEach(
                    (i) ->
                    {
                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        BadEvent p8 = new BadEvent("无名P8",
                            "对应聘人员语言骚扰, 触碰红线, 员工消失", LocalDateTime.now());
                        BadEvent jf = new BadEvent("蒋凡", "出轨网红, 触碰红线, 红线消失",
                            LocalDateTime.now());
                        BadEvent badEvent = i < 50 ?
                            jf
                            : p8;
                        //System.out.println(badEvent);
                        BadEventPool.badEventList.add(badEvent);
                    }
                );
            }
        };
        runnable.start();

        sleep(2000);
        String newBadPeopleName = BadEventPool.findNewBadEventPeopleName();
        sleep(5000);
        String newBadEventName = BadEventPool.findNewBadEventName();
        System.out.println("result: " + newBadPeopleName + newBadEventName);
    }
}
