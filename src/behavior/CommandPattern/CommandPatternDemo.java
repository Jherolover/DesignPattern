package behavior.CommandPattern;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command query = new QueryCommand("select * from table where condition");
        //��������
        invoker.setCommand(query);
        //ִ������
        invoker.executeSql();

        Command insert = new InsertCommand("insert into table() values()");
        //��������
        invoker.setCommand(insert);
        //ִ������
        invoker.executeSql();

        Command update = new UpdateCommand("update table set filed = value where condition ");
        //��������
        invoker.setCommand(update);
        //ִ������
        invoker.executeSql();
        Command delete = new DeleteCommand("delete from table where condition ");
        //��������
        invoker.setCommand(delete);
        //ִ������
        invoker.executeSql();
    }
}
