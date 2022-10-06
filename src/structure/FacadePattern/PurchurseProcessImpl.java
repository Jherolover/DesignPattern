package structure.FacadePattern;

/**
 * 购物过程的实现类
 */
public class PurchurseProcessImpl implements PurchurseProcess{
    @Override
    public void pickGoods(String goodName) {
        System.out.println("挑选商品："+goodName);
    }

    @Override
    public void addCart(String goodName) {
        System.out.println("将商品"+goodName+"添加购物车！");
    }

    @Override
    public void chooseDelivMode(String delivName) {
        System.out.println("选择快递方式"+delivName);
    }

    @Override
    public void pay() {
        System.out.println("进行支付....");
    }
}
