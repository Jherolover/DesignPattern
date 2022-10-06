package behavior.StrategyPattern;

import java.math.BigDecimal;

/**
 * ֧��
 */
public class Context {
    PayStrategy payStrategy;

    public Context(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    /**
     * ִ��֧������
     * @param payMode
     * @param amt
     */
    public void executeStrategy(String payMode, BigDecimal amt){
        payStrategy.pay(payMode, amt);
    }
}
