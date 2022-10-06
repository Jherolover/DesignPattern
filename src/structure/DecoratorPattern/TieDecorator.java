package structure.DecoratorPattern;

/**
 * 领带装饰器
 */
public class TieDecorator extends PersonDecorator{

    public TieDecorator(PersonOuter personOuter) {
        super(personOuter);
    }

    @Override
    public void decorate() {
        tie();
    }

    public void tie(){
        System.out.println("出门系领带");
    }
}
