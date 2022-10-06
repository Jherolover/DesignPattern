package behavior.StatePattern;

import java.math.BigDecimal;

/**
 * ��Ա����Ϣ��
 * ����1ԪǮ
 * 1000���ֽ�
 * 800��������
 * 500����ͭ��
 */
public class MemberCardInfo {

    /**
     * ��Ա�ȼ�
     */
    private MemberCardLevel memberCardLevel;

    /**
     * ��Ա����
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
     * ����
     * @param amt
     */
    public void doBalance(BigDecimal amt){
        this.memberCardLevel.doBalance(amt);
    }

}
