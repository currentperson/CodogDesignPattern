package chain.better;

import chain.context.AbstractChainNodeContext;
import chain.demo.BigHeadSon;
import chain.request.AbstractChainNodeRequest;
import chain.response.ChainResult;

public class HeadCheckFatherChainNode extends CheckFatherChainNode {
    @Override
    public ChainResult<FatherNameChainNodeResponse> execute(AbstractChainNodeContext context, AbstractChainNodeRequest request) {
        BigHeadSon bigHeadSon = (BigHeadSon) request;
        ChainResult<FatherNameChainNodeResponse> chainResult = new ChainResult<>();
        if (bigHeadSon.isBigHead()) {
            chainResult.setProcessingCompleted(true);
            chainResult.setResponse(new FatherNameChainNodeResponse("隔壁老王"));
        }
        return chainResult;
    }
}
