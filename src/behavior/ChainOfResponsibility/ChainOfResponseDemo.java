package behavior.ChainOfResponsibility;

/**
 * 测试
 */
public class ChainOfResponseDemo {
    public static void main(String[] args) {
        //请假人
        AskforLeaveRequest askforLeaveRequest = new AskforLeaveRequest("小哈","感冒");
        Approver headTeacher = new HeadTeacherApprover("班主任","同意");
        Approver vicePresident = new VicePresidentApprover("副校长","同意");
        Approver president = new PresidentApprover("校长","同意");
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
