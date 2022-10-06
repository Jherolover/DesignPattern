package behavior.TemplatePattern;

/**
 * ����һ��֧��������
 *
 */
public abstract  class PaymentProcess {
    //ģ��
    public final void pay(){
        //�µ�
        tradePay();
        //�µ�֪ͨ
        tardeNotify();
        //�˷�
        refund();
        //��ѯ����
        queryOrder();
        //����
        bill();
    }
     //�µ�
    abstract void tradePay();
    //֧��֪ͨ
    abstract void tardeNotify();
    //�˿�
    abstract void refund();
    //��ѯ����
    abstract void queryOrder();
    //����
    abstract void bill();
}
