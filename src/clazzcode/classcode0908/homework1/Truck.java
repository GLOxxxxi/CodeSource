package clazzcode.classcode0908.homework1;

/**
 * 卡车类继承车类,重写run方法,有个特殊方法
 */
public class Truck extends AbstractCar{
    /**
     * 重写run
     */
    @Override
    void run() {
        System.out.println("80km/h");
    }

    /**
     * 特殊方法
     */
    public void translate() {
        System.out.println("我能运个5吨");
    }
}
