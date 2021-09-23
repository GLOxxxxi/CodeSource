package designpattern.singleton;

/**
 * 单例模式——双检锁
 */
public class DoubleCheck {

    private static DoubleCheck instance;

    public DoubleCheck() {}

    public static DoubleCheck getInstance() {
        // 如果实例对象是空的
        if (instance == null) {
            // 获取锁
            synchronized (DoubleCheck.class) {
                // 获取之后在判断
                if (instance == null) {
                    // 没有之后创建实例对象；
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
