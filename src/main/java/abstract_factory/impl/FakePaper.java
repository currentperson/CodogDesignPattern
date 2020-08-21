package abstract_factory.impl;

import abstract_factory.Paper;

/**
 * @author : wangwenhan
 * @since : 2020/8/21
 */
public class FakePaper extends Paper {

    public FakePaper() {
        this.color = "绿色";
    }

    @Override
    public void print() {
        System.out.println("假的纸:" + this.color);
    }
}
