package decorator;

public class FlowDecorator extends Decorator {

    public FlowDecorator(Component component) {
        super(component);
    }

    @Override
    public String showPicture() {
        return component.showPicture() + "加上鲜花";
    }
}
