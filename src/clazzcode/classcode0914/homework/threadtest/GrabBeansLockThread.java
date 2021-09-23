package clazzcode.classcode0914.homework.threadtest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 抢豆子线程 GrabBeansLockThread 继承 Thread
 */
public class GrabBeansLockThread extends Thread {

    /** 全员共享的静态变量，豆子数 */
    private static int beans = 200;

    /** 创建锁机制静态共享的锁 */
    private static final Lock lock = new ReentrantLock();

    public GrabBeansLockThread() {}

    /**
     * String参数的有参构造
     * @param name 线程名
     */
    public GrabBeansLockThread(String name) {
        super(name);
    }

    /**
     * 重写run方法，执行抢豆子方法
     */
    @Override
    public void run() {
        while (beans > 0) {
            grabBeans();
        }
    }

    /**
     * 抢豆子方法 grabBeans 抢到豆子总量 -1
     */
    public void grabBeans() {
        lock.lock(); // 上锁
        try {
            if (beans > 0) {
                System.out.print("当前线程" + Thread.currentThread().getName());
                // 总豆子减 1
                System.out.println(",当前剩余豆子：" + beans--);
            }
        } finally {
            lock.unlock(); // 释放锁
        }
    }
}
