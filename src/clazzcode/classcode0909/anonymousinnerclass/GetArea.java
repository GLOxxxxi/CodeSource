package clazzcode.classcode0909.anonymousinnerclass;

/**
 * 函数式接口求面积GetArea
 */
@FunctionalInterface
public interface GetArea {
    /**
     * 求圆的面积
     * @param a 半径
     * @return 面积
     */
    double getArea(double a);
}
