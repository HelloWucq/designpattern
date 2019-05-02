/**
 * WrapperAdapter
 */
public class WrapperAdapterTest {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.newmethod();
        target.oldmethod();
    }
}