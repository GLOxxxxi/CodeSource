package clazzcode.classcode0914.homework.threadtest;
/**
 * 继承线程测试类 GrabBeansLockThreadTest
 * 创建类三种处理多线程的对象各三个，有 锁机制 的方法
 */
public class GrabBeansLockThreadTest {

    public static void main(String[] args) {
        // 创建对象，用锁机制
        GrabBeansLockThread grabBeansLockThread1 = new GrabBeansLockThread("_钟离_");
        GrabBeansLockThread grabBeansLockThread2 = new GrabBeansLockThread("_影_");
        GrabBeansLockThread grabBeansLockThread3 = new GrabBeansLockThread("__温蒂__");
        GrabBeansLockThread grabBeansLockThread4 = new GrabBeansLockThread("__甘雨_____");
        GrabBeansLockThread grabBeansLockThread5 = new GrabBeansLockThread("__胡桃________");
        // 调用方法
        grabBeansLockThread1.start();
        grabBeansLockThread2.start();
        grabBeansLockThread3.start();
        grabBeansLockThread4.start();
        grabBeansLockThread5.start();
    }
}
