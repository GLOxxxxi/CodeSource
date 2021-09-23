package clazzcode.classcode0914.saleticketthread;

/**
 * 继承线程测试类 SaleWindowLockTest
 * 创建类三种处理多线程的对象各三个，有 锁机制 的方法
 */
public class SaleWindowLockTest {

    public static void main(String[] args) {
        // 创建三个线程对象，调用有参构造 锁机制
        SaleWindowLockThread saleWindowLockThread1 = new SaleWindowLockThread("锁——小泽");
        SaleWindowLockThread saleWindowLockThread2 = new SaleWindowLockThread("锁————三上");
        SaleWindowLockThread saleWindowLockThread3 = new SaleWindowLockThread("锁——————吉泽");
        // 启动线程
        saleWindowLockThread1.start();
        saleWindowLockThread2.start();
        saleWindowLockThread3.start();
    }
}
