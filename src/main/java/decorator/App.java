package decorator;

public class App {
    public static void main(String[] args) {
        Component hand = new Hand();
        System.out.println(new MusicDecorator(new LeafDecorator(new FlowDecorator(hand))).showPicture());
    }
}
