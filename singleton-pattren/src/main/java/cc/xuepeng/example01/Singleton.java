package cc.xuepeng.example01;

/**
 * 饿汉模式。
 * 这是单例模式的最简单的实现方法。
 * 在类加载的时候创建一次，之后在完整的生命周期内都可以使用。
 * 这种方法是线程安全的。
 * 适用场景：
 * 1.单例对象占用内存小；
 * 2.基本保证会用到该对象；
 * 不适用场景：
 * 1.单例对象占用内存大，且不一定会被使用；
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();
    private static final String RESULT = "something";

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public String createSomething() {
        return RESULT;
    }

}
