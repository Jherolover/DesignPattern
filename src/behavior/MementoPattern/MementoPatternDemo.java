package behavior.MementoPattern;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator =new Originator();
        MementoManager mementoManager = new MementoManager();
        originator.setState("State #1");
        mementoManager.add( originator.saveStateToMemento());
        originator.setState("State #2");
        mementoManager.add(originator.saveStateToMemento());
        originator.setState("State #3");
        mementoManager.add( originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(mementoManager.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(mementoManager.get(1));
        System.out.println("Second saved State: " + originator.getState());
        originator.getStateFromMemento(mementoManager.get(2));
        System.out.println("Third saved State: " + originator.getState());
    }
}
