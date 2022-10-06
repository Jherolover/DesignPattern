package behavior.StatePattern;

import java.math.BigDecimal;

/**
 * 会员卡信息：
 * 积分1元钱
 * 1000积分金卡
 * 800积分银卡
 * 500积分铜卡
 */
public class MemberCardInfo {

    /**
     * 会员等级
     */
    private MemberCardLevel memberCardLevel;

    /**
     * 会员积分
     */
    private Integer memberPoints = 0;


    public MemberCardInfo(MemberCardLevel memberCardLevel) {
        this.memberCardLevel = memberCardLevel;
        memberCardLevel.updateMemLevel();
    }

    public MemberCardInfo(MemberCardLevel memberCardLevel, Integer memberPoints) {
        this.memberCardLevel = memberCardLevel;
        this.memberPoints = memberPoints;
        this.memberCardLevel.setMemberCardInfo(this);
    }

    public Integer getMemberPoints() {
        return memberPoints;
    }

    public void setMemberPoints(Integer memberPoints) {
        this.memberPoints = memberPoints;
    }

    public MemberCardLevel getMemberCardLevel() {
        return memberCardLevel;
    }

    public void setMemberCardLevel(MemberCardLevel memberCardLevel) {
        this.memberCardLevel = memberCardLevel;
        this.memberCardLevel.setMemberCardInfo(this);
    }

    /**
     * 结算
     * @param amt
     */
    public void doBalance(BigDecimal amt){
        this.memberCardLevel.doBalance(amt);
    }

}
