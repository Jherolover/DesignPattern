package behavior.CommandPattern;

public class UpdateCommand extends Command{
    public UpdateCommand(String sql) {
        super(sql);
    }

    @Override
    public void execute(String sql) {
        System.out.println("Ö´ÐÐ¸üÐÂÃüÁîsql=>"+sql);
    }
}
