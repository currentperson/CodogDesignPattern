package object_pool;

public class App {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Travel.fromA2BByBicycleFromPool();
        }
    }
}
