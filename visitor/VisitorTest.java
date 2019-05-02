/**
 * VisitorTest
 */
public class VisitorTest {

    public static void main(String[] args) {

        Visitor visitor = new MyVisitor();
        RealSubject realSubject = new MyRealSubject();
        realSubject.accept(visitor);
    }
}