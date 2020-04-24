package parallel_stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

@Data
@AllArgsConstructor
public class Girl {

    private String name;

    @SneakyThrows
    void playWithBody(BadBoy badBoy) {
        System.out.println(name + "开始和" + badBoy.getName() + "玩");
        doSomethingMySelf();
        System.out.println(name + "玩完了");
    }

    @SneakyThrows
    void playWithBody(ParallelBadBoy badBoy) {
        System.out.println(name + "开始和" + badBoy.getName() + "玩");
        doSomethingMySelf();
        System.out.println(name + "玩完了");
    }

    private void doSomethingMySelf() throws InterruptedException {
        //'睡觉' 1 秒完事
        Thread.sleep(500);
        System.out.println(name + "自己吃饭, 化妆, 发微博");
        Thread.sleep(500);

    }
}
