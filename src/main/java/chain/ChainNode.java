package chain;

import chain.context.AbstractChainNodeContext;
import chain.request.AbstractChainNodeRequest;
import chain.response.AbstractChainNodeResponse;
import chain.response.ChainResult;

public interface ChainNode<T extends AbstractChainNodeResponse> {

    <C extends AbstractChainNodeContext, R extends AbstractChainNodeRequest> ChainResult<T> execute(C context, R request);
}
