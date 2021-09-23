package clazzcode.classcode0914.homework.threadtest;

/**
 * 继承线程测试类 GrabBeansSynThreadTest
 * 创建类三种处理多线程的对象各三个，有 同步方法 的方法
 */
public class GrabBeansSynThreadTest {

    public static void main(String[] args) {
        // 创建线程对象 同步方法方式
        GrabBeansSynchronizedMethodThread grabBean1 = new GrabBeansSynchronizedMethodThread("_钟离_");
        GrabBeansSynchronizedMethodThread grabBean2 = new GrabBeansSynchronizedMethodThread("_影_");
        GrabBeansSynchronizedMethodThread grabBean3 = new GrabBeansSynchronizedMethodThread("__温蒂__");
        GrabBeansSynchronizedMethodThread grabBean4 = new GrabBeansSynchronizedMethodThread("__甘雨_____");
        GrabBeansSynchronizedMethodThread grabBean5 = new GrabBeansSynchronizedMethodThread("__胡桃________");
        // 调用方法
        grabBean1.start();
        grabBean2.start();
        grabBean3.start();
        grabBean4.start();
        grabBean5.start();
    }
}
