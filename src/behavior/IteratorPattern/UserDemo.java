package behavior.IteratorPattern;

import java.util.ArrayList;

public class UserDemo {
    public static void main(String[] args) {
        //定义user集合
        ArrayList<IUser> userList = new ArrayList<>();
        //添加元素
        userList.add(new User("tony",12,"beijing","开发部"));
        userList.add(new User("marry",16,"shanghai","人力部"));
        userList.add(new User("tom",18,"beijing","开发部"));
        userList.add(new User("tylor",14,"shenzhen","财务部"));
        //遍历
        for(IUser user:userList){
            System.out.println(user.getUserInfo());
        }
    }
}
