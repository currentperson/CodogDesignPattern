package decorator;

public class MusicDecorator extends Decorator {

    public MusicDecorator(Component component) {
        super(component);
    }

    @Override
    public String showPicture() {
        return component.showPicture() + "加上播放音乐";
    }
}
