package clazzcode.classcode0906.abstractpractice;

/**
 * AbstractPerimeter 测试了，包含了正六边形类，三角形类，
 * 分别创建对象，并且调用求周长方法并打印其周长
 */
public class AbstractPerimeterTest {
    public static void main(String[] args) {
        // 创建正六边形对象，使用有参构造
        RegularHexagon regularHexagon = new RegularHexagon(6);
        // 求正六边形的周长并打印
        System.out.println("正六边形周长：" + regularHexagon.getPerimeter());
        // 创建三角形对象，使用有参构造
        Triangle triangle = new Triangle(2, 3.5, 4);
        // 求三角形周长并打印
        System.out.println("三角形周长：" + triangle.getPerimeter());

    }
}
