package structure.FlyweightPattern;

import java.util.Hashtable;

/**
 * 设置一个患者对象
 */
public class RequestContext extends ThreadLocal{

    private static Hashtable props = new Hashtable();
    /**
     * 设置属性的方法
     * @param s
     * @param obj
     */
    public static void setProperty(String s, Object obj)
    {
        props.put(s, obj);
    }

    /**
     * 获取属性
     * @param s
     * @return
     */
    public static Object getProperty(String s)
    {
        return props.get(s);
    }

    /**
     * 移除属性
     * @param s
     */
    public static void removeProperty(String s)
    {
        props.remove(s);
    }
    /**
     * 清除所有的属性
     */
    public static void clear()
    {
        props.clear();
    }

}

