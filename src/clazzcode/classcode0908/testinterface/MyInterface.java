package clazzcode.classcode0908.testinterface;

/**
 * 接口,定义了全局变量和三个方法 抽象方法,default方法,静态方法
 */
public interface MyInterface {
    // 全局变量
    int MAX_VALUE = 100;
    int MIN_VALUE = 0;
    int MAX = 98;

    // 默认有 public static final 修饰
    void getMessage();

    String setMessage(String str);

    /**
     * default 方法
     */
    default void testDefault() {
        System.out.println("默认方法");
    }

    /**
     * 静态方法
     */
    static void testStatic() {
        System.out.println("静态方法");
    }
}
