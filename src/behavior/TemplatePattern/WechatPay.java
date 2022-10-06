package behavior.TemplatePattern;

public class WechatPay extends PaymentProcess{
    @Override
    void tradePay() {
        System.out.println("微信支付下单...");
    }

    @Override
    void tardeNotify() {
        System.out.println("微信支付支付结果通知...");
    }

    @Override
    void refund() {
        System.out.println("微信支付退费...");
    }

    @Override
    void queryOrder() {
        System.out.println("微信支付查询定单...");
    }

    @Override
    void bill() {
        System.out.println("微信支付对账...");
    }
}
