package behavior.StatePattern;

import java.math.BigDecimal;

/**
 * �𿨻�Ա
 */
public class GoldCardMember extends MemberCardLevel {
    @Override
    public void updateMemLevel() {
        System.out.println("���Ѿ��ǽ𿨻�Ա��");
    }

    @Override
    public void doBalance(BigDecimal amt) {
        System.out.print("�𿨻�Ա����ǰ��"+amt);
        System.out.println(",�𿨻�Ա��5��֮����:"+amt.multiply(new BigDecimal("0.5")));

    }
}
