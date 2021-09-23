package clazzcode.classcode0914.saleticketrunnable;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程接口实现类 SaleTicketWindowLockImpl 用的锁机制方法解决线程冲突
 */
public class SaleTicketWindowLockImpl implements Runnable {

    /** 全员共享的静态变量，票数 */
    private static int ticket = 50;

    /** 创建锁机制静态共享的锁 */
    private static final Lock lock = new ReentrantLock();


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
     * 买票方法 saleOne 卖出 ticket - 1
     */
    public void saleOne() {
        lock.lock(); // 上锁
        try {
            if (ticket > 0) {
                System.out.print("当前线程" + Thread.currentThread().getName());
                // 卖票票数减1
                System.out.println(",票数剩余：" + ticket--);
            }
        } finally {
            lock.unlock(); // 释放锁
        }
    }
}
