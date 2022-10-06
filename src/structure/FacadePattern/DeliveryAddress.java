package structure.FacadePattern;

/**
 * 增加选择邮件地址
 */
public class DeliveryAddress {
    /**
     * 选择邮寄地址
     * @param address
     */
    public void addAddress(String address){
        System.out.println("选择邮寄地址:"+address);
    }

}
