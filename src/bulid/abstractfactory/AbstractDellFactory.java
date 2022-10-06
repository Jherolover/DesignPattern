package bulid.abstractfactory;

public abstract class AbstractDellFactory implements Computer{
    @Override
    public void build() {
        System.out.println("生产Dell电脑");
    }

    @Override
    public void decorate() {
        System.out.println("装饰Dell电脑");
    }

    @Override
    public void sold() {
        System.out.println("销售Dell电脑");
    }
}
