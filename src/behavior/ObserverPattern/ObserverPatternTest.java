package behavior.ObserverPattern;

public class ObserverPatternTest {
    public static void main(String[] args) {
        Notice notice = new Notice();

        new QQNoticeObsever(notice);
        new WechatNoticeObserver(notice);
        new MsgNoticeObserver(notice);

        System.out.println("������Ϣ֪ͨ");
        notice.setMsg("ȫ���Ա����ʮ���㿪��....");
        System.out.println("������Ϣ֪ͨ");
        notice.setMsg("����ĳĳԭ��ȫ���Ա����ʮ����Ļ����Ƴٵ���������....");
    }
}
