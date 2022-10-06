package structure.FlyweightPattern;

/**
 * 代理对象
 */
public class ProxyObject {
    private String name;

    public ProxyObject(String name) {
        System.out.print("创建新对象:"+name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProxyObject{" +
                "name='" + name + '\'' +
                '}';
    }
}
