package clazzcode.classcode0908.homework1;

/**
 * 军车类继承车类,重写run方法,有个特殊方法
 */
public class MilitaryVehicles extends AbstractCar{

    /**
     * 重写run
     */
    @Override
    void run() {
        System.out.println("150km/h");
    }

    /**
     * 特殊方法
     */
    public void fire() {
        System.out.println("向我开炮");
    }
}
