package behavior.IteratorPattern;

/**
 * 用户接口
 */
public interface IUser {
    //获取用户信息
    String getUserInfo();
    //添加用户信息
    void add(String userName, Integer userAge, String userAddr, String userDept );
    //迭代器
    UserIterator getIterator();
}
