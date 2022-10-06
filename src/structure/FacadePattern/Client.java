package structure.FacadePattern;

public class Client {
    public static void main(String[] args) {
        PurchurseFacade purchurseFacade = new PurchurseFacade();
        //购买过程
        purchurseFacade.purchurseGoods("华为mate30","圆通快递");
    }
}
