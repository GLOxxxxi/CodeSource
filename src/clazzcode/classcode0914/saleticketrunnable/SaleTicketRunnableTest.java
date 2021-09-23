package clazzcode.classcode0914.saleticketrunnable;

/**
 * 实现线程接口测试类 SaleTicketRunnableTest
 * 创建类三种处理多线程的对象各三个，有 同步代码，同步方法，锁机制 的方法
 */
public class SaleTicketRunnableTest {

    public static void main(String[] args) {
        // 创建接口实现类对象 同步代码
        SaleTicketWindowImpl saleTicketWindow = new SaleTicketWindowImpl();
        Thread thread1 = new Thread(saleTicketWindow, "_向晚");
        Thread thread2 = new Thread(saleTicketWindow, "__嘉然");
        Thread thread3 = new Thread(saleTicketWindow, "___贝拉");
        // 调用线程开始方法
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
