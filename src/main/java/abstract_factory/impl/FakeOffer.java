package abstract_factory.impl;

import abstract_factory.Offer;

/**
 * @author : wangwenhan
 * @since : 2020/8/21
 */
public class FakeOffer extends Offer {

    public FakeOffer() {
        this.universityName = "家里蹲大学";
    }

    @Override
    public void print() {
        System.out.println("假的 offer: " + this.universityName);
    }
}
