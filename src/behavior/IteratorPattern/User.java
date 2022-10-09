package behavior.IteratorPattern;

import java.util.ArrayList;

public class User implements IUser{

    private ArrayList<IUser> userList = new ArrayList<>();
    private String userName;
    private Integer userAge;
    private String userAddr;
    private String userDept;

    public User() {
    }

    public User(String userName, Integer userAge, String userAddr, String userDept) {
        this.userName = userName;
        this.userAge = userAge;
        this.userAddr = userAddr;
        this.userDept = userDept;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    @Override
    public String getUserInfo() {
        return "User[" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", userAddr='" + userAddr + '\'' +
                ", userDept='" + userDept + '\'' +
                ']';
    }

    @Override
    public void add(String userName, Integer userAge, String userAddr, String userDept) {
       this.userList.add(new User(userName,userAge,userAddr,userDept));
    }

    @Override
    public UserIterator getIterator() {
        return new UserIterator(this.userList);
    }
}
