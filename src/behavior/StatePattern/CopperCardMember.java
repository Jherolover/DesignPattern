package behavior.StatePattern;

import java.math.BigDecimal;

/**
 * ͭ����Ա
 */
public class CopperCardMember extends MemberCardLevel {
    @Override
    public void updateMemLevel() {
        System.out.println("��ϲ���Ϊͭ����Ա��");
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
            System.out.print("ͭ����Ա����ǰ��" + amt);
            System.out.println(",ͭ����Ա��8��֮����:" + amt.multiply(new BigDecimal("0.8")));
        }
    }
}
