package behavior.StrategyPattern;

import java.math.BigDecimal;

/**
 * ΢��֧��
 */
public class WechatPay implements PayStrategy{
    @Override
    public void pay(String payMode, BigDecimal money) {
        System.out.println("֧����ʽ��"+payMode+",֧����"+money);
    }
}
