package clazzcode.classcode0914.saleticketthread;

/**
 * 继承线程测试类 SaleTicketTest
 * 创建类三种处理多线程的对象各三个，有 同步方法的方法
 */
public class SaleWindowTest {

    public static void main(String[] args) {

        // 创建三个线程对象，调用有参构造 同步代码
        SaleWindowThread saleWindowThread1 = new SaleWindowThread("同步代码——小泽");
        SaleWindowThread saleWindowThread2 = new SaleWindowThread("同步代码————三上");
        SaleWindowThread saleWindowThread3 = new SaleWindowThread("同步代码——————吉泽");
        // 启动线程
        saleWindowThread1.start();
        saleWindowThread2.start();
        saleWindowThread3.start();

    }
}
