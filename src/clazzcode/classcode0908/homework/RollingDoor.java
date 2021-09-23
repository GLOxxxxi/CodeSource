package clazzcode.classcode0908.homework;

/**
 * 继承AbstractDoor,卷帘门重写开关门
 */
public class RollingDoor extends AbstractDoor{
    /**
     * 开门
     */
    @Override
    void openDoor() {
        System.out.println("上卷开门");
    }

    /**
     * 关门
     */
    @Override
    void closeDoor() {
        System.out.println("下卷关门");
    }
}
