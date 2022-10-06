package bulid.factorypattern;

/**
 * 联想电脑
 */
public class LenovoComputer implements Computer{
    @Override
    public void createComputer() {
        System.out.println("生产联想电脑");
    }
}
