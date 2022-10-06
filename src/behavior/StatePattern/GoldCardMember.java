package behavior.StatePattern;

import java.math.BigDecimal;

/**
 * 金卡会员
 */
public class GoldCardMember extends MemberCardLevel {
    @Override
    public void updateMemLevel() {
        System.out.println("你已经是金卡会员啦");
    }

    @Override
    public void doBalance(BigDecimal amt) {
        System.out.print("金卡会员打折前金额："+amt);
        System.out.println(",金卡会员打5折之后金额:"+amt.multiply(new BigDecimal("0.5")));

    }
}
