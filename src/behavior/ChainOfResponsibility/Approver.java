package behavior.ChainOfResponsibility;

public abstract class Approver {
    //处理人
    Approver approver;
    //处理人姓名
    String approverName;
    //处理人意见 Y N  同意 不同意
    String approverOpinion;
    //构造函数
    public Approver(String approverName, String approverOpinion) {
        this.approverName = approverName;
        this.approverOpinion = approverOpinion;
    }
    //同意设置下一个审批人
    public abstract void setNextApprover(Approver approver) ;
    //处理审批请求
    public abstract void proccessRequest(AskforLeaveRequest askforLeaveRequest);
}
