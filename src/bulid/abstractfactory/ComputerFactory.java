package bulid.abstractfactory;

/**
 * 电脑工厂类
 */
public interface ComputerFactory  {
    //制造dell电脑
    Computer createDellComputer();
    //制造华为电脑
    Computer createHuaweiComputer();
    //制造联想电脑
    Computer createLenoComputer();
}
