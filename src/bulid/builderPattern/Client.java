package bulid.builderPattern;

/**
 * 调用类
 */
public class Client {

    public static void main(String[] args) {
        //PartB构造者
        ConcretePartABuilder partABuilder = new ConcretePartABuilder();
        //PartB构造者
        ConcretePartBBuilder partBBuilder = new ConcretePartBBuilder();
        Director directorA = new Director(partABuilder);
        directorA.buildProduct();
        Director directorB= new Director(partBBuilder);
        directorB.buildProduct();
    }
}
