package test;

public class ABTest {

    public static void main(String[] args) {
        IB ib = Integer::sum;
        System.out.println("lambda表达式：" + ib.add(4, 5));

        IB ib1 = new IB() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println("匿名内部类：" + ib1.add(5, 4));
    }
}
