/**
 * Wrapper
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void newmethod() {
        System.out.println("this is new method");
    }

    @Override
    public void oldmethod() {
        System.out.println("this is old method");
    }
}