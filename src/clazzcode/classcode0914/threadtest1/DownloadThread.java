package clazzcode.classcode0914.threadtest1;

/**
 * 下载线程 DownloadThread 继承 Thread
 */
public class DownloadThread extends Thread {

    /**
     * 重写run方法
     */
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("下载ing......" + i + "%");
        }
    }
}
