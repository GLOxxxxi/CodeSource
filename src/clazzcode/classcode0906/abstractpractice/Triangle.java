package clazzcode.classcode0906.abstractpractice;

/**
 * 三角形类
 */
public class Triangle extends AbstractPerimeter{
    /** 第一个边a */
    private double a;

    /** 第二个边b */
    private double b;

    /** 第三个边c */
    private double c;

    public Triangle() {}

    /**
     * Triangle 满参构造
     * @param a 第一个边
     * @param b 第二个边
     * @param c 第三个边
     */
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * getPerimeter 方法求周长
     * @return 三角形周长
     */
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
