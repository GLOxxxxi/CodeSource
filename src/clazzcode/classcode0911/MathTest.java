package clazzcode.classcode0911;

public class MathTest {

    public static void main(String[] args) {
        // Math的全局常量
        System.out.println(Math.PI);
        System.out.println(Math.E);
        // Math的几个算术方法
        int a = 5;
        int b = 3;
        int max = Math.max(a, b);
        System.out.println("最大值：" + max);

        double pow = Math.pow(a, b);
        System.out.println("a的b次方：" + pow);

        double sqrt = Math.sqrt(5);
        System.out.println("求平方根：" + sqrt);

        double ceil = Math.ceil(5.5);// 向上取整
        double floor = Math.floor(5.5);// 向下取整
        long round = Math.round(5.5);// 四舍五入 相当于 Math.round(值 + 0.5)
        System.out.println("向上取整：" + ceil);
        System.out.println("向下取整：" + floor);
        System.out.println("四舍五入：" + round);

    }
}
