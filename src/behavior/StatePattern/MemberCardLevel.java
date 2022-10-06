package behavior.StatePattern;

import java.math.BigDecimal;

/**
 * �ṩһ����Ա�ȼ��ӿ�
 */
public abstract class MemberCardLevel {

    protected MemberCardInfo memberCardInfo;

    public void setMemberCardInfo(MemberCardInfo memberCardInfo) {
        this.memberCardInfo = memberCardInfo;
    }

    public abstract void updateMemLevel();
    /**
     * ����
     */
    public abstract void doBalance(BigDecimal amt);
}
