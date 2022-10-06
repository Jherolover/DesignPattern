package bulid.builderPattern;

/**
 * partA 建造者
 */
public class ConcretePartABuilder extends ProductBuilder{

    @Override
    public void buildPart() {
        System.out.println("构造PartA");
    }
}
