package structure.FlyweightPattern;

import java.util.Random;

/**
 * 测试享元模式
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        //利用
        for (int i = 1;i < 10; i++){
            int j = random.nextInt(10);
            ProxyObject property = (ProxyObject) RequestContext.getProperty(j+"");
            if (property==null){
                ProxyObject newProxyObject = new ProxyObject(j+"");
                //放入hashtable
                RequestContext.setProperty(j+"",newProxyObject);
                System.out.println("  " +newProxyObject);
            }else {
                System.out.println("已经存在对象:"+property);
            }
        }

    }
}
