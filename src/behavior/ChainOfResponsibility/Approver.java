package behavior.ChainOfResponsibility;

public abstract class Approver {
    //������
    Approver approver;
    //����������
    String approverName;
    //��������� Y N  ͬ�� ��ͬ��
    String approverOpinion;
    //���캯��
    public Approver(String approverName, String approverOpinion) {
        this.approverName = approverName;
        this.approverOpinion = approverOpinion;
    }
    //ͬ��������һ��������
    public abstract void setNextApprover(Approver approver) ;
    //������������
    public abstract void proccessRequest(AskforLeaveRequest askforLeaveRequest);
}
