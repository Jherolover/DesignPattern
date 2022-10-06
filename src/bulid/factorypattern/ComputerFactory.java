package bulid.factorypattern;

/**
 * 提供一个对外的方法获取电脑实体
 */
public class ComputerFactory {

    //使用 getComputer 方法获取对应的电脑实体
    public Computer getComputer(String computerType){
        if(computerType == null){
            return null;
        }
        if("LENOVO".equalsIgnoreCase(computerType)){
            return new LenovoComputer();
        } else if("HUAWEI".equalsIgnoreCase(computerType)){
            return new HuaweiComputer();
        } else if("DELL".equalsIgnoreCase(computerType)){
            return new DellComputer();
        }
        return null;
    }
}
