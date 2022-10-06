package behavior.Mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        CommercialBuilding commercialBuilding = new CommercialBuilding("A","9000/m^2","����·",new HouseMediatorA());
        commercialBuilding.sendHouseInfo();

        commercialBuilding = new CommercialBuilding("B","10000/m^2","�Ϻ�·",new HouseMediatorA());
        commercialBuilding.sendHouseInfo();
    }
}
