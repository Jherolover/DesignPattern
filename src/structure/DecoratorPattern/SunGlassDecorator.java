package structure.DecoratorPattern;

/**
 * 墨镜装饰器
 */
public class SunGlassDecorator extends PersonDecorator {

    public SunGlassDecorator(PersonOuter personOuter) {
        super(personOuter);
    }

    @Override
    public void decorate() {
        sunGlass();
    }

    public void sunGlass(){
        System.out.println("出门带墨镜");
    }
}
