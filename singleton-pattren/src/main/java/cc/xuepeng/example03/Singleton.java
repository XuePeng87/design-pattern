package cc.xuepeng.example03;

/**
 * Double CheckLock单例模式。
 * 采用双重判断机制来保证线程安全。
 * 是懒汉模式的升级版，将方法的synchronized修饰符延迟到方法中。
 * 此种模式在JDK1.5前，由于volatile的历史问题是不可用的。
 * 注意：
 * 若去掉volatile修饰符，在JVM进行指令重排序这项优化时，会出现线程不安全的情况。
 * 此写法相对繁琐，已不推荐使用。
 */
public class Singleton {

    private static volatile Singleton instance;
    private static final String RESULT = "something";

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public String createSomething() {
        return RESULT;
    }

}
