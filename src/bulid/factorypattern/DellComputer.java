package bulid.factorypattern;

/**
 * dell
 */
public class DellComputer implements Computer {
    @Override
    public void createComputer() {
        System.out.println("生产dell电脑");
    }
}
