package bulid.prototypepattern;

public class ShallowClient {
    public static void main(String[] args) {
        ShallowClone shallowClone = new ShallowClone();
        shallowClone.setProps("浅拷贝前的对象属性值");
        ShallowClone clone = shallowClone.clone();
        clone.setProps("浅拷贝后的对象属性值");
        System.out.println(shallowClone.getProps());
    }
}
