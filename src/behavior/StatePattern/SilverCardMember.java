package behavior.StatePattern;

import java.math.BigDecimal;

/**
 * ������Ա
 */
public class SilverCardMember extends MemberCardLevel{
    @Override
    public void updateMemLevel() {
        System.out.println("��ϲ��Ϊ������Ա��");
    }

    @Override
    public void doBalance(BigDecimal amt) {

        if(memberCardInfo.getMemberPoints() + amt.intValue() > 1000 ){
            memberCardInfo.setMemberCardLevel(new GoldCardMember());
        }else{
            memberCardInfo.setMemberPoints(memberCardInfo.getMemberPoints() + amt.intValue());
            System.out.print("������Ա����ǰ��"+amt);
            System.out.println(",������Ա��7.5��֮����:"+amt.multiply(new BigDecimal("0.75")));
        }

    }
}
