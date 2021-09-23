package designpattern.singleton;

/**
 * 单例模式——静态内部类
 */
public class StaticInnerClass {

    /**
     * 调用getInstance()才会加载，同时立即实例化对象，线程安全，且有延时加载的又是
     * 在静态内部类中实例化对象
     */
    private static class StaticInnerClassHolder {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    /**
     * 私有构造器
     */
    private StaticInnerClass() {}

    // 通过构造
    public static StaticInnerClass getInstance() {
        return StaticInnerClassHolder.INSTANCE;
    }
}
