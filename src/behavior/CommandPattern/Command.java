package behavior.CommandPattern;

/**
 * ÃüÁî½Ó¿Ú
 */
public abstract class Command {
    private String sql;

    public Command(String sql) {
        this.sql = sql;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public abstract void execute(String sql);
}
