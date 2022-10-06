package behavior.StatePattern;

import java.math.BigDecimal;

/**
 * 铜卡会员
 */
public class CopperCardMember extends MemberCardLevel {
    @Override
    public void updateMemLevel() {
        System.out.println("恭喜你成为铜卡会员！");
    }

    @Override
    public void doBalance(BigDecimal amt) {
        if ( memberCardInfo.getMemberPoints() + amt.intValue() > 1000){
            memberCardInfo.setMemberCardLevel(new GoldCardMember());
        }else if ((memberCardInfo.getMemberPoints() + amt.intValue())> 800 &&
                (memberCardInfo.getMemberPoints() + amt.intValue() )< 1000){
            memberCardInfo.setMemberCardLevel(new SilverCardMember());
        }else {
            memberCardInfo.setMemberPoints(memberCardInfo.getMemberPoints() + amt.intValue());
            System.out.print("铜卡会员打折前金额：" + amt);
            System.out.println(",铜卡会员打8折之后金额:" + amt.multiply(new BigDecimal("0.8")));
        }
    }
}
