package behavior.IteratorPattern;

import java.util.ArrayList;

/**
 * �û�������
 */
public class UserIterator implements Iterator{

    //�û��б�
    ArrayList<IUser> userList = new ArrayList<>();

    //����λ��
    int currentIndex = 0 ;

    //���캯��
    public UserIterator(ArrayList<IUser> userList) {
        this.userList = userList;
    }

    @Override
    public boolean hasNext() {
        if(currentIndex >= userList.size() ||
        userList.get(currentIndex) == null){
            return false;
        }
        return true;
    }

    @Override
    public IUser next() {
        return this.userList.get(currentIndex++);
    }
}
