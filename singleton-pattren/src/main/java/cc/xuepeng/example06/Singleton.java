package cc.xuepeng.example06;

/**
 * 结合了内部类和枚举模式。
 * 若需要延迟加载，该方式为目前最优的单例模式实现。
 * 若不需要延迟加载，则枚举形态的单例模式为最优实现。
 */
public class Singleton {

    private static final String RESULT = "something";

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }

    private enum SingletonEnum {

        INSTANCE;

        private Singleton singleton;

        SingletonEnum() {
            singleton = new Singleton();
        }

        public Singleton getInstance() {
            return singleton;
        }

    }

    public String createSomething() {
        return RESULT;
    }

}
