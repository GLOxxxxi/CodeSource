package clazzcode.classcode0915.timertask;

import java.util.TimerTask;

/**
 * 定时器任务 MyTimerTask
 * 重写run
 */
public class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("晚晚，嘿嘿，晚晚...");
    }
}
