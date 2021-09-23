package clazzcode.classcode0914.homework.runnabletest;

public class GrabBeansSynchronizedMethodImpl implements Runnable {

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
    public static synchronized void grabBeans() {
        // 判断豆子还有没有
        if (beans > 0) {
            System.out.print("当前线程" + Thread.currentThread().getName());
            // 总豆子减 1
            System.out.println(",当前剩余豆子：" + beans--);
        }
    }
}
