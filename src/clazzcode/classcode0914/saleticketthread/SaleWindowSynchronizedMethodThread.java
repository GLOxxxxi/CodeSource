package clazzcode.classcode0914.saleticketthread;

/**
 * 买票窗口线程 SaleWindowThread 继承 Thread
 */
public class SaleWindowSynchronizedMethodThread extends Thread {

    /** 全员共享的静态变量，票数 */
    private static int ticket = 50;

    /** 创建静态对象，也可以作为同步代码的标识 */
    private static Object object = new Object();

    public SaleWindowSynchronizedMethodThread() {}

    /**
     * String参数的有参构造
     * @param name 线程名
     */
    public SaleWindowSynchronizedMethodThread(String name) {
        super(name);
    }

    /**
     * 重写run方法，执行卖票方法
     */
    @Override
    public void run() {
        while (ticket > 0) {
            saleOne();
        }
    }

    /**
     * 买票方法 saleOne 卖出ticket - 1
     */
    public static synchronized void saleOne() {
        /*
        双检锁预防线程不安全 第二个线程过来时可能得到的变量，
        可能是第一个线程没有执行完变量变化的代码（时间片结束了），
        就是变量未改变，也可能进入到当前方法，所以需要再次判断是否符合条件，再继续执行代码
        */
        if (ticket > 0) {
            System.out.print("当前线程" + Thread.currentThread().getName());
            // 卖票票数减1
            System.out.println(",票数剩余：" + ticket--);
        }
    }
}
