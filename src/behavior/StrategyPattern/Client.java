package behavior.StrategyPattern;

import java.math.BigDecimal;

/**
 * 测试
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=====支付宝支付========");
        Context applicationContext =  new Context( new AliPay());
        applicationContext.executeStrategy("支付宝",new BigDecimal("100.0"));
        System.out.println("=====支付宝支付========");
        System.out.println("=====微信支付========");
        applicationContext =  new Context(new WechatPay());
        applicationContext.executeStrategy("微信",new BigDecimal("200.0"));
        System.out.println("=====微信支付========");
        System.out.println("=====银行支付========");
        applicationContext =  new Context(new BankPay());
        applicationContext.executeStrategy("银行卡",new BigDecimal("300.0"));
        System.out.println("=====银行支付========");
        
    }
}
