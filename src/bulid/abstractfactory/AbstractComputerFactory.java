package bulid.abstractfactory;

/**
 * 抽象工厂进行创建具体的类
 */
public abstract class AbstractComputerFactory implements ComputerFactory{
    /*
     * 使用抽象工厂进行创建一个具体的电脑实例
     */
    protected Computer createComputer(ComputerEnum computerEnum) {
        Computer computer = null;
        //如果传递进来不是一个Enum中具体的一个Element的话，则不处理
        if (!computerEnum.getComputername().equals("")) {
            try {
                //直接产生一个实例
                computer = (Computer)
                        Class.forName(computerEnum.getComputername()).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return computer;
    }
}
