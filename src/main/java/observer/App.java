package observer;

public class App {

    public static void main(String[] args) {
        COVID19MessageObervable newHotWorld = new COVID19MessageObervable();
        newHotWorld.addObserver(new PersonObserver("codog"));
        newHotWorld.addObserver(new PersonObserver("兰兰"));
        newHotWorld.notifyObservers("口罩 + 酒精");
        newHotWorld.notifyObservers("清瘟胶囊");
        newHotWorld.notifyObservers("双黄连口服液");
    }
}
