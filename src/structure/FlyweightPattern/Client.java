package structure.FlyweightPattern;

import java.util.Random;

/**
 * ������Ԫģʽ
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        //����
        for (int i = 1;i < 10; i++){
            int j = random.nextInt(10);
            ProxyObject property = (ProxyObject) RequestContext.getProperty(j+"");
            if (property==null){
                ProxyObject newProxyObject = new ProxyObject(j+"");
                //����hashtable
                RequestContext.setProperty(j+"",newProxyObject);
                System.out.println("  " +newProxyObject);
            }else {
                System.out.println("�Ѿ����ڶ���:"+property);
            }
        }

    }
}
