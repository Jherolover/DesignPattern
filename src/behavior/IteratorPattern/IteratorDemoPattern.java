package behavior.IteratorPattern;

/**
 *
 */
public class IteratorDemoPattern {
    public static void main(String[] args) {
        IUser user = new User();
        user.add("tony",12,"beijing","������");
        user.add("marry",16,"shanghai","������");
        user.add("tom",18,"beijing","������");
        user.add("tylor",14,"shenzhen","����");

        //����һ��ArrayList�������е����ݶ�ȡ��
        UserIterator userIterator = user.getIterator();
        while(userIterator.hasNext()){
            IUser u = (IUser)userIterator.next();
            System.out.println(u.getUserInfo());
        }
    }
}
