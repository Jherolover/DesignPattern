package structure.BridgePattern;

/**
 * 生产B产品
 */
public class BProduct implements Product{
    @Override
    public void produce() {
        System.out.println("生产B产品......");
        sell();
    }

    @Override
    public void sell() {
        System.out.println("销售B产品......");
    }
}
