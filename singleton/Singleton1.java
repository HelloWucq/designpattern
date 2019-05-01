/**
 * Singleton1 懒加载启动快。资源占用少，使用时实例化 并发性能差
 */
public class Singleton1 {

    private static Singleton1 uniqueInstance = null;

    // **私有化构造方法，控制创建实例的数目 */
    private Singleton1() {

    }

    public static synchronized Singleton1 getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton1();
        return uniqueInstance;
    }
}