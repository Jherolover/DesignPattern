package structure.DecoratorPattern;

/**
 *
 */
public abstract class PersonDecorator implements PersonOuter {

    //外出传入进行装饰
    private PersonOuter personOuter;
    //构造器
    public PersonDecorator(PersonOuter personOuter) {
        this.personOuter = personOuter;
    }

    @Override
    public void decorate() {
        personOuter.decorate();
    }
}
