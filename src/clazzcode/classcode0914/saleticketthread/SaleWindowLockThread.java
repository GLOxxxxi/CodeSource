package clazzcode.classcode0914.saleticketthread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 买票窗口线程 SaleWindowThread 继承 Thread
 */
public class SaleWindowLockThread extends Thread {

    /** 全员共享的静态变量，票数 */
    private static int ticket = 50;

    /** 创建锁机制静态共享的锁 */
    private static final Lock lock = new ReentrantLock();

    public SaleWindowLockThread() {}

    /**
     * String参数的有参构造
     * @param name 线程名
     */
    public SaleWindowLockThread(String name) {
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