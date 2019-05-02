/**
 * DynamicProxyTest
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        StaticInterface target = new StaticObject();
        System.out.println(target.getClass());

        StaticInterface proxy = (StaticInterface) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.method();
    }
}