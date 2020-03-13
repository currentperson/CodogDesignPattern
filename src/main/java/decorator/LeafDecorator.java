package decorator;

public class LeafDecorator extends Decorator {

    public LeafDecorator(Component component) {
        super(component);
    }

    @Override
    public String showPicture() {
        return component.showPicture() + "加上绿色叶子";
    }
}
