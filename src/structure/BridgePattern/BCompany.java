package structure.BridgePattern;

/**
 * B公司
 */
public class BCompany extends Company {

    protected BCompany(Product product) {
        super(product);
    }

    @Override
    public void produce() {
        product.produce();
    }
}