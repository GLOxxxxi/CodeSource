package clazzcode.classcode0914.threadmethod;

import clazzcode.classcode0914.runnabletest.DownloadRunnableImpl;
import clazzcode.classcode0914.threadtest1.DownloadThread;

public class ThreadMethodTest {
    public static void main(String[] args) {
        // 线程中的字段
        int maxPriority = Thread.MAX_PRIORITY;
        int minPriority = Thread.MIN_PRIORITY;
        int normPriority = Thread.NORM_PRIORITY;

        System.out.println("最大权限：" + maxPriority);
        System.out.println("最低权限：" + minPriority);
        System.out.println("默认权限：" + normPriority);

        // Thread 类的三种构造方法
        Thread thread = new Thread();
        Thread plusThread = new Thread("plusThread");
        Thread downloadThread = new Thread(new DownloadThread(), "downThread");
        // 设置名称
        System.out.println(plusThread.getName());
        plusThread.setName("setPlusThread");
        System.out.println(plusThread);

        // 获取当前线程
        Thread mainThread = Thread.currentThread();
        System.out.println("默认线程：" + mainThread);
        // 默认优先级
        System.out.println("默认优先级：" + mainThread.getPriority());
        // 设置优先级，在一个主线程内的创建一个新的线程，他的优先级是默认是主线程的优先级
        mainThread.setPriority(10);
        System.out.println("新的优先级：" + mainThread.getPriority());
        boolean daemon = mainThread.isDaemon();
        System.out.println("是否是守护线程：" + daemon);
        // 设置守护线程
        downloadThread.setDaemon(true);
        System.out.println("设置守护线程之后：" + downloadThread.isDaemon());
        // 当前线程睡眠
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程睡眠后的代码");
    }
}
