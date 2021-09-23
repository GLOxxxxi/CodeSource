package designpattern.singleton;

/**
 * 单例模式——懒汉式
 */
public class LHan {

    /**
     * 提供静态属性，加载类时不会实例化对象
     */
    private static LHan instance; // 懒汉式

    /**
     * 私有构造器
     */
    private LHan() {}

    /**
     * 第一次调用时才会实例化对象，并且之后不会在实例化，直接返回第一次创建的对象
     * 通过添加synchronized官架子来保证线程安全，但是线程等待的远古所以效率会降低
     * 只有用到才创建对象，所以叫懒汉式，资源利用率就高
     * @return 实例
     */
    public static synchronized LHan getInstance() {
        if (instance == null) {
            instance = new LHan();
        }
        return instance;
    }

}
