package behavior.StrategyPattern;

import java.math.BigDecimal;

/**
 * ֧������
 */
public interface PayStrategy {
    /**
     * ֧��
     * @param payMode ֧����ʽ
     * @param money  ֧�����
     */
   void pay(String payMode,BigDecimal money);
}
