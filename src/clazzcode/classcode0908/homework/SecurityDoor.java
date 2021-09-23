package clazzcode.classcode0908.homework;
/**
 * 继承AbstractDoor,防盗门重写开关门
 */
public class SecurityDoor extends AbstractDoor{
    /**
     * 开门
     */
    @Override
    void openDoor() {
        System.out.println("开个防盗门");
    }

    /**
     * 关门
     */
    @Override
    void closeDoor() {
        System.out.println("关个防盗门");
    }
}
