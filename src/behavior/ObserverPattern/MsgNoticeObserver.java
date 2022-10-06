package behavior.ObserverPattern;

/**
 * 短信通知
 */
public class MsgNoticeObserver extends NoticeObserver{

    public MsgNoticeObserver(Notice notice) {
        this.notice = notice;
        this.notice.attach(this);
    }

    @Override
    public void sendNotice(String msg) {
        System.out.println("短信接收消息："+msg);
    }
}
