package behavior.ObserverPattern;

/**
 * 微信通知
 */
public class WechatNoticeObserver extends NoticeObserver{

    public WechatNoticeObserver(Notice notice) {
        this.notice = notice;
        this.notice.attach(this);
    }

    @Override
    public void sendNotice(String msg) {
        System.out.println("微信接收消息："+msg);
    }
}
