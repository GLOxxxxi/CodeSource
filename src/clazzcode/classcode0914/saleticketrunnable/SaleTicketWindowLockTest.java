package clazzcode.classcode0914.saleticketrunnable;

/**
 * 实现线程接口测试类 SaleTicketWindowLockTest
 * 创建类三种处理多线程的对象各三个，有 锁机制 的方法
 */
public class SaleTicketWindowLockTest {

    public static void main(String[] args) {

        SaleTicketWindowLockImpl saleTicketWindowLock = new SaleTicketWindowLockImpl();
        // 创建接口实现类对象 锁机制
        Thread thread7 = new Thread(saleTicketWindowLock, "_向晚");
        Thread thread8 = new Thread(saleTicketWindowLock, "__嘉然");
        Thread thread9 = new Thread(saleTicketWindowLock, "___贝拉");
        // 调用线程开始方法
        thread7.start();
        thread8.start();
        thread9.start();
    }
}
