
/**
 * ProxyFactoryCglib
 */
public class ProxyFactoryCglib implements MethodInterceptor {
    private Object target;

    public ProxyFactoryCglib(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer en = new Enhancer();
        en.setSuperclass(target.getClass());
        en.setCallback(this);
        return en.create();
    }

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("before method");
        Object returnValue = method.invoke(target, args);
        System.out.println("after method");
        return returnValue;
    }

}