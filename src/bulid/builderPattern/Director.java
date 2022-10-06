package bulid.builderPattern;

/**
 * 主导
 */
public class Director {

    private ProductBuilder productBuilder;
    //构造器
    public Director(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }
    /***
     * 获取构造的产品
     * @return
     */
    public void buildProduct(){
        productBuilder.buildPart();
    }

}
