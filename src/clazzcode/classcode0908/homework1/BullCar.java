package clazzcode.classcode0908.homework1;
/**
 * 牛车类继承车类,重写run方法,有个特殊方法
 */
public class BullCar extends AbstractCar{
    /**
     * 重写run
     */
    @Override
    void run() {
        System.out.println("10km/h");
    }

    /**
     * 特殊方法
     */
    public void eatGrass() {
        System.out.println("我能吃个十斤草");
    }
}
