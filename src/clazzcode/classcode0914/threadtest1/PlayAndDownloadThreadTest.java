package clazzcode.classcode0914.threadtest1;

/**
 * 播放下载多线程测试了 PlayAndDownloadThreadTest 创建了播放和下载两个线程
 */
public class PlayAndDownloadThreadTest {

    public static void main(String[] args) {
        // 创建播放和下载线程对象
        DownloadThread downloadThread = new DownloadThread();
        PlayThread playThread = new PlayThread();

        // 调用start方法启动线程
        downloadThread.start();
        playThread.start();

//        new Thread(downloadThread::run).start();
//        new Thread(() -> downloadThread.run()).start();
//        new Thread(downloadThread).start();
//        new Thread(downloadThread).start();
    }
}
