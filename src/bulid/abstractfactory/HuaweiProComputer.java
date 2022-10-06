package bulid.abstractfactory;

/**
 * 华为pro系列
 */
public class HuaweiProComputer extends AbstractHuaweiFactory {
    public void build() {
        System.out.println("生产HuaweiPro电脑");
    }
}
