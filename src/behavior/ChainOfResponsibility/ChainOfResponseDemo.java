package behavior.ChainOfResponsibility;

/**
 * ����
 */
public class ChainOfResponseDemo {
    public static void main(String[] args) {
        //�����
        AskforLeaveRequest askforLeaveRequest = new AskforLeaveRequest("С��","��ð");
        Approver headTeacher = new HeadTeacherApprover("������","ͬ��");
        Approver vicePresident = new VicePresidentApprover("��У��","ͬ��");
        Approver president = new PresidentApprover("У��","ͬ��");
        System.out.println("=============================");
        headTeacher.proccessRequest(askforLeaveRequest);
        headTeacher.setNextApprover(vicePresident);
        System.out.println("=============================");
        vicePresident.proccessRequest(askforLeaveRequest);
        vicePresident.setNextApprover(president);
        System.out.println("=============================");
        president.proccessRequest(askforLeaveRequest);
    }
}
