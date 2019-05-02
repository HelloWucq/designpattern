/**
 * CglibProxyTest
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        StaticObject target = new StaticObject();
        StaticObject proxy = (StaticObject) new ProxyFactoryCglib(target).getProxyInstance();
        proxy.method();
    }
}