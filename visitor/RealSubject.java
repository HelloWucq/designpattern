/**
 * RealSubject
 */
public interface RealSubject {

    public void accept(Visitor visitor);

    public String getSubject();
}