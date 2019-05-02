/**
 * ClassAdapterTest
 */
public class ClassAdapterTest {

    public static void main(String[] args) {
        Targetable target = new ClassAdapter();
        target.oldmethod();
        target.newmethod();
    }
}