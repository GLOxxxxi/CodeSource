package clazzcode.classcode0914;

public class MyRunnable implements Runnable {

    private int num = 50;

    @Override
    public void run() {
        while (num > 0) {
            System.out.println("票号：" +num);
            num--;
        }

    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();
        new Thread(myRunnable::run).start();
        new Thread(myRunnable1::run).start();
        new Thread(myRunnable2::run).start();
    }
}
