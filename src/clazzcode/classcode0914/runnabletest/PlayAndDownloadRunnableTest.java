package clazzcode.classcode0914.runnabletest;

/**
 * 播放下载多线程测试了 PlayAndDownloadRunnableTest 创建了播放和下载两个线程
 */
public class PlayAndDownloadRunnableTest {

    public static void main(String[] args) {
        // 创建接口实现类对象
        DownloadRunnableImpl downloadRunnable = new DownloadRunnableImpl();
        PlayRunnableImpl playRunnable = new PlayRunnableImpl();
        // 创建线程对象，将接口实现类传入到线程对象中
        Thread downloadThread = new Thread(downloadRunnable);
        Thread playThread = new Thread(playRunnable);
        // 启动线程
        downloadThread.start();
        playThread.start();
    }
}
