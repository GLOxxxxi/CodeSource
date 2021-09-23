package clazzcode.classcode0914.homework.runnabletest;

/**
 * 实现线程接口测试类 GrabBeansRunnableLockTest
 * 创建类三种处理多线程的对象各三个，有 锁机制 的方法
 */
public class GrabBeansRunnableLockTest {

    public static void main(String[] args) {
        GrabBeansRunnableLockImpl grabBeansRunnableLock = new GrabBeansRunnableLockImpl();
        // 创建接口实现类对象 锁机制
        Thread thread1 = new Thread(grabBeansRunnableLock, "_钟离_");
        Thread thread2 = new Thread(grabBeansRunnableLock, "_影_");
        Thread thread3 = new Thread(grabBeansRunnableLock, "__温蒂__");
        Thread thread4 = new Thread(grabBeansRunnableLock, "__甘雨_____");
        Thread thread5 = new Thread(grabBeansRunnableLock, "__胡桃________");
        // 调用线程开始方法
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
