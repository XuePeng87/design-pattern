package cc.xuepeng.example01;

/**
 * User的实体类。
 * 此处采用了静态工厂的方式创建User。
 * 使用静态工程有几大优势，具体如下：
 * 1.静态工厂有名称；
 * 2.可以不必每次都创建一个新的对象（如果使用单例模式）；
 * 3.可以不返回对象本身的类型（返回其父类或实现的接口）；
 * 4.创建对象的语法更简洁；
 * 静态工厂的不足：
 * 1.与其他静态方法没有任何区别（需要良好的API文档支持）；
 * 创建对象方法的命名：
 * 1.valueOf -> 该方法返回的实例与它的参数具有相同的值，目的是做类型转换；
 * 2.of -> 是valueOf的一种更简洁的替代；
 * 3.getInstance -> 返回单例对象；
 * 4.newInstance/createInstance -> 创建一个实例，相当于new一个对象；
 */
public class User {

    private User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static User createInstance(String id, String name) {
        return new User(id, name);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private final String id;
    private final String name;

}
