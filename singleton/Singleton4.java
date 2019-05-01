/**
 * Singleton4 懒加载与线程安全结合的方法
 */
public class Singleton4 {

    /**
     * 累级的内部类，静态的成员式内部类，该内部类的实例域外部类的实例没有绑定关系，只用被调用才会装载，从而实现延迟加载
     */
    private static class SingletonHolder {
        private static Singleton4 instance = new Singleton4();
    }

    private Singleton4() {

    }

    public static Singleton4 getInstance() {
        return SingletonHolder.instance;
    }
}