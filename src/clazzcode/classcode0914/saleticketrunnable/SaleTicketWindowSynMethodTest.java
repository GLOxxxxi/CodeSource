package clazzcode.classcode0914.saleticketrunnable;

/**
 * 实现线程接口测试类 SaleTicketWindowSynMethodTest
 * 创建类三种处理多线程的对象各三个，有同步方法 同步代码
 */
public class SaleTicketWindowSynMethodTest {

    public static void main(String[] args) {
        SaleTicketWindowSynchronizedMethodImpl saleTWSM = new SaleTicketWindowSynchronizedMethodImpl();
        // 创建接口实现类对象 同步方法
        Thread thread4 = new Thread(saleTWSM, "_向晚");
        Thread thread5 = new Thread(saleTWSM, "__嘉然");
        Thread thread6 = new Thread(saleTWSM, "___贝拉");
        // 调用线程开始方法
        thread4.start();
        thread5.start();
        thread6.start();

    }
}
