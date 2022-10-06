package structure.DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        PersonOuter boy = new BoyOuter();
        PersonDecorator sundecorator = new SunGlassDecorator(boy);
        PersonDecorator tiedecoratoe = new TieDecorator(boy);
        boy.decorate();
        sundecorator.decorate();
        tiedecoratoe.decorate();
    }
}
