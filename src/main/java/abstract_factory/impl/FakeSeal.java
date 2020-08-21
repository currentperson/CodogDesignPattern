package abstract_factory.impl;

import abstract_factory.Seal;

/**
 * @author : wangwenhan
 * @since : 2020/8/21
 */
public class FakeSeal extends Seal {

    public FakeSeal() {
        this.name = "高度院校印章";
    }

    @Override
    public void print() {
        System.out.println("萝卜印章: " + this.name);
    }
}
