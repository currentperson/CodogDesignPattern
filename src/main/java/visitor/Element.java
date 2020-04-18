package visitor;

public interface Element<R, P> {
    R accept(ElementVisitor<R, Element, P> v, P p);
}
