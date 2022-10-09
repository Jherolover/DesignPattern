package behavior.CommandPattern;

public class DeleteCommand extends Command{

    public DeleteCommand(String sql) {
        super(sql);
    }

    @Override
    public void execute(String sql) {
        System.out.println("ִ��ɾ������sql=>"+sql);
    }
}
