package clazzcode.classcode0906.abstractpractice;

/**
 * AbstractGraph 测试类，包含创建的 Rectangle 对象和 Circle 对象
 * 调用 AbstractGraph 重写之后的方法求面积
 */
public class AbstractGraphTest {

    public static void main(String[] args) {
        // 创建矩形对象，有参构造
        Rectangle rectangle = new Rectangle(10.3, 30.5);
        // 求矩形面积并打印
        System.out.println("矩形面积：" + rectangle.getArea());
        // 创建圆形对象，有参构造
        Circle circle = new Circle(3.4);
        // 求圆形面积并打印
        System.out.println("圆形面积：" + circle.getArea());
    }
}
