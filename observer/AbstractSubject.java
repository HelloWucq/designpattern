import java.util.Enumeration;
import java.util.Vector;

/**
 * AbstractSubject
 */
public class AbstractSubject implements Subject {

    private Vector<Observerable> vector = new Vector<>();

    @Override
    public void add(Observerable observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observerable observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observerable> enumo = vector.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }
}