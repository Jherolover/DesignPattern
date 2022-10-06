package structure.BridgePattern;

/**
 * 接口抽象类
 */
public abstract class Company {
    protected Product product;

    protected Company(Product product){
        this.product = product;
    }

    /**
     * 提供一个抽象方法
     */
    public abstract void produce();
}
