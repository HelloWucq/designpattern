/**
 * Singleton3 线程安全，使用时没有延迟 启动时即创建实例，启动较慢，造成资源浪费
 */
public class Singleton3 {

    private static Singleton3 instance = new Singleton3();

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        return instance;
    }
}