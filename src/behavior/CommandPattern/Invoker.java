package behavior.CommandPattern;

/**
 *
 */
public class Invoker {
    //ʲô����
    private Command command;
    //�ͻ���������
    public void setCommand(Command command){
        this.command = command;
    }
    //ִ�пͻ�������
    public void executeSql(){
        this.command.execute(command.getSql());
    }
}
