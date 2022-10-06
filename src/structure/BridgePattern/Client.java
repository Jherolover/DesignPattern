package structure.BridgePattern;

public class Client {
    public static void main(String[] args) {
        AProduct a = new AProduct();
        Company acompany = new ACompany(a);
        acompany.produce();

        BProduct b = new BProduct();
        Company bcompany = new BCompany(b);
        bcompany.produce();
    }
}
