package behavior.Mediator;

/**
 *
 */
public class HouseMediatorB extends HouseMediator{
    @Override
    public void sendHouseInfo(String houseInfo) {
        System.out.println("B:"+houseInfo);
    }
}
