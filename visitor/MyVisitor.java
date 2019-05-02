/**
 * MyVisitor
 */
public class MyVisitor implements Visitor {

    @Override
    public void visit(RealSubject real) {
        System.out.println("visit the real: " + real.getSubject());
    }
}