package behavior.ObserverPattern;

/**
 * observer�۲���
 */
public abstract class NoticeObserver {
    protected  Notice notice;
    public abstract void sendNotice(String msg);
}
