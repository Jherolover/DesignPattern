package behavior.Mediator;

/**
 * 楼盘信息
 */
public class CommercialBuilding {
    private String houseDesc;
    private String housePrice;
    private String houseAddr;

    private HouseMediator houseMediator;

    public CommercialBuilding(String houseDesc, String housePrice, String houseAddr,HouseMediator houseMediator) {
        this.houseDesc = houseDesc;
        this.housePrice = housePrice;
        this.houseAddr = houseAddr;
        this.houseMediator = houseMediator;
    }

    public String getHouseDesc() {
        return houseDesc;
    }

    public void setHouseDesc(String houseDesc) {
        this.houseDesc = houseDesc;
    }

    public String getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(String housePrice) {
        this.housePrice = housePrice;
    }

    public String getHouseAddr() {
        return houseAddr;
    }

    public void setHouseAddr(String houseAddr) {
        this.houseAddr = houseAddr;
    }

    /**
     * 发布房产信息
     *
     */
    public void sendHouseInfo(){
        String houseInfo  = "CommercialBuilding[" +
                "houseDesc='" + houseDesc + '\'' +
                ", housePrice='" + housePrice + '\'' +
                ", houseAddr='" + houseAddr + '\'' +
                ']';
        houseMediator.sendHouseInfo(houseInfo);
    }



}
