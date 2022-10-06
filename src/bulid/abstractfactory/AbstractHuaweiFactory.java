package bulid.abstractfactory;

public abstract class AbstractHuaweiFactory implements Computer{
    @Override
    public void build() {
        System.out.println("生产Huawei电脑");
    }

    @Override
    public void decorate() {
        System.out.println("装饰Huawei电脑");
    }

    @Override
    public void sold() {
        System.out.println("销售Huawei电脑");
    }
}
