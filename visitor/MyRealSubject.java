/**
 * MyRealSubject
 */
public class MyRealSubject implements RealSubject {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "love";
    }
}