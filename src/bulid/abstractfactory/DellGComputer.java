package bulid.abstractfactory;

/**
 * dell G游戏本
 */
public class DellGComputer extends AbstractDellFactory {

    public void build() {
        System.out.println("生产DellG电脑");
    }
}
