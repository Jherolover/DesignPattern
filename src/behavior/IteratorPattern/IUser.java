package behavior.IteratorPattern;

/**
 * �û��ӿ�
 */
public interface IUser {
    //��ȡ�û���Ϣ
    String getUserInfo();
    //����û���Ϣ
    void add(String userName, Integer userAge, String userAddr, String userDept );
    //������
    UserIterator getIterator();
}
