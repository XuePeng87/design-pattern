package cc.xuepeng.example04;

/**
 * 静态内部类实现的单例模式。
 * 此写法是线程安全的，且可以延迟加载。
 */
public class Singleton {

    private static final String RESULT = "something";

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonClassInstance.instance;
    }

    public String createSomething() {
        return RESULT;
    }

    private static class SingletonClassInstance {
        private static final Singleton instance = new Singleton();
    }


}
