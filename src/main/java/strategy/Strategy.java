package strategy;

import strategy.request.AbstractStrategyRequest;
import strategy.response.AbstractStrategyResponse;

/**
 * 策略模式
 */
public interface Strategy<T extends AbstractStrategyRequest, R extends AbstractStrategyResponse> {
    /**
     * 执行策略
     * @param request
     * @return
     */
    R executeStrategy(T request);
}
