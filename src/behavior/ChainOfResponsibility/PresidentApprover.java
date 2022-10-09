package behavior.ChainOfResponsibility;

/**
 * ��У������
 */
public class PresidentApprover extends Approver{

    public PresidentApprover(String approverName, String approverOpinion) {
        super(approverName, approverOpinion);
    }

    @Override
    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    @Override
    public void proccessRequest(AskforLeaveRequest askforLeaveRequest) {
        System.out.println("�����:"+askforLeaveRequest.getStuName()+",�������:"+askforLeaveRequest.getReason());
        System.out.println("��ǰ������:"+this.approverName+",�������:"+this.approverOpinion);
    }
}
