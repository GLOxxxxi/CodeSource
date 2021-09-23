package clazzcode.classcode0915.timertask;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器任务测试类 MyTimerTaskTest
 * 定时器常用类
 */
public class MyTimerTaskTest {

    public static void main(String[] args) {
        // 创建定时器任务对象
        MyTimerTask task = new MyTimerTask();
        // 创建定时器对象
        Timer timer = new Timer();
        // 创建事件对象
        Date date = new Date();
        // 参数 ： 任务， 日期
        timer.schedule(task, date);
        // 参数：任务，延迟（毫秒）
        timer.schedule(task, 2000);
        // 参数： 任务 延迟 执行循环空隙时间
        timer.schedule(task, 2000, 1000);
        long now = System.currentTimeMillis();
        now += 2000;
        Date after = new Date(now);
        // 参数中延迟不能是负数，date 也不能是现在之前的
        timer.scheduleAtFixedRate(task, after, 1000);
        timer.scheduleAtFixedRate(task, 2000, 1000);
        // 用匿名内部类的方式创建定时器任务
        timer.scheduleAtFixedRate(new TimerTask() {
            private int count = 0;
            @Override
            public void run() {
                System.out.println("阿巴巴阿巴");
                if (count == 10) {
                    timer.cancel();
                }
                count++;
            }
        }, 2000, 500);

    }
}
