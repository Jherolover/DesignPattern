package bulid.abstractfactory;

public abstract class AbstrctLenoFactory implements Computer{
    @Override
    public void build() {
        System.out.println("生产联想电脑");
    }

    @Override
    public void decorate() {
        System.out.println("装饰联想电脑");
    }

    @Override
    public void sold() {
        System.out.println("销售联想电脑");
    }
}
