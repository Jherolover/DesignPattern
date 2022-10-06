package behavior.StrategyPattern;

import java.math.BigDecimal;

/**
 * 支付
 */
public class Context {
    PayStrategy payStrategy;

    public Context(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    /**
     * 执行支付策略
     * @param payMode
     * @param amt
     */
    public void executeStrategy(String payMode, BigDecimal amt){
        payStrategy.pay(payMode, amt);
    }
}
