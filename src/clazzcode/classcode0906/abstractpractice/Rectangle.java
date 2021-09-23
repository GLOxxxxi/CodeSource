package clazzcode.classcode0906.abstractpractice;

import clazzcode.classcode.AbstractGraph;

/**
 * 矩形类继承图形抽象类
 */
public class Rectangle extends AbstractGraph {
    /** 长 */
    double height;

    /** 宽 */
    double width;

    public Rectangle() {}

    /**
     * 有参构造
     * @param height 长
     * @param width 宽
     */
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 重写个体Area方法
     * @return 矩形面积
     */
    @Override
    public double getArea() {
        return height * width;
    }
}
