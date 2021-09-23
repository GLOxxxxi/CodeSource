package clazzcode.classcode0906.abstractpractice;

/**
 * 正方体类
 */
public class RegularHexagon extends AbstractPerimeter{
    /** 正六边形的其中一个边 */
    private double side;

    public RegularHexagon() {}

    /**
     * RegularHexagon 有参构造 side
     * @param side 正六边形的边
     */
    public RegularHexagon(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    /**
     * 重写 getPerimeter 方法取周长
     * @return 正六边形的周长
     */
    @Override
    public double getPerimeter() {
        return 6 * side;
    }
}
