package designpattern.singleton;

/**
 * 单例模式——饿汉式
 */
public class EHan {

    /**
     * 类加载的时候也加载这个对象
     * 保证了线程的安全
     * 在类中实例化自己
     */
    private static final EHan instance = new EHan(); // 饿汉式

    /**
     * 私有构造器
     * 保证一个类只有一个实例
     */
    private EHan() {}

    /**
     * 因为不需要加同步代码块就能保证线程安全，效率会高
     * 向整个系统提供这个实例
     * @return 实例
     */
    public static EHan getInstance() {
        return instance;
    }
}
