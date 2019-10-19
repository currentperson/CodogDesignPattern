package chain;

import chain.context.AbstractChainNodeContext;
import chain.request.AbstractChainNodeRequest;
import chain.response.AbstractChainNodeResponse;
import chain.response.ChainResult;

import java.util.List;

public class ChainProcessor {
    public static <T extends AbstractChainNodeResponse>
        T handleChainNodes(List<ChainNode<T>> chainNodes,
                       AbstractChainNodeContext context,
                       AbstractChainNodeRequest request, T defaultValue) {
        for (ChainNode<T> chainNode : chainNodes) {
            ChainResult<T> execute = chainNode.execute(context, request);
            if (execute.isProcessingCompleted()) {
                return execute.getResponse();
            }
        }
        return defaultValue;
    }
}
