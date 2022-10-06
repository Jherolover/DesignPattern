package bulid.prototypepattern;

/**
 * 简单的clone
 */
public class SimpleClone implements Cloneable{

    //属性问题
    private String props;

    public String getProps() {
        return props;
    }

    public void setProps(String props) {
        this.props = props;
    }

    /**
     * 克隆方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected SimpleClone clone()  {
        SimpleClone simpleClone = null;
        try {
            simpleClone = (SimpleClone)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return simpleClone;
    }
}
