package clazzcode.classcode0906.abstractpractice;

/**
 * 正方体类
 */
public class Cube extends AbstractVolume{
    /** 一条边长 */
    private double side;

    public Cube() {}

    /**
     * Cube有参构造
     * @param side 一条边长
     */
    public Cube(double side) {
        this.side = side;
    }

    /**
     * 重写 getVolume 方法求体积
     * @return 正方体体积
     */
    @Override
    public double getVolume() {
        return side * side * side;
    }
}
