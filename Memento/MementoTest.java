/**
 * MementoTest
 */
public class MementoTest {

    public static void main(String[] args) {

        Origin origin = new Origin("Yes");
        Storage storage = new Storage(origin.createMemento());
        System.out.println("origin state is: " + origin.getValue());
        origin.setValue("No");
        System.out.println("now state is: " + origin.getValue());

        origin.restoreMemento(storage.getMemento());
        System.out.println("origin state is: " + origin.getValue());
    }
}