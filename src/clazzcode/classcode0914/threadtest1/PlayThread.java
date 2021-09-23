package clazzcode.classcode0914.threadtest1;

/**
 * 播放线程 PlayThread 继承 Thread
 */
public class PlayThread extends Thread {

    /**
     * 重写run方法
     */
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("播放ing..." + i + "%");
        }
    }
}
