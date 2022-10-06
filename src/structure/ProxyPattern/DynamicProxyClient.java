package structure.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理客户端
 */
public class DynamicProxyClient {
    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if (method.getName().equals("buy")) {
                    System.out.println("购买票==>" + args[0]);
                }
                return null;
            }
        };
        //Proxy.newProxyInstance 提供给一个接口来生成代理的接口类
        BuyTicket buyTicket = (BuyTicket) Proxy.newProxyInstance(
                BuyTicket.class.getClassLoader(), // 传入ClassLoader
                new Class[] { BuyTicket.class }, // 传入要实现的接口
                handler); // 传入处理调用方法的InvocationHandler
        buyTicket.buy("彩票");
    }
}
