package abstract_factory;

import abstract_factory.impl.RealOfferFactory;

/**
 * @author : wangwenhan
 * @since : 2020/8/21
 */
public class App {
    public static void main(String[] args) {
        OfferFactory offerFactory = new RealOfferFactory();
        offerFactory.createOffer().print();
        offerFactory.createPaper().print();
        offerFactory.createSeal().print();
    }
}
