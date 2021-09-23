package homework;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;

public class Null {
    public static void main(String[] args) {
        ((Null)null).getMessage();

        // 创建线程池，固定了大小
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        while (true) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    getThreadMessage();
                }
            });
        }

    }

    private static void getThreadMessage() {
        System.out.println("当前线程名称：" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void getMessage() {
        System.out.println("能打印出来吗？");
    }
}
