package clazzcode.classcode0906.abstractpractice;

/**
 *  球体类
 */
public class Sphere extends AbstractVolume{

    /** 球体半径 */
    private double r;

    public Sphere() {}

    /**
     * 有参构造
     * @param r 球体半径
     */
    public Sphere(double r) {
        this.r = r;
    }

    /**
     * 重写 getVolume 方法求体积
     * @return 球体体积
     */
    @Override
    public double getVolume() {
        return 3 / 4.0 * Math.pow(r, 3);
    }
}
