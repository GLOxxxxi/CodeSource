package clazzcode.classcode0906.abstractpractice;

import clazzcode.classcode.AbstractGraph;

/**
 * 圆形类
 */
public class Circle extends AbstractGraph {
    /** 面积 */
    double r;

    public Circle(double r) {
        this.r = r;
    }

    /**
     * 重写getArea方法
     * @return 圆的面积
     */
    @Override
    public double getArea() {
        return 3.14 * r * r;
    }
}
