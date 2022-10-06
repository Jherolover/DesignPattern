package structure.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��̬����ͻ���
 */
public class DynamicProxyClient {
    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("buy")) {
                    System.out.println("����Ʊ==>" + args[0]);
                }
                return null;
            }
        };
        //Proxy.newProxyInstance �ṩ��һ���ӿ������ɴ���Ľӿ���
        BuyTicket buyTicket = (BuyTicket) Proxy.newProxyInstance(
                BuyTicket.class.getClassLoader(), // ����ClassLoader
                new Class[] { BuyTicket.class }, // ����Ҫʵ�ֵĽӿ�
                handler); // ���봦����÷�����InvocationHandler
        buyTicket.buy("��Ʊ");
    }
}
