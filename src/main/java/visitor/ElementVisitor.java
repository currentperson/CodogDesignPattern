package visitor;

public interface ElementVisitor<R, E, P> {
    R visit(E e, P p);
}
