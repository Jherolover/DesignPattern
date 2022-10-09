package behavior.IteratorPattern;

import java.util.ArrayList;

public class UserDemo {
    public static void main(String[] args) {
        //����user����
        ArrayList<IUser> userList = new ArrayList<>();
        //���Ԫ��
        userList.add(new User("tony",12,"beijing","������"));
        userList.add(new User("marry",16,"shanghai","������"));
        userList.add(new User("tom",18,"beijing","������"));
        userList.add(new User("tylor",14,"shenzhen","����"));
        //����
        for(IUser user:userList){
            System.out.println(user.getUserInfo());
        }
    }
}
