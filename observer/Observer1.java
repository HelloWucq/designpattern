/**
 * Observer1
 */
public class Observer1 implements Observerable {

    @Override
    public void update() {
        System.out.println("observer1 has update!");
    }
}