package behavior.CommandPattern;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Command query = new QueryCommand("select * from table where condition");
        //ÉèÖÃÃüÁî
        invoker.setCommand(query);
        //Ö´ĞĞÃüÁî
        invoker.executeSql();

        Command insert = new InsertCommand("insert into table() values()");
        //ÉèÖÃÃüÁî
        invoker.setCommand(insert);
        //Ö´ĞĞÃüÁî
        invoker.executeSql();

        Command update = new UpdateCommand("update table set filed = value where condition ");
        //ÉèÖÃÃüÁî
        invoker.setCommand(update);
        //Ö´ĞĞÃüÁî
        invoker.executeSql();
        Command delete = new DeleteCommand("delete from table where condition ");
        //ÉèÖÃÃüÁî
        invoker.setCommand(delete);
        //Ö´ĞĞÃüÁî
        invoker.executeSql();
    }
}
