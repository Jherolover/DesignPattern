package behavior.StrategyPattern;

import java.math.BigDecimal;

/**
 * 微信支付
 */
public class WechatPay implements PayStrategy{
    @Override
    public void pay(String payMode, BigDecimal money) {
        System.out.println("支付方式："+payMode+",支付金额："+money);
    }
}
