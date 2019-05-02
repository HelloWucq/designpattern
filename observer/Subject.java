/**
 * Subject
 */
public interface Subject {

    public void add(Observerable observer);

    public void del(Observerable observer);

    public void notifyObservers();

    public void operation();
}