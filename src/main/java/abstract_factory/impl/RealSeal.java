package abstract_factory.impl;

import abstract_factory.Seal;

/**
 * @author : wangwenhan
 * @since : 2020/8/21
 */
public class RealSeal extends Seal {

    public RealSeal() {
        this.name="高等院校印章";
    }

    @Override
    public void print() {
        System.out.println("真的印章: " + this.name);
    }
}
