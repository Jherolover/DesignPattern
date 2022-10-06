package bulid.prototypepattern;


public class DeepClient {
    public static void main(String[] args) {
        DeepClone deepClone = new DeepClone();
        deepClone.setProps("浅拷贝前的对象属性值");
        DeepClone clone = deepClone.clone();
        clone.setProps("浅拷贝后的对象属性值");
        System.out.println(deepClone.getProps());
    }
}
