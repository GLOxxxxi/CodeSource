package clazzcode.classcode0914.homework.runnabletest;

import clazzcode.classcode0914.homework.threadtest.GrabBeansSynchronizedMethodThread;

/**
 * 实现线程接口测试类 GrabBeansSynMethodTest
 * 创建类三种处理多线程的对象各三个，有 同步方法的方法
 */
public class GrabBeansSynMethodTest {

    public static void main(String[] args) {
        GrabBeansSynchronizedMethodThread grabBeanSMT = new GrabBeansSynchronizedMethodThread();
        // 创建接口实现类对象 同步方法
        Thread thread6 = new Thread(grabBeanSMT, "__温蒂__");
        Thread thread7 = new Thread(grabBeanSMT, "_影_");
        Thread thread8 = new Thread(grabBeanSMT, "_钟离_");
        Thread thread9 = new Thread(grabBeanSMT, "__甘雨_____");
        Thread thread10 = new Thread(grabBeanSMT, "__胡桃________");
        // 调用线程开始方法
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}
