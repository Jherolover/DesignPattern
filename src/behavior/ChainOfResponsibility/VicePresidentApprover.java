package behavior.ChainOfResponsibility;

/**
 * 副校长
 */
public class VicePresidentApprover extends Approver{

    public VicePresidentApprover(String approverName, String approverOpinion) {
        super(approverName, approverOpinion);
    }

    @Override
    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    @Override
    public void proccessRequest(AskforLeaveRequest askforLeaveRequest) {
        System.out.println("请假人:"+askforLeaveRequest.getStuName()+",请假事由:"+askforLeaveRequest.getReason());
        System.out.println("当前审批人:"+this.approverName+",审批意见:"+this.approverOpinion);

    }
}
