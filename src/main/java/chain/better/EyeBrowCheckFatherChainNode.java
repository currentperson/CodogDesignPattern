package chain.better;

import chain.context.AbstractChainNodeContext;
import chain.demo.BigHeadSon;
import chain.request.AbstractChainNodeRequest;
import chain.response.ChainResult;

public class EyeBrowCheckFatherChainNode extends CheckFatherChainNode {
    @Override
    public ChainResult<FatherNameChainNodeResponse> execute(AbstractChainNodeContext context, AbstractChainNodeRequest request) {
        BigHeadSon bigHeadSon = (BigHeadSon) request;
        ChainResult<FatherNameChainNodeResponse> chainResult = new ChainResult<>();
        if (bigHeadSon.isCoarseEyebrows()) {
            chainResult.setProcessingCompleted(true);
            chainResult.setResponse(new FatherNameChainNodeResponse("粗眉毛保安"));
        }
        return chainResult;
    }
}
