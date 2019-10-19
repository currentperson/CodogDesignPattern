package chain.homework;

import lombok.Data;

@Data
public class LendRequest {

    //支用金额
    private String loanAmt;

    //支用币种
    private String currency;

    //支用产品
    private String pdCode;

    //用户唯一标识
    private String userId;
}
