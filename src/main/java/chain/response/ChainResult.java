package chain.response;

import lombok.Data;

@Data
public class ChainResult<T extends AbstractChainNodeResponse> {

    private boolean processingCompleted;

    private T response;
}
