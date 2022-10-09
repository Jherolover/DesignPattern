package behavior.CommandPattern;

public class QueryCommand extends Command{
    public QueryCommand(String sql) {
        super(sql);
    }
    @Override
    public void execute(String sql) {
        System.out.println("ִ�в�ѯ����sql=>"+sql);
    }
}
