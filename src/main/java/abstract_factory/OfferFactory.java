package abstract_factory;

/**
 * @author : wangwenhan
 * @since : 2020/8/21
 */
public interface OfferFactory {

    Offer createOffer();

    Paper createPaper();

    Seal createSeal();
}
