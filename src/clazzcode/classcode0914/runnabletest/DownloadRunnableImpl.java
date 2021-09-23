package clazzcode.classcode0914.runnabletest;

/**
 * 下载线程实现类 DownloadThread 实现接口 Runnable
 */
public class DownloadRunnableImpl implements Runnable {
    /**
     * 重写run方法
     */
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("下载业务ing......" + i + "%");
        }
    }
}
