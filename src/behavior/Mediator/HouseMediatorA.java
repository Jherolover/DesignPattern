package behavior.Mediator;

public class HouseMediatorA extends HouseMediator{
    @Override
    public void sendHouseInfo(String houseInfo) {
        System.out.println("HouseMediatorA:"+houseInfo);
    }
}
