/**
 * StaticObjectProxy
 */
public class StaticObjectProxy implements StaticInterface {
    private StaticObject staticObject;

    public StaticObjectProxy(StaticObject staticObject) {
        this.staticObject = staticObject;
    }

    public void method() {
        System.out.println("before the method");
        staticObject.method();
        System.out.println("after the method");
    }

}