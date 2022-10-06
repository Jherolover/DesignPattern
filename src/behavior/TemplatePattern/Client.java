package behavior.TemplatePattern;

public class Client {
    public static void main(String[] args) {
        //֧����֧��
        PaymentProcess alipay = new AliPay();
        alipay.pay();
        //΢��֧��
        PaymentProcess wecharPay = new WechatPay();
        wecharPay.pay();
    }
}
