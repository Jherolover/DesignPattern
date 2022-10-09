package behavior.CommandPattern;

/**
 * 执行更新
 */
public class InsertCommand extends Command {

    public InsertCommand(String sql) {
        super(sql);
    }

    @Override
    public void execute(String sql) {
        System.out.println("执行插入命令sql=>"+sql);
    }
}
