package behavior.TemplatePattern;

public class AliPay extends PaymentProcess{



    @Override
    void tradePay() {
        System.out.println("支付宝支付下单....");
    }

    @Override
    void tardeNotify() {
        System.out.println("支付宝支付结果通知....");
    }

    @Override
    void refund() {
        System.out.println("支付宝退费....");
    }

    @Override
    void queryOrder() {
        System.out.println("支付宝查询订单....");
    }

    @Override
    void bill() {
        System.out.println("支付宝支付对账...");
    }
}
