package behavior.CommandPattern;

/**
 * ִ�и���
 */
public class InsertCommand extends Command {

    public InsertCommand(String sql) {
        super(sql);
    }

    @Override
    public void execute(String sql) {
        System.out.println("ִ�в�������sql=>"+sql);
    }
}
