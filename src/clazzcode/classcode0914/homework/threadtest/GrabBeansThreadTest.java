package clazzcode.classcode0914.homework.threadtest;

/**
 * 继承线程测试类 GrabBeansThreadTest
 * 创建类三种处理多线程的对象各三个，有 同步代码方法
 */
public class GrabBeansThreadTest {

    public static void main(String[] args) {
        // 创建线程对象 同步代码方式
        GrabBeansThread grabBeansThread1 = new GrabBeansThread("_钟离_");
        GrabBeansThread grabBeansThread2 = new GrabBeansThread("_影_");
        GrabBeansThread grabBeansThread3 = new GrabBeansThread("__温蒂__");
        GrabBeansThread grabBeansThread4 = new GrabBeansThread("__甘雨_____");
        GrabBeansThread grabBeansThread5 = new GrabBeansThread("__胡桃________");
        // 调用方法
        grabBeansThread1.start();
        grabBeansThread2.start();
        grabBeansThread3.start();
        grabBeansThread4.start();
        grabBeansThread5.start();
    }
}
