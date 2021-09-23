package clazzcode.classcode0914.runnabletest;

/**
 * 播放线程实现类 PlayRunnableImpl 实现接口 Runnable
 */
public class PlayRunnableImpl implements Runnable {
    /**
     * 重写run方法
     */
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("播放业务ing..." + i + "%");
        }
    }
}
