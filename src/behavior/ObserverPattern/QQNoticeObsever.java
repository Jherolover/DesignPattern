package behavior.ObserverPattern;

/**
 * qq 通知
 */
public class QQNoticeObsever extends NoticeObserver {
    public QQNoticeObsever(Notice notice) {
        this.notice = notice;
        this.notice.attach(this);
    }

    @Override
    public void sendNotice(String msg) {
        System.out.println("QQ更新通知消息:"+msg);
    }
}
