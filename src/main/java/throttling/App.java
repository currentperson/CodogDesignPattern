package throttling;

import throttling.better.WuyiRemoteService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        RemoteService remoteService = new WuyiRemoteService();//new DangDangRemoteService();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> {
            for (int i = 0; i < 3; i++) {
                GuoQingClient guoQingClient = new GuoQingClient();
                guoQingClient.setClientName("GUOQING");
                guoQingClient.setRemoteService(remoteService);
                guoQingClient.action();
                sleep();
            }
        });
        executorService.execute(() -> {
            for (int i = 0; i < 3; i++) {
                GuoQingClient guoQingClient = new GuoQingClient();
                guoQingClient.setClientName("OTHERS");
                guoQingClient.setRemoteService(remoteService);
                guoQingClient.action();
                sleep();
            }
        });
        executorService.shutdown();
    }

    private static void sleep() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
