package bulid.prototypepattern;

public class Client {
    public static void main(String[] args) {
        SimpleClone simpleClone = new SimpleClone();
        System.out.println("原始对象"+simpleClone);
        SimpleClone clone = simpleClone.clone();
        System.out.println("原始对象"+simpleClone);
        System.out.println(simpleClone == clone);
    }
}
