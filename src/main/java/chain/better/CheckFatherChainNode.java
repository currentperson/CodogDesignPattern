package chain.better;

import chain.ChainNode;
import chain.context.AbstractChainNodeContext;
import chain.request.AbstractChainNodeRequest;
import chain.response.ChainResult;


public abstract class CheckFatherChainNode implements ChainNode<FatherNameChainNodeResponse> {

    @Override
    public ChainResult<FatherNameChainNodeResponse> execute(AbstractChainNodeContext context, AbstractChainNodeRequest request) {
        return null;
    }
}
