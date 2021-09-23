package clazzcode.classcode0914.homework.runnabletest;

import clazzcode.classcode0914.homework.threadtest.GrabBeansThread;
import clazzcode.classcode0914.saleticketthread.SaleWindowThread;

public class GrabBeansRunnableImpl implements Runnable {

    /** 全员共享的静态变量，豆子数 */
    private static int beans = 200;

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
        // 同步获取唯一标识 字节码文件 或者 静态成员变量 synchronized (object)
        synchronized (GrabBeansThread.class) {
        /*
        双检锁预防线程不安全 第二个线程过来时可能得到的变量，
        可能是第一个线程没有执行完变量变化的代码（时间片结束了），
        就是变量未改变，也可能进入到当前方法，所以需要再次判断是否符合条件，再继续执行代码
        */
            if (beans > 0) {
                System.out.print("当前线程" + Thread.currentThread().getName());
                // 总豆子减 1
                System.out.println(",当前剩余豆子：" + beans--);
            }

        }

    }
}
