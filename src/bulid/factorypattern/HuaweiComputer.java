package bulid.factorypattern;

/**
 * 华为
 */
public class HuaweiComputer implements Computer {
    @Override
    public void createComputer() {
        System.out.println("生产华为电脑");
    }
}
