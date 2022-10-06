package behavior.StatePattern;

import java.math.BigDecimal;

/**
 * 银卡会员
 */
public class SilverCardMember extends MemberCardLevel{
    @Override
    public void updateMemLevel() {
        System.out.println("恭喜成为银卡会员！");
    }

    @Override
    public void doBalance(BigDecimal amt) {

        if(memberCardInfo.getMemberPoints() + amt.intValue() > 1000 ){
            memberCardInfo.setMemberCardLevel(new GoldCardMember());
        }else{
            memberCardInfo.setMemberPoints(memberCardInfo.getMemberPoints() + amt.intValue());
            System.out.print("银卡会员打折前金额："+amt);
            System.out.println(",银卡会员打7.5折之后金额:"+amt.multiply(new BigDecimal("0.75")));
        }

    }
}
