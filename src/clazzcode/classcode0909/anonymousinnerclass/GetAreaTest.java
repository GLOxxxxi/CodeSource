package clazzcode.classcode0909.anonymousinnerclass;

/**
 * 求面积测试类 GetAreaTest，包含通过匿名内部类，lambda的方式求面积
 */
public class GetAreaTest {

    public static void main(String[] args) {
        // 通过匿名内部类，向上造型，创建一次性对象
        GetArea circleArea = new GetArea() {
            @Override
            public double getArea(double a) {
                return Math.PI * Math.pow(a, 2);
            }
        };
        // 调用方法
        System.out.println("匿名内部类求面积：" + circleArea.getArea(5));

        // lambda表达式，形参只有一个可以省略形参括号，方法体语句只有一条可以省略大括号和return
        GetArea lambdaCircle = a -> Math.PI * Math.pow(a, 2);
        // 调用方法
        System.out.println("lambda求面积：" + lambdaCircle.getArea(30));

    }
}
