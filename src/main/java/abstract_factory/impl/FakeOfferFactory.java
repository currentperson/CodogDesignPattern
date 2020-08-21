package abstract_factory.impl;

import abstract_factory.Offer;
import abstract_factory.OfferFactory;
import abstract_factory.Paper;
import abstract_factory.Seal;

/**
 * @author : wangwenhan
 * @since : 2020/8/21
 */
public class FakeOfferFactory implements OfferFactory {
    @Override
    public Offer createOffer() {
        return new FakeOffer();
    }

    @Override
    public Paper createPaper() {
        return new FakePaper();
    }

    @Override
    public Seal createSeal() {
        return new FakeSeal();
    }
}
