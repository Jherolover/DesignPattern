package behavior.StrategyPattern;

import java.math.BigDecimal;

/**
 * ����
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=====֧����֧��========");
        Context applicationContext =  new Context( new AliPay());
        applicationContext.executeStrategy("֧����",new BigDecimal("100.0"));
        System.out.println("=====֧����֧��========");
        System.out.println("=====΢��֧��========");
        applicationContext =  new Context(new WechatPay());
        applicationContext.executeStrategy("΢��",new BigDecimal("200.0"));
        System.out.println("=====΢��֧��========");
        System.out.println("=====����֧��========");
        applicationContext =  new Context(new BankPay());
        applicationContext.executeStrategy("���п�",new BigDecimal("300.0"));
        System.out.println("=====����֧��========");
        
    }
}
