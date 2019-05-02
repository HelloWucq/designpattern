/**
 * StaticProxyTest
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        StaticObject target = new StaticObject();
        StaticObjectProxy proxy = new StaticObjectProxy(target);
        proxy.method();
    }
}