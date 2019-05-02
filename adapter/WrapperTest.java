/**
 * WrapperTest
 */
public class WrapperTest {

    public static void main(String[] args) {
        Sourceable source1 = new Sub1();
        Sourceable source2 = new Sub2();
        source1.oldmethod();
        source1.newmethod();
        source2.oldmethod();
        source2.newmethod();
    }
}