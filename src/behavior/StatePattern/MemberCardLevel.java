package behavior.StatePattern;

import java.math.BigDecimal;

/**
 * 提供一个会员等级接口
 */
public abstract class MemberCardLevel {

    protected MemberCardInfo memberCardInfo;

    public void setMemberCardInfo(MemberCardInfo memberCardInfo) {
        this.memberCardInfo = memberCardInfo;
    }

    public abstract void updateMemLevel();
    /**
     * 结算
     */
    public abstract void doBalance(BigDecimal amt);
}
