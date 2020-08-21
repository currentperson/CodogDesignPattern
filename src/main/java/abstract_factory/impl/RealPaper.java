package abstract_factory.impl;

import abstract_factory.Paper;

/**
 * @author : wangwenhan
 * @since : 2020/8/21
 */
public class RealPaper extends Paper {

    public RealPaper() {
        this.color = "白色";
    }

    @Override
    public void print() {
        System.out.println("真的纸:" + this.color);
    }
}
