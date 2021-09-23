package clazzcode.classcode0914;

public class ThreadTest {

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("：");
        new Thread(runnable).start();
    }
}
