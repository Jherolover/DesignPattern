package bulid.builderPattern;

/**
 * partB 建造者
 */
public class ConcretePartBBuilder extends ProductBuilder{
    @Override
    public void buildPart() {
        System.out.println("构建PartB");
    }
}
