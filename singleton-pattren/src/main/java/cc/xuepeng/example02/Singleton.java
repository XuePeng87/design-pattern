package cc.xuepeng.example02;

/**
 * 懒汉模式。
 * 这是单例模式可以延迟加载。
 * 在类的getInstance方法被调用时在创建。
 * 这种写法是线程安全的，但是效率不高，如果去掉synchronized关键字，则会造成线程不安全。
 * 不推荐使用该方法。
 */
public class Singleton {

    private static Singleton instance;
    private static final String RESULT = "something";

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String createSomething() {
        return RESULT;
    }

}
