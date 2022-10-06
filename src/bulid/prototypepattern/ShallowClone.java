package bulid.prototypepattern;

import java.util.ArrayList;

/**
 * 浅拷贝
 */
public class ShallowClone implements Cloneable{
    //定义一个私有变量
    private ArrayList<String> props = new ArrayList<String>();

    public ArrayList<String> getProps() {
        return props;
    }

    public void setProps(String prop) {
        this.props.add(prop);
    }

    /**
     * 克隆方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected ShallowClone clone()  {
        ShallowClone shallowClone = null;
        try {
            shallowClone = (ShallowClone)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return shallowClone;
    }
}
