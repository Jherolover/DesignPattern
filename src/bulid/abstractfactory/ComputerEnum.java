package bulid.abstractfactory;

/**
 * 枚举类进行列出所有具体的实例
 */
public enum ComputerEnum {

    DELLG("bulid.abstractfactory.DellGComputer"),
    DELLINSPIR("bulid.abstractfactory.DellInspironComputer"),
    HUAWEIPRO("bulid.abstractfactory.HuaweiProComputer"),
    HUAWEIMATEE("bulid.abstractfactory.HuaweiMateComputer"),
    LENOR7("bulid.abstractfactory.LenovoR7Computer"),
    LENOR9("bulid.abstractfactory.LenovoR9Computer");
    private String computername;

    ComputerEnum(String computername) {
        this.computername = computername;
    }

    public String getComputername() {
        return computername;
    }
}
