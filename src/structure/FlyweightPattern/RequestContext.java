package structure.FlyweightPattern;

import java.util.Hashtable;

/**
 * ����һ�����߶���
 */
public class RequestContext extends ThreadLocal{

    private static Hashtable props = new Hashtable();
    /**
     * �������Եķ���
     * @param s
     * @param obj
     */
    public static void setProperty(String s, Object obj)
    {
        props.put(s, obj);
    }

    /**
     * ��ȡ����
     * @param s
     * @return
     */
    public static Object getProperty(String s)
    {
        return props.get(s);
    }

    /**
     * �Ƴ�����
     * @param s
     */
    public static void removeProperty(String s)
    {
        props.remove(s);
    }
    /**
     * ������е�����
     */
    public static void clear()
    {
        props.clear();
    }

}

