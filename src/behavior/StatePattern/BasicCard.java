package behavior.StatePattern;

import java.math.BigDecimal;

/**
 * 普通卡
 */
public class BasicCard extends MemberCardLevel{
    @Override
    public void updateMemLevel() {

    }
    @Override
    public void doBalance(BigDecimal amt) {
        if ((memberCardInfo.getMemberPoints() + amt.intValue()) > 1000) {
            memberCardInfo.setMemberCardLevel(new GoldCardMember());
        } else if ((memberCardInfo.getMemberPoints() + amt.intValue()) > 800 &&
                (memberCardInfo.getMemberPoints() + amt.intValue()) < 1000) {
            memberCardInfo.setMemberCardLevel(new SilverCardMember());
        }else if((memberCardInfo.getMemberPoints() + amt.intValue()) > 500 && (memberCardInfo.getMemberPoints() + amt.intValue()) < 800){
            memberCardInfo.setMemberCardLevel(new CopperCardMember());
        } else {
            memberCardInfo.setMemberPoints(memberCardInfo.getMemberPoints() + amt.intValue());
            System.out.print("普通卡不能打卡金额：" + amt);
        }
    }
}
