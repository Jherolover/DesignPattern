package structure.FlyweightPattern;

/**
 * �������
 */
public class ProxyObject {
    private String name;

    public ProxyObject(String name) {
        System.out.print("�����¶���:"+name);
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
