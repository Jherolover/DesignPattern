package bulid.prototypepattern;

import java.util.ArrayList;

/**
 * 深拷贝
 */
public class DeepClone implements Cloneable {
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
    protected DeepClone clone()  {
        DeepClone deepClone = null;
        try {
            deepClone = (DeepClone)super.clone();
            //引用对象拷贝
            deepClone.props =  (ArrayList<String>)this.props.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepClone;
    }
}
