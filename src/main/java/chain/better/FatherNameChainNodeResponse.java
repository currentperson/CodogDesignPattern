package chain.better;

import chain.response.AbstractChainNodeResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FatherNameChainNodeResponse extends AbstractChainNodeResponse {

    //父亲姓名
    private String fatherName;

}
