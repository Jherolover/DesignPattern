package structure.DecoratorPattern;

/**
 * 男孩出门
 */
public class BoyOuter implements PersonOuter{

    public void brushTeeth() {
        System.out.println("男孩出门刷牙");
    }


    public void washair() {
        System.out.println("男孩出门洗头");
    }


    public void changeClothes() {
        System.out.println("男孩出门换衣");
    }

    @Override
    public void decorate() {
        brushTeeth();
        washair();
        changeClothes();
    }
}
