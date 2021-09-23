package clazzcode.classcode0914.homework.runnabletest;

import clazzcode.classcode0914.homework.threadtest.GrabBeansSynchronizedMethodThread;

/**
 * 实现线程接口测试类 GrabBeansRunnableTest
 * 创建类三种处理多线程的对象各三个，有 同步代码的方法
 */
public class GrabBeansRunnableTest {

    public static void main(String[] args) {
        // 创建接口实现类对象 同步代码
        GrabBeansRunnableImpl grabBeansRunnable = new GrabBeansRunnableImpl();
        Thread thread = new Thread(grabBeansRunnable, "_钟离_");
        Thread thread2 = new Thread(grabBeansRunnable, "_影_");
        Thread thread3 = new Thread(grabBeansRunnable, "__温蒂__");
        Thread thread4 = new Thread(grabBeansRunnable, "__甘雨_____");
        Thread thread5 = new Thread(grabBeansRunnable, "__胡桃________");
        // 调用线程开始方法
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
