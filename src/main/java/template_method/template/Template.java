package template_method.template;

/**
 * 标记性接口, 说明是个模板类
 */
public interface Template<T,R> {

    T doAction();
}
