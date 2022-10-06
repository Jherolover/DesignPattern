package structure.BridgePattern;



/**
 * A公司
 */
public class ACompany extends Company {

    protected ACompany(Product product) {
        super(product);
    }

    @Override
    public void produce() {
       product.produce();
    }
}
