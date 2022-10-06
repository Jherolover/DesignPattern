package behavior.ObserverPattern;

/**
 * ����֪ͨ
 */
public class MsgNoticeObserver extends NoticeObserver{

    public MsgNoticeObserver(Notice notice) {
        this.notice = notice;
        this.notice.attach(this);
    }

    @Override
    public void sendNotice(String msg) {
        System.out.println("���Ž�����Ϣ��"+msg);
    }
}
