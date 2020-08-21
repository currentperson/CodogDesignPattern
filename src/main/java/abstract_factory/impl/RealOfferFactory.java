package abstract_factory.impl;

import abstract_factory.Offer;
import abstract_factory.OfferFactory;
import abstract_factory.Paper;
import abstract_factory.Seal;

/**
 * @author : wangwenhan
 * @since : 2020/8/21
 */
public class RealOfferFactory implements OfferFactory {
    @Override
    public Offer createOffer() {
        return new RealOffer();
    }

    @Override
    public Paper createPaper() {
        return new RealPaper();
    }

    @Override
    public Seal createSeal() {
        return new RealSeal();
    }
}
