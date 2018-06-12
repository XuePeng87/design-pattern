package cc.xuepeng.example01;


/**
 * Http请求的响应实体类。
 * 该类使用建造者模式创建，这种模式的应用场景如下：
 * 举例来说，在创建一个有20个域（字段）的对象。
 * 其中有3个域是创建时必须要初始化的，另外17个是选填初始化的，那么就要进行大量的构造函数重载：
 * 1.提供一个3个参数（3个必填域）的构造函数；
 * 2.虽然重载一个4个参数（3个必填域，1个可选域）；
 * 3.随后提供一个5个参数的、6个参数的……
 * <p>
 * 建造者模式还可以在赋值时进行条件检测：
 * 将参数从builder拷贝到对象后，对象域可以对这些参数进行检查。
 * 如果失败可以抛出IllegalStateException异常。
 * 在setter时也可以加入条件约束，失败抛出IllegalArgumentException。
 * 在set阶段就会检查条件，而不是等到调用build方法时。
 * <p>
 * 存在的不足：
 * 1.为了创建对象，必须创建Builder。如果十分注重性能，可能就会造成问题；
 * 2.一般在需要用很多参数去构造一个对象时，比如4个参数或更多，使用Builder更为合适；
 * <p>
 * 总结：
 * 如果类的构造函数或者静态方法中具有多个参数，设计这种类时，Builder模式就是一种不错的选择。
 * 特别是大多数参数都是可选的时，相比构造函数和静态工厂，Builder模式更易于阅读和编写。
 *
 * @author xuepeng
 */
public final class HttpResultEntity {

    /**
     * 返回状态。
     */
    private final HttpResultStatus status;
    /**
     * 返回消息。
     */
    private final String msg;
    /**
     * 返回数据。
     */
    private final Object data;

    /**
     * 构造函数。
     *
     * @param builder 建造者。
     */
    private HttpResultEntity(Builder builder) {
        this.status = builder.status;
        this.msg = builder.msg;
        this.data = builder.data;
    }

    /**
     * HttpResultEntity的构造器。
     *
     * @author xuepeng
     */
    public static class Builder {

        /**
         * 返回状态。
         */
        private final HttpResultStatus status;
        /**
         * 返回消息。
         */
        private String msg;
        /**
         * 返回数据。
         */
        private Object data;

        /**
         * 构造函数。
         *
         * @param status 返回状态。
         */
        public Builder(HttpResultStatus status) {
            this.status = status;
        }

        /**
         * 设置返回消息。
         *
         * @param msg 返回消息。
         * @return 返回数据。
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * 设置返回消息。
         *
         * @param data 返回消息。
         * @return 建造者本身。
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * 构建HttpResultEntity对象。
         *
         * @return HttpResultEntity对象。
         */
        public HttpResultEntity build() {
            return new HttpResultEntity(this);
        }

    }

    /**
     * @return 获得响应状态。
     */
    public HttpResultStatus getStatus() {
        return status;
    }

    /**
     * @return 获得响应消息。
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @return 获得响应数据。
     */
    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "HttpResultEntity{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

}