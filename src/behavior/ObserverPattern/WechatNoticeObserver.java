package behavior.ObserverPattern;

/**
 * ΢��֪ͨ
 */
public class WechatNoticeObserver extends NoticeObserver{

    public WechatNoticeObserver(Notice notice) {
        this.notice = notice;
        this.notice.attach(this);
    }

    @Override
    public void sendNotice(String msg) {
        System.out.println("΢�Ž�����Ϣ��"+msg);
    }
}
