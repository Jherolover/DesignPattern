package behavior.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ��֪ͨ����
 */
public  class Notice {

  private List<NoticeObserver> observers
          = new ArrayList<NoticeObserver>();
  private String msg;

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
    this.notifyAllObservers();
  }

  /**
   * ��ӹ۲���
   * @param observer
   */
  public void attach(NoticeObserver observer){
    observers.add(observer);
  }

  /**
   * �������е�֪ͨ
   */
  public void notifyAllObservers(){
    for (NoticeObserver observer : observers) {
      observer.sendNotice(msg);
    }
  }

}
