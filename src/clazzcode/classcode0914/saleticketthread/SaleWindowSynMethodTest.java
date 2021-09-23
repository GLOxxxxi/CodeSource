package clazzcode.classcode0914.saleticketthread;

/**
 * 继承线程测试类 SaleWindowSynMethodTest
 * 创建类三种处理多线程的对象各三个，有 同步方法
 */
public class SaleWindowSynMethodTest {

    public static void main(String[] args) {
        // 创建三个线程对象，调用有参构造 同步方法
        SaleWindowSynchronizedMethodThread saleWindowSynchronizedMethodThread1 = new SaleWindowSynchronizedMethodThread("同步方法——小泽");
        SaleWindowSynchronizedMethodThread saleWindowSynchronizedMethodThread2 = new SaleWindowSynchronizedMethodThread("同步方法————三上");
        SaleWindowSynchronizedMethodThread saleWindowSynchronizedMethodThread3 = new SaleWindowSynchronizedMethodThread("同步方法——————吉泽");
        // 启动线程
        saleWindowSynchronizedMethodThread1.start();
        saleWindowSynchronizedMethodThread2.start();
        saleWindowSynchronizedMethodThread3.start();
    }
}
