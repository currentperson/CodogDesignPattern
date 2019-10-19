package chain.demo;

import chain.request.AbstractChainNodeRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
public class BigHeadSon extends AbstractChainNodeRequest {

    //是否尖鼻子
    private final boolean pointedNose = false;

    //是否粗眉毛
    private final boolean coarseEyebrows = false;

    //是否大头
    private final boolean bigHead = true;
}
