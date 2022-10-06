package structure.BridgePattern;

public class AProduct implements Product{
    @Override
    public void produce() {
        System.out.println("生产产品A......");
        sell();
    }

    @Override
    public void sell() {
        System.out.println("销售产品A......");
    }
}
