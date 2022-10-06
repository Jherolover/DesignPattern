package behavior.ObserverPattern;

public class ObserverPatternTest {
    public static void main(String[] args) {
        Notice notice = new Notice();

        new QQNoticeObsever(notice);
        new WechatNoticeObserver(notice);
        new MsgNoticeObserver(notice);

        System.out.println("发送消息通知");
        notice.setMsg("全体成员中午十二点开会....");
        System.out.println("更新消息通知");
        notice.setMsg("由于某某原因，全体成员中午十二点的会议推迟到下午两点....");
    }
}
