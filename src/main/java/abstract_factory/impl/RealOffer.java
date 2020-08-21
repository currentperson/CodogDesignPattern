package abstract_factory.impl;

import abstract_factory.Offer;

/**
 * @author : wangwenhan
 * @since : 2020/8/21
 */
public class RealOffer extends Offer {

    public RealOffer() {
        this.universityName = "清华大学";
    }

    @Override
    public void print() {
        System.out.println("真的 offer: " + this.universityName);
    }
}
