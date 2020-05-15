package producer_consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

import java.util.List;

@Data
@AllArgsConstructor
//'消费者'
public class Consumer {

    private String name;

    public void receiveGood(List<Good> goodList) {
        back2Home();
        System.out.println(name + "收到了" + goodList.toString());
    }

    //返回家中
    @SneakyThrows
    private void back2Home() {
        Thread.sleep(1000);
    }
}
