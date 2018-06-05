package cc.xuepeng.example05;

/**
 * 该种写法是枚举形态的单例模式。
 * 优点是线程安全的、可以天然防止反射和反序列化的调用。
 * 缺点是不可以延迟加载。
 * 注意：
 * 其余几种写法都无法防止反射。
 */
public enum Singleton {

    INSTANCE;

    Singleton() {
    }

    public String createSomething() {
        return RESULT;
    }

    private static final String RESULT = "something";

}
