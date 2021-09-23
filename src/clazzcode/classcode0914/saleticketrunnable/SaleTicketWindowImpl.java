package clazzcode.classcode0914.saleticketrunnable;

import clazzcode.classcode0914.saleticketthread.SaleWindowThread;

/**
 * 线程接口实现类，用同步代码方式解决线程冲突
 */
public class SaleTicketWindowImpl implements Runnable {

    /** 全员共享的静态变量，票数 */
    private static int ticket = 50;

    @Override
    public void run() {
        while (ticket > 0) {
            saleOne();
        }
    }

    /**
     * 买票方法 saleOne 卖出 ticket - 1
     */
    public void saleOne() {
        // 同步获取唯一标识 字节码文件 或者 静态成员变量 synchronized (object)
        synchronized (this) {
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
}
