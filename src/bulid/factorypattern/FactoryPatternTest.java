package bulid.factorypattern;

public class FactoryPatternTest {
    public static void main(String[] args) {
        //获取电脑工厂类
        ComputerFactory computerFactory = new ComputerFactory();
        //获取dell
        Computer dell = computerFactory.getComputer("DELL");
        dell.createComputer();
        //获取联想
        Computer lenovo = computerFactory.getComputer("LENOVO");
        lenovo.createComputer();
        //获取华为
        Computer huawei = computerFactory.getComputer("HUAWEI");
        huawei.createComputer();
    }
}
