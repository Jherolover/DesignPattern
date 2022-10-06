package behavior.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个通知对象
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
   * 添加观察者
   * @param observer
   */
  public void attach(NoticeObserver observer){
    observers.add(observer);
  }

  /**
   * 发送所有的通知
   */
  public void notifyAllObservers(){
    for (NoticeObserver observer : observers) {
      observer.sendNotice(msg);
    }
  }

}
