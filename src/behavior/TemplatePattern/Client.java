package behavior.TemplatePattern;

public class Client {
    public static void main(String[] args) {
        //支付宝支付
        PaymentProcess alipay = new AliPay();
        alipay.pay();
        //微信支付
        PaymentProcess wecharPay = new WechatPay();
        wecharPay.pay();
    }
}
