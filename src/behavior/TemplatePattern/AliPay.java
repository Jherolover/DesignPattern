package behavior.TemplatePattern;

public class AliPay extends PaymentProcess{



    @Override
    void tradePay() {
        System.out.println("֧����֧���µ�....");
    }

    @Override
    void tardeNotify() {
        System.out.println("֧����֧�����֪ͨ....");
    }

    @Override
    void refund() {
        System.out.println("֧�����˷�....");
    }

    @Override
    void queryOrder() {
        System.out.println("֧������ѯ����....");
    }

    @Override
    void bill() {
        System.out.println("֧����֧������...");
    }
}
