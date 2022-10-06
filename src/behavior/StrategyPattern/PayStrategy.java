package behavior.StrategyPattern;

import java.math.BigDecimal;

/**
 * 支付策略
 */
public interface PayStrategy {
    /**
     * 支付
     * @param payMode 支付方式
     * @param money  支付金额
     */
   void pay(String payMode,BigDecimal money);
}
