package behavior.TemplatePattern;

/**
 * 定义一个支付的流程
 *
 */
public abstract  class PaymentProcess {
    //模板
    public final void pay(){
        //下单
        tradePay();
        //下单通知
        tardeNotify();
        //退费
        refund();
        //查询订单
        queryOrder();
        //对账
        bill();
    }
     //下单
    abstract void tradePay();
    //支付通知
    abstract void tardeNotify();
    //退款
    abstract void refund();
    //查询订单
    abstract void queryOrder();
    //对账
    abstract void bill();
}
