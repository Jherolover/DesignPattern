package bulid.abstractfactory;

/**
 * 创建电脑的接口
 */
public interface Computer {
    //生产电脑
    void build();
    //装饰电脑
    void decorate();
    //销售电脑
    void sold();
}
